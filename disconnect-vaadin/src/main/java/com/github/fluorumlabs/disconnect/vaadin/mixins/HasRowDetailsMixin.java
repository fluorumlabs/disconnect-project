package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.RowDetailsMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.RowDetailsRenderer;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.util.collections.Array;

import javax.annotation.Nullable;

public interface HasRowDetailsMixin<ITEM extends Any, E extends RowDetailsMixin<ITEM>, T extends Component<E>>
        extends Component<E> {
    /**
     * An array containing references to items with open row details.
     */
    @Nullable
    default Array<ITEM> detailsOpenedItems() {
        return getNode().getDetailsOpenedItems();
    }

    /**
     * An array containing references to items with open row details.
     */
    default T detailsOpenedItems(ITEM... detailsOpenedItems) {
        getNode().setDetailsOpenedItems(detailsOpenedItems);
        return (T) this;
    }

    default T detailsOpenedItems(Array<ITEM> detailsOpenedItems) {
        getNode().setDetailsOpenedItems(detailsOpenedItems);
        return (T) this;
    }

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
    default RowDetailsRenderer<ITEM> rowDetailsRenderer() {
        return getNode().getRowDetailsRenderer();
    }

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
    default T rowDetailsRenderer(RowDetailsRenderer<ITEM> rowDetailsRenderer) {
        getNode().setRowDetailsRenderer(rowDetailsRenderer);
        return (T) this;
    }

    /**
     * Open the details row of a given item.
     */
    default void openItemDetails(ITEM item) {
        getNode().openItemDetails(item);
    }

    /**
     * Close the details row of a given item.
     */
    default void closeItemDetails(ITEM item) {
        getNode().closeItemDetails(item);
    }
}
