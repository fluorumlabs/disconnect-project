package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.EventContextMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.EventContextData;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.lang.Any;
import js.web.dom.Event;

public interface HasEventContextMixin<ITEM extends Any, E extends EventContextMixin<ITEM>, T extends Component<E>>
        extends Component<E> {
    /**
     * Returns an object with context information about the event target:
     * - `item`: the data object corresponding to the targeted row (not specified when targeting header or footer)
     * - `column`: the column element corresponding to the targeted cell (not specified when targeting row details)
     * - `section`: whether the event targeted the body, header, footer or details of the grid
     * <p>
     * These additional properties are included when `item` is specified:
     * - `index`: the index of the item
     * - `selected`: the selected state of the item
     * - `detailsOpened`: whether the row details are open for the item
     * - `expanded`: the expanded state of the tree toggle
     * - `level`: the tree hierarchy level
     * <p>
     * The returned object is populated only when a grid cell, header, footer or row details is found in `event
     * .composedPath()`.
     * This means mostly mouse and keyboard events. If such a grid part is not found in the path, an empty object is
     * returned.
     * This may be the case eg. if the event is fired on the `<vaadin-grid>` element and not any deeper in the DOM,
     * or if
     * the event targets the empty part of the grid body.
     *
     * @param event
     */
    default EventContextData<ITEM> getEventContext(Event event) {
        return getNode().getEventContext(event);
    }
}
