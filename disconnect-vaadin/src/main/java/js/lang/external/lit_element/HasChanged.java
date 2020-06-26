package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown /* unknown */;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/updating-element.js"
)
public interface HasChanged extends Any {
  boolean apply(Unknown /* unknown */ value, Unknown /* unknown */ old);
}
