package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

public interface ArrayDataProviderMixin<ITEM extends Any> extends Element {
	/**
	 * An array containing the items which will be stamped to the column template
	 * instances.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getItems();

	/**
	 * An array containing the items which will be stamped to the column template
	 * instances.
	 */
	@JSProperty
	void setItems(ITEM... items);

	@JSProperty
	void setItems(Array<ITEM> items);
}
