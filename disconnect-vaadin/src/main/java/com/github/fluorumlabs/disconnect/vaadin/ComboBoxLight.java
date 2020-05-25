package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.ComboBoxLightElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasComboBoxDataProviderMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasComboBoxMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.lang.Any;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-combo-box-light&gt;</code> is a customizable version of the <code>&lt;vaadin-combo-box&gt;</code>
 * providing
 * only the dropdown functionality and leaving the input field definition to the user.
 * <p>
 * The element has the same API as <code>&lt;vaadin-combo-box&gt;</code>.
 * <p>
 * To create a custom input field, you need to add a child element which has a two-way
 * data-bindable property representing the input value. The property name is expected
 * to be <code>value</code> by default. See the example below for a simplest possible example
 * using a <code>&lt;vaadin-text-field&gt;</code> element.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light&gt;
 *   &lt;vaadin-text-field&gt;
 *   &lt;/vaadin-text-field&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * If you are using other custom input fields like <code>&lt;iron-input&gt;</code>, you
 * need to define the name of the bindable property with the <code>attrForValue</code> attribute.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light attr-for-value=&quot;bind-value&quot;&gt;
 *   &lt;iron-input&gt;
 *     &lt;input&gt;
 *   &lt;/iron-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * In the next example you can see how to create a custom input field based
 * on a <code>&lt;paper-input&gt;</code> decorated with a custom <code>&lt;iron-icon&gt;</code> and
 * two <code>&lt;paper-button&gt;</code>s to act as the clear and toggle controls.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light&gt;
 *   &lt;paper-input label=&quot;Elements&quot; class=&quot;input&quot;&gt;
 *     &lt;iron-icon icon=&quot;toll&quot; slot=&quot;prefix&quot;&gt;&lt;/iron-icon&gt;
 *     &lt;paper-button slot=&quot;suffix&quot; class=&quot;clear-button&quot;&gt;Clear&lt;/paper-button&gt;
 *     &lt;paper-button slot=&quot;suffix&quot; class=&quot;toggle-button&quot;&gt;Toggle&lt;/paper-button&gt;
 *   &lt;/paper-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 */
@WebComponent
public class ComboBoxLight<ITEM extends Any> extends AbstractComponent<ComboBoxLightElement<ITEM>>
		implements HasComboBoxDataProviderMixin<ITEM, ComboBoxLightElement<ITEM>, ComboBoxLight<ITEM>>,
		HasComboBoxMixin<ITEM, ComboBoxLightElement<ITEM>, ComboBoxLight<ITEM>>,
		HasStyle<ComboBoxLightElement<ITEM>, ComboBoxLight<ITEM>>, HasComponents<ComboBoxLightElement<ITEM>, ComboBoxLight<ITEM>, HasElement<?>> {
	public ComboBoxLight() {
		super(ComboBoxLightElement.TAGNAME());
	}

	/**
	 *
	 */
	public Element focused() {
		return getNode().getFocused();
	}

	/**
	 * Name of the two-way data-bindable property representing the
	 * value of the custom input field.
	 */
	@Nullable
	public String attrForValue() {
		return getNode().getAttrForValue();
	}

	/**
	 * Name of the two-way data-bindable property representing the
	 * value of the custom input field.
	 */
	public ComboBoxLight<ITEM> attrForValue(String attrForValue) {
		getNode().setAttrForValue(attrForValue);
		return this;
	}

	@Nullable
	public Element inputElement() {
		return getNode().getInputElement();
	}
}
