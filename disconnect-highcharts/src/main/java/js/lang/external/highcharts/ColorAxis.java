package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* _Highcharts */;
import org.teavm.jso.JSBody;

/**
 * The ColorAxis object for inclusion in gradient legends.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"factory as ColorAxis_factory", "Highcharts as ColorAxis_Highcharts", "ColorAxis as ColorAxis_ColorAxis"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ColorAxis extends Any {
  /**
   * The ColorAxis object for inclusion in gradient legends.
   *
   * @param chart
   * The related chart of the color axis.
   *
   * @param userOptions
   * The color axis options for initialization.
   *
   */
  @JSBody(
      params = {"chart", "userOptions"},
      script = "return new ColorAxis_ColorAxis(chart, userOptions)"
  )
  static ColorAxis create(Chart chart, ColorAxisOptions userOptions) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Adds the module to the imported Highcharts namespace.
   *
   * @param highcharts
   * The imported Highcharts namespace to extend.
   *
   */
  @JSBody(
      params = {"highcharts"},
      script = "ColorAxis_factory(highcharts)"
  )
  static void factory(Highcharts highcharts) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return ColorAxis_Highcharts"
  )
  static Unknown /* _Highcharts */ Highcharts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
