package js.lang.external.lit_element;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;

import javax.annotation.Nullable;

@FunctionalInterface
@JSFunctor
public interface FinisherFunction extends Any {
  @Nullable
  <T extends Any> Unknown /* undefined */ apply(ApplyClazz<T> clazz);

  interface ApplyClazz<T extends Any> extends Any {
  }
}
