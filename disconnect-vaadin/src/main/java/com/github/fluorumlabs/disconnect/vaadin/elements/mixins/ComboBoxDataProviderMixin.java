package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.dataproviders.ComboBoxDataProvider;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ComboBoxDataProviderMixin",
		module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-data-provider-mixin.js"
)
public interface ComboBoxDataProviderMixin<ITEM extends Any> extends Element {
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
	 * Total number of items.
	 */
	@JSProperty
	int getSize();

	/**
	 * Total number of items.
	 */
	@JSProperty
	void setSize(int size);

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
	@JSProperty
	ComboBoxDataProvider<ITEM> getDataProvider();

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
	@JSProperty
	void setDataProvider(ComboBoxDataProvider<ITEM> dataProvider);

	/**
	 * Clears the cached pages and reloads data from dataprovider when needed.
	 */
	void clearCache();
}
