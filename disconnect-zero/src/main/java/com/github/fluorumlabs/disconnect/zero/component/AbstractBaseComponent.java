package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.Application;
import com.github.fluorumlabs.disconnect.zero.LazyEventInitializer;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.Node;

import javax.annotation.Nullable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


public abstract class AbstractBaseComponent<X extends Node> extends LazyEventInitializer<X> implements Component<X> {
	private final X node;

	protected AbstractBaseComponent(X node) {
		this.node = node;
		node.<ComponentReferenceHolder<AbstractBaseComponent<?>>>cast().set(this);
	}

	public X getNode() {
		return node;
	}

	public Node getRenderedNode() {
		return node;
	}

	@Override
	public <T, E extends ObservableEvent<T>> E createEvent(Object identifier, Supplier<E> initializer) {
		return super.createEvent(identifier, initializer);
	}

	@Override
	public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier) {
		return createEvent(node, identifier);
	}

	@Override
	public <T extends Event, E extends ObservableEvent<T>> E createEvent(String identifier, String... altIdentifiers) {
		return createEvent(node, identifier, altIdentifiers);
	}

	@Override
	public <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener) {
		return createEvent(node, addEventListener);
	}

	@SafeVarargs
	@Override
	public final <T extends Event, E extends ObservableEvent<T>> E createEvent(BiConsumer<X, EventListener<T>> addEventListener, BiConsumer<X, EventListener<T>>... addEventListeners) {
		return createEvent(node, addEventListener, addEventListeners);
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

	@Nullable
	protected <Y extends AbstractBaseComponent<?>> Y getParent() {
		Element parentElement = node.getParentElement();
		return parentElement == null ? null : from(parentElement);
	}

	public static <C extends AbstractBaseComponent<?>> C from(Element element) {
		return element.<ComponentReferenceHolder<C>>cast().get();
	}

	public void async(Runnable action) {
		Application.async(action);
	}

	public void async(Object marker, Runnable action) {
		Application.async(marker, action);
	}

	public void debounce(Runnable action, int milliseconds) {
		Application.debounce(action, milliseconds);
	}

	public void debounce(Object marker, Runnable action, int milliseconds) {
		Application.debounce(marker, action, milliseconds);
	}
}
