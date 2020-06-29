package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* ( boolean | string ) */;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* ( string | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Can set <code>dataLabels</code> on all points
 * which lies on the same level.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesSunburstDataLabelsOptionsObject extends Any {
  /**
   * (Highcharts) Alignment method for data labels. Possible values are:
   *
   * <ul>
   * <li>
   * <code>toPlotEdges</code>: Each label touches the nearest vertical edge of the plot
   * area.
   *
   * </li>
   * <li>
   * <code>connectors</code>: Connectors have the same x position and the widest label
   * of each half (left &amp; right) touches the nearest vertical edge of the plot
   * area.
   *
   * </li>
   * </ul>
   */
  @JSProperty("alignTo")
  @Nullable
  String getAlignTo();

  /**
   * (Highcharts) Alignment method for data labels. Possible values are:
   *
   * <ul>
   * <li>
   * <code>toPlotEdges</code>: Each label touches the nearest vertical edge of the plot
   * area.
   *
   * </li>
   * <li>
   * <code>connectors</code>: Connectors have the same x position and the widest label
   * of each half (left &amp; right) touches the nearest vertical edge of the plot
   * area.
   *
   * </li>
   * </ul>
   */
  @JSProperty("alignTo")
  void setAlignTo(@Nullable String value);

  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
   * the data label.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
   * the data label.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
   * the data label.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
   * the data label.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
   * Particularly in styled mode, this can be used to give each series' or
   * point's data label unique styling. In addition to this option, a default
   * color class name is added so that we can give the labels a contrast text
   * shadow.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
   * Particularly in styled mode, this can be used to give each series' or
   * point's data label unique styling. In addition to this option, a default
   * color class name is added so that we can give the labels a contrast text
   * shadow.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The color of the line connecting the data label to the pie
   * slice. The default color is the same as the point's color.
   *
   * In styled mode, the connector stroke is given in the
   * <code>.highcharts-data-label-connector</code> class.
   *
   */
  @JSProperty("connectorColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getConnectorColor();

  /**
   * (Highcharts) The color of the line connecting the data label to the pie
   * slice. The default color is the same as the point's color.
   *
   * In styled mode, the connector stroke is given in the
   * <code>.highcharts-data-label-connector</code> class.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the line connecting the data label to the pie
   * slice. The default color is the same as the point's color.
   *
   * In styled mode, the connector stroke is given in the
   * <code>.highcharts-data-label-connector</code> class.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable String value);

  /**
   * (Highcharts) The color of the line connecting the data label to the pie
   * slice. The default color is the same as the point's color.
   *
   * In styled mode, the connector stroke is given in the
   * <code>.highcharts-data-label-connector</code> class.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The distance from the data label to the connector. Note that
   * data labels also have a default <code>padding</code>, so in order for the connector
   * to touch the text, the <code>padding</code> must also be 0.
   *
   */
  @JSProperty("connectorPadding")
  double getConnectorPadding();

  /**
   * (Highcharts) The distance from the data label to the connector. Note that
   * data labels also have a default <code>padding</code>, so in order for the connector
   * to touch the text, the <code>padding</code> must also be 0.
   *
   */
  @JSProperty("connectorPadding")
  void setConnectorPadding(double value);

  /**
   * (Highcharts) Specifies the method that is used to generate the connector
   * path. Highcharts provides 3 built-in connector shapes: <code>'fixedOffset'</code>
   * (default), <code>'straight'</code> and <code>'crookedLine'</code>. Using <code>'crookedLine'</code> has
   * the most sense (in most of the cases) when <code>'alignTo'</code> is set.
   *
   * Users can provide their own method by passing a function instead of a
   * String. 3 arguments are passed to the callback:
   *
   * <ul>
   * <li>
   * Object that holds the information about the coordinates of the label
   * (<code>x</code> &amp; <code>y</code> properties) and how the label is located in relation to the
   * pie (<code>alignment</code> property). <code>alignment</code> can by one of the following:
   * <code>'left'</code> (pie on the left side of the data label), <code>'right'</code> (pie on the
   * right side of the data label) or <code>'center'</code> (data label overlaps the
   * pie).
   *
   * </li>
   * <li>
   * Object that holds the information about the position of the connector.
   * Its <code>touchingSliceAt</code> porperty tells the position of the place where the
   * connector touches the slice.
   *
   * </li>
   * <li>
   * Data label options
   *
   * </li>
   * </ul>
   * The function has to return an SVG path definition in array form (see the
   * example).
   *
   */
  @JSProperty("connectorShape")
  @Nullable
  Unknown /* ( string | Function ) */ getConnectorShape();

  /**
   * (Highcharts) Specifies the method that is used to generate the connector
   * path. Highcharts provides 3 built-in connector shapes: <code>'fixedOffset'</code>
   * (default), <code>'straight'</code> and <code>'crookedLine'</code>. Using <code>'crookedLine'</code> has
   * the most sense (in most of the cases) when <code>'alignTo'</code> is set.
   *
   * Users can provide their own method by passing a function instead of a
   * String. 3 arguments are passed to the callback:
   *
   * <ul>
   * <li>
   * Object that holds the information about the coordinates of the label
   * (<code>x</code> &amp; <code>y</code> properties) and how the label is located in relation to the
   * pie (<code>alignment</code> property). <code>alignment</code> can by one of the following:
   * <code>'left'</code> (pie on the left side of the data label), <code>'right'</code> (pie on the
   * right side of the data label) or <code>'center'</code> (data label overlaps the
   * pie).
   *
   * </li>
   * <li>
   * Object that holds the information about the position of the connector.
   * Its <code>touchingSliceAt</code> porperty tells the position of the place where the
   * connector touches the slice.
   *
   * </li>
   * <li>
   * Data label options
   *
   * </li>
   * </ul>
   * The function has to return an SVG path definition in array form (see the
   * example).
   *
   */
  @JSProperty("connectorShape")
  void setConnectorShape(@Nullable String value);

  /**
   * (Highcharts) Specifies the method that is used to generate the connector
   * path. Highcharts provides 3 built-in connector shapes: <code>'fixedOffset'</code>
   * (default), <code>'straight'</code> and <code>'crookedLine'</code>. Using <code>'crookedLine'</code> has
   * the most sense (in most of the cases) when <code>'alignTo'</code> is set.
   *
   * Users can provide their own method by passing a function instead of a
   * String. 3 arguments are passed to the callback:
   *
   * <ul>
   * <li>
   * Object that holds the information about the coordinates of the label
   * (<code>x</code> &amp; <code>y</code> properties) and how the label is located in relation to the
   * pie (<code>alignment</code> property). <code>alignment</code> can by one of the following:
   * <code>'left'</code> (pie on the left side of the data label), <code>'right'</code> (pie on the
   * right side of the data label) or <code>'center'</code> (data label overlaps the
   * pie).
   *
   * </li>
   * <li>
   * Object that holds the information about the position of the connector.
   * Its <code>touchingSliceAt</code> porperty tells the position of the place where the
   * connector touches the slice.
   *
   * </li>
   * <li>
   * Data label options
   *
   * </li>
   * </ul>
   * The function has to return an SVG path definition in array form (see the
   * example).
   *
   */
  @JSProperty("connectorShape")
  void setConnectorShape(@Nullable JsFunction value);

  /**
   * (Highcharts) The width of the line connecting the data label to the pie
   * slice.
   *
   * In styled mode, the connector stroke width is given in the
   * <code>.highcharts-data-label-connector</code> class.
   *
   */
  @JSProperty("connectorWidth")
  double getConnectorWidth();

  /**
   * (Highcharts) The width of the line connecting the data label to the pie
   * slice.
   *
   * In styled mode, the connector stroke width is given in the
   * <code>.highcharts-data-label-connector</code> class.
   *
   */
  @JSProperty("connectorWidth")
  void setConnectorWidth(double value);

  /**
   * (Highcharts) Works only if <code>connectorShape</code> is <code>'crookedLine'</code>. It
   * defines how far from the vertical plot edge the coonnector path should be
   * crooked.
   *
   */
  @JSProperty("crookDistance")
  @Nullable
  String getCrookDistance();

  /**
   * (Highcharts) Works only if <code>connectorShape</code> is <code>'crookedLine'</code>. It
   * defines how far from the vertical plot edge the coonnector path should be
   * crooked.
   *
   */
  @JSProperty("crookDistance")
  void setCrookDistance(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
   * are outside the plot area. By default, the data label is moved inside the
   * plot area according to the overflow option.
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
   * are outside the plot area. By default, the data label is moved inside the
   * plot area according to the overflow option.
   *
   */
  @JSProperty("crop")
  void setCrop(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
   * labels until the initial series animation has finished.
   *
   */
  @JSProperty("defer")
  boolean getDefer();

  /**
   * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
   * labels until the initial series animation has finished.
   *
   */
  @JSProperty("defer")
  void setDefer(boolean value);

  /**
   * (Highcharts) The distance of the data label from the pie's edge. Negative
   * numbers put the data label on top of the pie slices. Can also be defined
   * as a percentage of pie's radius. Connectors are only shown for data
   * labels outside the pie.
   *
   */
  @JSProperty("distance")
  @Nullable
  Unknown /* ( number | string ) */ getDistance();

  /**
   * (Highcharts) The distance of the data label from the pie's edge. Negative
   * numbers put the data label on top of the pie slices. Can also be defined
   * as a percentage of pie's radius. Connectors are only shown for data
   * labels outside the pie.
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts) The distance of the data label from the pie's edge. Negative
   * numbers put the data label on top of the pie slices. Can also be defined
   * as a percentage of pie's radius. Connectors are only shown for data
   * labels outside the pie.
   *
   */
  @JSProperty("distance")
  void setDistance(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
   * labels.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
   * labels.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
   * of which data labels to display. The declarative filter is designed for
   * use when callback functions are not available, like when the chart
   * options require a pure JSON structure or for use with graphical editors.
   * For programmatic control, use the <code>formatter</code> instead, and return
   * <code>undefined</code> to disable a single data label.
   *
   */
  @JSProperty("filter")
  @Nullable
  DataLabelsFilterOptionsObject getFilter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
   * of which data labels to display. The declarative filter is designed for
   * use when callback functions are not available, like when the chart
   * options require a pure JSON structure or for use with graphical editors.
   * For programmatic control, use the <code>formatter</code> instead, and return
   * <code>undefined</code> to disable a single data label.
   *
   */
  @JSProperty("filter")
  void setFilter(@Nullable DataLabelsFilterOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
   * label. Available variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
   * label. Available variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
   * format the data label. Note that if a <code>format</code> is defined, the format
   * takes precedence and the formatter is ignored.
   *
   */
  @JSProperty("formatter")
  @Nullable
  DataLabelsFormatterCallbackFunction getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
   * format the data label. Note that if a <code>format</code> is defined, the format
   * takes precedence and the formatter is ignored.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable DataLabelsFormatterCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
   * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormat")
  @Nullable
  Unknown /* ( boolean | string ) */ getNullFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
   * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormat")
  void setNullFormat(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
   * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormat")
  void setNullFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
   * that defines formatting for points with the value of null. Works
   * analogously to formatter. <code>nullPointFormatter</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormatter")
  @Nullable
  DataLabelsFormatterCallbackFunction getNullFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
   * that defines formatting for points with the value of null. Works
   * analogously to formatter. <code>nullPointFormatter</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormatter")
  void setNullFormatter(@Nullable DataLabelsFormatterCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
   * flow outside the plot area. The default is <code>&quot;justify&quot;</code>, which aligns them
   * inside the plot area. For columns and bars, this means it will be moved
   * inside the bar. To display data labels outside the plot area, set <code>crop</code>
   * to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
   * flow outside the plot area. The default is <code>&quot;justify&quot;</code>, which aligns them
   * inside the plot area. For columns and bars, this means it will be moved
   * inside the bar. To display data labels outside the plot area, set <code>crop</code>
   * to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.
   *
   */
  @JSProperty("overflow")
  void setOverflow(@Nullable Overflow value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When either the <code>borderWidth</code> or
   * the <code>backgroundColor</code> is set, this is the padding within the box.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When either the <code>borderWidth</code> or
   * the <code>backgroundColor</code> is set, this is the padding within the box.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
   * points. If <code>center</code> alignment is not possible, it defaults to <code>right</code>.
   *
   */
  @JSProperty("position")
  @Nullable
  Position getPosition();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
   * points. If <code>center</code> alignment is not possible, it defaults to <code>right</code>.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable Position value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
   * that due to a more complex structure, backgrounds, borders and padding
   * will be lost on a rotated data label.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
   * that due to a more complex structure, backgrounds, borders and padding
   * will be lost on a rotated data label.
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Decides how the data label will
   * be rotated relative to the perimeter of the sunburst. Valid values are
   * <code>auto</code>, <code>circular</code>, <code>parallel</code> and <code>perpendicular</code>. When <code>auto</code>, the best
   * fit will be computed for the point. The <code>circular</code> option works similiar
   * to <code>auto</code>, but uses the <code>textPath</code> feature - labels are curved, resulting
   * in a better layout, however multiple lines and <code>textOutline</code> are not
   * supported.
   *
   * The <code>series.rotation</code> option takes precedence over <code>rotationMode</code>.
   *
   */
  @JSProperty("rotationMode")
  @Nullable
  RotationMode getRotationMode();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Decides how the data label will
   * be rotated relative to the perimeter of the sunburst. Valid values are
   * <code>auto</code>, <code>circular</code>, <code>parallel</code> and <code>perpendicular</code>. When <code>auto</code>, the best
   * fit will be computed for the point. The <code>circular</code> option works similiar
   * to <code>auto</code>, but uses the <code>textPath</code> feature - labels are curved, resulting
   * in a better layout, however multiple lines and <code>textOutline</code> are not
   * supported.
   *
   * The <code>series.rotation</code> option takes precedence over <code>rotationMode</code>.
   *
   */
  @JSProperty("rotationMode")
  void setRotationMode(@Nullable RotationMode value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
   * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
   * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
   * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the label. Symbols are predefined functions on the
   * Renderer object.
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the label. Symbols are predefined functions on the
   * Renderer object.
   *
   */
  @JSProperty("shape")
  void setShape(@Nullable String value);

  /**
   * (Highcharts) Whether to render the connector as a soft arc or a line with
   * sharp break. Works only if <code>connectorShape</code> equals to <code>fixedOffset</code>.
   *
   */
  @JSProperty("softConnector")
  boolean getSoftConnector();

  /**
   * (Highcharts) Whether to render the connector as a soft arc or a line with
   * sharp break. Works only if <code>connectorShape</code> equals to <code>fixedOffset</code>.
   *
   */
  @JSProperty("softConnector")
  void setSoftConnector(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
   * default <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that
   * Highcharts picks up and applies the maximum contrast to the underlying
   * point item, for example the bar in a bar chart.
   *
   * The <code>textOutline</code> is a pseudo property that applies an outline of the
   * given width with the given color, which by default is the maximum
   * contrast to the text. So a bright text color will result in a black text
   * outline for maximum readability on a mixed background. In some cases,
   * especially with grayscale text, the text outline doesn't work well, in
   * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
   * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
   * effect can be acheived through the <code>text-shadow</code> CSS property.
   *
   * For some series types, where each point has an extent, like for example
   * tree maps, the data label may overflow the point. There are two
   * strategies for handling overflow. By default, the text will wrap to
   * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
   * <code>ellipsis</code>, which will keep the text on one line plus it will break
   * inside long words.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
   * default <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that
   * Highcharts picks up and applies the maximum contrast to the underlying
   * point item, for example the bar in a bar chart.
   *
   * The <code>textOutline</code> is a pseudo property that applies an outline of the
   * given width with the given color, which by default is the maximum
   * contrast to the text. So a bright text color will result in a black text
   * outline for maximum readability on a mixed background. In some cases,
   * especially with grayscale text, the text outline doesn't work well, in
   * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
   * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
   * effect can be acheived through the <code>text-shadow</code> CSS property.
   *
   * For some series types, where each point has an extent, like for example
   * tree maps, the data label may overflow the point. There are two
   * strategies for handling overflow. By default, the text will wrap to
   * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
   * <code>ellipsis</code>, which will keep the text on one line plus it will break
   * inside long words.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
   * should follow marker's shape. Border and background are disabled for a
   * label that follows a path.
   *
   * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code>
   * to true will disable this option.
   *
   */
  @JSProperty("textPath")
  @Nullable
  DataLabelsTextPathOptionsObject getTextPath();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
   * should follow marker's shape. Border and background are disabled for a
   * label that follows a path.
   *
   * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code>
   * to true will disable this option.
   *
   */
  @JSProperty("textPath")
  void setTextPath(@Nullable DataLabelsTextPathOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the labels.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the labels.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
   * label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value
   * depends on the data, for instance in a column chart, the label is above
   * positive values and below negative values.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
   * label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value
   * depends on the data, for instance in a column chart, the label is above
   * positive values and below negative values.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
   * The default Z index puts it above the series. Use a Z index of 2 to
   * display it behind the series.
   *
   */
  @JSProperty("z")
  double getZ();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
   * The default Z index puts it above the series. Use a Z index of 2 to
   * display it behind the series.
   *
   */
  @JSProperty("z")
  void setZ(double value);

  static Builder builder() {
    return new Builder();
  }

  abstract class RotationMode extends JsEnum {
    public static final RotationMode AUTO = JsEnum.of("auto");

    public static final RotationMode CIRCULAR = JsEnum.of("circular");

    public static final RotationMode PARALLEL = JsEnum.of("parallel");

    public static final RotationMode PERPENDICULAR = JsEnum.of("perpendicular");
  }

  final class Builder {
    private final SeriesSunburstDataLabelsOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesSunburstDataLabelsOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts) Alignment method for data labels. Possible values are:
     *
     * <ul>
     * <li>
     * <code>toPlotEdges</code>: Each label touches the nearest vertical edge of the plot
     * area.
     *
     * </li>
     * <li>
     * <code>connectors</code>: Connectors have the same x position and the widest label
     * of each half (left &amp; right) touches the nearest vertical edge of the plot
     * area.
     *
     * </li>
     * </ul>
     */
    public Builder alignTo(@Nullable String value) {
      object.setAlignTo(value);
      return this;
    }

    public Builder allowOverlap(boolean value) {
      object.setAllowOverlap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
     * the data label.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
     * the data label.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
     * Particularly in styled mode, this can be used to give each series' or
     * point's data label unique styling. In addition to this option, a default
     * color class name is added so that we can give the labels a contrast text
     * shadow.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to <code>undefined</code>. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a <code>text-outline</code> style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to <code>undefined</code>. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a <code>text-outline</code> style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to <code>undefined</code>. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a <code>text-outline</code> style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the line connecting the data label to the pie
     * slice. The default color is the same as the point's color.
     *
     * In styled mode, the connector stroke is given in the
     * <code>.highcharts-data-label-connector</code> class.
     *
     */
    public Builder connectorColor(@Nullable PatternObject value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the line connecting the data label to the pie
     * slice. The default color is the same as the point's color.
     *
     * In styled mode, the connector stroke is given in the
     * <code>.highcharts-data-label-connector</code> class.
     *
     */
    public Builder connectorColor(@Nullable String value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the line connecting the data label to the pie
     * slice. The default color is the same as the point's color.
     *
     * In styled mode, the connector stroke is given in the
     * <code>.highcharts-data-label-connector</code> class.
     *
     */
    public Builder connectorColor(@Nullable GradientColorObject value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts) The distance from the data label to the connector. Note that
     * data labels also have a default <code>padding</code>, so in order for the connector
     * to touch the text, the <code>padding</code> must also be 0.
     *
     */
    public Builder connectorPadding(double value) {
      object.setConnectorPadding(value);
      return this;
    }

    /**
     * (Highcharts) Specifies the method that is used to generate the connector
     * path. Highcharts provides 3 built-in connector shapes: <code>'fixedOffset'</code>
     * (default), <code>'straight'</code> and <code>'crookedLine'</code>. Using <code>'crookedLine'</code> has
     * the most sense (in most of the cases) when <code>'alignTo'</code> is set.
     *
     * Users can provide their own method by passing a function instead of a
     * String. 3 arguments are passed to the callback:
     *
     * <ul>
     * <li>
     * Object that holds the information about the coordinates of the label
     * (<code>x</code> &amp; <code>y</code> properties) and how the label is located in relation to the
     * pie (<code>alignment</code> property). <code>alignment</code> can by one of the following:
     * <code>'left'</code> (pie on the left side of the data label), <code>'right'</code> (pie on the
     * right side of the data label) or <code>'center'</code> (data label overlaps the
     * pie).
     *
     * </li>
     * <li>
     * Object that holds the information about the position of the connector.
     * Its <code>touchingSliceAt</code> porperty tells the position of the place where the
     * connector touches the slice.
     *
     * </li>
     * <li>
     * Data label options
     *
     * </li>
     * </ul>
     * The function has to return an SVG path definition in array form (see the
     * example).
     *
     */
    public Builder connectorShape(@Nullable String value) {
      object.setConnectorShape(value);
      return this;
    }

    /**
     * (Highcharts) Specifies the method that is used to generate the connector
     * path. Highcharts provides 3 built-in connector shapes: <code>'fixedOffset'</code>
     * (default), <code>'straight'</code> and <code>'crookedLine'</code>. Using <code>'crookedLine'</code> has
     * the most sense (in most of the cases) when <code>'alignTo'</code> is set.
     *
     * Users can provide their own method by passing a function instead of a
     * String. 3 arguments are passed to the callback:
     *
     * <ul>
     * <li>
     * Object that holds the information about the coordinates of the label
     * (<code>x</code> &amp; <code>y</code> properties) and how the label is located in relation to the
     * pie (<code>alignment</code> property). <code>alignment</code> can by one of the following:
     * <code>'left'</code> (pie on the left side of the data label), <code>'right'</code> (pie on the
     * right side of the data label) or <code>'center'</code> (data label overlaps the
     * pie).
     *
     * </li>
     * <li>
     * Object that holds the information about the position of the connector.
     * Its <code>touchingSliceAt</code> porperty tells the position of the place where the
     * connector touches the slice.
     *
     * </li>
     * <li>
     * Data label options
     *
     * </li>
     * </ul>
     * The function has to return an SVG path definition in array form (see the
     * example).
     *
     */
    public Builder connectorShape(@Nullable JsFunction value) {
      object.setConnectorShape(value);
      return this;
    }

    /**
     * (Highcharts) The width of the line connecting the data label to the pie
     * slice.
     *
     * In styled mode, the connector stroke width is given in the
     * <code>.highcharts-data-label-connector</code> class.
     *
     */
    public Builder connectorWidth(double value) {
      object.setConnectorWidth(value);
      return this;
    }

    /**
     * (Highcharts) Works only if <code>connectorShape</code> is <code>'crookedLine'</code>. It
     * defines how far from the vertical plot edge the coonnector path should be
     * crooked.
     *
     */
    public Builder crookDistance(@Nullable String value) {
      object.setCrookDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
     * are outside the plot area. By default, the data label is moved inside the
     * plot area according to the overflow option.
     *
     */
    public Builder crop(boolean value) {
      object.setCrop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
     * labels until the initial series animation has finished.
     *
     */
    public Builder defer(boolean value) {
      object.setDefer(value);
      return this;
    }

    /**
     * (Highcharts) The distance of the data label from the pie's edge. Negative
     * numbers put the data label on top of the pie slices. Can also be defined
     * as a percentage of pie's radius. Connectors are only shown for data
     * labels outside the pie.
     *
     */
    public Builder distance(double value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highcharts) The distance of the data label from the pie's edge. Negative
     * numbers put the data label on top of the pie slices. Can also be defined
     * as a percentage of pie's radius. Connectors are only shown for data
     * labels outside the pie.
     *
     */
    public Builder distance(@Nullable String value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
     * labels.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
     * of which data labels to display. The declarative filter is designed for
     * use when callback functions are not available, like when the chart
     * options require a pure JSON structure or for use with graphical editors.
     * For programmatic control, use the <code>formatter</code> instead, and return
     * <code>undefined</code> to disable a single data label.
     *
     */
    public Builder filter(@Nullable DataLabelsFilterOptionsObject value) {
      object.setFilter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
     * label. Available variables are the same as for <code>formatter</code>.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
     * format the data label. Note that if a <code>format</code> is defined, the format
     * takes precedence and the formatter is ignored.
     *
     */
    public Builder formatter(@Nullable DataLabelsFormatterCallbackFunction value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
     * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
     * series which support displaying null points.
     *
     */
    public Builder nullFormat(boolean value) {
      object.setNullFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
     * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
     * series which support displaying null points.
     *
     */
    public Builder nullFormat(@Nullable String value) {
      object.setNullFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
     * that defines formatting for points with the value of null. Works
     * analogously to formatter. <code>nullPointFormatter</code> can be applied only to
     * series which support displaying null points.
     *
     */
    public Builder nullFormatter(@Nullable DataLabelsFormatterCallbackFunction value) {
      object.setNullFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
     * flow outside the plot area. The default is <code>&quot;justify&quot;</code>, which aligns them
     * inside the plot area. For columns and bars, this means it will be moved
     * inside the bar. To display data labels outside the plot area, set <code>crop</code>
     * to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.
     *
     */
    public Builder overflow(@Nullable Overflow value) {
      object.setOverflow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When either the <code>borderWidth</code> or
     * the <code>backgroundColor</code> is set, this is the padding within the box.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
     * points. If <code>center</code> alignment is not possible, it defaults to <code>right</code>.
     *
     */
    public Builder position(@Nullable Position value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
     * that due to a more complex structure, backgrounds, borders and padding
     * will be lost on a rotated data label.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Decides how the data label will
     * be rotated relative to the perimeter of the sunburst. Valid values are
     * <code>auto</code>, <code>circular</code>, <code>parallel</code> and <code>perpendicular</code>. When <code>auto</code>, the best
     * fit will be computed for the point. The <code>circular</code> option works similiar
     * to <code>auto</code>, but uses the <code>textPath</code> feature - labels are curved, resulting
     * in a better layout, however multiple lines and <code>textOutline</code> are not
     * supported.
     *
     * The <code>series.rotation</code> option takes precedence over <code>rotationMode</code>.
     *
     */
    public Builder rotationMode(@Nullable RotationMode value) {
      object.setRotationMode(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
     * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
     * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
     * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
     * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the label. Symbols are predefined functions on the
     * Renderer object.
     *
     */
    public Builder shape(@Nullable String value) {
      object.setShape(value);
      return this;
    }

    /**
     * (Highcharts) Whether to render the connector as a soft arc or a line with
     * sharp break. Works only if <code>connectorShape</code> equals to <code>fixedOffset</code>.
     *
     */
    public Builder softConnector(boolean value) {
      object.setSoftConnector(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
     * default <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that
     * Highcharts picks up and applies the maximum contrast to the underlying
     * point item, for example the bar in a bar chart.
     *
     * The <code>textOutline</code> is a pseudo property that applies an outline of the
     * given width with the given color, which by default is the maximum
     * contrast to the text. So a bright text color will result in a black text
     * outline for maximum readability on a mixed background. In some cases,
     * especially with grayscale text, the text outline doesn't work well, in
     * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
     * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
     * effect can be acheived through the <code>text-shadow</code> CSS property.
     *
     * For some series types, where each point has an extent, like for example
     * tree maps, the data label may overflow the point. There are two
     * strategies for handling overflow. By default, the text will wrap to
     * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
     * <code>ellipsis</code>, which will keep the text on one line plus it will break
     * inside long words.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
     * should follow marker's shape. Border and background are disabled for a
     * label that follows a path.
     *
     * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code>
     * to true will disable this option.
     *
     */
    public Builder textPath(@Nullable DataLabelsTextPathOptionsObject value) {
      object.setTextPath(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the labels.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
     * label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value
     * depends on the data, for instance in a column chart, the label is above
     * positive values and below negative values.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
     * label relative to the point in pixels.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
     * label relative to the point in pixels.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
     * The default Z index puts it above the series. Use a Z index of 2 to
     * display it behind the series.
     *
     */
    public Builder z(double value) {
      object.setZ(value);
      return this;
    }
  }
}
