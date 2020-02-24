package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A title to be added on top of the legend.
 *
 * @see <a href="https://api.highcharts.com/highcharts/legend.title">https://api.highcharts.com/highcharts/legend.title</a>
 * @see <a href="https://api.highcharts.com/highstock/legend.title">https://api.highcharts.com/highstock/legend.title</a>
 * @see <a href="https://api.highcharts.com/highmaps/legend.title">https://api.highcharts.com/highmaps/legend.title</a>
 *
 */
public interface LegendTitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Generic CSS styles for the legend
   * title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.title.style">https://api.highcharts.com/highcharts/legend.title.style</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.title.style">https://api.highcharts.com/highstock/legend.title.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.title.style">https://api.highcharts.com/highmaps/legend.title.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Generic CSS styles for the legend
   * title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.title.style">https://api.highcharts.com/highcharts/legend.title.style</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.title.style">https://api.highcharts.com/highstock/legend.title.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.title.style">https://api.highcharts.com/highmaps/legend.title.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) A text or HTML string for the title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.title.text">https://api.highcharts.com/highcharts/legend.title.text</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.title.text">https://api.highcharts.com/highstock/legend.title.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.title.text">https://api.highcharts.com/highmaps/legend.title.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) A text or HTML string for the title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.title.text">https://api.highcharts.com/highcharts/legend.title.text</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.title.text">https://api.highcharts.com/highstock/legend.title.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.title.text">https://api.highcharts.com/highmaps/legend.title.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);
}
