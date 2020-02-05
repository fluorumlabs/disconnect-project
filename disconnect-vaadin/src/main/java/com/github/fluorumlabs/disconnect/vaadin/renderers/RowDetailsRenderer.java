package com.github.fluorumlabs.disconnect.vaadin.renderers;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridElement;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface RowDetailsRenderer<ITEM extends Any> extends Any {
	void render(Element root, GridElement grid, RowData<ITEM> rowData);

	interface RowData<ITEM extends Any> extends Any {
		@JSProperty
		int getIndex();

		@JSProperty
		ITEM getItem();
	}
}
