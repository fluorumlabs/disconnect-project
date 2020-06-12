package com.github.fluorumlabs.disconnect.core;

import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventTarget;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;


public abstract class LazyEventInitializer<X extends EventTarget> implements EventInitializer<X> {
	private final Map<Object, ObservableEvent<?>> eventMap = new HashMap<>();

	private final Map<Object, ObservableValue<?>> valueMap = new HashMap<>();

	private static final String[] NO_ALTERNATIVES = new String[0];

	protected <T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer) {
		return (E) eventMap.computeIfAbsent(identifier, __ -> initializer.get());
	}

	protected <T extends Serializable, E extends ObservableValue<T>> E createObservableValue(Object identifier, Supplier<E> initializer) {
		return (E) valueMap.computeIfAbsent(identifier, __ -> initializer.get());
	}

	protected <T extends Event, E extends ObservableEvent<T>> E createEvent(X target, String identifier) {
		return createEvent(target, identifier, NO_ALTERNATIVES);
	}

	protected <T extends Event, E extends ObservableEvent<T>> E createEvent(X target, String identifier,
															String... altIdentifiers) {
		return createEvent(identifier, () -> {
			ObservableEvent<T> event = new ObservableEvent<>();
			EventListener<T> listener = event::trigger;

			target.addEventListener(identifier, listener);
			for (String altIdentifier : altIdentifiers) {
				target.addEventListener(altIdentifier, listener);
			}
			return (E) event;
		});
	}

	protected <T extends Event, E extends ObservableEvent<T>> E createEvent(X target,
															BiConsumer<X, EventListener<T>> addEventListener) {
		return createEvent(addEventListener, () -> {
			ObservableEvent<T> event = new ObservableEvent<>();
			EventListener<T> listener = event::trigger;

			addEventListener.accept(target, listener);
			return (E) event;
		});
	}

	protected <T extends Event, E extends ObservableEvent<T>> E createEvent(X target,
															BiConsumer<X, EventListener<T>> addEventListener, BiConsumer<X, EventListener<T>>... altAddEventListeners) {
		return createEvent(addEventListener, () -> {
			ObservableEvent<T> event = new ObservableEvent<>();
			EventListener<T> listener = event::trigger;

			addEventListener.accept(target, listener);
			for (BiConsumer<X, EventListener<T>> altAddEventListener : altAddEventListeners) {
				altAddEventListener.accept(target, listener);
			}
			return (E) event;
		});
	}
}
