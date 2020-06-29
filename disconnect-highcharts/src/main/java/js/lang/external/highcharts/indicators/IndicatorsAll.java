package js.lang.external.highcharts.indicators;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* _Highcharts */;
import js.lang.external.highcharts.Highcharts;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"factory as IndicatorsAll_factory", "Highcharts as IndicatorsAll_Highcharts", "isArray as IndicatorsAll_isArray"},
    module = "highcharts/es-modules/masters/indicators/indicators-all.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/indicators/indicators-all.src.js"
)
public interface IndicatorsAll extends Any {
  /**
   * Adds the module to the imported Highcharts namespace.
   *
   * @param highcharts
   * The imported Highcharts namespace to extend.
   *
   */
  @JSBody(
      params = {"highcharts"},
      script = "IndicatorsAll_factory(highcharts)"
  )
  static void factory(Highcharts highcharts) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return IndicatorsAll_Highcharts"
  )
  static Unknown /* _Highcharts */ Highcharts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Utility function to check if an item is an array.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is an array.
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return IndicatorsAll_isArray(obj)"
  )
  static boolean isArray(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
