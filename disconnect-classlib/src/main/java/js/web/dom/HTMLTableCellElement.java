package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header or data cells, in an HTML document. */
public interface HTMLTableCellElement extends HTMLElement {
    /**
     * Sets or retrieves abbreviated text for the object.
     */
    @JSProperty
    String getAbbr();

    @JSProperty
    void setAbbr(String abbr);

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    /**
     * Sets or retrieves a comma-delimited list of conceptual categories associated with the object.
     */
    @Deprecated
    @JSProperty
    String getAxis();

    @JSProperty
    void setAxis(String axis);

    @Deprecated
    @JSProperty
    String getBgColor();

    @JSProperty
    void setBgColor(String bgColor);

    /**
     * Retrieves the position of the object in the cells collection of a row.
     */
    @JSProperty
    double getCellIndex();

    @Deprecated
    @JSProperty
    String getCh();

    @JSProperty
    void setCh(String ch);

    @Deprecated
    @JSProperty
    String getChOff();

    @JSProperty
    void setChOff(String chOff);

    /**
     * Sets or retrieves the number columns in the table that the object should span.
     */
    @JSProperty
    double getColSpan();

    @JSProperty
    void setColSpan(double colSpan);

    /**
     * Sets or retrieves a list of header cells that provide information for the object.
     */
    @JSProperty
    String getHeaders();

    @JSProperty
    void setHeaders(String headers);

    /**
     * Sets or retrieves the height of the object.
     */
    @Deprecated
    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    /**
     * Sets or retrieves whether the browser automatically performs wordwrap.
     */
    @Deprecated
    @JSProperty
    boolean isNoWrap();

    @JSProperty
    void setNoWrap(boolean noWrap);

    /**
     * Sets or retrieves how many rows in a table the cell should span.
     */
    @JSProperty
    double getRowSpan();

    @JSProperty
    void setRowSpan(double rowSpan);

    /**
     * Sets or retrieves the group of cells in a table to which the object's information applies.
     */
    @JSProperty
    String getScope();

    @JSProperty
    void setScope(String scope);

    @Deprecated
    @JSProperty
    String getVAlign();

    @JSProperty
    void setVAlign(String vAlign);

    /**
     * Sets or retrieves the width of the object.
     */
    @Deprecated
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    @JSBody(script = "return HTMLTableCellElement.prototype")
    static HTMLTableCellElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTableCellElement()")
    static HTMLTableCellElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
