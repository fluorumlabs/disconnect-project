package com.github.fluorumlabs.disconnect.core.components.html.webcomponent;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import js.lang.Any;
import js.web.webcomponents.AssignedNodesOptions;
import js.web.webcomponents.HTMLSlotElement;

@Tag("slot")
public class Slot extends HtmlComponent<HTMLSlotElement> {
    public Slot() {
        super();
    }

    public Slot(String textContent) {
        super(textContent);
    }

    public Slot(Component<?>... components) {
        super(components);
    }

    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    public ComponentList<Component<?>> assignedElements(boolean flatten) {
        AssignedNodesOptions options = Any.empty();
        options.setFlatten(flatten);
        return  new ArrayLikeBackedComponentList<>(getElement().assignedElements());
    }

    public ComponentList<Component<?>> assignedElements() {
        return assignedElements(false);
    }
}
