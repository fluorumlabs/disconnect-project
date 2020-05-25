package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.IntegerFieldElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * <code>&lt;vaadin-integer-field&gt;</code> is a Web Component for integer field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-integer-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-integer-field&gt;
 * </code></pre>
 */
@WebComponent
public class IntegerField extends AbstractComponent<IntegerFieldElement>
		implements HasStyle<IntegerFieldElement, IntegerField>, HasComponents<IntegerFieldElement, IntegerField, HasElement<?>> {
	public IntegerField() {
		super(IntegerFieldElement.TAGNAME());
	}
}
