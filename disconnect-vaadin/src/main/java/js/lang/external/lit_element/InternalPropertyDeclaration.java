package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/decorators.js"
)
public interface InternalPropertyDeclaration<Type extends Any> extends Any {
  /**
   * A function that indicates if a property should be considered changed when
   * it is set. The function should take the <code>newValue</code> and <code>oldValue</code> and
   * return <code>true</code> if an update should be requested.
   *
   */
  boolean hasChanged(Type value, Type oldValue);
}
