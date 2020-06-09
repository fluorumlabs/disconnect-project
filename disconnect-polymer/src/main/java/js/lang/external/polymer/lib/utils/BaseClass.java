package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/utils/templatize.js"
)
public interface BaseClass extends TemplateInstanceBase {
  class Builder {
    private final BaseClass object = Any.empty();

    public BaseClass build() {
      return object;
    }
  }
}
