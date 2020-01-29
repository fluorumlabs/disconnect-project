package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.GlobalEventHandlers;
import js.web.dom.MouseEvent;


public interface HasClickEvent<T extends GlobalEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<MouseEvent> clickEvent() {
        return createEvent(GlobalEventHandlers::addClickEventListener);
    }
}
