package com.github.fluorumlabs.disconnect.vaadin.materialstyles;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.polymer.CustomStyle;
import js.lang.external.vaadin.materialstyles.MaterialStylesElement;

import static js.web.dom.Window.DOCUMENT;

/**
 */
@CustomElement(tagName = "vaadin-material-styles", external = true)
public class MaterialStyles extends HtmlComponent<MaterialStylesElement> {

    public MaterialStyles() {
        CustomStyle customStyle = new CustomStyle();
        customStyle.setInnerHTML("<style include=\"material-color-light material-typography\"></style>");
        DOCUMENT.getHead().appendChild(customStyle.getElement());
    }
}
