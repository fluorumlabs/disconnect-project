package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLOListElement;
import org.teavm.jso.JSProperty;

@Tag("ol")
public class OrderedList extends HtmlComponent<HTMLOListElement> {
    @JSProperty
    public boolean isReversed() {
        return getElement().isReversed();
    }

    @JSProperty
    public void setReversed(boolean reversed) {
        getElement().setReversed(reversed);
    }

    /**
     * The starting number.
     */
    @JSProperty
    public int getStart() {
        return getElement().getStart();
    }

    @JSProperty
    public void setStart(int start) {
        getElement().setStart(start);
    }

    @JSProperty
    public String getType() {
        return getElement().getType();
    }

    @JSProperty
    public void setType(String type) {
        getElement().setType(type);
    }
}
