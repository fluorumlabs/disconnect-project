package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

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
   * @param options
   * Axis options.
   *
   * @implspec constructor(chart: Chart, options: AxisOptions);
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Axis(chart, options)"
  )
  static Axis create(Chart chart, XAxisOptions options) {
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
   * @param options
   * Axis options.
   *
   * @implspec constructor(chart: Chart, options: AxisOptions);
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Axis(chart, options)"
  )
  static Axis create(Chart chart, YAxisOptions options) {
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
   * @param options
   * Axis options.
   *
   * @implspec constructor(chart: Chart, options: AxisOptions);
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Axis(chart, options)"
  )
  static Axis create(Chart chart, ZAxisOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Chart that the axis belongs to.
   *
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * The Chart that the axis belongs to.
   *
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  void setChart(Chart value);

  /**
   * The collection where the axis belongs, for example <code>xAxis</code>, <code>yAxis</code> or
   * <code>colorAxis</code>. Corresponds to properties on Chart, for example Chart.xAxis.
   *
   * @implspec coll: string;
   *
   */
  @JSProperty("coll")
  String getColl();

  /**
   * The collection where the axis belongs, for example <code>xAxis</code>, <code>yAxis</code> or
   * <code>colorAxis</code>. Corresponds to properties on Chart, for example Chart.xAxis.
   *
   * @implspec coll: string;
   *
   */
  @JSProperty("coll")
  void setColl(String value);

  /**
   * The processed crosshair options.
   *
   * @implspec crosshair: (false|AxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  Unknown getCrosshair();

  /**
   * The processed crosshair options.
   *
   * @implspec crosshair: (false|AxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(boolean value);

  /**
   * The processed crosshair options.
   *
   * @implspec crosshair: (false|AxisCrosshairOptions);
   *
   */
  @JSProperty("crosshair")
  void setCrosshair(Unknown value);

  /**
   * Whether the axis is horizontal.
   *
   * @implspec horiz: boolean;
   *
   */
  @JSProperty("horiz")
  boolean getHoriz();

  /**
   * Whether the axis is horizontal.
   *
   * @implspec horiz: boolean;
   *
   */
  @JSProperty("horiz")
  void setHoriz(boolean value);

  /**
   * The maximum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   * @implspec max: number;
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * The maximum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   * @implspec max: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * The minimum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   * @implspec min: number;
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * The minimum value of the axis. In a logarithmic axis, this is the
   * logarithm of the real value, and the real value can be obtained from
   * Axis#getExtremes.
   *
   * @implspec min: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * Whether the axis is reversed. Based on the <code>axis.reversed</code>, option, but
   * inverted charts have reversed xAxis by default.
   *
   * @implspec reversed: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * Whether the axis is reversed. Based on the <code>axis.reversed</code>, option, but
   * inverted charts have reversed xAxis by default.
   *
   * @implspec reversed: boolean;
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * All series associated to the axis.
   *
   * @implspec series: Array<Series>;
   *
   */
  @JSProperty("series")
  Array<Series> getSeries();

  /**
   * All series associated to the axis.
   *
   * @implspec series: Array<Series>;
   *
   */
  @JSProperty("series")
  void setSeries(Array<Series> value);

  /**
   * The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom
   * and 3 is left.
   *
   * @implspec side: number;
   *
   */
  @JSProperty("side")
  double getSide();

  /**
   * The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom
   * and 3 is left.
   *
   * @implspec side: number;
   *
   */
  @JSProperty("side")
  void setSide(double value);

  /**
   * Add a plot band after render time.
   *
   * @param options
   * A configuration object for the plot band, as defined in
   * xAxis.plotBands.
   *
   * @return The added plot band.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotBand">https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotBand</a>
   *
   * @implspec addPlotBand(options: AxisPlotBandsOptions): (PlotLineOrBand|undefined);
   *
   */
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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotBand">https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotBand</a>
   *
   * @implspec addPlotBand(options: AxisPlotBandsOptions): (PlotLineOrBand|undefined);
   *
   */
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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotBand">https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotBand</a>
   *
   * @implspec addPlotBand(options: AxisPlotBandsOptions): (PlotLineOrBand|undefined);
   *
   */
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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotLine">https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotLine</a>
   *
   * @implspec addPlotLine(options: AxisPlotLinesOptions): (PlotLineOrBand|undefined);
   *
   */
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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotLine">https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotLine</a>
   *
   * @implspec addPlotLine(options: AxisPlotLinesOptions): (PlotLineOrBand|undefined);
   *
   */
  PlotLineOrBand addPlotLine(XAxisPlotLinesOptions options);

  /**
   * Add a plot line after render time.
   *
   * @param options
   * A configuration object for the plot line, as defined in
   * xAxis.plotLines.
   *
   * @return The added plot line.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotLine">https://api.highcharts.com/class-reference/Highcharts.Axis#addPlotLine</a>
   *
   * @implspec addPlotLine(options: AxisPlotLinesOptions): (PlotLineOrBand|undefined);
   *
   */
  PlotLineOrBand addPlotLine(ZAxisPlotLinesOptions options);

  /**
   * Adds the title defined in axis.options.title.
   *
   * @param display
   * Whether or not to display the title.
   *
   * @implspec addTitle(display: boolean): void;
   *
   */
  void addTitle(boolean display);

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
   * @implspec drawCrosshair(e?: PointerEventObject, point?: Point): void;
   *
   */
  void drawCrosshair(PointerEventObject e, Point point);

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
   * @implspec drawCrosshair(e?: PointerEventObject, point?: Point): void;
   *
   */
  void drawCrosshair();

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
   * @implspec drawCrosshair(e?: PointerEventObject, point?: Point): void;
   *
   */
  void drawCrosshair(PointerEventObject e);

  /**
   * Get the current extremes for the axis.
   *
   * @return An object containing extremes information.
   *
   * @implspec getExtremes(): ExtremesObject;
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
   * @implspec getLinearTickPositions(tickInterval: number, min: number, max: number): Array<number>;
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
   * @implspec getLinePath(lineWidth: number): SVGPathArray;
   *
   */
  Array<Unknown> getLinePath(double lineWidth);

  /**
   * Resolve the new minorTicks/minorTickInterval options into the legacy
   * loosely typed minorTickInterval option.
   *
   * @implspec getMinorTickInterval(): ('auto'|number|null);
   *
   */
  double getMinorTickInterval();

  /**
   * Internal function to return the minor tick positions. For logarithmic
   * axes, the same logic as for major ticks is reused.
   *
   * @return An array of axis values where ticks should be placed.
   *
   * @implspec getMinorTickPositions(): Array<number>;
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
   * @implspec getPlotBandPath(from: number, to: number): SVGPathArray;
   *
   */
  Array<Unknown> getPlotBandPath(double from, double to);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param value
   * Axis value.
   *
   * @param lineWidth
   * Used for calculation crisp line coordinates.
   *
   * @param old
   * Use old coordinates (for resizing and rescaling).
   *
   * @param force
   * If <code>false</code>, the function will return null when it falls outside
   * the axis bounds. If <code>true</code>, the function will return a path
   * aligned to the plot area sides if it falls outside. If <code>pass</code>, it
   * will return a path outside.
   *
   * @param translatedValue
   * If given, return the plot line path of a pixel position on the
   * axis.
   *
   * @return The SVG path definition for the plot line.
   *
   * @implspec getPlotLinePath(value: number, lineWidth?: number, old?: boolean, force?: (boolean|string), translatedValue?: number): Array&lt;(string|number)&gt;;
   *
   */
  Array<Unknown> getPlotLinePath(double value, double lineWidth, boolean old, String force,
      double translatedValue);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param value
   * Axis value.
   *
   * @param lineWidth
   * Used for calculation crisp line coordinates.
   *
   * @param old
   * Use old coordinates (for resizing and rescaling).
   *
   * @param force
   * If <code>false</code>, the function will return null when it falls outside
   * the axis bounds. If <code>true</code>, the function will return a path
   * aligned to the plot area sides if it falls outside. If <code>pass</code>, it
   * will return a path outside.
   *
   * @param translatedValue
   * If given, return the plot line path of a pixel position on the
   * axis.
   *
   * @return The SVG path definition for the plot line.
   *
   * @implspec getPlotLinePath(value: number, lineWidth?: number, old?: boolean, force?: (boolean|string), translatedValue?: number): Array&lt;(string|number)&gt;;
   *
   */
  Array<Unknown> getPlotLinePath(double value);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param value
   * Axis value.
   *
   * @param lineWidth
   * Used for calculation crisp line coordinates.
   *
   * @param old
   * Use old coordinates (for resizing and rescaling).
   *
   * @param force
   * If <code>false</code>, the function will return null when it falls outside
   * the axis bounds. If <code>true</code>, the function will return a path
   * aligned to the plot area sides if it falls outside. If <code>pass</code>, it
   * will return a path outside.
   *
   * @param translatedValue
   * If given, return the plot line path of a pixel position on the
   * axis.
   *
   * @return The SVG path definition for the plot line.
   *
   * @implspec getPlotLinePath(value: number, lineWidth?: number, old?: boolean, force?: (boolean|string), translatedValue?: number): Array&lt;(string|number)&gt;;
   *
   */
  Array<Unknown> getPlotLinePath(double value, double lineWidth, boolean old);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param value
   * Axis value.
   *
   * @param lineWidth
   * Used for calculation crisp line coordinates.
   *
   * @param old
   * Use old coordinates (for resizing and rescaling).
   *
   * @param force
   * If <code>false</code>, the function will return null when it falls outside
   * the axis bounds. If <code>true</code>, the function will return a path
   * aligned to the plot area sides if it falls outside. If <code>pass</code>, it
   * will return a path outside.
   *
   * @param translatedValue
   * If given, return the plot line path of a pixel position on the
   * axis.
   *
   * @return The SVG path definition for the plot line.
   *
   * @implspec getPlotLinePath(value: number, lineWidth?: number, old?: boolean, force?: (boolean|string), translatedValue?: number): Array&lt;(string|number)&gt;;
   *
   */
  Array<Unknown> getPlotLinePath(double value, double lineWidth, boolean old, boolean force,
      double translatedValue);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param value
   * Axis value.
   *
   * @param lineWidth
   * Used for calculation crisp line coordinates.
   *
   * @param old
   * Use old coordinates (for resizing and rescaling).
   *
   * @param force
   * If <code>false</code>, the function will return null when it falls outside
   * the axis bounds. If <code>true</code>, the function will return a path
   * aligned to the plot area sides if it falls outside. If <code>pass</code>, it
   * will return a path outside.
   *
   * @param translatedValue
   * If given, return the plot line path of a pixel position on the
   * axis.
   *
   * @return The SVG path definition for the plot line.
   *
   * @implspec getPlotLinePath(value: number, lineWidth?: number, old?: boolean, force?: (boolean|string), translatedValue?: number): Array&lt;(string|number)&gt;;
   *
   */
  Array<Unknown> getPlotLinePath(double value, double lineWidth, boolean old, String force);

  /**
   * Create the path for a plot line that goes from the given value on this
   * axis, across the plot to the opposite side. Also used internally for grid
   * lines and crosshairs.
   *
   * @param value
   * Axis value.
   *
   * @param lineWidth
   * Used for calculation crisp line coordinates.
   *
   * @param old
   * Use old coordinates (for resizing and rescaling).
   *
   * @param force
   * If <code>false</code>, the function will return null when it falls outside
   * the axis bounds. If <code>true</code>, the function will return a path
   * aligned to the plot area sides if it falls outside. If <code>pass</code>, it
   * will return a path outside.
   *
   * @param translatedValue
   * If given, return the plot line path of a pixel position on the
   * axis.
   *
   * @return The SVG path definition for the plot line.
   *
   * @implspec getPlotLinePath(value: number, lineWidth?: number, old?: boolean, force?: (boolean|string), translatedValue?: number): Array&lt;(string|number)&gt;;
   *
   */
  Array<Unknown> getPlotLinePath(double value, double lineWidth);

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
   * @implspec getThreshold(threshold: number): number;
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
   * @implspec hasData(): boolean;
   *
   */
  boolean hasData();

  /**
   * Hide the crosshair if visible.
   *
   * @implspec hideCrosshair(): void;
   *
   */
  void hideCrosshair();

  /**
   * Overrideable function to initialize the axis.
   *
   * @fires Highcharts.Axis#afterInit
   * @fires Highcharts.Axis#init
   *
   * @implspec init(chart: Chart, userOptions: Options): void;
   *
   */
  void init(Chart chart, Options userOptions);

  /**
   * Remove the axis from the chart.
   *
   * @param redraw
   * Whether to redraw the chart following the remove.
   *
   * @implspec remove(redraw?: boolean): void;
   *
   */
  void remove();

  /**
   * Remove the axis from the chart.
   *
   * @param redraw
   * Whether to redraw the chart following the remove.
   *
   * @implspec remove(redraw?: boolean): void;
   *
   */
  void remove(boolean redraw);

  /**
   * Remove a plot band by its id.
   *
   * @param id
   * The plot band's <code>id</code> as given in the original configuration object
   * or in the <code>addPlotBand</code> option.
   *
   * @implspec removePlotBand(id: string): void;
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
   * @implspec removePlotLine(id: string): void;
   *
   */
  void removePlotLine(String id);

  /**
   * Render the axis line. Called internally when rendering and redrawing the
   * axis.
   *
   * @implspec renderLine(): void;
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
   * @implspec renderMinorTick(pos: number): void;
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
   * @implspec renderTick(pos: number, i: number): void;
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
   * @implspec setCategories(categories: Array<string>, redraw?: boolean): void;
   *
   */
  void setCategories(String[] categories, boolean redraw);

  /**
   * Set new axis categories and optionally redraw.
   *
   * @param categories
   * The new categories.
   *
   * @param redraw
   * Whether to redraw the chart.
   *
   * @implspec setCategories(categories: Array<string>, redraw?: boolean): void;
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
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
   *
   */
  void setExtremes();

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
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
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
   * @param animation
   * Enable or modify animations.
   *
   * @param eventArguments
   * Arguments to be accessed in event handler.
   *
   * @fires Highcharts.Axis#setExtremes
   *
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
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
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
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
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw, boolean animation,
      Any eventArguments);

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
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
   *
   */
  void setExtremes(double newMin, double newMax, boolean redraw, AnimationOptionsObject animation,
      Any eventArguments);

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
   * @implspec setExtremes(newMin?: number, newMax?: number, redraw?: boolean, animation?: (boolean|AnimationOptionsObject), eventArguments?: any): void;
   *
   */
  void setExtremes(double newMin);

  /**
   * Now we have computed the normalized tickInterval, get the tick positions
   *
   * @fires Highcharts.Axis#afterSetTickPositions
   *
   * @implspec setTickPositions(): void;
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
   * @implspec setTitle(titleOptions: (XAxisTitleOptions|YAxisTitleOptions|ZAxisTitleOptions), redraw?: boolean): void;
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
   * @implspec setTitle(titleOptions: (XAxisTitleOptions|YAxisTitleOptions|ZAxisTitleOptions), redraw?: boolean): void;
   *
   */
  void setTitle(XAxisTitleOptions titleOptions, boolean redraw);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   * @param redraw
   * Whether to redraw the chart after setting the title.
   *
   * @implspec setTitle(titleOptions: (XAxisTitleOptions|YAxisTitleOptions|ZAxisTitleOptions), redraw?: boolean): void;
   *
   */
  void setTitle(ZAxisTitleOptions titleOptions);

  /**
   * Update the axis title by options after render time.
   *
   * @param titleOptions
   * The additional title options.
   *
   * @param redraw
   * Whether to redraw the chart after setting the title.
   *
   * @implspec setTitle(titleOptions: (XAxisTitleOptions|YAxisTitleOptions|ZAxisTitleOptions), redraw?: boolean): void;
   *
   */
  void setTitle(YAxisTitleOptions titleOptions, boolean redraw);

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
   * @implspec toPixels(value: number, paneCoordinates: boolean): number;
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
   * @param paneCoordiantes
   * Whether the input pixel is relative to the chart or just the
   * axis/pane itself.
   *
   * @return The axis value.
   *
   * @implspec toValue(pixel: number, paneCoordiantes: boolean): number;
   *
   */
  double toValue(double pixel, boolean paneCoordiantes);

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
   * Whether to redraw the chart.
   *
   * @implspec update(options: (XAxisOptions|YAxisOptions|ZAxisOptions), redraw?: boolean): void;
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
   * Whether to redraw the chart.
   *
   * @implspec update(options: (XAxisOptions|YAxisOptions|ZAxisOptions), redraw?: boolean): void;
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
   * Whether to redraw the chart.
   *
   * @implspec update(options: (XAxisOptions|YAxisOptions|ZAxisOptions), redraw?: boolean): void;
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
   * @param redraw
   * Whether to redraw the chart.
   *
   * @implspec update(options: (XAxisOptions|YAxisOptions|ZAxisOptions), redraw?: boolean): void;
   *
   */
  void update(XAxisOptions options, boolean redraw);
}
