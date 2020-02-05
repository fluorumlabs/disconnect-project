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
    @JSProperty
    ComboBoxDataProvider<ITEM> getDataProvider();

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
    @JSProperty
    void setDataProvider(ComboBoxDataProvider<ITEM> dataProvider);

    /**
     * Clears the cached pages and reloads data from dataprovider when needed.
     */
    void clearCache();
}