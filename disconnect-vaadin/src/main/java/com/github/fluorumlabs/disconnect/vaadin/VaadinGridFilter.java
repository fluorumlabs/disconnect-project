package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridFilterElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-filter>` is a helper element for the `<vaadin-grid>` that provides out-of-the-box UI controls,
 * and handlers for filtering the grid data.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-column>
 * <template class="header">
 * <vaadin-grid-filter path="name.first"></vaadin-grid-filter>
 * </template>
 * <template>[[item.name.first]]</template>
 * </vaadin-grid-column>
 * ```
 */
public class VaadinGridFilter extends AbstractComponent<GridFilterElement>
        implements HasSlottedComponents<GridFilterElement, VaadinGridFilter, Component<? extends Element>> {
    public VaadinGridFilter() {
        super("vaadin-grid-filter");
    }

    /**
     * JS Path of the property in the item used for filtering the data.
     */
    @Nullable
    public String path() {
        return getNode().getPath();
    }

    /**
     * JS Path of the property in the item used for filtering the data.
     */
    public VaadinGridFilter path(String path) {
        getNode().setPath(path);
        return this;
    }

    /**
     * Current filter value.
     */
    @Nullable
    public String value() {
        return getNode().getValue();
    }

    /**
     * Current filter value.
     */
    public VaadinGridFilter value(String value) {
        getNode().setValue(value);
        return this;
    }

    public void focus() {
        getNode().focus();
    }

    /**
     * Fired when the `value` property changes.
     */
    public ObservableEvent<StringPropertyChangeEvent> ValueChangedEvent() {
        return createEvent("value-changed");
    }

    public VaadinGridFilter setFilter(Component<? extends Element> component) {
        return replaceSlotted("filter", component);
    }

    public VaadinGridFilter setFilter(Component<? extends Element>... components) {
        return replaceSlotted("filter", components);
    }

    public VaadinGridFilter addToFilter(Component<? extends Element> component) {
        return addSlotted("filter", component);
    }

    public VaadinGridFilter addToFilter(Component<? extends Element>... components) {
        return addSlotted("filter", components);
    }

    public VaadinGridFilter insertToFilter(Component<? extends Element> component) {
        return insertSlotted("filter", component);
    }

    public VaadinGridFilter insertToFilter(Component<? extends Element>... components) {
        return insertSlotted("filter", components);
    }

    public VaadinGridFilter clearFilter() {
        return removeAllSlotted("filter");
    }
}
