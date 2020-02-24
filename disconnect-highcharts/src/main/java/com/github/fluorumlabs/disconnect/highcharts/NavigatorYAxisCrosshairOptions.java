package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Configure a crosshair that follows either the mouse pointer or
 * the hovered point.
 *
 * In styled mode, the crosshairs are styled in the <code>.highcharts-crosshair</code>,
 * <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair">https://api.highcharts.com/highstock/navigator.yAxis.crosshair</a>
 *
 */
public interface NavigatorYAxisCrosshairOptions extends Any {
  /**
   * (Highstock) A class name for the crosshair, especially as a hook for
   * styling.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.className">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highstock) A class name for the crosshair, especially as a hook for
   * styling.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.className">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.className</a>
   *
   * @implspec className?: string;
   *
   */
  @JSProperty("className")
  void setClassName(String value);

  /**
   * (Highstock) The color of the crosshair. Defaults to <code>#cccccc</code> for numeric
   * and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where
   * the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highstock) The color of the crosshair. Defaults to <code>#cccccc</code> for numeric
   * and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where
   * the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highstock) The color of the crosshair. Defaults to <code>#cccccc</code> for numeric
   * and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where
   * the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highstock) The color of the crosshair. Defaults to <code>#cccccc</code> for numeric
   * and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where
   * the crosshair by default highlights the whole category.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highstock) The dash style for the crosshair. See series.dashStyle for
   * possible values.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.dashStyle">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.dashStyle</a>
   *
   * @implspec dashStyle?: (&quot;Dash&quot;|&quot;DashDot&quot;|&quot;Dot&quot;|&quot;LongDash&quot;|&quot;LongDashDot&quot;|&quot;LongDashDotDot&quot;|&quot;ShortDash&quot;|&quot;ShortDashDot&quot;|&quot;ShortDashDotDot&quot;|&quot;ShortDot&quot;|&quot;Solid&quot;);
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highstock) The dash style for the crosshair. See series.dashStyle for
   * possible values.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.dashStyle">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.dashStyle</a>
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
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.label">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.label</a>
   *
   * @implspec label?: NavigatorYAxisCrosshairLabelOptions;
   *
   */
  @JSProperty("label")
  @Nullable
  NavigatorYAxisCrosshairLabelOptions getLabel();

  /**
   * (Highstock) A label on the axis next to the crosshair.
   *
   * In styled mode, the label is styled with the
   * <code>.highcharts-crosshair-label</code> class.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.label">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.label</a>
   *
   * @implspec label?: NavigatorYAxisCrosshairLabelOptions;
   *
   */
  @JSProperty("label")
  void setLabel(NavigatorYAxisCrosshairLabelOptions value);

  /**
   * (Highstock) Whether the crosshair should snap to the point or follow the
   * pointer independent of points.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.snap">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.snap</a>
   *
   * @implspec snap?: boolean;
   *
   */
  @JSProperty("snap")
  boolean getSnap();

  /**
   * (Highstock) Whether the crosshair should snap to the point or follow the
   * pointer independent of points.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.snap">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.snap</a>
   *
   * @implspec snap?: boolean;
   *
   */
  @JSProperty("snap")
  void setSnap(boolean value);

  /**
   * (Highstock) The pixel width of the crosshair. Defaults to 1 for numeric
   * or datetime axes, and for one category width for category axes.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.width">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highstock) The pixel width of the crosshair. Defaults to 1 for numeric
   * or datetime axes, and for one category width for category axes.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.width">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highstock) The Z index of the crosshair. Higher Z indices allow drawing
   * the crosshair on top of the series or behind the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.zIndex">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highstock) The Z index of the crosshair. Higher Z indices allow drawing
   * the crosshair on top of the series or behind the grid lines.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.yAxis.crosshair.zIndex">https://api.highcharts.com/highstock/navigator.yAxis.crosshair.zIndex</a>
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
