package com.github.fluorumlabs.disconnect.vaadin.orderedlayout;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.orderedlayout.HorizontalLayoutElement;

/**
 * <code>&lt;vaadin-horizontal-layout&gt;</code> provides a simple way to horizontally align your HTML elements.
 *
 * <pre><code>&lt;vaadin-horizontal-layout&gt;
 *    &lt;div&gt;Item 1&lt;/div&gt;
 *    &lt;div&gt;Item 2&lt;/div&gt;
 * &lt;/vaadin-horizontal-layout&gt;
 * </code></pre>
 * <h3>Built-in Theme Variations</h3>
 * <code>&lt;vaadin-horizontal-layout&gt;</code> supports the following theme variations:
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
@CustomElement(tagName = "vaadin-horizontal-layout", external = true)
public class HorizontalLayout extends HtmlComponent<HorizontalLayoutElement> implements Themable<HorizontalLayoutElement> {

    public HorizontalLayout() {
    }

    public HorizontalLayout(String textContent) {
        super(textContent);
    }

    public HorizontalLayout(Component<?>... components) {
        super(components);
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Variant implements ThemeVariant {
        MARGIN, PADDING, SPACING
    }
}
