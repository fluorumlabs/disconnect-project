package js.web.htmldraganddrop;

import js.lang.Any;
import js.lang.Unknown;
import js.util.function.JsStringConsumer;
import js.web.dom.File;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** One drag data item. During a drag operation, each drag event has a dataTransfer property which contains a list of drag data items. Each item in the list is a DataTransferItem object. */
public interface DataTransferItem extends Any {
    /**
     * Returns the drag data item kind, one of: "string", "file".
     */
    @JSProperty
    String getKind();

    /**
     * Returns the drag data item type string.
     */
    @JSProperty
    String getType();

    /**
     * Returns a File object, if the drag data item kind is File.
     */
    @Nullable
    File getAsFile();
    /**
     * Invokes the callback with the string data as the argument, if the drag data item kind is Plain Unicode string.
     */
    void getAsString(JsStringConsumer callback);
    Unknown webkitGetAsEntry();

    @JSBody(script = "return DataTransferItem.prototype")
    static DataTransferItem prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DataTransferItem()")
    static DataTransferItem create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
