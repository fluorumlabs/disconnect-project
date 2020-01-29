package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.FocusEvent;
import js.web.dom.GlobalEventHandlers;


public interface HasBubblingFocusEvents<T extends GlobalEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<FocusEvent> focusInEvent() { return createEvent(GlobalEventHandlers::addFocusInEventListener); }
    default ObservableEvent<FocusEvent> focusOutEvent() { return createEvent(GlobalEventHandlers::addFocusOutEventListener); }
}
