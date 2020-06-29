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
    symbols = {"factory as BollingerBands_factory", "Highcharts as BollingerBands_Highcharts", "isArray as BollingerBands_isArray"},
    module = "highcharts/es-modules/masters/indicators/bollinger-bands.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/indicators/bollinger-bands.src.js"
)
public interface BollingerBands extends Any {
  /**
   * Adds the module to the imported Highcharts namespace.
   *
   * @param highcharts
   * The imported Highcharts namespace to extend.
   *
   */
  @JSBody(
      params = {"highcharts"},
      script = "BollingerBands_factory(highcharts)"
  )
  static void factory(Highcharts highcharts) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return BollingerBands_Highcharts"
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
      script = "return BollingerBands_isArray(obj)"
  )
  static boolean isArray(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
