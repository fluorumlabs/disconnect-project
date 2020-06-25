package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | Array < SeriesOrganizationDataLabelsOptionsObject > | Array < SeriesSankeyDataLabelsOptionsObject > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) An array of data points for the series. For the <code>sankey</code> series
 * type, points can be given in the following way:
 *
 * An array of objects with named values. The following snippet shows only a few
 * settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available. (see
 * online documentation for example)
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesSankeyPointOptionsObject extends Any {
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
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) The color for the individual <em>link</em>. By default, the link
   * color is the same as the node it extends from. The <code>series.fillOpacity</code>
   * option also applies to the points, so when setting a specific link color,
   * consider setting the <code>fillOpacity</code> to 1.
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
   * (Highcharts) Individual data label for each point. The options are the
   * same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( DataLabelsOptions | SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | Array < SeriesOrganizationDataLabelsOptionsObject > | Array < SeriesSankeyDataLabelsOptionsObject > ) */ getDataLabels(
      );

  /**
   * (Highcharts) Individual data label for each point. The options are the
   * same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesSankeyDataLabelsOptionsObject[] value);

  /**
   * (Highcharts) Individual data label for each point. The options are the
   * same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesOrganizationDataLabelsOptionsObject value);

  /**
   * (Highcharts) Individual data label for each point. The options are the
   * same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable DataLabelsOptions value);

  /**
   * (Highcharts) Individual data label for each point. The options are the
   * same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesOrganizationDataLabelsOptionsObject[] value);

  /**
   * (Highcharts) Individual data label for each point. The options are the
   * same as the ones for plotOptions.series.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesSankeyDataLabelsOptionsObject value);

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
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabels, etc.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts) The name of the point as shown in the legend, tooltip,
   * dataLabels, etc.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * (Highcharts) Whether the link goes out of the system.
   *
   */
  @JSProperty("outgoing")
  boolean getOutgoing();

  /**
   * (Highcharts) Whether the link goes out of the system.
   *
   */
  @JSProperty("outgoing")
  void setOutgoing(boolean value);

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
   * (Highcharts) The weight of the link.
   *
   */
  @JSProperty("weight")
  double getWeight();

  /**
   * (Highcharts) The weight of the link.
   *
   */
  @JSProperty("weight")
  void setWeight(double value);

  class Builder {
    private final SeriesSankeyPointOptionsObject object = Any.empty();

    public SeriesSankeyPointOptionsObject build() {
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
     * (Highcharts, Gantt) An additional, individual class name for the data
     * point's graphic representation.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts) The color for the individual <em>link</em>. By default, the link
     * color is the same as the node it extends from. The <code>series.fillOpacity</code>
     * option also applies to the points, so when setting a specific link color,
     * consider setting the <code>fillOpacity</code> to 1.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color for the individual <em>link</em>. By default, the link
     * color is the same as the node it extends from. The <code>series.fillOpacity</code>
     * option also applies to the points, so when setting a specific link color,
     * consider setting the <code>fillOpacity</code> to 1.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color for the individual <em>link</em>. By default, the link
     * color is the same as the node it extends from. The <code>series.fillOpacity</code>
     * option also applies to the points, so when setting a specific link color,
     * consider setting the <code>fillOpacity</code> to 1.
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
     * (Highcharts) Individual data label for each point. The options are the
     * same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(SeriesSankeyDataLabelsOptionsObject[] value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Individual data label for each point. The options are the
     * same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesOrganizationDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Individual data label for each point. The options are the
     * same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable DataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Individual data label for each point. The options are the
     * same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(SeriesOrganizationDataLabelsOptionsObject[] value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Individual data label for each point. The options are the
     * same as the ones for plotOptions.series.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesSankeyDataLabelsOptionsObject value) {
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
     * (Highcharts, Highstock, Gantt) The individual point events.
     *
     */
    public Builder events(@Nullable PointEventsOptionsObject value) {
      object.setEvents(value);
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
     * (Highcharts) The name of the point as shown in the legend, tooltip,
     * dataLabels, etc.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    /**
     * (Highcharts) Whether the link goes out of the system.
     *
     */
    public Builder outgoing(boolean value) {
      object.setOutgoing(value);
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
     * (Highcharts) The node that the link runs to.
     *
     */
    public Builder to(@Nullable String value) {
      object.setTo(value);
      return this;
    }

    /**
     * (Highcharts) The weight of the link.
     *
     */
    public Builder weight(double value) {
      object.setWeight(value);
      return this;
    }
  }
}
