package com.github.fluorumlabs.disconnect.core.router;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public interface HasRouteAction {
    default void onRouteAction(RouteAction routeAction) {
    }
}
