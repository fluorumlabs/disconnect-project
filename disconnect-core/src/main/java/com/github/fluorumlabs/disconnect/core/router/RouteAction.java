package com.github.fluorumlabs.disconnect.core.router;

import com.github.fluorumlabs.disconnect.core.components.Component;
import js.lang.Any;
import js.lang.external.vaadin.router.Commands;
import js.lang.external.vaadin.router.RouterLocation;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public class RouteAction extends RouterEvent {
    private final Commands commands;

    private Any result = null;

    public RouteAction(RouterLocation location, Commands commands) {
        super(location);
        this.commands = commands;
    }

    public void prevent() {
        result = commands.prevent();
    }

    public void redirect(String path) {
        result = commands.redirect(path);
    }

    public void render(Component<?> component) {
        result = component.getElement().cast();
    }

    public Any getResult() {
        return result;
    }
}
