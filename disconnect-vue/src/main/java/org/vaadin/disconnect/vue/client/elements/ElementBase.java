package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSObjects;
import org.teavm.jso.core.JSString;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinitionAccessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface ElementBase {
    ElementData data();
    ElementChildren children();
    void setParentElement(ElementBase parent);
    void markAsDirty();
}
