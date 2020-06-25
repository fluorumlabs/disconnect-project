package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the series data sorting.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotLinearregressionangleDataSortingOptions extends Any {
  /**
   * (Highcharts, Highstock) Enable or disable data sorting for the series.
   * Use xAxis.reversed to change the sorting order.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable data sorting for the series.
   * Use xAxis.reversed to change the sorting order.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) Whether to allow matching points by name in an
   * update. If this option is disabled, points will be matched by order.
   *
   */
  @JSProperty("matchByName")
  boolean getMatchByName();

  /**
   * (Highcharts, Highstock) Whether to allow matching points by name in an
   * update. If this option is disabled, points will be matched by order.
   *
   */
  @JSProperty("matchByName")
  void setMatchByName(boolean value);

  /**
   * (Highcharts, Highstock) Determines what data value should be used to sort
   * by.
   *
   */
  @JSProperty("sortKey")
  @Nullable
  String getSortKey();

  /**
   * (Highcharts, Highstock) Determines what data value should be used to sort
   * by.
   *
   */
  @JSProperty("sortKey")
  void setSortKey(@Nullable String value);

  class Builder {
    private final PlotLinearregressionangleDataSortingOptions object = Any.empty();

    public PlotLinearregressionangleDataSortingOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Enable or disable data sorting for the series.
     * Use xAxis.reversed to change the sorting order.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Whether to allow matching points by name in an
     * update. If this option is disabled, points will be matched by order.
     *
     */
    public Builder matchByName(boolean value) {
      object.setMatchByName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Determines what data value should be used to sort
     * by.
     *
     */
    public Builder sortKey(@Nullable String value) {
      object.setSortKey(value);
      return this;
    }
  }
}
