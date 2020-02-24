package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * The Point object. The point objects are generated from the <code>series.data</code>
 * configuration objects or raw numbers. They can be accessed from the
 * <code>Series.points</code> array. Other ways to instantiate points are through
 * Highcharts.Series#addPoint or Highcharts.Series#setData.
 *
 */
public interface Point extends Any {
  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   * @implspec category: (number|string);
   *
   */
  @JSProperty("category")
  Unknown getCategory();

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   * @implspec category: (number|string);
   *
   */
  @JSProperty("category")
  void setCategory(double value);

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   * @implspec category: (number|string);
   *
   */
  @JSProperty("category")
  void setCategory(String value);

  /**
   * The point's current color.
   *
   * @implspec color: ColorString;
   *
   */
  @JSProperty("color")
  String getColor();

  /**
   * The point's current color.
   *
   * @implspec color: ColorString;
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   * @implspec colorIndex: number;
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   * @implspec colorIndex: number;
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
   * @implspec dataGroup?: SVGElement;
   *
   */
  @JSProperty("dataGroup")
  @Nullable
  SVGElement getDataGroup();

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
   * @implspec dataGroup?: SVGElement;
   *
   */
  @JSProperty("dataGroup")
  void setDataGroup(SVGElement value);

  /**
   * The name of the point. The name can be given as the first position of the
   * point configuration array, or as a <code>name</code> property in the configuration.
   *
   * @implspec name: string;
   *
   */
  @JSProperty("name")
  String getName();

  /**
   * The name of the point. The name can be given as the first position of the
   * point configuration array, or as a <code>name</code> property in the configuration.
   *
   * @implspec name: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * The point's options as applied in the initial configuration, or extended
   * through <code>Point.update</code>.
   *
   * @implspec options: object;
   *
   */
  @JSProperty("options")
  Any getOptions();

  /**
   * The point's options as applied in the initial configuration, or extended
   * through <code>Point.update</code>.
   *
   * @implspec options: object;
   *
   */
  @JSProperty("options")
  void setOptions(Any value);

  /**
   * The percentage for points in a stacked series or pies.
   *
   * @implspec percentage: number;
   *
   */
  @JSProperty("percentage")
  double getPercentage();

  /**
   * The percentage for points in a stacked series or pies.
   *
   * @implspec percentage: number;
   *
   */
  @JSProperty("percentage")
  void setPercentage(double value);

  /**
   * Whether the point is selected or not.
   *
   * @implspec selected: boolean;
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * Whether the point is selected or not.
   *
   * @implspec selected: boolean;
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * The series object associated with the point.
   *
   * @implspec series: Series;
   *
   */
  @JSProperty("series")
  Series getSeries();

  /**
   * The series object associated with the point.
   *
   * @implspec series: Series;
   *
   */
  @JSProperty("series")
  void setSeries(Series value);

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   * @implspec total: number;
   *
   */
  @JSProperty("total")
  double getTotal();

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   * @implspec total: number;
   *
   */
  @JSProperty("total")
  void setTotal(double value);

  /**
   * For certain series types, like pie charts, where individual points can be
   * shown or hidden.
   *
   * @implspec visible: boolean;
   *
   */
  @JSProperty("visible")
  boolean getVisible();

  /**
   * For certain series types, like pie charts, where individual points can be
   * shown or hidden.
   *
   * @implspec visible: boolean;
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * The x value of the point.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * The x value of the point.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * The y value of the point.
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * The y value of the point.
   *
   * @implspec y?: number;
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
   * @implspec getClassName(): string;
   *
   */
  String getClassName();

  /**
   * Return the configuration hash needed for the data label and tooltip
   * formatters.
   *
   * @return Abstract object used in formatters and formats.
   *
   * @implspec getLabelConfig(): PointLabelObject;
   *
   */
  PointLabelObject getLabelConfig();

  /**
   * In a series with <code>zones</code>, return the zone that the point belongs to.
   *
   * @return The zone item.
   *
   * @implspec getZone(): PlotSeriesZonesOptions;
   *
   */
  PlotSeriesZonesOptions getZone();

  /**
   * Get the path definition for the halo, which is usually a shadow-like
   * circle around the currently hovered point.
   *
   * @param size
   * The radius of the circular halo.
   *
   * @return The path definition.
   *
   * @implspec haloPath(size: number): SVGPathArray;
   *
   */
  Array<Unknown> haloPath(double size);

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
   * @implspec init(series: Series, options: (number|object|Array&lt;(number|string)&gt;|null), x?: number): Point;
   *
   */
  Point init(Series series, Any options, double x);

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
   * @implspec init(series: Series, options: (number|object|Array&lt;(number|string)&gt;|null), x?: number): Point;
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
   * @param x
   * Optionally, the X value of the point.
   *
   * @return The Point instance.
   *
   * @fires Highcharts.Point#afterInit
   *
   * @implspec init(series: Series, options: (number|object|Array&lt;(number|string)&gt;|null), x?: number): Point;
   *
   */
  Point init(Series series, Array<Unknown> options, double x);

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
   * @implspec init(series: Series, options: (number|object|Array&lt;(number|string)&gt;|null), x?: number): Point;
   *
   */
  Point init(Series series, Any options);

