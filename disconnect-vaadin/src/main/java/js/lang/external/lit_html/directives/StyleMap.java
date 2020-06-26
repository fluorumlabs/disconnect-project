package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.lit_html.Part;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"styleMap as StyleMap_styleMap"},
    module = "lit-html/directives/style-map.js"
)
@Import(
    module = "lit-html/directives/style-map.js"
)
public interface StyleMap extends Any {
  /**
   * A directive that applies CSS properties to an element.
   *
   * <code>styleMap</code> can only be used in the <code>style</code> attribute and must be the only
   * expression in the attribute. It takes the property names in the <code>styleInfo</code>
   * object and adds the property values as CSS properties. Property names with
   * dashes (<code>-</code>) are assumed to be valid CSS property names and set on the
   * element's style object using <code>setProperty()</code>. Names without dashes are
   * assumed to be camelCased JavaScript property names and set on the element's
   * style object using property assignment, allowing the style object to
   * translate JavaScript-style names to CSS property names.
   *
   * For example <code>styleMap({backgroundColor: 'red', 'border-top': '5px', '--size': '0'})</code> sets the <code>background-color</code>, <code>border-top</code> and <code>--size</code> properties.
   *
   * @param styleInfo {StyleInfo}
   *
   */
  @JSBody(
      params = {"styleInfo"},
      script = "return StyleMap_styleMap(styleInfo)"
  )
  static StyleMapResultFunction styleMap(StyleInfo styleInfo) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface StyleMapResultFunction extends Any {
    void apply(Part part);
  }
}
