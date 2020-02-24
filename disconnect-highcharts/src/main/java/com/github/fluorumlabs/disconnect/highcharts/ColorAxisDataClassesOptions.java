package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) An array of data classes or ranges for the choropleth
 * map. If none given, the color axis is scalar and values are distributed as a
 * gradient between the minimum and maximum colors.
 *
 * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses">https://api.highcharts.com/highcharts/colorAxis.dataClasses</a>
 * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses">https://api.highcharts.com/highmaps/colorAxis.dataClasses</a>
 *
 */
public interface ColorAxisDataClassesOptions extends Any {
  /**
   * (Highcharts, Highmaps) The color of each data class. If not set, the
   * color is pulled from the global or chart-specific colors array. In styled
   * mode, this option is ignored. Instead, use colors defined in CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.color">https://api.highcharts.com/highcharts/colorAxis.dataClasses.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.color">https://api.highcharts.com/highmaps/colorAxis.dataClasses.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highmaps) The color of each data class. If not set, the
   * color is pulled from the global or chart-specific colors array. In styled
   * mode, this option is ignored. Instead, use colors defined in CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.color">https://api.highcharts.com/highcharts/colorAxis.dataClasses.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.color">https://api.highcharts.com/highmaps/colorAxis.dataClasses.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highmaps) The color of each data class. If not set, the
   * color is pulled from the global or chart-specific colors array. In styled
   * mode, this option is ignored. Instead, use colors defined in CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.color">https://api.highcharts.com/highcharts/colorAxis.dataClasses.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.color">https://api.highcharts.com/highmaps/colorAxis.dataClasses.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highmaps) The color of each data class. If not set, the
   * color is pulled from the global or chart-specific colors array. In styled
   * mode, this option is ignored. Instead, use colors defined in CSS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.color">https://api.highcharts.com/highcharts/colorAxis.dataClasses.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.color">https://api.highcharts.com/highmaps/colorAxis.dataClasses.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highcharts, Highmaps) The start of the value range that the data class
   * represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.from">https://api.highcharts.com/highcharts/colorAxis.dataClasses.from</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.from">https://api.highcharts.com/highmaps/colorAxis.dataClasses.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highmaps) The start of the value range that the data class
   * represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.from">https://api.highcharts.com/highcharts/colorAxis.dataClasses.from</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.from">https://api.highcharts.com/highmaps/colorAxis.dataClasses.from</a>
   *
   * @implspec from?: number;
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highmaps) The name of the data class as it appears in the
   * legend. If no name is given, it is automatically created based on the
   * <code>from</code> and <code>to</code> values. For full programmatic control,
   * legend.labelFormatter can be used. In the formatter, <code>this.from</code> and
   * <code>this.to</code> can be accessed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.name">https://api.highcharts.com/highcharts/colorAxis.dataClasses.name</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.name">https://api.highcharts.com/highmaps/colorAxis.dataClasses.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highmaps) The name of the data class as it appears in the
   * legend. If no name is given, it is automatically created based on the
   * <code>from</code> and <code>to</code> values. For full programmatic control,
   * legend.labelFormatter can be used. In the formatter, <code>this.from</code> and
   * <code>this.to</code> can be accessed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.name">https://api.highcharts.com/highcharts/colorAxis.dataClasses.name</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.name">https://api.highcharts.com/highmaps/colorAxis.dataClasses.name</a>
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * (Highcharts, Highmaps) The end of the value range that the data class
   * represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.to">https://api.highcharts.com/highcharts/colorAxis.dataClasses.to</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.to">https://api.highcharts.com/highmaps/colorAxis.dataClasses.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highmaps) The end of the value range that the data class
   * represents, relating to the point value.
   *
   * The range of each <code>dataClass</code> is closed in both ends, but can be
   * overridden by the next <code>dataClass</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.dataClasses.to">https://api.highcharts.com/highcharts/colorAxis.dataClasses.to</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.dataClasses.to">https://api.highcharts.com/highmaps/colorAxis.dataClasses.to</a>
   *
   * @implspec to?: number;
   *
   */
  @JSProperty("to")
  void setTo(double value);
}
