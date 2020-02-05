package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridColumnElement;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ColumnResizingMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

public interface HasColumnResizingMixin<ITEM extends Any, E extends ColumnResizingMixin, T extends Component<E>>
		extends Component<E> {
	/**
	 * Fired when a column in the grid is resized by the user.
	 */
	default ObservableEvent<CustomEvent<ColumnResizeDetail<ITEM>>> columnResizeEvent() {
		return createEvent("column-resize");
	}

	interface ColumnResizeDetail<ITEM extends Any> extends Any {
		@JSProperty
		GridColumnElement<ITEM> getResizedColumn();
	}
}
