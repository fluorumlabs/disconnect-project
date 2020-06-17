package com.github.fluorumlabs.disconnect.core.router;

import js.lang.Any;
import js.lang.external.vaadin.router.PreventCommands;
import js.lang.external.vaadin.router.Router;
import js.lang.external.vaadin.router.RouterLocation;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public class BeforeLeave extends RouterEvent {
    private final PreventCommands commands;

    private Any result = null;

    public BeforeLeave(RouterLocation location, PreventCommands commands, Router router) {
        super(location);
        this.commands = commands;
    }

    public void prevent() {
        result = commands.prevent();
    }

    public Any getResult() {
        return result;
    }
}
