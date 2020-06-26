package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Implements a boolean attribute, roughly as defined in the HTML
 * specification.
 *
 * If the value is truthy, then the attribute is present with a value of
 * ''. If the value is falsey, the attribute is removed.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"BooleanAttributePart as BooleanAttributePart_BooleanAttributePart"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface BooleanAttributePart extends Part {
  @JSProperty("element")
  Element getElement();

  @JSProperty("name")
  String getName();

  @JSProperty("strings")
  String[] getStrings();

  @JSProperty("value")
  Unknown /* unknown */ getValue();

  @JSBody(
      params = {"element", "name", "strings"},
      script = "return new BooleanAttributePart_BooleanAttributePart(element, name, strings)"
  )
  static BooleanAttributePart create(Element element, String name, String[] strings) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void setValue(Unknown /* unknown */ value);

  void commit();
}
