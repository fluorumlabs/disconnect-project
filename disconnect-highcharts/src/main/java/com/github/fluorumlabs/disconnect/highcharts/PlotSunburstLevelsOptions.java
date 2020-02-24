package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not point options.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels</a>
 *
 */
public interface PlotSunburstLevelsOptions extends Any {
  /**
   * (Highcharts) Can set a <code>borderColor</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderColor">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) Can set a <code>borderColor</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderColor">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) Can set a <code>borderDashStyle</code> on all points which lies on the
   * same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderDashStyle">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderDashStyle</a>
   *
   * @implspec borderDashStyle?: string;
   *
   */
  @JSProperty("borderDashStyle")
  @Nullable
  String getBorderDashStyle();

  /**
   * (Highcharts) Can set a <code>borderDashStyle</code> on all points which lies on the
   * same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderDashStyle">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderDashStyle</a>
   *
   * @implspec borderDashStyle?: string;
   *
   */
  @JSProperty("borderDashStyle")
  void setBorderDashStyle(String value);

  /**
   * (Highcharts) Can set a <code>borderWidth</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderWidth">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) Can set a <code>borderWidth</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderWidth">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) Can set a <code>color</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the
   * same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation</a>
   *
   * @implspec colorVariation?: PlotSunburstLevelsColorVariationOptions;
   *
   */
  @JSProperty("colorVariation")
  @Nullable
  PlotSunburstLevelsColorVariationOptions getColorVariation();

  /**
   * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the
   * same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.colorVariation</a>
   *
   * @implspec colorVariation?: PlotSunburstLevelsColorVariationOptions;
   *
   */
  @JSProperty("colorVariation")
  void setColorVariation(PlotSunburstLevelsColorVariationOptions value);

  /**
   * (Highcharts) Can set <code>dataLabels</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.dataLabels">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.dataLabels</a>
   *
   * @implspec dataLabels?: object;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Any getDataLabels();

  /**
   * (Highcharts) Can set <code>dataLabels</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.dataLabels">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.dataLabels</a>
   *
   * @implspec dataLabels?: object;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(Any value);

  /**
   * (Highcharts) Can set a <code>levelSize</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.levelSize">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.levelSize</a>
   *
   * @implspec levelSize?: object;
   *
   */
  @JSProperty("levelSize")
  @Nullable
  Any getLevelSize();

  /**
   * (Highcharts) Can set a <code>levelSize</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.levelSize">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.levelSize</a>
   *
   * @implspec levelSize?: object;
   *
   */
  @JSProperty("levelSize")
  void setLevelSize(Any value);

  /**
   * (Highcharts) Can set a <code>rotation</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotation">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts) Can set a <code>rotation</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotation">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotation</a>
   *
   * @implspec rotation?: number;
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts) Can set a <code>rotationMode</code> on all points which lies on the
   * same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotationMode">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotationMode</a>
   *
   * @implspec rotationMode?: string;
   *
   */
  @JSProperty("rotationMode")
  @Nullable
  String getRotationMode();

  /**
   * (Highcharts) Can set a <code>rotationMode</code> on all points which lies on the
   * same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotationMode">https://api.highcharts.com/highcharts/plotOptions.sunburst.levels.rotationMode</a>
   *
   * @implspec rotationMode?: string;
   *
   */
  @JSProperty("rotationMode")
  void setRotationMode(String value);
}
