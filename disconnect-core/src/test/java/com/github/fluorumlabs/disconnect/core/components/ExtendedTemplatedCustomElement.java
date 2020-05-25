package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.DefaultSlot;
import com.github.fluorumlabs.disconnect.core.annotations.NamedSlot;
import com.github.fluorumlabs.disconnect.core.annotations.Query;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement
public class ExtendedTemplatedCustomElement extends TemplatedCustomElement {
    @Query("#test")
    private Div testDiv;

    @NamedSlot("named")
    private ComponentList<Component<?>> namedSlot;

    @DefaultSlot
    private ComponentList<Component<?>> defaultSlot;

    public Div getTestDiv() {
        return testDiv;
    }

    public ComponentList<Component<?>> getNamedSlot() {
        return namedSlot;
    }

    public ComponentList<Component<?>> getDefaultSlot() {
        return defaultSlot;
    }
}
