package com.github.fluorumlabs.disconnect.zero.component.html.webcomponent;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.container.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;
import js.lang.Any;
import js.web.webcomponents.AssignedNodesOptions;
import js.web.webcomponents.HTMLSlotElement;

@Tag("slot")
public class Slot extends HtmlComponent<HTMLSlotElement> {
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
