package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.InlineEditingMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

public interface HasInlineEditingMixin<ITEM extends Any, E extends InlineEditingMixin, T extends HasElement<E>>
		extends HasElement<E> {
	/**
	 * When true, pressing Enter while in cell edit mode
	 * will move focus to the editable cell in the next row
	 * (Shift + Enter - same, but for previous row).
	 */
	default boolean enterNextRow() {
		return getNode().isEnterNextRow();
	}

	/**
	 * When true, pressing Enter while in cell edit mode
	 * will move focus to the editable cell in the next row
	 * (Shift + Enter - same, but for previous row).
	 */
	default T enterNextRow(boolean enterNextRow) {
		getNode().setEnterNextRow(enterNextRow);
		return (T) this;
	}

	/**
	 * When true, after moving to next or previous editable cell using
	 * Tab / Shift+Tab, it will be focused without edit mode.
	 * <p>
	 * When <code>enterNextRow</code> is true, pressing Enter will also
	 * preserve edit mode, otherwise, it will have no effect.
	 */
	default boolean singleCellEdit() {
		return getNode().isSingleCellEdit();
	}

	/**
	 * When true, after moving to next or previous editable cell using
	 * Tab / Shift+Tab, it will be focused without edit mode.
	 * <p>
	 * When <code>enterNextRow</code> is true, pressing Enter will also
	 * preserve edit mode, otherwise, it will have no effect.
	 */
	default T singleCellEdit(boolean singleCellEdit) {
		getNode().setSingleCellEdit(singleCellEdit);
		return (T) this;
	}

	/**
	 * Fired before exiting the cell edit mode, if the value has been changed.
	 * If the default is prevented, value change would not be applied.
	 */
	default ObservableEvent<PropertyChangeEvent<ITEM>> itemPropertyChangedEvent() {
		return createEvent("item-property-changed");
	}
}
