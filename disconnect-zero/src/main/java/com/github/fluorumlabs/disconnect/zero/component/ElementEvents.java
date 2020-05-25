package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.EventInitializer;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.*;


public interface ElementEvents<T extends Element> extends EventInitializer<T> {
    default ObservableEvent<Event> fullscreenChangeEvent() { return createEvent(Element::addFullscreenChangeEventListener); }
    default ObservableEvent<Event> fullscreenErrorEvent() { return createEvent(Element::addFullscreenErrorEventListener); }
}
