package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A mixin for `nav` elements, facilitating navigation and selection of childNodes.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ListMixin",
		module = "@vaadin/vaadin-list-mixin/vaadin-list-mixin.js"
)
public interface ListMixin extends Element {
	/**
	 *
	 */
	@JSProperty
	Element getFocused();

	/**
	 * The index of the item selected in the items array.
	 * Note: Not updated when used in `multiple` selection mode.
	 */
	@JSProperty
	int getSelected();

	/**
	 * The index of the item selected in the items array.
	 * Note: Not updated when used in `multiple` selection mode.
	 */
	@JSProperty
	void setSelected(int selected);

	/**
	 * Define how items are disposed in the dom.
	 * Possible values are: `horizontal|vertical`.
	 * It also changes navigation keys from left/right to up/down.
	 */
	@Nullable
	@JSProperty
	Orientation getOrientation();

	/**
	 * Define how items are disposed in the dom.
	 * Possible values are: `horizontal|vertical`.
	 * It also changes navigation keys from left/right to up/down.
	 */
	@JSProperty
	void setOrientation(Orientation orientation);

	/**
	 * The list of items from which a selection can be made.
	 * It is populated from the elements passed to the light DOM,
	 * and updated dynamically when adding or removing items.
	 * <p>
	 * The item elements must implement `Vaadin.ItemMixin`.
	 * <p>
	 * Note: unlike `<vaadin-combo-box>`, this property is read-only,
	 * so if you want to provide items by iterating array of data,
	 * you have to use `dom-repeat` and place it to the light DOM.
	 */
	@Nullable
	@JSProperty
	Array<ItemMixin> getItems();

	void focus();
}
