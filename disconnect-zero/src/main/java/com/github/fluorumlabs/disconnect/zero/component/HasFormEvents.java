package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;
import js.web.dom.GlobalEventHandlers;


public interface HasFormEvents<T extends GlobalEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<Event> resetEvent() {
        return createEvent(GlobalEventHandlers::addResetEventListener);
    }
    default ObservableEvent<Event> submitEvent() {
        return createEvent(GlobalEventHandlers::addSubmitEventListener);
    }
}
