package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( Axis | Point | Series | undefined ) */;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The Chart class. The recommended constructor is Highcharts#chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Chart as Chart_Chart"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Chart extends Any {
  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external
   * images are loaded. Defining a chart.events.load handler is
   * equivalent.
   *
   */
  @JSBody(
      params = {"options", "callback"},
      script = "return new Chart_Chart(options, callback)"
  )
  static Chart create(Options options, @Nullable ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Chart class. The recommended constructor is Highcharts#chart.
   *
   * @param options
   * The chart options structure.
   *
   */
  @JSBody(
      params = {"options"},
      script = "return new Chart_Chart(options)"
  )
  static Chart create(Options options) {
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
   * images are loaded. Defining a chart.events.load handler is
   * equivalent.
   *
   */
  @JSBody(
      params = {"renderTo", "options", "callback"},
      script = "return new Chart_Chart(renderTo, options, callback)"
  )
  static Chart create(HTMLElement renderTo, Options options,
      @Nullable ChartCallbackFunction callback) {
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
   * images are loaded. Defining a chart.events.load handler is
   * equivalent.
   *
   */
  @JSBody(
      params = {"renderTo", "options", "callback"},
      script = "return new Chart_Chart(renderTo, options, callback)"
  )
  static Chart create(String renderTo, Options options, @Nullable ChartCallbackFunction callback) {
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
   */
  @JSBody(
      params = {"renderTo", "options"},
      script = "return new Chart_Chart(renderTo, options)"
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
   */
  @JSBody(
      params = {"renderTo", "options"},
      script = "return new Chart_Chart(renderTo, options)"
  )
  static Chart create(String renderTo, Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * All the axes in the chart.
   *
   */
  @JSProperty("axes")
  Axis[] getAxes();

  /**
   * All the axes in the chart.
   *
   */
  @JSProperty("axes")
  void setAxes(Axis[] value);

  /**
   * The current pixel height of the chart.
   *
   */
  @JSProperty("chartHeight")
  double getChartHeight();

  /**
   * The current pixel height of the chart.
   *
   */
  @JSProperty("chartHeight")
  void setChartHeight(double value);

  /**
   * The current pixel width of the chart.
   *
   */
  @JSProperty("chartWidth")
  double getChartWidth();

  /**
   * The current pixel width of the chart.
   *
   */
  @JSProperty("chartWidth")
  void setChartWidth(double value);

  /**
   * These collections (arrays) implement update() methods with support for
   * one-to-one option.
   *
   */
  @JSProperty("collectionsWithUpdate")
  Any getCollectionsWithUpdate();

  /**
   * These collections (arrays) implement update() methods with support for
   * one-to-one option.
   *
   */
  @JSProperty("collectionsWithUpdate")
  void setCollectionsWithUpdate(Any value);

  /**
   * The containing HTML element of the chart. The container is dynamically
   * inserted into the element given as the <code>renderTo</code> parameter in the
   * Highcharts#chart constructor.
   *
   */
  @JSProperty("container")
  HTMLElement getContainer();

  /**
   * The containing HTML element of the chart. The container is dynamically
   * inserted into the element given as the <code>renderTo</code> parameter in the
   * Highcharts#chart constructor.
   *
   */
  @JSProperty("container")
  void setContainer(HTMLElement value);

  /**
   * The chart's credits label. The label has an <code>update</code> method that allows
   * setting new options as per the credits options set.
   *
   */
  @JSProperty("credits")
  SVGElement getCredits();

  /**
   * The chart's credits label. The label has an <code>update</code> method that allows
   * setting new options as per the credits options set.
   *
   */
  @JSProperty("credits")
  void setCredits(SVGElement value);

  /**
   * Contains the original hovered point.
   *
   */
  @JSProperty("hoverPoint")
  @Nullable
  Point getHoverPoint();

  /**
   * Contains the original hovered point.
   *
   */
  @JSProperty("hoverPoint")
  void setHoverPoint(@Nullable Point value);

  /**
   * Contains all hovered points.
   *
   */
  @JSProperty("hoverPoints")
  @Nullable
  Point[] getHoverPoints();

  /**
   * Contains all hovered points.
   *
   */
  @JSProperty("hoverPoints")
  void setHoverPoints(Point[] value);

  /**
   * Contains the original hovered series.
   *
   */
  @JSProperty("hoverSeries")
  @Nullable
  Series getHoverSeries();

  /**
   * Contains the original hovered series.
   *
   */
  @JSProperty("hoverSeries")
  void setHoverSeries(@Nullable Series value);

  /**
   * Index position of the chart in the Highcharts#charts property.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * The flag is set to <code>true</code> if a series of the chart is inverted.
   *
   */
  @JSProperty("inverted")
  boolean getInverted();

  /**
   * The flag is set to <code>true</code> if a series of the chart is inverted.
   *
   */
  @JSProperty("inverted")
  void setInverted(boolean value);

  /**
   * The overview of the chart's series.
   *
   */
  @JSProperty("legend")
  Legend getLegend();

  /**
   * The overview of the chart's series.
   *
   */
  @JSProperty("legend")
  void setLegend(Legend value);

  /**
   * Callback function to override the default function that formats all the
   * numbers in the chart. Returns a string with the formatted number.
   *
   */
  @JSProperty("numberFormatter")
  NumberFormatterCallbackFunction getNumberFormatter();

  /**
   * Callback function to override the default function that formats all the
   * numbers in the chart. Returns a string with the formatted number.
   *
   */
  @JSProperty("numberFormatter")
  void setNumberFormatter(NumberFormatterCallbackFunction value);

  /**
   * The options structure for the chart after merging #defaultOptions and
   * #userOptions. It contains members for the sub elements like series,
   * legend, tooltip etc.
   *
   */
  @JSProperty("options")
  Options getOptions();

  /**
   * The options structure for the chart after merging #defaultOptions and
   * #userOptions. It contains members for the sub elements like series,
   * legend, tooltip etc.
   *
   */
  @JSProperty("options")
  void setOptions(Options value);

  /**
   * The current height of the plot area in pixels.
   *
   */
  @JSProperty("plotHeight")
  double getPlotHeight();

  /**
   * The current height of the plot area in pixels.
   *
   */
  @JSProperty("plotHeight")
  void setPlotHeight(double value);

  /**
   * The current left position of the plot area in pixels.
   *
   */
  @JSProperty("plotLeft")
  double getPlotLeft();

  /**
   * The current left position of the plot area in pixels.
   *
   */
  @JSProperty("plotLeft")
  void setPlotLeft(double value);

  /**
   * The current top position of the plot area in pixels.
   *
   */
  @JSProperty("plotTop")
  double getPlotTop();

  /**
   * The current top position of the plot area in pixels.
   *
   */
  @JSProperty("plotTop")
  void setPlotTop(double value);

  /**
   * The current width of the plot area in pixels.
   *
   */
  @JSProperty("plotWidth")
  double getPlotWidth();

  /**
   * The current width of the plot area in pixels.
   *
   */
  @JSProperty("plotWidth")
  void setPlotWidth(double value);

  /**
   * The Pointer that keeps track of mouse and touch interaction.
   *
   */
  @JSProperty("pointer")
  Pointer getPointer();

  /**
   * The Pointer that keeps track of mouse and touch interaction.
   *
   */
  @JSProperty("pointer")
  void setPointer(Pointer value);

  /**
   * These properties cause isDirtyBox to be set to true when updating. Can be
   * extended from plugins.
   *
   */
  @JSProperty("propsRequireDirtyBox")
  Any getPropsRequireDirtyBox();

  /**
   * These properties cause isDirtyBox to be set to true when updating. Can be
   * extended from plugins.
   *
   */
  @JSProperty("propsRequireDirtyBox")
  void setPropsRequireDirtyBox(Any value);

  /**
   * These properties require a full reflow of chart elements, best
   * implemented through running <code>Chart.setSize</code> internally (#8190).
   *
   */
  @JSProperty("propsRequireReflow")
  Any[] getPropsRequireReflow();

  /**
   * These properties require a full reflow of chart elements, best
   * implemented through running <code>Chart.setSize</code> internally (#8190).
   *
   */
  @JSProperty("propsRequireReflow")
  void setPropsRequireReflow(Any[] value);

  /**
   * These properties cause all series to be updated when updating. Can be
   * extended from plugins.
   *
   */
  @JSProperty("propsRequireUpdateSeries")
  Any getPropsRequireUpdateSeries();

  /**
   * These properties cause all series to be updated when updating. Can be
   * extended from plugins.
   *
   */
  @JSProperty("propsRequireUpdateSeries")
  void setPropsRequireUpdateSeries(Any value);

  /**
   * The renderer instance of the chart. Each chart instance has only one
   * associated renderer.
   *
   */
  @JSProperty("renderer")
  SVGRenderer getRenderer();

  /**
   * The renderer instance of the chart. Each chart instance has only one
   * associated renderer.
   *
   */
  @JSProperty("renderer")
  void setRenderer(SVGRenderer value);

  /**
   * All the current series in the chart.
   *
   */
  @JSProperty("series")
  Series[] getSeries();

  /**
   * All the current series in the chart.
   *
   */
  @JSProperty("series")
  void setSeries(Series[] value);

  /**
   * Whether the chart is in styled mode, meaning all presentatinoal
   * attributes are avoided.
   *
   */
  @JSProperty("styledMode")
  boolean getStyledMode();

  /**
   * Whether the chart is in styled mode, meaning all presentatinoal
   * attributes are avoided.
   *
   */
  @JSProperty("styledMode")
  void setStyledMode(boolean value);

  /**
   * The chart subtitle. The subtitle has an <code>update</code> method that allows
   * modifying the options directly or indirectly via <code>chart.update</code>.
   *
   */
  @JSProperty("subtitle")
  SubtitleObject getSubtitle();

  /**
   * The chart subtitle. The subtitle has an <code>update</code> method that allows
   * modifying the options directly or indirectly via <code>chart.update</code>.
   *
   */
  @JSProperty("subtitle")
  void setSubtitle(SubtitleObject value);

  /**
   * The <code>Time</code> object associated with the chart. Since v6.0.5, time settings
   * can be applied individually for each chart. If no individual settings
   * apply, the <code>Time</code> object is shared by all instances.
   *
   */
  @JSProperty("time")
  Time getTime();

  /**
   * The <code>Time</code> object associated with the chart. Since v6.0.5, time settings
   * can be applied individually for each chart. If no individual settings
   * apply, the <code>Time</code> object is shared by all instances.
   *
   */
  @JSProperty("time")
  void setTime(Time value);

  /**
   * The chart title. The title has an <code>update</code> method that allows modifying
   * the options directly or indirectly via <code>chart.update</code>.
   *
   */
  @JSProperty("title")
  TitleObject getTitle();

  /**
   * The chart title. The title has an <code>update</code> method that allows modifying
   * the options directly or indirectly via <code>chart.update</code>.
   *
   */
  @JSProperty("title")
  void setTitle(TitleObject value);

  /**
   * Tooltip object for points of series.
   *
   */
  @JSProperty("tooltip")
  Tooltip getTooltip();

  /**
   * Tooltip object for points of series.
   *
   */
  @JSProperty("tooltip")
  void setTooltip(Tooltip value);

  /**
   * The original options given to the constructor or a chart factory like
   * Highcharts.chart and Highcharts.stockChart.
   *
   */
  @JSProperty("userOptions")
  Options getUserOptions();

  /**
   * The original options given to the constructor or a chart factory like
   * Highcharts.chart and Highcharts.stockChart.
   *
   */
  @JSProperty("userOptions")
  void setUserOptions(Options value);

  /**
   * A collection of the X axes in the chart.
   *
   */
  @JSProperty("xAxis")
  Axis[] getXAxis();

  /**
   * A collection of the X axes in the chart.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(Axis[] value);

  /**
   * A collection of the Y axes in the chart.
   *
   */
  @JSProperty("yAxis")
  Axis[] getYAxis();

  /**
   * A collection of the Y axes in the chart.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(Axis[] value);

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
   */
  Axis addAxis(ZAxisOptions options, boolean isX, boolean redraw,
      @Nullable AnimationOptionsObject animation);

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
   */
  Axis addAxis(YAxisOptions options, boolean isX, boolean redraw,
      @Nullable AnimationOptionsObject animation);

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
   */
  Axis addAxis(XAxisOptions options, boolean isX, boolean redraw,
      @Nullable AnimationOptionsObject animation);

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
   * @return The newly generated Axis object.
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
   * @return The newly generated Axis object.
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
   * @return The newly generated Axis object.
   *
   */
  Axis addAxis(XAxisOptions options, boolean isX, boolean redraw);

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
   * @return The newly generated Axis object.
   *
   */
  Axis addAxis(ZAxisOptions options, boolean isX);

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
   * @return The newly generated Axis object.
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
   * @return The newly generated Axis object.
   *
   */
  Axis addAxis(XAxisOptions options, boolean isX);

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
   * @return The newly generated Axis object.
   *
   */
  Axis addAxis(ZAxisOptions options);

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
   * @return The newly generated Axis object.
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
   * @return The newly generated Axis object.
   *
   */
  Axis addAxis(XAxisOptions options);

  /**
   * Add a color axis to the chart after render time. Note that this method
   * should never be used when adding data synchronously at chart render time,
   * as it adds expense to the calculations and rendering. When adding data at
   * the same time as the chart is initialized, add the axis as a
   * configuration option instead.
   *
   * @param options
   * The axis options.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   */
  ColorAxis addColorAxis(ColorAxisOptions options, boolean redraw,
      @Nullable AnimationOptionsObject animation);

  /**
   * Add a color axis to the chart after render time. Note that this method
   * should never be used when adding data synchronously at chart render time,
   * as it adds expense to the calculations and rendering. When adding data at
   * the same time as the chart is initialized, add the axis as a
   * configuration option instead.
   *
   * @param options
   * The axis options.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @param animation
   * Whether and how to apply animation in the redraw.
   *
   * @return The newly generated Axis object.
   *
   */
  ColorAxis addColorAxis(ColorAxisOptions options, boolean redraw, boolean animation);

  /**
   * Add a color axis to the chart after render time. Note that this method
   * should never be used when adding data synchronously at chart render time,
   * as it adds expense to the calculations and rendering. When adding data at
   * the same time as the chart is initialized, add the axis as a
   * configuration option instead.
   *
   * @param options
   * The axis options.
   *
   * @param redraw
   * Whether to redraw the chart after adding.
   *
   * @return The newly generated Axis object.
   *
   */
  ColorAxis addColorAxis(ColorAxisOptions options, boolean redraw);

  /**
   * Add a color axis to the chart after render time. Note that this method
   * should never be used when adding data synchronously at chart render time,
   * as it adds expense to the calculations and rendering. When adding data at
   * the same time as the chart is initialized, add the axis as a
   * configuration option instead.
   *
   * @param options
   * The axis options.
   *
   * @return The newly generated Axis object.
   *
   */
  ColorAxis addColorAxis(ColorAxisOptions options);

  /**
   * Set a new credits label for the chart.
   *
   * @param credits
   * A configuration object for the new credits.
   *
   */
  void addCredits(CreditsOptions credits);

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
   */
  Series addSeries(SeriesOptionsRegistry[] options, boolean redraw,
      @Nullable AnimationOptionsObject animation);

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
   */
  Series addSeries(SeriesOptionsRegistry[] options, boolean redraw, boolean animation);

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
   * @return The newly created series object.
   *
   * @fires Highcharts.Chart#addSeries
   * @fires Highcharts.Chart#afterAddSeries
   *
   */
  Series addSeries(SeriesOptionsRegistry[] options, boolean redraw);

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
   * @return The newly created series object.
   *
   * @fires Highcharts.Chart#addSeries
   * @fires Highcharts.Chart#afterAddSeries
   *
   */
  Series addSeries(SeriesOptionsRegistry[] options);

  /**
   * Remove the chart and purge memory. This method is called internally
   * before adding a second chart into the same container, as well as on
   * window unload to prevent leaks.
   *
   * @fires Highcharts.Chart#destroy
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
   */
  @Nullable
  Unknown /* ( Axis | Point | Series | undefined ) */ get(String id);

  /**
   * Returns an array of all currently selected points in the chart. Points
   * can be selected by clicking or programmatically by the
   * Highcharts.Point#select function.
   *
   * @return The currently selected points.
   *
   */
  Point[] getSelectedPoints();

  /**
   * Returns an array of all currently selected series in the chart. Series
   * can be selected either programmatically by the Highcharts.Series#select
   * function or by checking the checkbox next to the legend item if
   * series.showCheckBox is true.
   *
   * @return The currently selected series.
   *
   */
  Series[] getSelectedSeries();

  /**
   * Hide the loading layer.
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
   */
  void init(Options userOptions, @Nullable JsFunction callback);

  /**
   * Overridable function that initializes the chart. The constructor's
   * arguments are passed on directly.
   *
   * @param userOptions
   * Custom options.
   *
   * @fires Highcharts.Chart#init
   * @fires Highcharts.Chart#afterInit
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
   */
  boolean isInsidePlot(double plotX, double plotY, boolean inverted);

  /**
   * Check whether a given point is within the plot area.
   *
   * @param plotX
   * Pixel x relative to the plot area.
   *
   * @param plotY
   * Pixel y relative to the plot area.
   *
   * @return Returns true if the given point is inside the plot area.
   *
   */
  boolean isInsidePlot(double plotX, double plotY);

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
   */
  void redraw(@Nullable AnimationOptionsObject animation);

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
   */
  void redraw(boolean animation);

  /**
   * Redraw the chart after changes have been done to the data, axis extremes
   * chart size or chart elements. All methods for updating axes, series or
   * points have a parameter for redrawing the chart. This is <code>true</code> by
   * default. But in many cases you want to do more than one operation on the
   * chart before redrawing, for example add a number of points. In those
   * cases it is a waste of resources to redraw the chart for each new point
   * added. So you add the points and call <code>chart.redraw()</code> after.
   *
   * @fires Highcharts.Chart#afterSetExtremes
   * @fires Highcharts.Chart#beforeRedraw
   * @fires Highcharts.Chart#predraw
   * @fires Highcharts.Chart#redraw
   * @fires Highcharts.Chart#render
   * @fires Highcharts.Chart#updatedData
   *
   */
  void redraw();

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
   */
  void reflow(@Nullable Event e);

  /**
   * Reflows the chart to its container. By default, the chart reflows
   * automatically to its container following a <code>window.resize</code> event, as per
   * the chart.reflow option. However, there are no reliable events for div
   * resize, so if the container is resized without a window resize event,
   * this must be called explicitly.
   *
   */
  void reflow();

  /**
   * Set the caption options. This can also be done from Chart#update.
   *
   * @param options
   * New caption options. The caption text itself is set by the
   * <code>options.text</code> property.
   *
   */
  void setCaption(CaptionOptions options);

  /**
   * Set the chart container's class name, in addition to
   * <code>highcharts-container</code>.
   *
   */
  void setClassName(@Nullable String className);

  /**
   * Set the chart container's class name, in addition to
   * <code>highcharts-container</code>.
   *
   */
  void setClassName();

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
   */
  void setSize(double width, double height, @Nullable AnimationOptionsObject animation);

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
   */
  void setSize(double width, double height, boolean animation);

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
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
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
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
   *
   */
  void setSize(double width);

  /**
   * Resize the chart to a given width and height. In order to set the width
   * only, the height argument may be skipped. To set the height only, pass
   * <code>undefined</code> for the width.
   *
   * @fires Highcharts.Chart#endResize
   * @fires Highcharts.Chart#resize
   *
   */
  void setSize();

  /**
   * Shortcut to set the subtitle options. This can also be done from
   * Chart#update or Chart#setTitle.
   *
   * @param options
   * New subtitle options. The subtitle text itself is set by the
   * <code>options.text</code> property.
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
   */
  void setTitle(@Nullable TitleOptions titleOptions, @Nullable SubtitleOptions subtitleOptions,
      boolean redraw);

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
   */
  void setTitle(@Nullable TitleOptions titleOptions, @Nullable SubtitleOptions subtitleOptions);

  /**
   * Set a new title or subtitle for the chart.
   *
   * @param titleOptions
   * New title options. The title text itself is set by the
   * <code>titleOptions.text</code> property.
   *
   */
  void setTitle(@Nullable TitleOptions titleOptions);

  /**
   * Set a new title or subtitle for the chart.
   *
   */
  void setTitle();

  /**
   * Dim the chart and show a loading text or symbol. Options for the loading
   * screen are defined in the loading options.
   *
   * @param str
   * An optional text to show in the loading label instead of the
   * default one. The default text is set in lang.loading.
   *
   */
  void showLoading(@Nullable String str);

  /**
   * Dim the chart and show a loading text or symbol. Options for the loading
   * screen are defined in the loading options.
   *
   */
  void showLoading();

  /**
   * Display the zoom button, so users can reset zoom to the default view
   * settings.
   *
   * @fires Highcharts.Chart#afterShowResetZoom
   * @fires Highcharts.Chart#beforeShowResetZoom
   *
   */
  void showResetZoom();

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
   * Note that when changing series data, <code>chart.update</code> may mutate the passed
   * data options.
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
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code>, <code>yAxis</code> and <code>annotations</code>
   * collections will be updated one to one, and items will be either
   * added or removed to match the new updated options. For example, if
   * the chart has two series and we call <code>chart.update</code> with a
   * configuration containing three series, one will be added. If we
   * call <code>chart.update</code> with one series, one will be removed. Setting
   * an empty <code>series</code> array will remove all series, but leaving out
   * the<code>series</code> property will leave all series untouched. If the
   * series have id's, the new series options will be matched by id,
   * and the remaining ones removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   */
  void update(Options options, boolean redraw, boolean oneToOne,
      @Nullable AnimationOptionsObject animation);

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
   * Note that when changing series data, <code>chart.update</code> may mutate the passed
   * data options.
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
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code>, <code>yAxis</code> and <code>annotations</code>
   * collections will be updated one to one, and items will be either
   * added or removed to match the new updated options. For example, if
   * the chart has two series and we call <code>chart.update</code> with a
   * configuration containing three series, one will be added. If we
   * call <code>chart.update</code> with one series, one will be removed. Setting
   * an empty <code>series</code> array will remove all series, but leaving out
   * the<code>series</code> property will leave all series untouched. If the
   * series have id's, the new series options will be matched by id,
   * and the remaining ones removed.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
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
   * Note that when changing series data, <code>chart.update</code> may mutate the passed
   * data options.
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
   * When <code>true</code>, the <code>series</code>, <code>xAxis</code>, <code>yAxis</code> and <code>annotations</code>
   * collections will be updated one to one, and items will be either
   * added or removed to match the new updated options. For example, if
   * the chart has two series and we call <code>chart.update</code> with a
   * configuration containing three series, one will be added. If we
   * call <code>chart.update</code> with one series, one will be removed. Setting
   * an empty <code>series</code> array will remove all series, but leaving out
   * the<code>series</code> property will leave all series untouched. If the
   * series have id's, the new series options will be matched by id,
   * and the remaining ones removed.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   */
  void update(Options options, boolean redraw, boolean oneToOne);

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
   * Note that when changing series data, <code>chart.update</code> may mutate the passed
   * data options.
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
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
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
   * Note that when changing series data, <code>chart.update</code> may mutate the passed
   * data options.
   *
   * See also the responsive option set. Switching between <code>responsive.rules</code>
   * basically runs <code>chart.update</code> under the hood.
   *
   * @param options
   * A configuration object for the new chart options.
   *
   * @fires Highcharts.Chart#update
   * @fires Highcharts.Chart#afterUpdate
   *
   */
  void update(Options options);

  /**
   * Zoom the chart out after a user has zoomed in. See also Axis.setExtremes.
   *
   * @fires Highcharts.Chart#selection
   *
   */
  void zoomOut();
}
