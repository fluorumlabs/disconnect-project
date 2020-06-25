package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
 * series as possible in a natural way, seeking to avoid other series. The goal
 * of this feature is to make the chart more easily readable, like if a human
 * designer placed the labels in the optimal position.
 *
 * The series labels currently work with series types having a <code>graph</code> or an
 * <code>area</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesLabelOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
   * the labels. Each item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.
   *
   */
  @JSProperty("boxesToAvoid")
  @Nullable
  LabelIntersectBoxObject[] getBoxesToAvoid();

  /**
   * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
   * the labels. Each item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.
   *
   */
  @JSProperty("boxesToAvoid")
  void setBoxesToAvoid(LabelIntersectBoxObject[] value);

  /**
   * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
   * graph if necessary, and draw a connector line to the graph. Setting this
   * option to true may decrease the performance significantly, since the
   * algorithm with systematically search for open spaces in the whole plot
   * area. Visually, it may also result in a more cluttered chart, though more
   * of the series will be labeled.
   *
   */
  @JSProperty("connectorAllowed")
  boolean getConnectorAllowed();

  /**
   * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
   * graph if necessary, and draw a connector line to the graph. Setting this
   * option to true may decrease the performance significantly, since the
   * algorithm with systematically search for open spaces in the whole plot
   * area. Visually, it may also result in a more cluttered chart, though more
   * of the series will be labeled.
   *
   */
  @JSProperty("connectorAllowed")
  void setConnectorAllowed(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) If the label is closer than this to a
   * neighbour graph, draw a connector.
   *
   */
  @JSProperty("connectorNeighbourDistance")
  double getConnectorNeighbourDistance();

  /**
   * (Highcharts, Highstock, Gantt) If the label is closer than this to a
   * neighbour graph, draw a connector.
   *
   */
  @JSProperty("connectorNeighbourDistance")
  void setConnectorNeighbourDistance(double value);

  /**
   * (Highcharts, Highstock, Gantt) Enable the series label per series.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable the series label per series.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) A format string for the label, with
   * support for a subset of HTML. Variables are enclosed by curly brackets.
   * Available variables are <code>name</code>, <code>options.xxx</code>, <code>color</code> and other members
   * from the <code>series</code> object. Use this option also to set a static text for
   * the label.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock, Gantt) A format string for the label, with
   * support for a subset of HTML. Variables are enclosed by curly brackets.
   * Available variables are <code>name</code>, <code>options.xxx</code>, <code>color</code> and other members
   * from the <code>series</code> object. Use this option also to set a static text for
   * the label.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) Callback function to format each of the
   * series' labels. The <code>this</code> keyword refers to the series object. By
   * default the <code>formatter</code> is undefined and the <code>series.name</code> is rendered.
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<Series> getFormatter();

  /**
   * (Highcharts, Highstock, Gantt) Callback function to format each of the
   * series' labels. The <code>this</code> keyword refers to the series object. By
   * default the <code>formatter</code> is undefined and the <code>series.name</code> is rendered.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable FormatterCallbackFunction<Series> value);

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   */
  @JSProperty("maxFontSize")
  double getMaxFontSize();

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   */
  @JSProperty("maxFontSize")
  void setMaxFontSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   */
  @JSProperty("minFontSize")
  double getMinFontSize();

  /**
   * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
   * to vary so that small areas get a smaller font size. The default applies
   * this effect to area-like series but not line-like series.
   *
   */
  @JSProperty("minFontSize")
  void setMinFontSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
   * series. By default it is drawn on the area. Set it to <code>false</code> to draw it
   * next to the graph instead.
   *
   */
  @JSProperty("onArea")
  boolean getOnArea();

  /**
   * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
   * series. By default it is drawn on the area. Set it to <code>false</code> to draw it
   * next to the graph instead.
   *
   */
  @JSProperty("onArea")
  void setOnArea(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Styles for the series label. The color
   * defaults to the series color, or a contrast color if <code>onArea</code>.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Gantt) Styles for the series label. The color
   * defaults to the series color, or a contrast color if <code>onArea</code>.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  class Builder {
    private final SeriesLabelOptionsObject object = Any.empty();

    public SeriesLabelOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
     * the labels. Each item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.
     *
     */
    public Builder boxesToAvoid(LabelIntersectBoxObject[] value) {
      object.setBoxesToAvoid(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
     * graph if necessary, and draw a connector line to the graph. Setting this
     * option to true may decrease the performance significantly, since the
     * algorithm with systematically search for open spaces in the whole plot
     * area. Visually, it may also result in a more cluttered chart, though more
     * of the series will be labeled.
     *
     */
    public Builder connectorAllowed(boolean value) {
      object.setConnectorAllowed(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) If the label is closer than this to a
     * neighbour graph, draw a connector.
     *
     */
    public Builder connectorNeighbourDistance(double value) {
      object.setConnectorNeighbourDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable the series label per series.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) A format string for the label, with
     * support for a subset of HTML. Variables are enclosed by curly brackets.
     * Available variables are <code>name</code>, <code>options.xxx</code>, <code>color</code> and other members
     * from the <code>series</code> object. Use this option also to set a static text for
     * the label.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Callback function to format each of the
     * series' labels. The <code>this</code> keyword refers to the series object. By
     * default the <code>formatter</code> is undefined and the <code>series.name</code> is rendered.
     *
     */
    public Builder formatter(@Nullable FormatterCallbackFunction<Series> value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
     * to vary so that small areas get a smaller font size. The default applies
     * this effect to area-like series but not line-like series.
     *
     */
    public Builder maxFontSize(double value) {
      object.setMaxFontSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
     * to vary so that small areas get a smaller font size. The default applies
     * this effect to area-like series but not line-like series.
     *
     */
    public Builder minFontSize(double value) {
      object.setMinFontSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
     * series. By default it is drawn on the area. Set it to <code>false</code> to draw it
     * next to the graph instead.
     *
     */
    public Builder onArea(boolean value) {
      object.setOnArea(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Styles for the series label. The color
     * defaults to the series color, or a contrast color if <code>onArea</code>.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }
  }
}
