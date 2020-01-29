package js.web.htmldraganddrop;

import js.lang.Any;
import js.web.dom.Element;
import js.web.dom.FileList;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used to hold the data that is being dragged during a drag and drop operation. It may hold one or more data items, each of one or more data types. For more information about drag and drop, see HTML Drag and Drop API.
 */
public interface DataTransfer extends Any {
    @JSBody(script = "return DataTransfer.prototype")
    static DataTransfer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DataTransfer()")
    static DataTransfer create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the kind of operation that is currently selected. If the kind of operation isn't one of those that is allowed by the effectAllowed attribute, then the operation will fail.
     * <p>
     * Can be set, to change the selected operation.
     * <p>
     * The possible values are "none", "copy", "link", and "move".
     */
    @JSProperty
    String getDropEffect();

    @JSProperty
    void setDropEffect(String dropEffect);

    /**
     * Returns the kinds of operations that are to be allowed.
     * <p>
     * Can be set (during the dragstart event), to change the allowed operations.
     * <p>
     * The possible values are "none", "copy", "copyLink", "copyMove", "link", "linkMove", "move", "all", and "uninitialized",
     */
    @JSProperty
    String getEffectAllowed();

    @JSProperty
    void setEffectAllowed(String effectAllowed);

    /**
     * Returns a FileList of the files being dragged, if any.
     */
    @JSProperty
    FileList getFiles();

    /**
     * Returns a DataTransferItemList object, with the drag data.
     */
    @JSProperty
    DataTransferItemList getItems();

    /**
     * Returns a frozen array listing the formats that were set in the dragstart event. In addition, if any files are being dragged, then one of the types will be the string "Files".
     */
    @JSProperty
    String[] getTypes();

    /**
     * Removes the data of the specified formats. Removes all data if the argument is omitted.
     */
    void clearData(String format);

    void clearData();

    /**
     * Returns the specified data. If there is no such data, returns the empty string.
     */
    String getData(String format);

    /**
     * Adds the specified data.
     */
    void setData(String format, String data);

    /**
     * Uses the given element to update the drag feedback, replacing any previously specified feedback.
     */
    void setDragImage(Element image, double x, double y);

}
