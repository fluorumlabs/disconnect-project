package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Gantt) An array of data points for the series. For
 * the <code>xrange</code> series type, points can be given in the following ways:
 *
 * <ol>
 * <li>An array of objects with named values. The objects are point configuration
 * objects as seen below. (see online documentation for example)</li>
 * </ol>
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface XrangePointOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Accessibility options for a data point.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  PointAccessibilityOptionsObject getAccessibility();

  /**
   * (Highcharts, Highstock, Gantt) Accessibility options for a data point.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable PointAccessibilityOptionsObject value);

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
   * (Gantt) Connect to a point. This option can be either a string, referring
   * to the ID of another point, or an object, or an array of either. If the
   * option is an array, each element defines a connection.
   *
   */
  @JSProperty("connect")
  @Nullable
  Unknown /* ( string | XrangePointConnectorsOptionsObject | Array < ( string | XrangePointConnectorsOptionsObject ) > ) */ getConnect(
      );

  /**
   * (Gantt) Connect to a point. This option can be either a string, referring
   * to the ID of another point, or an object, or an array of either. If the
   * option is an array, each element defines a connection.
   *
   */
  @JSProperty("connect")
  void setConnect(@Nullable XrangePointConnectorsOptionsObject value);

  /**
   * (Gantt) Connect to a point. This option can be either a string, referring
   * to the ID of another point, or an object, or an array of either. If the
   * option is an array, each element defines a connection.
   *
   */
  @JSProperty("connect")
  void setConnect(XrangePointConnectorsOptionsObject... value);

  /**
   * (Gantt) Connect to a point. This option can be either a string, referring
   * to the ID of another point, or an object, or an array of either. If the
   * option is an array, each element defines a connection.
   *
   */
  @JSProperty("connect")
  void setConnect(@Nullable String value);

  /**
   * (Gantt) Connect to a point. This option can be either a string, referring
   * to the ID of another point, or an object, or an array of either. If the
   * option is an array, each element defines a connection.
   *
   */
  @JSProperty("connect")
  void setConnect(String... value);

  /**
   * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
   * values for customized functionality. Here you can add additional data for
   * your own event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  @Nullable
  Dictionary<Any> getCustom();

  /**
   * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
   * values for customized functionality. Here you can add additional data for
   * your own event callbacks and formatter callbacks.
   *
   */
  @JSProperty("custom")
  void setCustom(@Nullable Dictionary<Any> value);

  /**
   * (Highcharts, Highstock, Gantt) Individual data label for each point. The
   * options are the same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( DataLabelsOptions | Array < DataLabelsOptions > ) */ getDataLabels();

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
  void setDataLabels(DataLabelsOptions... value);

  /**
   * (Highcharts, Highstock, Gantt) A description of the point to add to the
   * screen reader information about the point.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Gantt) A description of the point to add to the
   * screen reader information about the point.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
   *
   */
  @JSProperty("dragDrop")
  @Nullable
  SeriesLineDataDragDropOptions getDragDrop();

  /**
   * (Highcharts, Highstock, Gantt) Point specific options for the
   * draggable-points module. Overrides options on <code>series.dragDrop</code>.
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
   * (Highcharts, Highstock, Gantt) The rank for this point's data label in
   * case of collision. If two data labels are about to overlap, only the one
   * with the highest <code>labelrank</code> will be drawn.
   *
   */
  @JSProperty("labelrank")
  double getLabelrank();

  /**
   * (Highcharts, Highstock, Gantt) The rank for this point's data label in
   * case of collision. If two data labels are about to overlap, only the one
   * with the highest <code>labelrank</code> will be drawn.
   *
   */
  @JSProperty("labelrank")
  void setLabelrank(double value);

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
   * (Highcharts, Highstock, Gantt) The name of the point as shown in the
   * legend, tooltip, dataLabels, etc.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts, Highstock, Gantt) The name of the point as shown in the
   * legend, tooltip, dataLabels, etc.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
   *
   */
  @JSProperty("partialFill")
  @Nullable
  XrangePointPartialFillOptionsObject getPartialFill();

  /**
   * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
   * used to visualize how much of a task is performed. The partial fill
   * object can be set either on series or point level.
   *
   */
  @JSProperty("partialFill")
  void setPartialFill(@Nullable XrangePointPartialFillOptionsObject value);

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
   * (Highcharts, Highstock, Gantt) The starting X value of the range point.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Gantt) The starting X value of the range point.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Gantt) The ending X value of the range point.
   *
   */
  @JSProperty("x2")
  double getX2();

  /**
   * (Highcharts, Highstock, Gantt) The ending X value of the range point.
   *
   */
  @JSProperty("x2")
  void setX2(double value);

  /**
   * (Highcharts, Highstock, Gantt) The Y value of the range point.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Gantt) The Y value of the range point.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final XrangePointOptionsObject object = Any.empty();

    private Builder() {
    }

    public XrangePointOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Accessibility options for a data point.
     *
     */
    public Builder accessibility(@Nullable PointAccessibilityOptionsObject value) {
      object.setAccessibility(value);
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
     * (Gantt) Connect to a point. This option can be either a string, referring
     * to the ID of another point, or an object, or an array of either. If the
     * option is an array, each element defines a connection.
     *
     */
    public Builder connect(@Nullable XrangePointConnectorsOptionsObject value) {
      object.setConnect(value);
      return this;
    }

    /**
     * (Gantt) Connect to a point. This option can be either a string, referring
     * to the ID of another point, or an object, or an array of either. If the
     * option is an array, each element defines a connection.
     *
     */
    public Builder connect(XrangePointConnectorsOptionsObject... value) {
      object.setConnect(value);
      return this;
    }

    /**
     * (Gantt) Connect to a point. This option can be either a string, referring
     * to the ID of another point, or an object, or an array of either. If the
     * option is an array, each element defines a connection.
     *
     */
    public Builder connect(@Nullable String value) {
      object.setConnect(value);
      return this;
    }

    /**
     * (Gantt) Connect to a point. This option can be either a string, referring
     * to the ID of another point, or an object, or an array of either. If the
     * option is an array, each element defines a connection.
     *
     */
    public Builder connect(String... value) {
      object.setConnect(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
     * values for customized functionality. Here you can add additional data for
     * your own event callbacks and formatter callbacks.
     *
     */
    public Builder custom(@Nullable Dictionary<Any> value) {
      object.setCustom(value);
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
    public Builder dataLabels(DataLabelsOptions... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A description of the point to add to the
     * screen reader information about the point.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Point specific options for the
     * draggable-points module. Overrides options on <code>series.dragDrop</code>.
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
     * (Highcharts, Highstock, Gantt) The rank for this point's data label in
     * case of collision. If two data labels are about to overlap, only the one
     * with the highest <code>labelrank</code> will be drawn.
     *
     */
    public Builder labelrank(double value) {
      object.setLabelrank(value);
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
     * (Highcharts, Highstock, Gantt) The name of the point as shown in the
     * legend, tooltip, dataLabels, etc.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
     * used to visualize how much of a task is performed. The partial fill
     * object can be set either on series or point level.
     *
     */
    public Builder partialFill(@Nullable XrangePointPartialFillOptionsObject value) {
      object.setPartialFill(value);
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
     * (Highcharts, Highstock, Gantt) The starting X value of the range point.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The ending X value of the range point.
     *
     */
    public Builder x2(double value) {
      object.setX2(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The Y value of the range point.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
