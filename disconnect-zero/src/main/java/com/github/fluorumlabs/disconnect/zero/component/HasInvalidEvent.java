package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;
import js.web.dom.GlobalEventHandlers;


public interface HasInvalidEvent<T extends GlobalEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<Event> invalidEvent() {
        return createEvent(GlobalEventHandlers::addInvalidEventListener);
    }
}
