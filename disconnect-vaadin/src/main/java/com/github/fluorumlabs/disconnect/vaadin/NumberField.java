package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.NumberFieldElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * <code>&lt;vaadin-number-field&gt;</code> is a Web Component for number field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-number-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-number-field&gt;
 * </code></pre>
 */
@WebComponent
public class NumberField extends AbstractComponent<NumberFieldElement>
		implements HasThemableMixin<TextField.Variant, NumberFieldElement, NumberField>,
		HasStyle<NumberFieldElement, NumberField>, HasComponents<NumberFieldElement, NumberField, HasElement<?>> {
	public NumberField() {
		super(NumberFieldElement.TAGNAME());
	}

	/**
	 * Set to true to display value increase/decrease controls.
	 */
	public boolean hasControls() {
		return getNode().isHasControls();
	}

	/**
	 * Set to true to display value increase/decrease controls.
	 */
	public NumberField hasControls(boolean hasControls) {
		getNode().setHasControls(hasControls);
		return this;
	}

	/**
	 * The minimum value of the field.
	 */
	public double min() {
		return getNode().getMin();
	}

	/**
	 * The minimum value of the field.
	 */
	public NumberField min(double min) {
		getNode().setMin(min);
		return this;
	}

	/**
	 * The maximum value of the field.
	 */
	public double max() {
		return getNode().getMax();
	}

	/**
	 * The maximum value of the field.
	 */
	public NumberField max(double max) {
		getNode().setMax(max);
		return this;
	}

	/**
	 * Specifies the allowed number intervals of the field.
	 */
	public double step() {
		return getNode().getStep();
	}

	/**
	 * Specifies the allowed number intervals of the field.
	 */
	public NumberField step(double step) {
		getNode().setStep(step);
		return this;
	}

	/**
	 *
	 */
	public boolean checkValidity() {
		return getNode().checkValidity();
	}
}
