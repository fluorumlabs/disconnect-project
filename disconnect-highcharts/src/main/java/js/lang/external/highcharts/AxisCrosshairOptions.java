package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ColorType */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Configure a crosshair that follows
 * either the mouse pointer or the hovered point.
 *
 * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
 * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisCrosshairOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for the crosshair,
   * especially as a hook for styling.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for the crosshair,
   * especially as a hook for styling.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
   * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
   * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
   * default highlights the whole category.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ColorType */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
   * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
   * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
   * default highlights the whole category.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
   * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
   * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
   * default highlights the whole category.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
   * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
   * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
   * default highlights the whole category.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The dash style for the
   * crosshair. See plotOptions.series.dashStyle for possible values.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The dash style for the
   * crosshair. See plotOptions.series.dashStyle for possible values.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highstock) A label on the axis next to the crosshair.
   *
   * In styled mode, the label is styled with the
   * <code>.highcharts-crosshair-label</code> class.
   *
   */
  @JSProperty("label")
  @Nullable
  AxisCrosshairLabelOptions getLabel();

  /**
   * (Highstock) A label on the axis next to the crosshair.
   *
   * In styled mode, the label is styled with the
   * <code>.highcharts-crosshair-label</code> class.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable AxisCrosshairLabelOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the crosshair should
   * snap to the point or follow the pointer independent of points.
   *
   */
  @JSProperty("snap")
  boolean getSnap();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the crosshair should
   * snap to the point or follow the pointer independent of points.
   *
   */
  @JSProperty("snap")
  void setSnap(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the
   * crosshair. Defaults to 1 for numeric or datetime axes, and for one
   * category width for category axes.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the
   * crosshair. Defaults to 1 for numeric or datetime axes, and for one
   * category width for category axes.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the crosshair.
   * Higher Z indices allow drawing the crosshair on top of the series or
   * behind the grid lines.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the crosshair.
   * Higher Z indices allow drawing the crosshair on top of the series or
   * behind the grid lines.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AxisCrosshairOptions object = Any.empty();

    private Builder() {
    }

    public AxisCrosshairOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for the crosshair,
     * especially as a hook for styling.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
     * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
     * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
     * default highlights the whole category.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
     * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
     * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
     * default highlights the whole category.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
     * Defaults to <code>#cccccc</code> for numeric and datetime axes, and
     * <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by
     * default highlights the whole category.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The dash style for the
     * crosshair. See plotOptions.series.dashStyle for possible values.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highstock) A label on the axis next to the crosshair.
     *
     * In styled mode, the label is styled with the
     * <code>.highcharts-crosshair-label</code> class.
     *
     */
    public Builder label(@Nullable AxisCrosshairLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the crosshair should
     * snap to the point or follow the pointer independent of points.
     *
     */
    public Builder snap(boolean value) {
      object.setSnap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the
     * crosshair. Defaults to 1 for numeric or datetime axes, and for one
     * category width for category axes.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the crosshair.
     * Higher Z indices allow drawing the crosshair on top of the series or
     * behind the grid lines.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
