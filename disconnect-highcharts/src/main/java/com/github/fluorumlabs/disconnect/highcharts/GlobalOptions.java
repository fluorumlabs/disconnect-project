package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

public interface GlobalOptions extends Any {
  /**
   * (Highcharts, Highmaps) <em>Canvg rendering for Android 2.x is removed as of
   * Highcharts 5.0. Use the libURL option to configure exporting.</em>
   *
   * The URL to the additional file to lazy load for Android 2.x devices.
   * These devices don't support SVG, so we download a helper file that
   * contains canvg, its dependency rbcolor, and our own CanVG Renderer class.
   * To avoid hotlinking to our site, you can install canvas-tools.js on your
   * own server and change this option accordingly.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.canvasToolsURL">https://api.highcharts.com/highcharts/global.canvasToolsURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/global.canvasToolsURL">https://api.highcharts.com/highmaps/global.canvasToolsURL</a>
   *
   * @implspec canvasToolsURL?: string;
   *
   */
  @JSProperty("canvasToolsURL")
  @Nullable
  String getCanvasToolsURL();

  /**
   * (Highcharts, Highmaps) <em>Canvg rendering for Android 2.x is removed as of
   * Highcharts 5.0. Use the libURL option to configure exporting.</em>
   *
   * The URL to the additional file to lazy load for Android 2.x devices.
   * These devices don't support SVG, so we download a helper file that
   * contains canvg, its dependency rbcolor, and our own CanVG Renderer class.
   * To avoid hotlinking to our site, you can install canvas-tools.js on your
   * own server and change this option accordingly.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.canvasToolsURL">https://api.highcharts.com/highcharts/global.canvasToolsURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/global.canvasToolsURL">https://api.highcharts.com/highmaps/global.canvasToolsURL</a>
   *
   * @implspec canvasToolsURL?: string;
   *
   */
  @JSProperty("canvasToolsURL")
  void setCanvasToolsURL(String value);

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.Date that supports individual time settings per chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.Date">https://api.highcharts.com/highcharts/global.Date</a>
   * @see <a href="https://api.highcharts.com/highstock/global.Date">https://api.highcharts.com/highstock/global.Date</a>
   *
   * @implspec Date?: () =&gt; void;
   *
   */
  @JSProperty("Date")
  @Nullable
  Date getDate();

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.Date that supports individual time settings per chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.Date">https://api.highcharts.com/highcharts/global.Date</a>
   * @see <a href="https://api.highcharts.com/highstock/global.Date">https://api.highcharts.com/highstock/global.Date</a>
   *
   * @implspec Date?: () =&gt; void;
   *
   */
  @JSProperty("Date")
  void setDate(Date value);

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.getTimezoneOffset that supports individual time settings per
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.getTimezoneOffset">https://api.highcharts.com/highcharts/global.getTimezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/global.getTimezoneOffset">https://api.highcharts.com/highstock/global.getTimezoneOffset</a>
   *
   * @implspec getTimezoneOffset?: () =&gt; void;
   *
   */
  @JSProperty("getTimezoneOffset")
  @Nullable
  GetTimezoneOffset getGetTimezoneOffset();

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.getTimezoneOffset that supports individual time settings per
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.getTimezoneOffset">https://api.highcharts.com/highcharts/global.getTimezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/global.getTimezoneOffset">https://api.highcharts.com/highstock/global.getTimezoneOffset</a>
   *
   * @implspec getTimezoneOffset?: () =&gt; void;
   *
   */
  @JSProperty("getTimezoneOffset")
  void setGetTimezoneOffset(GetTimezoneOffset value);

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.timezone that supports individual time settings per chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.timezone">https://api.highcharts.com/highcharts/global.timezone</a>
   * @see <a href="https://api.highcharts.com/highstock/global.timezone">https://api.highcharts.com/highstock/global.timezone</a>
   *
   * @implspec timezone?: string;
   *
   */
  @JSProperty("timezone")
  @Nullable
  String getTimezone();

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.timezone that supports individual time settings per chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.timezone">https://api.highcharts.com/highcharts/global.timezone</a>
   * @see <a href="https://api.highcharts.com/highstock/global.timezone">https://api.highcharts.com/highstock/global.timezone</a>
   *
   * @implspec timezone?: string;
   *
   */
  @JSProperty("timezone")
  void setTimezone(String value);

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.timezoneOffset that supports individual time settings per chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.timezoneOffset">https://api.highcharts.com/highcharts/global.timezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/global.timezoneOffset">https://api.highcharts.com/highstock/global.timezoneOffset</a>
   *
   * @implspec timezoneOffset?: number;
   *
   */
  @JSProperty("timezoneOffset")
  double getTimezoneOffset();

