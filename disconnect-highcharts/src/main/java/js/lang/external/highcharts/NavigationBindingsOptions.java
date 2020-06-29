package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Bindings definitions for custom HTML buttons. Each
 * binding implements simple event-driven interface:
 *
 * <ul>
 * <li>
 * <code>className</code>: classname used to bind event to
 *
 * </li>
 * <li>
 * <code>init</code>: initial event, fired on button click
 *
 * </li>
 * <li>
 * <code>start</code>: fired on first click on a chart
 *
 * </li>
 * <li>
 * <code>steps</code>: array of sequential events fired one after another on each of
 * users clicks
 *
 * </li>
 * <li>
 * <code>end</code>: last event to be called after last step event
 *
 * </li>
 * </ul>
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationBindingsOptions extends Any {
  /**
   * (Highstock) A line with arrow annotation. Includes <code>start</code> and one event
   * in <code>steps</code> array.
   *
   */
  @JSProperty("arrowInfinityLine")
  @Nullable
  NavigationBindingsOptionsObject getArrowInfinityLine();

  /**
   * (Highstock) A line with arrow annotation. Includes <code>start</code> and one event
   * in <code>steps</code> array.
   *
   */
  @JSProperty("arrowInfinityLine")
  void setArrowInfinityLine(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A ray with an arrow annotation bindings. Includes <code>start</code> and
   * one event in <code>steps</code> array.
   *
   */
  @JSProperty("arrowRay")
  @Nullable
  NavigationBindingsOptionsObject getArrowRay();

  /**
   * (Highstock) A ray with an arrow annotation bindings. Includes <code>start</code> and
   * one event in <code>steps</code> array.
   *
   */
  @JSProperty("arrowRay")
  void setArrowRay(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A segment with an arrow annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("arrowSegment")
  @Nullable
  NavigationBindingsOptionsObject getArrowSegment();

  /**
   * (Highstock) A segment with an arrow annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("arrowSegment")
  void setArrowSegment(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highcharts, Highstock) A circle annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("circleAnnotation")
  @Nullable
  NavigationBindingsOptionsObject getCircleAnnotation();

  /**
   * (Highcharts, Highstock) A circle annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("circleAnnotation")
  void setCircleAnnotation(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Crooked line (three points) annotation bindings. Includes
   * <code>start</code> and two events in <code>steps</code> (for second and third points in crooked
   * line) array.
   *
   */
  @JSProperty("crooked3")
  @Nullable
  NavigationBindingsOptionsObject getCrooked3();

  /**
   * (Highstock) Crooked line (three points) annotation bindings. Includes
   * <code>start</code> and two events in <code>steps</code> (for second and third points in crooked
   * line) array.
   *
   */
  @JSProperty("crooked3")
  void setCrooked3(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Crooked line (five points) annotation bindings. Includes
   * <code>start</code> and four events in <code>steps</code> (for all consequent points in crooked
   * line) array.
   *
   */
  @JSProperty("crooked5")
  @Nullable
  NavigationBindingsOptionsObject getCrooked5();

  /**
   * (Highstock) Crooked line (five points) annotation bindings. Includes
   * <code>start</code> and four events in <code>steps</code> (for all consequent points in crooked
   * line) array.
   *
   */
  @JSProperty("crooked5")
  void setCrooked5(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Hides/shows two price indicators:
   *
   * <ul>
   * <li>
   * last price in the dataset
   *
   * </li>
   * <li>
   * last price in the selected range
   *
   * </li>
   * </ul>
   */
  @JSProperty("currentPriceIndicator")
  @Nullable
  NavigationBindingsOptionsObject getCurrentPriceIndicator();

  /**
   * (Highstock) Hides/shows two price indicators:
   *
   * <ul>
   * <li>
   * last price in the dataset
   *
   * </li>
   * <li>
   * last price in the selected range
   *
   * </li>
   * </ul>
   */
  @JSProperty("currentPriceIndicator")
  void setCurrentPriceIndicator(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Elliott wave (three points) annotation bindings. Includes
   * <code>start</code> and two events in <code>steps</code> (for second and third points) array.
   *
   */
  @JSProperty("elliott3")
  @Nullable
  NavigationBindingsOptionsObject getElliott3();

  /**
   * (Highstock) Elliott wave (three points) annotation bindings. Includes
   * <code>start</code> and two events in <code>steps</code> (for second and third points) array.
   *
   */
  @JSProperty("elliott3")
  void setElliott3(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Elliott wave (five points) annotation bindings. Includes
   * <code>start</code> and four event in <code>steps</code> (for all consequent points in Elliott
   * wave) array.
   *
   */
  @JSProperty("elliott5")
  @Nullable
  NavigationBindingsOptionsObject getElliott5();

  /**
   * (Highstock) Elliott wave (five points) annotation bindings. Includes
   * <code>start</code> and four event in <code>steps</code> (for all consequent points in Elliott
   * wave) array.
   *
   */
  @JSProperty("elliott5")
  void setElliott5(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A fibonacci annotation bindings. Includes <code>start</code> and two
   * events in <code>steps</code> array (updates second point, then height).
   *
   */
  @JSProperty("fibonacci")
  @Nullable
  NavigationBindingsOptionsObject getFibonacci();

  /**
   * (Highstock) A fibonacci annotation bindings. Includes <code>start</code> and two
   * events in <code>steps</code> array (updates second point, then height).
   *
   */
  @JSProperty("fibonacci")
  void setFibonacci(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag with <code>'circlepin'</code>
   * shape.
   *
   */
  @JSProperty("flagCirclepin")
  @Nullable
  NavigationBindingsOptionsObject getFlagCirclepin();

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag with <code>'circlepin'</code>
   * shape.
   *
   */
  @JSProperty("flagCirclepin")
  void setFlagCirclepin(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag with <code>'diamondpin'</code>
   * shape.
   *
   */
  @JSProperty("flagDiamondpin")
  @Nullable
  NavigationBindingsOptionsObject getFlagDiamondpin();

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag with <code>'diamondpin'</code>
   * shape.
   *
   */
  @JSProperty("flagDiamondpin")
  void setFlagDiamondpin(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag without pin shape.
   *
   */
  @JSProperty("flagSimplepin")
  @Nullable
  NavigationBindingsOptionsObject getFlagSimplepin();

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag without pin shape.
   *
   */
  @JSProperty("flagSimplepin")
  void setFlagSimplepin(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag with <code>'squarepin'</code>
   * shape.
   *
   */
  @JSProperty("flagSquarepin")
  @Nullable
  NavigationBindingsOptionsObject getFlagSquarepin();

  /**
   * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
   * finds the closest point and marks it with a flag with <code>'squarepin'</code>
   * shape.
   *
   */
  @JSProperty("flagSquarepin")
  void setFlagSquarepin(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Displays chart in fullscreen.
   *
   */
  @JSProperty("fullScreen")
  @Nullable
  NavigationBindingsOptionsObject getFullScreen();

  /**
   * (Highstock) Displays chart in fullscreen.
   *
   */
  @JSProperty("fullScreen")
  void setFullScreen(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A horizontal line annotation. Includes <code>start</code> event.
   *
   */
  @JSProperty("horizontalLine")
  @Nullable
  NavigationBindingsOptionsObject getHorizontalLine();

  /**
   * (Highstock) A horizontal line annotation. Includes <code>start</code> event.
   *
   */
  @JSProperty("horizontalLine")
  void setHorizontalLine(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Indicators bindings. Includes <code>init</code> event to show a popup.
   *
   * Note: In order to show base series from the chart in the popup's dropdown
   * each series requires series.id to be defined.
   *
   */
  @JSProperty("indicators")
  @Nullable
  NavigationBindingsOptionsObject getIndicators();

  /**
   * (Highstock) Indicators bindings. Includes <code>init</code> event to show a popup.
   *
   * Note: In order to show base series from the chart in the popup's dropdown
   * each series requires series.id to be defined.
   *
   */
  @JSProperty("indicators")
  void setIndicators(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A line annotation. Includes <code>start</code> and one event in <code>steps</code>
   * array.
   *
   */
  @JSProperty("infinityLine")
  @Nullable
  NavigationBindingsOptionsObject getInfinityLine();

  /**
   * (Highstock) A line annotation. Includes <code>start</code> and one event in <code>steps</code>
   * array.
   *
   */
  @JSProperty("infinityLine")
  void setInfinityLine(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highcharts, Highstock) A label annotation bindings. Includes <code>start</code>
   * event only.
   *
   */
  @JSProperty("labelAnnotation")
  @Nullable
  NavigationBindingsOptionsObject getLabelAnnotation();

  /**
   * (Highcharts, Highstock) A label annotation bindings. Includes <code>start</code>
   * event only.
   *
   */
  @JSProperty("labelAnnotation")
  void setLabelAnnotation(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A measure (x-dimension) annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("measureX")
  @Nullable
  NavigationBindingsOptionsObject getMeasureX();

  /**
   * (Highstock) A measure (x-dimension) annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("measureX")
  void setMeasureX(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A measure (xy-dimension) annotation bindings. Includes
   * <code>start</code> and one event in <code>steps</code> array.
   *
   */
  @JSProperty("measureXY")
  @Nullable
  NavigationBindingsOptionsObject getMeasureXY();

  /**
   * (Highstock) A measure (xy-dimension) annotation bindings. Includes
   * <code>start</code> and one event in <code>steps</code> array.
   *
   */
  @JSProperty("measureXY")
  void setMeasureXY(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A measure (y-dimension) annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("measureY")
  @Nullable
  NavigationBindingsOptionsObject getMeasureY();

  /**
   * (Highstock) A measure (y-dimension) annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("measureY")
  void setMeasureY(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
   * <code>start</code> and two events in <code>steps</code> array (updates second point, then
   * height).
   *
   */
  @JSProperty("parallelChannel")
  @Nullable
  NavigationBindingsOptionsObject getParallelChannel();

  /**
   * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
   * <code>start</code> and two events in <code>steps</code> array (updates second point, then
   * height).
   *
   */
  @JSProperty("parallelChannel")
  void setParallelChannel(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) An Andrew's pitchfork annotation bindings. Includes <code>start</code>
   * and two events in <code>steps</code> array (sets second and third control points).
   *
   */
  @JSProperty("pitchfork")
  @Nullable
  NavigationBindingsOptionsObject getPitchfork();

  /**
   * (Highstock) An Andrew's pitchfork annotation bindings. Includes <code>start</code>
   * and two events in <code>steps</code> array (sets second and third control points).
   *
   */
  @JSProperty("pitchfork")
  void setPitchfork(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A ray annotation bindings. Includes <code>start</code> and one event in
   * <code>steps</code> array.
   *
   */
  @JSProperty("ray")
  @Nullable
  NavigationBindingsOptionsObject getRay();

  /**
   * (Highstock) A ray annotation bindings. Includes <code>start</code> and one event in
   * <code>steps</code> array.
   *
   */
  @JSProperty("ray")
  void setRay(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highcharts, Highstock) A rectangle annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("rectangleAnnotation")
  @Nullable
  NavigationBindingsOptionsObject getRectangleAnnotation();

  /**
   * (Highcharts, Highstock) A rectangle annotation bindings. Includes <code>start</code>
   * and one event in <code>steps</code> array.
   *
   */
  @JSProperty("rectangleAnnotation")
  void setRectangleAnnotation(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Save a chart in localStorage under <code>highcharts-chart</code> key.
   * Stored items:
   *
   * <ul>
   * <li>
   * annotations
   *
   * </li>
   * <li>
   * indicators (with yAxes)
   *
   * </li>
   * <li>
   * flags
   *
   * </li>
   * </ul>
   */
  @JSProperty("saveChart")
  @Nullable
  NavigationBindingsOptionsObject getSaveChart();

  /**
   * (Highstock) Save a chart in localStorage under <code>highcharts-chart</code> key.
   * Stored items:
   *
   * <ul>
   * <li>
   * annotations
   *
   * </li>
   * <li>
   * indicators (with yAxes)
   *
   * </li>
   * <li>
   * flags
   *
   * </li>
   * </ul>
   */
  @JSProperty("saveChart")
  void setSaveChart(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A segment annotation bindings. Includes <code>start</code> and one event
   * in <code>steps</code> array.
   *
   */
  @JSProperty("segment")
  @Nullable
  NavigationBindingsOptionsObject getSegment();

  /**
   * (Highstock) A segment annotation bindings. Includes <code>start</code> and one event
   * in <code>steps</code> array.
   *
   */
  @JSProperty("segment")
  void setSegment(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Changes main series to <code>'candlestick'</code> type.
   *
   */
  @JSProperty("seriesTypeCandlestick")
  @Nullable
  NavigationBindingsOptionsObject getSeriesTypeCandlestick();

  /**
   * (Highstock) Changes main series to <code>'candlestick'</code> type.
   *
   */
  @JSProperty("seriesTypeCandlestick")
  void setSeriesTypeCandlestick(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Changes main series to <code>'line'</code> type.
   *
   */
  @JSProperty("seriesTypeLine")
  @Nullable
  NavigationBindingsOptionsObject getSeriesTypeLine();

  /**
   * (Highstock) Changes main series to <code>'line'</code> type.
   *
   */
  @JSProperty("seriesTypeLine")
  void setSeriesTypeLine(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Changes main series to <code>'ohlc'</code> type.
   *
   */
  @JSProperty("seriesTypeOhlc")
  @Nullable
  NavigationBindingsOptionsObject getSeriesTypeOhlc();

  /**
   * (Highstock) Changes main series to <code>'ohlc'</code> type.
   *
   */
  @JSProperty("seriesTypeOhlc")
  void setSeriesTypeOhlc(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Hides/shows all annotations on a chart.
   *
   */
  @JSProperty("toggleAnnotations")
  @Nullable
  NavigationBindingsOptionsObject getToggleAnnotations();

  /**
   * (Highstock) Hides/shows all annotations on a chart.
   *
   */
  @JSProperty("toggleAnnotations")
  void setToggleAnnotations(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A vertical arrow annotation bindings. Includes <code>start</code> event.
   * On click, finds the closest point and marks it with an arrow. Green arrow
   * when pointing from above, red when pointing from below the point.
   *
   */
  @JSProperty("verticalArrow")
  @Nullable
  NavigationBindingsOptionsObject getVerticalArrow();

  /**
   * (Highstock) A vertical arrow annotation bindings. Includes <code>start</code> event.
   * On click, finds the closest point and marks it with an arrow. Green arrow
   * when pointing from above, red when pointing from below the point.
   *
   */
  @JSProperty("verticalArrow")
  void setVerticalArrow(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A vertical counter annotation bindings. Includes <code>start</code>
   * event. On click, finds the closest point and marks it with a numeric
   * annotation - incrementing counter on each add.
   *
   */
  @JSProperty("verticalCounter")
  @Nullable
  NavigationBindingsOptionsObject getVerticalCounter();

  /**
   * (Highstock) A vertical counter annotation bindings. Includes <code>start</code>
   * event. On click, finds the closest point and marks it with a numeric
   * annotation - incrementing counter on each add.
   *
   */
  @JSProperty("verticalCounter")
  void setVerticalCounter(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A vertical arrow annotation bindings. Includes <code>start</code> event.
   * On click, finds the closest point and marks it with an arrow and a label
   * with value.
   *
   */
  @JSProperty("verticalLabel")
  @Nullable
  NavigationBindingsOptionsObject getVerticalLabel();

  /**
   * (Highstock) A vertical arrow annotation bindings. Includes <code>start</code> event.
   * On click, finds the closest point and marks it with an arrow and a label
   * with value.
   *
   */
  @JSProperty("verticalLabel")
  void setVerticalLabel(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) A vertical line annotation. Includes <code>start</code> event.
   *
   */
  @JSProperty("verticalLine")
  @Nullable
  NavigationBindingsOptionsObject getVerticalLine();

  /**
   * (Highstock) A vertical line annotation. Includes <code>start</code> event.
   *
   */
  @JSProperty("verticalLine")
  void setVerticalLine(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Enables zooming in xAxis on a chart. Includes <code>start</code> event
   * which changes chart.zoomType.
   *
   */
  @JSProperty("zoomX")
  @Nullable
  NavigationBindingsOptionsObject getZoomX();

  /**
   * (Highstock) Enables zooming in xAxis on a chart. Includes <code>start</code> event
   * which changes chart.zoomType.
   *
   */
  @JSProperty("zoomX")
  void setZoomX(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
   * <code>start</code> event which changes chart.zoomType.
   *
   */
  @JSProperty("zoomXY")
  @Nullable
  NavigationBindingsOptionsObject getZoomXY();

  /**
   * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
   * <code>start</code> event which changes chart.zoomType.
   *
   */
  @JSProperty("zoomXY")
  void setZoomXY(@Nullable NavigationBindingsOptionsObject value);

  /**
   * (Highstock) Enables zooming in yAxis on a chart. Includes <code>start</code> event
   * which changes chart.zoomType.
   *
   */
  @JSProperty("zoomY")
  @Nullable
  NavigationBindingsOptionsObject getZoomY();

  /**
   * (Highstock) Enables zooming in yAxis on a chart. Includes <code>start</code> event
   * which changes chart.zoomType.
   *
   */
  @JSProperty("zoomY")
  void setZoomY(@Nullable NavigationBindingsOptionsObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigationBindingsOptions object = Any.empty();

    private Builder() {
    }

    public NavigationBindingsOptions build() {
      return object;
    }

    /**
     * (Highstock) A line with arrow annotation. Includes <code>start</code> and one event
     * in <code>steps</code> array.
     *
     */
    public Builder arrowInfinityLine(@Nullable NavigationBindingsOptionsObject value) {
      object.setArrowInfinityLine(value);
      return this;
    }

    /**
     * (Highstock) A ray with an arrow annotation bindings. Includes <code>start</code> and
     * one event in <code>steps</code> array.
     *
     */
    public Builder arrowRay(@Nullable NavigationBindingsOptionsObject value) {
      object.setArrowRay(value);
      return this;
    }

    /**
     * (Highstock) A segment with an arrow annotation bindings. Includes <code>start</code>
     * and one event in <code>steps</code> array.
     *
     */
    public Builder arrowSegment(@Nullable NavigationBindingsOptionsObject value) {
      object.setArrowSegment(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A circle annotation bindings. Includes <code>start</code>
     * and one event in <code>steps</code> array.
     *
     */
    public Builder circleAnnotation(@Nullable NavigationBindingsOptionsObject value) {
      object.setCircleAnnotation(value);
      return this;
    }

    /**
     * (Highstock) Crooked line (three points) annotation bindings. Includes
     * <code>start</code> and two events in <code>steps</code> (for second and third points in crooked
     * line) array.
     *
     */
    public Builder crooked3(@Nullable NavigationBindingsOptionsObject value) {
      object.setCrooked3(value);
      return this;
    }

    /**
     * (Highstock) Crooked line (five points) annotation bindings. Includes
     * <code>start</code> and four events in <code>steps</code> (for all consequent points in crooked
     * line) array.
     *
     */
    public Builder crooked5(@Nullable NavigationBindingsOptionsObject value) {
      object.setCrooked5(value);
      return this;
    }

    /**
     * (Highstock) Hides/shows two price indicators:
     *
     * <ul>
     * <li>
     * last price in the dataset
     *
     * </li>
     * <li>
     * last price in the selected range
     *
     * </li>
     * </ul>
     */
    public Builder currentPriceIndicator(@Nullable NavigationBindingsOptionsObject value) {
      object.setCurrentPriceIndicator(value);
      return this;
    }

    /**
     * (Highstock) Elliott wave (three points) annotation bindings. Includes
     * <code>start</code> and two events in <code>steps</code> (for second and third points) array.
     *
     */
    public Builder elliott3(@Nullable NavigationBindingsOptionsObject value) {
      object.setElliott3(value);
      return this;
    }

    /**
     * (Highstock) Elliott wave (five points) annotation bindings. Includes
     * <code>start</code> and four event in <code>steps</code> (for all consequent points in Elliott
     * wave) array.
     *
     */
    public Builder elliott5(@Nullable NavigationBindingsOptionsObject value) {
      object.setElliott5(value);
      return this;
    }

    /**
     * (Highstock) A fibonacci annotation bindings. Includes <code>start</code> and two
     * events in <code>steps</code> array (updates second point, then height).
     *
     */
    public Builder fibonacci(@Nullable NavigationBindingsOptionsObject value) {
      object.setFibonacci(value);
      return this;
    }

    /**
     * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
     * finds the closest point and marks it with a flag with <code>'circlepin'</code>
     * shape.
     *
     */
    public Builder flagCirclepin(@Nullable NavigationBindingsOptionsObject value) {
      object.setFlagCirclepin(value);
      return this;
    }

    /**
     * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
     * finds the closest point and marks it with a flag with <code>'diamondpin'</code>
     * shape.
     *
     */
    public Builder flagDiamondpin(@Nullable NavigationBindingsOptionsObject value) {
      object.setFlagDiamondpin(value);
      return this;
    }

    /**
     * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
     * finds the closest point and marks it with a flag without pin shape.
     *
     */
    public Builder flagSimplepin(@Nullable NavigationBindingsOptionsObject value) {
      object.setFlagSimplepin(value);
      return this;
    }

    /**
     * (Highstock) A flag series bindings. Includes <code>start</code> event. On click,
     * finds the closest point and marks it with a flag with <code>'squarepin'</code>
     * shape.
     *
     */
    public Builder flagSquarepin(@Nullable NavigationBindingsOptionsObject value) {
      object.setFlagSquarepin(value);
      return this;
    }

    /**
     * (Highstock) Displays chart in fullscreen.
     *
     */
    public Builder fullScreen(@Nullable NavigationBindingsOptionsObject value) {
      object.setFullScreen(value);
      return this;
    }

    /**
     * (Highstock) A horizontal line annotation. Includes <code>start</code> event.
     *
     */
    public Builder horizontalLine(@Nullable NavigationBindingsOptionsObject value) {
      object.setHorizontalLine(value);
      return this;
    }

    /**
     * (Highstock) Indicators bindings. Includes <code>init</code> event to show a popup.
     *
     * Note: In order to show base series from the chart in the popup's dropdown
     * each series requires series.id to be defined.
     *
     */
    public Builder indicators(@Nullable NavigationBindingsOptionsObject value) {
      object.setIndicators(value);
      return this;
    }

    /**
     * (Highstock) A line annotation. Includes <code>start</code> and one event in <code>steps</code>
     * array.
     *
     */
    public Builder infinityLine(@Nullable NavigationBindingsOptionsObject value) {
      object.setInfinityLine(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A label annotation bindings. Includes <code>start</code>
     * event only.
     *
     */
    public Builder labelAnnotation(@Nullable NavigationBindingsOptionsObject value) {
      object.setLabelAnnotation(value);
      return this;
    }

    /**
     * (Highstock) A measure (x-dimension) annotation bindings. Includes <code>start</code>
     * and one event in <code>steps</code> array.
     *
     */
    public Builder measureX(@Nullable NavigationBindingsOptionsObject value) {
      object.setMeasureX(value);
      return this;
    }

    /**
     * (Highstock) A measure (xy-dimension) annotation bindings. Includes
     * <code>start</code> and one event in <code>steps</code> array.
     *
     */
    public Builder measureXY(@Nullable NavigationBindingsOptionsObject value) {
      object.setMeasureXY(value);
      return this;
    }

    /**
     * (Highstock) A measure (y-dimension) annotation bindings. Includes <code>start</code>
     * and one event in <code>steps</code> array.
     *
     */
    public Builder measureY(@Nullable NavigationBindingsOptionsObject value) {
      object.setMeasureY(value);
      return this;
    }

    /**
     * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
     * <code>start</code> and two events in <code>steps</code> array (updates second point, then
     * height).
     *
     */
    public Builder parallelChannel(@Nullable NavigationBindingsOptionsObject value) {
      object.setParallelChannel(value);
      return this;
    }

    /**
     * (Highstock) An Andrew's pitchfork annotation bindings. Includes <code>start</code>
     * and two events in <code>steps</code> array (sets second and third control points).
     *
     */
    public Builder pitchfork(@Nullable NavigationBindingsOptionsObject value) {
      object.setPitchfork(value);
      return this;
    }

    /**
     * (Highstock) A ray annotation bindings. Includes <code>start</code> and one event in
     * <code>steps</code> array.
     *
     */
    public Builder ray(@Nullable NavigationBindingsOptionsObject value) {
      object.setRay(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A rectangle annotation bindings. Includes <code>start</code>
     * and one event in <code>steps</code> array.
     *
     */
    public Builder rectangleAnnotation(@Nullable NavigationBindingsOptionsObject value) {
      object.setRectangleAnnotation(value);
      return this;
    }

    /**
     * (Highstock) Save a chart in localStorage under <code>highcharts-chart</code> key.
     * Stored items:
     *
     * <ul>
     * <li>
     * annotations
     *
     * </li>
     * <li>
     * indicators (with yAxes)
     *
     * </li>
     * <li>
     * flags
     *
     * </li>
     * </ul>
     */
    public Builder saveChart(@Nullable NavigationBindingsOptionsObject value) {
      object.setSaveChart(value);
      return this;
    }

    /**
     * (Highstock) A segment annotation bindings. Includes <code>start</code> and one event
     * in <code>steps</code> array.
     *
     */
    public Builder segment(@Nullable NavigationBindingsOptionsObject value) {
      object.setSegment(value);
      return this;
    }

    /**
     * (Highstock) Changes main series to <code>'candlestick'</code> type.
     *
     */
    public Builder seriesTypeCandlestick(@Nullable NavigationBindingsOptionsObject value) {
      object.setSeriesTypeCandlestick(value);
      return this;
    }

    /**
     * (Highstock) Changes main series to <code>'line'</code> type.
     *
     */
    public Builder seriesTypeLine(@Nullable NavigationBindingsOptionsObject value) {
      object.setSeriesTypeLine(value);
      return this;
    }

    /**
     * (Highstock) Changes main series to <code>'ohlc'</code> type.
     *
     */
    public Builder seriesTypeOhlc(@Nullable NavigationBindingsOptionsObject value) {
      object.setSeriesTypeOhlc(value);
      return this;
    }

    /**
     * (Highstock) Hides/shows all annotations on a chart.
     *
     */
    public Builder toggleAnnotations(@Nullable NavigationBindingsOptionsObject value) {
      object.setToggleAnnotations(value);
      return this;
    }

    /**
     * (Highstock) A vertical arrow annotation bindings. Includes <code>start</code> event.
     * On click, finds the closest point and marks it with an arrow. Green arrow
     * when pointing from above, red when pointing from below the point.
     *
     */
    public Builder verticalArrow(@Nullable NavigationBindingsOptionsObject value) {
      object.setVerticalArrow(value);
      return this;
    }

    /**
     * (Highstock) A vertical counter annotation bindings. Includes <code>start</code>
     * event. On click, finds the closest point and marks it with a numeric
     * annotation - incrementing counter on each add.
     *
     */
    public Builder verticalCounter(@Nullable NavigationBindingsOptionsObject value) {
      object.setVerticalCounter(value);
      return this;
    }

    /**
     * (Highstock) A vertical arrow annotation bindings. Includes <code>start</code> event.
     * On click, finds the closest point and marks it with an arrow and a label
     * with value.
     *
     */
    public Builder verticalLabel(@Nullable NavigationBindingsOptionsObject value) {
      object.setVerticalLabel(value);
      return this;
    }

    /**
     * (Highstock) A vertical line annotation. Includes <code>start</code> event.
     *
     */
    public Builder verticalLine(@Nullable NavigationBindingsOptionsObject value) {
      object.setVerticalLine(value);
      return this;
    }

    /**
     * (Highstock) Enables zooming in xAxis on a chart. Includes <code>start</code> event
     * which changes chart.zoomType.
     *
     */
    public Builder zoomX(@Nullable NavigationBindingsOptionsObject value) {
      object.setZoomX(value);
      return this;
    }

    /**
     * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
     * <code>start</code> event which changes chart.zoomType.
     *
     */
    public Builder zoomXY(@Nullable NavigationBindingsOptionsObject value) {
      object.setZoomXY(value);
      return this;
    }

    /**
     * (Highstock) Enables zooming in yAxis on a chart. Includes <code>start</code> event
     * which changes chart.zoomType.
     *
     */
    public Builder zoomY(@Nullable NavigationBindingsOptionsObject value) {
      object.setZoomY(value);
      return this;
    }
  }
}
