package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface BoostOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If set to true, the whole chart
   * will be boosted if one of the series crosses its threshold, and all the
   * series can be boosted.
   *
   */
  @JSProperty("allowForce")
  boolean getAllowForce();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If set to true, the whole chart
   * will be boosted if one of the series crosses its threshold, and all the
   * series can be boosted.
   *
   */
  @JSProperty("allowForce")
  void setAllowForce(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost.
   * Useful for benchmarking, and general timing.
   *
   */
  @JSProperty("debug")
  @Nullable
  BoostDebugOptions getDebug();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost.
   * Useful for benchmarking, and general timing.
   *
   */
  @JSProperty("debug")
  void setDebug(@Nullable BoostDebugOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable boost on a
   * chart.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable boost on a
   * chart.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set the series threshold for
   * when the boost should kick in globally.
   *
   * Setting to e.g. 20 will cause the whole chart to enter boost mode if
   * there are 20 or more series active. When the chart is in boost mode,
   * every series in it will be rendered to a common canvas. This offers a
   * significant speed improvment in charts with a very high amount of series.
   *
   */
  @JSProperty("seriesThreshold")
  double getSeriesThreshold();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set the series threshold for
   * when the boost should kick in globally.
   *
   * Setting to e.g. 20 will cause the whole chart to enter boost mode if
   * there are 20 or more series active. When the chart is in boost mode,
   * every series in it will be rendered to a common canvas. This offers a
   * significant speed improvment in charts with a very high amount of series.
   *
   */
  @JSProperty("seriesThreshold")
  void setSeriesThreshold(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable GPU
   * translations. GPU translations are faster than doing the translation in
   * JavaScript.
   *
   * This option may cause rendering issues with certain datasets. Namely, if
   * your dataset has large numbers with small increments (such as
   * timestamps), it won't work correctly. This is due to floating point
   * precission.
   *
   */
  @JSProperty("useGPUTranslations")
  boolean getUseGPUTranslations();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable GPU
   * translations. GPU translations are faster than doing the translation in
   * JavaScript.
   *
   * This option may cause rendering issues with certain datasets. Namely, if
   * your dataset has large numbers with small increments (such as
   * timestamps), it won't work correctly. This is due to floating point
   * precission.
   *
   */
  @JSProperty("useGPUTranslations")
  void setUseGPUTranslations(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable pre-allocation
   * of vertex buffers.
   *
   * Enabling this will make it so that the binary data arrays required for
   * storing the series data will be allocated prior to transforming the data
   * to a WebGL-compatible format.
   *
   * This saves a copy operation on the order of O(n) and so is significantly
   * more performant. However, this is currently an experimental option, and
   * may cause visual artifacts with some datasets.
   *
   * As such, care should be taken when using this setting to make sure that
   * it doesn't cause any rendering glitches with the given use-case.
   *
   */
  @JSProperty("usePreallocated")
  boolean getUsePreallocated();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable pre-allocation
   * of vertex buffers.
   *
   * Enabling this will make it so that the binary data arrays required for
   * storing the series data will be allocated prior to transforming the data
   * to a WebGL-compatible format.
   *
   * This saves a copy operation on the order of O(n) and so is significantly
   * more performant. However, this is currently an experimental option, and
   * may cause visual artifacts with some datasets.
   *
   * As such, care should be taken when using this setting to make sure that
   * it doesn't cause any rendering glitches with the given use-case.
   *
   */
  @JSProperty("usePreallocated")
  void setUsePreallocated(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final BoostOptions object = Any.empty();

    private Builder() {
    }

    public BoostOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) If set to true, the whole chart
     * will be boosted if one of the series crosses its threshold, and all the
     * series can be boosted.
     *
     */
    public Builder allowForce(boolean value) {
      object.setAllowForce(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost.
     * Useful for benchmarking, and general timing.
     *
     */
    public Builder debug(@Nullable BoostDebugOptions value) {
      object.setDebug(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable boost on a
     * chart.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set the series threshold for
     * when the boost should kick in globally.
     *
     * Setting to e.g. 20 will cause the whole chart to enter boost mode if
     * there are 20 or more series active. When the chart is in boost mode,
     * every series in it will be rendered to a common canvas. This offers a
     * significant speed improvment in charts with a very high amount of series.
     *
     */
    public Builder seriesThreshold(double value) {
      object.setSeriesThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable GPU
     * translations. GPU translations are faster than doing the translation in
     * JavaScript.
     *
     * This option may cause rendering issues with certain datasets. Namely, if
     * your dataset has large numbers with small increments (such as
     * timestamps), it won't work correctly. This is due to floating point
     * precission.
     *
     */
    public Builder useGPUTranslations(boolean value) {
      object.setUseGPUTranslations(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable pre-allocation
     * of vertex buffers.
     *
     * Enabling this will make it so that the binary data arrays required for
     * storing the series data will be allocated prior to transforming the data
     * to a WebGL-compatible format.
     *
     * This saves a copy operation on the order of O(n) and so is significantly
     * more performant. However, this is currently an experimental option, and
     * may cause visual artifacts with some datasets.
     *
     * As such, care should be taken when using this setting to make sure that
     * it doesn't cause any rendering glitches with the given use-case.
     *
     */
    public Builder usePreallocated(boolean value) {
      object.setUsePreallocated(value);
      return this;
    }
  }
}
