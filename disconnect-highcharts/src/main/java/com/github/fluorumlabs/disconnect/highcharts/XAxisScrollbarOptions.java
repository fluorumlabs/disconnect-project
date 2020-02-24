package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An optional scrollbar to display on the X axis in response to
 * limiting the minimum and maximum of the axis values.
 *
 * In styled mode, all the presentational options for the scrollbar are replaced
 * by the classes <code>.highcharts-scrollbar-thumb</code>, <code>.highcharts-scrollbar-arrow</code>,
 * <code>.highcharts-scrollbar-button</code>, <code>.highcharts-scrollbar-rifles</code> and
 * <code>.highcharts-scrollbar-track</code>.
 *
 * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar">https://api.highcharts.com/highstock/xAxis.scrollbar</a>
 *
 */
public interface XAxisScrollbarOptions extends Any {
  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor</a>
   *
   * @implspec barbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("barbackgroundColor")
  @Nullable
  Unknown getBarbackgroundColor();

  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor</a>
   *
   * @implspec barbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("barbackgroundColor")
  void setBarbackgroundColor(GradientColorObject value);

  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor</a>
   *
   * @implspec barbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("barbackgroundColor")
  void setBarbackgroundColor(String value);

  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.barBackgroundColor</a>
   *
   * @implspec barbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("barbackgroundColor")
  void setBarbackgroundColor(Any value);

  /**
   * (Highstock) The color of the scrollbar's border.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderColor">https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderColor</a>
   *
   * @implspec barBorderColor?: ColorString;
   *
   */
  @JSProperty("barBorderColor")
  @Nullable
  String getBarBorderColor();

  /**
   * (Highstock) The color of the scrollbar's border.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderColor">https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderColor</a>
   *
   * @implspec barBorderColor?: ColorString;
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(String value);

  /**
   * (Highstock) The border rounding radius of the bar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderRadius">https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderRadius</a>
   *
   * @implspec barBorderRadius?: number;
   *
   */
  @JSProperty("barBorderRadius")
  double getBarBorderRadius();

  /**
   * (Highstock) The border rounding radius of the bar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderRadius">https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderRadius</a>
   *
   * @implspec barBorderRadius?: number;
   *
   */
  @JSProperty("barBorderRadius")
  void setBarBorderRadius(double value);

  /**
   * (Highstock) The width of the bar's border.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderWidth</a>
   *
   * @implspec barBorderWidth?: number;
   *
   */
  @JSProperty("barBorderWidth")
  double getBarBorderWidth();

  /**
   * (Highstock) The width of the bar's border.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.barBorderWidth</a>
   *
   * @implspec barBorderWidth?: number;
   *
   */
  @JSProperty("barBorderWidth")
  void setBarBorderWidth(double value);

  /**
   * (Highstock) The color of the small arrow inside the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonArrowColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonArrowColor</a>
   *
   * @implspec buttonArrowColor?: ColorString;
   *
   */
  @JSProperty("buttonArrowColor")
  @Nullable
  String getButtonArrowColor();

  /**
   * (Highstock) The color of the small arrow inside the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonArrowColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonArrowColor</a>
   *
   * @implspec buttonArrowColor?: ColorString;
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(String value);

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor</a>
   *
   * @implspec buttonbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("buttonbackgroundColor")
  @Nullable
  Unknown getButtonbackgroundColor();

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor</a>
   *
   * @implspec buttonbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("buttonbackgroundColor")
  void setButtonbackgroundColor(GradientColorObject value);

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor</a>
   *
   * @implspec buttonbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("buttonbackgroundColor")
  void setButtonbackgroundColor(String value);

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBackgroundColor</a>
   *
   * @implspec buttonbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("buttonbackgroundColor")
  void setButtonbackgroundColor(Any value);

  /**
   * (Highstock) The color of the border of the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderColor</a>
   *
   * @implspec buttonBorderColor?: ColorString;
   *
   */
  @JSProperty("buttonBorderColor")
  @Nullable
  String getButtonBorderColor();

  /**
   * (Highstock) The color of the border of the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderColor">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderColor</a>
   *
   * @implspec buttonBorderColor?: ColorString;
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(String value);

  /**
   * (Highstock) The corner radius of the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderRadius">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderRadius</a>
   *
   * @implspec buttonBorderRadius?: number;
   *
   */
  @JSProperty("buttonBorderRadius")
  double getButtonBorderRadius();

  /**
   * (Highstock) The corner radius of the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderRadius">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderRadius</a>
   *
   * @implspec buttonBorderRadius?: number;
   *
   */
  @JSProperty("buttonBorderRadius")
  void setButtonBorderRadius(double value);

  /**
   * (Highstock) The border width of the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderWidth</a>
   *
   * @implspec buttonBorderWidth?: number;
   *
   */
  @JSProperty("buttonBorderWidth")
  double getButtonBorderWidth();

  /**
   * (Highstock) The border width of the scrollbar buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.buttonBorderWidth</a>
   *
   * @implspec buttonBorderWidth?: number;
   *
   */
  @JSProperty("buttonBorderWidth")
  void setButtonBorderWidth(double value);

