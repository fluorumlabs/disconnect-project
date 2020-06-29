package com.github.fluorumlabs.disconnect.core.router;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.core.internals.RouteRegistration;
import js.lang.Any;
import js.lang.external.vaadin.router.*;
import js.util.collections.Array;
import js.util.collections.JsSet;
import js.web.dom.Element;
import js.web.dom.HTMLUnknownElement;
import js.web.dom.Window;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;
import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.Value;

import java.util.*;
import java.util.stream.Collectors;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 6/15/2020.
 */
@Tag("router-outlet")
@CompileTime
@Slf4j
public class RouterOutlet extends Component<HTMLUnknownElement> {
    private static final Map<Class<?>, js.lang.external.vaadin.router.Router> routers = new HashMap<>();

    private final js.lang.external.vaadin.router.Router router;

    RouterOutlet() {
        this(RouterOutlet.class);
    }

    public RouterOutlet(Class<?> outletClass) {
        router = routers.computeIfAbsent(outletClass, (cls) -> {
            js.lang.external.vaadin.router.Router newRouter = js.lang.external.vaadin.router.Router.create();
            RouterConfiguration routerConfiguration = getRouterConfiguration(outletClass, newRouter);

            Array<Route> routes = routerConfiguration.getRoutes();
            // Add fallback route handler
            if (outletClass.getName().equals(RouterOutlet.class.getName())) {
                routes.unshift(Route.builder().path("(.*)").action(this::locationChangeHandler).build());
            }
            routes.push(Route.builder().path("(.*)").action(((context, commands) -> defaultFallbackHandler(context, commands, routerConfiguration))).build());
            newRouter.setRoutes(routes.asArray());
            return newRouter;
        });
        router.setOutlet(getElement());
    }

    private static boolean hasPendingException(js.lang.external.vaadin.router.Router someRouter) {
        return someRouter.<ExceptionOverlay>cast().hasPendingException();
    }

    private static void setPendingException(js.lang.external.vaadin.router.Router someRouter, Exception e) {
        someRouter.<ExceptionOverlay>cast().setPendingException(DisconnectUtils.asJsObject(e));
    }

    private static Exception getPendingException(js.lang.external.vaadin.router.Router someRouter) {
        return DisconnectUtils.asJavaObject(someRouter.<ExceptionOverlay>cast().getPendingException());
    }


    private Any locationChangeHandler(Context context, Commands commands) {
        Router.getRootOutlet().router.getReady().then(RouterOutlet::handleLocationChange);

        return context.next();
    }

    private static void handleLocationChange(RouterLocation location) {
        // Collect current active links
        JsSet<Element> currentActive = JsSet.create(Window.DOCUMENT.getBody().querySelectorAll("a[active]"));
        // Collect current exact active links
        JsSet<Element> currentSelected = JsSet.create(Window.DOCUMENT.getBody().querySelectorAll("a[selected]"));

        List<String> pathParts = Arrays.asList(StringUtils.split(location.getPathname(), "/"));
        // Collect new exact active links
        Array<Element> newSelected = Array.from(Window.DOCUMENT.getBody().querySelectorAll(computeSelector(String.join("/",pathParts))));
        Array<Element> newActive = Array.create();

        for (int i = pathParts.size()-1; i >= 0; i--) {
            newActive = newActive.concat(Array.from(Window.DOCUMENT.getBody().querySelectorAll(computeSelector(String.join("/",pathParts.subList(0,i))))).asArray());
        }

        newSelected.forEach((value, key, parent) -> {
            value.setAttribute("active", "");
            value.setAttribute("selected", "");
            currentActive.delete(value);
            currentSelected.delete(value);
        });
        newActive.forEach((value, key, parent) -> {
            value.setAttribute("active", "");
            currentActive.delete(value);
        });
        currentActive.forEach((value, key, parent) -> value.removeAttribute("active"));
        currentSelected.forEach((value, key, parent) -> value.removeAttribute("selected"));
    }

    private static String computeSelector(String path) {
        return "a[href=\""+path+"\"],a[href=\""+path+"/\"],a[href|=\""+path+"?\"],a[href|=\""+path+"#\"]," +
                "a[href=\"/"+path+"\"],a[href=\"/"+path+"/\"],a[href|=\"/"+path+"?\"],a[href|=\"/"+path+"#\"]";
    }

