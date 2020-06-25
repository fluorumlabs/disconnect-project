package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartEventsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
   * the chart after load time, using the <code>addSeries</code> method. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * Through <code>event.options</code> you can access the series options that were
   * passed to the <code>addSeries</code> method. Returning false prevents the series
   * from being added.
   *
   */
  @JSProperty("addSeries")
  @Nullable
  ChartAddSeriesCallbackFunction getAddSeries();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
   * the chart after load time, using the <code>addSeries</code> method. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * Through <code>event.options</code> you can access the series options that were
   * passed to the <code>addSeries</code> method. Returning false prevents the series
   * from being added.
   *
   */
  @JSProperty("addSeries")
  void setAddSeries(@Nullable ChartAddSeriesCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
   * through the context menu item or the <code>Chart.print</code> method.
   *
   */
  @JSProperty("afterPrint")
  @Nullable
  ExportingAfterPrintCallbackFunction getAfterPrint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
   * through the context menu item or the <code>Chart.print</code> method.
   *
   */
  @JSProperty("afterPrint")
  void setAfterPrint(@Nullable ExportingAfterPrintCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
   * through the context menu item or the <code>Chart.print</code> method.
   *
   */
  @JSProperty("beforePrint")
  @Nullable
  ExportingBeforePrintCallbackFunction getBeforePrint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
   * through the context menu item or the <code>Chart.print</code> method.
   *
   */
  @JSProperty("beforePrint")
  void setBeforePrint(@Nullable ExportingBeforePrintCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
   * background. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * Information on the clicked spot can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' value at the clicked spot. The primary axes are
   * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime
   * axis is milliseconds since 1970-01-01 00:00:00. (see online documentation
   * for example)
   *
   */
  @JSProperty("click")
  @Nullable
  ChartClickCallbackFunction getClick();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
   * background. One parameter, <code>event</code>, is passed to the function, containing
   * common event information.
   *
   * Information on the clicked spot can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' value at the clicked spot. The primary axes are
   * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime
   * axis is milliseconds since 1970-01-01 00:00:00. (see online documentation
   * for example)
   *
   */
  @JSProperty("click")
  void setClick(@Nullable ChartClickCallbackFunction value);

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
   * <code>category</code>: If a category label was clicked, which index.
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
   * corresponing to the category.
   *
   * </li>
   * <li>
   * <code>seriesOptions</code>: Options for the new series.
   *
   * </li>
   * </ul>
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
   * <code>category</code>: If a category label was clicked, which index.
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
   * corresponing to the category.
   *
   * </li>
   * <li>
   * <code>seriesOptions</code>: Options for the new series.
   *
   * </li>
   * </ul>
   */
  @JSProperty("drilldown")
  void setDrilldown(@Nullable DrilldownCallbackFunction value);

  /**
   * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
   *
   */
  @JSProperty("drillup")
  @Nullable
  DrillupCallbackFunction getDrillup();

  /**
   * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
   *
   */
  @JSProperty("drillup")
  void setDrillup(@Nullable DrillupCallbackFunction value);

  /**
   * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
   * event fires after all the series have been drilled up.
   *
   */
  @JSProperty("drillupall")
  @Nullable
  DrillupAllCallbackFunction getDrillupall();

  /**
   * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
   * event fires after all the series have been drilled up.
   *
   */
  @JSProperty("drillupall")
  void setDrillupall(@Nullable DrillupAllCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
   * exporting data. This allows the modification of data rows before
   * processed into the final format.
   *
   */
  @JSProperty("exportData")
  @Nullable
  ExportDataCallbackFunction getExportData();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
   * exporting data. This allows the modification of data rows before
   * processed into the final format.
   *
   */
  @JSProperty("exportData")
  void setExportData(@Nullable ExportDataCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
   * loading. Since v4.2.2, it also waits for images to be loaded, for example
   * from point markers. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   * There is also a second parameter to the chart constructor where a
   * callback function can be passed to be executed on chart.load.
   *
   */
  @JSProperty("load")
  @Nullable
  ChartLoadCallbackFunction getLoad();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
   * loading. Since v4.2.2, it also waits for images to be loaded, for example
   * from point markers. One parameter, <code>event</code>, is passed to the function,
   * containing common event information.
   *
   * There is also a second parameter to the chart constructor where a
   * callback function can be passed to be executed on chart.load.
   *
   */
  @JSProperty("load")
  void setLoad(@Nullable ChartLoadCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
   * either after a call to <code>chart.redraw()</code> or after an axis, series or point
   * is modified with the <code>redraw</code> option set to <code>true</code>. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   *
   */
  @JSProperty("redraw")
  @Nullable
  ChartRedrawCallbackFunction getRedraw();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
   * either after a call to <code>chart.redraw()</code> or after an axis, series or point
   * is modified with the <code>redraw</code> option set to <code>true</code>. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   *
   */
  @JSProperty("redraw")
  void setRedraw(@Nullable ChartRedrawCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
   * chart (directly after the <code>load</code> event), and after each redraw (directly
   * after the <code>redraw</code> event).
   *
   */
  @JSProperty("render")
  @Nullable
  ChartRenderCallbackFunction getRender();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
   * chart (directly after the <code>load</code> event), and after each redraw (directly
   * after the <code>redraw</code> event).
   *
   */
  @JSProperty("render")
  void setRender(@Nullable ChartRenderCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
   * has been selected. Selection is enabled by setting the chart's zoomType.
   * One parameter, <code>event</code>, is passed to the function, containing common
   * event information. The default action for the selection event is to zoom
   * the chart to the selected area. It can be prevented by calling
   * <code>event.preventDefault()</code> or return false.
   *
   * Information on the selected area can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and
   * <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds
   * since 1970-01-01 00:00:00. (see online documentation for example)
   *
   */
  @JSProperty("selection")
  @Nullable
  ChartSelectionCallbackFunction getSelection();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
   * has been selected. Selection is enabled by setting the chart's zoomType.
   * One parameter, <code>event</code>, is passed to the function, containing common
   * event information. The default action for the selection event is to zoom
   * the chart to the selected area. It can be prevented by calling
   * <code>event.preventDefault()</code> or return false.
   *
   * Information on the selected area can be found through <code>event.xAxis</code> and
   * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
   * each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and
   * <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds
   * since 1970-01-01 00:00:00. (see online documentation for example)
   *
   */
  @JSProperty("selection")
  void setSelection(@Nullable ChartSelectionCallbackFunction value);

  class Builder {
    private final ChartEventsOptions object = Any.empty();

    public ChartEventsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
     * the chart after load time, using the <code>addSeries</code> method. One parameter,
     * <code>event</code>, is passed to the function, containing common event information.
     * Through <code>event.options</code> you can access the series options that were
     * passed to the <code>addSeries</code> method. Returning false prevents the series
     * from being added.
     *
     */
    public Builder addSeries(@Nullable ChartAddSeriesCallbackFunction value) {
      object.setAddSeries(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
     * through the context menu item or the <code>Chart.print</code> method.
     *
     */
    public Builder afterPrint(@Nullable ExportingAfterPrintCallbackFunction value) {
      object.setAfterPrint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
     * through the context menu item or the <code>Chart.print</code> method.
     *
     */
    public Builder beforePrint(@Nullable ExportingBeforePrintCallbackFunction value) {
      object.setBeforePrint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
     * background. One parameter, <code>event</code>, is passed to the function, containing
     * common event information.
     *
     * Information on the clicked spot can be found through <code>event.xAxis</code> and
     * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
     * each axis' value at the clicked spot. The primary axes are
     * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime
     * axis is milliseconds since 1970-01-01 00:00:00. (see online documentation
     * for example)
     *
     */
    public Builder click(@Nullable ChartClickCallbackFunction value) {
      object.setClick(value);
      return this;
    }

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
     * <code>category</code>: If a category label was clicked, which index.
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
     * corresponing to the category.
     *
     * </li>
     * <li>
     * <code>seriesOptions</code>: Options for the new series.
     *
     * </li>
     * </ul>
     */
    public Builder drilldown(@Nullable DrilldownCallbackFunction value) {
      object.setDrilldown(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
     *
     */
    public Builder drillup(@Nullable DrillupCallbackFunction value) {
      object.setDrillup(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
     * event fires after all the series have been drilled up.
     *
     */
    public Builder drillupall(@Nullable DrillupAllCallbackFunction value) {
      object.setDrillupall(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
     * exporting data. This allows the modification of data rows before
     * processed into the final format.
     *
     */
    public Builder exportData(@Nullable ExportDataCallbackFunction value) {
      object.setExportData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
     * loading. Since v4.2.2, it also waits for images to be loaded, for example
     * from point markers. One parameter, <code>event</code>, is passed to the function,
     * containing common event information.
     *
     * There is also a second parameter to the chart constructor where a
     * callback function can be passed to be executed on chart.load.
     *
     */
    public Builder load(@Nullable ChartLoadCallbackFunction value) {
      object.setLoad(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
     * either after a call to <code>chart.redraw()</code> or after an axis, series or point
     * is modified with the <code>redraw</code> option set to <code>true</code>. One parameter,
     * <code>event</code>, is passed to the function, containing common event information.
     *
     */
    public Builder redraw(@Nullable ChartRedrawCallbackFunction value) {
      object.setRedraw(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
     * chart (directly after the <code>load</code> event), and after each redraw (directly
     * after the <code>redraw</code> event).
     *
     */
    public Builder render(@Nullable ChartRenderCallbackFunction value) {
      object.setRender(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
     * has been selected. Selection is enabled by setting the chart's zoomType.
     * One parameter, <code>event</code>, is passed to the function, containing common
     * event information. The default action for the selection event is to zoom
     * the chart to the selected area. It can be prevented by calling
     * <code>event.preventDefault()</code> or return false.
     *
     * Information on the selected area can be found through <code>event.xAxis</code> and
     * <code>event.yAxis</code>, which are arrays containing the axes of each dimension and
     * each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and
     * <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds
     * since 1970-01-01 00:00:00. (see online documentation for example)
     *
     */
    public Builder selection(@Nullable ChartSelectionCallbackFunction value) {
      object.setSelection(value);
      return this;
    }
  }
}
