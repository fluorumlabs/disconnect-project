package js.web.htmldraganddrop;


import js.util.collections.ArrayLike;
import js.web.dom.File;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A list of DataTransferItem objects representing items being dragged. During a drag operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList. */
public interface DataTransferItemList extends ArrayLike<DataTransferItem> {
    /**
     * Returns the number of items in the drag data store.
     */
    @JSProperty
     int getLength();

    /**
     * Adds a new entry for the given data to the drag data store. If the data is plain text then a type string has to be provided also.
     */
    @Nullable
     DataTransferItem add(String data, String type);
    @Nullable
     DataTransferItem add(File data);
    /**
     * Removes all the entries in the drag data store.
     */
     void clear();
     DataTransferItem item(int index);
    /**
     * Removes the indexth entry in the drag data store.
     */
     void remove(int index);


    @JSBody(script = "return DataTransferItemList.prototype")
    static DataTransferItemList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DataTransferItemList()")
    static DataTransferItemList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
