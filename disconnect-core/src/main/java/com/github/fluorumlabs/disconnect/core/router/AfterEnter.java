package com.github.fluorumlabs.disconnect.core.router;

import js.lang.external.vaadin.router.Router;
import js.lang.external.vaadin.router.RouterLocation;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public class AfterEnter extends RouterEvent {

    public AfterEnter(RouterLocation location, Router router) {
        super(location);
    }
}
