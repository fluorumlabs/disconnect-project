package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.AddEventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    symbols = {"internalProperty as Decorators_internalProperty", "queryAssignedNodes as Decorators_queryAssignedNodes", "query as Decorators_query", "queryAsync as Decorators_queryAsync", "property as Decorators_property", "customElement as Decorators_customElement", "queryAll as Decorators_queryAll", "eventOptions as Decorators_eventOptions"},
    module = "lit-element/lib/decorators.js"
)
@Import(
    module = "lit-element/lib/decorators.js"
)
public interface Decorators extends Any {
  /**
   * Class decorator factory that defines the decorated class as a custom element.
   *
   * <pre><code>@customElement('my-element')
   * class MyElement {
   *   render() {
   *     return html``;
   *   }
   * }
   * </code></pre>
   * @param tagName The name of the custom element to define.
   *
   */
  @JSBody(
      params = {"tagName"},
      script = "return Decorators_customElement(tagName)"
  )
  static CustomElementResultFunction customElement(String tagName) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator which creates a LitElement property which reflects a
   * corresponding attribute value. A <code>PropertyDeclaration</code> may optionally be
   * supplied to configure property features.
   *
   * This decorator should only be used for public fields. Private or protected
   * fields should use the internalProperty decorator.
   *
   * @example
   *
   * <pre><code> class MyElement {
   *    @property({ type: Boolean })
   *    clicked = false;
   *  }
   * </code></pre>
   * @ExportDecoratedItems
   *
   */
  @JSBody(
      params = {"options"},
      script = "return Decorators_property(options)"
  )
  static PropertyResultFunction property(@Nullable PropertyDeclaration options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator which creates a LitElement property which reflects a
   * corresponding attribute value. A <code>PropertyDeclaration</code> may optionally be
   * supplied to configure property features.
   *
   * This decorator should only be used for public fields. Private or protected
   * fields should use the internalProperty decorator.
   *
   * @example
   *
   * <pre><code> class MyElement {
   *    @property({ type: Boolean })
   *    clicked = false;
   *  }
   * </code></pre>
   * @ExportDecoratedItems
   *
   */
  @JSBody(
      params = {},
      script = "return Decorators_property()"
  )
  static PropertyResultFunction property() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Declares a private or protected property that still triggers updates to the
   * element when it changes.
   *
   * Properties declared this way must not be used from HTML or HTML templating
   * systems, they're solely for properties internal to the element. These
   * properties may be renamed by optimization tools like closure compiler.
   *
   */
  @JSBody(
      params = {"options"},
      script = "return Decorators_internalProperty(options)"
  )
  static InternalPropertyResultFunction internalProperty(
      @Nullable InternalPropertyDeclaration options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Declares a private or protected property that still triggers updates to the
   * element when it changes.
   *
   * Properties declared this way must not be used from HTML or HTML templating
   * systems, they're solely for properties internal to the element. These
   * properties may be renamed by optimization tools like closure compiler.
   *
   */
  @JSBody(
      params = {},
      script = "return Decorators_internalProperty()"
  )
  static InternalPropertyResultFunction internalProperty() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator that converts a class property into a getter that
   * executes a querySelector on the element's renderRoot.
   *
   * @param selector A DOMString containing one or more selectors to match.
   *
   * See: <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector">https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector</a>
   *
   * @example
   *
   * <pre><code> class MyElement {
   *    @query('#first')
   *    first;
   *
   *    render() {
   *      return html`
   *        &lt;div id=&quot;first&quot;&gt;&lt;/div&gt;
   *        &lt;div id=&quot;second&quot;&gt;&lt;/div&gt;
   *      `;
   *    }
   *  }
   * </code></pre>
   */
  @JSBody(
      params = {"selector"},
      script = "return Decorators_query(selector)"
  )
  static QueryResultFunction query(String selector) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator that converts a class property into a getter that
   * returns a promise that resolves to the result of a querySelector on the
   * element's renderRoot done after the element's <code>updateComplete</code> promise
   * resolves. When the queried property may change with element state, this
   * decorator can be used instead of requiring users to await the
   * <code>updateComplete</code> before accessing the property.
   *
   * @param selector A DOMString containing one or more selectors to match.
   *
   * See: <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector">https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector</a>
   *
   * @example
   *
   * <pre><code> class MyElement {
   *    @queryAsync('#first')
   *    first;
   *
   *    render() {
   *      return html`
   *        &lt;div id=&quot;first&quot;&gt;&lt;/div&gt;
   *        &lt;div id=&quot;second&quot;&gt;&lt;/div&gt;
   *      `;
   *    }
   *  }
   *
   *  // external usage
   *  async doSomethingWithFirst() {
   *   (await aMyElement.first).doSomething();
   *  }
   * </code></pre>
   */
  @JSBody(
      params = {"selector"},
      script = "return Decorators_queryAsync(selector)"
  )
  static QueryAsyncResultFunction queryAsync(String selector) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator that converts a class property into a getter
   * that executes a querySelectorAll on the element's renderRoot.
   *
   * @param selector A DOMString containing one or more selectors to match.
   *
   * See:
   * <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelectorAll">https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelectorAll</a>
   *
   * @example
   *
   * <pre><code> class MyElement {
   *    @queryAll('div')
   *    divs;
   *
   *    render() {
   *      return html`
   *        &lt;div id=&quot;first&quot;&gt;&lt;/div&gt;
   *        &lt;div id=&quot;second&quot;&gt;&lt;/div&gt;
   *      `;
   *    }
   *  }
   * </code></pre>
   */
  @JSBody(
      params = {"selector"},
      script = "return Decorators_queryAll(selector)"
  )
  static QueryAllResultFunction queryAll(String selector) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Adds event listener options to a method used as an event listener in a
   * lit-html template.
   *
   * @param options An object that specifies event listener options as accepted by
   * <code>EventTarget#addEventListener</code> and <code>EventTarget#removeEventListener</code>.
   *
   * Current browsers support the <code>capture</code>, <code>passive</code>, and <code>once</code> options. See:
   * <a href="https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#Parameters">https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#Parameters</a>
   *
   * @example
   *
   * <pre><code> class MyElement {
   *    clicked = false;
   *
   *    render() {
   *      return html`
   *        &lt;div @click=${this._onClick}`&gt;
   *          &lt;button&gt;&lt;/button&gt;
   *        &lt;/div&gt;
   *      `;
   *    }
   *
   *    @eventOptions({capture: true})
   *    _onClick(e) {
   *      this.clicked = true;
   *    }
   *  }
   * </code></pre>
   */
  @JSBody(
      params = {"options"},
      script = "return Decorators_eventOptions(options)"
  )
  static Any eventOptions(AddEventListenerOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator that converts a class property into a getter that
   * returns the <code>assignedNodes</code> of the given named <code>slot</code>. Note, the type of
   * this property should be annotated as <code>NodeListOf&lt;HTMLElement&gt;</code>.
   *
   */
  @JSBody(
      params = {"slotName", "flatten"},
      script = "return Decorators_queryAssignedNodes(slotName, flatten)"
  )
  static QueryAssignedNodesResultFunction queryAssignedNodes(@Nullable String slotName,
      boolean flatten) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator that converts a class property into a getter that
   * returns the <code>assignedNodes</code> of the given named <code>slot</code>. Note, the type of
   * this property should be annotated as <code>NodeListOf&lt;HTMLElement&gt;</code>.
   *
   */
  @JSBody(
      params = {"slotName"},
      script = "return Decorators_queryAssignedNodes(slotName)"
  )
  static QueryAssignedNodesResultFunction queryAssignedNodes(@Nullable String slotName) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A property decorator that converts a class property into a getter that
   * returns the <code>assignedNodes</code> of the given named <code>slot</code>. Note, the type of
   * this property should be annotated as <code>NodeListOf&lt;HTMLElement&gt;</code>.
   *
   */
  @JSBody(
      params = {},
      script = "return Decorators_queryAssignedNodes()"
  )
  static QueryAssignedNodesResultFunction queryAssignedNodes() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface CustomElementResultFunction extends Any {
    Any apply(Any classOrDescriptor);
  }

  @FunctionalInterface
  @JSFunctor
  interface PropertyResultFunction extends Any {
    Any apply(Any protoOrDescriptor, @Nullable Any name);
  }

  @FunctionalInterface
  @JSFunctor
  interface InternalPropertyResultFunction extends Any {
    Any apply(Any protoOrDescriptor, @Nullable Any name);
  }

  @FunctionalInterface
  @JSFunctor
  interface QueryResultFunction extends Any {
    Any apply(Any protoOrDescriptor, @Nullable Any name);
  }

  @FunctionalInterface
  @JSFunctor
  interface QueryAsyncResultFunction extends Any {
    Any apply(Any protoOrDescriptor, @Nullable Any name);
  }

  @FunctionalInterface
  @JSFunctor
  interface QueryAllResultFunction extends Any {
    Any apply(Any protoOrDescriptor, @Nullable Any name);
  }

  @FunctionalInterface
  @JSFunctor
  interface QueryAssignedNodesResultFunction extends Any {
    Any apply(Any protoOrDescriptor, @Nullable Any name);
  }
}
