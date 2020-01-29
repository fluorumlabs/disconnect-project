package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document.
 */
public interface HTMLTableElement extends HTMLElement {
    @JSBody(script = "return HTMLTableElement.prototype")
    static HTMLTableElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTableElement()")
    static HTMLTableElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves a value that indicates the table alignment.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    @Deprecated
    @JSProperty
    String getBgColor();

    @JSProperty
    void setBgColor(String bgColor);

    /**
     * Sets or retrieves the width of the border to draw around the object.
     */
    @Deprecated
    @JSProperty
    String getBorder();

    @JSProperty
    void setBorder(String border);

    /**
     * Retrieves the caption object of a table.
     */
    @JSProperty
    @Nullable
    HTMLTableCaptionElement getCaption();

    @JSProperty
    void setCaption(HTMLTableCaptionElement caption);

    /**
     * Sets or retrieves the amount of space between the border of the cell and the content of the cell.
     */
    @Deprecated
    @JSProperty
    String getCellPadding();

    @JSProperty
    void setCellPadding(String cellPadding);

    /**
     * Sets or retrieves the amount of space between cells in a table.
     */
    @Deprecated
    @JSProperty
    String getCellSpacing();

    @JSProperty
    void setCellSpacing(String cellSpacing);

    /**
     * Sets or retrieves the way the border frame around the table is displayed.
     */
    @Deprecated
    @JSProperty
    String getFrame();

    @JSProperty
    void setFrame(String frame);

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    @JSProperty
    HTMLCollectionOf<HTMLTableRowElement> getRows();

    /**
     * Sets or retrieves which dividing lines (inner borders) are displayed.
     */
    @Deprecated
    @JSProperty
    String getRules();

    @JSProperty
    void setRules(String rules);

    /**
     * Sets or retrieves a description and/or structure of the object.
     */
    @Deprecated
    @JSProperty
    String getSummary();

    @JSProperty
    void setSummary(String summary);

    /**
     * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
     */
    @JSProperty
    HTMLCollectionOf<HTMLTableSectionElement> getTBodies();

    /**
     * Retrieves the tFoot object of the table.
     */
    @JSProperty
    @Nullable
    HTMLTableSectionElement getTFoot();

    @JSProperty
    void setTFoot(HTMLTableSectionElement tFoot);

    /**
     * Retrieves the tHead object of the table.
     */
    @JSProperty
    @Nullable
    HTMLTableSectionElement getTHead();

    @JSProperty
    void setTHead(HTMLTableSectionElement tHead);

    /**
     * Sets or retrieves the width of the object.
     */
    @Deprecated
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    /**
     * Creates an empty caption element in the table.
     */
    HTMLTableCaptionElement createCaption();

    /**
     * Creates an empty tBody element in the table.
     */
    HTMLTableSectionElement createTBody();

    /**
     * Creates an empty tFoot element in the table.
     */
    HTMLTableSectionElement createTFoot();

    /**
     * Returns the tHead element object if successful, or null otherwise.
     */
    HTMLTableSectionElement createTHead();

    /**
     * Deletes the caption element and its contents from the table.
     */
    void deleteCaption();

    /**
     * Removes the specified row (tr) from the element and from the rows collection.
     *
     * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
     */
    void deleteRow(int index);

    /**
     * Deletes the tFoot element and its contents from the table.
     */
    void deleteTFoot();

    /**
     * Deletes the tHead element and its contents from the table.
     */
    void deleteTHead();

    /**
     * Creates a new row (tr) in the table, and adds the row to the rows collection.
     *
     * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
     */
    HTMLTableRowElement insertRow(int index);

    HTMLTableRowElement insertRow();

}
