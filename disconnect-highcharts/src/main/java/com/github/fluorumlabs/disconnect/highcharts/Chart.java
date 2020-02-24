package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * The Chart class. The recommended constructor is Highcharts#chart.
 *
 */
public interface Chart extends Any {
  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded. Defining a chart.event.load handler is
   * equivalent.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#constructor">https://api.highcharts.com/class-reference/Highcharts.Chart#constructor</a>
   *
   * @implspec constructor(options: Options, callback?: ChartCallbackFunction);
   *
   */
  @JSBody(
      params = {"options"},
      script = "return new Chart(options)"
  )
  static Chart create(Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded. Defining a chart.event.load handler is
   * equivalent.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#constructor">https://api.highcharts.com/class-reference/Highcharts.Chart#constructor</a>
   *
   * @implspec constructor(options: Options, callback?: ChartCallbackFunction);
   *
   */
  @JSBody(
      params = {"options", "callback"},
      script = "return new Chart(options, callback)"
  )
  static Chart create(Options options, ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded. Defining a chart.event.load handler is
   * equivalent.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#constructor">https://api.highcharts.com/class-reference/Highcharts.Chart#constructor</a>
   *
   * @implspec constructor(renderTo: (string|HTMLDOMElement), options: Options, callback?: ChartCallbackFunction);
   *
   */
  @JSBody(
      params = {"renderTo", "options"},
      script = "return new Chart(renderTo, options)"
  )
  static Chart create(HTMLElement renderTo, Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded. Defining a chart.event.load handler is
   * equivalent.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#constructor">https://api.highcharts.com/class-reference/Highcharts.Chart#constructor</a>
   *
   * @implspec constructor(renderTo: (string|HTMLDOMElement), options: Options, callback?: ChartCallbackFunction);
   *
   */
  @JSBody(
      params = {"renderTo", "options", "callback"},
      script = "return new Chart(renderTo, options, callback)"
  )
  static Chart create(HTMLElement renderTo, Options options, ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded. Defining a chart.event.load handler is
   * equivalent.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#constructor">https://api.highcharts.com/class-reference/Highcharts.Chart#constructor</a>
   *
   * @implspec constructor(renderTo: (string|HTMLDOMElement), options: Options, callback?: ChartCallbackFunction);
   *
   */
  @JSBody(
      params = {"renderTo", "options", "callback"},
      script = "return new Chart(renderTo, options, callback)"
  )
  static Chart create(String renderTo, Options options, ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * All the axes in the chart.
   *
   * @implspec axes: Array<Axis>;
   *
   */
  @JSProperty("axes")
  Array<Axis> getAxes();

  /**
   * All the axes in the chart.
   *
   * @implspec axes: Array<Axis>;
   *
   */
  @JSProperty("axes")
  void setAxes(Array<Axis> value);

  /**
   * The current pixel height of the chart.
   *
   * @implspec chartHeight: number;
   *
   */
  @JSProperty("chartHeight")
  double getChartHeight();

  /**
   * The current pixel height of the chart.
   *
   * @implspec chartHeight: number;
   *
   */
  @JSProperty("chartHeight")
  void setChartHeight(double value);

  /**
   * The current pixel width of the chart.
   *
   * @implspec chartWidth: number;
   *
   */
  @JSProperty("chartWidth")
  double getChartWidth();

  /**
   * The current pixel width of the chart.
   *
   * @implspec chartWidth: number;
   *
   */
  @JSProperty("chartWidth")
  void setChartWidth(double value);

  /**
   * The containing HTML element of the chart. The container is dynamically
   * inserted into the element given as the <code>renderTo</code> parameter in the
   * Highcharts#chart constructor.
   *
   * @implspec container: HTMLDOMElement;
   *
   */
  @JSProperty("container")
  HTMLElement getContainer();

  /**
   * The containing HTML element of the chart. The container is dynamically
   * inserted into the element given as the <code>renderTo</code> parameter in the
   * Highcharts#chart constructor.
   *
   * @implspec container: HTMLDOMElement;
   *
   */
  @JSProperty("container")
  void setContainer(HTMLElement value);

  /**
   * The chart's credits label. The label has an <code>update</code> method that allows
   * setting new options as per the credits options set.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#.credits">https://api.highcharts.com/class-reference/Highcharts.Chart#.credits</a>
   *
   * @implspec credits: SVGElement;
   *
   */
  @JSProperty("credits")
  SVGElement getCredits();

  /**
   * The chart's credits label. The label has an <code>update</code> method that allows
   * setting new options as per the credits options set.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#.credits">https://api.highcharts.com/class-reference/Highcharts.Chart#.credits</a>
   *
   * @implspec credits: SVGElement;
   *
   */
  @JSProperty("credits")
  void setCredits(SVGElement value);

  /**
   * The overview of the chart's series.
   *
   * @implspec legend: Legend;
   *
   */
  @JSProperty("legend")
  Legend getLegend();

  /**
   * The overview of the chart's series.
   *
   * @implspec legend: Legend;
   *
   */
  @JSProperty("legend")
  void setLegend(Legend value);

  /**
   * The options structure for the chart. It contains members for the sub
   * elements like series, legend, tooltip etc.
   *
   * @implspec options: Options;
   *
   */
  @JSProperty("options")
  Options getOptions();

  /**
   * The options structure for the chart. It contains members for the sub
   * elements like series, legend, tooltip etc.
   *
   * @implspec options: Options;
   *
   */
  @JSProperty("options")
  void setOptions(Options value);

  /**
   * The current height of the plot area in pixels.
   *
   * @implspec plotHeight: number;
   *
   */
  @JSProperty("plotHeight")
  double getPlotHeight();

  /**
   * The current height of the plot area in pixels.
   *
   * @implspec plotHeight: number;
   *
   */
  @JSProperty("plotHeight")
  void setPlotHeight(double value);

  /**
   * The current left position of the plot area in pixels.
   *
   * @implspec plotLeft: number;
   *
   */
  @JSProperty("plotLeft")
  double getPlotLeft();

  /**
   * The current left position of the plot area in pixels.
   *
   * @implspec plotLeft: number;
   *
   */
  @JSProperty("plotLeft")
  void setPlotLeft(double value);

  /**
   * The current top position of the plot area in pixels.
   *
   * @implspec plotTop: number;
   *
   */
  @JSProperty("plotTop")
  double getPlotTop();

  /**
   * The current top position of the plot area in pixels.
   *
   * @implspec plotTop: number;
   *
   */
  @JSProperty("plotTop")
  void setPlotTop(double value);

  /**
   * The current width of the plot area in pixels.
   *
   * @implspec plotWidth: number;
   *
   */
  @JSProperty("plotWidth")
  double getPlotWidth();

  /**
   * The current width of the plot area in pixels.
   *
   * @implspec plotWidth: number;
   *
   */
  @JSProperty("plotWidth")
  void setPlotWidth(double value);

  /**
   * The Pointer that keeps track of mouse and touch interaction.
   *
   * @implspec pointer: Pointer;
   *
   */
  @JSProperty("pointer")
  Pointer getPointer();

  /**
   * The Pointer that keeps track of mouse and touch interaction.
   *
   * @implspec pointer: Pointer;
   *
   */
  @JSProperty("pointer")
  void setPointer(Pointer value);

  /**
   * These properties cause isDirtyBox to be set to true when updating. Can be
   * extended from plugins.
   *
   * @implspec propsRequireDirtyBox: any;
   *
   */
  @JSProperty("propsRequireDirtyBox")
  Any getPropsRequireDirtyBox();

  /**
   * These properties cause isDirtyBox to be set to true when updating. Can be
   * extended from plugins.
   *
   * @implspec propsRequireDirtyBox: any;
   *
   */
  @JSProperty("propsRequireDirtyBox")
  void setPropsRequireDirtyBox(Any value);

  /**
   * These properties cause all series to be updated when updating. Can be
   * extended from plugins.
   *
   * @implspec propsRequireUpdateSeries: any;
   *
   */
  @JSProperty("propsRequireUpdateSeries")
  Any getPropsRequireUpdateSeries();

  /**
   * These properties cause all series to be updated when updating. Can be
   * extended from plugins.
   *
   * @implspec propsRequireUpdateSeries: any;
   *
   */
  @JSProperty("propsRequireUpdateSeries")
  void setPropsRequireUpdateSeries(Any value);

  /**
   * The renderer instance of the chart. Each chart instance has only one
   * associated renderer.
   *
   * @implspec renderer: SVGRenderer;
   *
   */
  @JSProperty("renderer")
  SVGRenderer getRenderer();

  /**
   * The renderer instance of the chart. Each chart instance has only one
   * associated renderer.
   *
   * @implspec renderer: SVGRenderer;
   *
   */
  @JSProperty("renderer")
  void setRenderer(SVGRenderer value);

  /**
   * All the current series in the chart.
   *
   * @implspec series: Array<Series>;
   *
   */
  @JSProperty("series")
  Array<Series> getSeries();

  /**
   * All the current series in the chart.
   *
   * @implspec series: Array<Series>;
   *
   */
  @JSProperty("series")
  void setSeries(Array<Series> value);

  /**
   * The chart subtitle. The subtitle has an <code>update</code> method that allows
   * modifying the options directly or indirectly via <code>chart.update</code>.
   *
   * @implspec subtitle: SubtitleObject;
   *
   */
  @JSProperty("subtitle")
  SubtitleObject getSubtitle();

  /**
   * The chart subtitle. The subtitle has an <code>update</code> method that allows
   * modifying the options directly or indirectly via <code>chart.update</code>.
   *
   * @implspec subtitle: SubtitleObject;
   *
   */
  @JSProperty("subtitle")
  void setSubtitle(SubtitleObject value);

  /**
   * The <code>Time</code> object associated with the chart. Since v6.0.5, time settings
   * can be applied individually for each chart. If no individual settings
   * apply, the <code>Time</code> object is shared by all instances.
   *
   * @implspec time: Time;
   *
   */
  @JSProperty("time")
  Time getTime();

  /**
   * The <code>Time</code> object associated with the chart. Since v6.0.5, time settings
   * can be applied individually for each chart. If no individual settings
   * apply, the <code>Time</code> object is shared by all instances.
   *
   * @implspec time: Time;
   *
   */
  @JSProperty("time")
  void setTime(Time value);

  /**
   * The chart title. The title has an <code>update</code> method that allows modifying
   * the options directly or indirectly via <code>chart.update</code>.
   *
   * @implspec title: TitleObject;
   *
   */
  @JSProperty("title")
  TitleObject getTitle();

  /**
   * The chart title. The title has an <code>update</code> method that allows modifying
   * the options directly or indirectly via <code>chart.update</code>.
   *
   * @implspec title: TitleObject;
   *
   */
  @JSProperty("title")
  void setTitle(TitleObject value);

  /**
   * Tooltip object for points of series.
   *
   * @implspec tooltip: Tooltip;
   *
   */
  @JSProperty("tooltip")
  Tooltip getTooltip();

  /**
   * Tooltip object for points of series.
   *
   * @implspec tooltip: Tooltip;
   *
   */
  @JSProperty("tooltip")
  void setTooltip(Tooltip value);

  /**
   * A collection of the X axes in the chart.
   *
   * @implspec xAxis: Array<Axis>;
   *
   */
  @JSProperty("xAxis")
  Array<Axis> getXAxis();

  /**
   * A collection of the X axes in the chart.
   *
   * @implspec xAxis: Array<Axis>;
   *
   */
  @JSProperty("xAxis")
  void setXAxis(Array<Axis> value);

  /**
   * A collection of the Y axes in the chart.
   *
   * @implspec yAxis: Array<Axis>;
   *
   */
  @JSProperty("yAxis")
  Array<Axis> getYAxis();

  /**
   * A collection of the Y axes in the chart.
   *
   * @implspec yAxis: Array<Axis>;
   *
   */
  @JSProperty("yAxis")
  void setYAxis(Array<Axis> value);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(ZAxisOptions options, boolean isX, boolean redraw, AnimationOptionsObject animation);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(ZAxisOptions options, boolean isX, boolean redraw, boolean animation);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(YAxisOptions options, boolean isX, boolean redraw);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(YAxisOptions options, boolean isX, boolean redraw, AnimationOptionsObject animation);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(YAxisOptions options);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(YAxisOptions options, boolean isX, boolean redraw, boolean animation);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(XAxisOptions options, boolean isX, boolean redraw, boolean animation);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(YAxisOptions options, boolean isX);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(XAxisOptions options, boolean isX, boolean redraw, AnimationOptionsObject animation);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(ZAxisOptions options, boolean isX, boolean redraw);

  /**
   * Add an axis to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the axis as a configuration
   * option instead.
   *
   * @param options
   * The axis options.
   *
   * @param isX
   * Whether it is an X axis or a value axis.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   * @implspec addAxis(options: (XAxisOptions|YAxisOptions|ZAxisOptions), isX?: boolean, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Axis;
   *
   */
  Axis addAxis(XAxisOptions options, boolean isX, boolean redraw);

  /**
   * Set a new credits label for the chart.
   *
   * @param options
   * A configuration object for the new credits.
   *
   * @implspec addCredits(options: CreditsOptions): void;
   *
   */
  void addCredits(CreditsOptions options);

  /**
   * Add a series to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the series as a configuration
   * option instead. With multiple axes, the <code>offset</code> is dynamically adjusted.
   *
   * @param options
   * The config options for the series.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @return The newly created series object.
   *
   * @fires Highcharts.Chart#addSeries
   * @fires Highcharts.Chart#afterAddSeries
   *
   * @implspec addSeries(options: SeriesOptions, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Series;
   *
   */
  Series addSeries(SeriesOptions options, boolean redraw, AnimationOptionsObject animation);

  /**
   * Add a series to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the series as a configuration
   * option instead. With multiple axes, the <code>offset</code> is dynamically adjusted.
   *
   * @param options
   * The config options for the series.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @return The newly created series object.
   *
   * @fires Highcharts.Chart#addSeries
   * @fires Highcharts.Chart#afterAddSeries
   *
   * @implspec addSeries(options: SeriesOptions, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Series;
   *
   */
  Series addSeries(SeriesOptions options, boolean redraw);

  /**
   * Add a series to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the series as a configuration
   * option instead. With multiple axes, the <code>offset</code> is dynamically adjusted.
   *
   * @param options
   * The config options for the series.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @return The newly created series object.
   *
   * @fires Highcharts.Chart#addSeries
   * @fires Highcharts.Chart#afterAddSeries
   *
   * @implspec addSeries(options: SeriesOptions, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Series;
   *
   */
  Series addSeries(SeriesOptions options, boolean redraw, boolean animation);

  /**
   * Add a series to the chart after render time. Note that this method should
   * never be used when adding data synchronously at chart render time, as it
   * adds expense to the calculations and rendering. When adding data at the
   * same time as the chart is initialized, add the series as a configuration
   * option instead. With multiple axes, the <code>offset</code> is dynamically adjusted.
   *
   * @param options
   * The config options for the series.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @return The newly created series object.
   *
   * @fires Highcharts.Chart#addSeries
   * @fires Highcharts.Chart#afterAddSeries
   *
   * @implspec addSeries(options: SeriesOptions, redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): Series;
   *
   */
  Series addSeries(SeriesOptions options);

  /**
   * Remove the chart and purge memory. This method is called internally
   * before adding a second chart into the same container, as well as on
   * window unload to prevent leaks.
   *
   * @fires Highcharts.Chart#destroy
   *
   * @implspec destroy(): void;
   *
   */
  void destroy();

  /**
   * Get an axis, series or point object by <code>id</code> as given in the configuration
   * options. Returns <code>undefined</code> if no item is found.
   *
   * @param id
   * The id as given in the configuration options.
   *
   * @return The retrieved item.
   *
   * @implspec get(id: string): (Axis|Point|Series|undefined);
   *
   */
  Unknown get(String id);

  /**
   * Internal function to get the chart width and height according to options
   * and container size. Sets Chart.chartWidth and Chart.chartHeight.
   *
   * @implspec getChartSize(): void;
   *
   */
  void getChartSize();

  /**
   * Returns an array of all currently selected points in the chart. Points
   * can be selected by clicking or programmatically by the
   * Highcharts.Point#select function.
   *
   * @return The currently selected points.
   *
   * @implspec getSelectedPoints(): Array<Point>;
   *
   */
  Array<Point> getSelectedPoints();

  /**
   * Returns an array of all currently selected series in the chart. Series
   * can be selected either programmatically by the Highcharts.Series#select
   * function or by checking the checkbox next to the legend item if
   * series.showCheckBox is true.
   *
   * @return The currently selected series.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#getSelectedSeries">https://api.highcharts.com/class-reference/Highcharts.Chart#getSelectedSeries</a>
   *
   * @implspec getSelectedSeries(): Array<Series>;
   *
   */
  Array<Series> getSelectedSeries();

  /**
   * Hide the loading layer.
   *
   * @implspec hideLoading(): void;
   *
   */
  void hideLoading();

  /**
   * Overridable function that initializes the chart. The constructor's
   * arguments are passed on directly.
   *
   * @param userOptions
   * Custom options.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded.
   *
   * @fires Highcharts.Chart#init
   * @fires Highcharts.Chart#afterInit
   *
   * @implspec init(userOptions: Options, callback?: () =&gt; void): void;
   *
   */
  void init(Options userOptions, InitCallback callback);

  /**
   * Overridable function that initializes the chart. The constructor's
   * arguments are passed on directly.
   *
   * @param userOptions
   * Custom options.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded.
   *
   * @fires Highcharts.Chart#init
   * @fires Highcharts.Chart#afterInit
   *
   * @implspec init(userOptions: Options, callback?: () =&gt; void): void;
   *
   */
  void init(Options userOptions);

  /**
   * Check whether a given point is within the plot area.
   *
   * @param plotX
   * Pixel x relative to the plot area.
   *
   * @param plotY
   * Pixel y relative to the plot area.
   *
   * @param inverted
   * Whether the chart is inverted.
   *
   * @return Returns true if the given point is inside the plot area.
   *
   * @implspec isInsidePlot(plotX: number, plotY: number, inverted: boolean): boolean;
   *
   */
  boolean isInsidePlot(double plotX, double plotY, boolean inverted);

  /**
   * Redraw the chart after changes have been done to the data, axis extremes
   * chart size or chart elements. All methods for updating axes, series or
   * points have a parameter for redrawing the chart. This is <code>true</code> by
   * default. But in many cases you want to do more than one operation on the
   * chart before redrawing, for example add a number of points. In those
   * cases it is a waste of resources to redraw the chart for each new point
   * added. So you add the points and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * If or how to apply animation to the redraw.
   *
   * @fires Highcharts.Chart#afterSetExtremes
   * @fires Highcharts.Chart#beforeRedraw
   * @fires Highcharts.Chart#predraw
   * @fires Highcharts.Chart#redraw
   * @fires Highcharts.Chart#render
   * @fires Highcharts.Chart#updatedData
   *
   * @implspec redraw(animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void redraw();

  /**
   * Redraw the chart after changes have been done to the data, axis extremes
   * chart size or chart elements. All methods for updating axes, series or
   * points have a parameter for redrawing the chart. This is <code>true</code> by
   * default. But in many cases you want to do more than one operation on the
   * chart before redrawing, for example add a number of points. In those
   * cases it is a waste of resources to redraw the chart for each new point
   * added. So you add the points and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * If or how to apply animation to the redraw.
   *
   * @fires Highcharts.Chart#afterSetExtremes
   * @fires Highcharts.Chart#beforeRedraw
   * @fires Highcharts.Chart#predraw
   * @fires Highcharts.Chart#redraw
   * @fires Highcharts.Chart#render
   * @fires Highcharts.Chart#updatedData
   *
   * @implspec redraw(animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void redraw(AnimationOptionsObject animation);

  /**
   * Redraw the chart after changes have been done to the data, axis extremes
   * chart size or chart elements. All methods for updating axes, series or
   * points have a parameter for redrawing the chart. This is <code>true</code> by
   * default. But in many cases you want to do more than one operation on the
   * chart before redrawing, for example add a number of points. In those
   * cases it is a waste of resources to redraw the chart for each new point
   * added. So you add the points and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * If or how to apply animation to the redraw.
   *
   * @fires Highcharts.Chart#afterSetExtremes
   * @fires Highcharts.Chart#beforeRedraw
   * @fires Highcharts.Chart#predraw
   * @fires Highcharts.Chart#redraw
   * @fires Highcharts.Chart#render
   * @fires Highcharts.Chart#updatedData
   *
   * @implspec redraw(animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void redraw(boolean animation);

  /**
   * Reflows the chart to its container. By default, the chart reflows
   * automatically to its container following a <code>window.resize</code> event, as per
   * the chart.reflow option. However, there are no reliable events for div
   * resize, so if the container is resized without a window resize event,
   * this must be called explicitly.
   *
   * @param e
   * Event arguments. Used primarily when the function is called
   * internally as a response to window resize.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#reflow">https://api.highcharts.com/class-reference/Highcharts.Chart#reflow</a>
   *
   * @implspec reflow(e?: Event): void;
   *
   */
  void reflow();

  /**
   * Reflows the chart to its container. By default, the chart reflows
   * automatically to its container following a <code>window.resize</code> event, as per
   * the chart.reflow option. However, there are no reliable events for div
   * resize, so if the container is resized without a window resize event,
   * this must be called explicitly.
   *
   * @param e
   * Event arguments. Used primarily when the function is called
   * internally as a response to window resize.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#reflow">https://api.highcharts.com/class-reference/Highcharts.Chart#reflow</a>
   *
   * @implspec reflow(e?: Event): void;
   *
   */
  void reflow(Event e);

  /**
   * Set the chart container's class name, in addition to
   * <code>highcharts-container</code>.
   *
   * @implspec setClassName(className: string): void;
   *
   */
  void setClassName(String className);

  /**
   * Resize the chart to a given width and height. In order to set the width
   * only, the height argument may be skipped. To set the height only, pass
   * <code>undefined</code> for the width.
   *
   * @param width
   * The new pixel width of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value (when
   * setting height only), or <code>null</code> to adapt to the width of the
   * containing element.
   *
   * @param height
   * The new pixel height of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value, or <code>null</code>
   * in order to adapt to the height of the containing element.
   *
   * @param animation
   * Whether and how to apply animation.
   *
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
   *
   * @implspec setSize(width?: (number|null), height?: (number|null), animation?: AnimationOptionsObject): void;
   *
   */
  void setSize(double width);

  /**
   * Resize the chart to a given width and height. In order to set the width
   * only, the height argument may be skipped. To set the height only, pass
   * <code>undefined</code> for the width.
   *
   * @param width
   * The new pixel width of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value (when
   * setting height only), or <code>null</code> to adapt to the width of the
   * containing element.
   *
   * @param height
   * The new pixel height of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value, or <code>null</code>
   * in order to adapt to the height of the containing element.
   *
   * @param animation
   * Whether and how to apply animation.
   *
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
   *
   * @implspec setSize(width?: (number|null), height?: (number|null), animation?: AnimationOptionsObject): void;
   *
   */
  void setSize();

  /**
   * Resize the chart to a given width and height. In order to set the width
   * only, the height argument may be skipped. To set the height only, pass
   * <code>undefined</code> for the width.
   *
   * @param width
   * The new pixel width of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value (when
   * setting height only), or <code>null</code> to adapt to the width of the
   * containing element.
   *
   * @param height
   * The new pixel height of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value, or <code>null</code>
   * in order to adapt to the height of the containing element.
   *
   * @param animation
   * Whether and how to apply animation.
   *
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
   *
   * @implspec setSize(width?: (number|null), height?: (number|null), animation?: AnimationOptionsObject): void;
   *
   */
  void setSize(double width, double height);

  /**
   * Resize the chart to a given width and height. In order to set the width
   * only, the height argument may be skipped. To set the height only, pass
   * <code>undefined</code> for the width.
   *
   * @param width
   * The new pixel width of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value (when
   * setting height only), or <code>null</code> to adapt to the width of the
   * containing element.
   *
   * @param height
   * The new pixel height of the chart. Since v4.2.6, the argument can
   * be <code>undefined</code> in order to preserve the current value, or <code>null</code>
   * in order to adapt to the height of the containing element.
   *
   * @param animation
   * Whether and how to apply animation.
   *
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
   *
   * @implspec setSize(width?: (number|null), height?: (number|null), animation?: AnimationOptionsObject): void;
   *
   */
  void setSize(double width, double height, AnimationOptionsObject animation);

  /**
   * Shortcut to set the subtitle options. This can also be done from
   * Chart#update or Chart#setTitle.
   *
   * @param options
   * New subtitle options. The subtitle text itself is set by the
   * <code>options.text</code> property.
   *
   * @implspec setSubtitle(options: SubtitleOptions): void;
   *
   */
  void setSubtitle(SubtitleOptions options);

  /**
   * Set a new title or subtitle for the chart.
   *
   * @param titleOptions
   * New title options. The title text itself is set by the
   * <code>titleOptions.text</code> property.
   *
   * @param subtitleOptions
   * New subtitle options. The subtitle text itself is set by the
   * <code>subtitleOptions.text</code> property.
   *
   * @param redraw
   * Whether to redraw the chart or wait for a later call to
   * <code>chart.redraw()</code>.
   *
   * @implspec setTitle(titleOptions: TitleOptions, subtitleOptions: SubtitleOptions, redraw: boolean): void;
   *
   */
  void setTitle(TitleOptions titleOptions, SubtitleOptions subtitleOptions, boolean redraw);

  /**
   * Dim the chart and show a loading text or symbol. Options for the loading
   * screen are defined in the loading options.
   *
   * @param str
   * An optional text to show in the loading label instead of the
   * default one. The default text is set in lang.loading.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#showLoading">https://api.highcharts.com/class-reference/Highcharts.Chart#showLoading</a>
   *
   * @implspec showLoading(str?: string): void;
   *
   */
  void showLoading();

  /**
   * Dim the chart and show a loading text or symbol. Options for the loading
   * screen are defined in the loading options.
   *
   * @param str
   * An optional text to show in the loading label instead of the
   * default one. The default text is set in lang.loading.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#showLoading">https://api.highcharts.com/class-reference/Highcharts.Chart#showLoading</a>
   *
   * @implspec showLoading(str?: string): void;
   *
   */
  void showLoading(String str);

  /**
   * A generic function to update any element of the chart. Elements can be
   * enabled and disabled, moved, re-styled, re-formatted etc.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the corresponding item is updated. So for
   * example, running <code>chart.update</code> with a series item without an id, will
   * cause the existing chart's series with the same index in the series array
   * to be updated. When the <code>oneToOne</code> parameter is true, <code>chart.update</code> will
   * also take care of adding and removing items from the collection. Read
   * more under the parameter description below.
   *
   * See also the responsive option set. Switching between <code>responsive.rules</code>
   * basically runs <code>chart.update</code> under the hood.
   *
   * @param options
   * A configuration object for the new chart options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @param oneToOne
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code> and <code>yAxis</code> collections will be
   * updated one to one, and items will be either added or removed to
   * match the new updated options. For example, if the chart has two
   * series and we call <code>chart.update</code> with a configuration containing
   * three series, one will be added. If we call <code>chart.update</code> with
   * one series, one will be removed. Setting an empty <code>series</code> array
   * will remove all series, but leaving out the <code>series</code> property will
   * leave all series untouched. If the series have id's, the new
   * series options will be matched by id, and the remaining ones
   * removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#update">https://api.highcharts.com/class-reference/Highcharts.Chart#update</a>
   *
   * @implspec update(options: Options, redraw?: boolean, oneToOne?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Options options, boolean redraw, boolean oneToOne, boolean animation);

  /**
   * A generic function to update any element of the chart. Elements can be
   * enabled and disabled, moved, re-styled, re-formatted etc.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the corresponding item is updated. So for
   * example, running <code>chart.update</code> with a series item without an id, will
   * cause the existing chart's series with the same index in the series array
   * to be updated. When the <code>oneToOne</code> parameter is true, <code>chart.update</code> will
   * also take care of adding and removing items from the collection. Read
   * more under the parameter description below.
   *
   * See also the responsive option set. Switching between <code>responsive.rules</code>
   * basically runs <code>chart.update</code> under the hood.
   *
   * @param options
   * A configuration object for the new chart options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @param oneToOne
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code> and <code>yAxis</code> collections will be
   * updated one to one, and items will be either added or removed to
   * match the new updated options. For example, if the chart has two
   * series and we call <code>chart.update</code> with a configuration containing
   * three series, one will be added. If we call <code>chart.update</code> with
   * one series, one will be removed. Setting an empty <code>series</code> array
   * will remove all series, but leaving out the <code>series</code> property will
   * leave all series untouched. If the series have id's, the new
   * series options will be matched by id, and the remaining ones
   * removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#update">https://api.highcharts.com/class-reference/Highcharts.Chart#update</a>
   *
   * @implspec update(options: Options, redraw?: boolean, oneToOne?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Options options, boolean redraw, boolean oneToOne, AnimationOptionsObject animation);

  /**
   * A generic function to update any element of the chart. Elements can be
   * enabled and disabled, moved, re-styled, re-formatted etc.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the corresponding item is updated. So for
   * example, running <code>chart.update</code> with a series item without an id, will
   * cause the existing chart's series with the same index in the series array
   * to be updated. When the <code>oneToOne</code> parameter is true, <code>chart.update</code> will
   * also take care of adding and removing items from the collection. Read
   * more under the parameter description below.
   *
   * See also the responsive option set. Switching between <code>responsive.rules</code>
   * basically runs <code>chart.update</code> under the hood.
   *
   * @param options
   * A configuration object for the new chart options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @param oneToOne
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code> and <code>yAxis</code> collections will be
   * updated one to one, and items will be either added or removed to
   * match the new updated options. For example, if the chart has two
   * series and we call <code>chart.update</code> with a configuration containing
   * three series, one will be added. If we call <code>chart.update</code> with
   * one series, one will be removed. Setting an empty <code>series</code> array
   * will remove all series, but leaving out the <code>series</code> property will
   * leave all series untouched. If the series have id's, the new
   * series options will be matched by id, and the remaining ones
   * removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#update">https://api.highcharts.com/class-reference/Highcharts.Chart#update</a>
   *
   * @implspec update(options: Options, redraw?: boolean, oneToOne?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Options options, boolean redraw);

  /**
   * A generic function to update any element of the chart. Elements can be
   * enabled and disabled, moved, re-styled, re-formatted etc.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the corresponding item is updated. So for
   * example, running <code>chart.update</code> with a series item without an id, will
   * cause the existing chart's series with the same index in the series array
   * to be updated. When the <code>oneToOne</code> parameter is true, <code>chart.update</code> will
   * also take care of adding and removing items from the collection. Read
   * more under the parameter description below.
   *
   * See also the responsive option set. Switching between <code>responsive.rules</code>
   * basically runs <code>chart.update</code> under the hood.
   *
   * @param options
   * A configuration object for the new chart options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @param oneToOne
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code> and <code>yAxis</code> collections will be
   * updated one to one, and items will be either added or removed to
   * match the new updated options. For example, if the chart has two
   * series and we call <code>chart.update</code> with a configuration containing
   * three series, one will be added. If we call <code>chart.update</code> with
   * one series, one will be removed. Setting an empty <code>series</code> array
   * will remove all series, but leaving out the <code>series</code> property will
   * leave all series untouched. If the series have id's, the new
   * series options will be matched by id, and the remaining ones
   * removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#update">https://api.highcharts.com/class-reference/Highcharts.Chart#update</a>
   *
   * @implspec update(options: Options, redraw?: boolean, oneToOne?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Options options);

  /**
   * A generic function to update any element of the chart. Elements can be
   * enabled and disabled, moved, re-styled, re-formatted etc.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the corresponding item is updated. So for
   * example, running <code>chart.update</code> with a series item without an id, will
   * cause the existing chart's series with the same index in the series array
   * to be updated. When the <code>oneToOne</code> parameter is true, <code>chart.update</code> will
   * also take care of adding and removing items from the collection. Read
   * more under the parameter description below.
   *
   * See also the responsive option set. Switching between <code>responsive.rules</code>
   * basically runs <code>chart.update</code> under the hood.
   *
   * @param options
   * A configuration object for the new chart options.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @param oneToOne
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code> and <code>yAxis</code> collections will be
   * updated one to one, and items will be either added or removed to
   * match the new updated options. For example, if the chart has two
   * series and we call <code>chart.update</code> with a configuration containing
   * three series, one will be added. If we call <code>chart.update</code> with
   * one series, one will be removed. Setting an empty <code>series</code> array
   * will remove all series, but leaving out the <code>series</code> property will
   * leave all series untouched. If the series have id's, the new
   * series options will be matched by id, and the remaining ones
   * removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Chart#update">https://api.highcharts.com/class-reference/Highcharts.Chart#update</a>
   *
   * @implspec update(options: Options, redraw?: boolean, oneToOne?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Options options, boolean redraw, boolean oneToOne);

  /**
   * Zoom the chart out after a user has zoomed in. See also Axis.setExtremes.
   *
   * @fires Highcharts.Chart#selection
   *
   * @implspec zoomOut(): void;
   *
   */
  void zoomOut();

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface InitCallback extends Any {
    void apply();
  }
}
