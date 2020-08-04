package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.grid.GridSorterElement;
import js.web.dom.Event;

import javax.annotation.Nullable;
import java.io.Serializable;

/**
 * <code>&lt;vaadin-grid-sorter&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides out-of-the-box UI controls, visual feedback, and handlers for sorting the grid data.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *    &lt;template class="header"&gt;
 *      &lt;vaadin-grid-sorter path="name.first"&gt;First name&lt;/vaadin-grid-sorter&gt;
 *    &lt;/template&gt;
 *    &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>content</code></td>
 *    <td>The slotted content wrapper</td>
 *   </tr>
 *   <tr>
 *    <td><code>indicators</code></td>
 *    <td>The internal sorter indicators.</td>
 *   </tr>
 *   <tr>
 *    <td><code>order</code></td>
 *    <td>The internal sorter order</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>direction</code></td>
 *    <td>Sort direction of a sorter</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ThemableMixin, DirMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-sorter", external = true)
public class GridSorter<T extends Serializable> extends HtmlComponentWithItem<T, GridSorterElement<Mirrored<T>>> implements Themable<GridSorterElement<Mirrored<T>>> {

    public GridSorter() {
    }

    public GridSorter(String textContent) {
        super(textContent);
    }

    public GridSorter(Component<?>... components) {
        super(components);
    }

    public GridSorter(Class<T> tClass) {
        super(tClass);
    }

    public GridSorter(Class<T> tClass, String textContent) {
        super(tClass, textContent);
    }

    public GridSorter(Class<T> tClass, Component<?>... components) {
        super(tClass, components);
    }

    // !wca! get direction: GridSorterDirection | undefined
    /**
     * How to sort the data.
     * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
     * descending direction, or <code>null</code> for not sorting the data.
     */
    @Nullable
    public SortDirection getDirection() {
        if (getElement().getDirection() == null) {
            return SortDirection.NONE;
        } else {
            return LowerCase.parse(SortDirection.class, getElement().getDirection());
        }
    }

    // !wca! set direction: GridSorterDirection | undefined
    /**
     * How to sort the data.
     * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
     * descending direction, or <code>null</code> for not sorting the data.
     */
    public void setDirection(@Nullable SortDirection value) {
        if (value == SortDirection.NONE) {
            getElement().setDirection(null);
        } else {
            getElement().setDirection(LowerCase.of(value));
        }
    }

    // !wca! observe direction: GridSorterDirection | undefined
    /**
     * How to sort the data.
     * Possible values are <code>asc</code> to use an ascending algorithm, <code>desc</code> to sort the data in
     * descending direction, or <code>null</code> for not sorting the data.
     */
    public ObservableValue<SortDirection> direction() {
        return createObservableValue(this::getDirection, this::setDirection, "direction-changed");
    }

    // !wca! get path: string
    /**
     * JS Path of the property in the item used for sorting the data.
     */
    public String getPath() {
        return getElement().getPath();
    }

    // !wca! set path: string
    /**
     * JS Path of the property in the item used for sorting the data.
     */
    public void setPath(String value) {
        getElement().setPath(value);
    }

    // !wca! observe path: string

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! event sorter-changed: ?
    public ObservableEvent<Event> sorterChangedEvent() {
        return createEvent("sorter-changed");
    }
}
