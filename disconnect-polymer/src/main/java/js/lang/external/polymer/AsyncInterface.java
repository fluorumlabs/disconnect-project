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
  @JSProperty("run")
  Run getRun();

  @JSProperty("run")
  void setRun(Run value);

  @JSProperty("cancel")
  Cancel getCancel();

  @JSProperty("cancel")
  void setCancel(Cancel value);

  @FunctionalInterface
  @JSFunctor
  interface Run extends Any {
    int apply(JsFunction fn, int delay);
  }

  @FunctionalInterface
  @JSFunctor
  interface Cancel extends Any {
    void apply(int handle);
  }

  class Builder {
    private final AsyncInterface object = Any.empty();

    public AsyncInterface build() {
      return object;
    }

    public Builder run(Run value) {
      object.setRun(value);
      return this;
    }

    public Builder cancel(Cancel value) {
      object.setCancel(value);
      return this;
    }
  }
}
