package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-number-field&gt;</code> is a Web Component for number field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-number-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-number-field&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-text-field/vaadin-number-field.js"
)
public interface NumberFieldElement extends TextFieldElement {
	static String TAGNAME() {
		return "vaadin-number-field";
	}

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
