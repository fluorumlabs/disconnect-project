package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* Array < MethodArg | string > */;
import org.teavm.jso.JSProperty;

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
  Unknown /* Array < MethodArg | string > */ getDependencies();

  @JSProperty("dependencies")
  void setDependencies(MethodArg[] value);

  @JSProperty("dependencies")
  void setDependencies(String[] value);

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

    public Builder dependencies(MethodArg[] value) {
      object.setDependencies(value);
      return this;
    }

    public Builder dependencies(String[] value) {
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
