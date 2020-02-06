package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.IntegerFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * <code>&lt;vaadin-integer-field&gt;</code> is a Web Component for integer field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-integer-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-integer-field&gt;
 * </code></pre>
 */
public class VaadinIntegerField extends AbstractComponent<IntegerFieldElement>
		implements HasComponents<IntegerFieldElement, VaadinIntegerField, Component<?>> {
	public VaadinIntegerField() {
		super(IntegerFieldElement.TAGNAME);
	}
}
