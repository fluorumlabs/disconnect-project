package js.lang.external.vaadin.grid;

import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid-filter.js")
public interface GridFilterElement extends HTMLElement {

    // !wca! focus: (): void

    // !wca! get path: string
    /**
     * JS Path of the property in the item used for filtering the data.
     */
    @JSProperty("path")
    String getPath();

    // !wca! set path: string
    /**
     * JS Path of the property in the item used for filtering the data.
     */
    @JSProperty("path")
    void setPath(String value);

    // !wca! get value: string
    /**
     * Current filter value.
     */
    @JSProperty("value")
    String getValue();

    // !wca! set value: string
    /**
     * Current filter value.
     */
    @JSProperty("value")
    void setValue(String value);
}
