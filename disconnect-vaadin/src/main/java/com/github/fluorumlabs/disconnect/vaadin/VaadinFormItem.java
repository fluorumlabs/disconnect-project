package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.FormItemElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.web.dom.Element;

/**
 * `<vaadin-form-item>` is a Web Component providing labelled form item wrapper
 * for using inside `<vaadin-form-layout>`.
 * <p>
 * `<vaadin-form-item>` accepts any number of children as the input content,
 * and also has a separate named `label` slot:
 * <p>
 * ```html
 * <vaadin-form-item>
 * <label slot="label">Label aside</label>
 * <input>
 * </vaadin-form-item>
 * ```
 * <p>
 * Any content can be used. For instance, you can have multiple input elements
 * with surrounding text. The label can be an element of any type:
 * <p>
 * ```html
 * <vaadin-form-item>
 * <span slot="label">Date of Birth</span>
 * <input placeholder="YYYY" size="4"> -
 * <input placeholder="MM" size="2"> -
 * <input placeholder="DD" size="2"><br>
 * <em>Example: 1900-01-01</em>
 * </vaadin-form-item>
 * ```
 * <p>
 * The label is optional and can be omitted:
 * <p>
 * ```html
 * <vaadin-form-item>
 * <input type="checkbox"> Subscribe to our Newsletter
 * </vaadin-form-item>
 * ```
 * <p>
 * By default, the `label` slot content is displayed aside of the input content.
 * When `label-position="top"` is set, the `label` slot content is displayed on top:
 * <p>
 * ```html
 * <vaadin-form-item label-position="top">
 * <label slot="label">Label on top</label>
 * <input>
 * </vaadin-form-item>
 * ```
 * <p>
 * **Note:** Normally, `<vaadin-form-item>` is used as a child of
 * a `<vaadin-form-layout>` element. Setting `label-position` is unnecessary,
 * because the `label-position` attribute is triggered automatically by the parent
 * `<vaadin-form-layout>`, depending on its width and responsive behavior.
 * <p>
 * ### Input Width
 * <p>
 * By default, `<vaadin-form-item>` does not manipulate the width of the slotted
 * input elements. Optionally you can stretch the child input element to fill
 * the available width for the input content by adding the `full-width` class:
 * <p>
 * ```html
 * <vaadin-form-item>
 * <label slot="label">Label</label>
 * <input class="full-width">
 * </vaadin-form-item>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The `label-position` host attribute can be used to target the label on top state:
 *
 * <pre><code>
 * &lt;dom-module id="my-form-item-theme" theme-for="vaadin-form-item"&gt;
 *   &lt;template&gt;
 *     &lt;style&gt;
 *       :host {
 *         /&#42; default state styles, label aside &#42;/
 *       }
 *
 *       :host([label-position="top"]) {
 *         /&#42; label on top state styles &#42;/
 *       }
 *     &lt;/style&gt;
 *   &lt;/template&gt;
 * &lt;/dom-module&gt;
 * </code></pre>
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ---|---
 * label | The label slot container
 * <p>
 * ### Custom CSS Properties Reference
 * <p>
 * The following custom CSS properties are available on the `<vaadin-form-item>`
 * element:
 * <p>
 * Custom CSS property | Description | Default
 * ---|---|---
 * `--vaadin-form-item-label-width` | Width of the label column when the labels are aside | `8em`
 * `--vaadin-form-item-label-spacing` | Spacing between the label column and the input column when the labels are
 * aside | `1em`
 * `--vaadin-form-item-row-spacing` | Height of the spacing between the form item elements | `1em`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinFormItem extends AbstractComponent<FormItemElement>
		implements HasThemableMixin<FormItemElement, VaadinFormItem>,
		HasSlottedComponents<FormItemElement, VaadinFormItem, Component<? extends Element>> {
	public VaadinFormItem() {
		super("vaadin-form-item");
	}

	public VaadinFormItem setLabel(Component<? extends Element> component) {
		return replaceSlotted("label", component);
	}

	public VaadinFormItem setLabel(Component<? extends Element>... components) {
		return replaceSlotted("label", components);
	}

	public VaadinFormItem addToLabel(Component<? extends Element> component) {
		return addSlotted("label", component);
	}

	public VaadinFormItem addToLabel(Component<? extends Element>... components) {
		return addSlotted("label", components);
	}

	public VaadinFormItem insertToLabel(Component<? extends Element> component) {
		return insertSlotted("label", component);
	}

	public VaadinFormItem insertToLabel(Component<? extends Element>... components) {
		return insertSlotted("label", components);
	}

	public VaadinFormItem clearLabel() {
		return removeAllSlotted("label");
	}
}
