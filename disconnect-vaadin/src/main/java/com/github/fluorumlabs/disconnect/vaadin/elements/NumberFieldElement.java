package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSProperty;

/**
 * `<vaadin-number-field>` is a Web Component for number field control in forms.
 * <p>
 * ```html
 * <vaadin-number-field label="Number">
 * </vaadin-number-field>
 * ```
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "NumberFieldElement",
		module = "@vaadin/vaadin-text-field/src/vaadin-number-field.js"
)
public interface NumberFieldElement extends TextFieldElement {
	/**
	 * Set to true to display value increase/decrease controls.
	 */
	@JSProperty
	boolean isHasControls();

	/**
	 * Set to true to display value increase/decrease controls.
	 */
	@JSProperty
	void setHasControls(boolean hasControls);

	/**
	 * The minimum value of the field.
	 */
	@JSProperty
	double getMin();

	/**
	 * The minimum value of the field.
	 */
	@JSProperty
	void setMin(double min);

	/**
	 * The maximum value of the field.
	 */
	@JSProperty
	double getMax();

	/**
	 * The maximum value of the field.
	 */
	@JSProperty
	void setMax(double max);

	/**
	 * Specifies the allowed number intervals of the field.
	 */
	@JSProperty
	double getStep();

	/**
	 * Specifies the allowed number intervals of the field.
	 */
	@JSProperty
	void setStep(double step);

}
