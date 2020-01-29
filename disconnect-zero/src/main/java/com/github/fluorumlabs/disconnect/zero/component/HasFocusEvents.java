package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.FocusEvent;
import js.web.dom.GlobalEventHandlers;


public interface HasFocusEvents<T extends GlobalEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<FocusEvent> focusEvent() { return createEvent(GlobalEventHandlers::addFocusEventListener); }
    default ObservableEvent<FocusEvent> blurEvent() { return createEvent(GlobalEventHandlers::addBlurEventListener); }
}
