package com.github.fluorumlabs.disconnect.vaadin.formlayout;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.formlayout.FormLayoutElement;
import js.lang.external.vaadin.formlayout.FormLayoutResponsiveStep;
import js.util.collections.Array;

/**
 * <code>&lt;vaadin-form-layout&gt;</code> is a Web Component providing configurable responsive layout for form elements.
 *
 * <pre><code class="language-html">&lt;vaadin-form-layout&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;First Name&lt;/label&gt;
 *      &lt;input class="full-width" value="Jane"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;Last Name&lt;/label&gt;
 *      &lt;input class="full-width" value="Doe"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;Email&lt;/label&gt;
 *      &lt;input class="full-width" value="jane.doe@example.com"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 * &lt;/vaadin-form-layout&gt;
 * </code></pre>
 * It supports any child elements as layout items.
 *
 * By default, it makes a layout of two columns if the element width is equal or wider than 40em, and a single column layout otherwise.
 *
 * The number of columns and the responsive behavior are customizable with the <code>responsiveSteps</code> property.
 *
 * <h3>Spanning Items on Multiple Columns</h3>
 * You can use <code>colspan</code> attribute on the items. In the example below, the first text field spans on two columns:
 *
 * <pre><code class="language-html">&lt;vaadin-form-layout&gt;
 *
 *    &lt;vaadin-form-item colspan="2"&gt;
 *      &lt;label slot="label"&gt;Address&lt;/label&gt;
 *      &lt;input class="full-width"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;First Name&lt;/label&gt;
 *      &lt;input class="full-width" value="Jane"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;Last Name&lt;/label&gt;
 *      &lt;input class="full-width" value="Doe"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 * &lt;/vaadin-form-layout&gt;
 * </code></pre>
 * <h3>Explicit New Row</h3>
 * Use the <code>&lt;br&gt;</code> line break element to wrap the items on a new row:
 *
 * <pre><code class="language-html">&lt;vaadin-form-layout&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;Email&lt;/label&gt;
 *      &lt;input class="full-width"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 *    &lt;br&gt;
 *
 *    &lt;vaadin-form-item&gt;
 *      &lt;label slot="label"&gt;Confirm Email&lt;/label&gt;
 *      &lt;input class="full-width"&gt;
 *    &lt;/vaadin-form-item&gt;
 *
 * &lt;/vaadin-form-layout&gt;
 * </code></pre>
 * <h3>CSS Properties Reference</h3>
 * The following custom CSS properties are available on the <code>&lt;vaadin-form-layout&gt;</code> element:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom CSS property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-form-layout-column-spacing</code></td>
 *    <td>Length of the spacing between columns</td>
 *    <td><code>2em</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, mixinBehaviors, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-form-layout", external = true)
public class FormLayout extends HtmlComponent<FormLayoutElement> implements Themable<FormLayoutElement> {

    public FormLayout() {
    }

    public FormLayout(String textContent) {
        super(textContent);
    }

    public FormLayout(Component<?>... components) {
        super(components);
    }

    // !wca! get responsiveSteps: !Array<!FormLayoutResponsiveStep>
    /**
     * Allows specifying a responsive behavior with the number of columns
     * and the label position depending on the layout width.
     *
     * Format: array of objects, each object defines one responsive step
     * with <code>minWidth</code> CSS length, <code>columns</code> number, and optional
     * <code>labelsPosition</code> string of <code>"aside"</code> or <code>"top"</code>. At least one item is required.
     *
     * #### Examples
     *
     * <code>javascript&lt;br /&gt;formLayout.responsiveSteps = [{columns: 1}];&lt;br /&gt;// The layout is always a single column, labels aside.&lt;br /&gt;</code>
     *
     * <code>javascript&lt;br /&gt;formLayout.responsiveSteps = [&lt;br /&gt; {minWidth: 0, columns: 1},&lt;br /&gt; {minWidth: '40em', columns: 2}&lt;br /&gt;];&lt;br /&gt;// Sets two responsive steps:&lt;br /&gt;// 1. When the layout width is &lt; 40em, one column, labels aside.&lt;br /&gt;// 2. Width &gt;= 40em, two columns, labels aside.&lt;br /&gt;</code>
     *
     * <code>javascript&lt;br /&gt;formLayout.responsiveSteps = [&lt;br /&gt; {minWidth: 0, columns: 1, labelsPosition: 'top'},&lt;br /&gt; {minWidth: '20em', columns: 1},&lt;br /&gt; {minWidth: '40em', columns: 2}&lt;br /&gt;];&lt;br /&gt;// Default value. Three responsive steps:&lt;br /&gt;// 1. Width &lt; 20em, one column, labels on top.&lt;br /&gt;// 2. 20em &lt;= width &lt; 40em, one column, labels aside.&lt;br /&gt;// 3. Width &gt;= 40em, two columns, labels aside.&lt;br /&gt;</code>
     * @return
     */
    public Array<FormLayoutResponsiveStep> getResponsiveSteps() {
        return getElement().getResponsiveSteps();
    }

    // !wca! set responsiveSteps: !Array<!FormLayoutResponsiveStep>
    /**
     * Allows specifying a responsive behavior with the number of columns
     * and the label position depending on the layout width.
     *
     * Format: array of objects, each object defines one responsive step
     * with <code>minWidth</code> CSS length, <code>columns</code> number, and optional
     * <code>labelsPosition</code> string of <code>"aside"</code> or <code>"top"</code>. At least one item is required.
     *
     * #### Examples
     *
     * <code>javascript&lt;br /&gt;formLayout.responsiveSteps = [{columns: 1}];&lt;br /&gt;// The layout is always a single column, labels aside.&lt;br /&gt;</code>
     *
     * <code>javascript&lt;br /&gt;formLayout.responsiveSteps = [&lt;br /&gt; {minWidth: 0, columns: 1},&lt;br /&gt; {minWidth: '40em', columns: 2}&lt;br /&gt;];&lt;br /&gt;// Sets two responsive steps:&lt;br /&gt;// 1. When the layout width is &lt; 40em, one column, labels aside.&lt;br /&gt;// 2. Width &gt;= 40em, two columns, labels aside.&lt;br /&gt;</code>
     *
     * <code>javascript&lt;br /&gt;formLayout.responsiveSteps = [&lt;br /&gt; {minWidth: 0, columns: 1, labelsPosition: 'top'},&lt;br /&gt; {minWidth: '20em', columns: 1},&lt;br /&gt; {minWidth: '40em', columns: 2}&lt;br /&gt;];&lt;br /&gt;// Default value. Three responsive steps:&lt;br /&gt;// 1. Width &lt; 20em, one column, labels on top.&lt;br /&gt;// 2. 20em &lt;= width &lt; 40em, one column, labels aside.&lt;br /&gt;// 3. Width &gt;= 40em, two columns, labels aside.&lt;br /&gt;</code>
     * @param value
     */
    public void setResponsiveSteps(Array<FormLayoutResponsiveStep> value) {
        getElement().setResponsiveSteps(value);
    }

    // !wca! observe responsiveSteps: !Array<!FormLayoutResponsiveStep>

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
