package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ProgressMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;

public interface HasProgressMixin<E extends ProgressMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 * Current progress value.
	 */
	default double value() {
		return getNode().getValue();
	}

	/**
	 * Current progress value.
	 */
	default T value(double value) {
		getNode().setValue(value);
		return (T) this;
	}

	/**
	 * Minimum bound of the progress bar.
	 */
	default double min() {
		return getNode().getMin();
	}

	/**
	 * Minimum bound of the progress bar.
	 */
	default T min(double min) {
		getNode().setMin(min);
		return (T) this;
	}

	/**
	 * Maximum bound of the progress bar.
	 */
	default double max() {
		return getNode().getMax();
	}

	/**
	 * Maximum bound of the progress bar.
	 */
	default T max(double max) {
		getNode().setMax(max);
		return (T) this;
	}

	/**
	 * Indeterminate state of the progress bar.
	 * This property takes precedence over other state properties (min, max, value).
	 */
	default boolean indeterminate() {
		return getNode().isIndeterminate();
	}

	/**
	 * Indeterminate state of the progress bar.
	 * This property takes precedence over other state properties (min, max, value).
	 */
	default T indeterminate(boolean indeterminate) {
		getNode().setIndeterminate(indeterminate);
		return (T) this;
	}
}
