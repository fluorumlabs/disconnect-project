package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface TemplatizeMixin extends Any {
  class Builder {
    private final TemplatizeMixin object = Any.empty();

    public TemplatizeMixin build() {
      return object;
    }
  }
}
