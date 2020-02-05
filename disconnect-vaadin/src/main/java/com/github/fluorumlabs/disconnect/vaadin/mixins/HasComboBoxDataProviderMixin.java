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
	 * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
	 *
	 * <code>params.page</code> Requested page index
	 *
	 * <code>params.pageSize</code> Current page size
	 *
	 * <code>params.filter</code> Currently applied filter
	 *
	 * <code>callback(items, size)</code> Callback function with arguments:
	 *
	 * <ul>
	 * <li><code>items</code> Current page of items</li>
	 * <li><code>size</code> Total number of items.</li>
	 * </ul>
	 */
	@Nullable
	default ComboBoxDataProvider<ITEM> dataProvider() {
		return getNode().getDataProvider();
	}

	/**
	 * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
	 *
	 * <code>params.page</code> Requested page index
	 *
	 * <code>params.pageSize</code> Current page size
	 *
	 * <code>params.filter</code> Currently applied filter
	 *
	 * <code>callback(items, size)</code> Callback function with arguments:
	 *
	 * <ul>
	 * <li><code>items</code> Current page of items</li>
	 * <li><code>size</code> Total number of items.</li>
	 * </ul>
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
