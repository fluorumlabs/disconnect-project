package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface LegacyBase extends HTMLElement {
  class Builder {
    private final LegacyBase object = Any.empty();

    public LegacyBase build() {
      return object;
    }
  }
}