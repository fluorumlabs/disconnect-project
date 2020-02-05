package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.RowDetailsRenderer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "RowDetailsMixin",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-row-details-mixin.js"
)
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
	void setDetailsOpenedItems(@JSByRef ITEM... detailsOpenedItems);

	@JSProperty
	void setDetailsOpenedItems(Array<ITEM> detailsOpenedItems);

	/**
	 * Custom function for rendering the content of the row details.
	 * Receives three arguments:
	 * <p>
	 * - `root` The row details content DOM element. Append your content to it.
	 * - `grid` The `<vaadin-grid>` element.
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
	 */
	@Nullable
	@JSProperty
	RowDetailsRenderer<ITEM> getRowDetailsRenderer();

	/**
	 * Custom function for rendering the content of the row details.
	 * Receives three arguments:
	 * <p>
	 * - `root` The row details content DOM element. Append your content to it.
	 * - `grid` The `<vaadin-grid>` element.
	 * - `rowData` The object with the properties related with
	 * the rendered item, contains:
	 * - `rowData.index` The index of the item.
	 * - `rowData.item` The item.
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
