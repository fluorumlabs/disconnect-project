package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * <code>&lt;vaadin-email-field&gt;</code> is a Web Component for email field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-email-field label=&quot;Email&quot;&gt;
 * &lt;/vaadin-email-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See vaadin-text-field.html for the styling documentation
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-text-field/vaadin-email-field.js"
)
public interface EmailFieldElement extends TextFieldElement {
	static String TAGNAME() {
		return "vaadin-email-field";
	}
}
