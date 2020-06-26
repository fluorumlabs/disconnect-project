package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/src/env.js"
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
  }
}
