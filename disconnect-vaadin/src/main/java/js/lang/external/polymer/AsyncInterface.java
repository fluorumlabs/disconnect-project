package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface AsyncInterface extends Any {
  double run(JsFunction fn, double delay);

  /**
   *
   */
  double run(JsFunction fn);

  void cancel(double handle);

  class Builder {
    private final AsyncInterface object = Any.empty();

    public AsyncInterface build() {
      return object;
    }
  }
}
