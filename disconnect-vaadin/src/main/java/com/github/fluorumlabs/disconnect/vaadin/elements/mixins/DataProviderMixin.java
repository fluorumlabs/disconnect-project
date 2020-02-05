package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.dataproviders.GridDataProvider;
import js.lang.Any;
import js.lang.Unknown;
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
		symbols = "DataProviderMixin",
		module = "@vaadin/vaadin-grid/src/vaadin-grid-data-provider-mixin.js"
)
public interface DataProviderMixin<ITEM extends Any> extends Element {
	/**
	 * Number of items fetched at a time from the dataprovider.
	 */
	@JSProperty
	int getPageSize();

	/**
	 * Number of items fetched at a time from the dataprovider.
	 */
	@JSProperty
	void setPageSize(int pageSize);

	/**
	 * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
	 *
	 * <code>params.page</code> Requested page index
	 *
	 * <code>params.pageSize</code> Current page size
	 *
	 * <code>params.filters</code> Currently applied filters
	 *
	 * <code>params.sortOrders</code> Currently applied sorting orders
	 *
	 * <code>params.parentItem</code> When tree is used, and sublevel items
	 * are requested, reference to parent item of the requested sublevel.
	 * Otherwise <code>undefined</code>.
	 *
	 * <code>callback(items, size)</code> Callback function with arguments:
	 *
	 * <ul>
	 * <li><code>items</code> Current page of items</li>
	 * <li><code>size</code> Total number of items. When tree sublevel items
	 * are requested, total number of items in the requested sublevel.
	 * Optional when tree is not used, required for tree.</li>
	 * </ul>
	 */
	@Nullable
	@JSProperty
	GridDataProvider<ITEM> getDataProvider();

	/**
	 * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
	 *
	 * <code>params.page</code> Requested page index
	 *
	 * <code>params.pageSize</code> Current page size
	 *
	 * <code>params.filters</code> Currently applied filters
	 *
	 * <code>params.sortOrders</code> Currently applied sorting orders
	 *
	 * <code>params.parentItem</code> When tree is used, and sublevel items
	 * are requested, reference to parent item of the requested sublevel.
	 * Otherwise <code>undefined</code>.
	 *
	 * <code>callback(items, size)</code> Callback function with arguments:
	 *
	 * <ul>
	 * <li><code>items</code> Current page of items</li>
	 * <li><code>size</code> Total number of items. When tree sublevel items
	 * are requested, total number of items in the requested sublevel.
	 * Optional when tree is not used, required for tree.</li>
	 * </ul>
	 */
	@JSProperty
	void setDataProvider(GridDataProvider<ITEM> dataProvider);

	/**
	 * <code>true</code> while data is being requested from the data provider.
	 */
	@JSProperty
	boolean isLoading();

	/**
	 * Path to an item sub-property that identifies the item.
	 */
	@Nullable
	@JSProperty
	String getItemIdPath();

	/**
	 * Path to an item sub-property that identifies the item.
	 */
	@JSProperty
	void setItemIdPath(String itemIdPath);

	/**
	 * An array that contains the expanded items.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getExpandedItems();

	/**
	 * An array that contains the expanded items.
	 */
	@JSProperty
	void setExpandedItems(@JSByRef ITEM... expandedItems);

	@JSProperty
	void setExpandedItems(Array<ITEM> expandedItems);

	/**
	 * Returns a value that identifies the item. Uses <code>itemIdPath</code> if
	 * available.
	 * Can be customized by overriding.
	 */
	Unknown getItemId(ITEM item);

	/**
	 * Expands the given item tree.
	 */
	void expandItem(ITEM item);

	/**
	 * Collapses the given item tree.
	 */
	void collapseItem(ITEM item);

	/**
	 * Clears the cached pages and reloads data from dataprovider when needed.
	 */
	void clearCache();
}
