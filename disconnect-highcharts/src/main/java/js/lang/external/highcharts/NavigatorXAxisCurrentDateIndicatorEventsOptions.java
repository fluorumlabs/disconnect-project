package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) An object defining mouse events for the plot line. Supported
 * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorXAxisCurrentDateIndicatorEventsOptions extends Any {
  /**
   * (Gantt) Click event on a plot band.
   *
   */
  @JSProperty("click")
  @Nullable
  EventCallbackFunction<PlotLineOrBand> getClick();

  /**
   * (Gantt) Click event on a plot band.
   *
   */
  @JSProperty("click")
  void setClick(@Nullable EventCallbackFunction<PlotLineOrBand> value);

  /**
   * (Gantt) Mouse move event on a plot band.
   *
   */
  @JSProperty("mousemove")
  @Nullable
  EventCallbackFunction<PlotLineOrBand> getMousemove();

  /**
   * (Gantt) Mouse move event on a plot band.
   *
   */
  @JSProperty("mousemove")
  void setMousemove(@Nullable EventCallbackFunction<PlotLineOrBand> value);

  /**
   * (Gantt) Mouse out event on the corner of a plot band.
   *
   */
  @JSProperty("mouseout")
  @Nullable
  EventCallbackFunction<PlotLineOrBand> getMouseout();

  /**
   * (Gantt) Mouse out event on the corner of a plot band.
   *
   */
  @JSProperty("mouseout")
  void setMouseout(@Nullable EventCallbackFunction<PlotLineOrBand> value);

  /**
   * (Gantt) Mouse over event on a plot band.
   *
   */
  @JSProperty("mouseover")
  @Nullable
  EventCallbackFunction<PlotLineOrBand> getMouseover();

  /**
   * (Gantt) Mouse over event on a plot band.
   *
   */
  @JSProperty("mouseover")
  void setMouseover(@Nullable EventCallbackFunction<PlotLineOrBand> value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigatorXAxisCurrentDateIndicatorEventsOptions object = Any.empty();

    private Builder() {
    }

    public NavigatorXAxisCurrentDateIndicatorEventsOptions build() {
      return object;
    }

    /**
     * (Gantt) Click event on a plot band.
     *
     */
    public Builder click(@Nullable EventCallbackFunction<PlotLineOrBand> value) {
      object.setClick(value);
      return this;
    }

    /**
     * (Gantt) Mouse move event on a plot band.
     *
     */
    public Builder mousemove(@Nullable EventCallbackFunction<PlotLineOrBand> value) {
      object.setMousemove(value);
      return this;
    }

    /**
     * (Gantt) Mouse out event on the corner of a plot band.
     *
     */
    public Builder mouseout(@Nullable EventCallbackFunction<PlotLineOrBand> value) {
      object.setMouseout(value);
      return this;
    }

    /**
     * (Gantt) Mouse over event on a plot band.
     *
     */
    public Builder mouseover(@Nullable EventCallbackFunction<PlotLineOrBand> value) {
      object.setMouseover(value);
      return this;
    }
  }
}
