package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;
import js.web.dom.GlobalEventHandlers;


public interface HasScrollEvent extends EventInitializer<GlobalEventHandlers> {
    default ObservableEvent<Event> scrollEvent() { return createEvent(GlobalEventHandlers::addScrollEventListener); }
}
