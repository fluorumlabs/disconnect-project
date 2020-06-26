package js.lang.external.vaadin.vaadin_ordered_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;

/**
 * <code>&lt;vaadin-vertical-layout&gt;</code> provides a simple way to vertically align your HTML elements.
 *
 * <pre><code>&lt;vaadin-vertical-layout&gt;
 *   &lt;div&gt;Item 1&lt;/div&gt;
 *   &lt;div&gt;Item 2&lt;/div&gt;
 * &lt;/vaadin-vertical-layout&gt;
 * </code></pre>
 * <h3>Built-in Theme Variations</h3>
 * <code>&lt;vaadin-vertical-layout&gt;</code> supports the following theme variations:
 *
 * <table>
 * <thead>
 * <tr><th>Theme variation</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>theme=&quot;margin&quot;</code></td><td>Applies the default amount of CSS margin for the host element (specified by the theme)</td></tr>
 * <tr><td><code>theme=&quot;padding&quot;</code></td><td>Applies the default amount of CSS padding for the host element (specified by the theme)</td></tr>
 * <tr><td><code>theme=&quot;spacing&quot;</code></td><td>Applies the default amount of CSS margin between items (specified by the theme)</td></tr>
 * </tbody>
 * </table>
 */
@NpmPackage(
    name = "@vaadin/vaadin-ordered-layout",
    version = "^1.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-ordered-layout/vaadin-vertical-layout.js"
)
public interface VerticalLayoutElement extends PolymerElement, ThemableMixin, ElementMixin {
}