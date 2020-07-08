package com.github.fluorumlabs.disconnect.vaadin.orderedlayout;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.orderedlayout.VerticalLayoutElement;

/**
 * <code>&lt;vaadin-vertical-layout&gt;</code> provides a simple way to vertically align your HTML elements.
 *
 * <pre><code>&lt;vaadin-vertical-layout&gt;
 *    &lt;div&gt;Item 1&lt;/div&gt;
 *    &lt;div&gt;Item 2&lt;/div&gt;
 * &lt;/vaadin-vertical-layout&gt;
 * </code></pre>
 * <h3>Built-in Theme Variations</h3>
 * <code>&lt;vaadin-vertical-layout&gt;</code> supports the following theme variations:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Theme variation</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>theme="margin"</code></td>
 *    <td>Applies the default amount of CSS margin for the host element (specified by the theme)</td>
 *   </tr>
 *   <tr>
 *    <td><code>theme="padding"</code></td>
 *    <td>Applies the default amount of CSS padding for the host element (specified by the theme)</td>
 *   </tr>
 *   <tr>
 *    <td><code>theme="spacing"</code></td>
 *    <td>Applies the default amount of CSS margin between items (specified by the theme)</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-vertical-layout", external = true)
public class VerticalLayout extends HtmlComponent<VerticalLayoutElement> implements Themable<VerticalLayoutElement> {

    public VerticalLayout() {
    }

    public VerticalLayout(String textContent) {
        super(textContent);
    }

    public VerticalLayout(Component<?>... components) {
        super(components);
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Variant implements ThemeVariant {
        MARGIN, PADDING, SPACING
    }
}
