package js.lang.external.polymer.utils;

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
public interface TemplatizerBase extends TemplateInstanceBase {
  class Builder {
    private final TemplatizerBase object = Any.empty();

    public TemplatizerBase build() {
      return object;
    }
  }
}
