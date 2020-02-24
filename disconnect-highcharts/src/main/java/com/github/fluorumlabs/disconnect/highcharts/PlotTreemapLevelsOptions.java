package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not point options.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels">https://api.highcharts.com/highcharts/plotOptions.treemap.levels</a>
 *
 */
public interface PlotTreemapLevelsOptions extends Any {
  /**
   * (Highcharts) Can set a <code>borderColor</code> on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderColor">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderColor</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderColor">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) Set the dash style of the border of all the point which lies
   * on the level. See (see online documentation for example) for possible
   * options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderDashStyle">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderDashStyle</a>
   *
   * @implspec borderDashStyle?: string;
   *
   */
  @JSProperty("borderDashStyle")
  @Nullable
  String getBorderDashStyle();

  /**
   * (Highcharts) Set the dash style of the border of all the point which lies
   * on the level. See (see online documentation for example) for possible
   * options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderDashStyle">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderDashStyle</a>
   *
   * @implspec borderDashStyle?: string;
   *
   */
  @JSProperty("borderDashStyle")
  void setBorderDashStyle(String value);

  /**
   * (Highcharts) Can set the borderWidth on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) Can set the borderWidth on all points which lies on the same
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderWidth">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) Can set a color on all points which lies on the same level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts) A configuration object to define how the color of a child
   * varies from the parent's color. The variation is distributed among the
   * children of node. For example when setting brightness, the brightness
   * change will range from the parent's original brightness on the first
   * child, to the amount set in the <code>to</code> setting on the last node. This
   * allows a gradient-like color scheme that sets children out from each
   * other while highlighting the grouping on treemaps and sectors on sunburst
   * charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation</a>
   *
   * @implspec colorVariation?: PlotTreemapLevelsColorVariationOptions;
   *
   */
  @JSProperty("colorVariation")
  @Nullable
  PlotTreemapLevelsColorVariationOptions getColorVariation();

  /**
   * (Highcharts) A configuration object to define how the color of a child
   * varies from the parent's color. The variation is distributed among the
   * children of node. For example when setting brightness, the brightness
   * change will range from the parent's original brightness on the first
   * child, to the amount set in the <code>to</code> setting on the last node. This
   * allows a gradient-like color scheme that sets children out from each
   * other while highlighting the grouping on treemaps and sectors on sunburst
   * charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.colorVariation</a>
   *
   * @implspec colorVariation?: PlotTreemapLevelsColorVariationOptions;
   *
   */
  @JSProperty("colorVariation")
  void setColorVariation(PlotTreemapLevelsColorVariationOptions value);

  /**
   * (Highcharts) Can set the options of dataLabels on each point which lies
   * on the level. plotOptions.treemap.dataLabels for possible values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.dataLabels">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.dataLabels</a>
   *
   * @implspec dataLabels?: object;
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Any getDataLabels();

  /**
   * (Highcharts) Can set the options of dataLabels on each point which lies
   * on the level. plotOptions.treemap.dataLabels for possible values.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.dataLabels">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.dataLabels</a>
   *
   * @implspec dataLabels?: object;
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(Any value);

  /**
   * (Highcharts) Can set the layoutAlgorithm option on a specific level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutAlgorithm">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutAlgorithm</a>
   *
   * @implspec layoutAlgorithm?: (&quot;squarified&quot;|&quot;strip&quot;|&quot;stripes&quot;|&quot;sliceAndDice&quot;);
   *
   */
  @JSProperty("layoutAlgorithm")
  @Nullable
  LayoutAlgorithm getLayoutAlgorithm();

  /**
   * (Highcharts) Can set the layoutAlgorithm option on a specific level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutAlgorithm">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutAlgorithm</a>
   *
   * @implspec layoutAlgorithm?: (&quot;squarified&quot;|&quot;strip&quot;|&quot;stripes&quot;|&quot;sliceAndDice&quot;);
   *
   */
  @JSProperty("layoutAlgorithm")
  void setLayoutAlgorithm(LayoutAlgorithm value);

  /**
   * (Highcharts) Can set the layoutStartingDirection option on a specific
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutStartingDirection">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutStartingDirection</a>
   *
   * @implspec layoutStartingDirection?: (&quot;horizontal&quot;|&quot;vertical&quot;);
   *
   */
  @JSProperty("layoutStartingDirection")
  @Nullable
  LayoutStartingDirection getLayoutStartingDirection();

  /**
   * (Highcharts) Can set the layoutStartingDirection option on a specific
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutStartingDirection">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.layoutStartingDirection</a>
   *
   * @implspec layoutStartingDirection?: (&quot;horizontal&quot;|&quot;vertical&quot;);
   *
   */
  @JSProperty("layoutStartingDirection")
  void setLayoutStartingDirection(LayoutStartingDirection value);

  /**
   * (Highcharts) Decides which level takes effect from the options set in the
   * levels object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.level">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.level</a>
   *
   * @implspec level?: number;
   *
   */
  @JSProperty("level")
  double getLevel();

  /**
   * (Highcharts) Decides which level takes effect from the options set in the
   * levels object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.levels.level">https://api.highcharts.com/highcharts/plotOptions.treemap.levels.level</a>
   *
   * @implspec level?: number;
   *
   */
  @JSProperty("level")
  void setLevel(double value);

  /**
   */
  abstract class LayoutAlgorithm extends JsEnum {
    public static final LayoutAlgorithm SQUARIFIED = JsEnum.of("squarified");

    public static final LayoutAlgorithm STRIP = JsEnum.of("strip");

    public static final LayoutAlgorithm STRIPES = JsEnum.of("stripes");

    public static final LayoutAlgorithm SLICEANDDICE = JsEnum.of("sliceAndDice");
  }

  /**
   */
  abstract class LayoutStartingDirection extends JsEnum {
    public static final LayoutStartingDirection HORIZONTAL = JsEnum.of("horizontal");

    public static final LayoutStartingDirection VERTICAL = JsEnum.of("vertical");
  }
}
