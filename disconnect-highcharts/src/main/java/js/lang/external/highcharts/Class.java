package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

/**
 * Interface description for a class.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Class as Class_Class"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Class<T extends Any> extends JsFunction {
  /**
   * Class costructor.
   *
   * @param args
   * Constructor arguments.
   *
   * @return Class instance.
   *
   */
  @JSBody(
      params = {"args"},
      script = "return Class_Class.apply(null, args)"
  )
  static <T extends Any> T create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
