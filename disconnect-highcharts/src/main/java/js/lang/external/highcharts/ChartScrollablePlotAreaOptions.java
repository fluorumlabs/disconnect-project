package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Gantt) Options for a scrollable plot area. This feature provides
 * a minimum size for the plot area of the chart. If the size gets smaller than
 * this, typically on mobile devices, a native browser scrollbar is presented.
 * This scrollbar provides smooth scrolling for the contents of the plot area,
 * whereas the title, legend and unaffected axes are fixed.
 *
 * Since v7.1.2, a scrollable plot area can be defined for either horizontal or
 * vertical scrolling, depending on whether the <code>minWidth</code> or <code>minHeight</code> option
 * is set.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartScrollablePlotAreaOptions extends Any {
  /**
   * (Highcharts, Gantt) The minimum height for the plot area. If it gets
   * smaller than this, the plot area will become scrollable.
   *
   */
  @JSProperty("minHeight")
  double getMinHeight();

  /**
   * (Highcharts, Gantt) The minimum height for the plot area. If it gets
   * smaller than this, the plot area will become scrollable.
   *
   */
  @JSProperty("minHeight")
  void setMinHeight(double value);

  /**
   * (Highcharts, Gantt) The minimum width for the plot area. If it gets
   * smaller than this, the plot area will become scrollable.
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highcharts, Gantt) The minimum width for the plot area. If it gets
   * smaller than this, the plot area will become scrollable.
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);

  /**
   * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
   * the plot area.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
   * the plot area.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
   * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
   * aligns it to the right. Typically we would use 1 if the chart has right
   * aligned Y axes.
   *
   */
  @JSProperty("scrollPositionX")
  double getScrollPositionX();

  /**
   * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
   * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
   * aligns it to the right. Typically we would use 1 if the chart has right
   * aligned Y axes.
   *
   */
  @JSProperty("scrollPositionX")
  void setScrollPositionX(double value);

  /**
   * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
   * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
   * aligns it to the bottom.
   *
   */
  @JSProperty("scrollPositionY")
  double getScrollPositionY();

  /**
   * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
   * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
   * aligns it to the bottom.
   *
   */
  @JSProperty("scrollPositionY")
  void setScrollPositionY(double value);

  class Builder {
    private final ChartScrollablePlotAreaOptions object = Any.empty();

    public ChartScrollablePlotAreaOptions build() {
      return object;
    }

    /**
     * (Highcharts, Gantt) The minimum height for the plot area. If it gets
     * smaller than this, the plot area will become scrollable.
     *
     */
    public Builder minHeight(double value) {
      object.setMinHeight(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) The minimum width for the plot area. If it gets
     * smaller than this, the plot area will become scrollable.
     *
     */
    public Builder minWidth(double value) {
      object.setMinWidth(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
     * the plot area.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
     * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
     * aligns it to the right. Typically we would use 1 if the chart has right
     * aligned Y axes.
     *
     */
    public Builder scrollPositionX(double value) {
      object.setScrollPositionX(value);
      return this;
    }

    /**
     * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
     * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
     * aligns it to the bottom.
     *
     */
    public Builder scrollPositionY(double value) {
      object.setScrollPositionY(value);
      return this;
    }
  }
}
