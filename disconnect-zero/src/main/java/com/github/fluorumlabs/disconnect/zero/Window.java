package com.github.fluorumlabs.disconnect.zero;

import com.github.fluorumlabs.disconnect.zero.component.WindowEvents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.web.dom.Event;
import js.web.dom.EventListener;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static js.web.dom.Window.WINDOW;


public class Window extends LazyEventInitializer<js.web.dom.Window> implements
        WindowEvents<js.web.dom.Window> {

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
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<js.web.dom.Window, EventListener<T>> addEventListener) {
        return super.createEvent(WINDOW, addEventListener);
    }

    @Override
    public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<js.web.dom.Window, EventListener<T>> addEventListener, BiConsumer<js.web.dom.Window, EventListener<T>>... altAddEventListeners) {
        return super.createEvent(WINDOW, addEventListener, altAddEventListeners);
    }

    @Override
    public <T, E extends ObservableValue<T>> E createObservableValue(Supplier<T> getter, Consumer<T> setter,
                                                                     ObservableEvent<?> event) {
        return createObservableValue(event, () -> {
            ObservableValue<T> observableValue = ObservableValue.of(getter.get());
            observableValue.accept(setter);
            event.accept(evt -> observableValue.set(getter.get()));
            return (E) observableValue;
        });
    }
}
