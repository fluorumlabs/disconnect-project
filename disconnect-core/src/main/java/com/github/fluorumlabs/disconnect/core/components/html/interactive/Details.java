package com.github.fluorumlabs.disconnect.core.components.html.interactive;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLDetailsElement;
import js.web.dom.HTMLElement;

@Tag("details")
public class Details extends HtmlComponent<HTMLDetailsElement> {
    public Details() {
        super();
    }

    public Details(String textContent) {
        super(textContent);
    }

    public Details(Component<?>... components) {
        super(components);
    }

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
