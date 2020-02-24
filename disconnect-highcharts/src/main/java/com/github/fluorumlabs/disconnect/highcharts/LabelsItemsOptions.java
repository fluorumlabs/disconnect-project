package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) An HTML label that can be positioned
 * anywhere in the chart area.
 *
 * @see <a href="https://api.highcharts.com/highcharts/labels.items">https://api.highcharts.com/highcharts/labels.items</a>
 * @see <a href="https://api.highcharts.com/highstock/labels.items">https://api.highcharts.com/highstock/labels.items</a>
 * @see <a href="https://api.highcharts.com/highmaps/labels.items">https://api.highcharts.com/highmaps/labels.items</a>
 *
 */
public interface LabelsItemsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Inner HTML or text for the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.items.html">https://api.highcharts.com/highcharts/labels.items.html</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.items.html">https://api.highcharts.com/highstock/labels.items.html</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.items.html">https://api.highcharts.com/highmaps/labels.items.html</a>
   *
   * @implspec html?: string;
   *
   */
  @JSProperty("html")
  @Nullable
  String getHtml();

  /**
   * (Highcharts, Highstock, Highmaps) Inner HTML or text for the label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.items.html">https://api.highcharts.com/highcharts/labels.items.html</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.items.html">https://api.highcharts.com/highstock/labels.items.html</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.items.html">https://api.highcharts.com/highmaps/labels.items.html</a>
   *
   * @implspec html?: string;
   *
   */
  @JSProperty("html")
  void setHtml(String value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each label. To position
   * the label, use left and top like this:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.items.style">https://api.highcharts.com/highcharts/labels.items.style</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.items.style">https://api.highcharts.com/highstock/labels.items.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.items.style">https://api.highcharts.com/highmaps/labels.items.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each label. To position
   * the label, use left and top like this:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.items.style">https://api.highcharts.com/highcharts/labels.items.style</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.items.style">https://api.highcharts.com/highstock/labels.items.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.items.style">https://api.highcharts.com/highmaps/labels.items.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