  /**
   * Runs on mouse out from the point. Called internally from mouse and touch
   * events.
   *
   * @fires Highcharts.Point#mouseOut
   *
   * @implspec onMouseOut(): void;
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
   * @implspec onMouseOver(e: PointerEventObject): void;
   *
   */
  void onMouseOver(PointerEventObject e);

  /**
   * Transform number or array configs into objects. Used internally to unify
   * the different configuration formats for points. For example, a simple
   * number <code>10</code> in a line series will be transformed to <code>{ y: 10 }</code>, and an
   * array config like <code>[1, 10]</code> in a scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   * @implspec optionsToObject(options: (number|object|Array&lt;(number|string)&gt;|null)): object;
   *
   */
  Any optionsToObject(Any options);

  /**
   * Transform number or array configs into objects. Used internally to unify
   * the different configuration formats for points. For example, a simple
   * number <code>10</code> in a line series will be transformed to <code>{ y: 10 }</code>, and an
   * array config like <code>[1, 10]</code> in a scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   * @implspec optionsToObject(options: (number|object|Array&lt;(number|string)&gt;|null)): object;
   *
   */
  Any optionsToObject(Array<Unknown> options);

  /**
   * Transform number or array configs into objects. Used internally to unify
   * the different configuration formats for points. For example, a simple
   * number <code>10</code> in a line series will be transformed to <code>{ y: 10 }</code>, and an
   * array config like <code>[1, 10]</code> in a scatter series will be transformed to <code>{ x: 1, y: 10 }</code>.
   *
   * @param options
   * The input option.
   *
   * @return Transformed options.
   *
   * @implspec optionsToObject(options: (number|object|Array&lt;(number|string)&gt;|null)): object;
   *
   */
  Any optionsToObject(double options);

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
   * @implspec remove(redraw: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void remove(boolean redraw);

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
   * @implspec remove(redraw: boolean, animation?: (boolean|AnimationOptionsObject)): void;
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
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @implspec remove(redraw: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void remove(boolean redraw, AnimationOptionsObject animation);

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Point#select">https://api.highcharts.com/class-reference/Highcharts.Point#select</a>
   *
   * @implspec select(selected?: boolean, accumulate?: boolean): void;
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
   * @param accumulate
   * When <code>true</code>, the selection is added to other selected points. When
   * <code>false</code>, other selected points are deselected. Internally in
   * Highcharts, when allowPointSelect is <code>true</code>, selected points are
   * accumulated on Control, Shift or Cmd clicking the point.
   *
   * @fires Highcharts.Point#select
   * @fires Highcharts.Point#unselect
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Point#select">https://api.highcharts.com/class-reference/Highcharts.Point#select</a>
   *
   * @implspec select(selected?: boolean, accumulate?: boolean): void;
   *
   */
  void select();

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts.Point#select">https://api.highcharts.com/class-reference/Highcharts.Point#select</a>
   *
   * @implspec select(selected?: boolean, accumulate?: boolean): void;
   *
   */
  void select(boolean selected);

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
   * @implspec setNestedProperty(object: any, value: any, key: string): any;
   *
   */
  Any setNestedProperty(Any object, Any value, String key);

  /**
   * Set the point's state.
   *
   * @param state
   * The new state, can be one of <code>''</code> (an empty string), <code>hover</code> or
   * <code>select</code>.
   *
   * @param move
   * State for animation.
   *
   * @fires Highcharts.Point#afterSetState
   *
   * @implspec setState(state?: string, move?: boolean): void;
   *
   */
  void setState();

  /**
   * Set the point's state.
   *
   * @param state
   * The new state, can be one of <code>''</code> (an empty string), <code>hover</code> or
   * <code>select</code>.
   *
   * @param move
   * State for animation.
   *
   * @fires Highcharts.Point#afterSetState
   *
   * @implspec setState(state?: string, move?: boolean): void;
   *
   */
  void setState(String state, boolean move);

  /**
   * Set the point's state.
   *
   * @param state
   * The new state, can be one of <code>''</code> (an empty string), <code>hover</code> or
   * <code>select</code>.
   *
   * @param move
   * State for animation.
   *
   * @fires Highcharts.Point#afterSetState
   *
   * @implspec setState(state?: string, move?: boolean): void;
   *
   */
  void setState(String state);

  /**
   * Extendable method for formatting each point's tooltip line.
   *
   * @param pointFormat
   * The point format.
   *
   * @return A string to be concatenated in to the common tooltip text.
   *
   * @implspec tooltipFormatter(pointFormat: string): string;
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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Any options, boolean redraw, AnimationOptionsObject animation);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Any options, boolean redraw);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Array<Unknown> options, boolean redraw, AnimationOptionsObject animation);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(double options, boolean redraw, AnimationOptionsObject animation);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Any options, boolean redraw, boolean animation);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Array<Unknown> options, boolean redraw, boolean animation);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
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
   * @param animation
   * Whether to apply animation, and optionally animation
   * configuration.
   *
   * @fires Highcharts.Point#update
   *
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Any options);

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
   * @implspec update(options: (number|object|Array&lt;(number|string)&gt;|null), redraw?: boolean, animation?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void update(Array<Unknown> options, boolean redraw);
}
