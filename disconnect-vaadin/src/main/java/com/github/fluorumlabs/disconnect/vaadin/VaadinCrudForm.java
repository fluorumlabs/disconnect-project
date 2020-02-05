package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.CrudFormElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasIncludedMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Any;

import javax.annotation.Nullable;

/**
 * `<vaadin-crud-form>` is a <vaadin-form-layout> which automatically can configures all its items based
 * on the JSON structure of the first item set.
 * <p>
 * You cannot manually configure fields but you can still style the layout as it's described in
 * `<vaadin-form-layout>` [Documentation](https://vaadin.com/components/vaadin-form-layout/html-api/elements/Vaadin
 * .FormLayoutElement)
 */
public class VaadinCrudForm<ITEM extends Any> extends AbstractComponent<CrudFormElement<ITEM>>
        implements HasIncludedMixin<CrudFormElement<ITEM>, VaadinCrudForm<ITEM>>,
        HasComponents<CrudFormElement<ITEM>, VaadinCrudForm<ITEM>, Component<?>> {
    public VaadinCrudForm() {
        super("vaadin-crud-form");
    }

    /**
     * The item being edited.
     */
    @Nullable
    public ITEM item() {
        return getNode().getItem();
    }

    /**
     * The item being edited.
     */
    public VaadinCrudForm<ITEM> item(ITEM item) {
        getNode().setItem(item);
        return this;
    }
}
