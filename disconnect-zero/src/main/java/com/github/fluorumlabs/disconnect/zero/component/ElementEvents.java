package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.*;


public interface ElementEvents<T extends HTMLElement> extends EventInitializer<T> {
    default ObservableEvent<Event> fullscreenChangeEvent() { return createEvent(HTMLElement::addFullscreenChangeEventListener); }
    default ObservableEvent<Event> fullscreenErrorEvent() { return createEvent(HTMLElement::addFullscreenErrorEventListener); }
}
