package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.SortDirection;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridSorterElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * `<vaadin-grid-sorter>` is a helper element for the `<vaadin-grid>` that provides out-of-the-box UI controls,
 * visual feedback, and handlers for sorting the grid data.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid-column>
 * <template class="header">
 * <vaadin-grid-sorter path="name.first">First name</vaadin-grid-sorter>
 * </template>
 * <template>[[item.name.first]]</template>
 * </vaadin-grid-column>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `content` | The slotted content wrapper
 * `indicators` | The internal sorter indicators.
 * `order` | The internal sorter order
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `direction` | Sort direction of a sorter | :host
 */
public class VaadinGridSorter extends AbstractComponent<GridSorterElement>
        implements HasComponents<GridSorterElement, VaadinGridSorter, Component<?>> {
    public VaadinGridSorter() {
        super("vaadin-grid-sorter");
    }

    /**
     * JS Path of the property in the item used for sorting the data.
     */
    @Nullable
    public String path() {
        return getNode().getPath();
    }

    /**
     * JS Path of the property in the item used for sorting the data.
     */
    public VaadinGridSorter path(String path) {
        getNode().setPath(path);
        return this;
    }

    /**
     * How to sort the data.
     * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
     * descending direction, or `null` for not sorting the data.
     */
    @Nullable
    public SortDirection direction() {
        return getNode().getDirection();
    }

    /**
     * How to sort the data.
     * Possible values are `asc` to use an ascending algorithm, `desc` to sort the data in
     * descending direction, or `null` for not sorting the data.
     */
    public VaadinGridSorter direction(SortDirection direction) {
        getNode().setDirection(direction);
        return this;
    }

    /**
     * Fired when the `direction` property changes.
     */
    public ObservableEvent<PropertyChangeEvent<SortDirection>> directionChangedEvent() {
        return createEvent("direction-changed");
    }
}
