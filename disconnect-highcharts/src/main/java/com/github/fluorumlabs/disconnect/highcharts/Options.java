package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * The option tree for every chart.
 *
 */
public interface Options extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Options for configuring accessibility
   * for the chart. Requires the accessibility module to be loaded. For a
   * description of the module and information on its features, see Highcharts
   * Accessibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility">https://api.highcharts.com/highcharts/accessibility</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility">https://api.highcharts.com/highstock/accessibility</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility">https://api.highcharts.com/highmaps/accessibility</a>
   *
   * @implspec accessibility?: AccessibilityOptions;
   *
   */
  @JSProperty("accessibility")
  @Nullable
  AccessibilityOptions getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps) Options for configuring accessibility
   * for the chart. Requires the accessibility module to be loaded. For a
   * description of the module and information on its features, see Highcharts
   * Accessibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility">https://api.highcharts.com/highcharts/accessibility</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility">https://api.highcharts.com/highstock/accessibility</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility">https://api.highcharts.com/highmaps/accessibility</a>
   *
   * @implspec accessibility?: AccessibilityOptions;
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(AccessibilityOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for configuring annotations,
   * for example labels, arrows or shapes. Annotations can be tied to points,
   * axis coordinates or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations">https://api.highcharts.com/highcharts/annotations</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations">https://api.highcharts.com/highstock/annotations</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations">https://api.highcharts.com/highmaps/annotations</a>
   *
   * @implspec annotations?: Array<AnnotationsOptions>;
   *
   */
  @JSProperty("annotations")
  @Nullable
  Array<AnnotationsOptions> getAnnotations();

  /**
   * (Highcharts, Highstock, Highmaps) Options for configuring annotations,
   * for example labels, arrows or shapes. Annotations can be tied to points,
   * axis coordinates or chart pixel coordinates.
   *
   * @see <a href="https://api.highcharts.com/highcharts/annotations">https://api.highcharts.com/highcharts/annotations</a>
   * @see <a href="https://api.highcharts.com/highstock/annotations">https://api.highcharts.com/highstock/annotations</a>
   * @see <a href="https://api.highcharts.com/highmaps/annotations">https://api.highcharts.com/highmaps/annotations</a>
   *
   * @implspec annotations?: Array<AnnotationsOptions>;
   *
   */
  @JSProperty("annotations")
  void setAnnotations(Array<AnnotationsOptions> value);

  /**
   * (Highcharts, Highstock) Options for the Boost module. The Boost module
   * allows certain series types to be rendered by WebGL instead of the
   * default SVG. This allows hundreds of thousands of data points to be
   * rendered in milliseconds. In addition to the WebGL rendering it saves
   * time by skipping processing and inspection of the data wherever possible.
   * This introduces some limitations to what features are available in Boost
   * mode. See the docs for details.
   *
   * In addition to the global <code>boost</code> option, each series has a
   * boostThreshold that defines when the boost should kick in.
   *
   * Requires the <code>modules/boost.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost">https://api.highcharts.com/highcharts/boost</a>
   * @see <a href="https://api.highcharts.com/highstock/boost">https://api.highcharts.com/highstock/boost</a>
   *
   * @implspec boost?: BoostOptions;
   *
   */
  @JSProperty("boost")
  @Nullable
  BoostOptions getBoost();

  /**
   * (Highcharts, Highstock) Options for the Boost module. The Boost module
   * allows certain series types to be rendered by WebGL instead of the
   * default SVG. This allows hundreds of thousands of data points to be
   * rendered in milliseconds. In addition to the WebGL rendering it saves
   * time by skipping processing and inspection of the data wherever possible.
   * This introduces some limitations to what features are available in Boost
   * mode. See the docs for details.
   *
   * In addition to the global <code>boost</code> option, each series has a
   * boostThreshold that defines when the boost should kick in.
   *
   * Requires the <code>modules/boost.js</code> module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/boost">https://api.highcharts.com/highcharts/boost</a>
   * @see <a href="https://api.highcharts.com/highstock/boost">https://api.highcharts.com/highstock/boost</a>
   *
   * @implspec boost?: BoostOptions;
   *
   */
  @JSProperty("boost")
  void setBoost(BoostOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) General options for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart">https://api.highcharts.com/highcharts/chart</a>
   * @see <a href="https://api.highcharts.com/highstock/chart">https://api.highcharts.com/highstock/chart</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart">https://api.highcharts.com/highmaps/chart</a>
   *
   * @implspec chart?: ChartOptions;
   *
   */
  @JSProperty("chart")
  @Nullable
  ChartOptions getChart();

  /**
   * (Highcharts, Highstock, Highmaps) General options for the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/chart">https://api.highcharts.com/highcharts/chart</a>
   * @see <a href="https://api.highcharts.com/highstock/chart">https://api.highcharts.com/highstock/chart</a>
   * @see <a href="https://api.highcharts.com/highmaps/chart">https://api.highcharts.com/highmaps/chart</a>
   *
   * @implspec chart?: ChartOptions;
   *
   */
  @JSProperty("chart")
  void setChart(ChartOptions value);

  /**
   * (Highcharts, Highmaps) A color axis for choropleth maps and heat maps.
   * Visually, the color axis will appear as a gradient or as separate items
   * inside the legend, depending on whether the axis is scalar or based on
   * data classes.
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
   * See the Axis object for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis">https://api.highcharts.com/highcharts/colorAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis">https://api.highcharts.com/highmaps/colorAxis</a>
   *
   * @implspec colorAxis?: ColorAxisOptions;
   *
   */
  @JSProperty("colorAxis")
  @Nullable
  ColorAxisOptions getColorAxis();

  /**
   * (Highcharts, Highmaps) A color axis for choropleth maps and heat maps.
   * Visually, the color axis will appear as a gradient or as separate items
   * inside the legend, depending on whether the axis is scalar or based on
   * data classes.
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
   * See the Axis object for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis">https://api.highcharts.com/highcharts/colorAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis">https://api.highcharts.com/highmaps/colorAxis</a>
   *
   * @implspec colorAxis?: ColorAxisOptions;
   *
   */
  @JSProperty("colorAxis")
  void setColorAxis(ColorAxisOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the default colors
   * for the chart's series. When all colors are used, new colors are pulled
   * from the start again.
   *
   * Default colors can also be set on a series or series.type basis, see
   * column.colors, pie.colors.
   *
   * In styled mode, the colors option doesn't exist. Instead, colors are
   * defined in CSS and applied either through series or point class names, or
   * through the chart.colorCount option.
   *
   * <h3>Legacy</h3>
   * In Highcharts 3.x, the default colors were:
   *
   * (see online documentation for example)
   *
   * In Highcharts 2.x, the default colors were:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/colors">https://api.highcharts.com/highcharts/colors</a>
   * @see <a href="https://api.highcharts.com/highstock/colors">https://api.highcharts.com/highstock/colors</a>
   * @see <a href="https://api.highcharts.com/highmaps/colors">https://api.highcharts.com/highmaps/colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  @Nullable
  String[] getColors();

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the default colors
   * for the chart's series. When all colors are used, new colors are pulled
   * from the start again.
   *
   * Default colors can also be set on a series or series.type basis, see
   * column.colors, pie.colors.
   *
   * In styled mode, the colors option doesn't exist. Instead, colors are
   * defined in CSS and applied either through series or point class names, or
   * through the chart.colorCount option.
   *
   * <h3>Legacy</h3>
   * In Highcharts 3.x, the default colors were:
   *
   * (see online documentation for example)
   *
   * In Highcharts 2.x, the default colors were:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/colors">https://api.highcharts.com/highcharts/colors</a>
   * @see <a href="https://api.highcharts.com/highstock/colors">https://api.highcharts.com/highstock/colors</a>
   * @see <a href="https://api.highcharts.com/highmaps/colors">https://api.highcharts.com/highmaps/colors</a>
   *
   * @implspec colors?: Array<ColorString>;
   *
   */
  @JSProperty("colors")
  void setColors(String[] value);

  /**
   * (Gantt) The Pathfinder module allows you to define connections between
   * any two points, represented as lines - optionally with markers for the
   * start and/or end points. Multiple algorithms are available for
   * calculating how the connecting lines are drawn.
   *
   * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
   * charts, the connectors are used to draw dependencies between tasks.
   *
   * @see <a href="https://api.highcharts.com/gantt/connectors">https://api.highcharts.com/gantt/connectors</a>
   *
   * @implspec connectors?: ConnectorsOptions;
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
   * @see <a href="https://api.highcharts.com/gantt/connectors">https://api.highcharts.com/gantt/connectors</a>
   *
   * @implspec connectors?: ConnectorsOptions;
   *
   */
  @JSProperty("connectors")
  void setConnectors(ConnectorsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Highchart by default puts a credits
   * label in the lower right corner of the chart. This can be changed using
   * these options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits">https://api.highcharts.com/highcharts/credits</a>
   * @see <a href="https://api.highcharts.com/highstock/credits">https://api.highcharts.com/highstock/credits</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits">https://api.highcharts.com/highmaps/credits</a>
   *
   * @implspec credits?: CreditsOptions;
   *
   */
  @JSProperty("credits")
  @Nullable
  CreditsOptions getCredits();

  /**
   * (Highcharts, Highstock, Highmaps) Highchart by default puts a credits
   * label in the lower right corner of the chart. This can be changed using
   * these options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits">https://api.highcharts.com/highcharts/credits</a>
   * @see <a href="https://api.highcharts.com/highstock/credits">https://api.highcharts.com/highstock/credits</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits">https://api.highcharts.com/highmaps/credits</a>
   *
   * @implspec credits?: CreditsOptions;
   *
   */
  @JSProperty("credits")
  void setCredits(CreditsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The Data module provides a simplified
   * interface for adding data to a chart from sources like CVS, HTML tables
   * or grid views. See also the tutorial article on the Data module.
   *
   * It requires the <code>modules/data.js</code> file to be loaded.
   *
   * Please note that the default way of adding data in Highcharts, without
   * the need of a module, is through the series.data option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data">https://api.highcharts.com/highcharts/data</a>
   * @see <a href="https://api.highcharts.com/highstock/data">https://api.highcharts.com/highstock/data</a>
   * @see <a href="https://api.highcharts.com/highmaps/data">https://api.highcharts.com/highmaps/data</a>
   *
   * @implspec data?: DataOptions;
   *
   */
  @JSProperty("data")
  @Nullable
  DataOptions getData();

  /**
   * (Highcharts, Highstock, Highmaps) The Data module provides a simplified
   * interface for adding data to a chart from sources like CVS, HTML tables
   * or grid views. See also the tutorial article on the Data module.
   *
   * It requires the <code>modules/data.js</code> file to be loaded.
   *
   * Please note that the default way of adding data in Highcharts, without
   * the need of a module, is through the series.data option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data">https://api.highcharts.com/highcharts/data</a>
   * @see <a href="https://api.highcharts.com/highstock/data">https://api.highcharts.com/highstock/data</a>
   * @see <a href="https://api.highcharts.com/highmaps/data">https://api.highcharts.com/highmaps/data</a>
   *
   * @implspec data?: DataOptions;
   *
   */
  @JSProperty("data")
  void setData(DataOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Styled mode only. Configuration object
   * for adding SVG definitions for reusable elements. See gradients, shadows
   * and patterns for more information and code examples.
   *
   * @see <a href="https://api.highcharts.com/highcharts/defs">https://api.highcharts.com/highcharts/defs</a>
   * @see <a href="https://api.highcharts.com/highstock/defs">https://api.highcharts.com/highstock/defs</a>
   * @see <a href="https://api.highcharts.com/highmaps/defs">https://api.highcharts.com/highmaps/defs</a>
   *
   * @implspec defs?: any;
   *
   */
  @JSProperty("defs")
  @Nullable
  Any getDefs();

  /**
   * (Highcharts, Highstock, Highmaps) Styled mode only. Configuration object
   * for adding SVG definitions for reusable elements. See gradients, shadows
   * and patterns for more information and code examples.
   *
   * @see <a href="https://api.highcharts.com/highcharts/defs">https://api.highcharts.com/highcharts/defs</a>
   * @see <a href="https://api.highcharts.com/highstock/defs">https://api.highcharts.com/highstock/defs</a>
   * @see <a href="https://api.highcharts.com/highmaps/defs">https://api.highcharts.com/highmaps/defs</a>
   *
   * @implspec defs?: any;
   *
   */
  @JSProperty("defs")
  void setDefs(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for drill down, the concept of
   * inspecting increasingly high resolution data through clicking on chart
   * items like columns or pie slices.
   *
   * The drilldown feature requires the drilldown.js file to be loaded, found
   * in the modules directory of the download package, or online at
   * code.highcharts.com/modules/drilldown.js.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown">https://api.highcharts.com/highcharts/drilldown</a>
   * @see <a href="https://api.highcharts.com/highstock/drilldown">https://api.highcharts.com/highstock/drilldown</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown">https://api.highcharts.com/highmaps/drilldown</a>
   *
   * @implspec drilldown?: DrilldownOptions;
   *
   */
  @JSProperty("drilldown")
  @Nullable
  DrilldownOptions getDrilldown();

  /**
   * (Highcharts, Highstock, Highmaps) Options for drill down, the concept of
   * inspecting increasingly high resolution data through clicking on chart
   * items like columns or pie slices.
   *
   * The drilldown feature requires the drilldown.js file to be loaded, found
   * in the modules directory of the download package, or online at
   * code.highcharts.com/modules/drilldown.js.
   *
   * @see <a href="https://api.highcharts.com/highcharts/drilldown">https://api.highcharts.com/highcharts/drilldown</a>
   * @see <a href="https://api.highcharts.com/highstock/drilldown">https://api.highcharts.com/highstock/drilldown</a>
   * @see <a href="https://api.highcharts.com/highmaps/drilldown">https://api.highcharts.com/highmaps/drilldown</a>
   *
   * @implspec drilldown?: DrilldownOptions;
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(DrilldownOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the exporting module. For
   * an overview on the matter, see the docs.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting">https://api.highcharts.com/highcharts/exporting</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting">https://api.highcharts.com/highstock/exporting</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting">https://api.highcharts.com/highmaps/exporting</a>
   *
   * @implspec exporting?: ExportingOptions;
   *
   */
  @JSProperty("exporting")
  @Nullable
  ExportingOptions getExporting();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the exporting module. For
   * an overview on the matter, see the docs.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting">https://api.highcharts.com/highcharts/exporting</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting">https://api.highcharts.com/highstock/exporting</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting">https://api.highcharts.com/highmaps/exporting</a>
   *
   * @implspec exporting?: ExportingOptions;
   *
   */
  @JSProperty("exporting")
  void setExporting(ExportingOptions value);

  /**
   * @implspec global?: GlobalOptions;
   *
   */
  @JSProperty("global")
  @Nullable
  GlobalOptions getGlobal();

  /**
   * @implspec global?: GlobalOptions;
   *
   */
  @JSProperty("global")
  void setGlobal(GlobalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) HTML labels that can be positioned
   * anywhere in the chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels">https://api.highcharts.com/highcharts/labels</a>
   * @see <a href="https://api.highcharts.com/highstock/labels">https://api.highcharts.com/highstock/labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels">https://api.highcharts.com/highmaps/labels</a>
   *
   * @implspec labels?: LabelsOptions;
   *
   */
  @JSProperty("labels")
  @Nullable
  LabelsOptions getLabels();

  /**
   * (Highcharts, Highstock, Highmaps) HTML labels that can be positioned
   * anywhere in the chart area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/labels">https://api.highcharts.com/highcharts/labels</a>
   * @see <a href="https://api.highcharts.com/highstock/labels">https://api.highcharts.com/highstock/labels</a>
   * @see <a href="https://api.highcharts.com/highmaps/labels">https://api.highcharts.com/highmaps/labels</a>
   *
   * @implspec labels?: LabelsOptions;
   *
   */
  @JSProperty("labels")
  void setLabels(LabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Language object. The language object is
   * global and it can't be set on each chart initiation. Instead, use
   * <code>Highcharts.setOptions</code> to set it before any chart is initialized.
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang">https://api.highcharts.com/highcharts/lang</a>
   * @see <a href="https://api.highcharts.com/highstock/lang">https://api.highcharts.com/highstock/lang</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang">https://api.highcharts.com/highmaps/lang</a>
   *
   * @implspec lang?: LangOptions;
   *
   */
  @JSProperty("lang")
  @Nullable
  LangOptions getLang();

  /**
   * (Highcharts, Highstock, Highmaps) Language object. The language object is
   * global and it can't be set on each chart initiation. Instead, use
   * <code>Highcharts.setOptions</code> to set it before any chart is initialized.
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang">https://api.highcharts.com/highcharts/lang</a>
   * @see <a href="https://api.highcharts.com/highstock/lang">https://api.highcharts.com/highstock/lang</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang">https://api.highcharts.com/highmaps/lang</a>
   *
   * @implspec lang?: LangOptions;
   *
   */
  @JSProperty("lang")
  void setLang(LangOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The legend is a box containing a symbol
   * and name for each series item or point item in the chart. Each series (or
   * points in case of pie charts) is represented by a symbol and its name in
   * the legend.
   *
   * It is possible to override the symbol creator function and create custom
   * legend symbols.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend">https://api.highcharts.com/highcharts/legend</a>
   * @see <a href="https://api.highcharts.com/highstock/legend">https://api.highcharts.com/highstock/legend</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend">https://api.highcharts.com/highmaps/legend</a>
   *
   * @implspec legend?: LegendOptions;
   *
   */
  @JSProperty("legend")
  @Nullable
  LegendOptions getLegend();

  /**
   * (Highcharts, Highstock, Highmaps) The legend is a box containing a symbol
   * and name for each series item or point item in the chart. Each series (or
   * points in case of pie charts) is represented by a symbol and its name in
   * the legend.
   *
   * It is possible to override the symbol creator function and create custom
   * legend symbols.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend">https://api.highcharts.com/highcharts/legend</a>
   * @see <a href="https://api.highcharts.com/highstock/legend">https://api.highcharts.com/highstock/legend</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend">https://api.highcharts.com/highmaps/legend</a>
   *
   * @implspec legend?: LegendOptions;
   *
   */
  @JSProperty("legend")
  void setLegend(LegendOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The loading options control the
   * appearance of the loading screen that covers the plot area on chart
   * operations. This screen only appears after an explicit call to
   * <code>chart.showLoading()</code>. It is a utility for developers to communicate to
   * the end user that something is going on, for example while retrieving new
   * data via an XHR connection. The &quot;Loading...&quot; text itself is not part of
   * this configuration object, but part of the <code>lang</code> object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading">https://api.highcharts.com/highcharts/loading</a>
   * @see <a href="https://api.highcharts.com/highstock/loading">https://api.highcharts.com/highstock/loading</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading">https://api.highcharts.com/highmaps/loading</a>
   *
   * @implspec loading?: LoadingOptions;
   *
   */
  @JSProperty("loading")
  @Nullable
  LoadingOptions getLoading();

  /**
   * (Highcharts, Highstock, Highmaps) The loading options control the
   * appearance of the loading screen that covers the plot area on chart
   * operations. This screen only appears after an explicit call to
   * <code>chart.showLoading()</code>. It is a utility for developers to communicate to
   * the end user that something is going on, for example while retrieving new
   * data via an XHR connection. The &quot;Loading...&quot; text itself is not part of
   * this configuration object, but part of the <code>lang</code> object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/loading">https://api.highcharts.com/highcharts/loading</a>
   * @see <a href="https://api.highcharts.com/highstock/loading">https://api.highcharts.com/highstock/loading</a>
   * @see <a href="https://api.highcharts.com/highmaps/loading">https://api.highcharts.com/highmaps/loading</a>
   *
   * @implspec loading?: LoadingOptions;
   *
   */
  @JSProperty("loading")
  void setLoading(LoadingOptions value);

  /**
   * @implspec mapNavigation?: MapNavigationOptions;
   *
   */
  @JSProperty("mapNavigation")
  @Nullable
  MapNavigationOptions getMapNavigation();

  /**
   * @implspec mapNavigation?: MapNavigationOptions;
   *
   */
  @JSProperty("mapNavigation")
  void setMapNavigation(MapNavigationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) A collection of options for buttons and
   * menus appearing in the exporting module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation">https://api.highcharts.com/highcharts/navigation</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation">https://api.highcharts.com/highstock/navigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation">https://api.highcharts.com/highmaps/navigation</a>
   *
   * @implspec navigation?: NavigationOptions;
   *
   */
  @JSProperty("navigation")
  @Nullable
  NavigationOptions getNavigation();

  /**
   * (Highcharts, Highstock, Highmaps) A collection of options for buttons and
   * menus appearing in the exporting module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/navigation">https://api.highcharts.com/highcharts/navigation</a>
   * @see <a href="https://api.highcharts.com/highstock/navigation">https://api.highcharts.com/highstock/navigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/navigation">https://api.highcharts.com/highmaps/navigation</a>
   *
   * @implspec navigation?: NavigationOptions;
   *
   */
  @JSProperty("navigation")
  void setNavigation(NavigationOptions value);

  /**
   * (Highstock) The navigator is a small series below the main series,
   * displaying a view of the entire data set. It provides tools to zoom in
   * and out on parts of the data as well as panning across the dataset.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator">https://api.highcharts.com/highstock/navigator</a>
   *
   * @implspec navigator?: NavigatorOptions;
   *
   */
  @JSProperty("navigator")
  @Nullable
  NavigatorOptions getNavigator();

  /**
   * (Highstock) The navigator is a small series below the main series,
   * displaying a view of the entire data set. It provides tools to zoom in
   * and out on parts of the data as well as panning across the dataset.
   *
   * @see <a href="https://api.highcharts.com/highstock/navigator">https://api.highcharts.com/highstock/navigator</a>
   *
   * @implspec navigator?: NavigatorOptions;
   *
   */
  @JSProperty("navigator")
  void setNavigator(NavigatorOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for displaying a message like &quot;No
   * data to display&quot;. This feature requires the file no-data-to-display.js to
   * be loaded in the page. The actual text to display is set in the
   * lang.noData option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/noData">https://api.highcharts.com/highcharts/noData</a>
   * @see <a href="https://api.highcharts.com/highstock/noData">https://api.highcharts.com/highstock/noData</a>
   * @see <a href="https://api.highcharts.com/gantt/noData">https://api.highcharts.com/gantt/noData</a>
   *
   * @implspec noData?: NoDataOptions;
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
   * @see <a href="https://api.highcharts.com/highcharts/noData">https://api.highcharts.com/highcharts/noData</a>
   * @see <a href="https://api.highcharts.com/highstock/noData">https://api.highcharts.com/highstock/noData</a>
   * @see <a href="https://api.highcharts.com/gantt/noData">https://api.highcharts.com/gantt/noData</a>
   *
   * @implspec noData?: NoDataOptions;
   *
   */
  @JSProperty("noData")
  void setNoData(NoDataOptions value);

  /**
   * (Highcharts) The pane serves as a container for axes and backgrounds for
   * circular gauges and polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane">https://api.highcharts.com/highcharts/pane</a>
   *
   * @implspec pane?: PaneOptions;
   *
   */
  @JSProperty("pane")
  @Nullable
  PaneOptions getPane();

  /**
   * (Highcharts) The pane serves as a container for axes and backgrounds for
   * circular gauges and polar charts.
   *
   * @see <a href="https://api.highcharts.com/highcharts/pane">https://api.highcharts.com/highcharts/pane</a>
   *
   * @implspec pane?: PaneOptions;
   *
   */
  @JSProperty("pane")
  void setPane(PaneOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The plotOptions is a wrapper object for
   * config objects for each series type. The config objects for each series
   * can also be overridden for each series item as given in the series array.
   *
   * Configuration options for the series are given in three levels. Options
   * for all series in a chart are given in the plotOptions.series object.
   * Then options for all series of a specific type are given in the
   * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
   * for one single series are given in the series array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions">https://api.highcharts.com/highcharts/plotOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions">https://api.highcharts.com/highstock/plotOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions">https://api.highcharts.com/highmaps/plotOptions</a>
   *
   * @implspec plotOptions?: PlotOptions;
   *
   */
  @JSProperty("plotOptions")
  @Nullable
  PlotOptions getPlotOptions();

  /**
   * (Highcharts, Highstock, Highmaps) The plotOptions is a wrapper object for
   * config objects for each series type. The config objects for each series
   * can also be overridden for each series item as given in the series array.
   *
   * Configuration options for the series are given in three levels. Options
   * for all series in a chart are given in the plotOptions.series object.
   * Then options for all series of a specific type are given in the
   * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
   * for one single series are given in the series array.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions">https://api.highcharts.com/highcharts/plotOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions">https://api.highcharts.com/highstock/plotOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions">https://api.highcharts.com/highmaps/plotOptions</a>
   *
   * @implspec plotOptions?: PlotOptions;
   *
   */
  @JSProperty("plotOptions")
  void setPlotOptions(PlotOptions value);

  /**
   * (Highstock) The range selector is a tool for selecting ranges to display
   * within the chart. It provides buttons to select preconfigured ranges in
   * the chart, like 1 day, 1 week, 1 month etc. It also provides input boxes
   * where min and max dates can be manually input.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector">https://api.highcharts.com/highstock/rangeSelector</a>
   *
   * @implspec rangeSelector?: RangeSelectorOptions;
   *
   */
  @JSProperty("rangeSelector")
  @Nullable
  RangeSelectorOptions getRangeSelector();

  /**
   * (Highstock) The range selector is a tool for selecting ranges to display
   * within the chart. It provides buttons to select preconfigured ranges in
   * the chart, like 1 day, 1 week, 1 month etc. It also provides input boxes
   * where min and max dates can be manually input.
   *
   * @see <a href="https://api.highcharts.com/highstock/rangeSelector">https://api.highcharts.com/highstock/rangeSelector</a>
   *
   * @implspec rangeSelector?: RangeSelectorOptions;
   *
   */
  @JSProperty("rangeSelector")
  void setRangeSelector(RangeSelectorOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Allows setting a set of rules to apply
   * for different screen or chart sizes. Each rule specifies additional chart
   * options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive">https://api.highcharts.com/highcharts/responsive</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive">https://api.highcharts.com/highstock/responsive</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive">https://api.highcharts.com/highmaps/responsive</a>
   *
   * @implspec responsive?: ResponsiveOptions;
   *
   */
  @JSProperty("responsive")
  @Nullable
  ResponsiveOptions getResponsive();

  /**
   * (Highcharts, Highstock, Highmaps) Allows setting a set of rules to apply
   * for different screen or chart sizes. Each rule specifies additional chart
   * options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/responsive">https://api.highcharts.com/highcharts/responsive</a>
   * @see <a href="https://api.highcharts.com/highstock/responsive">https://api.highcharts.com/highstock/responsive</a>
   * @see <a href="https://api.highcharts.com/highmaps/responsive">https://api.highcharts.com/highmaps/responsive</a>
   *
   * @implspec responsive?: ResponsiveOptions;
   *
   */
  @JSProperty("responsive")
  void setResponsive(ResponsiveOptions value);

  /**
   * (Highstock) The scrollbar is a means of panning over the X axis of a
   * stock chart. Scrollbars can also be applied to other types of axes.
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
   * @see <a href="https://api.highcharts.com/highstock/scrollbar">https://api.highcharts.com/highstock/scrollbar</a>
   *
   * @implspec scrollbar?: ScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  @Nullable
  ScrollbarOptions getScrollbar();

  /**
   * (Highstock) The scrollbar is a means of panning over the X axis of a
   * stock chart. Scrollbars can also be applied to other types of axes.
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
   * @see <a href="https://api.highcharts.com/highstock/scrollbar">https://api.highcharts.com/highstock/scrollbar</a>
   *
   * @implspec scrollbar?: ScrollbarOptions;
   *
   */
  @JSProperty("scrollbar")
  void setScrollbar(ScrollbarOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Series options for specific data and
   * the data itself. In TypeScript you have to cast the series options to
   * specific series types, to get all possible options for a series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series">https://api.highcharts.com/highcharts/series</a>
   * @see <a href="https://api.highcharts.com/highstock/series">https://api.highcharts.com/highstock/series</a>
   * @see <a href="https://api.highcharts.com/highmaps/series">https://api.highcharts.com/highmaps/series</a>
   *
   * @implspec series?: Array<SeriesOptionsType>;
   *
   */
  @JSProperty("series")
  @Nullable
  Array<Unknown> getSeries();

  /**
   * (Highcharts, Highstock, Highmaps) Series options for specific data and
   * the data itself. In TypeScript you have to cast the series options to
   * specific series types, to get all possible options for a series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series">https://api.highcharts.com/highcharts/series</a>
   * @see <a href="https://api.highcharts.com/highstock/series">https://api.highcharts.com/highstock/series</a>
   * @see <a href="https://api.highcharts.com/highmaps/series">https://api.highcharts.com/highmaps/series</a>
   *
   * @implspec series?: Array<SeriesOptionsType>;
   *
   */
  @JSProperty("series")
  void setSeries(Array<Unknown> value);

  /**
   * (Highcharts, Highstock, Highmaps) The chart's subtitle. This can be used
   * both to display a subtitle below the main title, and to display random
   * text anywhere in the chart. The subtitle can be updated after chart
   * initialization through the <code>Chart.setTitle</code> method.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle">https://api.highcharts.com/highcharts/subtitle</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle">https://api.highcharts.com/highstock/subtitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle">https://api.highcharts.com/highmaps/subtitle</a>
   *
   * @implspec subtitle?: SubtitleOptions;
   *
   */
  @JSProperty("subtitle")
  @Nullable
  SubtitleOptions getSubtitle();

  /**
   * (Highcharts, Highstock, Highmaps) The chart's subtitle. This can be used
   * both to display a subtitle below the main title, and to display random
   * text anywhere in the chart. The subtitle can be updated after chart
   * initialization through the <code>Chart.setTitle</code> method.
   *
   * @see <a href="https://api.highcharts.com/highcharts/subtitle">https://api.highcharts.com/highcharts/subtitle</a>
   * @see <a href="https://api.highcharts.com/highstock/subtitle">https://api.highcharts.com/highstock/subtitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/subtitle">https://api.highcharts.com/highmaps/subtitle</a>
   *
   * @implspec subtitle?: SubtitleOptions;
   *
   */
  @JSProperty("subtitle")
  void setSubtitle(SubtitleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Time options that can apply globally or
   * to individual charts. These settings affect how <code>datetime</code> axes are laid
   * out, how tooltips are formatted, how series pointIntervalUnit works and
   * how the Highstock range selector handles time.
   *
   * The common use case is that all charts in the same Highcharts object
   * share the same time settings, in which case the global settings are set
   * using <code>setOptions</code>.(see online documentation for example)
   *
   * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
   * <code>time</code> object, and time options can be set on each individual chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time">https://api.highcharts.com/highcharts/time</a>
   * @see <a href="https://api.highcharts.com/highstock/time">https://api.highcharts.com/highstock/time</a>
   * @see <a href="https://api.highcharts.com/highmaps/time">https://api.highcharts.com/highmaps/time</a>
   *
   * @implspec time?: TimeOptions;
   *
   */
  @JSProperty("time")
  @Nullable
  TimeOptions getTime();

  /**
   * (Highcharts, Highstock, Highmaps) Time options that can apply globally or
   * to individual charts. These settings affect how <code>datetime</code> axes are laid
   * out, how tooltips are formatted, how series pointIntervalUnit works and
   * how the Highstock range selector handles time.
   *
   * The common use case is that all charts in the same Highcharts object
   * share the same time settings, in which case the global settings are set
   * using <code>setOptions</code>.(see online documentation for example)
   *
   * Since v6.0.5, the time options were moved from the <code>global</code> obect to the
   * <code>time</code> object, and time options can be set on each individual chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/time">https://api.highcharts.com/highcharts/time</a>
   * @see <a href="https://api.highcharts.com/highstock/time">https://api.highcharts.com/highstock/time</a>
   * @see <a href="https://api.highcharts.com/highmaps/time">https://api.highcharts.com/highmaps/time</a>
   *
   * @implspec time?: TimeOptions;
   *
   */
  @JSProperty("time")
  void setTime(TimeOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The chart's main title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title">https://api.highcharts.com/highcharts/title</a>
   * @see <a href="https://api.highcharts.com/highstock/title">https://api.highcharts.com/highstock/title</a>
   * @see <a href="https://api.highcharts.com/highmaps/title">https://api.highcharts.com/highmaps/title</a>
   *
   * @implspec title?: TitleOptions;
   *
   */
  @JSProperty("title")
  @Nullable
  TitleOptions getTitle();

  /**
   * (Highcharts, Highstock, Highmaps) The chart's main title.
   *
   * @see <a href="https://api.highcharts.com/highcharts/title">https://api.highcharts.com/highcharts/title</a>
   * @see <a href="https://api.highcharts.com/highstock/title">https://api.highcharts.com/highstock/title</a>
   * @see <a href="https://api.highcharts.com/highmaps/title">https://api.highcharts.com/highmaps/title</a>
   *
   * @implspec title?: TitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(TitleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the tooltip that appears
   * when the user hovers over a series or point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip">https://api.highcharts.com/highcharts/tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip">https://api.highcharts.com/highstock/tooltip</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip">https://api.highcharts.com/highmaps/tooltip</a>
   *
   * @implspec tooltip?: TooltipOptions;
   *
   */
  @JSProperty("tooltip")
  @Nullable
  TooltipOptions getTooltip();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the tooltip that appears
   * when the user hovers over a series or point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip">https://api.highcharts.com/highcharts/tooltip</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip">https://api.highcharts.com/highstock/tooltip</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip">https://api.highcharts.com/highmaps/tooltip</a>
   *
   * @implspec tooltip?: TooltipOptions;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(TooltipOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The X axis or category axis. Normally
   * this is the horizontal axis, though if the chart is inverted this is the
   * vertical axis. In case of multiple axes, the xAxis node is an array of
   * configuration objects.
   *
   * See the Axis class for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis">https://api.highcharts.com/highcharts/xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis">https://api.highcharts.com/highstock/xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis">https://api.highcharts.com/highmaps/xAxis</a>
   *
   * @implspec xAxis?: (XAxisOptions|Array<XAxisOptions>);
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown getXAxis();

  /**
   * (Highcharts, Highstock, Highmaps) The X axis or category axis. Normally
   * this is the horizontal axis, though if the chart is inverted this is the
   * vertical axis. In case of multiple axes, the xAxis node is an array of
   * configuration objects.
   *
   * See the Axis class for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis">https://api.highcharts.com/highcharts/xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis">https://api.highcharts.com/highstock/xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis">https://api.highcharts.com/highmaps/xAxis</a>
   *
   * @implspec xAxis?: (XAxisOptions|Array<XAxisOptions>);
   *
   */
  @JSProperty("xAxis")
  void setXAxis(XAxisOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The X axis or category axis. Normally
   * this is the horizontal axis, though if the chart is inverted this is the
   * vertical axis. In case of multiple axes, the xAxis node is an array of
   * configuration objects.
   *
   * See the Axis class for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/xAxis">https://api.highcharts.com/highcharts/xAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/xAxis">https://api.highcharts.com/highstock/xAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/xAxis">https://api.highcharts.com/highmaps/xAxis</a>
   *
   * @implspec xAxis?: (XAxisOptions|Array<XAxisOptions>);
   *
   */
  @JSProperty("xAxis")
  void setXAxis(Array<XAxisOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) The Y axis or value axis. Normally this
   * is the vertical axis, though if the chart is inverted this is the
   * horizontal axis. In case of multiple axes, the yAxis node is an array of
   * configuration objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis">https://api.highcharts.com/highcharts/yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis">https://api.highcharts.com/highstock/yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis">https://api.highcharts.com/highmaps/yAxis</a>
   *
   * @implspec yAxis?: (YAxisOptions|Array<YAxisOptions>);
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown getYAxis();

  /**
   * (Highcharts, Highstock, Highmaps) The Y axis or value axis. Normally this
   * is the vertical axis, though if the chart is inverted this is the
   * horizontal axis. In case of multiple axes, the yAxis node is an array of
   * configuration objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis">https://api.highcharts.com/highcharts/yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis">https://api.highcharts.com/highstock/yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis">https://api.highcharts.com/highmaps/yAxis</a>
   *
   * @implspec yAxis?: (YAxisOptions|Array<YAxisOptions>);
   *
   */
  @JSProperty("yAxis")
  void setYAxis(Array<YAxisOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) The Y axis or value axis. Normally this
   * is the vertical axis, though if the chart is inverted this is the
   * horizontal axis. In case of multiple axes, the yAxis node is an array of
   * configuration objects.
   *
   * See the Axis object for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/yAxis">https://api.highcharts.com/highcharts/yAxis</a>
   * @see <a href="https://api.highcharts.com/highstock/yAxis">https://api.highcharts.com/highstock/yAxis</a>
   * @see <a href="https://api.highcharts.com/highmaps/yAxis">https://api.highcharts.com/highmaps/yAxis</a>
   *
   * @implspec yAxis?: (YAxisOptions|Array<YAxisOptions>);
   *
   */
  @JSProperty("yAxis")
  void setYAxis(YAxisOptions value);

  /**
   * (Highcharts) The Z axis or depth axis for 3D plots.
   *
   * See the Axis class for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis">https://api.highcharts.com/highcharts/zAxis</a>
   *
   * @implspec zAxis?: (ZAxisOptions|Array<ZAxisOptions>);
   *
   */
  @JSProperty("zAxis")
  @Nullable
  Unknown getZAxis();

  /**
   * (Highcharts) The Z axis or depth axis for 3D plots.
   *
   * See the Axis class for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis">https://api.highcharts.com/highcharts/zAxis</a>
   *
   * @implspec zAxis?: (ZAxisOptions|Array<ZAxisOptions>);
   *
   */
  @JSProperty("zAxis")
  void setZAxis(Array<ZAxisOptions> value);

  /**
   * (Highcharts) The Z axis or depth axis for 3D plots.
   *
   * See the Axis class for programmatic access to the axis.
   *
   * @see <a href="https://api.highcharts.com/highcharts/zAxis">https://api.highcharts.com/highcharts/zAxis</a>
   *
   * @implspec zAxis?: (ZAxisOptions|Array<ZAxisOptions>);
   *
   */
  @JSProperty("zAxis")
  void setZAxis(ZAxisOptions value);
}
