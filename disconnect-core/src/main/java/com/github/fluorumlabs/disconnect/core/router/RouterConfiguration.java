package com.github.fluorumlabs.disconnect.core.router;

import js.lang.external.vaadin.router.Route;
import js.util.collections.Array;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@AllArgsConstructor
@Getter
public class RouterConfiguration {
    private final Array<Route> routes;
    private final Map<Class<? extends Exception>, Class<?>> errorViews;
}
