package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Writes attribute values to the DOM for a group of AttributeParts bound to a
 * single attribute. The value is only set once even if there are multiple parts
 * for an attribute.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"AttributeCommitter as AttributeCommitter_AttributeCommitter"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface AttributeCommitter extends Any {
  @JSProperty("element")
  Element getElement();

  @JSProperty("name")
  String getName();

  @JSProperty("strings")
  String[] getStrings();

  @JSProperty("parts")
  Array<AttributePart> getParts();

  @JSProperty("dirty")
  boolean getDirty();

  @JSProperty("dirty")
  void setDirty(boolean value);

  @JSBody(
      params = {"element", "name", "strings"},
      script = "return new AttributeCommitter_AttributeCommitter(element, name, strings)"
  )
  static AttributeCommitter create(Element element, String name, String[] strings) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a single part. Override this to create a differnt type of part.
   *
   */
  void commit();
}