  /**
   * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
   * use time.timezoneOffset that supports individual time settings per chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.timezoneOffset">https://api.highcharts.com/highcharts/global.timezoneOffset</a>
   * @see <a href="https://api.highcharts.com/highstock/global.timezoneOffset">https://api.highcharts.com/highstock/global.timezoneOffset</a>
   *
   * @implspec timezoneOffset?: number;
   *
   */
  @JSProperty("timezoneOffset")
  void setTimezoneOffset(double value);

  /**
   * (Highcharts, Highstock, Highmaps) This option is deprecated since v6.0.5.
   * Instead, use time.useUTC that supports individual time settings per
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.useUTC">https://api.highcharts.com/highcharts/global.useUTC</a>
   * @see <a href="https://api.highcharts.com/highstock/global.useUTC">https://api.highcharts.com/highstock/global.useUTC</a>
   * @see <a href="https://api.highcharts.com/highmaps/global.useUTC">https://api.highcharts.com/highmaps/global.useUTC</a>
   *
   * @implspec useUTC?: boolean;
   *
   */
  @JSProperty("useUTC")
  boolean getUseUTC();

  /**
   * (Highcharts, Highstock, Highmaps) This option is deprecated since v6.0.5.
   * Instead, use time.useUTC that supports individual time settings per
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.useUTC">https://api.highcharts.com/highcharts/global.useUTC</a>
   * @see <a href="https://api.highcharts.com/highstock/global.useUTC">https://api.highcharts.com/highstock/global.useUTC</a>
   * @see <a href="https://api.highcharts.com/highmaps/global.useUTC">https://api.highcharts.com/highmaps/global.useUTC</a>
   *
   * @implspec useUTC?: boolean;
   *
   */
  @JSProperty("useUTC")
  void setUseUTC(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Path to the pattern image required by
   * VML browsers in order to draw radial gradients.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.VMLRadialGradientURL">https://api.highcharts.com/highcharts/global.VMLRadialGradientURL</a>
   * @see <a href="https://api.highcharts.com/highstock/global.VMLRadialGradientURL">https://api.highcharts.com/highstock/global.VMLRadialGradientURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/global.VMLRadialGradientURL">https://api.highcharts.com/highmaps/global.VMLRadialGradientURL</a>
   *
   * @implspec VMLRadialGradientURL?: string;
   *
   */
  @JSProperty("VMLRadialGradientURL")
  @Nullable
  String getVMLRadialGradientURL();

  /**
   * (Highcharts, Highstock, Highmaps) Path to the pattern image required by
   * VML browsers in order to draw radial gradients.
   *
   * @see <a href="https://api.highcharts.com/highcharts/global.VMLRadialGradientURL">https://api.highcharts.com/highcharts/global.VMLRadialGradientURL</a>
   * @see <a href="https://api.highcharts.com/highstock/global.VMLRadialGradientURL">https://api.highcharts.com/highstock/global.VMLRadialGradientURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/global.VMLRadialGradientURL">https://api.highcharts.com/highmaps/global.VMLRadialGradientURL</a>
   *
   * @implspec VMLRadialGradientURL?: string;
   *
   */
  @JSProperty("VMLRadialGradientURL")
  void setVMLRadialGradientURL(String value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Date extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface GetTimezoneOffset extends Any {
    void apply();
  }
}
