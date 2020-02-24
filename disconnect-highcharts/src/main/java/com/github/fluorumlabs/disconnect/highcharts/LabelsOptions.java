package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) HTML labels that can be positioned anywhere
 * in the chart area.
 *
 * @see <a href="https://api.highcharts.com/highcharts/labels">https://api.highcharts.com/highcharts/labels</a>
 * @see <a href="https://api.highcharts.com/highstock/labels">https://api.highcharts.com/highstock/labels</a>
 * @see <a href="https://api.highcharts.com/highmaps/labels">https://api.highcharts.com/highmaps/labels</a>
 *
 */
public interface LabelsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) An HTML label that can be positioned
   * anywhere in the chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.items">https://api.highcharts.com/highcharts/labels.items</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.items">https://api.highcharts.com/highstock/labels.items</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.items">https://api.highcharts.com/highmaps/labels.items</a>
   *
   * @implspec items?: Array<LabelsItemsOptions>;
   *
   */
  @JSProperty("items")
  @Nullable
  Array<LabelsItemsOptions> getItems();

  /**
   * (Highcharts, Highstock, Highmaps) An HTML label that can be positioned
   * anywhere in the chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.items">https://api.highcharts.com/highcharts/labels.items</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.items">https://api.highcharts.com/highstock/labels.items</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.items">https://api.highcharts.com/highmaps/labels.items</a>
   *
   * @implspec items?: Array<LabelsItemsOptions>;
   *
   */
  @JSProperty("items")
  void setItems(Array<LabelsItemsOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) Shared CSS styles for all labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.style">https://api.highcharts.com/highcharts/labels.style</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.style">https://api.highcharts.com/highstock/labels.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.style">https://api.highcharts.com/highmaps/labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Shared CSS styles for all labels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels.style">https://api.highcharts.com/highcharts/labels.style</a>
   * @see <a href="https://api.highcharts.com/highstock/labels.style">https://api.highcharts.com/highstock/labels.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels.style">https://api.highcharts.com/highmaps/labels.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);
}
