package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or navigation
 * appearing when the legend is overflown. Navigation works well on screen, but
 * not in static exported images. One way of working around that is to increase
 * the chart height in export.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendNavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
   * down arrow in the legend page navigation.
   *
   */
  @JSProperty("activeColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getActiveColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
   * down arrow in the legend page navigation.
   *
   */
  @JSProperty("activeColor")
  void setActiveColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
   * down arrow in the legend page navigation.
   *
   */
  @JSProperty("activeColor")
  void setActiveColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
   * down arrow in the legend page navigation.
   *
   */
  @JSProperty("activeColor")
  void setActiveColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
   * navigating up or down. A value of <code>true</code> applies the default navigation
   * given in the <code>chart.animation</code> option. Additional options can be given as
   * an object containing values for easing and duration.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
   * navigating up or down. A value of <code>true</code> applies the default navigation
   * given in the <code>chart.animation</code> option. Additional options can be given as
   * an object containing values for easing and duration.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
   * navigating up or down. A value of <code>true</code> applies the default navigation
   * given in the <code>chart.animation</code> option. Additional options can be given as
   * an object containing values for easing and duration.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
   * down arrows in the legend paging navigation.
   *
   */
  @JSProperty("arrowSize")
  double getArrowSize();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
   * down arrows in the legend paging navigation.
   *
   */
  @JSProperty("arrowSize")
  void setArrowSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
   * navigation. In most cases, disabling the navigation results in an
   * unwanted overflow.
   *
   * See also the adapt chart to legend plugin for a solution to extend the
   * chart height to make room for the legend, optionally in exported charts
   * only.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
   * navigation. In most cases, disabling the navigation results in an
   * unwanted overflow.
   *
   * See also the adapt chart to legend plugin for a solution to extend the
   * chart height to make room for the legend, optionally in exported charts
   * only.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
   * down arrow in the legend page navigation. .
   *
   */
  @JSProperty("inactiveColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getInactiveColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
   * down arrow in the legend page navigation. .
   *
   */
  @JSProperty("inactiveColor")
  void setInactiveColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
   * down arrow in the legend page navigation. .
   *
   */
  @JSProperty("inactiveColor")
  void setInactiveColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
   * down arrow in the legend page navigation. .
   *
   */
  @JSProperty("inactiveColor")
  void setInactiveColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
   * navigation.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
   * navigation.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LegendNavigationOptions object = Any.empty();

    private Builder() {
    }

    public LegendNavigationOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
     * down arrow in the legend page navigation.
     *
     */
    public Builder activeColor(@Nullable PatternObject value) {
      object.setActiveColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
     * down arrow in the legend page navigation.
     *
     */
    public Builder activeColor(@Nullable String value) {
      object.setActiveColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
     * down arrow in the legend page navigation.
     *
     */
    public Builder activeColor(@Nullable GradientColorObject value) {
      object.setActiveColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
     * navigating up or down. A value of <code>true</code> applies the default navigation
     * given in the <code>chart.animation</code> option. Additional options can be given as
     * an object containing values for easing and duration.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
     * navigating up or down. A value of <code>true</code> applies the default navigation
     * given in the <code>chart.animation</code> option. Additional options can be given as
     * an object containing values for easing and duration.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
     * down arrows in the legend paging navigation.
     *
     */
    public Builder arrowSize(double value) {
      object.setArrowSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
     * navigation. In most cases, disabling the navigation results in an
     * unwanted overflow.
     *
     * See also the adapt chart to legend plugin for a solution to extend the
     * chart height to make room for the legend, optionally in exported charts
     * only.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
     * down arrow in the legend page navigation. .
     *
     */
    public Builder inactiveColor(@Nullable PatternObject value) {
      object.setInactiveColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
     * down arrow in the legend page navigation. .
     *
     */
    public Builder inactiveColor(@Nullable String value) {
      object.setInactiveColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
     * down arrow in the legend page navigation. .
     *
     */
    public Builder inactiveColor(@Nullable GradientColorObject value) {
      object.setInactiveColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
     * navigation.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }
  }
}
