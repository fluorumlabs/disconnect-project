package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface MethodArg extends Any {
  @JSProperty("literal")
  boolean getLiteral();

  @JSProperty("literal")
  void setLiteral(boolean value);

  @JSProperty("name")
  String getName();

  @JSProperty("name")
  void setName(String value);

  @JSProperty("value")
  Unknown getValue();

  @JSProperty("value")
  void setValue(String value);

  @JSProperty("value")
  void setValue(int value);

  @JSProperty("rootProperty")
  @Nullable
  String getRootProperty();

  @JSProperty("rootProperty")
  void setRootProperty(@Nullable String value);

  @JSProperty("structured")
  boolean getStructured();

  @JSProperty("structured")
  void setStructured(boolean value);

  @JSProperty("wildcard")
  boolean getWildcard();

  @JSProperty("wildcard")
  void setWildcard(boolean value);

  class Builder {
    private final MethodArg object = Any.empty();

    public MethodArg build() {
      return object;
    }

    public Builder literal(boolean value) {
      object.setLiteral(value);
      return this;
    }

    public Builder name(String value) {
      object.setName(value);
      return this;
    }

    public Builder value(String value) {
      object.setValue(value);
      return this;
    }

    public Builder value(int value) {
      object.setValue(value);
      return this;
    }

    public Builder rootProperty(@Nullable String value) {
      object.setRootProperty(value);
      return this;
    }

    public Builder structured(boolean value) {
      object.setStructured(value);
      return this;
    }

    public Builder wildcard(boolean value) {
      object.setWildcard(value);
      return this;
    }
  }
}
