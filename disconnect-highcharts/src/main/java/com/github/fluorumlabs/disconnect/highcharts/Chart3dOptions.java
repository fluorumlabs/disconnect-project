package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options to render charts in 3 dimensions. This feature requires
 * <code>highcharts-3d.js</code>, found in the download package or online at
 * code.highcharts.com/highcharts-3d.js.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.options3d">https://api.highcharts.com/highcharts/chart.options3d</a>
 *
 */
public interface Chart3dOptions extends Any {
  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.alpha">https://api.highcharts.com/highcharts/chart.options3d.alpha</a>
   *
   * @implspec alpha?: number;
   *
   */
  @JSProperty("alpha")
  double getAlpha();

  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.alpha">https://api.highcharts.com/highcharts/chart.options3d.alpha</a>
   *
   * @implspec alpha?: number;
   *
   */
  @JSProperty("alpha")
  void setAlpha(double value);

  /**
   * (Highcharts) Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the
   * best edge.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.axisLabelPosition">https://api.highcharts.com/highcharts/chart.options3d.axisLabelPosition</a>
   *
   * @implspec axisLabelPosition?: (&quot;auto&quot;|null);
   *
   */
  @JSProperty("axisLabelPosition")
  @Nullable
  AxisLabelPosition getAxisLabelPosition();

  /**
   * (Highcharts) Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the
   * best edge.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.axisLabelPosition">https://api.highcharts.com/highcharts/chart.options3d.axisLabelPosition</a>
   *
   * @implspec axisLabelPosition?: (&quot;auto&quot;|null);
   *
   */
  @JSProperty("axisLabelPosition")
  void setAxisLabelPosition(AxisLabelPosition value);

  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.beta">https://api.highcharts.com/highcharts/chart.options3d.beta</a>
   *
   * @implspec beta?: number;
   *
   */
  @JSProperty("beta")
  double getBeta();

  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.beta">https://api.highcharts.com/highcharts/chart.options3d.beta</a>
   *
   * @implspec beta?: number;
   *
   */
  @JSProperty("beta")
  void setBeta(double value);

  /**
   * (Highcharts) The total depth of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.depth">https://api.highcharts.com/highcharts/chart.options3d.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) The total depth of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.depth">https://api.highcharts.com/highcharts/chart.options3d.depth</a>
   *
   * @implspec depth?: number;
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

  /**
   * (Highcharts) Wether to render the chart using the 3D functionality.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.enabled">https://api.highcharts.com/highcharts/chart.options3d.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Wether to render the chart using the 3D functionality.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.enabled">https://api.highcharts.com/highcharts/chart.options3d.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) Whether the 3d box should automatically adjust to the chart
   * plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.fitToPlot">https://api.highcharts.com/highcharts/chart.options3d.fitToPlot</a>
   *
   * @implspec fitToPlot?: boolean;
   *
   */
  @JSProperty("fitToPlot")
  boolean getFitToPlot();

  /**
   * (Highcharts) Whether the 3d box should automatically adjust to the chart
   * plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.fitToPlot">https://api.highcharts.com/highcharts/chart.options3d.fitToPlot</a>
   *
   * @implspec fitToPlot?: boolean;
   *
   */
  @JSProperty("fitToPlot")
  void setFitToPlot(boolean value);

  /**
   * (Highcharts) Provides the option to draw a frame around the charts by
   * defining a bottom, front and back panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame">https://api.highcharts.com/highcharts/chart.options3d.frame</a>
   *
   * @implspec frame?: Chart3dFrameOptions;
   *
   */
  @JSProperty("frame")
  @Nullable
  Chart3dFrameOptions getFrame();

  /**
   * (Highcharts) Provides the option to draw a frame around the charts by
   * defining a bottom, front and back panel.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.frame">https://api.highcharts.com/highcharts/chart.options3d.frame</a>
   *
   * @implspec frame?: Chart3dFrameOptions;
   *
   */
  @JSProperty("frame")
  void setFrame(Chart3dFrameOptions value);

  /**
   * (Highcharts) Defines the distance the viewer is standing in front of the
   * chart, this setting is important to calculate the perspective effect in
   * column and scatter charts. It is not used for 3D pie charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.viewDistance">https://api.highcharts.com/highcharts/chart.options3d.viewDistance</a>
   *
   * @implspec viewDistance?: number;
   *
   */
  @JSProperty("viewDistance")
  double getViewDistance();

  /**
   * (Highcharts) Defines the distance the viewer is standing in front of the
   * chart, this setting is important to calculate the perspective effect in
   * column and scatter charts. It is not used for 3D pie charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.options3d.viewDistance">https://api.highcharts.com/highcharts/chart.options3d.viewDistance</a>
   *
   * @implspec viewDistance?: number;
   *
   */
  @JSProperty("viewDistance")
  void setViewDistance(double value);

  /**
   */
  abstract class AxisLabelPosition extends JsEnum {
    public static final AxisLabelPosition AUTO = JsEnum.of("auto");
  }
}
