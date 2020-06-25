package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The Point object. The point objects are generated from the <code>series.data</code>
 * configuration objects or raw numbers. They can be accessed from the
 * <code>Series.points</code> array. Other ways to instantiate points are through
 * Highcharts.Series#addPoint or Highcharts.Series#setData.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Point extends Any {
  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   */
  @JSProperty("category")
  String getCategory();

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   */
  @JSProperty("category")
  void setCategory(String value);

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highstock) Highstock only. If a point object is created by data
   * grouping, it doesn't reflect actual points in the raw data. In this case,
   * the <code>dataGroup</code> property holds information that points back to the raw
   * data.
   *
   * <ul>
   * <li>
   * <code>dataGroup.start</code> is the index of the first raw data point in the
   * group.
   *
   * </li>
   * <li>
   * <code>dataGroup.length</code> is the amount of points in the group.
   *
   * </li>
   * </ul>
   */
  @JSProperty("dataGroup")
  @Nullable
  DataGroupingInfoObject getDataGroup();

  /**
   * (Highstock) Highstock only. If a point object is created by data
   * grouping, it doesn't reflect actual points in the raw data. In this case,
   * the <code>dataGroup</code> property holds information that points back to the raw
   * data.
   *
   * <ul>
   * <li>
   * <code>dataGroup.start</code> is the index of the first raw data point in the
   * group.
   *
   * </li>
   * <li>
   * <code>dataGroup.length</code> is the amount of points in the group.
   *
   * </li>
   * </ul>
   */
  @JSProperty("dataGroup")
  void setDataGroup(@Nullable DataGroupingInfoObject value);

  /**
   * Contains the point's index in the <code>Series.points</code> array.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * The name of the point. The name can be given as the first position of the
   * point configuration array, or as a <code>name</code> property in the configuration:
   *
   */
  @JSProperty("name")
  String getName();

  /**
   * The name of the point. The name can be given as the first position of the
   * point configuration array, or as a <code>name</code> property in the configuration:
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * The point's options as applied in the initial configuration, or extended
   * through <code>Point.update</code>.
   *
   * In TypeScript you have to extend <code>PointOptionsObject</code> via an additional
   * interface to allow custom data options: (see online documentation for
   * example)
   *
   */
  @JSProperty("options")
  PointOptionsObject getOptions();

  /**
   * The point's options as applied in the initial configuration, or extended
   * through <code>Point.update</code>.
   *
   * In TypeScript you have to extend <code>PointOptionsObject</code> via an additional
   * interface to allow custom data options: (see online documentation for
   * example)
   *
   */
  @JSProperty("options")
  void setOptions(PointOptionsObject value);

  /**
   * The percentage for points in a stacked series or pies.
   *
   */
  @JSProperty("percentage")
  double getPercentage();

  /**
   * The percentage for points in a stacked series or pies.
   *
   */
  @JSProperty("percentage")
  void setPercentage(double value);

  /**
   * Whether the point is selected or not.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * Whether the point is selected or not.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * The series object associated with the point.
   *
   */
  @JSProperty("series")
  Series getSeries();

  /**
   * The series object associated with the point.
   *
   */
  @JSProperty("series")
  void setSeries(Series value);

  /**
   * Pie series only. Whether to display a slice offset from the center.
   *
   */
  @JSProperty("sliced")
  boolean getSliced();

  /**
   * Pie series only. Whether to display a slice offset from the center.
   *
   */
  @JSProperty("sliced")
  void setSliced(boolean value);

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   */
  @JSProperty("total")
  double getTotal();

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   */
  @JSProperty("total")
  void setTotal(double value);

  /**
   * For certain series types, like pie charts, where individual points can be
   * shown or hidden.
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * For certain series types, like pie charts, where individual points can be
   * shown or hidden.
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * The x value of the point.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * The x value of the point.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * The y value of the point.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * The y value of the point.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * Get the CSS class names for individual points. Used internally where the
   * returned value is set on every point.
   *
   * @return The class names.
   *
   */
  String getClassName();

  /**
   * Return the configuration hash needed for the data label and tooltip
   * formatters.
   *
   * @return Abstract object used in formatters and formats.
   *
   */
  PointLabelObject getLabelConfig();

  /**
   * In a series with <code>zones</code>, return the zone that the point belongs to.
   *
   * @return The zone item.
   *
   */
  SeriesZonesOptionsObject getZone();

  /**
   * Get the path definition for the halo, which is usually a shadow-like
   * circle around the currently hovered point.
   *
   * @param size
   * The radius of the circular halo.
   *
   * @return The path definition.
   *
   */
  Unknown /* SVGPathArray */ haloPath(double size);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @param x
   * Optionally, the X value of the point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, String[] options, double x);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @param x
   * Optionally, the X value of the point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, double[] options, double x);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @param x
   * Optionally, the X value of the point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, @Nullable PointOptionsObject options, double x);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @param x
   * Optionally, the X value of the point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, @Nullable String options, double x);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @param x
   * Optionally, the X value of the point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, double options, double x);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, String[] options);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, double[] options);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, @Nullable PointOptionsObject options);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, @Nullable String options);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @param options
   * The data in either number, array or object format.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series, double options);

  /**
   * Initialize the point. Called internally based on the <code>series.data</code>
   * option.
   *
   * @param series
   * The series object containing this point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   */
  Point init(Series series);

  /**
   * Runs on mouse out from the point. Called internally from mouse and touch
   * events.
   *
   * @fires Highcharts.Point#mouseOut
   *
   */
  void onMouseOut();

  /**
   * Runs on mouse over the point. Called internally from mouse and touch
   * events.
   *
   * @param e
   * The event arguments.
   *
   */
  void onMouseOver(@Nullable PointerEventObject e);

  /**
   * Runs on mouse over the point. Called internally from mouse and touch
   * events.
   *
   */
  void onMouseOver();

  /**
   * Transform number or array configs into objects. Also called for object
   * configs. Used internally to unify the different configuration formats for
   * points. For example, a simple number <code>10</code> in a line series will be
   * transformed to <code>{ y: 10 }</code>, and an array config like <code>[1, 10]</code> in a
   * scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   */
  Dictionary<Any> optionsToObject(String[] options);

  /**
   * Transform number or array configs into objects. Also called for object
   * configs. Used internally to unify the different configuration formats for
   * points. For example, a simple number <code>10</code> in a line series will be
   * transformed to <code>{ y: 10 }</code>, and an array config like <code>[1, 10]</code> in a
   * scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   */
  Dictionary<Any> optionsToObject(double[] options);

  /**
   * Transform number or array configs into objects. Also called for object
   * configs. Used internally to unify the different configuration formats for
   * points. For example, a simple number <code>10</code> in a line series will be
   * transformed to <code>{ y: 10 }</code>, and an array config like <code>[1, 10]</code> in a
   * scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   */
  Dictionary<Any> optionsToObject(@Nullable PointOptionsObject options);

  /**
   * Transform number or array configs into objects. Also called for object
   * configs. Used internally to unify the different configuration formats for
   * points. For example, a simple number <code>10</code> in a line series will be
   * transformed to <code>{ y: 10 }</code>, and an array config like <code>[1, 10]</code> in a
   * scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   */
  Dictionary<Any> optionsToObject(@Nullable String options);

  /**
   * Transform number or array configs into objects. Also called for object
   * configs. Used internally to unify the different configuration formats for
   * points. For example, a simple number <code>10</code> in a line series will be
   * transformed to <code>{ y: 10 }</code>, and an array config like <code>[1, 10]</code> in a
   * scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   */
  Dictionary<Any> optionsToObject(double options);

  /**
   * Transform number or array configs into objects. Also called for object
   * configs. Used internally to unify the different configuration formats for
   * points. For example, a simple number <code>10</code> in a line series will be
   * transformed to <code>{ y: 10 }</code>, and an array config like <code>[1, 10]</code> in a
   * scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @return Transformed options.
   *
   */
  Dictionary<Any> optionsToObject();

  /**
   * Remove a point and optionally redraw the series and if necessary the axes
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call. When
   * doing more operations on the chart, for example running
   * <code>point.remove()</code> in a loop, it is best practice to set <code>redraw</code> to
   * false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   */
  void remove(boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Remove a point and optionally redraw the series and if necessary the axes
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call. When
   * doing more operations on the chart, for example running
   * <code>point.remove()</code> in a loop, it is best practice to set <code>redraw</code> to
   * false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   */
  void remove(boolean redraw, boolean animation);

  /**
   * Remove a point and optionally redraw the series and if necessary the axes
   *
   * @param redraw
   * Whether to redraw the chart or wait for an explicit call. When
   * doing more operations on the chart, for example running
   * <code>point.remove()</code> in a loop, it is best practice to set <code>redraw</code> to
   * false and call <code>chart.redraw()</code> after.
   *
   */
  void remove(boolean redraw);

  /**
   * Remove a point and optionally redraw the series and if necessary the axes
   *
   */
  void remove();

  /**
   * Toggle the selection status of a point.
   *
   * @param selected
   * When <code>true</code>, the point is selected. When <code>false</code>, the point is
   * unselected. When <code>null</code> or <code>undefined</code>, the selection state is
   * toggled.
   *
   * @param accumulate
   * When <code>true</code>, the selection is added to other selected points. When
   * <code>false</code>, other selected points are deselected. Internally in
   * Highcharts, when allowPointSelect is <code>true</code>, selected points are
   * accumulated on Control, Shift or Cmd clicking the point.
   *
   * @fires Highcharts.Point#select
   * @fires Highcharts.Point#unselect
   *
   */
  void select(boolean selected, boolean accumulate);

  /**
   * Toggle the selection status of a point.
   *
   * @param selected
   * When <code>true</code>, the point is selected. When <code>false</code>, the point is
   * unselected. When <code>null</code> or <code>undefined</code>, the selection state is
   * toggled.
   *
   * @fires Highcharts.Point#select
   * @fires Highcharts.Point#unselect
   *
   */
  void select(boolean selected);

  /**
   * Toggle the selection status of a point.
   *
   * @fires Highcharts.Point#select
   * @fires Highcharts.Point#unselect
   *
   */
  void select();

  /**
   * Set a value in an object, on the property defined by key. The key
   * supports nested properties using dot notation. The function modifies the
   * input object and does not make a copy.
   *
   * @param object
   * The object to set the value on.
   *
   * @param value
   * The value to set.
   *
   * @param key
   * Key to the property to set.
   *
   * @return The modified object.
   *
   */
  <T extends Any> T setNestedProperty(T object, Any value, String key);

  /**
   * Set the point's state.
   *
   * @param state
   * The new state, can be one of <code>'hover'</code>, <code>'select'</code>, <code>'inactive'</code>,
   * or <code>''</code> (an empty string), <code>'normal'</code> or <code>undefined</code> to set to
   * normal state.
   *
   * @param move
   * State for animation.
   *
   * @fires Highcharts.Point#afterSetState
   *
   */
  void setState(@Nullable SetStateState state, boolean move);

  /**
   * Set the point's state.
   *
   * @param state
   * The new state, can be one of <code>'hover'</code>, <code>'select'</code>, <code>'inactive'</code>,
   * or <code>''</code> (an empty string), <code>'normal'</code> or <code>undefined</code> to set to
   * normal state.
   *
   * @fires Highcharts.Point#afterSetState
   *
   */
  void setState(@Nullable SetStateState state);

  /**
   * Set the point's state.
   *
   * @fires Highcharts.Point#afterSetState
   *
   */
  void setState();

  /**
   * Extendable method for formatting each point's tooltip line.
   *
   * @param pointFormat
   * The point format.
   *
   * @return A string to be concatenated in to the common tooltip text.
   *
   */
  String tooltipFormatter(String pointFormat);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(String[] options, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(String[] options, boolean redraw, boolean animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double[] options, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double[] options, boolean redraw, boolean animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable PointOptionsObject options, boolean redraw,
      @Nullable AnimationOptionsObject animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable PointOptionsObject options, boolean redraw, boolean animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable String options, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable String options, boolean redraw, boolean animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double options, boolean redraw, @Nullable AnimationOptionsObject animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double options, boolean redraw, boolean animation);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(String[] options, boolean redraw);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double[] options, boolean redraw);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable PointOptionsObject options, boolean redraw);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable String options, boolean redraw);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @param redraw
   * Whether to redraw the chart after the point is updated. If doing
   * more operations on the chart, it is best practice to set <code>redraw</code>
   * to false and call <code>chart.redraw()</code> after.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double options, boolean redraw);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(String[] options);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double[] options);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable PointOptionsObject options);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(@Nullable String options);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @param options
   * The point options. Point options are handled as described under
   * the <code>series.type.data</code> item for each series type. For example for
   * a line series, if options is a single number, the point will be
   * given that number as the marin y value. If it is an array, it will
   * be interpreted as x and y values respectively. If it is an object,
   * advanced options are applied.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update(double options);

  /**
   * Update point with new options (typically x/y data) and optionally redraw
   * the series.
   *
   * @fires Highcharts.Point#update
   *
   */
  void update();

  abstract class HaloPathResult extends JsEnum {
    public static final HaloPathResult A = JsEnum.of("a");

    public static final HaloPathResult C = JsEnum.of("c");

    public static final HaloPathResult H = JsEnum.of("h");

    public static final HaloPathResult L = JsEnum.of("l");

    public static final HaloPathResult M = JsEnum.of("m");

    public static final HaloPathResult Q = JsEnum.of("q");

    public static final HaloPathResult S = JsEnum.of("s");

    public static final HaloPathResult T = JsEnum.of("t");

    public static final HaloPathResult V = JsEnum.of("v");

    public static final HaloPathResult Z = JsEnum.of("z");

    public static final HaloPathResult CAPITAL_A = JsEnum.of("A");

    public static final HaloPathResult CAPITAL_C = JsEnum.of("C");

    public static final HaloPathResult CAPITAL_H = JsEnum.of("H");

    public static final HaloPathResult CAPITAL_L = JsEnum.of("L");

    public static final HaloPathResult CAPITAL_M = JsEnum.of("M");

    public static final HaloPathResult CAPITAL_Q = JsEnum.of("Q");

    public static final HaloPathResult CAPITAL_S = JsEnum.of("S");

    public static final HaloPathResult CAPITAL_T = JsEnum.of("T");

    public static final HaloPathResult CAPITAL_V = JsEnum.of("V");

    public static final HaloPathResult CAPITAL_Z = JsEnum.of("Z");
  }
}
