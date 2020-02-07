package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.vaadin.renderers.RowDetailsRenderer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RowDetailsMixin<ITEM extends Any> extends Element {
	/**
	 * An array containing references to items with open row details.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getDetailsOpenedItems();

	/**
	 * An array containing references to items with open row details.
	 */
	@JSProperty
	void setDetailsOpenedItems(ITEM... detailsOpenedItems);

	@JSProperty
	void setDetailsOpenedItems(Array<ITEM> detailsOpenedItems);

	/**
	 * Custom function for rendering the content of the row details.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The row details content DOM element. Append your content to it.</li>
	 * <li><code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.</li>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	RowDetailsRenderer<ITEM> getRowDetailsRenderer();

	/**
	 * Custom function for rendering the content of the row details.
	 * Receives three arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The row details content DOM element. Append your content to it.</li>
	 * <li><code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.</li>
	 * <li><code>rowData</code> The object with the properties related with
	 * the rendered item, contains:
	 * <ul>
	 * <li><code>rowData.index</code> The index of the item.</li>
	 * <li><code>rowData.item</code> The item.</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	@JSProperty
	void setRowDetailsRenderer(RowDetailsRenderer<ITEM> rowDetailsRenderer);

	/**
	 * Open the details row of a given item.
	 */
	void openItemDetails(ITEM item);

	/**
	 * Close the details row of a given item.
	 */
	void closeItemDetails(ITEM item);
}
