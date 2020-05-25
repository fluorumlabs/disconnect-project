package com.github.fluorumlabs.disconnect.zero.component.html.webcomponent;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import com.github.fluorumlabs.disconnect.zero.container.ParentNodeBackedComponentList;
import js.web.webcomponents.HTMLTemplateElement;


@Tag("template")
public class Template extends HtmlComponent<HTMLTemplateElement> {
    public ComponentList<Component<?>> getContent() {
        return new ParentNodeBackedComponentList<>(getElement().getContent());
    }

}
