package com.github.fluorumlabs.disconnect.core.router;

import js.lang.Any;
import js.lang.external.vaadin.router.PreventAndRedirectCommands;
import js.lang.external.vaadin.router.Router;
import js.lang.external.vaadin.router.RouterLocation;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public class BeforeEnter extends RouterEvent {
    private final PreventAndRedirectCommands commands;

    private Any result = null;

    public BeforeEnter(RouterLocation location, PreventAndRedirectCommands commands, Router router) {
        super(location);
        this.commands = commands;
    }

    public void prevent() {
        result = commands.prevent();
    }

    public void redirect(String path) {
        result = commands.redirect(path);
    }

    public Any getResult() {
        return result;
    }
}
