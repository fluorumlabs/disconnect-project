package js.lang.external.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.web.dom.HTMLStyleElement;

/**
 * Custom element for defining styles in the main document that can take
 * advantage of [shady DOM](https: * for style encapsulation, custom properties, and custom mixins.
 *
 * <ul>
 * <li>Document styles defined in a <code>&lt;custom-style&gt;</code> are shimmed to ensure they
 * do not leak into local DOM when running on browsers without native
 * Shadow DOM.</li>
 * <li>Custom properties can be defined in a <code>&lt;custom-style&gt;</code>. Use the <code>html</code> selector
 * to define custom properties that apply to all custom elements.</li>
 * <li>Custom mixins can be defined in a <code>&lt;custom-style&gt;</code>, if you import the optional
 * [apply shim](https: *   (<code>shadycss/apply-shim.html</code>).</li>
 * </ul>
 * To use:
 *
 * <ul>
 * <li>Import <code>custom-style.html</code>.</li>
 * <li>Place a <code>&lt;custom-style&gt;</code> element in the main document, wrapping an inline <code>&lt;style&gt;</code> tag that
 * contains the CSS rules you want to shim.</li>
 * </ul>
 * For example:
 *
 * <pre><code class="language-html">&lt;!-- import apply shim--only required if using mixins --&gt;
 * &lt;link rel=&quot;import&quot; href=&quot;bower_components/shadycss/apply-shim.html&quot;&gt;
 * &lt;!-- import custom-style element --&gt;
 * &lt;link rel=&quot;import&quot; href=&quot;bower_components/polymer/lib/elements/custom-style.html&quot;&gt;
 *
 * &lt;custom-style&gt;
 *   &lt;style&gt;
 *     html {
 *       --custom-color: blue;
 *       --custom-mixin: {
 *         font-weight: bold;
 *         color: red;
 *       };
 *     }
 *   &lt;/style&gt;
 * &lt;/custom-style&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/custom-style.js"
)
public interface CustomStyle extends HTMLElement {
  /**
   * Returns the light-DOM <code>&lt;style&gt;</code> child this element wraps.  Upon first
   * call any style modules referenced via the <code>include</code> attribute will be
   * concatenated to this element's <code>&lt;style&gt;</code>.
   *
   * @return This element's light-DOM <code>&lt;style&gt;</code>
   *
   */
  @Nullable
  HTMLStyleElement getStyle();
}
