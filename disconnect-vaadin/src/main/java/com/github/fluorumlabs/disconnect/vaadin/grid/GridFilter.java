package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import js.lang.external.vaadin.grid.GridFilterElement;
import js.web.dom.Event;

/**
 * <code>&lt;vaadin-grid-filter&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides out-of-the-box UI controls, and handlers for filtering the grid data.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *    &lt;template class="header"&gt;
 *      &lt;vaadin-grid-filter path="name.first"&gt;&lt;/vaadin-grid-filter&gt;
 *    &lt;/template&gt;
 *    &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 * <strong>Mixins:</strong> ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-filter", external = true)
public class GridFilter extends HtmlComponent<GridFilterElement> {

    public GridFilter() {
    }

    public GridFilter(String textContent) {
        super(textContent);
    }

    public GridFilter(Component<?>... components) {
        super(components);
    }

    // !wca! focus: (): void

    // !wca! get path: string
    /**
     * JS Path of the property in the item used for filtering the data.
     */
    public String getPath() {
        return getElement().getPath();
    }

    // !wca! set path: string
    /**
     * JS Path of the property in the item used for filtering the data.
     */
    public void setPath(String value) {
        getElement().setPath(value);
    }

    // !wca! observe path: string

    // !wca! get value: string
    /**
     * Current filter value.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * Current filter value.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * Current filter value.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event filter-changed: ?
    public ObservableEvent<Event> filterChangedEvent() {
        return createEvent("filter-changed");
    }
}
