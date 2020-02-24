package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) General event handlers for the series items. These event hooks can
 * also be attached to the series at run time using the <code>Highcharts.addEvent</code>
 * function.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events</a>
 *
 */
public interface PlotMapbubbleEventsOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Fires after the series has finished its
   * initial animation, or in case animation is disabled, immediately as the
   * series is displayed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mapbubble.events.afterAnimate">https://api.highcharts.com/highcharts/plotOptions.mapbubble.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mapbubble.events.afterAnimate">https://api.highcharts.com/highstock/plotOptions.mapbubble.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mapbubble.events.afterAnimate">https://api.highcharts.com/gantt/plotOptions.mapbubble.events.afterAnimate</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mapbubble.events.afterAnimate">https://api.highcharts.com/highcharts/plotOptions.mapbubble.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mapbubble.events.afterAnimate">https://api.highcharts.com/highstock/plotOptions.mapbubble.events.afterAnimate</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.mapbubble.events.afterAnimate">https://api.highcharts.com/gantt/plotOptions.mapbubble.events.afterAnimate</a>
   *
   * @implspec afterAnimate?: SeriesAfterAnimateCallbackFunction;
   *
   */
  @JSProperty("afterAnimate")
  void setAfterAnimate(SeriesAfterAnimateCallbackFunction value);

  /**
   * (Highmaps) Fires when the checkbox next to the series' name in the legend
   * is clicked. One parameter, <code>event</code>, is passed to the function. The state
   * of the checkbox is found by <code>event.checked</code>. The checked item is found by
   * <code>event.item</code>. Return <code>false</code> to prevent the default action which is to
   * toggle the select state of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.checkboxClick">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.checkboxClick</a>
   *
   * @implspec checkboxClick?: SeriesCheckboxClickCallbackFunction;
   *
   */
  @JSProperty("checkboxClick")
  @Nullable
  SeriesCheckboxClickCallbackFunction getCheckboxClick();

  /**
   * (Highmaps) Fires when the checkbox next to the series' name in the legend
   * is clicked. One parameter, <code>event</code>, is passed to the function. The state
   * of the checkbox is found by <code>event.checked</code>. The checked item is found by
   * <code>event.item</code>. Return <code>false</code> to prevent the default action which is to
   * toggle the select state of the series.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.checkboxClick">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.checkboxClick</a>
   *
   * @implspec checkboxClick?: SeriesCheckboxClickCallbackFunction;
   *
   */
  @JSProperty("checkboxClick")
  void setCheckboxClick(SeriesCheckboxClickCallbackFunction value);

  /**
   * (Highmaps) Fires when the series is clicked. One parameter, <code>event</code>, is
   * passed to the function, containing common event information.
   * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
   * graph.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.click">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.click</a>
   *
   * @implspec click?: SeriesClickCallbackFunction;
   *
   */
  @JSProperty("click")
  @Nullable
  SeriesClickCallbackFunction getClick();

  /**
   * (Highmaps) Fires when the series is clicked. One parameter, <code>event</code>, is
   * passed to the function, containing common event information.
   * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
   * graph.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.click">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.click</a>
   *
   * @implspec click?: SeriesClickCallbackFunction;
   *
   */
  @JSProperty("click")
  void setClick(SeriesClickCallbackFunction value);

  /**
   * (Highmaps) Fires when the series is hidden after chart generation time,
   * either by clicking the legend item or by calling <code>.hide()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.hide">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.hide</a>
   *
   * @implspec hide?: () =&gt; void;
   *
   */
  @JSProperty("hide")
  @Nullable
  Hide getHide();

  /**
   * (Highmaps) Fires when the series is hidden after chart generation time,
   * either by clicking the legend item or by calling <code>.hide()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.hide">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.hide</a>
   *
   * @implspec hide?: () =&gt; void;
   *
   */
  @JSProperty("hide")
  void setHide(Hide value);

  /**
   * (Highmaps) Fires when the legend item belonging to the series is clicked.
   * One parameter, <code>event</code>, is passed to the function. The default action is
   * to toggle the visibility of the series. This can be prevented by
   * returning <code>false</code> or calling <code>event.preventDefault()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.legendItemClick">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.legendItemClick</a>
   *
   * @implspec legendItemClick?: () =&gt; void;
   *
   */
  @JSProperty("legendItemClick")
  @Nullable
  LegendItemClick getLegendItemClick();

  /**
   * (Highmaps) Fires when the legend item belonging to the series is clicked.
   * One parameter, <code>event</code>, is passed to the function. The default action is
   * to toggle the visibility of the series. This can be prevented by
   * returning <code>false</code> or calling <code>event.preventDefault()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.legendItemClick">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.legendItemClick</a>
   *
   * @implspec legendItemClick?: () =&gt; void;
   *
   */
  @JSProperty("legendItemClick")
  void setLegendItemClick(LegendItemClick value);

  /**
   * (Highmaps) Fires when the mouse leaves the graph. One parameter, <code>event</code>,
   * is passed to the function, containing common event information. If the
   * stickyTracking option is true, <code>mouseOut</code> doesn't happen before the mouse
   * enters another graph or leaves the plot area.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOut">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOut</a>
   *
   * @implspec mouseOut?: () =&gt; void;
   *
   */
  @JSProperty("mouseOut")
  @Nullable
  MouseOut getMouseOut();

  /**
   * (Highmaps) Fires when the mouse leaves the graph. One parameter, <code>event</code>,
   * is passed to the function, containing common event information. If the
   * stickyTracking option is true, <code>mouseOut</code> doesn't happen before the mouse
   * enters another graph or leaves the plot area.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOut">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOut</a>
   *
   * @implspec mouseOut?: () =&gt; void;
   *
   */
  @JSProperty("mouseOut")
  void setMouseOut(MouseOut value);

  /**
   * (Highmaps) Fires when the mouse enters the graph. One parameter, <code>event</code>,
   * is passed to the function, containing common event information.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOver">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOver</a>
   *
   * @implspec mouseOver?: () =&gt; void;
   *
   */
  @JSProperty("mouseOver")
  @Nullable
  MouseOver getMouseOver();

  /**
   * (Highmaps) Fires when the mouse enters the graph. One parameter, <code>event</code>,
   * is passed to the function, containing common event information.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOver">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.mouseOver</a>
   *
   * @implspec mouseOver?: () =&gt; void;
   *
   */
  @JSProperty("mouseOver")
  void setMouseOver(MouseOver value);

  /**
   * (Highmaps) Fires when the series is shown after chart generation time,
   * either by clicking the legend item or by calling <code>.show()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.show">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.show</a>
   *
   * @implspec show?: () =&gt; void;
   *
   */
  @JSProperty("show")
  @Nullable
  Show getShow();

  /**
   * (Highmaps) Fires when the series is shown after chart generation time,
   * either by clicking the legend item or by calling <code>.show()</code>.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.show">https://api.highcharts.com/highmaps/plotOptions.mapbubble.events.show</a>
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
