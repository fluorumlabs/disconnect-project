package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.webcomponents.ShadowRoot;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/src/env.js"
)
public interface Window extends Any {
  @JSProperty("ShadyCSS")
  @Nullable
  ShadyCSS getShadyCSS();

  @JSProperty("ShadyCSS")
  void setShadyCSS(@Nullable ShadyCSS value);

  @JSProperty("ShadyDOM")
  @Nullable
  ShadyDOM getShadyDOM();

  @JSProperty("ShadyDOM")
  void setShadyDOM(@Nullable ShadyDOM value);

  @JSProperty("ShadowRoot")
  ShadowRoot getShadowRoot();

  @JSProperty("ShadowRoot")
  void setShadowRoot(ShadowRoot value);

  class Builder {
    private final Window object = Any.empty();

    public Window build() {
      return object;
    }

    public Builder ShadyCSS(@Nullable ShadyCSS value) {
      object.setShadyCSS(value);
      return this;
    }

    public Builder ShadyDOM(@Nullable ShadyDOM value) {
      object.setShadyDOM(value);
      return this;
    }

    public Builder ShadowRoot(ShadowRoot value) {
      object.setShadowRoot(value);
      return this;
    }
  }
}
