package com.github.fluorumlabs.disconnect.core.components.html.table;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.web.dom.HTMLTableSectionElement;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class HtmlTableSectionComponent extends HtmlComponent<HTMLTableSectionElement> {
    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    public ComponentList<Row> getRows() {
        return  new ArrayLikeBackedComponentList<>(getElement().getRows());
    }

    /**
     * Removes the specified row (tr) from the element and from the rows collection.
     *
     * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
     */
    public void deleteRow(int index) {
        getElement().deleteRow(index);
    }

    /**
     * Creates a new row (tr) in the table, and adds the row to the rows collection.
     *
     * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
     */
    public Row insertRow(int index) {
        return TagRegistry.recover(getElement().insertRow(index));
    }

    public Row appendRow() {
        return TagRegistry.recover(getElement().insertRow());
    }
}
