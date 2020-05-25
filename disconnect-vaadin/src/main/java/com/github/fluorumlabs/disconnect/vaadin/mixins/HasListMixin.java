package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.polymer.types.IntPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ItemMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ListMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.util.collections.Array;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * A mixin for <code>nav</code> elements, facilitating navigation and selection of childNodes.
 */
public interface HasListMixin<E extends ListMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 *
	 */
	default Element focused() {
		return getNode().getFocused();
	}

	/**
	 * The index of the item selected in the items array.
	 * Note: Not updated when used in <code>multiple</code> selection mode.
	 */
	default int selected() {
		return getNode().getSelected();
	}

	/**
	 * The index of the item selected in the items array.
	 * Note: Not updated when used in <code>multiple</code> selection mode.
	 */
	default T selected(int selected) {
		getNode().setSelected(selected);
		return (T) this;
	}

	/**
	 * Define how items are disposed in the dom.
	 * Possible values are: <code>horizontal|vertical</code>.
	 * It also changes navigation keys from left/right to up/down.
	 */
	@Nullable
	default Orientation orientation() {
		return getNode().getOrientation();
	}

	/**
	 * Define how items are disposed in the dom.
	 * Possible values are: <code>horizontal|vertical</code>.
	 * It also changes navigation keys from left/right to up/down.
	 */
	default T orientation(Orientation orientation) {
		getNode().setOrientation(orientation);
		return (T) this;
	}

	/**
	 * The list of items from which a selection can be made.
	 * It is populated from the elements passed to the light DOM,
	 * and updated dynamically when adding or removing items.
	 * <p>
	 * The item elements must implement <code>Vaadin.ItemMixin</code>.
	 * <p>
	 * Note: unlike <code>&lt;vaadin-combo-box&gt;</code>, this property is read-only,
	 * so if you want to provide items by iterating array of data,
	 * you have to use <code>dom-repeat</code> and place it to the light DOM.
	 */
	@Nullable
	default Array<ItemMixin> items() {
		return getNode().getItems();
	}

	default void focus() {
		getNode().focus();
	}

	/**
	 * Fired when the selection is changed.
	 * Not fired when used in <code>multiple</code> selection mode.
	 */
	default ObservableEvent<IntPropertyChangeEvent> selectedChangedEvent() {
		return createEvent("selected-changed");
	}
}
