package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.ItemElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasItemMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

/**
 * <code>&lt;vaadin-item&gt;</code> is a Web Component providing layout for items in tabs and menus.
 *
 * <pre><code>  &lt;vaadin-item&gt;
 *     Item content
 *   &lt;/vaadin-item&gt;
 * </code></pre>
 * <h3>Selectable</h3>
 * <code>&lt;vaadin-item&gt;</code> has the <code>selected</code> property and the corresponding state attribute.
 * Currently, the component sets the <code>selected</code> to false, when <code>disabled</code> property is set to true.
 * But other than that, the <code>&lt;vaadin-item&gt;</code> does not switch selection by itself.
 * In general, it is the wrapper component, like <code>&lt;vaadin-list-box&gt;</code>, which should update
 * the <code>selected</code> property on the items, e. g. on mousedown or when Enter / Spacebar is pressed.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>content</code></td><td>The element that wraps the slot</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled item</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>selected</code></td><td>Set when the item is selected</td><td>:host</td></tr>
 * <tr><td><code>active</code></td><td>Set when mousedown or enter/spacebar pressed</td><td>:host</td></tr>
 * </tbody>
 * </table>
 */
@WebComponent
public class Item extends AbstractComponent<ItemElement> implements HasItemMixin<ItemElement, Item>,
		HasStyle<ItemElement, Item>, HasComponents<ItemElement, Item, HasElement<?>> {
	public Item() {
		super(ItemElement.TAGNAME());
	}

	/**
	 * Submittable string value. The default value is the trimmed text content of the element.
	 */
	public String value() {
		return getNode().getValue();
	}

	/**
	 * Submittable string value. The default value is the trimmed text content of the element.
	 */
	public Item value(String value) {
		getNode().setValue(value);
		return this;
	}
}
