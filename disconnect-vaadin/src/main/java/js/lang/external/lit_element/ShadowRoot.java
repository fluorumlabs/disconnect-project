package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.cssom.CSSStyleSheet;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/src/env.js"
)
public interface ShadowRoot extends Any {
  @JSProperty("adoptedStyleSheets")
  CSSStyleSheet[] getAdoptedStyleSheets();

  @JSProperty("adoptedStyleSheets")
  void setAdoptedStyleSheets(CSSStyleSheet[] value);

  class Builder {
    private final ShadowRoot object = Any.empty();

    public ShadowRoot build() {
      return object;
    }

    public Builder adoptedStyleSheets(CSSStyleSheet[] value) {
      object.setAdoptedStyleSheets(value);
      return this;
    }
  }
}
