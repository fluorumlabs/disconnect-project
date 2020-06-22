package com.github.fluorumlabs.disconnect.core.router;

import com.github.fluorumlabs.disconnect.core.components.Component;
import js.lang.Unknown;
import js.lang.external.vaadin.router.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.*;

/**
 * Created by Artem Godin on 6/18/2020.
 */
@Slf4j
public final class Router {
    private static final RouterOutlet ROOT = new RouterOutlet();
    @Nullable
    private static Params currentParams = null;

    private Router() {
    }

    public static String getUrlForTarget(Class<?> target) {
        return ROOT.getUrlForTarget(target);
    }

    public static String getUrlForTarget(Class<?> target, LocationParams parameters) {
        return ROOT.getUrlForTarget(target, parameters);
    }

    public static RouterOutlet getRootOutlet() {
        return ROOT;
    }

    public static void go(String path) {
        js.lang.external.vaadin.router.Router.go(path);
    }

    public static void go(Class<? extends Component<?>> view) {
        js.lang.external.vaadin.router.Router.go(getUrlForTarget(view));
    }

    public static void go(Class<? extends Component<?>> view, LocationParams params) {
        js.lang.external.vaadin.router.Router.go(getUrlForTarget(view, params));
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

    static List<String> getStringArrayParameter(String name, String defaultValue) {
        return currentParams != null ? Arrays.asList(currentParams.get(name).stringArrayValue()) : Arrays.asList(StringUtils.split(defaultValue, "/"));
    }

    static int getIntParameter(String name, String defaultValue) {
        return currentParams != null ? currentParams.get(name).intValue() : Unknown.of(defaultValue).intValue();
    }

    static boolean getBooleanParameter(String name, String defaultValue) {
        return currentParams != null ? BooleanUtils.toBoolean(currentParams.get(name).stringValue()) : BooleanUtils.toBoolean(defaultValue);
    }


}
