package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts-more.src.js"
)
public interface HighchartsMorePoint extends Point {
  /**
   * Range series only. The high or maximum value for each data point.
   *
   */
  @JSProperty("high")
  double getHigh();

  /**
   * Range series only. The high or maximum value for each data point.
   *
   */
  @JSProperty("high")
  void setHigh(double value);

  /**
   * Range series only. The low or minimum value for each data point.
   *
   */
  @JSProperty("low")
  double getLow();

  /**
   * Range series only. The low or minimum value for each data point.
   *
   */
  @JSProperty("low")
  void setLow(double value);
}