    private Any defaultFallbackHandler(Context context, Commands commands, RouterConfiguration routerConfiguration) {
        if (!hasPendingException(router)) {
            setPendingException(router, new NotFoundException(context.getPathname()));
        }
        boolean matched = true;
        while (matched) {
            matched = false;
            for (Map.Entry<Class<? extends Exception>, Class<?>> errorView : routerConfiguration.getErrorViews().entrySet()) {
                if (errorView.getKey().isAssignableFrom(getPendingException(router).getClass())) {
                    matched = true;
                    try {
                        HasElement<? extends Element> componentIntance = (Component<?>) errorView.getValue().newInstance();
                        if (componentIntance instanceof HasErrorParameter) {
                            ((HasErrorParameter) componentIntance).setErrorParameter(getPendingException(router));
                        }
                        setPendingException(router, null);
                        return componentIntance.getElement();
                    } catch (Exception e) {
                        setPendingException(router, e);
                    }
                }
            }
        }

        if (hasPendingException(router) && !getPendingException(router).getClass().equals(NotFoundException.class)) {
            log.error("Unhandled exception during navigation to " + context.getPathname(), getPendingException(router));
        }

        setPendingException(router, null);
        return context.next();
    }

    private Any emptyFallbackHandler(Context context, Commands commands) {
        return new Div().getElement();
    }

    public String getUrlForTarget(Class<?> target, LocationParams parameters) {
        return router.urlForName(target.getName(), parameters.getParams());
    }

    public String getUrlForTarget(Class<?> target) {
        return router.urlForName(target.getName());
    }

    @Meta
    public static native RouterConfiguration getRouterConfiguration(Class<?> outletClass, js.lang.external.vaadin.router.Router router);

    private static void getRouterConfiguration(ReflectClass<?> outletClass, Value<js.lang.external.vaadin.router.Router> router) {
        Map<Class<?>, RouteRegistration> routes = new HashMap<>();
        List<RouteRegistration> rootRoutes = new ArrayList<>();
        Map<RouteRegistration, List<RouteRegistration>> children = new HashMap<>();

        ServiceLoader<RouteRegistration> routeRegistrations = ServiceLoader.load(RouteRegistration.class, getClassLoader());
        for (RouteRegistration routeRegistration : routeRegistrations) {
            routes.put(routeRegistration.getTarget(), routeRegistration);
            children.put(routeRegistration, new ArrayList<>());
        }

        for (RouteRegistration registration : routes.values()) {
            if (registration.getParent() != RouterOutlet.class && routes.containsKey(registration.getParent())) {
                children.get(routes.get(registration.getParent())).add(registration);
            } else if (registration.getOutlet() != RouterOutlet.class && routes.containsKey(registration.getOutlet())) {
                children.get(routes.get(registration.getOutlet())).add(registration);
            } else {
                rootRoutes.add(registration);
            }
        }

        Map<Class<? extends Exception>, Class<?>> errorRoutes = new HashMap<>();

        for (RouteRegistration route : routes.values()) {
            if (route.getOutlet().getName().equals(outletClass.getName())) {
                for (Class<? extends Exception> exception : route.getExceptions()) {
                    errorRoutes.put(exception, route.getTarget());
                }
            }
        }

        Value<Array<Route>> routeArray = collectRoutes(outletClass, rootRoutes, children, router)
                .orElseGet(() -> emit(() -> Array.create()));

        Value<Map<Class<? extends Exception>, Class<?>>> errorViews = emit(() -> new HashMap<>());

        for (Map.Entry<Class<? extends Exception>, Class<?>> errorRoute : errorRoutes.entrySet()) {
            ReflectClass<?> reflectTarget = findClass(errorRoute.getValue());
            ReflectClass<? extends Exception> exceptionTarget = findClass(errorRoute.getKey());
            emit(() -> errorViews.get().put(exceptionTarget.asJavaClass(), reflectTarget.asJavaClass()));
        }

        exit(() -> new RouterConfiguration(routeArray.get(), errorViews.get()));
    }