  /**
   * (Highstock) Enable or disable the scrollbar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.enabled">https://api.highcharts.com/highstock/xAxis.scrollbar.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the scrollbar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.enabled">https://api.highcharts.com/highstock/xAxis.scrollbar.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The height of the scrollbar. The height also applies to the
   * width of the scroll arrows so that they are always squares. Defaults to
   * 20 for touch devices and 14 for mouse devices.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.height">https://api.highcharts.com/highstock/xAxis.scrollbar.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) The height of the scrollbar. The height also applies to the
   * width of the scroll arrows so that they are always squares. Defaults to
   * 20 for touch devices and 14 for mouse devices.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.height">https://api.highcharts.com/highstock/xAxis.scrollbar.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) Whether to redraw the main chart as the scrollbar or the
   * navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers
   * and <code>false</code> for legacy IE browsers as well as mobile devices.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.liveRedraw">https://api.highcharts.com/highstock/xAxis.scrollbar.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highstock) Whether to redraw the main chart as the scrollbar or the
   * navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers
   * and <code>false</code> for legacy IE browsers as well as mobile devices.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.liveRedraw">https://api.highcharts.com/highstock/xAxis.scrollbar.liveRedraw</a>
   *
   * @implspec liveRedraw?: boolean;
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);

  /**
   * (Highstock) The margin between the scrollbar and its axis when the
   * scrollbar is applied directly to an axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.margin">https://api.highcharts.com/highstock/xAxis.scrollbar.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highstock) The margin between the scrollbar and its axis when the
   * scrollbar is applied directly to an axis.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.margin">https://api.highcharts.com/highstock/xAxis.scrollbar.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highstock) The minimum width of the scrollbar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.minWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.minWidth</a>
   *
   * @implspec minWidth?: number;
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highstock) The minimum width of the scrollbar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.minWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.minWidth</a>
   *
   * @implspec minWidth?: number;
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);

  /**
   * (Highstock) The color of the small rifles in the middle of the scrollbar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.rifleColor">https://api.highcharts.com/highstock/xAxis.scrollbar.rifleColor</a>
   *
   * @implspec rifleColor?: ColorString;
   *
   */
  @JSProperty("rifleColor")
  @Nullable
  String getRifleColor();

  /**
   * (Highstock) The color of the small rifles in the middle of the scrollbar.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.rifleColor">https://api.highcharts.com/highstock/xAxis.scrollbar.rifleColor</a>
   *
   * @implspec rifleColor?: ColorString;
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(String value);

  /**
   * (Highstock) Whether to show or hide the scrollbar when the scrolled
   * content is zoomed out to it full extent.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.showFull">https://api.highcharts.com/highstock/xAxis.scrollbar.showFull</a>
   *
   * @implspec showFull?: boolean;
   *
   */
  @JSProperty("showFull")
  boolean getShowFull();

  /**
   * (Highstock) Whether to show or hide the scrollbar when the scrolled
   * content is zoomed out to it full extent.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.showFull">https://api.highcharts.com/highstock/xAxis.scrollbar.showFull</a>
   *
   * @implspec showFull?: boolean;
   *
   */
  @JSProperty("showFull")
  void setShowFull(boolean value);

  /**
   * @implspec step?: number;
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * @implspec step?: number;
   *
   */
  @JSProperty("step")
  void setStep(double value);

  /**
   * (Highstock) The color of the track background.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor</a>
   *
   * @implspec trackbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("trackbackgroundColor")
  @Nullable
  Unknown getTrackbackgroundColor();

  /**
   * (Highstock) The color of the track background.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor</a>
   *
   * @implspec trackbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("trackbackgroundColor")
  void setTrackbackgroundColor(GradientColorObject value);

  /**
   * (Highstock) The color of the track background.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor</a>
   *
   * @implspec trackbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("trackbackgroundColor")
  void setTrackbackgroundColor(String value);

  /**
   * (Highstock) The color of the track background.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBackgroundColor</a>
   *
   * @implspec trackbackgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("trackbackgroundColor")
  void setTrackbackgroundColor(Any value);

  /**
   * (Highstock) The color of the border of the scrollbar track.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderColor">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderColor</a>
   *
   * @implspec trackBorderColor?: ColorString;
   *
   */
  @JSProperty("trackBorderColor")
  @Nullable
  String getTrackBorderColor();

  /**
   * (Highstock) The color of the border of the scrollbar track.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderColor">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderColor</a>
   *
   * @implspec trackBorderColor?: ColorString;
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(String value);

  /**
   * (Highstock) The corner radius of the border of the scrollbar track.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderRadius">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderRadius</a>
   *
   * @implspec trackBorderRadius?: number;
   *
   */
  @JSProperty("trackBorderRadius")
  double getTrackBorderRadius();

  /**
   * (Highstock) The corner radius of the border of the scrollbar track.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderRadius">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderRadius</a>
   *
   * @implspec trackBorderRadius?: number;
   *
   */
  @JSProperty("trackBorderRadius")
  void setTrackBorderRadius(double value);

  /**
   * (Highstock) The width of the border of the scrollbar track.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderWidth</a>
   *
   * @implspec trackBorderWidth?: number;
   *
   */
  @JSProperty("trackBorderWidth")
  double getTrackBorderWidth();

  /**
   * (Highstock) The width of the border of the scrollbar track.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderWidth">https://api.highcharts.com/highstock/xAxis.scrollbar.trackBorderWidth</a>
   *
   * @implspec trackBorderWidth?: number;
   *
   */
  @JSProperty("trackBorderWidth")
  void setTrackBorderWidth(double value);

  /**
   * (Highstock) The z index of the scrollbar group.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.zIndex">https://api.highcharts.com/highstock/xAxis.scrollbar.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highstock) The z index of the scrollbar group.
   *
   * @see <a href="https://api.highcharts.com/highstock/xAxis.scrollbar.zIndex">https://api.highcharts.com/highstock/xAxis.scrollbar.zIndex</a>
   *
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
