package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* string */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A configuration object for the tooltip rendering of each single
 * series. Properties are inherited from tooltip, but only the following
 * properties can be defined on a series level.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesTooltipOptionsObject extends Any {
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
   * (Highstock) The HTML of the cluster point's in the tooltip. Works only
   * with marker-clusters module and analogously to pointFormat.
   *
   * The cluster tooltip can be also formatted using <code>tooltip.formatter</code>
   * callback function and <code>point.isCluster</code> flag.
   *
   */
  @JSProperty("clusterFormat")
  @Nullable
  Any getClusterFormat();

  /**
   * (Highstock) The HTML of the cluster point's in the tooltip. Works only
   * with marker-clusters module and analogously to pointFormat.
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
   * (Highstock) Distance from point to tooltip in pixels.
   *
   */
  @JSProperty("distance")
  double getDistance();

  /**
   * (Highstock) Distance from point to tooltip in pixels.
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highstock) Whether the tooltip should follow the mouse as it moves
   * across columns, pie slices and other point types with an extent. By
   * default it behaves this way for pie, polygon, map, sankey and wordcloud
   * series by override in the <code>plotOptions</code> for those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   */
  @JSProperty("followPointer")
  boolean getFollowPointer();

  /**
   * (Highstock) Whether the tooltip should follow the mouse as it moves
   * across columns, pie slices and other point types with an extent. By
   * default it behaves this way for pie, polygon, map, sankey and wordcloud
   * series by override in the <code>plotOptions</code> for those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   */
  @JSProperty("followPointer")
  void setFollowPointer(boolean value);

  /**
   * (Highstock) Whether the tooltip should update as the finger moves on a
   * touch device. If this is <code>true</code> and chart.panning is
   * set,<code>followTouchMove</code> will take over one-finger touches, so the user
   * needs to use two fingers for zooming and panning.
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
   * (Highstock) Whether the tooltip should update as the finger moves on a
   * touch device. If this is <code>true</code> and chart.panning is
   * set,<code>followTouchMove</code> will take over one-finger touches, so the user
   * needs to use two fingers for zooming and panning.
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
   * (Highstock) A string to append to the tooltip format.
   *
   */
  @JSProperty("footerFormat")
  @Nullable
  String getFooterFormat();

  /**
   * (Highstock) A string to append to the tooltip format.
   *
   */
  @JSProperty("footerFormat")
  void setFooterFormat(@Nullable String value);

  /**
   * (Highstock) The HTML of the tooltip header line. Variables are enclosed
   * by curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
   * <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.
   * The <code>point.key</code> variable contains the category name, x value or datetime
   * string depending on the type of axis. For datetime axes, the <code>point.key</code>
   * date format can be set using <code>tooltip.xDateFormat</code>.
   *
   */
  @JSProperty("headerFormat")
  @Nullable
  String getHeaderFormat();

  /**
   * (Highstock) The HTML of the tooltip header line. Variables are enclosed
   * by curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
   * <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.
   * The <code>point.key</code> variable contains the category name, x value or datetime
   * string depending on the type of axis. For datetime axes, the <code>point.key</code>
   * date format can be set using <code>tooltip.xDateFormat</code>.
   *
   */
  @JSProperty("headerFormat")
  void setHeaderFormat(@Nullable String value);

  /**
   * (Highcharts) The format string specifying what to show for <em>nodes</em> in
   * tooltip of a diagram series, as opposed to links.
   *
   */
  @JSProperty("nodeFormat")
  @Nullable
  String getNodeFormat();

  /**
   * (Highcharts) The format string specifying what to show for <em>nodes</em> in
   * tooltip of a diagram series, as opposed to links.
   *
   */
  @JSProperty("nodeFormat")
  void setNodeFormat(@Nullable String value);

  /**
   * (Highcharts) A callback for defining the format for <em>nodes</em> in the
   * chart's tooltip, as opposed to links.
   *
   */
  @JSProperty("nodeFormatter")
  @Nullable
  FormatterCallbackFunction<SankeyNodeObject> getNodeFormatter();

  /**
   * (Highcharts) A callback for defining the format for <em>nodes</em> in the
   * chart's tooltip, as opposed to links.
   *
   */
  @JSProperty("nodeFormatter")
  void setNodeFormatter(@Nullable FormatterCallbackFunction<SankeyNodeObject> value);

  /**
   * (Highstock) The HTML of the null point's line in the tooltip. Works
   * analogously to pointFormat.
   *
   */
  @JSProperty("nullFormat")
  @Nullable
  String getNullFormat();

  /**
   * (Highstock) The HTML of the null point's line in the tooltip. Works
   * analogously to pointFormat.
   *
   */
  @JSProperty("nullFormat")
  void setNullFormat(@Nullable String value);

  /**
   * (Highstock) Callback function to format the text of the tooltip for
   * visible null points. Works analogously to formatter.
   *
   */
  @JSProperty("nullFormatter")
  @Nullable
  TooltipFormatterCallbackFunction getNullFormatter();

  /**
   * (Highstock) Callback function to format the text of the tooltip for
   * visible null points. Works analogously to formatter.
   *
   */
  @JSProperty("nullFormatter")
  void setNullFormatter(@Nullable TooltipFormatterCallbackFunction value);

  /**
   * (Highstock) The HTML of the point's line in the tooltip. Variables are
   * enclosed by curly brackets. Available variables are point.x, point.y,
   * series. name and series.color and other properties on the same form.
   * Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code> and
   * <code>tooltip.valueSuffix</code> variables. This can also be overridden for each
   * series, which makes it a good hook for displaying units.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   */
  @JSProperty("pointFormat")
  @Nullable
  String getPointFormat();

  /**
   * (Highstock) The HTML of the point's line in the tooltip. Variables are
   * enclosed by curly brackets. Available variables are point.x, point.y,
   * series. name and series.color and other properties on the same form.
   * Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code> and
   * <code>tooltip.valueSuffix</code> variables. This can also be overridden for each
   * series, which makes it a good hook for displaying units.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   */
  @JSProperty("pointFormat")
  void setPointFormat(@Nullable String value);

  /**
   * (Highstock) A callback function for formatting the HTML output for a
   * single point in the tooltip. Like the <code>pointFormat</code> string, but with more
   * flexibility.
   *
   */
  @JSProperty("pointFormatter")
  @Nullable
  FormatterCallbackFunction<Point> getPointFormatter();

  /**
   * (Highstock) A callback function for formatting the HTML output for a
   * single point in the tooltip. Like the <code>pointFormat</code> string, but with more
   * flexibility.
   *
   */
  @JSProperty("pointFormatter")
  void setPointFormatter(@Nullable FormatterCallbackFunction<Point> value);

  /**
   * (Highstock) Prevents the tooltip from switching or closing, when touched
   * or pointed.
   *
   */
  @JSProperty("stickOnContact")
  boolean getStickOnContact();

  /**
   * (Highstock) Prevents the tooltip from switching or closing, when touched
   * or pointed.
   *
   */
  @JSProperty("stickOnContact")
  void setStickOnContact(boolean value);

  /**
   * (Highstock) Number of decimals in indicator series.
   *
   */
  @JSProperty("valueDecimals")
  double getValueDecimals();

  /**
   * (Highstock) Number of decimals in indicator series.
   *
   */
  @JSProperty("valueDecimals")
  void setValueDecimals(double value);

  /**
   * (Highstock) A string to prepend to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   */
  @JSProperty("valuePrefix")
  @Nullable
  String getValuePrefix();

  /**
   * (Highstock) A string to prepend to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   */
  @JSProperty("valuePrefix")
  void setValuePrefix(@Nullable String value);

  /**
   * (Highstock) A string to append to each series' y value. Overridable in
   * each series' tooltip options object.
   *
   */
  @JSProperty("valueSuffix")
  @Nullable
  String getValueSuffix();

  /**
   * (Highstock) A string to append to each series' y value. Overridable in
   * each series' tooltip options object.
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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesTooltipOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesTooltipOptionsObject build() {
      return object;
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
     * (Highstock) The HTML of the cluster point's in the tooltip. Works only
     * with marker-clusters module and analogously to pointFormat.
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
     * (Highstock) Distance from point to tooltip in pixels.
     *
     */
    public Builder distance(double value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highstock) Whether the tooltip should follow the mouse as it moves
     * across columns, pie slices and other point types with an extent. By
     * default it behaves this way for pie, polygon, map, sankey and wordcloud
     * series by override in the <code>plotOptions</code> for those series types.
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
     * (Highstock) Whether the tooltip should update as the finger moves on a
     * touch device. If this is <code>true</code> and chart.panning is
     * set,<code>followTouchMove</code> will take over one-finger touches, so the user
     * needs to use two fingers for zooming and panning.
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
     * (Highstock) A string to append to the tooltip format.
     *
     */
    public Builder footerFormat(@Nullable String value) {
      object.setFooterFormat(value);
      return this;
    }

    /**
     * (Highstock) The HTML of the tooltip header line. Variables are enclosed
     * by curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
     * <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.
     * The <code>point.key</code> variable contains the category name, x value or datetime
     * string depending on the type of axis. For datetime axes, the <code>point.key</code>
     * date format can be set using <code>tooltip.xDateFormat</code>.
     *
     */
    public Builder headerFormat(@Nullable String value) {
      object.setHeaderFormat(value);
      return this;
    }

    /**
     * (Highcharts) The format string specifying what to show for <em>nodes</em> in
     * tooltip of a diagram series, as opposed to links.
     *
     */
    public Builder nodeFormat(@Nullable String value) {
      object.setNodeFormat(value);
      return this;
    }

    /**
     * (Highcharts) A callback for defining the format for <em>nodes</em> in the
     * chart's tooltip, as opposed to links.
     *
     */
    public Builder nodeFormatter(@Nullable FormatterCallbackFunction<SankeyNodeObject> value) {
      object.setNodeFormatter(value);
      return this;
    }

    /**
     * (Highstock) The HTML of the null point's line in the tooltip. Works
     * analogously to pointFormat.
     *
     */
    public Builder nullFormat(@Nullable String value) {
      object.setNullFormat(value);
      return this;
    }

    /**
     * (Highstock) Callback function to format the text of the tooltip for
     * visible null points. Works analogously to formatter.
     *
     */
    public Builder nullFormatter(@Nullable TooltipFormatterCallbackFunction value) {
      object.setNullFormatter(value);
      return this;
    }

    /**
     * (Highstock) The HTML of the point's line in the tooltip. Variables are
     * enclosed by curly brackets. Available variables are point.x, point.y,
     * series. name and series.color and other properties on the same form.
     * Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code> and
     * <code>tooltip.valueSuffix</code> variables. This can also be overridden for each
     * series, which makes it a good hook for displaying units.
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
     * (Highstock) A callback function for formatting the HTML output for a
     * single point in the tooltip. Like the <code>pointFormat</code> string, but with more
     * flexibility.
     *
     */
    public Builder pointFormatter(@Nullable FormatterCallbackFunction<Point> value) {
      object.setPointFormatter(value);
      return this;
    }

    /**
     * (Highstock) Prevents the tooltip from switching or closing, when touched
     * or pointed.
     *
     */
    public Builder stickOnContact(boolean value) {
      object.setStickOnContact(value);
      return this;
    }

    /**
     * (Highstock) Number of decimals in indicator series.
     *
     */
    public Builder valueDecimals(double value) {
      object.setValueDecimals(value);
      return this;
    }

    /**
     * (Highstock) A string to prepend to each series' y value. Overridable in
     * each series' tooltip options object.
     *
     */
    public Builder valuePrefix(@Nullable String value) {
      object.setValuePrefix(value);
      return this;
    }

    /**
     * (Highstock) A string to append to each series' y value. Overridable in
     * each series' tooltip options object.
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
