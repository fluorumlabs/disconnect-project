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
    symbols = {"PropertiesMixinConstructor as PropertiesMixinConstructor_PropertiesMixinConstructor"},
    module = "@polymer/polymer/lib/mixins/properties-mixin.js"
)
@Import(
    module = "@polymer/polymer/lib/mixins/properties-mixin.js"
)
public interface PropertiesMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return PropertiesMixinConstructor_PropertiesMixinConstructor.apply(null, args)"
  )
  static PropertiesMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Overrides <code>PropertiesChanged</code> method to return type specified in the
   * static <code>properties</code> object for the given property.
   *
   * @param name Name of property
   * @return Type to which to deserialize attribute
   *
   */
  Any typeForProperty(String name);

  /**
   * Finalizes an element definition, including ensuring any super classes
   * are also finalized. This includes ensuring property
   * accessors exist on the element prototype. This method calls
   * <code>_finalizeClass</code> to finalize each constructor in the prototype chain.
   *
   */
  void finalize();
}
