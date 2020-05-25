package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringArrayPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CheckboxGroupElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.extras.JsEnum;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <code>&lt;vaadin-checkbox-group&gt;</code> is a Polymer element for grouping vaadin-checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox-group label=&quot;Preferred language of contact:&quot;&gt;
 *  &lt;vaadin-checkbox value=&quot;en&quot;&gt;English&lt;/vaadin-checkbox&gt;
 *  &lt;vaadin-checkbox value=&quot;fr&quot;&gt;Français&lt;/vaadin-checkbox&gt;
 *  &lt;vaadin-checkbox value=&quot;de&quot;&gt;Deutsch&lt;/vaadin-checkbox&gt;
 * &lt;/vaadin-checkbox-group&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label element</td></tr>
 * <tr><td><code>group-field</code></td><td>The element that wraps checkboxes</td></tr>
 * <tr><td><code>error-message</code></td><td>The error message element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the checkbox group and its children are disabled
 * .</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the checkbox group contains focus</td><td>:host</td></tr>
 * <tr><td><code>has-label</code></td><td>Set when the element has a label</td><td>:host</td></tr>
 * <tr><td><code>has-value</code></td><td>Set when the element has a value</td><td>:host</td></tr>
 * <tr><td><code>required</code></td><td>Set when the element is required</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class CheckboxGroup extends AbstractComponent<CheckboxGroupElement>
		implements HasThemableMixin<CheckboxGroup.Variant, CheckboxGroupElement, CheckboxGroup>,
		HasStyle<CheckboxGroupElement, CheckboxGroup>,
		HasComponents<CheckboxGroupElement, CheckboxGroup, HasElement<?>> {
	public CheckboxGroup() {
		super(CheckboxGroupElement.TAGNAME());
	}

	public CheckboxGroup(String label) {
		this();
		label(label);
	}


	/**
	 * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
	 */
	public boolean disabled() {
		return getNode().isDisabled();
	}

	/**
	 * The current disabled state of the checkbox group. True if group and all internal checkboxes are disabled.
	 */
	public CheckboxGroup disabled(boolean disabled) {
		getNode().setDisabled(disabled);
		return this;
	}

	/**
	 * String used for the label element.
	 */
	@Nullable
	public String label() {
		return getNode().getLabel();
	}

	/**
	 * String used for the label element.
	 */
	public CheckboxGroup label(String label) {
		getNode().setLabel(label);
		return this;
	}

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	public ObservableValue<Set<String>> value() {
		return createObservableValue(this::getValue, this::setValue, valueChangedEvent());
	}

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	private Set<String> getValue() {
		Set<String> set = new LinkedHashSet<>();
		String[] values = getNode().getValue();
		if (values != null) {
			set.addAll(Arrays.asList(values));
		}
		return set;
	}

	/**
	 * Value of the checkbox group.
	 * Note: toggling the checkboxes modifies the value by creating new
	 * array each time, to override Polymer dirty-checking for arrays.
	 * You can still use Polymer array mutation methods to update the value.
	 */
	private void setValue(Set<String> value) {
		getNode().setValue(value == null ? null : value.toArray(new String[]{}));
	}

	/**
	 * Error to show when the input value is invalid.
	 */
	@Nullable
	public String errorMessage() {
		return getNode().getErrorMessage();
	}

	/**
	 * Error to show when the input value is invalid.
	 */
	public CheckboxGroup errorMessage(String errorMessage) {
		getNode().setErrorMessage(errorMessage);
		return this;
	}

	/**
	 * Specifies that the user must fill in a value.
	 */
	public boolean required() {
		return getNode().isRequired();
	}

	/**
	 * Specifies that the user must fill in a value.
	 */
	public CheckboxGroup required(boolean required) {
		getNode().setRequired(required);
		return this;
	}

	/**
	 * This property is set to true when the control value is invalid.
	 */
	public boolean invalid() {
		return getNode().isInvalid();
	}

	/**
	 * This property is set to true when the control value is invalid.
	 */
	public CheckboxGroup invalid(boolean invalid) {
		getNode().setInvalid(invalid);
		return this;
	}

	/**
	 * Returns true if <code>value</code> is valid.
	 * <code>&lt;iron-form&gt;</code> uses this to check the validity or all its elements.
	 *
	 * @return True if the value is valid.
	 */
	public boolean validate() {
		return getNode().validate();
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<StringArrayPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}

	/**
	 * Fired when the <code>invalid</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
		return createEvent("invalid-changed");
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant VERTICAL = JsEnum.of("vertical");
	}

}
