package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

/**
 * A mixin providing `focused`, `focus-ring`, `active`, `disabled` and `selected`.
 * <p>
 * `focused`, `active` and `focus-ring` are set as only as attributes.
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "ItemMixin",
        module = "@vaadin/vaadin-item/src/vaadin-item-mixin.js"
)
public interface ItemMixin extends Element {
    /**
     *
     */
    @JSProperty
    String getValue();

    /**
     *
     */
    @JSProperty
    void setValue(String value);

    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty
    boolean isDisabled();

    /**
     * If true, the user cannot interact with this element.
     */
    @JSProperty
    void setDisabled(boolean disabled);

    /**
     * If true, the item is in selected state.
     */
    @JSProperty
    boolean isSelected();

    /**
     * If true, the item is in selected state.
     */
    @JSProperty
    void setSelected(boolean selected);
}
