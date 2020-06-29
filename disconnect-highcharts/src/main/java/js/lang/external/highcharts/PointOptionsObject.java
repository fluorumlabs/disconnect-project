package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( DataLabelsOptions | DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | Array < DataLabelsOptions > | Array < SeriesNetworkgraphDataLabelsOptionsObject > | Array < SeriesPackedBubbleDataLabelsOptionsObject > | Array < SeriesSunburstDataLabelsOptionsObject > ) */;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * The generic point options for all series.
 *
 * In TypeScript you have to extend <code>PointOptionsObject</code> with an additional
 * declaration to allow custom data options: (see online documentation for
 * example)
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointOptionsObject extends Any {
  /**
   * (Highcharts) Accessibility options for a data point.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  PointAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts) Accessibility options for a data point.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable PointAccessibilityOptionsObject value);

  /**
   * (Highcharts, Highstock) The color of the border surrounding the column or
   * bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock) The color of the border surrounding the column or
   * bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The color of the border surrounding the column or
   * bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The color of the border surrounding the column or
   * bar.
   *
   * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) The width of the border surrounding the column or
   * bar.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock) The width of the border surrounding the column or
   * bar.
   *
   * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
   * rule.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The dash style of the box.
   *
   */
  @JSProperty("boxDashStyle")
  @Nullable
  BoxDashStyle getBoxDashStyle();

  /**
   * (Highcharts) The dash style of the box.
   *
   */
  @JSProperty("boxDashStyle")
  void setBoxDashStyle(@Nullable BoxDashStyle value);

  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Gantt) An additional, individual class name for the data
   * point's graphic representation.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highstock) The closing value of each data point.
   *
   */
  @JSProperty("close")
  double getClose();

  /**
   * (Highstock) The closing value of each data point.
   *
   */
  @JSProperty("close")
  void setClose(double value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Individual color for the point. By default
   * the color is pulled from the global <code>colors</code> array.
   *
   * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
   * <code>colorIndex</code>.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Gantt) A specific color index to use for the point, so its
   * graphic representations are given the class name <code>highcharts-color-{n}</code>.
   * In styled mode this will change the color of the graphic. In non-styled
   * mode, the color by is set by the <code>fill</code> attribute, so the change in class
   * name won't have a visual effect by default.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts, Gantt) A specific color index to use for the point, so its
   * graphic representations are given the class name <code>highcharts-color-{n}</code>.
   * In styled mode this will change the color of the graphic. In non-styled
   * mode, the color by is set by the <code>fill</code> attribute, so the change in class
   * name won't have a visual effect by default.
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts) Serves a purpose only if a <code>colorAxis</code> object is defined in
   * the chart options. This value will decide which color the point gets from
   * the scale of the colorAxis.
   *
   */
  @JSProperty("colorValue")
  double getColorValue();

  /**
   * (Highcharts) Serves a purpose only if a <code>colorAxis</code> object is defined in
   * the chart options. This value will decide which color the point gets from
   * the scale of the colorAxis.
   *
   */
  @JSProperty("colorValue")
  void setColorValue(double value);

  /**
   * (Highcharts, Highstock) Color of the line that connects the dumbbell
   * point's values. By default it is the series' color.
   *
   */
  @JSProperty("connectorColor")
  @Nullable
  String getConnectorColor();

  /**
   * (Highcharts, Highstock) Color of the line that connects the dumbbell
   * point's values. By default it is the series' color.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) Pixel width of the line that connects the
   * dumbbell point's values.
   *
   */
  @JSProperty("connectorWidth")
  double getConnectorWidth();

  /**
   * (Highcharts, Highstock) Pixel width of the line that connects the
   * dumbbell point's values.
   *
   */
  @JSProperty("connectorWidth")
  void setConnectorWidth(double value);

  /**
   * (Highcharts) A reserved subspace to store options and values for
   * customized functionality. Here you can add additional data for your own
   * event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Highcharts) A reserved subspace to store options and values for
   * customized functionality. Here you can add additional data for your own
   * event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

  /**
   * (Highcharts) A name for the dash style to use for the column or bar.
   * Overrides dashStyle on the series.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under data.color.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts) A name for the dash style to use for the column or bar.
   * Overrides dashStyle on the series.
   *
   * In styled mode, the stroke dash-array can be set with the same classes as
   * listed under data.color.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( DataLabelsOptions | DataLabelsOptions | SeriesNetworkgraphDataLabelsOptionsObject | SeriesPackedBubbleDataLabelsOptionsObject | SeriesPieDataLabelsOptionsObject | SeriesSunburstDataLabelsOptionsObject | Array < DataLabelsOptions > | Array < SeriesNetworkgraphDataLabelsOptionsObject > | Array < SeriesPackedBubbleDataLabelsOptionsObject > | Array < SeriesSunburstDataLabelsOptionsObject > ) */ getDataLabels(
      );

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesSunburstDataLabelsOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesSunburstDataLabelsOptionsObject... value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable DataLabelsOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesNetworkgraphDataLabelsOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesPackedBubbleDataLabelsOptionsObject... value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(DataLabelsOptions... value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesPackedBubbleDataLabelsOptionsObject value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesNetworkgraphDataLabelsOptionsObject... value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesPieDataLabelsOptionsObject value);

  /**
   * (Highcharts) A description of the point to add to the screen reader
   * information about the point.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) A description of the point to add to the screen reader
   * information about the point.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock) The wind direction in degrees, where 0 is north
   * (pointing towards south).
   *
   */
  @JSProperty("direction")
  double getDirection();

  /**
   * (Highcharts, Highstock) The wind direction in degrees, where 0 is north
   * (pointing towards south).
   *
   */
  @JSProperty("direction")
  void setDirection(double value);

  /**
   * (Highcharts) Point specific options for the draggable-points module.
   * Overrides options on <code>series.dragDrop</code>.
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesLineDataDragDropOptions getDragDrop();

  /**
   * (Highcharts) Point specific options for the draggable-points module.
   * Overrides options on <code>series.dragDrop</code>.
   *
   */
  @JSProperty("dragDrop")
  void setDragDrop(@Nullable SeriesLineDataDragDropOptions value);

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   */
  @JSProperty("drilldown")
  @Nullable
  String getDrilldown();

  /**
   * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
   * for a drilldown for this point.
   *
   */
  @JSProperty("drilldown")
  void setDrilldown(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The individual point events.
   *
   */
  @JSProperty("events")
  @Nullable
  PointEventsOptionsObject getEvents();

  /**
   * (Highcharts, Highstock, Gantt) The individual point events.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable PointEventsOptionsObject value);

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highstock) The fill color of an individual flag. By default it inherits
   * from the series color.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The node that the link runs from.
   *
   */
  @JSProperty("from")
  @Nullable
  String getFrom();

  /**
   * (Highcharts) The node that the link runs from.
   *
   */
  @JSProperty("from")
  void setFrom(@Nullable String value);

  /**
   * (Highcharts) By deafult sides fill is set to a gradient through this
   * option being set to <code>true</code>. Set to <code>false</code> to get solid color for the
   * sides.
   *
   */
  @JSProperty("gradientForSides")
  boolean getGradientForSides();

  /**
   * (Highcharts) By deafult sides fill is set to a gradient through this
   * option being set to <code>true</code>. Set to <code>false</code> to get solid color for the
   * sides.
   *
   */
  @JSProperty("gradientForSides")
  void setGradientForSides(boolean value);

  /**
   * (Highcharts, Highstock) The high or maximum value for each data point.
   *
   */
  @JSProperty("high")
  double getHigh();

  /**
   * (Highcharts, Highstock) The high or maximum value for each data point.
   *
   */
  @JSProperty("high")
  void setHigh(double value);

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts, Highstock, Gantt) An id for the point. This can be used
   * after render time to get a pointer to the point object through
   * <code>chart.get()</code>.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts) The inner radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   */
  @JSProperty("innerRadius")
  @Nullable
  Unknown /* ( number | string ) */ getInnerRadius();

  /**
   * (Highcharts) The inner radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(double value);

  /**
   * (Highcharts) The inner radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   */
  @JSProperty("innerRadius")
  void setInnerRadius(@Nullable String value);

  /**
   * (Highcharts) When this property is true, the points acts as a summary
   * column for the values added or substracted since the last intermediate
   * sum, or since the start of the series. The <code>y</code> value is ignored.
   *
   */
  @JSProperty("isIntermediateSum")
  boolean getIsIntermediateSum();

  /**
   * (Highcharts) When this property is true, the points acts as a summary
   * column for the values added or substracted since the last intermediate
   * sum, or since the start of the series. The <code>y</code> value is ignored.
   *
   */
  @JSProperty("isIntermediateSum")
  void setIsIntermediateSum(boolean value);

  /**
   * (Highcharts) When this property is true, the point display the total sum
   * across the entire series. The <code>y</code> value is ignored.
   *
   */
  @JSProperty("isSum")
  boolean getIsSum();

  /**
   * (Highcharts) When this property is true, the point display the total sum
   * across the entire series. The <code>y</code> value is ignored.
   *
   */
  @JSProperty("isSum")
  void setIsSum(boolean value);

  /**
   * (Highcharts) The label of event.
   *
   */
  @JSProperty("label")
  @Nullable
  String getLabel();

  /**
   * (Highcharts) The label of event.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable String value);

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highcharts) The rank for this point's data label in case of collision.
   * If two data labels are about to overlap, only the one with the highest
   * <code>labelrank</code> will be drawn.
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

  /**
   * (Highcharts) The sequential index of the data point in the legend.
   *
   */
  @JSProperty("legendIndex")
  double getLegendIndex();

  /**
   * (Highcharts) The sequential index of the data point in the legend.
   *
   */
  @JSProperty("legendIndex")
  void setLegendIndex(double value);

  /**
   * (Highcharts, Highstock) The length of the vector. The rendered length
   * will relate to the <code>vectorLength</code> setting.
   *
   */
  @JSProperty("length")
  double getLength();

  /**
   * (Highcharts, Highstock) The length of the vector. The rendered length
   * will relate to the <code>vectorLength</code> setting.
   *
   */
  @JSProperty("length")
  void setLength(double value);

  /**
   * (Highcharts, Highstock) The low or minimum value for each data point.
   *
   */
  @JSProperty("low")
  double getLow();

  /**
   * (Highcharts, Highstock) The low or minimum value for each data point.
   *
   */
  @JSProperty("low")
  void setLow(double value);

  /**
   * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
   *
   */
  @JSProperty("lowColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getLowColor();

  /**
   * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
   *
   */
  @JSProperty("lowColor")
  void setLowColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
   *
   */
  @JSProperty("lowColor")
  void setLowColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
   *
   */
  @JSProperty("lowColor")
  void setLowColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highcharts, Highstock) Options for the point markers of line-like
   * series.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Highcharts) The median for each data point. This is drawn as a line
   * through the middle area of the box.
   *
   */
  @JSProperty("median")
  double getMedian();

  /**
   * (Highcharts) The median for each data point. This is drawn as a line
   * through the middle area of the box.
   *
   */
  @JSProperty("median")
  void setMedian(double value);

  /**
   * (Highcharts) The dash style of the median.
   *
   */
  @JSProperty("medianDashStyle")
  @Nullable
  MedianDashStyle getMedianDashStyle();

  /**
   * (Highcharts) The dash style of the median.
   *
   */
  @JSProperty("medianDashStyle")
  void setMedianDashStyle(@Nullable MedianDashStyle value);

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabels, etc.
   *
   */
  @JSProperty("name")
  @Nullable
  Unknown /* ( number | string ) */ getName();

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabels, etc.
   *
   */
  @JSProperty("name")
  void setName(double value);

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabels, etc.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Highstock) The opening value of each data point.
   *
   */
  @JSProperty("open")
  double getOpen();

  /**
   * (Highstock) The opening value of each data point.
   *
   */
  @JSProperty("open")
  void setOpen(double value);

  /**
   * (Highcharts) Only for treemap. Use this option to build a tree structure.
   * The value should be the id of the point which is the parent. If no points
   * has a matching id, or this option is undefined, then the parent will be
   * set to the root.
   *
   */
  @JSProperty("parent")
  @Nullable
  String getParent();

  /**
   * (Highcharts) Only for treemap. Use this option to build a tree structure.
   * The value should be the id of the point which is the parent. If no points
   * has a matching id, or this option is undefined, then the parent will be
   * set to the root.
   *
   */
  @JSProperty("parent")
  void setParent(@Nullable String value);

  /**
   * (Highcharts, Highmaps) Point padding for a single point.
   *
   */
  @JSProperty("pointPadding")
  double getPointPadding();

  /**
   * (Highcharts, Highmaps) Point padding for a single point.
   *
   */
  @JSProperty("pointPadding")
  void setPointPadding(double value);

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * the column or bar. Overrides pointWidth on the series.
   *
   */
  @JSProperty("pointWidth")
  double getPointWidth();

  /**
   * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
   * the column or bar. Overrides pointWidth on the series.
   *
   */
  @JSProperty("pointWidth")
  void setPointWidth(double value);

  /**
   * (Highcharts) The lower quartile for each data point. This is the bottom
   * of the box.
   *
   */
  @JSProperty("q1")
  double getQ1();

  /**
   * (Highcharts) The lower quartile for each data point. This is the bottom
   * of the box.
   *
   */
  @JSProperty("q1")
  void setQ1(double value);

  /**
   * (Highcharts) The higher quartile for each data point. This is the top of
   * the box.
   *
   */
  @JSProperty("q3")
  double getQ3();

  /**
   * (Highcharts) The higher quartile for each data point. This is the top of
   * the box.
   *
   */
  @JSProperty("q3")
  void setQ3(double value);

  /**
   * (Highcharts) The outer radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   */
  @JSProperty("radius")
  @Nullable
  Unknown /* ( number | string ) */ getRadius();

  /**
   * (Highcharts) The outer radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts) The outer radius of an individual point in a solid gauge.
   * Can be given as a number (pixels) or percentage string.
   *
   */
  @JSProperty("radius")
  void setRadius(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   */
  @JSProperty("selected")
  boolean getSelected();

  /**
   * (Highcharts, Highstock, Gantt) Whether the data point is selected
   * initially.
   *
   */
  @JSProperty("selected")
  void setSelected(boolean value);

  /**
   * (Highcharts) The set or sets the options will be applied to. If a single
   * entry is defined, then it will create a new set. If more than one entry
   * is defined, then it will define the overlap between the sets in the
   * array.
   *
   */
  @JSProperty("sets")
  @Nullable
  String[] getSets();

  /**
   * (Highcharts) The set or sets the options will be applied to. If a single
   * entry is defined, then it will create a new set. If more than one entry
   * is defined, then it will define the overlap between the sets in the
   * array.
   *
   */
  @JSProperty("sets")
  void setSets(String... value);

  /**
   * (Highcharts) Whether to display a slice offset from the center.
   *
   */
  @JSProperty("sliced")
  boolean getSliced();

  /**
   * (Highcharts) Whether to display a slice offset from the center.
   *
   */
  @JSProperty("sliced")
  void setSliced(boolean value);

  /**
   * (Highcharts) The dash style of the stem.
   *
   */
  @JSProperty("stemDashStyle")
  @Nullable
  StemDashStyle getStemDashStyle();

  /**
   * (Highcharts) The dash style of the stem.
   *
   */
  @JSProperty("stemDashStyle")
  void setStemDashStyle(@Nullable StemDashStyle value);

  /**
   * (Highcharts) The target value of a point.
   *
   */
  @JSProperty("target")
  double getTarget();

  /**
   * (Highcharts) The target value of a point.
   *
   */
  @JSProperty("target")
  void setTarget(double value);

  /**
   * (Highcharts) Individual target options for each point.
   *
   */
  @JSProperty("targetOptions")
  @Nullable
  SeriesBulletDataTargetOptions getTargetOptions();

  /**
   * (Highcharts) Individual target options for each point.
   *
   */
  @JSProperty("targetOptions")
  void setTargetOptions(@Nullable SeriesBulletDataTargetOptions value);

  /**
   * (Highstock) The longer text to be shown in the flag's tooltip.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highstock) The longer text to be shown in the flag's tooltip.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highstock) The short text to be shown on the flag.
   *
   */
  @JSProperty("title")
  @Nullable
  String getTitle();

  /**
   * (Highstock) The short text to be shown on the flag.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable String value);

  /**
   * (Highcharts) The node that the link runs to.
   *
   */
  @JSProperty("to")
  @Nullable
  String getTo();

  /**
   * (Highcharts) The node that the link runs to.
   *
   */
  @JSProperty("to")
  void setTo(@Nullable String value);

  /**
   * (Highcharts, Highstock) The wind speed in meters per second.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock) The wind speed in meters per second.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * (Highcharts) The weighting of a word. The weight decides the relative
   * size of a word compared to the rest of the collection.
   *
   */
  @JSProperty("weight")
  double getWeight();

  /**
   * (Highcharts) The weighting of a word. The weight decides the relative
   * size of a word compared to the rest of the collection.
   *
   */
  @JSProperty("weight")
  void setWeight(double value);

  /**
   * (Highcharts) The dash style of the whiskers.
   *
   */
  @JSProperty("whiskerDashStyle")
  @Nullable
  WhiskerDashStyle getWhiskerDashStyle();

  /**
   * (Highcharts) The dash style of the whiskers.
   *
   */
  @JSProperty("whiskerDashStyle")
  void setWhiskerDashStyle(@Nullable WhiskerDashStyle value);

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock) The x value of the point. For datetime axes, the
   * X value is the timestamp in milliseconds since 1970.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock) The y value of the point.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts) The relative width for each column. On a category axis, the
   * widths are distributed so they sum up to the X axis length. On linear and
   * datetime axes, the columns will be laid out from the X value and Z units
   * along the axis.
   *
   */
  @JSProperty("z")
  double getZ();

  /**
   * (Highcharts) The relative width for each column. On a category axis, the
   * widths are distributed so they sum up to the X axis length. On linear and
   * datetime axes, the columns will be laid out from the X value and Z units
   * along the axis.
   *
   */
  @JSProperty("z")
  void setZ(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointOptionsObject object = Any.empty();

    private Builder() {
    }

    public PointOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts) Accessibility options for a data point.
     *
     */
    public Builder accessibility(@Nullable PointAccessibilityOptionsObject value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the border surrounding the column or
     * bar.
     *
     * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the border surrounding the column or
     * bar.
     *
     * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the border surrounding the column or
     * bar.
     *
     * In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The width of the border surrounding the column or
     * bar.
     *
     * In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
     * rule.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) The dash style of the box.
     *
     */
    public Builder boxDashStyle(@Nullable BoxDashStyle value) {
      object.setBoxDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) An additional, individual class name for the data
     * point's graphic representation.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highstock) The closing value of each data point.
     *
     */
    public Builder close(double value) {
      object.setClose(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual color for the point. By default
     * the color is pulled from the global <code>colors</code> array.
     *
     * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
     * <code>colorIndex</code>.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual color for the point. By default
     * the color is pulled from the global <code>colors</code> array.
     *
     * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
     * <code>colorIndex</code>.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual color for the point. By default
     * the color is pulled from the global <code>colors</code> array.
     *
     * In styled mode, the <code>color</code> option doesn't take effect. Instead, use
     * <code>colorIndex</code>.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) A specific color index to use for the point, so its
     * graphic representations are given the class name <code>highcharts-color-{n}</code>.
     * In styled mode this will change the color of the graphic. In non-styled
     * mode, the color by is set by the <code>fill</code> attribute, so the change in class
     * name won't have a visual effect by default.
     *
     */
    public Builder colorIndex(double value) {
      object.setColorIndex(value);
      return this;
    }

    /**
     * (Highcharts) Serves a purpose only if a <code>colorAxis</code> object is defined in
     * the chart options. This value will decide which color the point gets from
     * the scale of the colorAxis.
     *
     */
    public Builder colorValue(double value) {
      object.setColorValue(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Color of the line that connects the dumbbell
     * point's values. By default it is the series' color.
     *
     */
    public Builder connectorColor(@Nullable String value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Pixel width of the line that connects the
     * dumbbell point's values.
     *
     */
    public Builder connectorWidth(double value) {
      object.setConnectorWidth(value);
      return this;
    }

    /**
     * (Highcharts) A reserved subspace to store options and values for
     * customized functionality. Here you can add additional data for your own
     * event callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
      return this;
    }

    /**
     * (Highcharts) A name for the dash style to use for the column or bar.
     * Overrides dashStyle on the series.
     *
     * In styled mode, the stroke dash-array can be set with the same classes as
     * listed under data.color.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesSunburstDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(SeriesSunburstDataLabelsOptionsObject... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable DataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesNetworkgraphDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(SeriesPackedBubbleDataLabelsOptionsObject... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(DataLabelsOptions... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesPackedBubbleDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(SeriesNetworkgraphDataLabelsOptionsObject... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesPieDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) A description of the point to add to the screen reader
     * information about the point.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The wind direction in degrees, where 0 is north
     * (pointing towards south).
     *
     */
    public Builder direction(double value) {
      object.setDirection(value);
      return this;
    }

    /**
     * (Highcharts) Point specific options for the draggable-points module.
     * Overrides options on <code>series.dragDrop</code>.
     *
     */
    public Builder dragDrop(@Nullable SeriesLineDataDragDropOptions value) {
      object.setDragDrop(value);
      return this;
    }

    /**
     * (Highcharts) The <code>id</code> of a series in the drilldown.series array to use
     * for a drilldown for this point.
     *
     */
    public Builder drilldown(@Nullable String value) {
      object.setDrilldown(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The individual point events.
     *
     */
    public Builder events(@Nullable PointEventsOptionsObject value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highstock) The fill color of an individual flag. By default it inherits
     * from the series color.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highstock) The fill color of an individual flag. By default it inherits
     * from the series color.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highstock) The fill color of an individual flag. By default it inherits
     * from the series color.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts) The node that the link runs from.
     *
     */
    public Builder from(@Nullable String value) {
      object.setFrom(value);
      return this;
    }

    /**
     * (Highcharts) By deafult sides fill is set to a gradient through this
     * option being set to <code>true</code>. Set to <code>false</code> to get solid color for the
     * sides.
     *
     */
    public Builder gradientForSides(boolean value) {
      object.setGradientForSides(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The high or maximum value for each data point.
     *
     */
    public Builder high(double value) {
      object.setHigh(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An id for the point. This can be used
     * after render time to get a pointer to the point object through
     * <code>chart.get()</code>.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts) The inner radius of an individual point in a solid gauge.
     * Can be given as a number (pixels) or percentage string.
     *
     */
    public Builder innerRadius(double value) {
      object.setInnerRadius(value);
      return this;
    }

    /**
     * (Highcharts) The inner radius of an individual point in a solid gauge.
     * Can be given as a number (pixels) or percentage string.
     *
     */
    public Builder innerRadius(@Nullable String value) {
      object.setInnerRadius(value);
      return this;
    }

    /**
     * (Highcharts) When this property is true, the points acts as a summary
     * column for the values added or substracted since the last intermediate
     * sum, or since the start of the series. The <code>y</code> value is ignored.
     *
     */
    public Builder isIntermediateSum(boolean value) {
      object.setIsIntermediateSum(value);
      return this;
    }

    /**
     * (Highcharts) When this property is true, the point display the total sum
     * across the entire series. The <code>y</code> value is ignored.
     *
     */
    public Builder isSum(boolean value) {
      object.setIsSum(value);
      return this;
    }

    /**
     * (Highcharts) The label of event.
     *
     */
    public Builder label(@Nullable String value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highcharts) The rank for this point's data label in case of collision.
     * If two data labels are about to overlap, only the one with the highest
     * <code>labelrank</code> will be drawn.
     *
     */
    public Builder labelrank(double value) {
      object.setLabelrank(value);
      return this;
    }

    /**
     * (Highcharts) The sequential index of the data point in the legend.
     *
     */
    public Builder legendIndex(double value) {
      object.setLegendIndex(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The length of the vector. The rendered length
     * will relate to the <code>vectorLength</code> setting.
     *
     */
    public Builder length(double value) {
      object.setLength(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The low or minimum value for each data point.
     *
     */
    public Builder low(double value) {
      object.setLow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
     *
     */
    public Builder lowColor(@Nullable PatternObject value) {
      object.setLowColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
     *
     */
    public Builder lowColor(@Nullable String value) {
      object.setLowColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
     *
     */
    public Builder lowColor(@Nullable GradientColorObject value) {
      object.setLowColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Options for the point markers of line-like
     * series.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highcharts) The median for each data point. This is drawn as a line
     * through the middle area of the box.
     *
     */
    public Builder median(double value) {
      object.setMedian(value);
      return this;
    }

    /**
     * (Highcharts) The dash style of the median.
     *
     */
    public Builder medianDashStyle(@Nullable MedianDashStyle value) {
      object.setMedianDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) The name of the point as shown in the legend, tooltip,
     * dataLabels, etc.
     *
     */
    public Builder name(double value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highcharts) The name of the point as shown in the legend, tooltip,
     * dataLabels, etc.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highstock) The opening value of each data point.
     *
     */
    public Builder open(double value) {
      object.setOpen(value);
      return this;
    }

    /**
     * (Highcharts) Only for treemap. Use this option to build a tree structure.
     * The value should be the id of the point which is the parent. If no points
     * has a matching id, or this option is undefined, then the parent will be
     * set to the root.
     *
     */
    public Builder parent(@Nullable String value) {
      object.setParent(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Point padding for a single point.
     *
     */
    public Builder pointPadding(double value) {
      object.setPointPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
     * the column or bar. Overrides pointWidth on the series.
     *
     */
    public Builder pointWidth(double value) {
      object.setPointWidth(value);
      return this;
    }

    /**
     * (Highcharts) The lower quartile for each data point. This is the bottom
     * of the box.
     *
     */
    public Builder q1(double value) {
      object.setQ1(value);
      return this;
    }

    /**
     * (Highcharts) The higher quartile for each data point. This is the top of
     * the box.
     *
     */
    public Builder q3(double value) {
      object.setQ3(value);
      return this;
    }

    /**
     * (Highcharts) The outer radius of an individual point in a solid gauge.
     * Can be given as a number (pixels) or percentage string.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Highcharts) The outer radius of an individual point in a solid gauge.
     * Can be given as a number (pixels) or percentage string.
     *
     */
    public Builder radius(@Nullable String value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether the data point is selected
     * initially.
     *
     */
    public Builder selected(boolean value) {
      object.setSelected(value);
      return this;
    }

    /**
     * (Highcharts) The set or sets the options will be applied to. If a single
     * entry is defined, then it will create a new set. If more than one entry
     * is defined, then it will define the overlap between the sets in the
     * array.
     *
     */
    public Builder sets(String... value) {
      object.setSets(value);
      return this;
    }

    /**
     * (Highcharts) Whether to display a slice offset from the center.
     *
     */
    public Builder sliced(boolean value) {
      object.setSliced(value);
      return this;
    }

    /**
     * (Highcharts) The dash style of the stem.
     *
     */
    public Builder stemDashStyle(@Nullable StemDashStyle value) {
      object.setStemDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) The target value of a point.
     *
     */
    public Builder target(double value) {
      object.setTarget(value);
      return this;
    }

    /**
     * (Highcharts) Individual target options for each point.
     *
     */
    public Builder targetOptions(@Nullable SeriesBulletDataTargetOptions value) {
      object.setTargetOptions(value);
      return this;
    }

    /**
     * (Highstock) The longer text to be shown in the flag's tooltip.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highstock) The short text to be shown on the flag.
     *
     */
    public Builder title(@Nullable String value) {
      object.setTitle(value);
      return this;
    }

    /**
     * (Highcharts) The node that the link runs to.
     *
     */
    public Builder to(@Nullable String value) {
      object.setTo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The wind speed in meters per second.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }

    /**
     * (Highcharts) The weighting of a word. The weight decides the relative
     * size of a word compared to the rest of the collection.
     *
     */
    public Builder weight(double value) {
      object.setWeight(value);
      return this;
    }

    /**
     * (Highcharts) The dash style of the whiskers.
     *
     */
    public Builder whiskerDashStyle(@Nullable WhiskerDashStyle value) {
      object.setWhiskerDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The x value of the point. For datetime axes, the
     * X value is the timestamp in milliseconds since 1970.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The y value of the point.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }

    /**
     * (Highcharts) The relative width for each column. On a category axis, the
     * widths are distributed so they sum up to the X axis length. On linear and
     * datetime axes, the columns will be laid out from the X value and Z units
     * along the axis.
     *
     */
    public Builder z(double value) {
      object.setZ(value);
      return this;
    }
  }
}
