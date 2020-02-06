package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.CrudEditElement;
import com.github.fluorumlabs.disconnect.vaadin.types.ItemIndexEvent;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;

/**
 * <code>&lt;vaadin-crud-edit&gt;</code> is a helper element for <code>&lt;vaadin-grid-column&gt;</code> that provides
 * an easily themable button that fires an <code>edit</code> event with the row item as detail
 * when clicked.
 * <p>
 * Typical usage is in a <code>&lt;vaadin-grid-column&gt;</code> of a custom <code>&lt;vaadin-grid&gt;</code> inside
 * a <code>&lt;vaadin-crud&gt;</code> to enable editing.
 */
public class VaadinCrudEdit<ITEM extends Any> extends AbstractComponent<CrudEditElement>
		implements HasComponents<CrudEditElement, VaadinCrudEdit<ITEM>, Component<?>> {
	public VaadinCrudEdit() {
		super(CrudEditElement.TAGNAME());
	}

	/**
	 * Fired when user on the icon.
	 */
	public ObservableEvent<ItemIndexEvent<ITEM>> editEvent() {
		return createEvent("edit");
	}
}
