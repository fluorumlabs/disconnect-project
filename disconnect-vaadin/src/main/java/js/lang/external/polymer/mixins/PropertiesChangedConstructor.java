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
    symbols = {"PropertiesChangedConstructor as PropertiesChangedConstructor_PropertiesChangedConstructor"},
    module = "@polymer/polymer/lib/mixins/properties-changed.js"
)
@Import(
    module = "@polymer/polymer/lib/mixins/properties-changed.js"
)
public interface PropertiesChangedConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return PropertiesChangedConstructor_PropertiesChangedConstructor.apply(null, args)"
  )
  static PropertiesChanged create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates property accessors for the given property names.
   *
   * @param props Object whose keys are names of accessors.
   *
   */
  void createProperties(Any props);

  /**
   * Returns an attribute name that corresponds to the given property.
   * The attribute name is the lowercased property name. Override to
   * customize this mapping.
   *
   * @param property Property to convert
   * @return Attribute name corresponding to the given property.
   *
   */
  String attributeNameForProperty(String property);

  /**
   * Override point to provide a type to which to deserialize a value to
   * a given property.
   *
   * @param name Name of property
   *
   */
  void typeForProperty(String name);
}
