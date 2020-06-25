package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( Function | SeriesCheckboxClickCallbackFunction ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) General event handlers for the series items. These event hooks
 * can also be attached to the series at run time using the
 * <code>Highcharts.addEvent</code> function.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesEventsOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Fires after the series has finished its
   * initial animation, or in case animation is disabled, immediately as the
   * series is displayed.
   *
   */
  @JSProperty("afterAnimate")
  @Nullable
  SeriesAfterAnimateCallbackFunction getAfterAnimate();

  /**
   * (Highcharts, Highstock, Gantt) Fires after the series has finished its
   * initial animation, or in case animation is disabled, immediately as the
   * series is displayed.
   *
   */
  @JSProperty("afterAnimate")
  void setAfterAnimate(@Nullable SeriesAfterAnimateCallbackFunction value);

  /**
   * (Highstock) Fires when the checkbox next to the series' name in the
   * legend is clicked. One parameter, <code>event</code>, is passed to the function. The
   * state of the checkbox is found by <code>event.checked</code>. The checked item is
   * found by <code>event.item</code>. Return <code>false</code> to prevent the default action which
   * is to toggle the select state of the series.
   *
   */
  @JSProperty("checkboxClick")
  @Nullable
  Unknown /* ( Function | SeriesCheckboxClickCallbackFunction ) */ getCheckboxClick();

  /**
   * (Highstock) Fires when the checkbox next to the series' name in the
   * legend is clicked. One parameter, <code>event</code>, is passed to the function. The
   * state of the checkbox is found by <code>event.checked</code>. The checked item is
   * found by <code>event.item</code>. Return <code>false</code> to prevent the default action which
   * is to toggle the select state of the series.
   *
   */
  @JSProperty("checkboxClick")
  void setCheckboxClick(@Nullable SeriesCheckboxClickCallbackFunction value);

  /**
   * (Highstock) Fires when the checkbox next to the series' name in the
   * legend is clicked. One parameter, <code>event</code>, is passed to the function. The
   * state of the checkbox is found by <code>event.checked</code>. The checked item is
   * found by <code>event.item</code>. Return <code>false</code> to prevent the default action which
   * is to toggle the select state of the series.
   *
   */
  @JSProperty("checkboxClick")
  void setCheckboxClick(@Nullable JsFunction value);

  /**
   * (Highstock) Fires when the series is clicked. One parameter, <code>event</code>, is
   * passed to the function, containing common event information.
   * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
   * graph.
   *
   */
  @JSProperty("click")
  @Nullable
  SeriesClickCallbackFunction getClick();

  /**
   * (Highstock) Fires when the series is clicked. One parameter, <code>event</code>, is
   * passed to the function, containing common event information.
   * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
   * graph.
   *
   */
  @JSProperty("click")
  void setClick(@Nullable SeriesClickCallbackFunction value);

  /**
   * (Highstock) Fires when the series is hidden after chart generation time,
   * either by clicking the legend item or by calling <code>.hide()</code>.
   *
   */
  @JSProperty("hide")
  @Nullable
  SeriesHideCallbackFunction getHide();

  /**
   * (Highstock) Fires when the series is hidden after chart generation time,
   * either by clicking the legend item or by calling <code>.hide()</code>.
   *
   */
  @JSProperty("hide")
  void setHide(@Nullable SeriesHideCallbackFunction value);

  /**
   * (Highstock) Fires when the legend item belonging to the series is
   * clicked. One parameter, <code>event</code>, is passed to the function. The default
   * action is to toggle the visibility of the series. This can be prevented
   * by returning <code>false</code> or calling <code>event.preventDefault()</code>.
   *
   */
  @JSProperty("legendItemClick")
  @Nullable
  SeriesLegendItemClickCallbackFunction getLegendItemClick();

  /**
   * (Highstock) Fires when the legend item belonging to the series is
   * clicked. One parameter, <code>event</code>, is passed to the function. The default
   * action is to toggle the visibility of the series. This can be prevented
   * by returning <code>false</code> or calling <code>event.preventDefault()</code>.
   *
   */
  @JSProperty("legendItemClick")
  void setLegendItemClick(@Nullable SeriesLegendItemClickCallbackFunction value);

  /**
   * (Highstock) Fires when the mouse leaves the graph. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * If the stickyTracking option is true, <code>mouseOut</code> doesn't happen before
   * the mouse enters another graph or leaves the plot area.
   *
   */
  @JSProperty("mouseOut")
  @Nullable
  SeriesMouseOutCallbackFunction getMouseOut();

  /**
   * (Highstock) Fires when the mouse leaves the graph. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   * If the stickyTracking option is true, <code>mouseOut</code> doesn't happen before
   * the mouse enters another graph or leaves the plot area.
   *
   */
  @JSProperty("mouseOut")
  void setMouseOut(@Nullable SeriesMouseOutCallbackFunction value);

  /**
   * (Highstock) Fires when the mouse enters the graph. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   *
   */
  @JSProperty("mouseOver")
  @Nullable
  SeriesMouseOverCallbackFunction getMouseOver();

  /**
   * (Highstock) Fires when the mouse enters the graph. One parameter,
   * <code>event</code>, is passed to the function, containing common event information.
   *
   */
  @JSProperty("mouseOver")
  void setMouseOver(@Nullable SeriesMouseOverCallbackFunction value);

  /**
   * (Highcharts) Fires on a request for change of root node for the tree,
   * before the update is made. An event object is passed to the function,
   * containing additional properties <code>newRootId</code>, <code>previousRootId</code>, <code>redraw</code>
   * and <code>trigger</code>.
   *
   */
  @JSProperty("setRootNode")
  @Nullable
  JsFunction getSetRootNode();

  /**
   * (Highcharts) Fires on a request for change of root node for the tree,
   * before the update is made. An event object is passed to the function,
   * containing additional properties <code>newRootId</code>, <code>previousRootId</code>, <code>redraw</code>
   * and <code>trigger</code>.
   *
   */
  @JSProperty("setRootNode")
  void setSetRootNode(@Nullable JsFunction value);

  /**
   * (Highstock) Fires when the series is shown after chart generation time,
   * either by clicking the legend item or by calling <code>.show()</code>.
   *
   */
  @JSProperty("show")
  @Nullable
  SeriesShowCallbackFunction getShow();

  /**
   * (Highstock) Fires when the series is shown after chart generation time,
   * either by clicking the legend item or by calling <code>.show()</code>.
   *
   */
  @JSProperty("show")
  void setShow(@Nullable SeriesShowCallbackFunction value);

  class Builder {
    private final SeriesEventsOptionsObject object = Any.empty();

    public SeriesEventsOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Fires after the series has finished its
     * initial animation, or in case animation is disabled, immediately as the
     * series is displayed.
     *
     */
    public Builder afterAnimate(@Nullable SeriesAfterAnimateCallbackFunction value) {
      object.setAfterAnimate(value);
      return this;
    }

    /**
     * (Highstock) Fires when the checkbox next to the series' name in the
     * legend is clicked. One parameter, <code>event</code>, is passed to the function. The
     * state of the checkbox is found by <code>event.checked</code>. The checked item is
     * found by <code>event.item</code>. Return <code>false</code> to prevent the default action which
     * is to toggle the select state of the series.
     *
     */
    public Builder checkboxClick(@Nullable SeriesCheckboxClickCallbackFunction value) {
      object.setCheckboxClick(value);
      return this;
    }

    /**
     * (Highstock) Fires when the checkbox next to the series' name in the
     * legend is clicked. One parameter, <code>event</code>, is passed to the function. The
     * state of the checkbox is found by <code>event.checked</code>. The checked item is
     * found by <code>event.item</code>. Return <code>false</code> to prevent the default action which
     * is to toggle the select state of the series.
     *
     */
    public Builder checkboxClick(@Nullable JsFunction value) {
      object.setCheckboxClick(value);
      return this;
    }

    /**
     * (Highstock) Fires when the series is clicked. One parameter, <code>event</code>, is
     * passed to the function, containing common event information.
     * Additionally, <code>event.point</code> holds a pointer to the nearest point on the
     * graph.
     *
     */
    public Builder click(@Nullable SeriesClickCallbackFunction value) {
      object.setClick(value);
      return this;
    }

    /**
     * (Highstock) Fires when the series is hidden after chart generation time,
     * either by clicking the legend item or by calling <code>.hide()</code>.
     *
     */
    public Builder hide(@Nullable SeriesHideCallbackFunction value) {
      object.setHide(value);
      return this;
    }

    /**
     * (Highstock) Fires when the legend item belonging to the series is
     * clicked. One parameter, <code>event</code>, is passed to the function. The default
     * action is to toggle the visibility of the series. This can be prevented
     * by returning <code>false</code> or calling <code>event.preventDefault()</code>.
     *
     */
    public Builder legendItemClick(@Nullable SeriesLegendItemClickCallbackFunction value) {
      object.setLegendItemClick(value);
      return this;
    }

    /**
     * (Highstock) Fires when the mouse leaves the graph. One parameter,
     * <code>event</code>, is passed to the function, containing common event information.
     * If the stickyTracking option is true, <code>mouseOut</code> doesn't happen before
     * the mouse enters another graph or leaves the plot area.
     *
     */
    public Builder mouseOut(@Nullable SeriesMouseOutCallbackFunction value) {
      object.setMouseOut(value);
      return this;
    }

    /**
     * (Highstock) Fires when the mouse enters the graph. One parameter,
     * <code>event</code>, is passed to the function, containing common event information.
     *
     */
    public Builder mouseOver(@Nullable SeriesMouseOverCallbackFunction value) {
      object.setMouseOver(value);
      return this;
    }

    /**
     * (Highcharts) Fires on a request for change of root node for the tree,
     * before the update is made. An event object is passed to the function,
     * containing additional properties <code>newRootId</code>, <code>previousRootId</code>, <code>redraw</code>
     * and <code>trigger</code>.
     *
     */
    public Builder setRootNode(@Nullable JsFunction value) {
      object.setSetRootNode(value);
      return this;
    }

    /**
     * (Highstock) Fires when the series is shown after chart generation time,
     * either by clicking the legend item or by calling <code>.show()</code>.
     *
     */
    public Builder show(@Nullable SeriesShowCallbackFunction value) {
      object.setShow(value);
      return this;
    }
  }
}
