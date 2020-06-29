package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* Array < ( Point | Series ) > */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The overview of the chart's series. The legend object is instanciated
 * internally in the chart constructor, and is available from the <code>chart.legend</code>
 * property. Each chart has only one legend.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"Legend as Legend_Legend"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Legend extends Any {
  /**
   * The overview of the chart's series. The legend object is instanciated
   * internally in the chart constructor, and is available from the
   * <code>chart.legend</code> property. Each chart has only one legend.
   *
   * @param chart
   * The chart instance.
   *
   * @param options
   * Legend options.
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Legend_Legend(chart, options)"
  )
  static Legend create(Chart chart, LegendOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * All items for the legend, which is an array of series for most series and
   * an array of points for pie series and its derivatives.
   *
   */
  @JSProperty("allItems")
  Unknown /* Array < ( Point | Series ) > */ getAllItems();

  /**
   * SVG element of the legend box.
   *
   */
  @JSProperty("box")
  SVGElement getBox();

  /**
   * Chart of this legend.
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * SVG group of the legend.
   *
   */
  @JSProperty("group")
  SVGElement getGroup();

  /**
   * Legend options.
   *
   */
  @JSProperty("options")
  LegendOptions getOptions();

  /**
   * SVG element of the legend title.
   *
   */
  @JSProperty("title")
  SVGElement getTitle();

  /**
   * Set the legend item text.
   *
   * @param item
   * The item for which to update the text in the legend.
   *
   */
  void setText(Series item);

  /**
   * Set the legend item text.
   *
   * @param item
   * The item for which to update the text in the legend.
   *
   */
  void setText(Point item);

  /**
   * Update the legend with new options. Equivalent to running <code>chart.update</code>
   * with a legend configuration option.
   *
   * @param options
   * Legend options.
   *
   * @param redraw
   * Whether to redraw the chart after the axis is altered. If doing
   * more operations on the chart, it is a good idea to set redraw to
   * false and call Chart#redraw after. Whether to redraw the chart.
   *
   * @fires Highcharts.Legends#afterUpdate
   *
   */
  void update(LegendOptions options, boolean redraw);

  /**
   * Update the legend with new options. Equivalent to running <code>chart.update</code>
   * with a legend configuration option.
   *
   * @param options
   * Legend options.
   *
   * @fires Highcharts.Legends#afterUpdate
   *
   */
  void update(LegendOptions options);
}
