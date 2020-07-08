package js.lang.external.vaadin.orderedlayout;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-ordered-layout", version = "^1.4.0-alpha1")
@Import(module = "@vaadin/vaadin-ordered-layout/vaadin-vertical-layout.js")
public interface VerticalLayoutElement extends HTMLElement {

    // !wca! get theme: string | null | undefined
}
