package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.GlobalEventHandlers;
import js.web.dom.InputEvent;


public interface HasInputEvent<T extends GlobalEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<InputEvent> inputEvent() {
        return createEvent(GlobalEventHandlers::addInputEventListener);
    }
}
