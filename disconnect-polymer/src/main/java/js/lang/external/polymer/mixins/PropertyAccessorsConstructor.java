package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PropertyAccessorsConstructor as PropertyAccessorsConstructor_PropertyAccessorsConstructor"},
    module = "@polymer/polymer/lib/mixins/property-accessors.js"
)
public interface PropertyAccessorsConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return PropertyAccessorsConstructor_PropertyAccessorsConstructor.apply(null, args)"
  )
  static PropertyAccessors create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns an attribute name that corresponds to the given property.
   * By default, converts camel to dash case, e.g. <code>fooBar</code> to <code>foo-bar</code>.
   *
   * @param property Property to convert
   * @return Attribute name corresponding to the given property.
   *
   */
  String attributeNameForProperty(String property);

  /**
   * Generates property accessors for all attributes in the standard
   * static <code>observedAttributes</code> array.
   *
   * Attribute names are mapped to property names using the <code>dash-case</code> to
   * <code>camelCase</code> convention
   *
   */
  void createPropertiesForAttributes();
}
