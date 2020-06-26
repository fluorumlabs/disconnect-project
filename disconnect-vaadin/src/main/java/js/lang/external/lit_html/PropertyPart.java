package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface PropertyPart extends AttributePart {
  class Builder {
    private final PropertyPart object = Any.empty();

    public PropertyPart build() {
      return object;
    }
  }
}
