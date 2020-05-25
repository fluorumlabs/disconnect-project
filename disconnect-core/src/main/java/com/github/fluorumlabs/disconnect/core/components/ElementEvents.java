package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.EventInitializer;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;


public interface ElementEvents<T extends Element> extends EventInitializer<T> {
    default ObservableEvent<Event> fullscreenChangeEvent() { return createEvent(Element::addFullscreenChangeEventListener); }
    default ObservableEvent<Event> fullscreenErrorEvent() { return createEvent(Element::addFullscreenErrorEventListener); }
}
