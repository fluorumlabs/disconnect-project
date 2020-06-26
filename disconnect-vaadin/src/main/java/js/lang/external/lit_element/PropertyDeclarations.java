package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSIndexer;

/**
 * Map of properties to PropertyDeclaration options. For each property an
 * accessor is made, and the property is processed according to the
 * PropertyDeclaration options.
 *
 */
@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/updating-element.js"
)
public interface PropertyDeclarations extends Any {
  @JSIndexer
  PropertyDeclaration get(String key);

  class Builder {
    private final PropertyDeclarations object = Any.empty();

    public PropertyDeclarations build() {
      return object;
    }
  }
}
