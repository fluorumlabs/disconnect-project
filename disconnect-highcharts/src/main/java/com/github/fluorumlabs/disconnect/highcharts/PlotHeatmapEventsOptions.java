package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) General event handlers for the series items. These
 * event hooks can also be attached to the series at run time using the
 * <code>Highcharts.addEvent</code> function.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events">https://api.highcharts.com/highcharts/plotOptions.heatmap.events</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events">https://api.highcharts.com/highmaps/plotOptions.heatmap.events</a>
 *
 */
public interface PlotHeatmapEventsOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Fires after the series has finished its
   * initial animation, or in case animation is disabled, immediately as the
   * series is displayed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.afterAnimate">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.events.afterAnimate">https://api.highcharts.com/highstock/plotOptions.heatmap.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.events.afterAnimate">https://api.highcharts.com/gantt/plotOptions.heatmap.events.afterAnimate</a>
   *
   * @implspec afterAnimate?: SeriesAfterAnimateCallbackFunction;
   *
   */
  @JSProperty("afterAnimate")
  @Nullable
  SeriesAfterAnimateCallbackFunction getAfterAnimate();

  /**
   * (Highcharts, Highstock, Gantt) Fires after the series has finished its
   * initial animation, or in case animation is disabled, immediately as the
   * series is displayed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.afterAnimate">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.heatmap.events.afterAnimate">https://api.highcharts.com/highstock/plotOptions.heatmap.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.heatmap.events.afterAnimate">https://api.highcharts.com/gantt/plotOptions.heatmap.events.afterAnimate</a>
   *
   * @implspec afterAnimate?: SeriesAfterAnimateCallbackFunction;
   *
   */
  @JSProperty("afterAnimate")
  void setAfterAnimate(SeriesAfterAnimateCallbackFunction value);

  /**
   * (Highcharts, Highmaps) Fires when the checkbox next to the series' name
   * in the legend is clicked. One parameter, <code>event</code>, is passed to the
   * function. The state of the checkbox is found by <code>event.checked</code>. The
   * checked item is found by <code>event.item</code>. Return <code>false</code> to prevent the
   * default action which is to toggle the select state of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.checkboxClick">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.checkboxClick</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.checkboxClick">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.checkboxClick</a>
   *
   * @implspec checkboxClick?: SeriesCheckboxClickCallbackFunction;
   *
   */
  @JSProperty("checkboxClick")
  @Nullable
  SeriesCheckboxClickCallbackFunction getCheckboxClick();

  /**
   * (Highcharts, Highmaps) Fires when the checkbox next to the series' name
   * in the legend is clicked. One parameter, <code>event</code>, is passed to the
   * function. The state of the checkbox is found by <code>event.checked</code>. The
   * checked item is found by <code>event.item</code>. Return <code>false</code> to prevent the
   * default action which is to toggle the select state of the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.checkboxClick">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.checkboxClick</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.checkboxClick">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.checkboxClick</a>
   *
   * @implspec checkboxClick?: SeriesCheckboxClickCallbackFunction;
   *
   */
  @JSProperty("checkboxClick")
  void setCheckboxClick(SeriesCheckboxClickCallbackFunction value);

  /**
   * (Highcharts, Highmaps) Fires when the series is clicked. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
   * graph.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.click">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.click</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.click">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.click</a>
   *
   * @implspec click?: SeriesClickCallbackFunction;
   *
   */
  @JSProperty("click")
  @Nullable
  SeriesClickCallbackFunction getClick();

  /**
   * (Highcharts, Highmaps) Fires when the series is clicked. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
   * graph.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.click">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.click</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.click">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.click</a>
   *
   * @implspec click?: SeriesClickCallbackFunction;
   *
   */
  @JSProperty("click")
  void setClick(SeriesClickCallbackFunction value);

  /**
   * (Highcharts, Highmaps) Fires when the series is hidden after chart
   * generation time, either by clicking the legend item or by calling
   * <code>.hide()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.hide">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.hide</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.hide">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.hide</a>
   *
   * @implspec hide?: () =&gt; void;
   *
   */
  @JSProperty("hide")
  @Nullable
  Hide getHide();

  /**
   * (Highcharts, Highmaps) Fires when the series is hidden after chart
   * generation time, either by clicking the legend item or by calling
   * <code>.hide()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.hide">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.hide</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.hide">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.hide</a>
   *
   * @implspec hide?: () =&gt; void;
   *
   */
  @JSProperty("hide")
  void setHide(Hide value);

  /**
   * (Highcharts, Highmaps) Fires when the legend item belonging to the series
   * is clicked. One parameter, <code>event</code>, is passed to the function. The
   * default action is to toggle the visibility of the series. This can be
   * prevented by returning <code>false</code> or calling <code>event.preventDefault()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.legendItemClick">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.legendItemClick</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.legendItemClick">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.legendItemClick</a>
   *
   * @implspec legendItemClick?: () =&gt; void;
   *
   */
  @JSProperty("legendItemClick")
  @Nullable
  LegendItemClick getLegendItemClick();

  /**
   * (Highcharts, Highmaps) Fires when the legend item belonging to the series
   * is clicked. One parameter, <code>event</code>, is passed to the function. The
   * default action is to toggle the visibility of the series. This can be
   * prevented by returning <code>false</code> or calling <code>event.preventDefault()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.legendItemClick">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.legendItemClick</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.legendItemClick">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.legendItemClick</a>
   *
   * @implspec legendItemClick?: () =&gt; void;
   *
   */
  @JSProperty("legendItemClick")
  void setLegendItemClick(LegendItemClick value);

  /**
   * (Highcharts, Highmaps) Fires when the mouse leaves the graph. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information. If the stickyTracking option is true, <code>mouseOut</code> doesn't
   * happen before the mouse enters another graph or leaves the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOut">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOut</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOut">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOut</a>
   *
   * @implspec mouseOut?: () =&gt; void;
   *
   */
  @JSProperty("mouseOut")
  @Nullable
  MouseOut getMouseOut();

  /**
   * (Highcharts, Highmaps) Fires when the mouse leaves the graph. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information. If the stickyTracking option is true, <code>mouseOut</code> doesn't
   * happen before the mouse enters another graph or leaves the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOut">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOut</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOut">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOut</a>
   *
   * @implspec mouseOut?: () =&gt; void;
   *
   */
  @JSProperty("mouseOut")
  void setMouseOut(MouseOut value);

  /**
   * (Highcharts, Highmaps) Fires when the mouse enters the graph. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOver">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOver</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOver">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOver</a>
   *
   * @implspec mouseOver?: () =&gt; void;
   *
   */
  @JSProperty("mouseOver")
  @Nullable
  MouseOver getMouseOver();

  /**
   * (Highcharts, Highmaps) Fires when the mouse enters the graph. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOver">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.mouseOver</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOver">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.mouseOver</a>
   *
   * @implspec mouseOver?: () =&gt; void;
   *
   */
  @JSProperty("mouseOver")
  void setMouseOver(MouseOver value);

  /**
   * (Highcharts, Highmaps) Fires when the series is shown after chart
   * generation time, either by clicking the legend item or by calling
   * <code>.show()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.show">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.show</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.show">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.show</a>
   *
   * @implspec show?: () =&gt; void;
   *
   */
  @JSProperty("show")
  @Nullable
  Show getShow();

  /**
   * (Highcharts, Highmaps) Fires when the series is shown after chart
   * generation time, either by clicking the legend item or by calling
   * <code>.show()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.events.show">https://api.highcharts.com/highcharts/plotOptions.heatmap.events.show</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.events.show">https://api.highcharts.com/highmaps/plotOptions.heatmap.events.show</a>
   *
   * @implspec show?: () =&gt; void;
   *
   */
  @JSProperty("show")
  void setShow(Show value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Hide extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface LegendItemClick extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface MouseOut extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface MouseOver extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Show extends Any {
    void apply();
  }
}
