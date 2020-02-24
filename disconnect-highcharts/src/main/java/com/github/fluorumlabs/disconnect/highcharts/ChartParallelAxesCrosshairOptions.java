package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Configure a crosshair that follows either the mouse pointer or
 * the hovered point.
 *
 * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
 * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair</a>
 *
 */
public interface ChartParallelAxesCrosshairOptions extends Any {
  /**
   * (Highcharts) A class name for the crosshair, especially as a hook for
   * styling.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.className">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts) A class name for the crosshair, especially as a hook for
   * styling.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.className">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highcharts) The color of the crosshair. Defaults to <code>#cccccc</code> for
   * numeric and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category
   * axes, where the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The color of the crosshair. Defaults to <code>#cccccc</code> for
   * numeric and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category
   * axes, where the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The color of the crosshair. Defaults to <code>#cccccc</code> for
   * numeric and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category
   * axes, where the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The color of the crosshair. Defaults to <code>#cccccc</code> for
   * numeric and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category
   * axes, where the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) The dash style for the crosshair. See series.dashStyle for
   * possible values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.dashStyle">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts) The dash style for the crosshair. See series.dashStyle for
   * possible values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.dashStyle">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(DashStyle value);

  /**
   * (Highstock) A label on the axis next to the crosshair.
   *
   * In styled mode, the label is styled with the
   * <code>.highcharts-crosshair-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label</a>
   *
   * @implspec label?: ChartParallelAxesCrosshairLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  ChartParallelAxesCrosshairLabelOptions getLabel();

  /**
   * (Highstock) A label on the axis next to the crosshair.
   *
   * In styled mode, the label is styled with the
   * <code>.highcharts-crosshair-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label">https://api.highcharts.com/highstock/chart.parallelAxes.crosshair.label</a>
   *
   * @implspec label?: ChartParallelAxesCrosshairLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(ChartParallelAxesCrosshairLabelOptions value);

  /**
   * (Highcharts) Whether the crosshair should snap to the point or follow the
   * pointer independent of points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.snap">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.snap</a>
   *
   * @implspec snap?: boolean;
   *
   */
  @JSProperty("snap")
  boolean getSnap();

  /**
   * (Highcharts) Whether the crosshair should snap to the point or follow the
   * pointer independent of points.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.snap">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.snap</a>
   *
   * @implspec snap?: boolean;
   *
   */
  @JSProperty("snap")
  void setSnap(boolean value);

  /**
   * (Highcharts) The pixel width of the crosshair. Defaults to 1 for numeric
   * or datetime axes, and for one category width for category axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.width">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts) The pixel width of the crosshair. Defaults to 1 for numeric
   * or datetime axes, and for one category width for category axes.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.width">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts) The Z index of the crosshair. Higher Z indices allow drawing
   * the crosshair on top of the series or behind the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.zIndex">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts) The Z index of the crosshair. Higher Z indices allow drawing
   * the crosshair on top of the series or behind the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.zIndex">https://api.highcharts.com/highcharts/chart.parallelAxes.crosshair.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   */
  abstract class DashStyle extends JsEnum {
    public static final DashStyle DASH = JsEnum.of("Dash");

    public static final DashStyle DASHDOT = JsEnum.of("DashDot");

    public static final DashStyle DOT = JsEnum.of("Dot");

    public static final DashStyle LONGDASH = JsEnum.of("LongDash");

    public static final DashStyle LONGDASHDOT = JsEnum.of("LongDashDot");

    public static final DashStyle LONGDASHDOTDOT = JsEnum.of("LongDashDotDot");

    public static final DashStyle SHORTDASH = JsEnum.of("ShortDash");

    public static final DashStyle SHORTDASHDOT = JsEnum.of("ShortDashDot");

    public static final DashStyle SHORTDASHDOTDOT = JsEnum.of("ShortDashDotDot");

    public static final DashStyle SHORTDOT = JsEnum.of("ShortDot");

    public static final DashStyle SOLID = JsEnum.of("Solid");
  }
}
