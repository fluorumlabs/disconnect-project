package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Create a new axis object. Called internally when instanciating a new chart or
 * adding axes by Highcharts.Chart#addAxis.
 *
 * A chart can have from 0 axes (pie chart) to multiples. In a normal, single
 * series cartesian chart, there is one X axis and one Y axis.
 *
 * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
 * array of Axis objects. If there is only one axis, it can be referenced
 * through <code>chart.xAxis[0]</code>, and multiple axes have increasing indices. The same
 * pattern goes for Y axes.
 *
 * If you need to get the axes from a series object, use the <code>series.xAxis</code> and
 * <code>series.yAxis</code> properties. These are not arrays, as one series can only be
 * associated to one X and one Y axis.
 *
 * A third way to reference the axis programmatically is by <code>id</code>. Add an <code>id</code> in
 * the axis configuration options, and get the axis by Highcharts.Chart#get.
 *
 * Configuration options for the axes are given in options.xAxis and
 * options.yAxis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Axis as Axis_Axis"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Axis extends Any {
  /**
   * Create a new axis object. Called internally when instanciating a new
   * chart or adding axes by Highcharts.Chart#addAxis.
   *
   * A chart can have from 0 axes (pie chart) to multiples. In a normal,
   * single series cartesian chart, there is one X axis and one Y axis.
   *
   * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
   * array of Axis objects. If there is only one axis, it can be referenced
   * through <code>chart.xAxis[0]</code>, and multiple axes have increasing indices. The
   * same pattern goes for Y axes.
   *
   * If you need to get the axes from a series object, use the <code>series.xAxis</code>
   * and <code>series.yAxis</code> properties. These are not arrays, as one series can
   * only be associated to one X and one Y axis.
   *
   * A third way to reference the axis programmatically is by <code>id</code>. Add an
   * <code>id</code> in the axis configuration options, and get the axis by
   * Highcharts.Chart#get.
   *
   * Configuration options for the axes are given in options.xAxis and
   * options.yAxis.
   *
   * @param chart
   * The Chart instance to apply the axis on.
   *
   * @param userOptions
   * Axis options.
   *
   */
  @JSBody(
      params = {"chart", "userOptions"},
      script = "return new Axis_Axis(chart, userOptions)"
  )
  static Axis create(Chart chart, ZAxisOptions userOptions) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Create a new axis object. Called internally when instanciating a new
   * chart or adding axes by Highcharts.Chart#addAxis.
   *
   * A chart can have from 0 axes (pie chart) to multiples. In a normal,
   * single series cartesian chart, there is one X axis and one Y axis.
   *
   * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
   * array of Axis objects. If there is only one axis, it can be referenced
   * through <code>chart.xAxis[0]</code>, and multiple axes have increasing indices. The
   * same pattern goes for Y axes.
   *
   * If you need to get the axes from a series object, use the <code>series.xAxis</code>
   * and <code>series.yAxis</code> properties. These are not arrays, as one series can
   * only be associated to one X and one Y axis.
   *
   * A third way to reference the axis programmatically is by <code>id</code>. Add an
   * <code>id</code> in the axis configuration options, and get the axis by
   * Highcharts.Chart#get.
   *
   * Configuration options for the axes are given in options.xAxis and
   * options.yAxis.
   *
   * @param chart
   * The Chart instance to apply the axis on.
   *
   * @param userOptions
   * Axis options.
   *
   */
  @JSBody(
      params = {"chart", "userOptions"},
      script = "return new Axis_Axis(chart, userOptions)"
  )
  static Axis create(Chart chart, YAxisOptions userOptions) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Create a new axis object. Called internally when instanciating a new
   * chart or adding axes by Highcharts.Chart#addAxis.
   *
   * A chart can have from 0 axes (pie chart) to multiples. In a normal,
   * single series cartesian chart, there is one X axis and one Y axis.
   *
   * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
   * array of Axis objects. If there is only one axis, it can be referenced
   * through <code>chart.xAxis[0]</code>, and multiple axes have increasing indices. The
   * same pattern goes for Y axes.
   *
   * If you need to get the axes from a series object, use the <code>series.xAxis</code>
   * and <code>series.yAxis</code> properties. These are not arrays, as one series can
   * only be associated to one X and one Y axis.
   *
   * A third way to reference the axis programmatically is by <code>id</code>. Add an
   * <code>id</code> in the axis configuration options, and get the axis by
   * Highcharts.Chart#get.
   *
   * Configuration options for the axes are given in options.xAxis and
   * options.yAxis.
   *
   * @param chart
   * The Chart instance to apply the axis on.
   *
   * @param userOptions
   * Axis options.
   *
   */
  @JSBody(
      params = {"chart", "userOptions"},
      script = "return new Axis_Axis(chart, userOptions)"
  )
  static Axis create(Chart chart, XAxisOptions userOptions) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * If categories are present for the axis, names are used instead of numbers
   * for that axis.
   *
   * Since Highcharts 3.0, categories can also be extracted by giving each
   * point a name and setting axis type to <code>category</code>. However, if you have
   * multiple series, best practice remains defining the <code>categories</code> array.
   *
   */
  @JSProperty("categories")
  String[] getCategories();

  /**
   * The Chart that the axis belongs to.
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * The Chart that the axis belongs to.
   *
   */
  @JSProperty("chart")
  void setChart(Chart value);

  /**
   * The collection where the axis belongs, for example <code>xAxis</code>, <code>yAxis</code> or
   * <code>colorAxis</code>. Corresponds to properties on Chart, for example Chart.xAxis.
   *
   */
  @JSProperty("coll")
  String getColl();

  /**
   * The collection where the axis belongs, for example <code>xAxis</code>, <code>yAxis</code> or
   * <code>colorAxis</code>. Corresponds to properties on Chart, for example Chart.xAxis.
   *
   */
  @JSProperty("coll")
  void setColl(String value);

  /**
   * The processed crosshair options.
   *
   */
  @JSProperty("crosshair")
  Unknown /* ( boolean | AxisCrosshairOptions ) */ getCrosshair();

  /**
   * The processed crosshair options.
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

  /**
   * The processed crosshair options.
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(AxisCrosshairOptions value);

  /**
   * Whether the axis is horizontal.
   *
   */
  @JSProperty("horiz")
  boolean getHoriz();

  /**
   * Whether the axis is horizontal.
   *
   */
  @JSProperty("horiz")
  void setHoriz(boolean value);

  /**
   * Whether the axis is the x-axis.
   *
   */
  @JSProperty("isXAxis")
  boolean getIsXAxis();

  /**
   * Whether the axis is the x-axis.
   *
   */
  @JSProperty("isXAxis")
  void setIsXAxis(boolean value);

  /**
   * The maximum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * The maximum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * The minimum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * The minimum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * List of minor ticks mapped by position on the axis.
   *
   */
  @JSProperty("minorTicks")
  Dictionary<Tick> getMinorTicks();

  /**
   * List of minor ticks mapped by position on the axis.
   *
   */
  @JSProperty("minorTicks")
  void setMinorTicks(Dictionary<Tick> value);

  /**
   * Current options for the axis after merge of defaults and user's options.
   *
   */
  @JSProperty("options")
  Unknown /* AxisOptions */ getOptions();

  /**
   * Current options for the axis after merge of defaults and user's options.
   *
   */
  @JSProperty("options")
  void setOptions(XAxisOptions value);

  /**
   * Current options for the axis after merge of defaults and user's options.
   *
   */
  @JSProperty("options")
  void setOptions(YAxisOptions value);

  /**
   * Current options for the axis after merge of defaults and user's options.
   *
   */
  @JSProperty("options")
  void setOptions(ZAxisOptions value);

  /**
   * Whether the axis is reversed. Based on the <code>axis.reversed</code>, option, but
   * inverted charts have reversed xAxis by default.
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * Whether the axis is reversed. Based on the <code>axis.reversed</code>, option, but
   * inverted charts have reversed xAxis by default.
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * All series associated to the axis.
   *
   */
  @JSProperty("series")
  Series[] getSeries();

  /**
   * All series associated to the axis.
   *
   */
  @JSProperty("series")
  void setSeries(Series[] value);

  /**
   * The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom
   * and 3 is left.
   *
   */
  @JSProperty("side")
  double getSide();

  /**
   * The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom
   * and 3 is left.
   *
   */
  @JSProperty("side")
  void setSide(double value);

  /**
   * Contains the current positions that are laid out on the axis. The
   * positions are numbers in terms of axis values. In a category axis they
   * are integers, in a datetime axis they are also integers, but designating
   * milliseconds.
   *
   * This property is read only - for modifying the tick positions, use the
   * <code>tickPositioner</code> callback or [axis.tickPositions(
   * <a href="https://api.highcharts.com/highcharts/xAxis.tickPositions">https://api.highcharts.com/highcharts/xAxis.tickPositions</a>) option
   * instead.
   *
   */
  @JSProperty("tickPositions")
  @Nullable
  AxisTickPositionsArray getTickPositions();

  /**
   * Contains the current positions that are laid out on the axis. The
   * positions are numbers in terms of axis values. In a category axis they
   * are integers, in a datetime axis they are also integers, but designating
   * milliseconds.
   *
   * This property is read only - for modifying the tick positions, use the
   * <code>tickPositioner</code> callback or [axis.tickPositions(
   * <a href="https://api.highcharts.com/highcharts/xAxis.tickPositions">https://api.highcharts.com/highcharts/xAxis.tickPositions</a>) option
   * instead.
   *
   */
  @JSProperty("tickPositions")
  void setTickPositions(@Nullable AxisTickPositionsArray value);

  /**
   * List of major ticks mapped by postition on axis.
   *
   */
  @JSProperty("ticks")
  Dictionary<Tick> getTicks();

  /**
   * List of major ticks mapped by postition on axis.
   *
   */
  @JSProperty("ticks")
  void setTicks(Dictionary<Tick> value);

  /**
   * User's options for this axis without defaults.
   *
   */
  @JSProperty("userOptions")
  Unknown /* AxisOptions */ getUserOptions();

  /**
   * User's options for this axis without defaults.
   *
   */
  @JSProperty("userOptions")
  void setUserOptions(XAxisOptions value);

  /**
   * User's options for this axis without defaults.
   *
   */
  @JSProperty("userOptions")
  void setUserOptions(YAxisOptions value);

  /**
   * User's options for this axis without defaults.
   *
   */
  @JSProperty("userOptions")
  void setUserOptions(ZAxisOptions value);

  /**
   * Add a plot band after render time.
   *
   * @param options
   * A configuration object for the plot band, as defined in
   * xAxis.plotBands.
   *
   * @return The added plot band.
   *
   */
  @Nullable
  PlotLineOrBand addPlotBand(ZAxisPlotBandsOptions options);

  /**
   * Add a plot band after render time.
   *
   * @param options
   * A configuration object for the plot band, as defined in
   * xAxis.plotBands.
   *
   * @return The added plot band.
   *
   */
  @Nullable
  PlotLineOrBand addPlotBand(YAxisPlotBandsOptions options);

  /**
   * Add a plot band after render time.
   *
   * @param options
   * A configuration object for the plot band, as defined in
   * xAxis.plotBands.
   *
   * @return The added plot band.
   *
   */
  @Nullable
  PlotLineOrBand addPlotBand(XAxisPlotBandsOptions options);

  /**
   * Add a plot line after render time.
   *
   * @param options
   * A configuration object for the plot line, as defined in
   * xAxis.plotLines.
   *
   * @return The added plot line.
   *
   */
  @Nullable
  PlotLineOrBand addPlotLine(ZAxisPlotLinesOptions options);

  /**
   * Add a plot line after render time.
   *
   * @param options
   * A configuration object for the plot line, as defined in
   * xAxis.plotLines.
   *
   * @return The added plot line.
   *
   */
  @Nullable
  PlotLineOrBand addPlotLine(YAxisPlotLinesOptions options);

  /**
   * Add a plot line after render time.
   *
   * @param options
   * A configuration object for the plot line, as defined in
   * xAxis.plotLines.
   *
   * @return The added plot line.
   *
   */
  @Nullable
  PlotLineOrBand addPlotLine(XAxisPlotLinesOptions options);

  /**
   * Adds the title defined in axis.options.title.
   *
   * @param display
   * Whether or not to display the title.
   *
   */
  void addTitle(boolean display);

  /**
   * Adds the title defined in axis.options.title.
   *
   */
  void addTitle();

  /**
   * The default label formatter. The context is a special config object for
   * the label. In apps, use the labels.formatter instead, except when a
   * modification is needed.
   *
   * @param this
   * Formatter context of axis label.
   *
   * @return The formatted label content.
   *
   */
  String defaultLabelFormatter();

  /**
   * Internal function to draw a crosshair.
   *
   * @param e
   * The event arguments from the modified pointer event, extended with
   * <code>chartX</code> and <code>chartY</code>
   *
   * @param point
   * The Point object if the crosshair snaps to points.
   *
   * @fires Highcharts.Axis#afterDrawCrosshair
   * @fires Highcharts.Axis#drawCrosshair
   *
   */
  void drawCrosshair(@Nullable PointerEventObject e, @Nullable Point point);

  /**
   * Internal function to draw a crosshair.
   *
   * @param e
   * The event arguments from the modified pointer event, extended with
   * <code>chartX</code> and <code>chartY</code>
   *
   * @fires Highcharts.Axis#afterDrawCrosshair
   * @fires Highcharts.Axis#drawCrosshair
   *
   */
  void drawCrosshair(@Nullable PointerEventObject e);

  /**
   * Internal function to draw a crosshair.
   *
   * @fires Highcharts.Axis#afterDrawCrosshair
   * @fires Highcharts.Axis#drawCrosshair
   *
   */
  void drawCrosshair();

  /**
   * Get the current extremes for the axis.
   *
   * @return An object containing extremes information.
   *
   */
  ExtremesObject getExtremes();

  /**
   * Internal function to et the tick positions of a linear axis to round
   * values like whole tens or every five.
   *
   * @param tickInterval
   * The normalized tick interval.
   *
   * @param min
   * Axis minimum.
   *
   * @param max
   * Axis maximum.
   *
   * @return An array of axis values where ticks should be placed.
   *
   */
  double[] getLinearTickPositions(double tickInterval, double min, double max);

  /**
   * Internal function to get the path for the axis line. Extended for polar
   * charts.
   *
   * @param lineWidth
   * The line width in pixels.
   *
   * @return The SVG path definition in array form.
   *
   */
  Unknown /* SVGPathArray */ getLinePath(double lineWidth);

  /**
   * Resolve the new minorTicks/minorTickInterval options into the legacy
   * loosely typed minorTickInterval option.
   *
   */
  @Nullable
  Unknown /* ( 'auto' | number | null ) */ getMinorTickInterval();

  /**
   * Internal function to return the minor tick positions. For logarithmic
   * axes, the same logic as for major ticks is reused.
   *
   * @return An array of axis values where ticks should be placed.
   *
   */
  double[] getMinorTickPositions();

  /**
   * Internal function to create the SVG path definition for a plot band.
   *
   * @param from
   * The axis value to start from.
   *
   * @param to
   * The axis value to end on.
   *
   * @return The SVG path definition in array form.
   *
   */
  Unknown /* SVGPathArray */ getPlotBandPath(double from, double to);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param options
   * Options for the path.
   *
   * @return The SVG path definition for the plot line.
   *
   */
  @Nullable
  Unknown /* ( SVGPathArray | null ) */ getPlotLinePath(AxisPlotLinePathOptionsObject options);

  /**
   * Get the zero plane either based on zero or on the min or max value. Used
   * in bar and area plots.
   *
   * @param threshold
   * The threshold in axis values.
   *
   * @return The translated threshold position in terms of pixels, and
   * corrected to stay within the axis bounds.
   *
   */
  double getThreshold(double threshold);

  /**
   * Return true if the axis has associated data.
   *
   * @return True if the axis has associated visible series and those series
   * have either valid data points or explicit <code>min</code> and <code>max</code>
   * settings.
   *
   */
  boolean hasData();

  /**
   * Hide the crosshair if visible.
   *
   */
  void hideCrosshair();

  /**
   * Overrideable function to initialize the axis.
   *
   * @param chart
   * The Chart instance to apply the axis on.
   *
   * @param userOptions
   * Axis options.
   *
   * @fires Highcharts.Axis#afterInit
   * @fires Highcharts.Axis#init
   *
   */
  void init(Chart chart, ZAxisOptions userOptions);

  /**
   * Overrideable function to initialize the axis.
   *
   * @param chart
   * The Chart instance to apply the axis on.
   *
   * @param userOptions
   * Axis options.
   *
   * @fires Highcharts.Axis#afterInit
   * @fires Highcharts.Axis#init
   *
   */
  void init(Chart chart, YAxisOptions userOptions);

  /**
   * Overrideable function to initialize the axis.
   *
   * @param chart
   * The Chart instance to apply the axis on.
   *
   * @param userOptions
   * Axis options.
   *
   * @fires Highcharts.Axis#afterInit
   * @fires Highcharts.Axis#init
   *
   */
  void init(Chart chart, XAxisOptions userOptions);

  /**
   * Remove the axis from the chart.
   *
   * @param redraw
   * Whether to redraw the chart following the remove.
   *
   */
  void remove(boolean redraw);

  /**
   * Remove the axis from the chart.
   *
   */
  void remove();

  /**
   * Remove a plot band by its id.
   *
   * @param id
   * The plot band's <code>id</code> as given in the original configuration object
   * or in the <code>addPlotBand</code> option.
   *
   */
  void removePlotBand(String id);

  /**
   * Remove a plot line by its id.
   *
   * @param id
   * The plot line's <code>id</code> as given in the original configuration object
   * or in the <code>addPlotLine</code> option.
   *
   */
  void removePlotLine(String id);

  /**
   * Render the axis line. Called internally when rendering and redrawing the
   * axis.
   *
   */
  void renderLine();

  /**
   * Render a minor tick into the given position. If a minor tick already
   * exists in this position, move it.
   *
   * @param pos
   * The position in axis values.
   *
   */
  void renderMinorTick(double pos);

  /**
   * Render a major tick into the given position. If a tick already exists in
   * this position, move it.
   *
   * @param pos
   * The position in axis values.
   *
   * @param i
   * The tick index.
   *
   */
  void renderTick(double pos, double i);

  /**
   * Set new axis categories and optionally redraw.
   *
   * @param categories
   * The new categories.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   */
  void setCategories(String[] categories, boolean redraw);

  /**
   * Set new axis categories and optionally redraw.
   *
   * @param categories
   * The new categories.
   *
   */
  void setCategories(String[] categories);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @param newMax
   * The new maximum value.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw
   *
   * @param animation
   * Enable or modify animations.
   *
   * @param eventArguments
   * Arguments to be accessed in event handler.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw,
      @Nullable AnimationOptionsObject animation, @Nullable Any eventArguments);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @param newMax
   * The new maximum value.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw
   *
   * @param animation
   * Enable or modify animations.
   *
   * @param eventArguments
   * Arguments to be accessed in event handler.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw, boolean animation,
      @Nullable Any eventArguments);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @param newMax
   * The new maximum value.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw
   *
   * @param animation
   * Enable or modify animations.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw,
      @Nullable AnimationOptionsObject animation);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @param newMax
   * The new maximum value.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw
   *
   * @param animation
   * Enable or modify animations.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw, boolean animation);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @param newMax
   * The new maximum value.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @param newMax
   * The new maximum value.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin, double newMax);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @param newMin
   * The new minimum value.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes(double newMin);

  /**
   * Set the minimum and maximum of the axes after render time. If the
   * <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum
   * values are rounded off to the nearest tick. To prevent this, these
   * options can be set to false before calling setExtremes. Also, setExtremes
   * will not allow a range lower than the <code>minRange</code> option, which by default
   * is the range of five points.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   */
  void setExtremes();

  /**
   * Now we have computed the normalized tickInterval, get the tick positions
   *
   * @fires Highcharts.Axis#afterSetTickPositions
   *
   */
  void setTickPositions();

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   * @param redraw
   * Whether to redraw the chart after setting the title.
   *
   */
  void setTitle(ZAxisTitleOptions titleOptions, boolean redraw);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   * @param redraw
   * Whether to redraw the chart after setting the title.
   *
   */
  void setTitle(YAxisTitleOptions titleOptions, boolean redraw);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   * @param redraw
   * Whether to redraw the chart after setting the title.
   *
   */
  void setTitle(XAxisTitleOptions titleOptions, boolean redraw);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   */
  void setTitle(ZAxisTitleOptions titleOptions);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   */
  void setTitle(YAxisTitleOptions titleOptions);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   */
  void setTitle(XAxisTitleOptions titleOptions);

  /**
   * Translate a value in terms of axis units into pixels within the chart.
   *
   * @param value
   * A value in terms of axis units.
   *
   * @param paneCoordinates
   * Whether to return the pixel coordinate relative to the chart or
   * just the axis/pane itself.
   *
   * @return Pixel position of the value on the chart or axis.
   *
   */
  double toPixels(double value, boolean paneCoordinates);

  /**
   * Translate a pixel position along the axis to a value in terms of axis
   * units.
   *
   * @param pixel
   * The pixel value coordinate.
   *
   * @param paneCoordinates
   * Whether the input pixel is relative to the chart or just the
   * axis/pane itself.
   *
   * @return The axis value.
   *
   */
  double toValue(double pixel, boolean paneCoordinates);

  /**
   * Translate a pixel position along the axis to a value in terms of axis
   * units.
   *
   * @param pixel
   * The pixel value coordinate.
   *
   * @return The axis value.
   *
   */
  double toValue(double pixel);

  /**
   * Update an axis object with a new set of options. The options are merged
   * with the existing options, so only new or altered options need to be
   * specified.
   *
   * @param options
   * The new options that will be merged in with existing options on
   * the axis.
   *
   * @param redraw
   * Whether to redraw the chart after the axis is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void update(ZAxisOptions options, boolean redraw);

  /**
   * Update an axis object with a new set of options. The options are merged
   * with the existing options, so only new or altered options need to be
   * specified.
   *
   * @param options
   * The new options that will be merged in with existing options on
   * the axis.
   *
   * @param redraw
   * Whether to redraw the chart after the axis is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void update(YAxisOptions options, boolean redraw);

  /**
   * Update an axis object with a new set of options. The options are merged
   * with the existing options, so only new or altered options need to be
   * specified.
   *
   * @param options
   * The new options that will be merged in with existing options on
   * the axis.
   *
   * @param redraw
   * Whether to redraw the chart after the axis is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void update(XAxisOptions options, boolean redraw);

  /**
   * Update an axis object with a new set of options. The options are merged
   * with the existing options, so only new or altered options need to be
   * specified.
   *
   * @param options
   * The new options that will be merged in with existing options on
   * the axis.
   *
   */
  void update(ZAxisOptions options);

  /**
   * Update an axis object with a new set of options. The options are merged
   * with the existing options, so only new or altered options need to be
   * specified.
   *
   * @param options
   * The new options that will be merged in with existing options on
   * the axis.
   *
   */
  void update(YAxisOptions options);

  /**
   * Update an axis object with a new set of options. The options are merged
   * with the existing options, so only new or altered options need to be
   * specified.
   *
   * @param options
   * The new options that will be merged in with existing options on
   * the axis.
   *
   */
  void update(XAxisOptions options);

  abstract class GetLinePathResult extends JsEnum {
    public static final GetLinePathResult A = JsEnum.of("a");

    public static final GetLinePathResult C = JsEnum.of("c");

    public static final GetLinePathResult H = JsEnum.of("h");

    public static final GetLinePathResult L = JsEnum.of("l");

    public static final GetLinePathResult M = JsEnum.of("m");

    public static final GetLinePathResult Q = JsEnum.of("q");

    public static final GetLinePathResult S = JsEnum.of("s");

    public static final GetLinePathResult T = JsEnum.of("t");

    public static final GetLinePathResult V = JsEnum.of("v");

    public static final GetLinePathResult Z = JsEnum.of("z");

    public static final GetLinePathResult CAPITAL_A = JsEnum.of("A");

    public static final GetLinePathResult CAPITAL_C = JsEnum.of("C");

    public static final GetLinePathResult CAPITAL_H = JsEnum.of("H");

    public static final GetLinePathResult CAPITAL_L = JsEnum.of("L");

    public static final GetLinePathResult CAPITAL_M = JsEnum.of("M");

    public static final GetLinePathResult CAPITAL_Q = JsEnum.of("Q");

    public static final GetLinePathResult CAPITAL_S = JsEnum.of("S");

    public static final GetLinePathResult CAPITAL_T = JsEnum.of("T");

    public static final GetLinePathResult CAPITAL_V = JsEnum.of("V");

    public static final GetLinePathResult CAPITAL_Z = JsEnum.of("Z");
  }

  abstract class GetMinorTickIntervalResult extends JsEnum {
    public static final GetMinorTickIntervalResult AUTO = JsEnum.of("auto");
  }

  abstract class GetPlotBandPathResult extends JsEnum {
    public static final GetPlotBandPathResult A = JsEnum.of("a");

    public static final GetPlotBandPathResult C = JsEnum.of("c");

    public static final GetPlotBandPathResult H = JsEnum.of("h");

    public static final GetPlotBandPathResult L = JsEnum.of("l");

    public static final GetPlotBandPathResult M = JsEnum.of("m");

    public static final GetPlotBandPathResult Q = JsEnum.of("q");

    public static final GetPlotBandPathResult S = JsEnum.of("s");

    public static final GetPlotBandPathResult T = JsEnum.of("t");

    public static final GetPlotBandPathResult V = JsEnum.of("v");

    public static final GetPlotBandPathResult Z = JsEnum.of("z");

    public static final GetPlotBandPathResult CAPITAL_A = JsEnum.of("A");

    public static final GetPlotBandPathResult CAPITAL_C = JsEnum.of("C");

    public static final GetPlotBandPathResult CAPITAL_H = JsEnum.of("H");

    public static final GetPlotBandPathResult CAPITAL_L = JsEnum.of("L");

    public static final GetPlotBandPathResult CAPITAL_M = JsEnum.of("M");

    public static final GetPlotBandPathResult CAPITAL_Q = JsEnum.of("Q");

    public static final GetPlotBandPathResult CAPITAL_S = JsEnum.of("S");

    public static final GetPlotBandPathResult CAPITAL_T = JsEnum.of("T");

    public static final GetPlotBandPathResult CAPITAL_V = JsEnum.of("V");

    public static final GetPlotBandPathResult CAPITAL_Z = JsEnum.of("Z");
  }

  abstract class GetPlotLinePathResult extends JsEnum {
    public static final GetPlotLinePathResult A = JsEnum.of("a");

    public static final GetPlotLinePathResult C = JsEnum.of("c");

    public static final GetPlotLinePathResult H = JsEnum.of("h");

    public static final GetPlotLinePathResult L = JsEnum.of("l");

    public static final GetPlotLinePathResult M = JsEnum.of("m");

    public static final GetPlotLinePathResult Q = JsEnum.of("q");

    public static final GetPlotLinePathResult S = JsEnum.of("s");

    public static final GetPlotLinePathResult T = JsEnum.of("t");

    public static final GetPlotLinePathResult V = JsEnum.of("v");

    public static final GetPlotLinePathResult Z = JsEnum.of("z");

    public static final GetPlotLinePathResult CAPITAL_A = JsEnum.of("A");

    public static final GetPlotLinePathResult CAPITAL_C = JsEnum.of("C");

    public static final GetPlotLinePathResult CAPITAL_H = JsEnum.of("H");

    public static final GetPlotLinePathResult CAPITAL_L = JsEnum.of("L");

    public static final GetPlotLinePathResult CAPITAL_M = JsEnum.of("M");

    public static final GetPlotLinePathResult CAPITAL_Q = JsEnum.of("Q");

    public static final GetPlotLinePathResult CAPITAL_S = JsEnum.of("S");

    public static final GetPlotLinePathResult CAPITAL_T = JsEnum.of("T");

    public static final GetPlotLinePathResult CAPITAL_V = JsEnum.of("V");

    public static final GetPlotLinePathResult CAPITAL_Z = JsEnum.of("Z");
  }
}
