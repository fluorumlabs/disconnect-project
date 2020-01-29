package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;
import js.web.dom.WindowEventHandlers;


public interface HasPrintingEvents<T extends WindowEventHandlers> extends EventInitializer<T> {
    default ObservableEvent<Event> beforePrintEvent() {
        return createEvent(WindowEventHandlers::addBeforePrintEventListener);
    }
    default ObservableEvent<Event> afterPrintEvent() { return createEvent(WindowEventHandlers::addAfterPrintEventListener); }
}
