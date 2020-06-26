package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.PropertyDescriptor;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/decorators.js"
)
public interface ClassElement extends Any {
  @JSProperty("kind")
  Kind getKind();

  @JSProperty("kind")
  void setKind(Kind value);

  @JSProperty("key")
  String getKey();

  @JSProperty("key")
  void setKey(String value);

  @JSProperty("placement")
  Placement getPlacement();

  @JSProperty("placement")
  void setPlacement(Placement value);

  @JSProperty("initializer")
  @Nullable
  JsFunction getInitializer();

  @JSProperty("initializer")
  void setInitializer(@Nullable JsFunction value);

  @JSProperty("extras")
  @Nullable
  ClassElement[] getExtras();

  @JSProperty("extras")
  void setExtras(ClassElement[] value);

  @Nullable
  <T extends Any> FinisherResult<T> finisher(FinisherClazz<T> clazz);

  @JSProperty("finisher")
  @Nullable
  Unknown /* < T > ( clazz : Constructor < T > ) => undefined | Constructor < T > */ getFinisher();

  @JSProperty("finisher")
  <T extends Any> void setFinisher(@Nullable Finisher<T> value);

  @JSProperty("finisher")
  void setFinisher(@Nullable FinisherFunction value);

  @JSProperty("descriptor")
  @Nullable
  PropertyDescriptor getDescriptor();

  @JSProperty("descriptor")
  void setDescriptor(@Nullable PropertyDescriptor value);

  abstract class Kind extends JsEnum {
    public static final Kind FIELD = JsEnum.of("field");

    public static final Kind METHOD = JsEnum.of("method");
  }

  abstract class Placement extends JsEnum {
    public static final Placement STATIC = JsEnum.of("static");

    public static final Placement PROTOTYPE = JsEnum.of("prototype");

    public static final Placement OWN = JsEnum.of("own");
  }

  interface FinisherResult<T extends Any> extends Any {
  }

  interface FinisherClazz<T extends Any> extends Any {
  }

  @FunctionalInterface
  @JSFunctor
  interface FinisherFunction extends Any {
    @Nullable
    <T extends Any> Unknown /* undefined */ apply(ApplyClazz<T> clazz);

    interface ApplyClazz<T extends Any> extends Any {
    }
  }

  interface Finisher<T extends Any> extends Any {
  }

  class Builder {
    private final ClassElement object = Any.empty();

    public ClassElement build() {
      return object;
    }

    public Builder kind(Kind value) {
      object.setKind(value);
      return this;
    }

    public Builder key(String value) {
      object.setKey(value);
      return this;
    }

    public Builder placement(Placement value) {
      object.setPlacement(value);
      return this;
    }

    public Builder initializer(@Nullable JsFunction value) {
      object.setInitializer(value);
      return this;
    }

    public Builder extras(ClassElement[] value) {
      object.setExtras(value);
      return this;
    }

    public <T extends Any> Builder finisher(@Nullable Finisher<T> value) {
      object.setFinisher(value);
      return this;
    }

    public Builder finisher(@Nullable FinisherFunction value) {
      object.setFinisher(value);
      return this;
    }

    public Builder descriptor(@Nullable PropertyDescriptor value) {
      object.setDescriptor(value);
      return this;
    }
  }
}
