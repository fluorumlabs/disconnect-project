package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.zero.annotations.DefaultSlot;
import com.github.fluorumlabs.disconnect.zero.annotations.NamedSlot;
import com.github.fluorumlabs.disconnect.zero.annotations.Query;
import com.github.fluorumlabs.disconnect.zero.component.html.text.block.Div;
import com.github.fluorumlabs.disconnect.zero.container.ComponentList;

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
