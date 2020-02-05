package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.CrudEditElement;
import com.github.fluorumlabs.disconnect.vaadin.types.ItemIndexEvent;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

/**
 * `<vaadin-crud-edit>` is a helper element for `<vaadin-grid-column>` that provides
 * an easily themable button that fires an `edit` event with the row item as detail
 * when clicked.
 * <p>
 * Typical usage is in a `<vaadin-grid-column>` of a custom `<vaadin-grid>` inside
 * a `<vaadin-crud>` to enable editing.
 */
public class VaadinCrudEdit<ITEM extends Any> extends AbstractComponent<CrudEditElement>
		implements HasComponents<CrudEditElement, VaadinCrudEdit<ITEM>, Component<?>> {
	public VaadinCrudEdit() {
		super("vaadin-crud-edit");
	}

	/**
	 * Fired when user on the icon.
	 */
	public ObservableEvent<ItemIndexEvent<ITEM>> editEvent() {
		return createEvent("edit");
	}
}
