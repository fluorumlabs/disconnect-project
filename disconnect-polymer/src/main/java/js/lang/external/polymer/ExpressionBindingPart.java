package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface ExpressionBindingPart extends Any {
  @JSProperty("mode")
  String getMode();

  @JSProperty("mode")
  void setMode(String value);

  @JSProperty("negate")
  boolean getNegate();

  @JSProperty("negate")
  void setNegate(boolean value);

  @JSProperty("source")
  String getSource();

  @JSProperty("source")
  void setSource(String value);

  @JSProperty("dependencies")
  Unknown getDependencies();

  @JSProperty("dependencies")
  void setDependencies(String[] value);

  @JSProperty("dependencies")
  void setDependencies(Array< MethodArg > value);

  @JSProperty("customEvent")
  boolean getCustomEvent();

  @JSProperty("customEvent")
  void setCustomEvent(boolean value);

  @JSProperty("signature")
  @Nullable
  Any getSignature();

  @JSProperty("signature")
  void setSignature(@Nullable Any value);

  @JSProperty("event")
  String getEvent();

  @JSProperty("event")
  void setEvent(String value);

  class Builder {
    private final ExpressionBindingPart object = Any.empty();

    public ExpressionBindingPart build() {
      return object;
    }

    public Builder mode(String value) {
      object.setMode(value);
      return this;
    }

    public Builder negate(boolean value) {
      object.setNegate(value);
      return this;
    }

    public Builder source(String value) {
      object.setSource(value);
      return this;
    }

    public Builder dependencies(String[] value) {
      object.setDependencies(value);
      return this;
    }

    public Builder dependencies(Array < MethodArg > value) {
      object.setDependencies(value);
      return this;
    }

    public Builder customEvent(boolean value) {
      object.setCustomEvent(value);
      return this;
    }

    public Builder signature(@Nullable Any value) {
      object.setSignature(value);
      return this;
    }

    public Builder event(String value) {
      object.setEvent(value);
      return this;
    }
  }
}
