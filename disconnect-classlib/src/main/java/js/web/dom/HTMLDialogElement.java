package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface HTMLDialogElement extends HTMLElement {
    @JSBody(script = "return HTMLDialogElement.prototype")
    static HTMLDialogElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDialogElement()")
    static HTMLDialogElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isOpen();

    @JSProperty
    void setOpen(boolean open);

    @JSProperty
    String getReturnValue();

    @JSProperty
    void setReturnValue(String returnValue);

    void close(String returnValue);

    void close();

    void show();

    void showModal();

}