    private static Optional<Value<Array<Route>>> collectRoutes(ReflectClass<?> outletClass, List<RouteRegistration> routes, Map<RouteRegistration, List<RouteRegistration>> children, Value<js.lang.external.vaadin.router.Router> routerValue) {
        if (routes.isEmpty()) {
            return Optional.empty();
        }

        Map<String, List<RouteRegistration>> pathToRoute = new HashMap<>();
        for (RouteRegistration registration : routes) {
            for (String registrationRoute : registration.getRoutes()) {
                pathToRoute.computeIfAbsent(registrationRoute, __ -> new ArrayList<>()).add(registration);
            }
        }

        List<String> orderedRoutes = pathToRoute.keySet().stream()
                .sorted(Comparator.comparingInt(RouterOutlet::getParamCount).thenComparingInt(String::length))
                .collect(Collectors.toList());

        boolean isInScope = false;

        Value<Array<Route>> routeArray = emit(() -> Array.create());

        for (String route : orderedRoutes) {
            for ( RouteRegistration registration: pathToRoute.get(route)) {
                if (registration.getOutlet().getName().equals(outletClass.getName())) {
                    // Route is in scope of current outlet

                    Class<?> target = registration.getTarget();
                    ReflectClass<?> reflectTarget = findClass(target);

                    Value<Route.Builder> builder = emit(() -> Route.builder().path(route));
                    if (registration.getRoutes().indexOf(route) == 0) {
                        String name = target.getName();
                        emit(() -> builder.get().name(name));
                    }
                    if (Component.class.isAssignableFrom(target)) {
                        if (HasLifecycleCallbacks.class.isAssignableFrom(target) && HasRouteAction.class.isAssignableFrom(target)) {
                            emit(() -> builder.get().action(routeActionAndComponentAndCallbacks(reflectTarget.asJavaClass(), routerValue.get())));
                        } else if (HasLifecycleCallbacks.class.isAssignableFrom(target)) {
                            emit(() -> builder.get().action(componentAndCallbacks(reflectTarget.asJavaClass(), routerValue.get())));
                        } else if (HasRouteAction.class.isAssignableFrom(target)) {
                            emit(() -> builder.get().action(routeActionAndComponent(reflectTarget.asJavaClass(), routerValue.get())));
                        } else {
                            emit(() -> builder.get().action(component(reflectTarget.asJavaClass(), routerValue.get())));
                        }
                    } else {
                        if (HasRouteAction.class.isAssignableFrom(target)) {
                            emit(() -> builder.get().action(routeAction(reflectTarget.asJavaClass(), routerValue.get())));
                        }
                    }

                    if (!children.get(registration).isEmpty()) {
                        Optional<Value<Array<Route>>> subRoutesOptional = collectRoutes(outletClass, children.get(registration), children, routerValue);
                        if (subRoutesOptional.isPresent()) {
                            Value<Array<Route>> subRoutes = subRoutesOptional.get();
                            emit(() -> builder.get().children(subRoutes.get().asArray()));
                        }
                    }

                    isInScope = true;
                    emit(() -> routeArray.get().push(builder.get().build()));
                } else {
                    // Route is not in scope of current outlet
                    Class<?> target = registration.getTarget();
                    ReflectClass<?> reflectTarget = findClass(target);

                    Value<Route.Builder> builder = emit(() -> Route.builder().path(route));
                    if (HasRouteAction.class.isAssignableFrom(target)) {
                        emit(() -> builder.get().action(routeAction(reflectTarget.asJavaClass(), routerValue.get())));
                    }

                    if (!children.get(registration).isEmpty()) {
                        Optional<Value<Array<Route>>> subRoutesOptional = collectRoutes(outletClass, children.get(registration), children, routerValue);
                        if (subRoutesOptional.isPresent()) {
                            isInScope = true;
                            Value<Array<Route>> subRoutes = subRoutesOptional.get();
                            emit(() -> builder.get().children(subRoutes.get().asArray()));
                            emit(() -> routeArray.get().push(builder.get().build()));
                        }
                    }
                }
            }
        }

        if (isInScope) {
            return Optional.of(routeArray);
        } else {
            return Optional.empty();
        }
    }

    private static ActionFn routeAction(Class<?> component, js.lang.external.vaadin.router.Router router) {
        return ((context, commands) -> {
            if (hasPendingException(router)) {
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
                setPendingException(router, e);
                return context.next();
            }
        });
    }

    private static ActionFn routeActionAndComponent(Class<?> component, js.lang.external.vaadin.router.Router router) {
        return ((context, commands) -> {
            if (hasPendingException(router)) {
                return context.next();
            }
            try {
                Router.setCurrentParams(context.getParams());
                HasElement<? extends Element> componentIntance = (Component<?>) component.newInstance();
                Router.clearCurrentParams();

                RouteAction routeAction = new RouteAction(context.cast(), commands);
                ((HasRouteAction) componentIntance).onRouteAction(routeAction);

                if (routeAction.getResult() == null) {
                    return componentIntance.getElement();
                } else {
                    return routeAction.getResult();
                }
            } catch (Exception e) {
                setPendingException(router, e);
                return context.next();
            }
        });
    }

