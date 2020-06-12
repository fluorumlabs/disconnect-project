package com.github.fluorumlabs.disconnect.core.components.html.interactive;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLDialogElement;

@Tag("dialog")
// Does not work in Safari
public class Dialog extends HtmlComponent<HTMLDialogElement> {
    public Dialog() {
        super();
    }

    public Dialog(String textContent) {
        super(textContent);
    }

    public Dialog(Component<?>... components) {
        super(components);
    }

    public boolean isOpen() {
        return getElement().isOpen();
    }

    public void setOpen(boolean open) {
        getElement().setOpen(open);
    }

    public String getReturnValue() {
        return getElement().getReturnValue();
    }

    public void setReturnValue(String returnValue) {
        getElement().setReturnValue(returnValue);
    }

    public void close(String returnValue) {
        getElement().close(returnValue);
    }

    public void close() {
        getElement().close();
    }

    public void show() {
        getElement().show();
    }

    public void showModal() {
        getElement().showModal();
    }
}
