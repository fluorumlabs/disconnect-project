package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Event listeners for the chart.
 *
 * @see <a href="https://api.highcharts.com/highcharts/chart.events">https://api.highcharts.com/highcharts/chart.events</a>
 * @see <a href="https://api.highcharts.com/highstock/chart.events">https://api.highcharts.com/highstock/chart.events</a>
 * @see <a href="https://api.highcharts.com/highmaps/chart.events">https://api.highcharts.com/highmaps/chart.events</a>
 *
 */
public interface ChartEventsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Fires when a series is added to the
   * chart after load time, using the <code>addSeries</code> method. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * Through <code>event.options</code> you can access the series options that was passed
   * to the <code>addSeries</code> method. Returning false prevents the series from being
   * added.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.addSeries">https://api.highcharts.com/highcharts/chart.events.addSeries</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.addSeries">https://api.highcharts.com/highstock/chart.events.addSeries</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.addSeries">https://api.highcharts.com/highmaps/chart.events.addSeries</a>
   *
   * @implspec addSeries?: () =&gt; void;
   *
   */
  @JSProperty("addSeries")
  @Nullable
  AddSeries getAddSeries();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when a series is added to the
   * chart after load time, using the <code>addSeries</code> method. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * Through <code>event.options</code> you can access the series options that was passed
   * to the <code>addSeries</code> method. Returning false prevents the series from being
   * added.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.addSeries">https://api.highcharts.com/highcharts/chart.events.addSeries</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.addSeries">https://api.highcharts.com/highstock/chart.events.addSeries</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.addSeries">https://api.highcharts.com/highmaps/chart.events.addSeries</a>
   *
   * @implspec addSeries?: () =&gt; void;
   *
   */
  @JSProperty("addSeries")
  void setAddSeries(AddSeries value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires after a chart is printed through
   * the context menu item or the <code>Chart.print</code> method. Requires the exporting
   * module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.afterPrint">https://api.highcharts.com/highcharts/chart.events.afterPrint</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.afterPrint">https://api.highcharts.com/highstock/chart.events.afterPrint</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.afterPrint">https://api.highcharts.com/highmaps/chart.events.afterPrint</a>
   *
   * @implspec afterPrint?: () =&gt; void;
   *
   */
  @JSProperty("afterPrint")
  @Nullable
  AfterPrint getAfterPrint();

  /**
   * (Highcharts, Highstock, Highmaps) Fires after a chart is printed through
   * the context menu item or the <code>Chart.print</code> method. Requires the exporting
   * module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.afterPrint">https://api.highcharts.com/highcharts/chart.events.afterPrint</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.afterPrint">https://api.highcharts.com/highstock/chart.events.afterPrint</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.afterPrint">https://api.highcharts.com/highmaps/chart.events.afterPrint</a>
   *
   * @implspec afterPrint?: () =&gt; void;
   *
   */
  @JSProperty("afterPrint")
  void setAfterPrint(AfterPrint value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires before a chart is printed through
   * the context menu item or the <code>Chart.print</code> method. Requires the exporting
   * module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.beforePrint">https://api.highcharts.com/highcharts/chart.events.beforePrint</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.beforePrint">https://api.highcharts.com/highstock/chart.events.beforePrint</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.beforePrint">https://api.highcharts.com/highmaps/chart.events.beforePrint</a>
   *
   * @implspec beforePrint?: () =&gt; void;
   *
   */
  @JSProperty("beforePrint")
  @Nullable
  BeforePrint getBeforePrint();

  /**
   * (Highcharts, Highstock, Highmaps) Fires before a chart is printed through
   * the context menu item or the <code>Chart.print</code> method. Requires the exporting
   * module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.beforePrint">https://api.highcharts.com/highcharts/chart.events.beforePrint</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.beforePrint">https://api.highcharts.com/highstock/chart.events.beforePrint</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.beforePrint">https://api.highcharts.com/highmaps/chart.events.beforePrint</a>
   *
   * @implspec beforePrint?: () =&gt; void;
   *
   */
  @JSProperty("beforePrint")
  void setBeforePrint(BeforePrint value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires when clicking on the plot
   * background. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * Information on the clicked spot can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' value at the clicked spot. The primary axes are
   * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime
   * axis is milliseconds since 1970-01-01 00:00:00.
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.click">https://api.highcharts.com/highcharts/chart.events.click</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.click">https://api.highcharts.com/highstock/chart.events.click</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.click">https://api.highcharts.com/highmaps/chart.events.click</a>
   *
   * @implspec click?: () =&gt; void;
   *
   */
  @JSProperty("click")
  @Nullable
  Click getClick();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when clicking on the plot
   * background. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * Information on the clicked spot can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' value at the clicked spot. The primary axes are
   * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime
   * axis is milliseconds since 1970-01-01 00:00:00.
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.click">https://api.highcharts.com/highcharts/chart.events.click</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.click">https://api.highcharts.com/highstock/chart.events.click</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.click">https://api.highcharts.com/highmaps/chart.events.click</a>
   *
   * @implspec click?: () =&gt; void;
   *
   */
  @JSProperty("click")
  void setClick(Click value);

  /**
   * (Highcharts, Highmaps) Fires when a drilldown point is clicked, before
   * the new series is added. This event is also utilized for async drilldown,
   * where the seriesOptions are not added by option, but rather loaded async.
   * Note that when clicking a category label to trigger multiple series
   * drilldown, one <code>drilldown</code> event is triggered per point in the category.
   *
   * Event arguments:
   *
   * <ul>
   * <li>
   * <code>category</code>: If a category label was clicked, which index.</dd>
   *
   * </li>
   * <li>
   * <code>originalEvent</code>: The original browser event (usually click) that
   * triggered the drilldown.
   *
   * </li>
   * <li>
   * <code>point</code>: The originating point.
   *
   * </li>
   * <li>
   * <code>points</code>: If a category label was clicked, this array holds all points
   * corresponing to the category.</dd>
   *
   * </li>
   * <li>
   * <code>seriesOptions</code>: Options for the new series.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.drilldown">https://api.highcharts.com/highcharts/chart.events.drilldown</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.drilldown">https://api.highcharts.com/highmaps/chart.events.drilldown</a>
   *
   * @implspec drilldown?: DrilldownCallbackFunction;
   *
   */
  @JSProperty("drilldown")
  @Nullable
  DrilldownCallbackFunction getDrilldown();

  /**
   * (Highcharts, Highmaps) Fires when a drilldown point is clicked, before
   * the new series is added. This event is also utilized for async drilldown,
   * where the seriesOptions are not added by option, but rather loaded async.
   * Note that when clicking a category label to trigger multiple series
   * drilldown, one <code>drilldown</code> event is triggered per point in the category.
   *
   * Event arguments:
   *
   * <ul>
   * <li>
   * <code>category</code>: If a category label was clicked, which index.</dd>
   *
   * </li>
   * <li>
   * <code>originalEvent</code>: The original browser event (usually click) that
   * triggered the drilldown.
   *
   * </li>
   * <li>
   * <code>point</code>: The originating point.
   *
   * </li>
   * <li>
   * <code>points</code>: If a category label was clicked, this array holds all points
   * corresponing to the category.</dd>
   *
   * </li>
   * <li>
   * <code>seriesOptions</code>: Options for the new series.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.drilldown">https://api.highcharts.com/highcharts/chart.events.drilldown</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.drilldown">https://api.highcharts.com/highmaps/chart.events.drilldown</a>
   *
   * @implspec drilldown?: DrilldownCallbackFunction;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(DrilldownCallbackFunction value);

  /**
   * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.drillup">https://api.highcharts.com/highcharts/chart.events.drillup</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.drillup">https://api.highcharts.com/highmaps/chart.events.drillup</a>
   *
   * @implspec drillup?: DrillupCallbackFunction;
   *
   */
  @JSProperty("drillup")
  @Nullable
  DrillupCallbackFunction getDrillup();

  /**
   * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.drillup">https://api.highcharts.com/highcharts/chart.events.drillup</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.drillup">https://api.highcharts.com/highmaps/chart.events.drillup</a>
   *
   * @implspec drillup?: DrillupCallbackFunction;
   *
   */
  @JSProperty("drillup")
  void setDrillup(DrillupCallbackFunction value);

  /**
   * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
   * event fires after all the series have been drilled up.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.drillupall">https://api.highcharts.com/highcharts/chart.events.drillupall</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.drillupall">https://api.highcharts.com/highmaps/chart.events.drillupall</a>
   *
   * @implspec drillupall?: DrillupAllCallbackFunction;
   *
   */
  @JSProperty("drillupall")
  @Nullable
  DrillupAllCallbackFunction getDrillupall();

  /**
   * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
   * event fires after all the series have been drilled up.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.drillupall">https://api.highcharts.com/highcharts/chart.events.drillupall</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.drillupall">https://api.highcharts.com/highmaps/chart.events.drillupall</a>
   *
   * @implspec drillupall?: DrillupAllCallbackFunction;
   *
   */
  @JSProperty("drillupall")
  void setDrillupall(DrillupAllCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the chart is finished
   * loading. Since v4.2.2, it also waits for images to be loaded, for example
   * from point markers. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   * There is also a second parameter to the chart constructor where a
   * callback function can be passed to be executed on chart.load.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.load">https://api.highcharts.com/highcharts/chart.events.load</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.load">https://api.highcharts.com/highstock/chart.events.load</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.load">https://api.highcharts.com/highmaps/chart.events.load</a>
   *
   * @implspec load?: () =&gt; void;
   *
   */
  @JSProperty("load")
  @Nullable
  Load getLoad();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the chart is finished
   * loading. Since v4.2.2, it also waits for images to be loaded, for example
   * from point markers. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   * There is also a second parameter to the chart constructor where a
   * callback function can be passed to be executed on chart.load.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.load">https://api.highcharts.com/highcharts/chart.events.load</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.load">https://api.highcharts.com/highstock/chart.events.load</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.load">https://api.highcharts.com/highmaps/chart.events.load</a>
   *
   * @implspec load?: () =&gt; void;
   *
   */
  @JSProperty("load")
  void setLoad(Load value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the chart is redrawn, either
   * after a call to <code>chart.redraw()</code> or after an axis, series or point is
   * modified with the <code>redraw</code> option set to true. One parameter, <code>event</code>, is
   * passed to the function, containing common event information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.redraw">https://api.highcharts.com/highcharts/chart.events.redraw</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.redraw">https://api.highcharts.com/highstock/chart.events.redraw</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.redraw">https://api.highcharts.com/highmaps/chart.events.redraw</a>
   *
   * @implspec redraw?: () =&gt; void;
   *
   */
  @JSProperty("redraw")
  @Nullable
  Redraw getRedraw();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when the chart is redrawn, either
   * after a call to <code>chart.redraw()</code> or after an axis, series or point is
   * modified with the <code>redraw</code> option set to true. One parameter, <code>event</code>, is
   * passed to the function, containing common event information.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.redraw">https://api.highcharts.com/highcharts/chart.events.redraw</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.redraw">https://api.highcharts.com/highstock/chart.events.redraw</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.redraw">https://api.highcharts.com/highmaps/chart.events.redraw</a>
   *
   * @implspec redraw?: () =&gt; void;
   *
   */
  @JSProperty("redraw")
  void setRedraw(Redraw value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires after initial load of the chart
   * (directly after the <code>load</code> event), and after each redraw (directly after
   * the <code>redraw</code> event).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.render">https://api.highcharts.com/highcharts/chart.events.render</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.render">https://api.highcharts.com/highstock/chart.events.render</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.render">https://api.highcharts.com/highmaps/chart.events.render</a>
   *
   * @implspec render?: () =&gt; void;
   *
   */
  @JSProperty("render")
  @Nullable
  Render getRender();

  /**
   * (Highcharts, Highstock, Highmaps) Fires after initial load of the chart
   * (directly after the <code>load</code> event), and after each redraw (directly after
   * the <code>redraw</code> event).
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.render">https://api.highcharts.com/highcharts/chart.events.render</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.render">https://api.highcharts.com/highstock/chart.events.render</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.render">https://api.highcharts.com/highmaps/chart.events.render</a>
   *
   * @implspec render?: () =&gt; void;
   *
   */
  @JSProperty("render")
  void setRender(Render value);

  /**
   * (Highcharts, Highstock, Highmaps) Fires when an area of the chart has
   * been selected. Selection is enabled by setting the chart's zoomType. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information. The default action for the selection event is to zoom the
   * chart to the selected area. It can be prevented by calling
   * <code>event.preventDefault()</code> or return false.
   *
   * Information on the selected area can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and
   * <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds
   * since 1970-01-01 00:00:00.
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.selection">https://api.highcharts.com/highcharts/chart.events.selection</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.selection">https://api.highcharts.com/highstock/chart.events.selection</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.selection">https://api.highcharts.com/highmaps/chart.events.selection</a>
   *
   * @implspec selection?: ChartSelectionCallbackFunction;
   *
   */
  @JSProperty("selection")
  @Nullable
  ChartSelectionCallbackFunction getSelection();

  /**
   * (Highcharts, Highstock, Highmaps) Fires when an area of the chart has
   * been selected. Selection is enabled by setting the chart's zoomType. One
   * parameter, <code>event</code>, is passed to the function, containing common event
   * information. The default action for the selection event is to zoom the
   * chart to the selected area. It can be prevented by calling
   * <code>event.preventDefault()</code> or return false.
   *
   * Information on the selected area can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and
   * <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds
   * since 1970-01-01 00:00:00.
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart.events.selection">https://api.highcharts.com/highcharts/chart.events.selection</a>
   * @see <a href="https://api.highcharts.com/highstock/chart.events.selection">https://api.highcharts.com/highstock/chart.events.selection</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart.events.selection">https://api.highcharts.com/highmaps/chart.events.selection</a>
   *
   * @implspec selection?: ChartSelectionCallbackFunction;
   *
   */
  @JSProperty("selection")
  void setSelection(ChartSelectionCallbackFunction value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface AddSeries extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface AfterPrint extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface BeforePrint extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Click extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Load extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Redraw extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Render extends Any {
    void apply();
  }
}
