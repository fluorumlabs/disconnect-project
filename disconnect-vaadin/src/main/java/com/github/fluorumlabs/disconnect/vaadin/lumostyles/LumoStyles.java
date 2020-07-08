package com.github.fluorumlabs.disconnect.vaadin.lumostyles;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.polymer.CustomStyle;
import js.lang.external.vaadin.lumostyles.LumoStylesElement;

import static js.web.dom.Window.DOCUMENT;

/**
 */
@CustomElement(tagName = "vaadin-lumo-styles", external = true)
public class LumoStyles extends HtmlComponent<LumoStylesElement> {

    public LumoStyles() {
        CustomStyle customStyle = new CustomStyle();
        customStyle.setInnerHTML("<style include=\"lumo-color lumo-typography\"></style>");
        DOCUMENT.getHead().appendChild(customStyle.getElement());
    }

}
