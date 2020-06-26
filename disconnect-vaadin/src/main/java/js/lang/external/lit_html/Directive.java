package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* o is DirectiveFn */;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"isDirective as Directive_isDirective", "directive as Directive_directive"},
    module = "lit-html/lib/directive.js"
)
@Import(
    module = "lit-html/lib/directive.js"
)
public interface Directive extends Any {
  /**
   * Brands a function as a directive factory function so that lit-html will call
   * the function during template rendering, rather than passing as a value.
   *
   * A <em>directive</em> is a function that takes a Part as an argument. It has the
   * signature: <code>(part: Part) =&gt; void</code>.
   *
   * A directive <em>factory</em> is a function that takes arguments for data and
   * configuration and returns a directive. Users of directive usually refer to
   * the directive factory as the directive. For example, &quot;The repeat directive&quot;.
   *
   * Usually a template author will invoke a directive factory in their template
   * with relevant arguments, which will then return a directive function.
   *
   * Here's an example of using the <code>repeat()</code> directive factory that takes an
   * array and a function to render an item:
   *
   * <pre><code class="language-js">html`&lt;ul&gt;&lt;${repeat(items, (item) =&gt; html`&lt;li&gt;${item}&lt;/li&gt;`)}&lt;/ul&gt;`
   * </code></pre>
   * When <code>repeat</code> is invoked, it returns a directive function that closes over
   * <code>items</code> and the template function. When the outer template is rendered, the
   * return directive function is called with the Part for the expression.
   * <code>repeat</code> then performs it's custom logic to render multiple items.
   *
   * @param f The directive factory function. Must be a function that returns a
   * function of the signature <code>(part: Part) =&gt; void</code>. The returned function will
   * be called with the part object.
   *
   * @example
   *
   * import {directive, html} from 'lit-html';
   *
   * const immutable = directive((v) =&gt; (part) =&gt; {
   * if (part.value !== v) {
   * part.setValue(v)
   * }
   * });
   *
   */
  @JSBody(
      params = {"f"},
      script = "return Directive_directive(f)"
  )
  static <F extends DirectiveFactory> F directive(F f) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      params = {"o"},
      script = "return Directive_isDirective(o)"
  )
  static Unknown /* o is DirectiveFn */ isDirective(Unknown /* unknown */ o) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
