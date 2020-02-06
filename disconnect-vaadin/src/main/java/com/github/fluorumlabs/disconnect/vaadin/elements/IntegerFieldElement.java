package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * <code>&lt;vaadin-integer-field&gt;</code> is a Web Component for integer field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-integer-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-integer-field&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "IntegerFieldElement",
		module = "@vaadin/vaadin-text-field/vaadin-integer-field.js"
)
public interface IntegerFieldElement extends NumberFieldElement {
}
