package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/src/env.js"
)
public interface ShadyDOM extends Any {
  @JSProperty("inUse")
  boolean getInUse();

  @JSProperty("inUse")
  void setInUse(boolean value);

  void flush();

  class Builder {
    private final ShadyDOM object = Any.empty();

    public ShadyDOM build() {
      return object;
    }

    public Builder inUse(boolean value) {
      object.setInUse(value);
      return this;
    }
  }
}
