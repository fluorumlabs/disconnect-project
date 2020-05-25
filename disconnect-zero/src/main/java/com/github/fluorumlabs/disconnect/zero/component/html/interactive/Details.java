package com.github.fluorumlabs.disconnect.zero.component.html.interactive;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.HTMLDetailsElement;
import js.web.dom.HTMLElement;

@Tag("details")
public class Details extends HtmlComponent<HTMLDetailsElement> {
    public boolean isOpen() {
        return getElement().isOpen();
    }

    public void setOpen(boolean open) {
        getElement().setOpen(open);
    }

    @Tag("summary")
    public static class Summary extends HtmlComponent<HTMLElement> {
    }
}
