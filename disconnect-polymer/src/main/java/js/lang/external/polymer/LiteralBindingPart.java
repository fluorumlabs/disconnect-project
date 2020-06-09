package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface LiteralBindingPart extends Any {
  @JSProperty("literal")
  String getLiteral();

  @JSProperty("literal")
  void setLiteral(String value);

  @JSProperty("compoundIndex")
  int getCompoundIndex();

  @JSProperty("compoundIndex")
  void setCompoundIndex(int value);

  class Builder {
    private final LiteralBindingPart object = Any.empty();

    public LiteralBindingPart build() {
      return object;
    }

    public Builder literal(String value) {
      object.setLiteral(value);
      return this;
    }

    public Builder compoundIndex(int value) {
      object.setCompoundIndex(value);
      return this;
    }
  }
}
