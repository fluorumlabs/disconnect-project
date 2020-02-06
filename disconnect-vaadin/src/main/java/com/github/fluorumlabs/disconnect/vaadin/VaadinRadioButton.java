package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.RadioButtonElement;
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
 * <code>&lt;vaadin-radio-button&gt;</code> is a Web Component for radio buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-button value=&quot;foo&quot;&gt;Foo&lt;/vaadin-radio-button&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>radio</code></td><td>The radio button element</td></tr>
 * <tr><td><code>label</code></td><td>The label content element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the radio button is disabled.</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the radio button is focused using the keyboard
 * .</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the radio button is focused.</td><td>:host</td></tr>
 * <tr><td><code>checked</code></td><td>Set when the radio button is checked.</td><td>:host</td></tr>
 * <tr><td><code>empty</code></td><td>Set when there is no label provided.</td><td>label</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinRadioButton extends AbstractComponent<RadioButtonElement>
		implements HasElementMixin<RadioButtonElement, VaadinRadioButton>,
		HasControlStateMixin<RadioButtonElement, VaadinRadioButton>,
		HasThemableMixin<RadioButtonElement, VaadinRadioButton>,
		HasGestureEventListeners<RadioButtonElement, VaadinRadioButton>,
		HasComponents<RadioButtonElement, VaadinRadioButton, Component<?>> {
	public VaadinRadioButton() {
		super(RadioButtonElement.TAGNAME);
	}

	/**
	 * Name of the element.
	 */
	@Nullable
	public String name() {
		return getNode().getName();
	}

	/**
	 * Name of the element.
	 */
	public VaadinRadioButton name(String name) {
		getNode().setName(name);
		return this;
	}

	/**
	 * True if the radio button is checked.
	 */
	public boolean checked() {
		return getNode().isChecked();
	}

	/**
	 * True if the radio button is checked.
	 */
	public VaadinRadioButton checked(boolean checked) {
		getNode().setChecked(checked);
		return this;
	}

	/**
	 * The value for this element.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * The value for this element.
	 */
	public VaadinRadioButton value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * Fired when the user toggles the radio button.
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
}
