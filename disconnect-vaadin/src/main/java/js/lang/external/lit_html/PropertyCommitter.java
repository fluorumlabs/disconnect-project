package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Sets attribute values for PropertyParts, so that the value is only set once
 * even if there are multiple parts for a property.
 *
 * If an expression controls the whole property value, then the value is simply
 * assigned to the property under control. If there are string literals or
 * multiple expressions, then the strings are expressions are interpolated into
 * a string first.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"PropertyCommitter as PropertyCommitter_PropertyCommitter"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface PropertyCommitter extends AttributeCommitter {
  @JSProperty("single")
  boolean getSingle();

  @JSBody(
      params = {"element", "name", "strings"},
      script = "return new PropertyCommitter_PropertyCommitter(element, name, strings)"
  )
  static PropertyCommitter create(Element element, String name, String[] strings) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void commit();
}
