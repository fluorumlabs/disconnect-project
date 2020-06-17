package com.github.fluorumlabs.disconnect.core.router;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.internals.RouteRegistration;
import js.lang.Any;
import js.lang.external.vaadin.router.*;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;
import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.Value;

import java.util.*;
import java.util.stream.Collectors;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 6/16/2020.
 */
@CompileTime
public final class RouterInternals {
    private RouterInternals() {
    }

    @Meta
    public static native RouterConfiguration getRouterConfiguration(Class<?> outletClass, Router outlet);

    private static void getRouterConfiguration(ReflectClass<?> outletClass, Value<Router> outlet) {
        Map<Class<?>,Map<String, Class<?>>> routes = new HashMap<>();
        Map<Class<?>,Set<String>> namedRoutes = new HashMap<>();

        Map<Class<? extends Exception>, Class<?>> errorRoutes = new HashMap<>();

        ServiceLoader<RouteRegistration> routeRegistrations = ServiceLoader.load(RouteRegistration.class, getClassLoader());
        for (RouteRegistration routeRegistration : routeRegistrations) {
            if (routeRegistration.getOutlet().getName().equals(outletClass.getName())) {
                if (!routeRegistration.getRoutes().isEmpty()) {
                    Map<String, Class<?>> routeMap = routes.computeIfAbsent(routeRegistration.getParent(), cls -> new HashMap<>());
                    Set<String> namedRouteSet = namedRoutes.computeIfAbsent(routeRegistration.getParent(), cls -> new HashSet<>());
                    for (String route : routeRegistration.getRoutes()) {
                        routeMap.put(route, routeRegistration.getTarget());
                    }
                    namedRouteSet.add(routeRegistration.getRoutes().get(0));
                }
                for (Class<? extends Exception> exception : routeRegistration.getExceptions()) {
                    errorRoutes.put(exception, routeRegistration.getTarget());
                }
            }
        }

        Value<Array<Route>> routeArray = collectRoutes(Router.class, outlet, routes, namedRoutes);
        Value<Map<Class<? extends Exception>, Class<?>>> errorViews = emit(() -> new HashMap<>());

        for (Map.Entry<Class<? extends Exception>, Class<?>> errorRoute : errorRoutes.entrySet()) {
            ReflectClass<?> reflectTarget = findClass(errorRoute.getValue());
            ReflectClass<? extends Exception> exceptionTarget = findClass(errorRoute.getKey());
            emit(() -> errorViews.get().put(exceptionTarget.asJavaClass(), reflectTarget.asJavaClass()));
        }

        exit(() -> new RouterConfiguration(routeArray.get(), errorViews.get()));
    }

    private static Value<Array<Route>> collectRoutes(Class<?> parent, Value<Router> outlet, Map<Class<?>, Map<String, Class<?>>> routes, Map<Class<?>, Set<String>> namedRoutes) {
        List<String> orderedRoutes = routes.get(parent).keySet().stream()
                .sorted(Comparator.comparingInt(RouterInternals::getParamCount).thenComparingInt(String::length))
                .collect(Collectors.toList());

        Value<Array<Route>> routeArray = emit(() -> Array.create());

        for (String orderedRoute : orderedRoutes) {
            Class<?> target = routes.get(parent).get(orderedRoute);
            ReflectClass<?> reflectTarget = findClass(target);
            boolean isNamed = namedRoutes.get(parent).contains(orderedRoute);

            Value<Route.Builder> route = emit(() -> new Route.Builder().path(orderedRoute));
            if (isNamed) {
                String name = target.getName();
                emit(() -> route.get().name(name));
            }
            if (Component.class.isAssignableFrom(target)) {
                emit(() -> route.get().action(getComponentAction(outlet.get(), reflectTarget.asJavaClass())));
            } else if (HasRouteAction.class.isAssignableFrom(target)) {
                emit(() -> route.get().action(getAction(outlet.get(), reflectTarget.asJavaClass())));
            }

            if (routes.containsKey(target)) {
                Value<Array<Route>> children = collectRoutes(target, outlet, routes, namedRoutes);
                emit(() -> route.get().children(children.get().asArray()));
            }

            emit(() -> routeArray.get().push(route.get().build()));
        }
        return routeArray;
    }

    private static ActionFn getAction(Router routerOutlet, Class<?> component) {
        return ((context, commands) -> {
            if (routerOutlet.hasPendingException()) {
                return context.next();
            }
            try {
                HasRouteAction instance = (HasRouteAction) component.newInstance();
                RouteAction routeAction = new RouteAction(context.cast(), commands);
                instance.onRouteAction(routeAction);

                if (routeAction.getResult() == null) {
                    return context.next();
                } else {
                    return routeAction.getResult();
                }
            } catch (Exception e) {
                routerOutlet.setPendingException(e);
                return context.next();
            }
        });
    }

    private static ActionFn getComponentAction(Router routerOutlet, Class<?> component) {
        return ((context, commands) -> {
            if (routerOutlet.hasPendingException()) {
                return context.next();
            }
            try {
                HasElement<? extends Element> componentIntance = (Component<?>) component.newInstance();
                if (componentIntance instanceof HasLifecycleCallbacks) {
                    HasLifecycleCallbacks instance = (HasLifecycleCallbacks) componentIntance;
                    LifecycleCallbacks callbacks = componentIntance.getElement().cast();

                    callbacks.setOnBeforeEnter(((location, cmds, router) -> {
                        BeforeEnter event = new BeforeEnter(location, cmds, router);
                        instance.onBeforeEnter(event);
                        return event.getResult().cast();
                    }));
                    callbacks.setOnAfterEnter(((location, cmds, router) -> {
                        AfterEnter event = new AfterEnter(location, router);
                        instance.onAfterEnter(event);
                    }));
                    callbacks.setOnBeforeLeave(((location, cmds, router) -> {
                        BeforeLeave event = new BeforeLeave(location, cmds, router);
                        instance.onBeforeLeave(event);
                        return event.getResult().cast();
                    }));
                    callbacks.setOnAfterLeave(((location, cmds, router) -> {
                        AfterLeave event = new AfterLeave(location, router);
                        instance.onAfterLeave(event);
                    }));
                }
                return componentIntance.getElement();
            } catch (Exception e) {
                routerOutlet.setPendingException(e);
                return context.next();
            }
        });
    }

    private static int getParamCount(String x) {
        int count = 0;
        int length = x.length();
        for (int i = 0; i < length; i++) {
            if (x.charAt(i) == ':') {
                count++;
            }
        }
        return count;
    }

    private interface LifecycleCallbacks extends Any {
        @JSProperty
        void setOnBeforeEnter(OnBeforeEnterFn beforeEnter);

        @JSProperty
        void setOnAfterEnter(OnAfterEnterFn afterEnter);

        @JSProperty
        void setOnBeforeLeave(OnBeforeLeaveFn beforeLeave);

        @JSProperty
        void setOnAfterLeave(OnAfterLeaveFn afterLeave);
    }
}
