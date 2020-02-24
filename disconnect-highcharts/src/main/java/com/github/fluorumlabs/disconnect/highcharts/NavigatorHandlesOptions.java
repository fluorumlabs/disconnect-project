package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for the handles for dragging the zoomed area.
 *
 * @see <a href="https://api.highcharts.com/highstock/navigator.handles">https://api.highcharts.com/highstock/navigator.handles</a>
 *
 */
public interface NavigatorHandlesOptions extends Any {
  /**
   * (Highstock) The fill for the handle.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.backgroundColor">https://api.highcharts.com/highstock/navigator.handles.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highstock) The fill for the handle.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.backgroundColor">https://api.highcharts.com/highstock/navigator.handles.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highstock) The fill for the handle.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.backgroundColor">https://api.highcharts.com/highstock/navigator.handles.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highstock) The fill for the handle.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.backgroundColor">https://api.highcharts.com/highstock/navigator.handles.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Highstock) The stroke for the handle border and the stripes inside.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.borderColor">https://api.highcharts.com/highstock/navigator.handles.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highstock) The stroke for the handle border and the stripes inside.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.borderColor">https://api.highcharts.com/highstock/navigator.handles.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highstock) Allows to enable/disable handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.enabled">https://api.highcharts.com/highstock/navigator.handles.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Allows to enable/disable handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.enabled">https://api.highcharts.com/highstock/navigator.handles.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Height for handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.height">https://api.highcharts.com/highstock/navigator.handles.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) Height for handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.height">https://api.highcharts.com/highstock/navigator.handles.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) The width for the handle border and the stripes inside.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.lineWidth">https://api.highcharts.com/highstock/navigator.handles.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) The width for the handle border and the stripes inside.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.lineWidth">https://api.highcharts.com/highstock/navigator.handles.lineWidth</a>
   *
   * @implspec lineWidth?: number;
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock) Array to define shapes of handles. 0-index for left, 1-index
   * for right.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.symbols">https://api.highcharts.com/highstock/navigator.handles.symbols</a>
   *
   * @implspec symbols?: Array<string>;
   *
   */
  @JSProperty("symbols")
  @Nullable
  String[] getSymbols();

  /**
   * (Highstock) Array to define shapes of handles. 0-index for left, 1-index
   * for right.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.symbols">https://api.highcharts.com/highstock/navigator.handles.symbols</a>
   *
   * @implspec symbols?: Array<string>;
   *
   */
  @JSProperty("symbols")
  void setSymbols(String[] value);

  /**
   * (Highstock) Width for handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.width">https://api.highcharts.com/highstock/navigator.handles.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highstock) Width for handles.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator.handles.width">https://api.highcharts.com/highstock/navigator.handles.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
