package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.EmailFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

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
@WebComponent
public class EmailField extends AbstractComponent<EmailFieldElement>
		implements HasStyle<EmailFieldElement, EmailField>, HasComponents<EmailFieldElement, EmailField, Component<?>> {
	public EmailField() {
		super(EmailFieldElement.TAGNAME());
	}
}
