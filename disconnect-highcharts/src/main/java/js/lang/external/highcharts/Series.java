package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * This is the base series prototype that all other series types inherit from. A
 * new series is initialized either through the series option structure, or
 * after the chart is initialized, through Highcharts.Chart#addSeries.
 *
 * The object can be accessed in a number of ways. All series and point event
 * handlers give a reference to the <code>series</code> object. The chart object has a
 * series property that is a collection of all the chart's series. The point
 * objects and axis objects also have the same reference.
 *
 * Another way to reference the series programmatically is by <code>id</code>. Add an id in
 * the series configuration options, and get the series object by
 * Highcharts.Chart#get.
 *
 * Configuration options for the series are given in three levels. Options for
 * all series in a chart are given in the plotOptions.series object. Then
 * options for all series of a specific type are given in the plotOptions of
 * that type, for example <code>plotOptions.line</code>. Next, options for one single
 * series are given in the series array, or as arguments to <code>chart.addSeries</code>.
 *
 * The data in the series is stored in various arrays.
 *
 * <ul>
 * <li>
 * First, <code>series.options.data</code> contains all the original config options for
 * each point whether added by options or methods like <code>series.addPoint</code>.
 *
 * </li>
 * <li>
 * Next, <code>series.data</code> contains those values converted to points, but in case
 * the series data length exceeds the <code>cropThreshold</code>, or if the data is
 * grouped, <code>series.data</code> doesn't contain all the points. It only contains the
 * points that have been created on demand.
 *
 * </li>
 * <li>
 * Then there's <code>series.points</code> that contains all currently visible point
 * objects. In case of cropping, the cropped-away points are not part of this
 * array. The <code>series.points</code> array starts at <code>series.cropStart</code> compared to
 * <code>series.data</code> and <code>series.options.data</code>. If however the series data is
 * grouped, these can't be correlated one to one.
 *
 * </li>
 * <li>
 * <code>series.xData</code> and <code>series.processedXData</code> contain clean x values,
 * equivalent to <code>series.data</code> and <code>series.points</code>.
 *
 * </li>
 * <li>
 * <code>series.yData</code> and <code>series.processedYData</code> contain clean y values,
 * equivalent to <code>series.data</code> and <code>series.points</code>.
 *
 * </li>
 * </ul>
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Series as Series_Series"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Series extends Any {
  /**
   * This is the base series prototype that all other series types inherit
   * from. A new series is initialized either through the series option
   * structure, or after the chart is initialized, through
   * Highcharts.Chart#addSeries.
   *
   * The object can be accessed in a number of ways. All series and point
   * event handlers give a reference to the <code>series</code> object. The chart object
   * has a series property that is a collection of all the chart's series. The
   * point objects and axis objects also have the same reference.
   *
   * Another way to reference the series programmatically is by <code>id</code>. Add an
   * id in the series configuration options, and get the series object by
   * Highcharts.Chart#get.
   *
   * Configuration options for the series are given in three levels. Options
   * for all series in a chart are given in the plotOptions.series object.
   * Then options for all series of a specific type are given in the
   * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
   * for one single series are given in the series array, or as arguments to
   * <code>chart.addSeries</code>.
   *
   * The data in the series is stored in various arrays.
   *
   * <ul>
   * <li>
   * First, <code>series.options.data</code> contains all the original config options
   * for each point whether added by options or methods like
   * <code>series.addPoint</code>.
   *
   * </li>
   * <li>
   * Next, <code>series.data</code> contains those values converted to points, but in
   * case the series data length exceeds the <code>cropThreshold</code>, or if the data
   * is grouped, <code>series.data</code> doesn't contain all the points. It only
   * contains the points that have been created on demand.
   *
   * </li>
   * <li>
   * Then there's <code>series.points</code> that contains all currently visible point
   * objects. In case of cropping, the cropped-away points are not part of
   * this array. The <code>series.points</code> array starts at <code>series.cropStart</code>
   * compared to <code>series.data</code> and <code>series.options.data</code>. If however the
   * series data is grouped, these can't be correlated one to one.
   *
   * </li>
   * <li>
   * <code>series.xData</code> and <code>series.processedXData</code> contain clean x values,
   * equivalent to <code>series.data</code> and <code>series.points</code>.
   *
   * </li>
   * <li>
   * <code>series.yData</code> and <code>series.processedYData</code> contain clean y values,
   * equivalent to <code>series.data</code> and <code>series.points</code>.
   *
   * </li>
   * </ul>
   * @param chart
   * The chart instance.
   *
   * @param options
   * The series options.
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Series_Series(chart, options)"
  )
  static Series create(Chart chart, SeriesOptionsRegistry[] options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * This is the base series prototype that all other series types inherit
   * from. A new series is initialized either through the series option
   * structure, or after the chart is initialized, through
   * Highcharts.Chart#addSeries.
   *
   * The object can be accessed in a number of ways. All series and point
   * event handlers give a reference to the <code>series</code> object. The chart object
   * has a series property that is a collection of all the chart's series. The
   * point objects and axis objects also have the same reference.
   *
   * Another way to reference the series programmatically is by <code>id</code>. Add an
   * id in the series configuration options, and get the series object by
   * Highcharts.Chart#get.
   *
   * Configuration options for the series are given in three levels. Options
   * for all series in a chart are given in the plotOptions.series object.
   * Then options for all series of a specific type are given in the
   * plotOptions of that type, for example <code>plotOptions.line</code>. Next, options
   * for one single series are given in the series array, or as arguments to
   * <code>chart.addSeries</code>.
   *
   * The data in the series is stored in various arrays.
   *
   * <ul>
   * <li>
   * First, <code>series.options.data</code> contains all the original config options
   * for each point whether added by options or methods like
   * <code>series.addPoint</code>.
   *
   * </li>
   * <li>
   * Next, <code>series.data</code> contains those values converted to points, but in
   * case the series data length exceeds the <code>cropThreshold</code>, or if the data
   * is grouped, <code>series.data</code> doesn't contain all the points. It only
   * contains the points that have been created on demand.
   *
   * </li>
   * <li>
   * Then there's <code>series.points</code> that contains all currently visible point
   * objects. In case of cropping, the cropped-away points are not part of
   * this array. The <code>series.points</code> array starts at <code>series.cropStart</code>
   * compared to <code>series.data</code> and <code>series.options.data</code>. If however the
   * series data is grouped, these can't be correlated one to one.
   *
   * </li>
   * <li>
   * <code>series.xData</code> and <code>series.processedXData</code> contain clean x values,
   * equivalent to <code>series.data</code> and <code>series.points</code>.
   *
   * </li>
   * <li>
   * <code>series.yData</code> and <code>series.processedYData</code> contain clean y values,
   * equivalent to <code>series.data</code> and <code>series.points</code>.
   *
   * </li>
   * </ul>
   * @param chart
   * The chart instance.
   *
   * @param options
   * The series options.
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Series_Series(chart, options)"
  )
  static Series create(Chart chart, Any options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * SVG element of area-based charts. Can be used for styling purposes. If
   * zones are configured, this element will be hidden and replaced by
   * multiple zone areas, accessible via <code>series['zone-area-x']</code> (where x is a
   * number, starting with 0).
   *
   */
  @JSProperty("area")
  @Nullable
  SVGElement getArea();

  /**
   * SVG element of area-based charts. Can be used for styling purposes. If
   * zones are configured, this element will be hidden and replaced by
   * multiple zone areas, accessible via <code>series['zone-area-x']</code> (where x is a
   * number, starting with 0).
   *
   */
  @JSProperty("area")
  void setArea(@Nullable SVGElement value);

  /**
   * Read only. The chart that the series belongs to.
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * Read only. The chart that the series belongs to.
   *
   */
  @JSProperty("chart")
  void setChart(Chart value);

  /**
   * Read only. An array containing those values converted to points. In case
   * the series data length exceeds the <code>cropThreshold</code>, or if the data is
   * grouped, <code>series.data</code> doesn't contain all the points. Also, in case a
   * series is hidden, the <code>data</code> array may be empty. To access raw values,
   * <code>series.options.data</code> will always be up to date. <code>Series.data</code> only
   * contains the points that have been created on demand. To modify the data,
   * use Highcharts.Series#setData or Highcharts.Point#update.
   *
   */
  @JSProperty("data")
  Point[] getData();

  /**
   * Read only. An array containing those values converted to points. In case
   * the series data length exceeds the <code>cropThreshold</code>, or if the data is
   * grouped, <code>series.data</code> doesn't contain all the points. Also, in case a
   * series is hidden, the <code>data</code> array may be empty. To access raw values,
   * <code>series.options.data</code> will always be up to date. <code>Series.data</code> only
   * contains the points that have been created on demand. To modify the data,
   * use Highcharts.Series#setData or Highcharts.Point#update.
   *
   */
  @JSProperty("data")
  void setData(Point[] value);

  /**
   * Contains the minimum value of the series' data point.
   *
   */
  @JSProperty("dataMin")
  double getDataMin();

  /**
   * SVG element of line-based charts. Can be used for styling purposes. If
   * zones are configured, this element will be hidden and replaced by
   * multiple zone lines, accessible via <code>series['zone-graph-x']</code> (where x is
   * a number, starting with 0).
   *
   */
  @JSProperty("graph")
  @Nullable
  SVGElement getGraph();

  /**
   * SVG element of line-based charts. Can be used for styling purposes. If
   * zones are configured, this element will be hidden and replaced by
   * multiple zone lines, accessible via <code>series['zone-graph-x']</code> (where x is
   * a number, starting with 0).
   *
   */
  @JSProperty("graph")
  void setGraph(@Nullable SVGElement value);

  /**
   * Contains the series' index in the <code>Chart.series</code> array.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * The series name as given in the options. Defaults to &quot;Series {n}&quot;.
   *
   */
  @JSProperty("name")
  String getName();

  /**
   * The series name as given in the options. Defaults to &quot;Series {n}&quot;.
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * Read only. The series' current options. To update, use Series#update.
   *
   */
  @JSProperty("options")
  SeriesOptionsRegistry[] getOptions();

  /**
   * Read only. The series' current options. To update, use Series#update.
   *
   */
  @JSProperty("options")
  void setOptions(SeriesOptionsRegistry[] value);

  /**
   * An array containing all currently visible point objects. In case of
   * cropping, the cropped-away points are not part of this array. The
   * <code>series.points</code> array starts at <code>series.cropStart</code> compared to
   * <code>series.data</code> and <code>series.options.data</code>. If however the series data is
   * grouped, these can't be correlated one to one. To modify the data, use
   * Highcharts.Series#setData or Highcharts.Point#update.
   *
   */
  @JSProperty("points")
  Point[] getPoints();

  /**
   * An array containing all currently visible point objects. In case of
   * cropping, the cropped-away points are not part of this array. The
   * <code>series.points</code> array starts at <code>series.cropStart</code> compared to
   * <code>series.data</code> and <code>series.options.data</code>. If however the series data is
   * grouped, these can't be correlated one to one. To modify the data, use
   * Highcharts.Series#setData or Highcharts.Point#update.
   *
   */
  @JSProperty("points")
  void setPoints(Point[] value);

  /**
   * Read only. The series' selected state as set by Highcharts.Series#select.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * Read only. The series' selected state as set by Highcharts.Series#select.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * Read only. The series' visibility state as set by Series#show,
   * Series#hide, or in the initial configuration.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * Read only. The unique xAxis object associated with the series.
   *
   */
  @JSProperty("xAxis")
  Axis getXAxis();

  /**
   * Read only. The unique xAxis object associated with the series.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(Axis value);

  /**
   * Read only. The unique yAxis object associated with the series.
   *
   */
  @JSProperty("yAxis")
  Axis getYAxis();

  /**
   * Read only. The unique yAxis object associated with the series.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(Axis value);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation, boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options, boolean redraw, boolean shift, boolean animation,
      boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation, boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options, boolean redraw, boolean shift, boolean animation,
      boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation, boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options, boolean redraw, boolean shift,
      boolean animation, boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation, boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options, boolean redraw, boolean shift, boolean animation,
      boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation, boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>addPoint</code> event.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options, boolean redraw, boolean shift, boolean animation,
      boolean withEvent);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options, boolean redraw, boolean shift, boolean animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options, boolean redraw, boolean shift, boolean animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options, boolean redraw, boolean shift,
      boolean animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options, boolean redraw, boolean shift, boolean animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options, boolean redraw, boolean shift,
      @Nullable AnimationOptionsObject animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options, boolean redraw, boolean shift, boolean animation);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options, boolean redraw, boolean shift);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options, boolean redraw, boolean shift);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options, boolean redraw, boolean shift);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options, boolean redraw, boolean shift);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @param shift
   * If true, a point is shifted off the start of the series as one is
   * appended to the end.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options, boolean redraw, boolean shift);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options, boolean redraw);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options, boolean redraw);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options, boolean redraw);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options, boolean redraw);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When adding
   * more than one point, it is highly recommended that the redraw
   * option be set to false, and instead Chart#redraw is explicitly
   * called after the adding of points is finished. Otherwise, the
   * chart will redraw after adding each point.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options, boolean redraw);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(String[] options);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double[] options);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable PointOptionsObject options);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(@Nullable String options);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @param options
   * The point options. If options is a single number, a point with
   * that y value is appended to the series. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options as outlined under <code>series.data</code> are applied.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint(double options);

  /**
   * Add a point to the series after render time. The point can be added at
   * the end, or by giving it an X value, to the start or in the middle of the
   * series.
   *
   * @fires Highcharts.Series#addPoint
   *
   */
  void addPoint();

  /**
   * Animate in the series. Called internally twice. First with the <code>init</code>
   * parameter set to true, which sets up the initial state of the animation.
   * Then when ready, it is called with the <code>init</code> parameter undefined, in
   * order to perform the actual animation. After the second run, the function
   * is removed.
   *
   * @param init
   * Initialize the animation.
   *
   */
  void animate(boolean init);

  /**
   * Animate in the series. Called internally twice. First with the <code>init</code>
   * parameter set to true, which sets up the initial state of the animation.
   * Then when ready, it is called with the <code>init</code> parameter undefined, in
   * order to perform the actual animation. After the second run, the function
   * is removed.
   *
   */
  void animate();

  /**
   * Draw the graph. Called internally when rendering line-like series types.
   * The first time it generates the <code>series.graph</code> item and optionally other
   * series-wide items like <code>series.area</code> for area charts. On subsequent calls
   * these items are updated with new positions and attributes.
   *
   */
  void drawGraph();

  /**
   * Draw the markers for line-like series types, and columns or other
   * graphical representation for Point objects for other series types. The
   * resulting element is typically stored as Point.graphic, and is created on
   * the first call and updated and moved on subsequent calls.
   *
   */
  void drawPoints();

  /**
   * Return series name in &quot;Series {Number}&quot; format or the one defined by a
   * user. This method can be simply overridden as series name format can vary
   * (e.g. technical indicators).
   *
   * @return The series name.
   *
   */
  String getNameValue();

  /**
   * Get the translation and scale for the plot area of this series.
   *
   */
  SeriesPlotBoxObject getPlotBox();

  /**
   * Return the series points with null points filtered out.
   *
   * @param points
   * The points to inspect, defaults to Series.points.
   *
   * @param insideOnly
   * Whether to inspect only the points that are inside the visible
   * view.
   *
   * @param allowNull
   * Whether to allow null points to pass as valid points.
   *
   * @return The valid points.
   *
   */
  Point[] getValidPoints(Point[] points, boolean insideOnly, boolean allowNull);

  /**
   * Return the series points with null points filtered out.
   *
   * @param points
   * The points to inspect, defaults to Series.points.
   *
   * @param insideOnly
   * Whether to inspect only the points that are inside the visible
   * view.
   *
   * @return The valid points.
   *
   */
  Point[] getValidPoints(Point[] points, boolean insideOnly);

  /**
   * Return the series points with null points filtered out.
   *
   * @param points
   * The points to inspect, defaults to Series.points.
   *
   * @return The valid points.
   *
   */
  Point[] getValidPoints(Point[] points);

  /**
   * Return the series points with null points filtered out.
   *
   * @return The valid points.
   *
   */
  Point[] getValidPoints();

  /**
   * Hide the series if visible. If the chart.ignoreHiddenSeries option is
   * true, the chart is redrawn without this series.
   *
   * @fires Highcharts.Series#hide
   *
   */
  void hide();

  /**
   * Check whether the series item is itself or inherits from a certain series
   * type.
   *
   * @param type
   * The type of series to check for, can be either featured or custom
   * series types. For example <code>column</code>, <code>pie</code>, <code>ohlc</code> etc.
   *
   * @return True if this item is or inherits from the given type.
   *
   */
  boolean is(String type);

  /**
   * Get non-presentational attributes for a point. Used internally for both
   * styled mode and classic. Can be overridden for different series types.
   *
   * @param point
   * The Point to inspect.
   *
   * @param state
   * The state, can be either <code>hover</code>, <code>select</code> or undefined.
   *
   * @return A hash containing those attributes that are not settable from
   * CSS.
   *
   */
  SVGAttributes markerAttribs(Point point, @Nullable String state);

  /**
   * Get non-presentational attributes for a point. Used internally for both
   * styled mode and classic. Can be overridden for different series types.
   *
   * @param point
   * The Point to inspect.
   *
   * @return A hash containing those attributes that are not settable from
   * CSS.
   *
   */
  SVGAttributes markerAttribs(Point point);

  /**
   * Runs on mouse out of the series graphical items.
   *
   * @fires Highcharts.Series#mouseOut
   *
   */
  void onMouseOut();

  /**
   * Runs on mouse over the series graphical items.
   *
   * @fires Highcharts.Series#mouseOver
   *
   */
  void onMouseOver();

  /**
   * Remove a series and optionally redraw the chart.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>remove</code> event.
   *
   * @fires Highcharts.Series#remove
   *
   */
  void remove(boolean redraw, @Nullable AnimationOptionsObject animation, boolean withEvent);

  /**
   * Remove a series and optionally redraw the chart.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @param withEvent
   * Used internally, whether to fire the series <code>remove</code> event.
   *
   * @fires Highcharts.Series#remove
   *
   */
  void remove(boolean redraw, boolean animation, boolean withEvent);

  /**
   * Remove a series and optionally redraw the chart.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#remove
   *
   */
  void remove(boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Remove a series and optionally redraw the chart.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Series#remove
   *
   */
  void remove(boolean redraw, boolean animation);

  /**
   * Remove a series and optionally redraw the chart.
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call to
   * Highcharts.Chart#redraw.
   *
   * @fires Highcharts.Series#remove
   *
   */
  void remove(boolean redraw);

  /**
   * Remove a series and optionally redraw the chart.
   *
   * @fires Highcharts.Series#remove
   *
   */
  void remove();

  /**
   * Remove a point from the series. Unlike the Highcharts.Point#remove
   * method, this can also be done on a point that is not instanciated because
   * it is outside the view or subject to Highstock data grouping.
   *
   * @param i
   * The index of the point in the data array.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When
   * removing more than one point, it is highly recommended that the
   * <code>redraw</code> option be set to <code>false</code>, and instead
   * Highcharts.Chart#redraw is explicitly called after the adding of
   * points is finished.
   *
   * @param animation
   * Whether and optionally how the series should be animated.
   *
   * @fires Highcharts.Point#remove
   *
   */
  void removePoint(double i, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Remove a point from the series. Unlike the Highcharts.Point#remove
   * method, this can also be done on a point that is not instanciated because
   * it is outside the view or subject to Highstock data grouping.
   *
   * @param i
   * The index of the point in the data array.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When
   * removing more than one point, it is highly recommended that the
   * <code>redraw</code> option be set to <code>false</code>, and instead
   * Highcharts.Chart#redraw is explicitly called after the adding of
   * points is finished.
   *
   * @param animation
   * Whether and optionally how the series should be animated.
   *
   * @fires Highcharts.Point#remove
   *
   */
  void removePoint(double i, boolean redraw, boolean animation);

  /**
   * Remove a point from the series. Unlike the Highcharts.Point#remove
   * method, this can also be done on a point that is not instanciated because
   * it is outside the view or subject to Highstock data grouping.
   *
   * @param i
   * The index of the point in the data array.
   *
   * @param redraw
   * Whether to redraw the chart after the point is added. When
   * removing more than one point, it is highly recommended that the
   * <code>redraw</code> option be set to <code>false</code>, and instead
   * Highcharts.Chart#redraw is explicitly called after the adding of
   * points is finished.
   *
   * @fires Highcharts.Point#remove
   *
   */
  void removePoint(double i, boolean redraw);

  /**
   * Remove a point from the series. Unlike the Highcharts.Point#remove
   * method, this can also be done on a point that is not instanciated because
   * it is outside the view or subject to Highstock data grouping.
   *
   * @param i
   * The index of the point in the data array.
   *
   * @fires Highcharts.Point#remove
   *
   */
  void removePoint(double i);

  /**
   * Render the graph and markers. Called internally when first rendering and
   * later when redrawing the chart. This function can be extended in plugins,
   * but normally shouldn't be called directly.
   *
   * @fires Highcharts.Series#afterRender
   *
   */
  void render();

  /**
   * Select or unselect the series. This means its selected property is set,
   * the checkbox in the legend is toggled and when selected, the series is
   * returned by the Highcharts.Chart#getSelectedSeries function.
   *
   * @param selected
   * True to select the series, false to unselect. If undefined, the
   * selection state is toggled.
   *
   * @fires Highcharts.Series#select
   * @fires Highcharts.Series#unselect
   *
   */
  void select(boolean selected);

  /**
   * Select or unselect the series. This means its selected property is set,
   * the checkbox in the legend is toggled and when selected, the series is
   * returned by the Highcharts.Chart#getSelectedSeries function.
   *
   * @fires Highcharts.Series#select
   * @fires Highcharts.Series#unselect
   *
   */
  void select();

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   * @param updatePoints
   * When this is true, points will be updated instead of replaced
   * whenever possible. This occurs a) when the updated data is the
   * same length as the existing data, b) when points are matched by
   * their id's, or c) when points can be matched by X values. This
   * allows updating with animation and performs better. In this case,
   * the original array is not passed by reference. Set <code>false</code> to
   * prevent.
   *
   */
  void setData(String[] data, boolean redraw, @Nullable AnimationOptionsObject animation,
      boolean updatePoints);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   * @param updatePoints
   * When this is true, points will be updated instead of replaced
   * whenever possible. This occurs a) when the updated data is the
   * same length as the existing data, b) when points are matched by
   * their id's, or c) when points can be matched by X values. This
   * allows updating with animation and performs better. In this case,
   * the original array is not passed by reference. Set <code>false</code> to
   * prevent.
   *
   */
  void setData(String[] data, boolean redraw, boolean animation, boolean updatePoints);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   * @param updatePoints
   * When this is true, points will be updated instead of replaced
   * whenever possible. This occurs a) when the updated data is the
   * same length as the existing data, b) when points are matched by
   * their id's, or c) when points can be matched by X values. This
   * allows updating with animation and performs better. In this case,
   * the original array is not passed by reference. Set <code>false</code> to
   * prevent.
   *
   */
  void setData(double[] data, boolean redraw, @Nullable AnimationOptionsObject animation,
      boolean updatePoints);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   * @param updatePoints
   * When this is true, points will be updated instead of replaced
   * whenever possible. This occurs a) when the updated data is the
   * same length as the existing data, b) when points are matched by
   * their id's, or c) when points can be matched by X values. This
   * allows updating with animation and performs better. In this case,
   * the original array is not passed by reference. Set <code>false</code> to
   * prevent.
   *
   */
  void setData(double[] data, boolean redraw, boolean animation, boolean updatePoints);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   * @param updatePoints
   * When this is true, points will be updated instead of replaced
   * whenever possible. This occurs a) when the updated data is the
   * same length as the existing data, b) when points are matched by
   * their id's, or c) when points can be matched by X values. This
   * allows updating with animation and performs better. In this case,
   * the original array is not passed by reference. Set <code>false</code> to
   * prevent.
   *
   */
  void setData(PointOptionsObject[] data, boolean redraw,
      @Nullable AnimationOptionsObject animation, boolean updatePoints);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   * @param updatePoints
   * When this is true, points will be updated instead of replaced
   * whenever possible. This occurs a) when the updated data is the
   * same length as the existing data, b) when points are matched by
   * their id's, or c) when points can be matched by X values. This
   * allows updating with animation and performs better. In this case,
   * the original array is not passed by reference. Set <code>false</code> to
   * prevent.
   *
   */
  void setData(PointOptionsObject[] data, boolean redraw, boolean animation, boolean updatePoints);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   */
  void setData(String[] data, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   */
  void setData(String[] data, boolean redraw, boolean animation);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   */
  void setData(double[] data, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   */
  void setData(double[] data, boolean redraw, boolean animation);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   */
  void setData(PointOptionsObject[] data, boolean redraw,
      @Nullable AnimationOptionsObject animation);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @param animation
   * When the updated data is the same length as the existing data,
   * points will be updated by default, and animation visualizes how
   * the points are changed. Set false to disable animation, or a
   * configuration object to set duration or easing.
   *
   */
  void setData(PointOptionsObject[] data, boolean redraw, boolean animation);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void setData(String[] data, boolean redraw);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void setData(double[] data, boolean redraw);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   */
  void setData(PointOptionsObject[] data, boolean redraw);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   */
  void setData(String[] data);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   */
  void setData(double[] data);

  /**
   * Apply a new set of data to the series and optionally redraw it. The new
   * data array is passed by reference (except in case of <code>updatePoints</code>), and
   * may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points,
   * or a different amount of points, as handled by the <code>updatePoints</code>
   * parameter.
   *
   * @param data
   * Takes an array of data in the same format as described under
   * <code>series.{type}.data</code> for the given series type, for example a line
   * series would take data in the form described under
   * series.line.data.
   *
   */
  void setData(PointOptionsObject[] data);

  /**
   * Set the state of the series. Called internally on mouse interaction
   * operations, but it can also be called directly to visually highlight a
   * series.
   *
   * @param state
   * The new state, can be either <code>'hover'</code>, <code>'inactive'</code>, <code>'select'</code>,
   * or <code>''</code> (an empty string), <code>'normal'</code> or <code>undefined</code> to set to
   * normal state.
   *
   * @param inherit
   * Determines if state should be inherited by points too.
   *
   */
  void setState(@Nullable SetStateState state, boolean inherit);

  /**
   * Set the state of the series. Called internally on mouse interaction
   * operations, but it can also be called directly to visually highlight a
   * series.
   *
   * @param state
   * The new state, can be either <code>'hover'</code>, <code>'inactive'</code>, <code>'select'</code>,
   * or <code>''</code> (an empty string), <code>'normal'</code> or <code>undefined</code> to set to
   * normal state.
   *
   */
  void setState(@Nullable SetStateState state);

  /**
   * Set the state of the series. Called internally on mouse interaction
   * operations, but it can also be called directly to visually highlight a
   * series.
   *
   */
  void setState();

  /**
   * Show or hide the series.
   *
   * @param visible
   * True to show the series, false to hide. If undefined, the
   * visibility is toggled.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call chart.redraw() after.
   *
   * @fires Highcharts.Series#hide
   * @fires Highcharts.Series#show
   *
   */
  void setVisible(boolean visible, boolean redraw);

  /**
   * Show or hide the series.
   *
   * @param visible
   * True to show the series, false to hide. If undefined, the
   * visibility is toggled.
   *
   * @fires Highcharts.Series#hide
   * @fires Highcharts.Series#show
   *
   */
  void setVisible(boolean visible);

  /**
   * Show or hide the series.
   *
   * @fires Highcharts.Series#hide
   * @fires Highcharts.Series#show
   *
   */
  void setVisible();

  /**
   * Show the series if hidden.
   *
   * @fires Highcharts.Series#show
   *
   */
  void show();

  /**
   * Translate data points from raw data values to chart specific positioning
   * data needed later in the <code>drawPoints</code> and <code>drawGraph</code> functions. This
   * function can be overridden in plugins and custom series type
   * implementations.
   *
   * @fires Highcharts.Series#events:translate
   *
   */
  void translate();

  /**
   * Update the series with a new set of options. For a clean and precise
   * handling of new options, all methods and elements from the series are
   * removed, and it is initialized from scratch. Therefore, this method is
   * more performance expensive than some other utility methods like
   * Series#setData or Series#setVisible.
   *
   * Note that <code>Series.update</code> may mutate the passed <code>data</code> options.
   *
   * @param options
   * New options that will be merged with the series' existing options.
   *
   * @param redraw
   * Whether to redraw the chart after the series is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after.
   *
   * @fires Highcharts.Series#update
   * @fires Highcharts.Series#afterUpdate
   *
   */
  void update(SeriesOptionsRegistry[] options, boolean redraw);

  /**
   * Update the series with a new set of options. For a clean and precise
   * handling of new options, all methods and elements from the series are
   * removed, and it is initialized from scratch. Therefore, this method is
   * more performance expensive than some other utility methods like
   * Series#setData or Series#setVisible.
   *
   * Note that <code>Series.update</code> may mutate the passed <code>data</code> options.
   *
   * @param options
   * New options that will be merged with the series' existing options.
   *
   * @fires Highcharts.Series#update
   * @fires Highcharts.Series#afterUpdate
   *
   */
  void update(SeriesOptionsRegistry[] options);
}
