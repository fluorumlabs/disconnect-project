package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Options for displaying a message like &quot;No data
 * to display&quot;. This feature requires the file no-data-to-display.js to be
 * loaded in the page. The actual text to display is set in the lang.noData
 * option.
 *
 * @see <a href="https://api.highcharts.com/highcharts/noData">https://api.highcharts.com/highcharts/noData</a>
 * @see <a href="https://api.highcharts.com/highstock/noData">https://api.highcharts.com/highstock/noData</a>
 * @see <a href="https://api.highcharts.com/gantt/noData">https://api.highcharts.com/gantt/noData</a>
 *
 */
public interface NoDataOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
   * the no-data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.attr">https://api.highcharts.com/highcharts/noData.attr</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.attr">https://api.highcharts.com/highstock/noData.attr</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.attr">https://api.highcharts.com/gantt/noData.attr</a>
   *
   * @implspec attr?: SVGAttributes;
   *
   */
  @JSProperty("attr")
  @Nullable
  SVGAttributes getAttr();

  /**
   * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
   * the no-data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.attr">https://api.highcharts.com/highcharts/noData.attr</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.attr">https://api.highcharts.com/highstock/noData.attr</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.attr">https://api.highcharts.com/gantt/noData.attr</a>
   *
   * @implspec attr?: SVGAttributes;
   *
   */
  @JSProperty("attr")
  void setAttr(SVGAttributes value);

  /**
   * (Highcharts, Highstock, Gantt) The position of the no-data label,
   * relative to the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position">https://api.highcharts.com/highcharts/noData.position</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position">https://api.highcharts.com/highstock/noData.position</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position">https://api.highcharts.com/gantt/noData.position</a>
   *
   * @implspec position?: NoDataPositionOptions;
   *
   */
  @JSProperty("position")
  @Nullable
  NoDataPositionOptions getPosition();

  /**
   * (Highcharts, Highstock, Gantt) The position of the no-data label,
   * relative to the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.position">https://api.highcharts.com/highcharts/noData.position</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.position">https://api.highcharts.com/highstock/noData.position</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.position">https://api.highcharts.com/gantt/noData.position</a>
   *
   * @implspec position?: NoDataPositionOptions;
   *
   */
  @JSProperty("position")
  void setPosition(NoDataPositionOptions value);

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.style">https://api.highcharts.com/highcharts/noData.style</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.style">https://api.highcharts.com/highstock/noData.style</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.style">https://api.highcharts.com/gantt/noData.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.style">https://api.highcharts.com/highcharts/noData.style</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.style">https://api.highcharts.com/highstock/noData.style</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.style">https://api.highcharts.com/gantt/noData.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
   * pseudo-HTML rendered with SVG.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.useHTML">https://api.highcharts.com/highcharts/noData.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.useHTML">https://api.highcharts.com/highstock/noData.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.useHTML">https://api.highcharts.com/gantt/noData.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
   * pseudo-HTML rendered with SVG.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData.useHTML">https://api.highcharts.com/highcharts/noData.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/noData.useHTML">https://api.highcharts.com/highstock/noData.useHTML</a>
   * @see <a href="https://api.highcharts.com/gantt/noData.useHTML">https://api.highcharts.com/gantt/noData.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);
}
