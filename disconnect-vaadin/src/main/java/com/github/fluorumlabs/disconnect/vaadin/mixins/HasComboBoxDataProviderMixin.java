package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.dataproviders.ComboBoxDataProvider;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ComboBoxDataProviderMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;

import javax.annotation.Nullable;

public interface HasComboBoxDataProviderMixin<ITEM extends Any, E extends ComboBoxDataProviderMixin<ITEM>,
		T extends Component<E>>
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
	 * Total number of items.
	 */
	default int size() {
		return getNode().getSize();
	}

	/**
	 * Total number of items.
	 */
	default T size(int size) {
		getNode().setSize(size);
		return (T) this;
	}

	/**
	 * Function that provides items lazily. Receives arguments `params`, `callback`
	 * <p>
	 * `params.page` Requested page index
	 * <p>
	 * `params.pageSize` Current page size
	 * <p>
	 * `params.filter` Currently applied filter
	 * <p>
	 * `callback(items, size)` Callback function with arguments:
	 * - `items` Current page of items
	 * - `size` Total number of items.
	 */
	@Nullable
	default ComboBoxDataProvider<ITEM> dataProvider() {
		return getNode().getDataProvider();
	}

	/**
	 * Function that provides items lazily. Receives arguments `params`, `callback`
	 * <p>
	 * `params.page` Requested page index
	 * <p>
	 * `params.pageSize` Current page size
	 * <p>
	 * `params.filter` Currently applied filter
	 * <p>
	 * `callback(items, size)` Callback function with arguments:
	 * - `items` Current page of items
	 * - `size` Total number of items.
	 */
	default T dataProvider(ComboBoxDataProvider<ITEM> dataProvider) {
		getNode().setDataProvider(dataProvider);
		return (T) this;
	}

	/**
	 * Clears the cached pages and reloads data from dataprovider when needed.
	 */
	default void clearCache() {
		getNode().clearCache();
	}
}
