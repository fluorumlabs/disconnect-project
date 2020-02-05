package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.CheckboxElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-checkbox&gt;</code> is a Web Component for customized checkboxes.
 *
 * <pre><code class="language-html">&lt;vaadin-checkbox&gt;
 *   Make my profile visible
 * &lt;/vaadin-checkbox&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>checkbox</code></td><td>The wrapper element for the native <input type="checkbox"></td></tr>
 * <tr><td><code>label</code></td><td>The wrapper element in which the component's children, namely the label, is
 * slotted</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>active</code></td><td>Set when the checkbox is pressed down, either with mouse, touch or the
 * keyboard.</td><td><code>:host</code></td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the checkbox is disabled.</td><td><code>:host</code></td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the checkbox is focused using the keyboard
 * .</td><td><code>:host</code></td></tr>
 * <tr><td><code>focused</code></td><td>Set when the checkbox is focused.</td><td><code>:host</code></td></tr>
 * <tr><td><code>indeterminate</code></td><td>Set when the checkbox is in indeterminate mode
 * .</td><td><code>:host</code></td></tr>
 * <tr><td><code>checked</code></td><td>Set when the checkbox is checked.</td><td><code>:host</code></td></tr>
 * <tr><td><code>empty</code></td><td>Set when there is no label provided.</td><td><code>label</code></td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinCheckbox extends AbstractComponent<CheckboxElement>
		implements HasElementMixin<CheckboxElement, VaadinCheckbox>,
		HasControlStateMixin<CheckboxElement, VaadinCheckbox>,
		HasThemableMixin<CheckboxElement, VaadinCheckbox>,
		HasGestureEventListeners<CheckboxElement, VaadinCheckbox>,
		HasComponents<CheckboxElement, VaadinCheckbox, Component<?>> {
	public VaadinCheckbox() {
		super("vaadin-checkbox");
	}

	/**
	 * Name of the element.
	 */
	public String name() {
		return getNode().getName();
	}

	/**
	 * Name of the element.
	 */
	public VaadinCheckbox name(String name) {
		getNode().setName(name);
		return this;
	}

	/**
	 * True if the checkbox is checked.
	 */
	public boolean checked() {
		return getNode().isChecked();
	}

	/**
	 * True if the checkbox is checked.
	 */
	public VaadinCheckbox checked(boolean checked) {
		getNode().setChecked(checked);
		return this;
	}

	/**
	 * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
	 */
	public boolean indeterminate() {
		return getNode().isIndeterminate();
	}

	/**
	 * Indeterminate state of the checkbox when it's neither checked nor unchecked, but undetermined.
	 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes">https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#Indeterminate_state_checkboxes</a>
	 */
	public VaadinCheckbox indeterminate(boolean indeterminate) {
		getNode().setIndeterminate(indeterminate);
		return this;
	}

	/**
	 * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * The value given to the data submitted with the checkbox's name to the server when the control is inside a form.
	 */
	public VaadinCheckbox value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * Fired when the user commits a value change.
	 */
	public ObservableEvent<Event> changeEvent() {
		return createEvent("change");
	}

	/**
	 * Fired when the <code>checked</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> checkedChangedEvent() {
		return createEvent("checked-changed");
	}

	/**
	 * Fired when the <code>indeterminate</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> indeterminateChangedEvent() {
		return createEvent("indeterminate-changed");
	}
}
