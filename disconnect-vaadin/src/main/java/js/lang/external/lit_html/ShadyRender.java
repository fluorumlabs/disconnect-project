package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* unknown */;
import js.web.dom.DocumentFragment;
import js.web.dom.Element;
import js.web.webcomponents.ShadowRoot;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"render as ShadyRender_render"},
    module = "lit-html/lib/shady-render.js"
)
@Import(
    module = "lit-html/lib/shady-render.js"
)
public interface ShadyRender extends Any {
  /**
   * Extension to the standard <code>render</code> method which supports rendering
   * to ShadowRoots when the ShadyDOM (<a href="https://github.com/webcomponents/shadydom">https://github.com/webcomponents/shadydom</a>)
   * and ShadyCSS (<a href="https://github.com/webcomponents/shadycss">https://github.com/webcomponents/shadycss</a>) polyfills are used
   * or when the webcomponentsjs
   * (<a href="https://github.com/webcomponents/webcomponentsjs">https://github.com/webcomponents/webcomponentsjs</a>) polyfill is used.
   *
   * Adds a <code>scopeName</code> option which is used to scope element DOM and stylesheets
   * when native ShadowDOM is unavailable. The <code>scopeName</code> will be added to
   * the class attribute of all rendered DOM. In addition, any style elements will
   * be automatically re-written with this <code>scopeName</code> selector and moved out
   * of the rendered DOM and into the document <code>&lt;head&gt;</code>.
   *
   * It is common to use this render method in conjunction with a custom element
   * which renders a shadowRoot. When this is done, typically the element's
   * <code>localName</code> should be used as the <code>scopeName</code>.
   *
   * In addition to DOM scoping, ShadyCSS also supports a basic shim for css
   * custom properties (needed only on older browsers like IE11) and a shim for
   * a deprecated feature called <code>@apply</code> that supports applying a set of css
   * custom properties to a given location.
   *
   * Usage considerations:
   *
   * <ul>
   * <li>
   * Part values in <code>&lt;style&gt;</code> elements are only applied the first time a given
   * <code>scopeName</code> renders. Subsequent changes to parts in style elements will have
   * no effect. Because of this, parts in style elements should only be used for
   * values that will never change, for example parts that set scope-wide theme
   * values or parts which render shared style elements.
   *
   * </li>
   * <li>
   * Note, due to a limitation of the ShadyDOM polyfill, rendering in a
   * custom element's <code>constructor</code> is not supported. Instead rendering should
   * either done asynchronously, for example at microtask timing (for example
   * <code>Promise.resolve()</code>), or be deferred until the first time the element's
   * <code>connectedCallback</code> runs.
   *
   * </li>
   * </ul>
   * Usage considerations when using shimmed custom properties or <code>@apply</code>:
   *
   * <ul>
   * <li>
   * Whenever any dynamic changes are made which affect
   * css custom properties, <code>ShadyCSS.styleElement(element)</code> must be called
   * to update the element. There are two cases when this is needed:
   * (1) the element is connected to a new parent, (2) a class is added to the
   * element that causes it to match different custom properties.
   * To address the first case when rendering a custom element, <code>styleElement</code>
   * should be called in the element's <code>connectedCallback</code>.
   *
   * </li>
   * <li>
   * Shimmed custom properties may only be defined either for an entire
   * shadowRoot (for example, in a <code>:host</code> rule) or via a rule that directly
   * matches an element with a shadowRoot. In other words, instead of flowing from
   * parent to child as do native css custom properties, shimmed custom properties
   * flow only from shadowRoots to nested shadowRoots.
   *
   * </li>
   * <li>
   * When using <code>@apply</code> mixing css shorthand property names with
   * non-shorthand names (for example <code>border</code> and <code>border-width</code>) is not
   * supported.
   *
   * </li>
   * </ul>
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "ShadyRender_render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, ShadowRoot container,
      ShadyRenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Extension to the standard <code>render</code> method which supports rendering
   * to ShadowRoots when the ShadyDOM (<a href="https://github.com/webcomponents/shadydom">https://github.com/webcomponents/shadydom</a>)
   * and ShadyCSS (<a href="https://github.com/webcomponents/shadycss">https://github.com/webcomponents/shadycss</a>) polyfills are used
   * or when the webcomponentsjs
   * (<a href="https://github.com/webcomponents/webcomponentsjs">https://github.com/webcomponents/webcomponentsjs</a>) polyfill is used.
   *
   * Adds a <code>scopeName</code> option which is used to scope element DOM and stylesheets
   * when native ShadowDOM is unavailable. The <code>scopeName</code> will be added to
   * the class attribute of all rendered DOM. In addition, any style elements will
   * be automatically re-written with this <code>scopeName</code> selector and moved out
   * of the rendered DOM and into the document <code>&lt;head&gt;</code>.
   *
   * It is common to use this render method in conjunction with a custom element
   * which renders a shadowRoot. When this is done, typically the element's
   * <code>localName</code> should be used as the <code>scopeName</code>.
   *
   * In addition to DOM scoping, ShadyCSS also supports a basic shim for css
   * custom properties (needed only on older browsers like IE11) and a shim for
   * a deprecated feature called <code>@apply</code> that supports applying a set of css
   * custom properties to a given location.
   *
   * Usage considerations:
   *
   * <ul>
   * <li>
   * Part values in <code>&lt;style&gt;</code> elements are only applied the first time a given
   * <code>scopeName</code> renders. Subsequent changes to parts in style elements will have
   * no effect. Because of this, parts in style elements should only be used for
   * values that will never change, for example parts that set scope-wide theme
   * values or parts which render shared style elements.
   *
   * </li>
   * <li>
   * Note, due to a limitation of the ShadyDOM polyfill, rendering in a
   * custom element's <code>constructor</code> is not supported. Instead rendering should
   * either done asynchronously, for example at microtask timing (for example
   * <code>Promise.resolve()</code>), or be deferred until the first time the element's
   * <code>connectedCallback</code> runs.
   *
   * </li>
   * </ul>
   * Usage considerations when using shimmed custom properties or <code>@apply</code>:
   *
   * <ul>
   * <li>
   * Whenever any dynamic changes are made which affect
   * css custom properties, <code>ShadyCSS.styleElement(element)</code> must be called
   * to update the element. There are two cases when this is needed:
   * (1) the element is connected to a new parent, (2) a class is added to the
   * element that causes it to match different custom properties.
   * To address the first case when rendering a custom element, <code>styleElement</code>
   * should be called in the element's <code>connectedCallback</code>.
   *
   * </li>
   * <li>
   * Shimmed custom properties may only be defined either for an entire
   * shadowRoot (for example, in a <code>:host</code> rule) or via a rule that directly
   * matches an element with a shadowRoot. In other words, instead of flowing from
   * parent to child as do native css custom properties, shimmed custom properties
   * flow only from shadowRoots to nested shadowRoots.
   *
   * </li>
   * <li>
   * When using <code>@apply</code> mixing css shorthand property names with
   * non-shorthand names (for example <code>border</code> and <code>border-width</code>) is not
   * supported.
   *
   * </li>
   * </ul>
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "ShadyRender_render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, DocumentFragment container,
      ShadyRenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Extension to the standard <code>render</code> method which supports rendering
   * to ShadowRoots when the ShadyDOM (<a href="https://github.com/webcomponents/shadydom">https://github.com/webcomponents/shadydom</a>)
   * and ShadyCSS (<a href="https://github.com/webcomponents/shadycss">https://github.com/webcomponents/shadycss</a>) polyfills are used
   * or when the webcomponentsjs
   * (<a href="https://github.com/webcomponents/webcomponentsjs">https://github.com/webcomponents/webcomponentsjs</a>) polyfill is used.
   *
   * Adds a <code>scopeName</code> option which is used to scope element DOM and stylesheets
   * when native ShadowDOM is unavailable. The <code>scopeName</code> will be added to
   * the class attribute of all rendered DOM. In addition, any style elements will
   * be automatically re-written with this <code>scopeName</code> selector and moved out
   * of the rendered DOM and into the document <code>&lt;head&gt;</code>.
   *
   * It is common to use this render method in conjunction with a custom element
   * which renders a shadowRoot. When this is done, typically the element's
   * <code>localName</code> should be used as the <code>scopeName</code>.
   *
   * In addition to DOM scoping, ShadyCSS also supports a basic shim for css
   * custom properties (needed only on older browsers like IE11) and a shim for
   * a deprecated feature called <code>@apply</code> that supports applying a set of css
   * custom properties to a given location.
   *
   * Usage considerations:
   *
   * <ul>
   * <li>
   * Part values in <code>&lt;style&gt;</code> elements are only applied the first time a given
   * <code>scopeName</code> renders. Subsequent changes to parts in style elements will have
   * no effect. Because of this, parts in style elements should only be used for
   * values that will never change, for example parts that set scope-wide theme
   * values or parts which render shared style elements.
   *
   * </li>
   * <li>
   * Note, due to a limitation of the ShadyDOM polyfill, rendering in a
   * custom element's <code>constructor</code> is not supported. Instead rendering should
   * either done asynchronously, for example at microtask timing (for example
   * <code>Promise.resolve()</code>), or be deferred until the first time the element's
   * <code>connectedCallback</code> runs.
   *
   * </li>
   * </ul>
   * Usage considerations when using shimmed custom properties or <code>@apply</code>:
   *
   * <ul>
   * <li>
   * Whenever any dynamic changes are made which affect
   * css custom properties, <code>ShadyCSS.styleElement(element)</code> must be called
   * to update the element. There are two cases when this is needed:
   * (1) the element is connected to a new parent, (2) a class is added to the
   * element that causes it to match different custom properties.
   * To address the first case when rendering a custom element, <code>styleElement</code>
   * should be called in the element's <code>connectedCallback</code>.
   *
   * </li>
   * <li>
   * Shimmed custom properties may only be defined either for an entire
   * shadowRoot (for example, in a <code>:host</code> rule) or via a rule that directly
   * matches an element with a shadowRoot. In other words, instead of flowing from
   * parent to child as do native css custom properties, shimmed custom properties
   * flow only from shadowRoots to nested shadowRoots.
   *
   * </li>
   * <li>
   * When using <code>@apply</code> mixing css shorthand property names with
   * non-shorthand names (for example <code>border</code> and <code>border-width</code>) is not
   * supported.
   *
   * </li>
   * </ul>
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "ShadyRender_render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, Element container, ShadyRenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
