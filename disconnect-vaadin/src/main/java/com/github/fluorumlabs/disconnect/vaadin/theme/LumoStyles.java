package com.github.fluorumlabs.disconnect.vaadin.theme;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.polymer.CustomStyle;
import js.lang.external.vaadin.vaadin_lumo_styles.AllLumoStyles;

import static js.web.dom.Window.DOCUMENT;

/**
 * Created by Artem Godin on 6/29/2020.
 */
@CustomElement(tagName = "vaadin-lumo-styles", external = true)
public class LumoStyles extends HtmlComponent<AllLumoStyles> {
    {
        CustomStyle customStyle = new CustomStyle();
        customStyle.setInnerHTML("<style include=\"lumo-color lumo-typography\"></style>");
        DOCUMENT.getHead().appendChild(customStyle.getElement());
    }
}
