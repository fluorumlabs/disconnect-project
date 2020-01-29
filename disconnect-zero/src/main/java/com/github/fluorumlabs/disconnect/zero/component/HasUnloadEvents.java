package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.*;


public interface HasUnloadEvents<T extends WindowEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<BeforeUnloadEvent> beforeUnloadEvent() { return createEvent(WindowEventHandlers::addBeforeUnloadEventListener); }
    default ObservableEvent<Event> unloadEvent() { return createEvent(WindowEventHandlers::addUnloadEventListener); }
}
