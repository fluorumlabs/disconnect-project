package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ProgressMixin",
		module = "@vaadin/vaadin-progress-bar/src/vaadin-progress-mixin.js"
)
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