    private static ActionFn component(Class<?> component, js.lang.external.vaadin.router.Router router) {
        return ((context, commands) -> {
            if (hasPendingException(router)) {
                return context.next();
            }
            try {
                Router.setCurrentParams(context.getParams());
                HasElement<? extends Element> componentIntance = (Component<?>) component.newInstance();
                Router.clearCurrentParams();
                return componentIntance.getElement();
            } catch (Exception e) {
                setPendingException(router, e);
                return context.next();
            }
        });
    }

    private static ActionFn componentAndCallbacks(Class<?> component, js.lang.external.vaadin.router.Router router) {
        return ((context, commands) -> {
            if (hasPendingException(router)) {
                return context.next();
            }
            try {
                Router.setCurrentParams(context.getParams());
                HasElement<? extends Element> componentIntance = (Component<?>) component.newInstance();
                Router.clearCurrentParams();

                installLifecycleCallbacks(componentIntance);

                return componentIntance.getElement();
            } catch (Exception e) {
                setPendingException(router, e);
                return context.next();
            }
        });
    }

    private static ActionFn routeActionAndComponentAndCallbacks(Class<?> component, js.lang.external.vaadin.router.Router router) {
        return ((context, commands) -> {
            if (hasPendingException(router)) {
                return context.next();
            }
            try {
                Router.setCurrentParams(context.getParams());
                HasElement<? extends Element> componentIntance = (Component<?>) component.newInstance();
                Router.clearCurrentParams();

                installLifecycleCallbacks(componentIntance);

                RouteAction routeAction = new RouteAction(context.cast(), commands);
                ((HasRouteAction) componentIntance).onRouteAction(routeAction);

                if (routeAction.getResult() == null) {
                    return componentIntance.getElement();
                } else {
                    return routeAction.getResult();
                }
            } catch (Exception e) {
                setPendingException(router, e);
                return context.next();
            }
        });
    }

    private static void installLifecycleCallbacks(HasElement<? extends Element> componentIntance) {
        HasLifecycleCallbacks instance = (HasLifecycleCallbacks) componentIntance;
        LifecycleCallbacks callbacks = componentIntance.getElement().cast();

        callbacks.setOnBeforeEnter(((location, cmds, thisRouter) -> {
            BeforeEnter event = new BeforeEnter(location, cmds, thisRouter);
            instance.onBeforeEnter(event);
            return event.getResult().cast();
        }));
        callbacks.setOnAfterEnter(((location, cmds, thisRouter) -> {
            AfterEnter event = new AfterEnter(location, thisRouter);
            instance.onAfterEnter(event);
        }));
        callbacks.setOnBeforeLeave(((location, cmds, thisRouter) -> {
            BeforeLeave event = new BeforeLeave(location, cmds, thisRouter);
            instance.onBeforeLeave(event);
            return event.getResult().cast();
        }));
        callbacks.setOnAfterLeave(((location, cmds, thisRouter) -> {
            AfterLeave event = new AfterLeave(location, thisRouter);
            instance.onAfterLeave(event);
        }));
    }

    private static int getParamCount(String x) {
        int count = 0;
        int length = x.length();
        for (int i = 0; i < length; i++) {
            if (x.charAt(i) == ':' || x.charAt(i)=='(') {
                count++;
            }
        }
        return count;
    }

    private interface LifecycleCallbacks extends Any {
        @JSProperty
        void setOnBeforeEnter(BeforeEnterObserver beforeEnter);

        @JSProperty
        void setOnAfterEnter(AfterEnterObserver afterEnter);

        @JSProperty
        void setOnBeforeLeave(BeforeLeaveObserver beforeLeave);

        @JSProperty
        void setOnAfterLeave(AfterLeaveObserver afterLeave);
    }

    private interface ExceptionOverlay extends Any {
        @JSProperty
        void setPendingException(Any exception);

        @JSBody(script = "return this.pendingException || null")
        Any getPendingException();

        @JSBody(script = "return !!this.pendingException")
        boolean hasPendingException();
    }

}
