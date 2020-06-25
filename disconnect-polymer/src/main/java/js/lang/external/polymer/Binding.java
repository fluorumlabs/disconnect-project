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
public interface Binding extends Any {
  @JSProperty("kind")
  String getKind();

  @JSProperty("kind")
  void setKind(String value);

  @JSProperty("target")
  String getTarget();

  @JSProperty("target")
  void setTarget(String value);

  @JSProperty("parts")
  Unknown getParts();

  @JSProperty("parts")
  void setParts(LiteralBindingPart[] value);

  @JSProperty("parts")
  void setParts(ExpressionBindingPart[] value);

  @JSProperty("literal")
  @Nullable
  String getLiteral();

  @JSProperty("literal")
  void setLiteral(@Nullable String value);

  @JSProperty("isCompound")
  boolean getIsCompound();

  @JSProperty("isCompound")
  void setIsCompound(boolean value);

  @JSProperty("listenerEvent")
  @Nullable
  String getListenerEvent();

  @JSProperty("listenerEvent")
  void setListenerEvent(@Nullable String value);

  @JSProperty("listenerNegate")
  boolean getListenerNegate();

  @JSProperty("listenerNegate")
  void setListenerNegate(boolean value);

  class Builder {
    private final Binding object = Any.empty();

    public Binding build() {
      return object;
    }

    public Builder kind(String value) {
      object.setKind(value);
      return this;
    }

    public Builder target(String value) {
      object.setTarget(value);
      return this;
    }

    public Builder parts(LiteralBindingPart[] value) {
      object.setParts(value);
      return this;
    }

    public Builder parts(ExpressionBindingPart[] value) {
      object.setParts(value);
      return this;
    }

    public Builder literal(@Nullable String value) {
      object.setLiteral(value);
      return this;
    }

    public Builder isCompound(boolean value) {
      object.setIsCompound(value);
      return this;
    }

    public Builder listenerEvent(@Nullable String value) {
      object.setListenerEvent(value);
      return this;
    }

    public Builder listenerNegate(boolean value) {
      object.setListenerNegate(value);
      return this;
    }
  }
}
