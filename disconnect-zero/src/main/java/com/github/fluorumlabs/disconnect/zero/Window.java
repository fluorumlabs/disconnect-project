package com.github.fluorumlabs.disconnect.zero;

import com.github.fluorumlabs.disconnect.zero.component.EventInitializer;
import com.github.fluorumlabs.disconnect.zero.component.HasPrintingEvents;
import com.github.fluorumlabs.disconnect.zero.component.HasUnloadEvents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.WindowEventHandlers;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import static js.web.dom.Window.WINDOW;


public class Window extends LazyEventInitializer<WindowEventHandlers> implements
        EventInitializer<WindowEventHandlers>,
        HasPrintingEvents<WindowEventHandlers>,
        HasUnloadEvents<WindowEventHandlers> {

    Window() {
    }

    @Override
    public <T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer) {
        return super.createEvent(identifier, initializer);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier) {
        return super.createEvent(WINDOW, identifier);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier, String... altIdentifiers) {
        return super.createEvent(WINDOW, identifier, altIdentifiers);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<WindowEventHandlers, EventListener<T>> addEventListener) {
        return super.createEvent(WINDOW, addEventListener);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<WindowEventHandlers, EventListener<T>> addEventListener, BiConsumer<WindowEventHandlers, EventListener<T>>... altAddEventListeners) {
        return super.createEvent(WINDOW, addEventListener, altAddEventListeners);
    }
    
}
