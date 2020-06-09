package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.TemplateStringsArray;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"html as HtmlTag_html", "htmlLiteral as HtmlTag_htmlLiteral"},
    module = "@polymer/polymer/lib/utils/html-tag.js"
)
public interface HtmlTag extends Any {
  /**
   * A template literal tag that creates an HTML <template> element from the
   * contents of the string.
   *
   * This allows you to write a Polymer Template in JavaScript.
   *
   * Templates can be composed by interpolating <code>HTMLTemplateElement</code>s in
   * expressions in the JavaScript template literal. The nested template's
   * <code>innerHTML</code> is included in the containing template.  The only other
   * values allowed in expressions are those returned from <code>htmlLiteral</code>
   * which ensures only literal values from JS source ever reach the HTML, to
   * guard against XSS risks.
   *
   * All other values are disallowed in expressions to help prevent XSS
   * attacks; however, <code>htmlLiteral</code> can be used to compose static
   * string values into templates. This is useful to compose strings into
   * places that do not accept html, like the css text of a <code>style</code>
   * element.
   *
   * Example:
   *
   * <pre><code> static get template() {
   *    return html`
   *      &lt;style&gt;:host{ content:&quot;...&quot; }&lt;/style&gt;
   *      &lt;div class=&quot;shadowed&quot;&gt;${this.partialTemplate}&lt;/div&gt;
   *      ${super.template}
   *    `;
   *  }
   *  static get partialTemplate() { return html`&lt;span&gt;Partial!&lt;/span&gt;`; }
   * </code></pre>
   * @return Constructed HTMLTemplateElement
   *
   */
  @JSBody(
      params = {"strings", "values"},
      script = "return HtmlTag_html.apply(null, [strings].concat(values))"
  )
  static HTMLTemplateElement html(TemplateStringsArray strings, Any... values) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * An html literal tag that can be used with <code>html</code> to compose.
   * a literal string.
   *
   * Example:
   *
   * <pre><code> static get template() {
   *    return html`
   *      &lt;style&gt;
   *        :host { display: block; }
   *        ${this.styleTemplate()}
   *      &lt;/style&gt;
   *      &lt;div class=&quot;shadowed&quot;&gt;${staticValue}&lt;/div&gt;
   *      ${super.template}
   *    `;
   *  }
   *  static get styleTemplate() {
   *     return htmlLiteral`.shadowed { background: gray; }`;
   *  }
   * </code></pre>
   * @return Constructed literal string
   *
   */
  @JSBody(
      params = {"strings", "values"},
      script = "return HtmlTag_htmlLiteral.apply(null, [strings].concat(values))"
  )
  static LiteralString htmlLiteral(TemplateStringsArray strings, Any... values) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
