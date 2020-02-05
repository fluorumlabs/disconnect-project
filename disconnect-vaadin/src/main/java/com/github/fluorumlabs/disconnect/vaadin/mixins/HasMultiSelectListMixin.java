package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.polymer.types.IntArrayPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.MultiSelectListMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * A mixin for <code>nav</code> elements, facilitating multiple selection of childNodes.
 */
public interface HasMultiSelectListMixin<E extends MultiSelectListMixin, T extends Component<E>>
		extends HasListMixin<E, T> {
	/**
	 * Specifies that multiple options can be selected at once.
	 */
	default boolean multiple() {
		return getNode().isMultiple();
	}

	/**
	 * Specifies that multiple options can be selected at once.
	 */
	default T multiple(boolean multiple) {
		getNode().setMultiple(multiple);
		return (T) this;
	}

	/**
	 * Array of indexes of the items selected in the items array
	 * Note: Not updated when used in single selection mode.
	 */
	@Nullable
	default int[] selectedValues() {
		return getNode().getSelectedValues();
	}

	/**
	 * Array of indexes of the items selected in the items array
	 * Note: Not updated when used in single selection mode.
	 */
	default T selectedValues(int... selectedValues) {
		getNode().setSelectedValues(selectedValues);
		return (T) this;
	}

	/**
	 * Fired when the selection is changed.
	 * Not fired in single selection mode.
	 */
	default ObservableEvent<IntArrayPropertyChangeEvent> selectedValuesChangedEvent() {
		return createEvent("selected-values-changed");
	}
}
