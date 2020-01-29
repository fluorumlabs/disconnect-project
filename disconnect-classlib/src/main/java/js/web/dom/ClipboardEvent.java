package js.web.dom;


import js.web.htmldraganddrop.DataTransfer;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Events providing information related to modification of the clipboard, that is cut, copy, and paste events.
 */
public interface ClipboardEvent extends Event {
    @JSBody(script = "return ClipboardEvent.prototype")
    static ClipboardEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new ClipboardEvent(type, eventInitDict)")
    static ClipboardEvent create(String type, ClipboardEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new ClipboardEvent(type)")
    static ClipboardEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    DataTransfer getClipboardData();


    interface ClipboardEventInit extends EventInit {
        @JSProperty
        @Nullable
        DataTransfer getClipboardData();

        @JSProperty
        void setClipboardData(DataTransfer clipboardData);

    }
}
