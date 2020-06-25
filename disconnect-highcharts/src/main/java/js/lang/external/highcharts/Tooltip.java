package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Tooltip of a chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Tooltip as Tooltip_Tooltip"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Tooltip extends Any {
  /**
   * Tooltip of a chart.
   *
   * @param chart
   * The chart instance.
   *
   * @param options
   * Tooltip options.
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Tooltip_Tooltip(chart, options)"
  )
  static Tooltip create(Chart chart, TooltipOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Chart of the tooltip.
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * Reference to the tooltip's container, when [Highcharts.Tooltip#outside]
   * is set to true, otherwise it's undefined.
   *
   */
  @JSProperty("container")
  @Nullable
  HTMLElement getContainer();

  /**
   * Reference to the tooltip's container, when [Highcharts.Tooltip#outside]
   * is set to true, otherwise it's undefined.
   *
   */
  @JSProperty("container")
  void setContainer(@Nullable HTMLElement value);

  /**
   * Used tooltip options.
   *
   */
  @JSProperty("options")
  TooltipOptions getOptions();

  /**
   * Whether to allow the tooltip to render outside the chart's SVG element
   * box. By default (false), the tooltip is rendered within the chart's SVG
   * element, which results in the tooltip being aligned inside the chart
   * area.
   *
   */
  @JSProperty("outside")
  boolean getOutside();

  /**
   * Reference to the tooltip's renderer, when [Highcharts.Tooltip#outside] is
   * set to true, otherwise it's undefined.
   *
   */
  @JSProperty("renderer")
  @Nullable
  SVGRenderer getRenderer();

  /**
   * Reference to the tooltip's renderer, when [Highcharts.Tooltip#outside] is
   * set to true, otherwise it's undefined.
   *
   */
  @JSProperty("renderer")
  void setRenderer(@Nullable SVGRenderer value);

  /**
   * When the tooltip is shared, the entire plot area will capture mouse
   * movement or touch events.
   *
   */
  @JSProperty("shared")
  boolean getShared();

  /**
   * True, if the tooltip is split into one label per series, with the header
   * close to the axis.
   *
   */
  @JSProperty("split")
  boolean getSplit();

  /**
   * In case no user defined formatter is given, this will be used. Note that
   * the context here is an object holding point, series, x, y etc.
   *
   */
  String[] defaultFormatter(Tooltip tooltip);

  /**
   * Removes and destroys the tooltip and its elements.
   *
   */
  void destroy();

  /**
   * Creates the Tooltip label element if it does not exist, then returns it.
   *
   */
  SVGElement getLabel();

  /**
   * Hides the tooltip with a fade out animation.
   *
   * @param delay
   * The fade out in milliseconds. If no value is provided the value of
   * the tooltip.hideDelay option is used. A value of 0 disables the
   * fade out animation.
   *
   */
  void hide(double delay);

  /**
   * Hides the tooltip with a fade out animation.
   *
   */
  void hide();

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   * @param mouseEvent
   * Mouse event, that is responsible for the refresh and should be
   * used for the tooltip update.
   *
   */
  void refresh(Point[] pointOrPoints, @Nullable PointerEventObject mouseEvent);

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   * @param mouseEvent
   * Mouse event, that is responsible for the refresh and should be
   * used for the tooltip update.
   *
   */
  void refresh(Point pointOrPoints, @Nullable PointerEventObject mouseEvent);

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   */
  void refresh(Point[] pointOrPoints);

  /**
   * Refresh the tooltip's text and position.
   *
   * @param pointOrPoints
   * Either a point or an array of points.
   *
   */
  void refresh(Point pointOrPoints);

  /**
   * Updates the tooltip with the provided tooltip options.
   *
   * @param options
   * The tooltip options to update.
   *
   */
  void update(TooltipOptions options);
}
