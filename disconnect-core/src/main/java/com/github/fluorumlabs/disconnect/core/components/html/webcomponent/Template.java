package com.github.fluorumlabs.disconnect.core.components.html.webcomponent;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import js.web.webcomponents.HTMLTemplateElement;


@Tag("template")
public class Template extends HtmlComponent<HTMLTemplateElement> {
    public Template() {
        super();
    }

    public Template(String textContent) {
        super(textContent);
    }

    public Template(Component<?>... components) {
        super(components);
    }

    public ComponentList<Component<?>> getContent() {
        return new ParentNodeBackedComponentList<>(getElement().getContent());
    }

}
