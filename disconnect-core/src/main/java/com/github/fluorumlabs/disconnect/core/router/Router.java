package com.github.fluorumlabs.disconnect.core.router;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectConfig;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.vaadin.router.*;
import js.web.dom.Element;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Map;

/**
 * Created by Artem Godin on 6/15/2020.
 */
@Slf4j
public class Router extends Div {
    private static final RouterOptions ROUTER_OPTIONS =new RouterOptions.Builder().baseUrl(DisconnectConfig.getBaseUrl()).build();

    private static final Router DEFAULT = new Router();

    private final js.lang.external.vaadin.router.Router router;
    private final Class<?> outlet;
    private final RouterConfiguration routerConfiguration;

    private static Params currentParams = null;

    @Nullable
    @Getter
    @Setter
    private Exception pendingException;

    private Router() {
        this(Router.class);
    }

    public Router(Class<?> outletClass) {
        outlet = outletClass;
        routerConfiguration = RouterInternals.getRouterConfiguration(outlet, this);
        router = js.lang.external.vaadin.router.Router.create(getElement(), ROUTER_OPTIONS);
        router.setRoutes(routerConfiguration.getRoutes().asArray());
        // Add fallback route handler
        if (outlet.getName().equals(Router.class.getName())) {
            router.addRoutes(new Route.Builder().path("(.*)").action(this::defaultFallbackHandler).build());
        }
    }

    public boolean hasPendingException() {
        return pendingException != null;
    }

    private Any defaultFallbackHandler(Context context, Commands commands) {
        if (pendingException == null) {
            pendingException = new NotFoundException(context.getPathname());
        }
        boolean matched = true;
        while (matched) {
            matched = false;
            for (Map.Entry<Class<? extends Exception>, Class<?>> errorView : routerConfiguration.getErrorViews().entrySet()) {
                if (errorView.getKey().isAssignableFrom(pendingException.getClass())) {
                    matched = true;
                    try {
                        HasElement<? extends Element> componentIntance = (Component<?>)errorView.getValue().newInstance();
                        if (componentIntance instanceof HasErrorParameter) {
                            ((HasErrorParameter)componentIntance).setErrorParameter(pendingException);
                        }
                        pendingException = null;
                        return componentIntance.getElement();
                    } catch (Exception e) {
                        pendingException = e;
                    }
                }
            }
        }

        if (pendingException != null && !pendingException.getClass().equals(NotFoundException.class)) {
            log.error("Unhandled exception during navigation to {}", context.getPathname(), pendingException);
        }

        pendingException = null;
        return context.next();
    }

    private String getUrl_(Class<?> target, LocationParams parameters) {
        return router.urlForName(target.getName(), parameters.getParams());
    }

    private String getUrl_(Class<?> target) {
        return router.urlForName(target.getName());
    }

    public static String getUrl(Class<?> target) {
        return DEFAULT.getUrl_(target);
    }

    public static String getUrl(Class<?> target, LocationParams parameters) {
        return DEFAULT.getUrl_(target, parameters);
    }

    public static Router getDefault() {
        return DEFAULT;
    }

    public static void go(String path) {
        js.lang.external.vaadin.router.Router.go(path);
    }

    public static void go(Class<? extends Component<?>> view) {
        js.lang.external.vaadin.router.Router.go(getUrl(view));
    }

    public static void go(Class<? extends Component<?>> view, LocationParams params) {
        js.lang.external.vaadin.router.Router.go(getUrl(view, params));
    }
    static void setCurrentParams(Params params) {
        currentParams = params;
    }

    static void clearCurrentParams() {
        currentParams = null;
    }

    static String getStringParameter(String name, String defaultValue) {
        return currentParams != null ? currentParams.get(name).stringValue() : defaultValue;
    }

    static String[] getStringArrayParameter(String name, String defaultValue) {
        return currentParams != null ? currentParams.get(name).stringArrayValue() : StringUtils.split(defaultValue, "/");
    }

    static int getIntParameter(String name, String defaultValue) {
        return currentParams != null ? currentParams.get(name).intValue() : Unknown.of(defaultValue).intValue();
    }

    static boolean getBooleanParameter(String name, String defaultValue) {
        return currentParams != null ? BooleanUtils.toBoolean(currentParams.get(name).stringValue()) : BooleanUtils.toBoolean(defaultValue);
    }


}
