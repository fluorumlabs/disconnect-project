package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * This file contains the types that are required for compilation of the
 * Polymer generated type declarations, but which could not themselves be
 * automatically generated.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerElementPropertiesMeta extends Any {
  @JSProperty("type")
  @Nullable
  JsFunction getType();

  @JSProperty("type")
  void setType(@Nullable JsFunction value);

  @JSProperty("value")
  @Nullable
  Any getValue();

  @JSProperty("value")
  void setValue(@Nullable Any value);

  @JSProperty("readOnly")
  boolean getReadOnly();

  @JSProperty("readOnly")
  void setReadOnly(boolean value);

  @JSProperty("computed")
  @Nullable
  String getComputed();

  @JSProperty("computed")
  void setComputed(@Nullable String value);

  @JSProperty("reflectToAttribute")
  boolean getReflectToAttribute();

  @JSProperty("reflectToAttribute")
  void setReflectToAttribute(boolean value);

  @JSProperty("notify")
  boolean getNotify();

  @JSProperty("notify")
  void setNotify(boolean value);

  @JSProperty("observer")
  @Nullable
  Unknown getObserver();

  @JSProperty("observer")
  void setObserver(@Nullable String value);

  @JSProperty("observer")
  void setObserver(@Nullable ObserverFn value);

  @FunctionalInterface
  @JSFunctor
  interface ObserverFn extends Any {
    void apply(Any val, Any old);
  }

  /**
   * This file contains the types that are required for compilation of the
   * Polymer generated type declarations, but which could not themselves be
   * automatically generated.
   *
   */
  class Builder {
    private final PolymerElementPropertiesMeta object = Any.empty();

    public PolymerElementPropertiesMeta build() {
      return object;
    }

    public Builder type(@Nullable JsFunction value) {
      object.setType(value);
      return this;
    }

    public Builder value(@Nullable Any value) {
      object.setValue(value);
      return this;
    }

    public Builder readOnly(boolean value) {
      object.setReadOnly(value);
      return this;
    }

    public Builder computed(@Nullable String value) {
      object.setComputed(value);
      return this;
    }

    public Builder reflectToAttribute(boolean value) {
      object.setReflectToAttribute(value);
      return this;
    }

    public Builder notify(boolean value) {
      object.setNotify(value);
      return this;
    }

    public Builder observer(@Nullable String value) {
      object.setObserver(value);
      return this;
    }

    public Builder observer(@Nullable ObserverFn value) {
      object.setObserver(value);
      return this;
    }
  }
}
