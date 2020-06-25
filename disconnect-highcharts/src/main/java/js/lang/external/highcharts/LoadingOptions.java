package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
 * appearance of the loading screen that covers the plot area on chart
 * operations. This screen only appears after an explicit call to
 * <code>chart.showLoading()</code>. It is a utility for developers to communicate to the
 * end user that something is going on, for example while retrieving new data
 * via an XHR connection. The &quot;Loading...&quot; text itself is not part of this
 * configuration object, but part of the <code>lang</code> object.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LoadingOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
   * the fade out effect.
   *
   */
  @JSProperty("hideDuration")
  double getHideDuration();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
   * the fade out effect.
   *
   */
  @JSProperty("hideDuration")
  void setHideDuration(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
   * <code>span</code>.
   *
   */
  @JSProperty("labelStyle")
  @Nullable
  CSSObject getLabelStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
   * <code>span</code>.
   *
   */
  @JSProperty("labelStyle")
  void setLabelStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
   * the fade in effect.
   *
   */
  @JSProperty("showDuration")
  double getShowDuration();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
   * the fade in effect.
   *
   */
  @JSProperty("showDuration")
  void setShowDuration(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
   * screen that covers the plot area.
   *
   * In styled mode, the loading label is styled with the
   * <code>.highcharts-loading</code> class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
   * screen that covers the plot area.
   *
   * In styled mode, the loading label is styled with the
   * <code>.highcharts-loading</code> class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  class Builder {
    private final LoadingOptions object = Any.empty();

    public LoadingOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
     * the fade out effect.
     *
     */
    public Builder hideDuration(double value) {
      object.setHideDuration(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
     * <code>span</code>.
     *
     */
    public Builder labelStyle(@Nullable CSSObject value) {
      object.setLabelStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
     * the fade in effect.
     *
     */
    public Builder showDuration(double value) {
      object.setShowDuration(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
     * screen that covers the plot area.
     *
     * In styled mode, the loading label is styled with the
     * <code>.highcharts-loading</code> class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }
  }
}
