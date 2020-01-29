package js.web.htmldraganddrop;


import js.web.dom.MouseEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** A DOM event that represents a drag and drop interaction. The user initiates a drag by placing a pointer device (such as a mouse) on the touch surface and then dragging the pointer to a new location (such as another DOM element). Applications are free to interpret a drag and drop interaction in an application-specific way. */
public interface DragEvent extends MouseEvent {
    /**
     * Returns the DataTransfer object for the event.
     */
    @JSProperty
    @Nullable
    DataTransfer getDataTransfer();

    @JSBody(script = "return DragEvent.prototype")
    static DragEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new DragEvent(type, eventInitDict)")
    static DragEvent create(String type, DragEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new DragEvent(type)")
    static DragEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }



    interface DragEventInit extends MouseEventInit {
        @JSProperty
        @Nullable
        DataTransfer getDataTransfer();

        @JSProperty
        void setDataTransfer(DataTransfer dataTransfer);

    }
}
