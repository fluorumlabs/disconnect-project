package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorAxisOptions | Array < ColorAxisOptions > ) */;
import js.lang.Unknown /* ( XAxisOptions | Array < XAxisOptions > ) */;
import js.lang.Unknown /* ( YAxisOptions | Array < YAxisOptions > ) */;
import js.lang.Unknown /* ( ZAxisOptions | Array < ZAxisOptions > ) */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Options extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
   * accessibility for the chart. Requires the accessibility module to be
   * loaded. For a description of the module and information on its features,
   * see Highcharts Accessibility.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  AccessibilityOptions getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
   * accessibility for the chart. Requires the accessibility module to be
   * loaded. For a description of the module and information on its features,
   * see Highcharts Accessibility.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable AccessibilityOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation.
   * It allows to add custom labels or shapes. The items can be tied to
   * points, axis coordinates or chart pixel coordinates.
   *
   */
  @JSProperty("annotations")
  @Nullable
  AnnotationsOptions[] getAnnotations();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation.
   * It allows to add custom labels or shapes. The items can be tied to
   * points, axis coordinates or chart pixel coordinates.
   *
   */
  @JSProperty("annotations")
  void setAnnotations(AnnotationsOptions... value);

  @JSProperty("boost")
  @Nullable
  BoostOptions getBoost();

  @JSProperty("boost")
  void setBoost(@Nullable BoostOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
   * render below the chart and will be part of exported charts. The caption
   * can be updated after chart initialization through the <code>Chart.update</code> or
   * <code>Chart.caption.update</code> methods.
   *
   */
  @JSProperty("caption")
  @Nullable
  CaptionOptions getCaption();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
   * render below the chart and will be part of exported charts. The caption
   * can be updated after chart initialization through the <code>Chart.update</code> or
   * <code>Chart.caption.update</code> methods.
   *
   */
  @JSProperty("caption")
  void setCaption(@Nullable CaptionOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
   *
   */
  @JSProperty("chart")
  @Nullable
  ChartOptions getChart();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
   *
   */
  @JSProperty("chart")
  void setChart(@Nullable ChartOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
   * color axis will appear as a gradient or as separate items inside the
   * legend, depending on whether the axis is scalar or based on data classes.
   *
   * For supported color formats, see the docs article about colors.
   *
   * A scalar color axis is represented by a gradient. The colors either range
   * between the minColor and the maxColor, or for more fine grained control
   * the colors can be defined in stops. Often times, the color axis needs to
   * be adjusted to get the right color spread for the data. In addition to
   * stops, consider using a logarithmic axis type, or setting min and max to
   * avoid the colors being determined by outliers.
   *
   * When dataClasses are used, the ranges are subdivided into separate
   * classes like categories based on their values. This can be used for
   * ranges between two values, but also for a true category. However, when
   * your data is categorized, it may be as convenient to add each category to
   * a separate series.
   *
   * Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
   * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series
   * types.
   *
   * Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   */
  @JSProperty("colorAxis")
  @Nullable
  Unknown /* ( ColorAxisOptions | Array < ColorAxisOptions > ) */ getColorAxis();

  /**
   * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
   * color axis will appear as a gradient or as separate items inside the
   * legend, depending on whether the axis is scalar or based on data classes.
   *
   * For supported color formats, see the docs article about colors.
   *
   * A scalar color axis is represented by a gradient. The colors either range
   * between the minColor and the maxColor, or for more fine grained control
   * the colors can be defined in stops. Often times, the color axis needs to
   * be adjusted to get the right color spread for the data. In addition to
   * stops, consider using a logarithmic axis type, or setting min and max to
   * avoid the colors being determined by outliers.
   *
   * When dataClasses are used, the ranges are subdivided into separate
   * classes like categories based on their values. This can be used for
   * ranges between two values, but also for a true category. However, when
   * your data is categorized, it may be as convenient to add each category to
   * a separate series.
   *
   * Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
   * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series
   * types.
   *
   * Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(@Nullable ColorAxisOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
   * color axis will appear as a gradient or as separate items inside the
   * legend, depending on whether the axis is scalar or based on data classes.
   *
   * For supported color formats, see the docs article about colors.
   *
   * A scalar color axis is represented by a gradient. The colors either range
   * between the minColor and the maxColor, or for more fine grained control
   * the colors can be defined in stops. Often times, the color axis needs to
   * be adjusted to get the right color spread for the data. In addition to
   * stops, consider using a logarithmic axis type, or setting min and max to
   * avoid the colors being determined by outliers.
   *
   * When dataClasses are used, the ranges are subdivided into separate
   * classes like categories based on their values. This can be used for
   * ranges between two values, but also for a true category. However, when
   * your data is categorized, it may be as convenient to add each category to
   * a separate series.
   *
   * Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
   * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series
   * types.
   *
   * Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(ColorAxisOptions... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the default
   * colors for the chart's series. When all colors are used, new colors are
   * pulled from the start again.
   *
   * Default colors can also be set on a series or series.type basis, see
   * column.colors, pie.colors.
   *
   * In styled mode, the colors option doesn't exist. Instead, colors are
   * defined in CSS and applied either through series or point class names, or
   * through the chart.colorCount option.
   *
   * <h3>Legacy</h3>
   * In Highcharts 3.x, the default colors were: (see online documentation for
   * example)
   *
   * In Highcharts 2.x, the default colors were: (see online documentation for
   * example)
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the default
   * colors for the chart's series. When all colors are used, new colors are
   * pulled from the start again.
   *
   * Default colors can also be set on a series or series.type basis, see
   * column.colors, pie.colors.
   *
   * In styled mode, the colors option doesn't exist. Instead, colors are
   * defined in CSS and applied either through series or point class names, or
   * through the chart.colorCount option.
   *
   * <h3>Legacy</h3>
   * In Highcharts 3.x, the default colors were: (see online documentation for
   * example)
   *
   * In Highcharts 2.x, the default colors were: (see online documentation for
   * example)
   *
   */
  @JSProperty("colors")
  void setColors(String... value);

  /**
   * (Gantt) The Pathfinder module allows you to define connections between
   * any two points, represented as lines - optionally with markers for the
   * start and/or end points. Multiple algorithms are available for
   * calculating how the connecting lines are drawn.
   *
   * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
   * charts, the connectors are used to draw dependencies between tasks.
   *
   */
  @JSProperty("connectors")
  @Nullable
  ConnectorsOptions getConnectors();

  /**
   * (Gantt) The Pathfinder module allows you to define connections between
   * any two points, represented as lines - optionally with markers for the
   * start and/or end points. Multiple algorithms are available for
   * calculating how the connecting lines are drawn.
   *
   * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
   * charts, the connectors are used to draw dependencies between tasks.
   *
   */
  @JSProperty("connectors")
  void setConnectors(@Nullable ConnectorsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a
   * credits label in the lower right corner of the chart. This can be changed
   * using these options.
   *
   */
  @JSProperty("credits")
  @Nullable
  CreditsOptions getCredits();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a
   * credits label in the lower right corner of the chart. This can be changed
   * using these options.
   *
   */
  @JSProperty("credits")
  void setCredits(@Nullable CreditsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
   * simplified interface for adding data to a chart from sources like CVS,
   * HTML tables or grid views. See also the tutorial article on the Data
   * module.
   *
   * It requires the <code>modules/data.js</code> file to be loaded.
   *
   * Please note that the default way of adding data in Highcharts, without
   * the need of a module, is through the series.<em>type</em>.data option.
   *
   */
  @JSProperty("data")
  @Nullable
  DataOptions getData();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
   * simplified interface for adding data to a chart from sources like CVS,
   * HTML tables or grid views. See also the tutorial article on the Data
   * module.
   *
   * It requires the <code>modules/data.js</code> file to be loaded.
   *
   * Please note that the default way of adding data in Highcharts, without
   * the need of a module, is through the series.<em>type</em>.data option.
   *
   */
  @JSProperty("data")
  void setData(@Nullable DataOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styled mode only. Configuration
   * object for adding SVG definitions for reusable elements. See gradients,
   * shadows and patterns for more information and code examples.
   *
   */
  @JSProperty("defs")
  @Nullable
  DefsOptions getDefs();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styled mode only. Configuration
   * object for adding SVG definitions for reusable elements. See gradients,
   * shadows and patterns for more information and code examples.
   *
   */
  @JSProperty("defs")
  void setDefs(@Nullable DefsOptions value);

  /**
   * (Highcharts, Highmaps) Options for drill down, the concept of inspecting
   * increasingly high resolution data through clicking on chart items like
   * columns or pie slices.
   *
   * The drilldown feature requires the drilldown.js file to be loaded, found
   * in the modules directory of the download package, or online at
   * code.highcharts.com/modules/drilldown.js.
   *
   */
  @JSProperty("drilldown")
  @Nullable
  DrilldownOptions getDrilldown();

  /**
   * (Highcharts, Highmaps) Options for drill down, the concept of inspecting
   * increasingly high resolution data through clicking on chart items like
   * columns or pie slices.
   *
   * The drilldown feature requires the drilldown.js file to be loaded, found
   * in the modules directory of the download package, or online at
   * code.highcharts.com/modules/drilldown.js.
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(@Nullable DrilldownOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting
   * module. For an overview on the matter, see the docs.
   *
   */
  @JSProperty("exporting")
  @Nullable
  ExportingOptions getExporting();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting
   * module. For an overview on the matter, see the docs.
   *
   */
  @JSProperty("exporting")
  void setExporting(@Nullable ExportingOptions value);

  @JSProperty("global")
  @Nullable
  GlobalOptions getGlobal();

  @JSProperty("global")
  void setGlobal(@Nullable GlobalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language
   * object is global and it can't be set on each chart initialization.
   * Instead, use <code>Highcharts.setOptions</code> to set it before any chart is
   * initialized. (see online documentation for example)
   *
   */
  @JSProperty("lang")
  @Nullable
  LangOptions getLang();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language
   * object is global and it can't be set on each chart initialization.
   * Instead, use <code>Highcharts.setOptions</code> to set it before any chart is
   * initialized. (see online documentation for example)
   *
   */
  @JSProperty("lang")
  void setLang(@Nullable LangOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a
   * symbol and name for each series item or point item in the chart. Each
   * series (or points in case of pie charts) is represented by a symbol and
   * its name in the legend.
   *
   * It is possible to override the symbol creator function and create custom
   * legend symbols.
   *
   */
  @JSProperty("legend")
  @Nullable
  LegendOptions getLegend();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a
   * symbol and name for each series item or point item in the chart. Each
   * series (or points in case of pie charts) is represented by a symbol and
   * its name in the legend.
   *
   * It is possible to override the symbol creator function and create custom
   * legend symbols.
   *
   */
  @JSProperty("legend")
  void setLegend(@Nullable LegendOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
   * appearance of the loading screen that covers the plot area on chart
   * operations. This screen only appears after an explicit call to
   * <code>chart.showLoading()</code>. It is a utility for developers to communicate to
   * the end user that something is going on, for example while retrieving new
   * data via an XHR connection. The &quot;Loading...&quot; text itself is not part of
   * this configuration object, but part of the <code>lang</code> object.
   *
   */
  @JSProperty("loading")
  @Nullable
  LoadingOptions getLoading();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
   * appearance of the loading screen that covers the plot area on chart
   * operations. This screen only appears after an explicit call to
   * <code>chart.showLoading()</code>. It is a utility for developers to communicate to
   * the end user that something is going on, for example while retrieving new
   * data via an XHR connection. The &quot;Loading...&quot; text itself is not part of
   * this configuration object, but part of the <code>lang</code> object.
   *
   */
  @JSProperty("loading")
  void setLoading(@Nullable LoadingOptions value);

  @JSProperty("mapNavigation")
  @Nullable
  MapNavigationOptions getMapNavigation();

  @JSProperty("mapNavigation")
  void setMapNavigation(@Nullable MapNavigationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
   * buttons and menus appearing in the exporting module.
   *
   */
  @JSProperty("navigation")
  @Nullable
  NavigationOptions getNavigation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
   * buttons and menus appearing in the exporting module.
   *
   */
  @JSProperty("navigation")
  void setNavigation(@Nullable NavigationOptions value);

  /**
   * (Highstock, Gantt) The navigator is a small series below the main series,
   * displaying a view of the entire data set. It provides tools to zoom in
   * and out on parts of the data as well as panning across the dataset.
   *
   */
  @JSProperty("navigator")
  @Nullable
  NavigatorOptions getNavigator();

  /**
   * (Highstock, Gantt) The navigator is a small series below the main series,
   * displaying a view of the entire data set. It provides tools to zoom in
   * and out on parts of the data as well as panning across the dataset.
   *
   */
  @JSProperty("navigator")
  void setNavigator(@Nullable NavigatorOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for displaying a message like &quot;No
   * data to display&quot;. This feature requires the file no-data-to-display.js to
   * be loaded in the page. The actual text to display is set in the
   * lang.noData option.
   *
   */
  @JSProperty("noData")
  @Nullable
  NoDataOptions getNoData();

  /**
   * (Highcharts, Highstock, Gantt) Options for displaying a message like &quot;No
   * data to display&quot;. This feature requires the file no-data-to-display.js to
   * be loaded in the page. The actual text to display is set in the
   * lang.noData option.
   *
   */
  @JSProperty("noData")
  void setNoData(@Nullable NoDataOptions value);

  /**
   * (Highcharts) The pane serves as a container for axes and backgrounds for
   * circular gauges and polar charts.
   *
   */
  @JSProperty("pane")
  @Nullable
  PaneOptions getPane();

  /**
   * (Highcharts) The pane serves as a container for axes and backgrounds for
   * circular gauges and polar charts.
   *
   */
  @JSProperty("pane")
  void setPane(@Nullable PaneOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper
   * object for config objects for each series type. The config objects for
   * each series can also be overridden for each series item as given in the
   * series array.
   *
   * Configuration options for the series are given in three levels. Options
   * for all series in a chart are given in the plotOptions.series object.
   * Then options for all series of a specific type are given in the
   * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
   * for one single series are given in the series array.
   *
   */
  @JSProperty("plotOptions")
  @Nullable
  PlotOptions getPlotOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper
   * object for config objects for each series type. The config objects for
   * each series can also be overridden for each series item as given in the
   * series array.
   *
   * Configuration options for the series are given in three levels. Options
   * for all series in a chart are given in the plotOptions.series object.
   * Then options for all series of a specific type are given in the
   * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
   * for one single series are given in the series array.
   *
   */
  @JSProperty("plotOptions")
  void setPlotOptions(@Nullable PlotOptions value);

  /**
   * (Highstock, Gantt) The range selector is a tool for selecting ranges to
   * display within the chart. It provides buttons to select preconfigured
   * ranges in the chart, like 1 day, 1 week, 1 month etc. It also provides
   * input boxes where min and max dates can be manually input.
   *
   */
  @JSProperty("rangeSelector")
  @Nullable
  RangeSelectorOptions getRangeSelector();

  /**
   * (Highstock, Gantt) The range selector is a tool for selecting ranges to
   * display within the chart. It provides buttons to select preconfigured
   * ranges in the chart, like 1 day, 1 week, 1 month etc. It also provides
   * input boxes where min and max dates can be manually input.
   *
   */
  @JSProperty("rangeSelector")
  void setRangeSelector(@Nullable RangeSelectorOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
   * apply for different screen or chart sizes. Each rule specifies additional
   * chart options.
   *
   */
  @JSProperty("responsive")
  @Nullable
  ResponsiveOptions getResponsive();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
   * apply for different screen or chart sizes. Each rule specifies additional
   * chart options.
   *
   */
  @JSProperty("responsive")
  void setResponsive(@Nullable ResponsiveOptions value);

  /**
   * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of
   * a stock chart. Scrollbars can also be applied to other types of axes.
   *
   * Another approach to scrollable charts is the chart.scrollablePlotArea
   * option that is especially suitable for simpler cartesian charts on
   * mobile.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   */
  @JSProperty("scrollbar")
  @Nullable
  ScrollbarOptions getScrollbar();

  /**
   * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of
   * a stock chart. Scrollbars can also be applied to other types of axes.
   *
   * Another approach to scrollable charts is the chart.scrollablePlotArea
   * option that is especially suitable for simpler cartesian charts on
   * mobile.
   *
   * In styled mode, all the presentational options for the scrollbar are
   * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
   * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
   * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
   *
   */
  @JSProperty("scrollbar")
  void setScrollbar(@Nullable ScrollbarOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data
   * and the data itself. In TypeScript you have to cast the series options to
   * specific series types, to get all possible options for a series.
   *
   */
  @JSProperty("series")
  @Nullable
  SeriesOptionsRegistry[] getSeries();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data
   * and the data itself. In TypeScript you have to cast the series options to
   * specific series types, to get all possible options for a series.
   *
   */
  @JSProperty("series")
  void setSeries(SeriesOptionsRegistry... value);

  /**
   * (Highstock) Configure the stockTools gui strings in the chart. Requires
   * the <a href="">stockTools module</a> to be loaded. For a description of the module
   * and information on its features, see <a href="">Highcharts StockTools</a>.
   *
   */
  @JSProperty("stockTools")
  @Nullable
  StockToolsOptions getStockTools();

  /**
   * (Highstock) Configure the stockTools gui strings in the chart. Requires
   * the <a href="">stockTools module</a> to be loaded. For a description of the module
   * and information on its features, see <a href="">Highcharts StockTools</a>.
   *
   */
  @JSProperty("stockTools")
  void setStockTools(@Nullable StockToolsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can
   * be used both to display a subtitle below the main title, and to display
   * random text anywhere in the chart. The subtitle can be updated after
   * chart initialization through the <code>Chart.setTitle</code> method.
   *
   */
  @JSProperty("subtitle")
  @Nullable
  SubtitleOptions getSubtitle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can
   * be used both to display a subtitle below the main title, and to display
   * random text anywhere in the chart. The subtitle can be updated after
   * chart initialization through the <code>Chart.setTitle</code> method.
   *
   */
  @JSProperty("subtitle")
  void setSubtitle(@Nullable SubtitleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply
   * globally or to individual charts. These settings affect how <code>datetime</code>
   * axes are laid out, how tooltips are formatted, how series
   * pointIntervalUnit works and how the Highstock range selector handles
   * time.
   *
   * The common use case is that all charts in the same Highcharts object
   * share the same time settings, in which case the global settings are set
   * using <code>setOptions</code>. (see online documentation for example)
   *
   * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
   * <code>time</code> object, and time options can be set on each individual chart.
   *
   */
  @JSProperty("time")
  @Nullable
  TimeOptions getTime();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply
   * globally or to individual charts. These settings affect how <code>datetime</code>
   * axes are laid out, how tooltips are formatted, how series
   * pointIntervalUnit works and how the Highstock range selector handles
   * time.
   *
   * The common use case is that all charts in the same Highcharts object
   * share the same time settings, in which case the global settings are set
   * using <code>setOptions</code>. (see online documentation for example)
   *
   * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
   * <code>time</code> object, and time options can be set on each individual chart.
   *
   */
  @JSProperty("time")
  void setTime(@Nullable TimeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
   *
   */
  @JSProperty("title")
  @Nullable
  TitleOptions getTitle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable TitleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that
   * appears when the user hovers over a series or point.
   *
   */
  @JSProperty("tooltip")
  @Nullable
  TooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that
   * appears when the user hovers over a series or point.
   *
   */
  @JSProperty("tooltip")
  void setTooltip(@Nullable TooltipOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
   * Normally this is the horizontal axis, though if the chart is inverted
   * this is the vertical axis. In case of multiple axes, the xAxis node is an
   * array of configuration objects.
   *
   * See the Axis class for programmatic access to the axis.
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown /* ( XAxisOptions | Array < XAxisOptions > ) */ getXAxis();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
   * Normally this is the horizontal axis, though if the chart is inverted
   * this is the vertical axis. In case of multiple axes, the xAxis node is an
   * array of configuration objects.
   *
   * See the Axis class for programmatic access to the axis.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(@Nullable XAxisOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
   * Normally this is the horizontal axis, though if the chart is inverted
   * this is the vertical axis. In case of multiple axes, the xAxis node is an
   * array of configuration objects.
   *
   * See the Axis class for programmatic access to the axis.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(XAxisOptions... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
   * Normally this is the vertical axis, though if the chart is inverted this
   * is the horizontal axis. In case of multiple axes, the yAxis node is an
   * array of configuration objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown /* ( YAxisOptions | Array < YAxisOptions > ) */ getYAxis();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
   * Normally this is the vertical axis, though if the chart is inverted this
   * is the horizontal axis. In case of multiple axes, the yAxis node is an
   * array of configuration objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(@Nullable YAxisOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
   * Normally this is the vertical axis, though if the chart is inverted this
   * is the horizontal axis. In case of multiple axes, the yAxis node is an
   * array of configuration objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(YAxisOptions... value);

  /**
   * (Highcharts) The Z axis or depth axis for 3D plots.
   *
   * See the Axis class for programmatic access to the axis.
   *
   */
  @JSProperty("zAxis")
  @Nullable
  Unknown /* ( ZAxisOptions | Array < ZAxisOptions > ) */ getZAxis();

  /**
   * (Highcharts) The Z axis or depth axis for 3D plots.
   *
   * See the Axis class for programmatic access to the axis.
   *
   */
  @JSProperty("zAxis")
  void setZAxis(ZAxisOptions... value);

  /**
   * (Highcharts) The Z axis or depth axis for 3D plots.
   *
   * See the Axis class for programmatic access to the axis.
   *
   */
  @JSProperty("zAxis")
  void setZAxis(@Nullable ZAxisOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final Options object = Any.empty();

    private Builder() {
    }

    public Options build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
     * accessibility for the chart. Requires the accessibility module to be
     * loaded. For a description of the module and information on its features,
     * see Highcharts Accessibility.
     *
     */
    public Builder accessibility(@Nullable AccessibilityOptions value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation.
     * It allows to add custom labels or shapes. The items can be tied to
     * points, axis coordinates or chart pixel coordinates.
     *
     */
    public Builder annotations(AnnotationsOptions... value) {
      object.setAnnotations(value);
      return this;
    }

    public Builder boost(@Nullable BoostOptions value) {
      object.setBoost(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
     * render below the chart and will be part of exported charts. The caption
     * can be updated after chart initialization through the <code>Chart.update</code> or
     * <code>Chart.caption.update</code> methods.
     *
     */
    public Builder caption(@Nullable CaptionOptions value) {
      object.setCaption(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
     *
     */
    public Builder chart(@Nullable ChartOptions value) {
      object.setChart(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
     * color axis will appear as a gradient or as separate items inside the
     * legend, depending on whether the axis is scalar or based on data classes.
     *
     * For supported color formats, see the docs article about colors.
     *
     * A scalar color axis is represented by a gradient. The colors either range
     * between the minColor and the maxColor, or for more fine grained control
     * the colors can be defined in stops. Often times, the color axis needs to
     * be adjusted to get the right color spread for the data. In addition to
     * stops, consider using a logarithmic axis type, or setting min and max to
     * avoid the colors being determined by outliers.
     *
     * When dataClasses are used, the ranges are subdivided into separate
     * classes like categories based on their values. This can be used for
     * ranges between two values, but also for a true category. However, when
     * your data is categorized, it may be as convenient to add each category to
     * a separate series.
     *
     * Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
     * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series
     * types.
     *
     * Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.
     *
     * See the Axis object for programmatic access to the axis.
     *
     */
    public Builder colorAxis(@Nullable ColorAxisOptions value) {
      object.setColorAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
     * color axis will appear as a gradient or as separate items inside the
     * legend, depending on whether the axis is scalar or based on data classes.
     *
     * For supported color formats, see the docs article about colors.
     *
     * A scalar color axis is represented by a gradient. The colors either range
     * between the minColor and the maxColor, or for more fine grained control
     * the colors can be defined in stops. Often times, the color axis needs to
     * be adjusted to get the right color spread for the data. In addition to
     * stops, consider using a logarithmic axis type, or setting min and max to
     * avoid the colors being determined by outliers.
     *
     * When dataClasses are used, the ranges are subdivided into separate
     * classes like categories based on their values. This can be used for
     * ranges between two values, but also for a true category. However, when
     * your data is categorized, it may be as convenient to add each category to
     * a separate series.
     *
     * Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
     * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series
     * types.
     *
     * Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.
     *
     * See the Axis object for programmatic access to the axis.
     *
     */
    public Builder colorAxis(ColorAxisOptions... value) {
      object.setColorAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the default
     * colors for the chart's series. When all colors are used, new colors are
     * pulled from the start again.
     *
     * Default colors can also be set on a series or series.type basis, see
     * column.colors, pie.colors.
     *
     * In styled mode, the colors option doesn't exist. Instead, colors are
     * defined in CSS and applied either through series or point class names, or
     * through the chart.colorCount option.
     *
     * <h3>Legacy</h3>
     * In Highcharts 3.x, the default colors were: (see online documentation for
     * example)
     *
     * In Highcharts 2.x, the default colors were: (see online documentation for
     * example)
     *
     */
    public Builder colors(String... value) {
      object.setColors(value);
      return this;
    }

    /**
     * (Gantt) The Pathfinder module allows you to define connections between
     * any two points, represented as lines - optionally with markers for the
     * start and/or end points. Multiple algorithms are available for
     * calculating how the connecting lines are drawn.
     *
     * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
     * charts, the connectors are used to draw dependencies between tasks.
     *
     */
    public Builder connectors(@Nullable ConnectorsOptions value) {
      object.setConnectors(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a
     * credits label in the lower right corner of the chart. This can be changed
     * using these options.
     *
     */
    public Builder credits(@Nullable CreditsOptions value) {
      object.setCredits(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
     * simplified interface for adding data to a chart from sources like CVS,
     * HTML tables or grid views. See also the tutorial article on the Data
     * module.
     *
     * It requires the <code>modules/data.js</code> file to be loaded.
     *
     * Please note that the default way of adding data in Highcharts, without
     * the need of a module, is through the series.<em>type</em>.data option.
     *
     */
    public Builder data(@Nullable DataOptions value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Styled mode only. Configuration
     * object for adding SVG definitions for reusable elements. See gradients,
     * shadows and patterns for more information and code examples.
     *
     */
    public Builder defs(@Nullable DefsOptions value) {
      object.setDefs(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for drill down, the concept of inspecting
     * increasingly high resolution data through clicking on chart items like
     * columns or pie slices.
     *
     * The drilldown feature requires the drilldown.js file to be loaded, found
     * in the modules directory of the download package, or online at
     * code.highcharts.com/modules/drilldown.js.
     *
     */
    public Builder drilldown(@Nullable DrilldownOptions value) {
      object.setDrilldown(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting
     * module. For an overview on the matter, see the docs.
     *
     */
    public Builder exporting(@Nullable ExportingOptions value) {
      object.setExporting(value);
      return this;
    }

    public Builder global(@Nullable GlobalOptions value) {
      object.setGlobal(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language
     * object is global and it can't be set on each chart initialization.
     * Instead, use <code>Highcharts.setOptions</code> to set it before any chart is
     * initialized. (see online documentation for example)
     *
     */
    public Builder lang(@Nullable LangOptions value) {
      object.setLang(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a
     * symbol and name for each series item or point item in the chart. Each
     * series (or points in case of pie charts) is represented by a symbol and
     * its name in the legend.
     *
     * It is possible to override the symbol creator function and create custom
     * legend symbols.
     *
     */
    public Builder legend(@Nullable LegendOptions value) {
      object.setLegend(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
     * appearance of the loading screen that covers the plot area on chart
     * operations. This screen only appears after an explicit call to
     * <code>chart.showLoading()</code>. It is a utility for developers to communicate to
     * the end user that something is going on, for example while retrieving new
     * data via an XHR connection. The &quot;Loading...&quot; text itself is not part of
     * this configuration object, but part of the <code>lang</code> object.
     *
     */
    public Builder loading(@Nullable LoadingOptions value) {
      object.setLoading(value);
      return this;
    }

    public Builder mapNavigation(@Nullable MapNavigationOptions value) {
      object.setMapNavigation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
     * buttons and menus appearing in the exporting module.
     *
     */
    public Builder navigation(@Nullable NavigationOptions value) {
      object.setNavigation(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The navigator is a small series below the main series,
     * displaying a view of the entire data set. It provides tools to zoom in
     * and out on parts of the data as well as panning across the dataset.
     *
     */
    public Builder navigator(@Nullable NavigatorOptions value) {
      object.setNavigator(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Options for displaying a message like &quot;No
     * data to display&quot;. This feature requires the file no-data-to-display.js to
     * be loaded in the page. The actual text to display is set in the
     * lang.noData option.
     *
     */
    public Builder noData(@Nullable NoDataOptions value) {
      object.setNoData(value);
      return this;
    }

    /**
     * (Highcharts) The pane serves as a container for axes and backgrounds for
     * circular gauges and polar charts.
     *
     */
    public Builder pane(@Nullable PaneOptions value) {
      object.setPane(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper
     * object for config objects for each series type. The config objects for
     * each series can also be overridden for each series item as given in the
     * series array.
     *
     * Configuration options for the series are given in three levels. Options
     * for all series in a chart are given in the plotOptions.series object.
     * Then options for all series of a specific type are given in the
     * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
     * for one single series are given in the series array.
     *
     */
    public Builder plotOptions(@Nullable PlotOptions value) {
      object.setPlotOptions(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The range selector is a tool for selecting ranges to
     * display within the chart. It provides buttons to select preconfigured
     * ranges in the chart, like 1 day, 1 week, 1 month etc. It also provides
     * input boxes where min and max dates can be manually input.
     *
     */
    public Builder rangeSelector(@Nullable RangeSelectorOptions value) {
      object.setRangeSelector(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
     * apply for different screen or chart sizes. Each rule specifies additional
     * chart options.
     *
     */
    public Builder responsive(@Nullable ResponsiveOptions value) {
      object.setResponsive(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of
     * a stock chart. Scrollbars can also be applied to other types of axes.
     *
     * Another approach to scrollable charts is the chart.scrollablePlotArea
     * option that is especially suitable for simpler cartesian charts on
     * mobile.
     *
     * In styled mode, all the presentational options for the scrollbar are
     * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
     * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
     * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.
     *
     */
    public Builder scrollbar(@Nullable ScrollbarOptions value) {
      object.setScrollbar(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data
     * and the data itself. In TypeScript you have to cast the series options to
     * specific series types, to get all possible options for a series.
     *
     */
    public Builder series(SeriesOptionsRegistry... value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highstock) Configure the stockTools gui strings in the chart. Requires
     * the <a href="">stockTools module</a> to be loaded. For a description of the module
     * and information on its features, see <a href="">Highcharts StockTools</a>.
     *
     */
    public Builder stockTools(@Nullable StockToolsOptions value) {
      object.setStockTools(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can
     * be used both to display a subtitle below the main title, and to display
     * random text anywhere in the chart. The subtitle can be updated after
     * chart initialization through the <code>Chart.setTitle</code> method.
     *
     */
    public Builder subtitle(@Nullable SubtitleOptions value) {
      object.setSubtitle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply
     * globally or to individual charts. These settings affect how <code>datetime</code>
     * axes are laid out, how tooltips are formatted, how series
     * pointIntervalUnit works and how the Highstock range selector handles
     * time.
     *
     * The common use case is that all charts in the same Highcharts object
     * share the same time settings, in which case the global settings are set
     * using <code>setOptions</code>. (see online documentation for example)
     *
     * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
     * <code>time</code> object, and time options can be set on each individual chart.
     *
     */
    public Builder time(@Nullable TimeOptions value) {
      object.setTime(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
     *
     */
    public Builder title(@Nullable TitleOptions value) {
      object.setTitle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that
     * appears when the user hovers over a series or point.
     *
     */
    public Builder tooltip(@Nullable TooltipOptions value) {
      object.setTooltip(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
     * Normally this is the horizontal axis, though if the chart is inverted
     * this is the vertical axis. In case of multiple axes, the xAxis node is an
     * array of configuration objects.
     *
     * See the Axis class for programmatic access to the axis.
     *
     */
    public Builder xAxis(@Nullable XAxisOptions value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
     * Normally this is the horizontal axis, though if the chart is inverted
     * this is the vertical axis. In case of multiple axes, the xAxis node is an
     * array of configuration objects.
     *
     * See the Axis class for programmatic access to the axis.
     *
     */
    public Builder xAxis(XAxisOptions... value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
     * Normally this is the vertical axis, though if the chart is inverted this
     * is the horizontal axis. In case of multiple axes, the yAxis node is an
     * array of configuration objects.
     *
     * See the Axis object for programmatic access to the axis.
     *
     */
    public Builder yAxis(@Nullable YAxisOptions value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
     * Normally this is the vertical axis, though if the chart is inverted this
     * is the horizontal axis. In case of multiple axes, the yAxis node is an
     * array of configuration objects.
     *
     * See the Axis object for programmatic access to the axis.
     *
     */
    public Builder yAxis(YAxisOptions... value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * (Highcharts) The Z axis or depth axis for 3D plots.
     *
     * See the Axis class for programmatic access to the axis.
     *
     */
    public Builder zAxis(ZAxisOptions... value) {
      object.setZAxis(value);
      return this;
    }

    /**
     * (Highcharts) The Z axis or depth axis for 3D plots.
     *
     * See the Axis class for programmatic access to the axis.
     *
     */
    public Builder zAxis(@Nullable ZAxisOptions value) {
      object.setZAxis(value);
      return this;
    }
  }
}
