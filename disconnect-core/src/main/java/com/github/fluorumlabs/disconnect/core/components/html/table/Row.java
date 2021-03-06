package com.github.fluorumlabs.disconnect.core.components.html.table;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.web.dom.HTMLTableCellElement;
import js.web.dom.HTMLTableDataCellElement;
import js.web.dom.HTMLTableHeaderCellElement;
import js.web.dom.HTMLTableRowElement;


@Tag("tr")
public class Row extends HtmlComponent<HTMLTableRowElement> {
    public Row() {
        super();
    }

    public Row(Component<?>... components) {
        super(components);
    }

    /**
     * Retrieves a collection of all cells in the table row.
     */
    public ComponentList<HtmlTableCellComponent<HTMLTableCellElement>> getCells() {
        return  new ArrayLikeBackedComponentList<>(getElement().getCells().cast());
    }

    /**
     * Retrieves the position of the object in the rows collection for the table.
     */
    public int getRowIndex() {
        return getElement().getRowIndex();
    }

    /**
     * Retrieves the position of the object in the collection.
     */
    public int getSectionRowIndex() {
        return getElement().getSectionRowIndex();
    }

    /**
     * Removes the specified cell from the table row, as well as from the cells collection.
     *
     * @param index Number that specifies the zero-based position of the cell to remove from the table row. If no value is provided, the last cell in the cells collection is deleted.
     */
    public void deleteCell(int index) {
        getElement().deleteCell(index);
    }

    /**
     * Creates a new cell in the table row, and adds the cell to the cells collection.
     *
     * @param index Number that specifies where to insert the cell in the tr. The default value is -1, which appends the new cell to the end of the cells collection.
     */
    public <C extends HtmlTableCellComponent<?>> C insertCell(int index) {
        return TagRegistry.recover(getElement().insertCell(index));
    }

    public <C extends HtmlTableCellComponent<?>> C appendCell() {
        return TagRegistry.recover(getElement().insertCell());
    }

    @Tag("td")
    public static class DataCell extends HtmlTableCellComponent<HTMLTableDataCellElement> {
        public DataCell(String textContent) {
            super(textContent);
        }

        public DataCell(Component<?>... components) {
            super(components);
        }

        public DataCell() {
            super();
        }
    }

    @Tag("th")
    public static class HeaderCell extends HtmlTableCellComponent<HTMLTableHeaderCellElement> {
        public HeaderCell(String textContent) {
            super(textContent);
        }

        public HeaderCell(Component<?>... components) {
            super(components);
        }

        public HeaderCell() {
            super();
        }

        public String getScope() {
            return getElement().getScope();
        }

        public void setScope(String scope) {
            getElement().setScope(scope);
        }
    }

}


