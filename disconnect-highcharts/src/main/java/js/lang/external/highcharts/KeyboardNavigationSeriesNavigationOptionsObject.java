package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | number ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard navigation
 * of data points and series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface KeyboardNavigationSeriesNavigationOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
   * for the chart. Can be &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right
   * arrow keys move between points in a series, while up/down arrow keys move
   * between series. Up/down navigation acts intelligently to figure out which
   * series makes sense to move to from any given point.
   *
   * In &quot;serialize&quot; mode, points are instead navigated as a single list.
   * Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys will behave
   * like left/right. This can be useful for unifying navigation behavior
   * with/without screen readers enabled.
   *
   */
  @JSProperty("mode")
  @Nullable
  Mode getMode();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
   * for the chart. Can be &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right
   * arrow keys move between points in a series, while up/down arrow keys move
   * between series. Up/down navigation acts intelligently to figure out which
   * series makes sense to move to from any given point.
   *
   * In &quot;serialize&quot; mode, points are instead navigated as a single list.
   * Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys will behave
   * like left/right. This can be useful for unifying navigation behavior
   * with/without screen readers enabled.
   *
   */
  @JSProperty("mode")
  void setMode(@Nullable Mode value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
   * points than this, we no longer allow keyboard navigation for it.
   *
   * Set to <code>false</code> to disable.
   *
   */
  @JSProperty("pointNavigationEnabledThreshold")
  @Nullable
  Unknown /* ( boolean | number ) */ getPointNavigationEnabledThreshold();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
   * points than this, we no longer allow keyboard navigation for it.
   *
   * Set to <code>false</code> to disable.
   *
   */
  @JSProperty("pointNavigationEnabledThreshold")
  void setPointNavigationEnabledThreshold(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
   * points than this, we no longer allow keyboard navigation for it.
   *
   * Set to <code>false</code> to disable.
   *
   */
  @JSProperty("pointNavigationEnabledThreshold")
  void setPointNavigationEnabledThreshold(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
   * through points with the keyboard.
   *
   */
  @JSProperty("skipNullPoints")
  boolean getSkipNullPoints();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
   * through points with the keyboard.
   *
   */
  @JSProperty("skipNullPoints")
  void setSkipNullPoints(boolean value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Mode extends JsEnum {
    public static final Mode NORMAL = JsEnum.of("normal");

    public static final Mode SERIALIZE = JsEnum.of("serialize");
  }

  final class Builder {
    private final KeyboardNavigationSeriesNavigationOptionsObject object = Any.empty();

    private Builder() {
    }

    public KeyboardNavigationSeriesNavigationOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
     * for the chart. Can be &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right
     * arrow keys move between points in a series, while up/down arrow keys move
     * between series. Up/down navigation acts intelligently to figure out which
     * series makes sense to move to from any given point.
     *
     * In &quot;serialize&quot; mode, points are instead navigated as a single list.
     * Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys will behave
     * like left/right. This can be useful for unifying navigation behavior
     * with/without screen readers enabled.
     *
     */
    public Builder mode(@Nullable Mode value) {
      object.setMode(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
     * points than this, we no longer allow keyboard navigation for it.
     *
     * Set to <code>false</code> to disable.
     *
     */
    public Builder pointNavigationEnabledThreshold(boolean value) {
      object.setPointNavigationEnabledThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
     * points than this, we no longer allow keyboard navigation for it.
     *
     * Set to <code>false</code> to disable.
     *
     */
    public Builder pointNavigationEnabledThreshold(double value) {
      object.setPointNavigationEnabledThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
     * through points with the keyboard.
     *
     */
    public Builder skipNullPoints(boolean value) {
      object.setSkipNullPoints(value);
      return this;
    }
  }
}
