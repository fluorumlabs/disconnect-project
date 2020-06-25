package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* string */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that appears
 * when the user hovers over a series or point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TooltipOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable animation of
   * the tooltip.
   *
   */
  @JSProperty("animation")
  boolean getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable animation of
   * the tooltip.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
   * When <code>undefined</code>, the border takes the color of the corresponding series
   * or point.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
   * When <code>undefined</code>, the border takes the color of the corresponding series
   * or point.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
   * When <code>undefined</code>, the border takes the color of the corresponding series
   * or point.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
   * When <code>undefined</code>, the border takes the color of the corresponding series
   * or point.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The radius of the rounded border
   * corners.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The radius of the rounded border
   * corners.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the tooltip
   * border.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the tooltip
   * border.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highstock) How many decimals to show for the <code>point.change</code> value when
   * the <code>series.compare</code> option is set. This is overridable in each series'
   * tooltip options object. The default is to preserve all decimals.
   *
   */
  @JSProperty("changeDecimals")
  double getChangeDecimals();

  /**
   * (Highstock) How many decimals to show for the <code>point.change</code> value when
   * the <code>series.compare</code> option is set. This is overridable in each series'
   * tooltip options object. The default is to preserve all decimals.
   *
   */
  @JSProperty("changeDecimals")
  void setChangeDecimals(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
   * tooltip's container div, allowing unique CSS styling for each chart.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
   * tooltip's container div, allowing unique CSS styling for each chart.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the cluster point's
   * in the tooltip. Works only with marker-clusters module and analogously to
   * pointFormat.
   *
   * The cluster tooltip can be also formatted using <code>tooltip.formatter</code>
   * callback function and <code>point.isCluster</code> flag.
   *
   */
  @JSProperty("clusterFormat")
  @Nullable
  Any getClusterFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the cluster point's
   * in the tooltip. Works only with marker-clusters module and analogously to
   * pointFormat.
   *
   * The cluster tooltip can be also formatted using <code>tooltip.formatter</code>
   * callback function and <code>point.isCluster</code> flag.
   *
   */
  @JSProperty("clusterFormat")
  void setClusterFormat(@Nullable Any value);

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  Dictionary<Unknown /* string */> getDateTimeLabelFormats();

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(@Nullable Dictionary<Unknown /* string */> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Distance from point to tooltip
   * in pixels.
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Distance from point to tooltip
   * in pixels.
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the tooltip.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the tooltip.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
   * follow the mouse as it moves across columns, pie slices and other point
   * types with an extent. By default it behaves this way for pie, polygon,
   * map, sankey and wordcloud series by override in the <code>plotOptions</code> for
   * those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   */
  @JSProperty("followPointer")
  boolean getFollowPointer();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
   * follow the mouse as it moves across columns, pie slices and other point
   * types with an extent. By default it behaves this way for pie, polygon,
   * map, sankey and wordcloud series by override in the <code>plotOptions</code> for
   * those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   */
  @JSProperty("followPointer")
  void setFollowPointer(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
   * update as the finger moves on a touch device. If this is <code>true</code> and
   * chart.panning is set,<code>followTouchMove</code> will take over one-finger touches,
   * so the user needs to use two fingers for zooming and panning.
   *
   * Note the difference to followPointer that only defines the <em>position</em> of
   * the tooltip. If <code>followPointer</code> is false in for example a column series,
   * the tooltip will show above or below the column, but as <code>followTouchMove</code>
   * is true, the tooltip will jump from column to column as the user swipes
   * across the plot area.
   *
   */
  @JSProperty("followTouchMove")
  boolean getFollowTouchMove();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
   * update as the finger moves on a touch device. If this is <code>true</code> and
   * chart.panning is set,<code>followTouchMove</code> will take over one-finger touches,
   * so the user needs to use two fingers for zooming and panning.
   *
   * Note the difference to followPointer that only defines the <em>position</em> of
   * the tooltip. If <code>followPointer</code> is false in for example a column series,
   * the tooltip will show above or below the column, but as <code>followTouchMove</code>
   * is true, the tooltip will jump from column to column as the user swipes
   * across the plot area.
   *
   */
  @JSProperty("followTouchMove")
  void setFollowTouchMove(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A string to append to the
   * tooltip format.
   *
   */
  @JSProperty("footerFormat")
  @Nullable
  String getFooterFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A string to append to the
   * tooltip format.
   *
   */
  @JSProperty("footerFormat")
  void setFooterFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
   * text of the tooltip from scratch. In case of single or shared tooltips, a
   * string should be returned. In case of split tooltips, it should return an
   * array where the first item is the header, and subsequent items are mapped
   * to the points. Return <code>false</code> to disable tooltip for a specific point on
   * series.
   *
   * A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of the
   * tooltip is parsed and converted to SVG, therefore this isn't a complete
   * HTML renderer. The following HTML tags are supported: <code>b</code>, <code>br</code>, <code>em</code>,
   * <code>i</code>, <code>span</code>, <code>strong</code>. Spans can be styled with a <code>style</code> attribute, but
   * only text-related CSS, that is shared with SVG, is handled.
   *
   * The available data in the formatter differ a bit depending on whether the
   * tooltip is shared or split, or belongs to a single point. In a
   * shared/split tooltip, all properties except <code>x</code>, which is common for all
   * points, are kept in an array, <code>this.points</code>.
   *
   * Available data are:
   *
   * <ul>
   * <li>
   * <strong>this.percentage (not shared) /</strong> <strong>this.points[i].percentage
   * (shared)</strong>: Stacked series and pies only. The point's percentage of the
   * total.
   *
   * </li>
   * <li>
   * <strong>this.point (not shared) / this.points[i].point (shared)</strong>: The point
   * object. The point name, if defined, is available through
   * <code>this.point.name</code>.
   *
   * </li>
   * <li>
   * <strong>this.points</strong>: In a shared tooltip, this is an array containing all
   * other properties for each point.
   *
   * </li>
   * <li>
   * <strong>this.series (not shared) / this.points[i].series (shared)</strong>: The
   * series object. The series name is available through <code>this.series.name</code>.
   *
   * </li>
   * <li>
   * <strong>this.total (not shared) / this.points[i].total (shared)</strong>: Stacked
   * series only. The total value at this point's x value.
   *
   * </li>
   * <li>
   * <strong>this.x</strong>: The x value. This property is the same regardless of the
   * tooltip being shared or not.
   *
   * </li>
   * <li>
   * <strong>this.y (not shared) / this.points[i].y (shared)</strong>: The y value.
   *
   * </li>
   * </ul>
   */
  @JSProperty("formatter")
  @Nullable
  TooltipFormatterCallbackFunction getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
   * text of the tooltip from scratch. In case of single or shared tooltips, a
   * string should be returned. In case of split tooltips, it should return an
   * array where the first item is the header, and subsequent items are mapped
   * to the points. Return <code>false</code> to disable tooltip for a specific point on
   * series.
   *
   * A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of the
   * tooltip is parsed and converted to SVG, therefore this isn't a complete
   * HTML renderer. The following HTML tags are supported: <code>b</code>, <code>br</code>, <code>em</code>,
   * <code>i</code>, <code>span</code>, <code>strong</code>. Spans can be styled with a <code>style</code> attribute, but
   * only text-related CSS, that is shared with SVG, is handled.
   *
   * The available data in the formatter differ a bit depending on whether the
   * tooltip is shared or split, or belongs to a single point. In a
   * shared/split tooltip, all properties except <code>x</code>, which is common for all
   * points, are kept in an array, <code>this.points</code>.
   *
   * Available data are:
   *
   * <ul>
   * <li>
   * <strong>this.percentage (not shared) /</strong> <strong>this.points[i].percentage
   * (shared)</strong>: Stacked series and pies only. The point's percentage of the
   * total.
   *
   * </li>
   * <li>
   * <strong>this.point (not shared) / this.points[i].point (shared)</strong>: The point
   * object. The point name, if defined, is available through
   * <code>this.point.name</code>.
   *
   * </li>
   * <li>
   * <strong>this.points</strong>: In a shared tooltip, this is an array containing all
   * other properties for each point.
   *
   * </li>
   * <li>
   * <strong>this.series (not shared) / this.points[i].series (shared)</strong>: The
   * series object. The series name is available through <code>this.series.name</code>.
   *
   * </li>
   * <li>
   * <strong>this.total (not shared) / this.points[i].total (shared)</strong>: Stacked
   * series only. The total value at this point's x value.
   *
   * </li>
   * <li>
   * <strong>this.x</strong>: The x value. This property is the same regardless of the
   * tooltip being shared or not.
   *
   * </li>
   * <li>
   * <strong>this.y (not shared) / this.points[i].y (shared)</strong>: The y value.
   *
   * </li>
   * </ul>
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable TooltipFormatterCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the tooltip header
   * line. Variables are enclosed by curly brackets. Available variables are
   * <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the
   * <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the
   * category name, x value or datetime string depending on the type of axis.
   * For datetime axes, the <code>point.key</code> date format can be set using
   * <code>tooltip.xDateFormat</code>.
   *
   */
  @JSProperty("headerFormat")
  @Nullable
  String getHeaderFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the tooltip header
   * line. Variables are enclosed by curly brackets. Available variables are
   * <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the
   * <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the
   * category name, x value or datetime string depending on the type of axis.
   * For datetime axes, the <code>point.key</code> date format can be set using
   * <code>tooltip.xDateFormat</code>.
   *
   */
  @JSProperty("headerFormat")
  void setHeaderFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the tooltip header. Applies only when tooltip.split is
   * enabled.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
   * series.marker.symbol.
   *
   */
  @JSProperty("headerShape")
  @Nullable
  HeaderShape getHeaderShape();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the tooltip header. Applies only when tooltip.split is
   * enabled.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
   * series.marker.symbol.
   *
   */
  @JSProperty("headerShape")
  void setHeaderShape(@Nullable HeaderShape value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The number of milliseconds to
   * wait until the tooltip is hidden when mouse out from a point or chart.
   *
   */
  @JSProperty("hideDelay")
  double getHideDelay();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The number of milliseconds to
   * wait until the tooltip is hidden when mouse out from a point or chart.
   *
   */
  @JSProperty("hideDelay")
  void setHideDelay(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the null point's
   * line in the tooltip. Works analogously to pointFormat.
   *
   */
  @JSProperty("nullFormat")
  @Nullable
  String getNullFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the null point's
   * line in the tooltip. Works analogously to pointFormat.
   *
   */
  @JSProperty("nullFormat")
  void setNullFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
   * text of the tooltip for visible null points. Works analogously to
   * formatter.
   *
   */
  @JSProperty("nullFormatter")
  @Nullable
  TooltipFormatterCallbackFunction getNullFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
   * text of the tooltip for visible null points. Works analogously to
   * formatter.
   *
   */
  @JSProperty("nullFormatter")
  void setNullFormatter(@Nullable TooltipFormatterCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the tooltip to
   * render outside the chart's SVG element box. By default (<code>false</code>), the
   * tooltip is rendered within the chart's SVG element, which results in the
   * tooltip being aligned inside the chart area. For small charts, this may
   * result in clipping or overlapping. When <code>true</code>, a separate SVG element is
   * created and overlaid on the page, allowing the tooltip to be aligned
   * inside the page itself.
   *
   * Defaults to <code>true</code> if <code>chart.scrollablePlotArea</code> is activated, otherwise
   * <code>false</code>.
   *
   */
  @JSProperty("outside")
  boolean getOutside();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the tooltip to
   * render outside the chart's SVG element box. By default (<code>false</code>), the
   * tooltip is rendered within the chart's SVG element, which results in the
   * tooltip being aligned inside the chart area. For small charts, this may
   * result in clipping or overlapping. When <code>true</code>, a separate SVG element is
   * created and overlaid on the page, allowing the tooltip to be aligned
   * inside the page itself.
   *
   * Defaults to <code>true</code> if <code>chart.scrollablePlotArea</code> is activated, otherwise
   * <code>false</code>.
   *
   */
  @JSProperty("outside")
  void setOutside(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Padding inside the tooltip, in
   * pixels.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Padding inside the tooltip, in
   * pixels.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the point's line in
   * the tooltip. Variables are enclosed by curly brackets. Available
   * variables are point.x, point.y, series. name and series.color and other
   * properties on the same form. Furthermore, <code>point.y</code> can be extended by
   * the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can
   * also be overridden for each series, which makes it a good hook for
   * displaying units.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   */
  @JSProperty("pointFormat")
  @Nullable
  String getPointFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the point's line in
   * the tooltip. Variables are enclosed by curly brackets. Available
   * variables are point.x, point.y, series. name and series.color and other
   * properties on the same form. Furthermore, <code>point.y</code> can be extended by
   * the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can
   * also be overridden for each series, which makes it a good hook for
   * displaying units.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   */
  @JSProperty("pointFormat")
  void setPointFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function for
   * formatting the HTML output for a single point in the tooltip. Like the
   * <code>pointFormat</code> string, but with more flexibility.
   *
   */
  @JSProperty("pointFormatter")
  @Nullable
  FormatterCallbackFunction<Point> getPointFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function for
   * formatting the HTML output for a single point in the tooltip. Like the
   * <code>pointFormat</code> string, but with more flexibility.
   *
   */
  @JSProperty("pointFormatter")
  void setPointFormatter(@Nullable FormatterCallbackFunction<Point> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to place the
   * tooltip in a default position. The callback receives three parameters:
   * <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for
   * <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot
   * area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full
   * coordinates.
   *
   * Since v7, when tooltip.split option is enabled, positioner is called for
   * each of the boxes separately, including xAxis header. xAxis header is not
   * a point, instead <code>point</code> argument contains info: <code>{ plotX: Number, plotY: Number, isHeader: Boolean }</code>
   *
   * The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.
   *
   */
  @JSProperty("positioner")
  @Nullable
  TooltipPositionerCallbackFunction getPositioner();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to place the
   * tooltip in a default position. The callback receives three parameters:
   * <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for
   * <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot
   * area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full
   * coordinates.
   *
   * Since v7, when tooltip.split option is enabled, positioner is called for
   * each of the boxes separately, including xAxis header. xAxis header is not
   * a point, instead <code>point</code> argument contains info: <code>{ plotX: Number, plotY: Number, isHeader: Boolean }</code>
   *
   * The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.
   *
   */
  @JSProperty("positioner")
  void setPositioner(@Nullable TooltipPositionerCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the tooltip.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the tooltip.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the tooltip.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the tooltip. Can be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code>, or
   * <code>&quot;square&quot;</code>. When tooltip.split option is enabled, shape is applied to all
   * boxes except header, which is controlled by tooltip.headerShape.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
   * series.marker.symbol.
   *
   */
  @JSProperty("shape")
  @Nullable
  Shape getShape();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the tooltip. Can be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code>, or
   * <code>&quot;square&quot;</code>. When tooltip.split option is enabled, shape is applied to all
   * boxes except header, which is controlled by tooltip.headerShape.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
   * series.marker.symbol.
   *
   */
  @JSProperty("shape")
  void setShape(@Nullable Shape value);

  /**
   * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
   * will capture mouse movement or touch events. Tooltip texts for series
   * types with ordered data (not pie, scatter, flags etc) will be shown in a
   * single bubble. This is recommended for single series charts and for
   * tablet/mobile optimized charts.
   *
   * See also tooltip.split, that is better suited for charts with many
   * series, especially line-type series. The <code>tooltip.split</code> option takes
   * precedence over <code>tooltip.shared</code>.
   *
   */
  @JSProperty("shared")
  boolean getShared();

  /**
   * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
   * will capture mouse movement or touch events. Tooltip texts for series
   * types with ordered data (not pie, scatter, flags etc) will be shown in a
   * single bubble. This is recommended for single series charts and for
   * tablet/mobile optimized charts.
   *
   * See also tooltip.split, that is better suited for charts with many
   * series, especially line-type series. The <code>tooltip.split</code> option takes
   * precedence over <code>tooltip.shared</code>.
   *
   */
  @JSProperty("shared")
  void setShared(boolean value);

  /**
   * (Highcharts, Highstock) Proximity snap for graphs or single points. It
   * defaults to 10 for mouse-powered devices and 25 for touch devices.
   *
   * Note that in most cases the whole plot area captures the mouse movement,
   * and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when
   * stickyTracking is <code>true</code> (default) and when the tooltip is shared or
   * split.
   *
   */
  @JSProperty("snap")
  double getSnap();

  /**
   * (Highcharts, Highstock) Proximity snap for graphs or single points. It
   * defaults to 10 for mouse-powered devices and 25 for touch devices.
   *
   * Note that in most cases the whole plot area captures the mouse movement,
   * and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when
   * stickyTracking is <code>true</code> (default) and when the tooltip is shared or
   * split.
   *
   */
  @JSProperty("snap")
  void setSnap(double value);

  /**
   * (Highcharts, Highstock) Split the tooltip into one label per series, with
   * the header close to the axis. This is recommended over shared tooltips
   * for charts with multiple line series, generally making them easier to
   * read. This option takes precedence over <code>tooltip.shared</code>.
   *
   */
  @JSProperty("split")
  boolean getSplit();

  /**
   * (Highcharts, Highstock) Split the tooltip into one label per series, with
   * the header close to the axis. This is recommended over shared tooltips
   * for charts with multiple line series, generally making them easier to
   * read. This option takes precedence over <code>tooltip.shared</code>.
   *
   */
  @JSProperty("split")
  void setSplit(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Prevents the tooltip from
   * switching or closing, when touched or pointed.
   *
   */
  @JSProperty("stickOnContact")
  boolean getStickOnContact();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Prevents the tooltip from
   * switching or closing, when touched or pointed.
   *
   */
  @JSProperty("stickOnContact")
  void setStickOnContact(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the tooltip. The
   * tooltip can also be styled through the CSS class <code>.highcharts-tooltip</code>.
   *
   * Note that the default <code>pointerEvents</code> style makes the tooltip ignore
   * mouse events, so in order to use clickable tooltips, this value must be
   * set to <code>auto</code>.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the tooltip. The
   * tooltip can also be styled through the CSS class <code>.highcharts-tooltip</code>.
   *
   * Note that the default <code>pointerEvents</code> style makes the tooltip ignore
   * mouse events, so in order to use clickable tooltips, this value must be
   * set to <code>auto</code>.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Use HTML to render the contents
   * of the tooltip instead of SVG. Using HTML allows advanced formatting like
   * tables and images in the tooltip. It is also recommended for rtl
   * languages as it works around rtl bugs in early Firefox.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Use HTML to render the contents
   * of the tooltip instead of SVG. Using HTML allows advanced formatting like
   * tables and images in the tooltip. It is also recommended for rtl
   * languages as it works around rtl bugs in early Firefox.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How many decimals to show in
   * each series' y value. This is overridable in each series' tooltip options
   * object. The default is to preserve all decimals.
   *
   */
  @JSProperty("valueDecimals")
  double getValueDecimals();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How many decimals to show in
   * each series' y value. This is overridable in each series' tooltip options
   * object. The default is to preserve all decimals.
   *
   */
  @JSProperty("valueDecimals")
  void setValueDecimals(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A string to prepend to each
   * series' y value. Overridable in each series' tooltip options object.
   *
   */
  @JSProperty("valuePrefix")
  @Nullable
  String getValuePrefix();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A string to prepend to each
   * series' y value. Overridable in each series' tooltip options object.
   *
   */
  @JSProperty("valuePrefix")
  void setValuePrefix(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A string to append to each
   * series' y value. Overridable in each series' tooltip options object.
   *
   */
  @JSProperty("valueSuffix")
  @Nullable
  String getValueSuffix();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A string to append to each
   * series' y value. Overridable in each series' tooltip options object.
   *
   */
  @JSProperty("valueSuffix")
  void setValueSuffix(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
   * header if the X axis is a datetime axis. The default is a best guess
   * based on the smallest distance between points in the chart.
   *
   */
  @JSProperty("xDateFormat")
  @Nullable
  String getXDateFormat();

  /**
   * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
   * header if the X axis is a datetime axis. The default is a best guess
   * based on the smallest distance between points in the chart.
   *
   */
  @JSProperty("xDateFormat")
  void setXDateFormat(@Nullable String value);

  abstract class HeaderShape extends JsEnum {
    public static final HeaderShape CALLOUT = JsEnum.of("callout");

    public static final HeaderShape SQUARE = JsEnum.of("square");
  }

  abstract class Shape extends JsEnum {
    public static final Shape CALLOUT = JsEnum.of("callout");

    public static final Shape CIRCLE = JsEnum.of("circle");

    public static final Shape SQUARE = JsEnum.of("square");
  }

  class Builder {
    private final TooltipOptions object = Any.empty();

    public TooltipOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable animation of
     * the tooltip.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the tooltip.
     *
     * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
     * class.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the tooltip.
     *
     * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
     * class.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the tooltip.
     *
     * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
     * class.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
     * When <code>undefined</code>, the border takes the color of the corresponding series
     * or point.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
     * When <code>undefined</code>, the border takes the color of the corresponding series
     * or point.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
     * When <code>undefined</code>, the border takes the color of the corresponding series
     * or point.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The radius of the rounded border
     * corners.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the tooltip
     * border.
     *
     * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
     * class.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highstock) How many decimals to show for the <code>point.change</code> value when
     * the <code>series.compare</code> option is set. This is overridable in each series'
     * tooltip options object. The default is to preserve all decimals.
     *
     */
    public Builder changeDecimals(double value) {
      object.setChangeDecimals(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
     * tooltip's container div, allowing unique CSS styling for each chart.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the cluster point's
     * in the tooltip. Works only with marker-clusters module and analogously to
     * pointFormat.
     *
     * The cluster tooltip can be also formatted using <code>tooltip.formatter</code>
     * callback function and <code>point.isCluster</code> flag.
     *
     */
    public Builder clusterFormat(@Nullable Any value) {
      object.setClusterFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
     * format in the tooltip's header will by default be guessed based on the
     * closest data points. This member gives the default string representations
     * used for each unit. For an overview of the replacement codes, see
     * dateFormat.
     *
     */
    public Builder dateTimeLabelFormats(@Nullable Dictionary<Unknown /* string */> value) {
      object.setDateTimeLabelFormats(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Distance from point to tooltip
     * in pixels.
     *
     */
    public Builder distance(double value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the tooltip.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
     * follow the mouse as it moves across columns, pie slices and other point
     * types with an extent. By default it behaves this way for pie, polygon,
     * map, sankey and wordcloud series by override in the <code>plotOptions</code> for
     * those series types.
     *
     * For touch moves to behave the same way, followTouchMove must be <code>true</code>
     * also.
     *
     */
    public Builder followPointer(boolean value) {
      object.setFollowPointer(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
     * update as the finger moves on a touch device. If this is <code>true</code> and
     * chart.panning is set,<code>followTouchMove</code> will take over one-finger touches,
     * so the user needs to use two fingers for zooming and panning.
     *
     * Note the difference to followPointer that only defines the <em>position</em> of
     * the tooltip. If <code>followPointer</code> is false in for example a column series,
     * the tooltip will show above or below the column, but as <code>followTouchMove</code>
     * is true, the tooltip will jump from column to column as the user swipes
     * across the plot area.
     *
     */
    public Builder followTouchMove(boolean value) {
      object.setFollowTouchMove(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A string to append to the
     * tooltip format.
     *
     */
    public Builder footerFormat(@Nullable String value) {
      object.setFooterFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
     * text of the tooltip from scratch. In case of single or shared tooltips, a
     * string should be returned. In case of split tooltips, it should return an
     * array where the first item is the header, and subsequent items are mapped
     * to the points. Return <code>false</code> to disable tooltip for a specific point on
     * series.
     *
     * A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of the
     * tooltip is parsed and converted to SVG, therefore this isn't a complete
     * HTML renderer. The following HTML tags are supported: <code>b</code>, <code>br</code>, <code>em</code>,
     * <code>i</code>, <code>span</code>, <code>strong</code>. Spans can be styled with a <code>style</code> attribute, but
     * only text-related CSS, that is shared with SVG, is handled.
     *
     * The available data in the formatter differ a bit depending on whether the
     * tooltip is shared or split, or belongs to a single point. In a
     * shared/split tooltip, all properties except <code>x</code>, which is common for all
     * points, are kept in an array, <code>this.points</code>.
     *
     * Available data are:
     *
     * <ul>
     * <li>
     * <strong>this.percentage (not shared) /</strong> <strong>this.points[i].percentage
     * (shared)</strong>: Stacked series and pies only. The point's percentage of the
     * total.
     *
     * </li>
     * <li>
     * <strong>this.point (not shared) / this.points[i].point (shared)</strong>: The point
     * object. The point name, if defined, is available through
     * <code>this.point.name</code>.
     *
     * </li>
     * <li>
     * <strong>this.points</strong>: In a shared tooltip, this is an array containing all
     * other properties for each point.
     *
     * </li>
     * <li>
     * <strong>this.series (not shared) / this.points[i].series (shared)</strong>: The
     * series object. The series name is available through <code>this.series.name</code>.
     *
     * </li>
     * <li>
     * <strong>this.total (not shared) / this.points[i].total (shared)</strong>: Stacked
     * series only. The total value at this point's x value.
     *
     * </li>
     * <li>
     * <strong>this.x</strong>: The x value. This property is the same regardless of the
     * tooltip being shared or not.
     *
     * </li>
     * <li>
     * <strong>this.y (not shared) / this.points[i].y (shared)</strong>: The y value.
     *
     * </li>
     * </ul>
     */
    public Builder formatter(@Nullable TooltipFormatterCallbackFunction value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the tooltip header
     * line. Variables are enclosed by curly brackets. Available variables are
     * <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the
     * <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the
     * category name, x value or datetime string depending on the type of axis.
     * For datetime axes, the <code>point.key</code> date format can be set using
     * <code>tooltip.xDateFormat</code>.
     *
     */
    public Builder headerFormat(@Nullable String value) {
      object.setHeaderFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the tooltip header. Applies only when tooltip.split is
     * enabled.
     *
     * Custom callbacks for symbol path generation can also be added to
     * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
     * series.marker.symbol.
     *
     */
    public Builder headerShape(@Nullable HeaderShape value) {
      object.setHeaderShape(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The number of milliseconds to
     * wait until the tooltip is hidden when mouse out from a point or chart.
     *
     */
    public Builder hideDelay(double value) {
      object.setHideDelay(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the null point's
     * line in the tooltip. Works analogously to pointFormat.
     *
     */
    public Builder nullFormat(@Nullable String value) {
      object.setNullFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
     * text of the tooltip for visible null points. Works analogously to
     * formatter.
     *
     */
    public Builder nullFormatter(@Nullable TooltipFormatterCallbackFunction value) {
      object.setNullFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the tooltip to
     * render outside the chart's SVG element box. By default (<code>false</code>), the
     * tooltip is rendered within the chart's SVG element, which results in the
     * tooltip being aligned inside the chart area. For small charts, this may
     * result in clipping or overlapping. When <code>true</code>, a separate SVG element is
     * created and overlaid on the page, allowing the tooltip to be aligned
     * inside the page itself.
     *
     * Defaults to <code>true</code> if <code>chart.scrollablePlotArea</code> is activated, otherwise
     * <code>false</code>.
     *
     */
    public Builder outside(boolean value) {
      object.setOutside(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Padding inside the tooltip, in
     * pixels.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the point's line in
     * the tooltip. Variables are enclosed by curly brackets. Available
     * variables are point.x, point.y, series. name and series.color and other
     * properties on the same form. Furthermore, <code>point.y</code> can be extended by
     * the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can
     * also be overridden for each series, which makes it a good hook for
     * displaying units.
     *
     * In styled mode, the dot is colored by a class name rather than the point
     * color.
     *
     */
    public Builder pointFormat(@Nullable String value) {
      object.setPointFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function for
     * formatting the HTML output for a single point in the tooltip. Like the
     * <code>pointFormat</code> string, but with more flexibility.
     *
     */
    public Builder pointFormatter(@Nullable FormatterCallbackFunction<Point> value) {
      object.setPointFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to place the
     * tooltip in a default position. The callback receives three parameters:
     * <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for
     * <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot
     * area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full
     * coordinates.
     *
     * Since v7, when tooltip.split option is enabled, positioner is called for
     * each of the boxes separately, including xAxis header. xAxis header is not
     * a point, instead <code>point</code> argument contains info: <code>{ plotX: Number, plotY: Number, isHeader: Boolean }</code>
     *
     * The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.
     *
     */
    public Builder positioner(@Nullable TooltipPositionerCallbackFunction value) {
      object.setPositioner(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the tooltip.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the tooltip.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the tooltip. Can be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code>, or
     * <code>&quot;square&quot;</code>. When tooltip.split option is enabled, shape is applied to all
     * boxes except header, which is controlled by tooltip.headerShape.
     *
     * Custom callbacks for symbol path generation can also be added to
     * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
     * series.marker.symbol.
     *
     */
    public Builder shape(@Nullable Shape value) {
      object.setShape(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
     * will capture mouse movement or touch events. Tooltip texts for series
     * types with ordered data (not pie, scatter, flags etc) will be shown in a
     * single bubble. This is recommended for single series charts and for
     * tablet/mobile optimized charts.
     *
     * See also tooltip.split, that is better suited for charts with many
     * series, especially line-type series. The <code>tooltip.split</code> option takes
     * precedence over <code>tooltip.shared</code>.
     *
     */
    public Builder shared(boolean value) {
      object.setShared(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Proximity snap for graphs or single points. It
     * defaults to 10 for mouse-powered devices and 25 for touch devices.
     *
     * Note that in most cases the whole plot area captures the mouse movement,
     * and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when
     * stickyTracking is <code>true</code> (default) and when the tooltip is shared or
     * split.
     *
     */
    public Builder snap(double value) {
      object.setSnap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Split the tooltip into one label per series, with
     * the header close to the axis. This is recommended over shared tooltips
     * for charts with multiple line series, generally making them easier to
     * read. This option takes precedence over <code>tooltip.shared</code>.
     *
     */
    public Builder split(boolean value) {
      object.setSplit(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Prevents the tooltip from
     * switching or closing, when touched or pointed.
     *
     */
    public Builder stickOnContact(boolean value) {
      object.setStickOnContact(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the tooltip. The
     * tooltip can also be styled through the CSS class <code>.highcharts-tooltip</code>.
     *
     * Note that the default <code>pointerEvents</code> style makes the tooltip ignore
     * mouse events, so in order to use clickable tooltips, this value must be
     * set to <code>auto</code>.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Use HTML to render the contents
     * of the tooltip instead of SVG. Using HTML allows advanced formatting like
     * tables and images in the tooltip. It is also recommended for rtl
     * languages as it works around rtl bugs in early Firefox.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How many decimals to show in
     * each series' y value. This is overridable in each series' tooltip options
     * object. The default is to preserve all decimals.
     *
     */
    public Builder valueDecimals(double value) {
      object.setValueDecimals(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A string to prepend to each
     * series' y value. Overridable in each series' tooltip options object.
     *
     */
    public Builder valuePrefix(@Nullable String value) {
      object.setValuePrefix(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A string to append to each
     * series' y value. Overridable in each series' tooltip options object.
     *
     */
    public Builder valueSuffix(@Nullable String value) {
      object.setValueSuffix(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
     * header if the X axis is a datetime axis. The default is a best guess
     * based on the smallest distance between points in the chart.
     *
     */
    public Builder xDateFormat(@Nullable String value) {
      object.setXDateFormat(value);
      return this;
    }
  }
}
