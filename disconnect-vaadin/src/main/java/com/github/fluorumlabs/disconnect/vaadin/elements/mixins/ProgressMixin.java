package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.web.dom.Element;
import org.teavm.jso.JSProperty;


public interface ProgressMixin extends Element {
	/**
	 * Current progress value.
	 */
	@JSProperty
	double getValue();

	/**
	 * Current progress value.
	 */
	@JSProperty
	void setValue(double value);

	/**
	 * Minimum bound of the progress bar.
	 */
	@JSProperty
	double getMin();

	/**
	 * Minimum bound of the progress bar.
	 */
	@JSProperty
	void setMin(double min);

	/**
	 * Maximum bound of the progress bar.
	 */
	@JSProperty
	double getMax();

	/**
	 * Maximum bound of the progress bar.
	 */
	@JSProperty
	void setMax(double max);

	/**
	 * Indeterminate state of the progress bar.
	 * This property takes precedence over other state properties (min, max, value).
	 */
	@JSProperty
	boolean isIndeterminate();

	/**
	 * Indeterminate state of the progress bar.
	 * This property takes precedence over other state properties (min, max, value).
	 */
	@JSProperty
	void setIndeterminate(boolean indeterminate);
}
