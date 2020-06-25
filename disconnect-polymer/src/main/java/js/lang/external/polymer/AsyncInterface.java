package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface AsyncInterface extends Any {
  int run(JsFunction fn, int delay);

  /**
   *
   */
  int run(JsFunction fn);

  @JSProperty("run")
  RunFn getRun();

  @JSProperty("run")
  void setRun(RunFn value);

  void cancel(int handle);

  @JSProperty("cancel")
  CancelFn getCancel();

  @JSProperty("cancel")
  void setCancel(CancelFn value);

  @FunctionalInterface
  @JSFunctor
  interface RunFn extends Any {
    int apply(JsFunction fn, int delay);
  }

  @FunctionalInterface
  @JSFunctor
  interface CancelFn extends Any {
    void apply(int handle);
  }

  class Builder {
    private final AsyncInterface object = Any.empty();

    public AsyncInterface build() {
      return object;
    }

    public Builder run(RunFn value) {
      object.setRun(value);
      return this;
    }

    public Builder cancel(CancelFn value) {
      object.setCancel(value);
      return this;
    }
  }
}
