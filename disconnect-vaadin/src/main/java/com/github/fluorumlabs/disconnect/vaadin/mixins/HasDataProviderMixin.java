package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.dataproviders.GridDataProvider;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.DataProviderMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;

import javax.annotation.Nullable;

public interface HasDataProviderMixin<ITEM extends Any, E extends DataProviderMixin<ITEM>, T extends Component<E>>
		extends Component<E> {
	/**
	 * Number of items fetched at a time from the dataprovider.
	 */
	default int pageSize() {
		return getNode().getPageSize();
	}

	/**
	 * Number of items fetched at a time from the dataprovider.
	 */
	default T pageSize(int pageSize) {
		getNode().setPageSize(pageSize);
		return (T) this;
	}

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
	default GridDataProvider<ITEM> dataProvider() {
		return getNode().getDataProvider();
	}

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
	default T dataProvider(GridDataProvider<ITEM> dataProvider) {
		getNode().setDataProvider(dataProvider);
		return (T) this;
	}

	/**
	 * <code>true</code> while data is being requested from the data provider.
	 */
	default boolean loading() {
		return getNode().isLoading();
	}

	/**
	 * Path to an item sub-property that identifies the item.
	 */
	@Nullable
	default String itemIdPath() {
		return getNode().getItemIdPath();
	}

	/**
	 * Path to an item sub-property that identifies the item.
	 */
	default T itemIdPath(String itemIdPath) {
		getNode().setItemIdPath(itemIdPath);
		return (T) this;
	}

	/**
	 * An array that contains the expanded items.
	 */
	@Nullable
	default Array<ITEM> expandedItems() {
		return getNode().getExpandedItems();
	}

	/**
	 * An array that contains the expanded items.
	 */
	default T expandedItems(ITEM... expandedItems) {
		getNode().setExpandedItems(expandedItems);
		return (T) this;
	}

	default T expandedItems(Array<ITEM> expandedItems) {
		getNode().setExpandedItems(expandedItems);
		return (T) this;
	}

	/**
	 * Returns a value that identifies the item. Uses <code>itemIdPath</code> if
	 * available.
	 * Can be customized by overriding.
	 */
	default Unknown getItemId(ITEM item) {
		return getNode().getItemId(item);
	}

	/**
	 * Expands the given item tree.
	 */
	default void expandItem(ITEM item) {
		getNode().expandItem(item);
	}

	/**
	 * Collapses the given item tree.
	 */
	default void collapseItem(ITEM item) {
		getNode().collapseItem(item);
	}

	/**
	 * Clears the cached pages and reloads data from dataprovider when needed.
	 */
	default void clearCache() {
		getNode().clearCache();
	}
}
