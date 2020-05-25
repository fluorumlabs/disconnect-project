package com.github.fluorumlabs.disconnect.zero.component.html.table;

import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.HTMLTableCellElement;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class HtmlTableCellComponent<X extends HTMLTableCellElement> extends HtmlComponent<X> {
    protected HtmlTableCellComponent(){}

    /**
     * Sets or retrieves abbreviated text for the object.
     */
    public String getAbbr() {
        return getElement().getAbbr();
    }

    public void setAbbr(String abbr) {
        getElement().setAbbr(abbr);
    }

    /**
     * Retrieves the position of the object in the cells collection of a row.
     */
    public int getCellIndex() {
        return getElement().getCellIndex();
    }

    /**
     * Sets or retrieves the number columns in the table that the object should span.
     */
    public int getColSpan() {
        return getElement().getColSpan();
    }

    public void setColSpan(int colSpan) {
        getElement().setColSpan(colSpan);
    }

    /**
     * Sets or retrieves a list of header cells that provide information for the object.
     */
    public String getHeaders() {
        return getElement().getHeaders();
    }

    public void setHeaders(String headers) {
        getElement().setHeaders(headers);
    }

    /**
     * Sets or retrieves how many rows in a table the cell should span.
     */
    public int getRowSpan() {
        return getElement().getRowSpan();
    }

    public void setRowSpan(int rowSpan) {
        getElement().setRowSpan(rowSpan);
    }

    /**
     * Sets or retrieves the group of cells in a table to which the object's information applies.
     */
    public String getScope() {
        return getElement().getScope();
    }

    public void setScope(String scope) {
        getElement().setScope(scope);
    }
}
