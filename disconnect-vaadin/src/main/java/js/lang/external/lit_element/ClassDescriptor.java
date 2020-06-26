package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * @license
 * Copyright (c) 2017 The Polymer Project Authors. All rights reserved.
 * This code may only be used under the BSD style license found at
 * <a href="http://polymer.github.io/LICENSE.txt">http://polymer.github.io/LICENSE.txt</a>
 * The complete set of authors may be found at
 * <a href="http://polymer.github.io/AUTHORS.txt">http://polymer.github.io/AUTHORS.txt</a>
 * The complete set of contributors may be found at
 * <a href="http://polymer.github.io/CONTRIBUTORS.txt">http://polymer.github.io/CONTRIBUTORS.txt</a>
 * Code distributed by Google as part of the polymer project is also
 * subject to an additional IP rights grant found at
 * <a href="http://polymer.github.io/PATENTS.txt">http://polymer.github.io/PATENTS.txt</a>
 *
 */
@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/decorators.js"
)
public interface ClassDescriptor extends Any {
  @JSProperty("kind")
  Kind getKind();

  @JSProperty("kind")
  void setKind(Kind value);

  @JSProperty("elements")
  ClassElement[] getElements();

  @JSProperty("elements")
  void setElements(ClassElement[] value);

  @Nullable
  <T extends Any> FinisherResult<T> finisher(FinisherClazz<T> clazz);

  @JSProperty("finisher")
  @Nullable
  Unknown /* < T > ( clazz : Constructor < T > ) => undefined | Constructor < T > */ getFinisher();

  @JSProperty("finisher")
  <T extends Any> void setFinisher(@Nullable Finisher<T> value);

  @JSProperty("finisher")
  void setFinisher(@Nullable FinisherFunction value);

  abstract class Kind extends JsEnum {
    public static final Kind CLASS = JsEnum.of("class");
  }

  interface FinisherResult<T extends Any>  extends Any {
  }

  interface FinisherClazz<T extends Any>  extends Any {
  }

  @FunctionalInterface
  @JSFunctor
  interface FinisherFunction extends Any {
    @Nullable
    <T extends Any> Unknown /* undefined */ apply(ApplyClazz<T> clazz);

    interface ApplyClazz<T extends Any>  extends Any {
    }
  }

  interface Finisher<T extends Any>  extends Any {
  }

  class Builder {
    private final ClassDescriptor object = Any.empty();

    public ClassDescriptor build() {
      return object;
    }

    public Builder kind(Kind value) {
      object.setKind(value);
      return this;
    }

    public Builder elements(ClassElement[] value) {
      object.setElements(value);
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
  }
}
