package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* Array < ( string | number ) > */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The pane serves as a container for axes and backgrounds for
 * circular gauges and polar charts.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PaneOptions extends Any {
  /**
   * (Highcharts) An array of background items for the pane.
   *
   */
  @JSProperty("background")
  @Nullable
  PaneBackgroundOptions[] getBackground();

  /**
   * (Highcharts) An array of background items for the pane.
   *
   */
  @JSProperty("background")
  void setBackground(PaneBackgroundOptions... value);

  /**
   * (Highcharts) The center of a polar chart or angular gauge, given as an
   * array of [x, y] positions. Positions can be given as integers that
   * transform to pixels, or as percentages of the plot area size.
   *
   */
  @JSProperty("center")
  @Nullable
  Unknown /* Array < ( string | number ) > */ getCenter();

  /**
   * (Highcharts) The center of a polar chart or angular gauge, given as an
   * array of [x, y] positions. Positions can be given as integers that
   * transform to pixels, or as percentages of the plot area size.
   *
   */
  @JSProperty("center")
  void setCenter(double... value);

  /**
   * (Highcharts) The center of a polar chart or angular gauge, given as an
   * array of [x, y] positions. Positions can be given as integers that
   * transform to pixels, or as percentages of the plot area size.
   *
   */
  @JSProperty("center")
  void setCenter(String... value);

  /**
   * (Highcharts) The end angle of the polar X axis or gauge value axis, given
   * in degrees where 0 is north. Defaults to startAngle
   *
   * <ul>
   * <li>
   * <ol start="360">
   * <li></li>
   * </ol>
   * </li>
   * </ul>
   */
  @JSProperty("endAngle")
  double getEndAngle();

  /**
   * (Highcharts) The end angle of the polar X axis or gauge value axis, given
   * in degrees where 0 is north. Defaults to startAngle
   *
   * <ul>
   * <li>
   * <ol start="360">
   * <li></li>
   * </ol>
   * </li>
   * </ul>
   */
  @JSProperty("endAngle")
  void setEndAngle(double value);

  /**
   * (Highcharts) The inner size of the pane, either as a number defining
   * pixels, or a percentage defining a percentage of the pane's size.
   *
   */
  @JSProperty("innerSize")
  @Nullable
  Unknown /* ( number | string ) */ getInnerSize();

  /**
   * (Highcharts) The inner size of the pane, either as a number defining
   * pixels, or a percentage defining a percentage of the pane's size.
   *
   */
  @JSProperty("innerSize")
  void setInnerSize(double value);

  /**
   * (Highcharts) The inner size of the pane, either as a number defining
   * pixels, or a percentage defining a percentage of the pane's size.
   *
   */
  @JSProperty("innerSize")
  void setInnerSize(@Nullable String value);

  /**
   * (Highcharts) The size of the pane, either as a number defining pixels, or
   * a percentage defining a percentage of the available plot area (the
   * smallest of the plot height or plot width).
   *
   */
  @JSProperty("size")
  @Nullable
  Unknown /* ( number | string ) */ getSize();

  /**
   * (Highcharts) The size of the pane, either as a number defining pixels, or
   * a percentage defining a percentage of the available plot area (the
   * smallest of the plot height or plot width).
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) The size of the pane, either as a number defining pixels, or
   * a percentage defining a percentage of the available plot area (the
   * smallest of the plot height or plot width).
   *
   */
  @JSProperty("size")
  void setSize(@Nullable String value);

  /**
   * (Highcharts) The start angle of the polar X axis or gauge axis, given in
   * degrees where 0 is north. Defaults to 0.
   *
   */
  @JSProperty("startAngle")
  double getStartAngle();

  /**
   * (Highcharts) The start angle of the polar X axis or gauge axis, given in
   * degrees where 0 is north. Defaults to 0.
   *
   */
  @JSProperty("startAngle")
  void setStartAngle(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PaneOptions object = Any.empty();

    private Builder() {
    }

    public PaneOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of background items for the pane.
     *
     */
    public Builder background(PaneBackgroundOptions... value) {
      object.setBackground(value);
      return this;
    }

    /**
     * (Highcharts) The center of a polar chart or angular gauge, given as an
     * array of [x, y] positions. Positions can be given as integers that
     * transform to pixels, or as percentages of the plot area size.
     *
     */
    public Builder center(double... value) {
      object.setCenter(value);
      return this;
    }

    /**
     * (Highcharts) The center of a polar chart or angular gauge, given as an
     * array of [x, y] positions. Positions can be given as integers that
     * transform to pixels, or as percentages of the plot area size.
     *
     */
    public Builder center(String... value) {
      object.setCenter(value);
      return this;
    }

    /**
     * (Highcharts) The end angle of the polar X axis or gauge value axis, given
     * in degrees where 0 is north. Defaults to startAngle
     *
     * <ul>
     * <li>
     * <ol start="360">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     */
    public Builder endAngle(double value) {
      object.setEndAngle(value);
      return this;
    }

    /**
     * (Highcharts) The inner size of the pane, either as a number defining
     * pixels, or a percentage defining a percentage of the pane's size.
     *
     */
    public Builder innerSize(double value) {
      object.setInnerSize(value);
      return this;
    }

    /**
     * (Highcharts) The inner size of the pane, either as a number defining
     * pixels, or a percentage defining a percentage of the pane's size.
     *
     */
    public Builder innerSize(@Nullable String value) {
      object.setInnerSize(value);
      return this;
    }

    /**
     * (Highcharts) The size of the pane, either as a number defining pixels, or
     * a percentage defining a percentage of the available plot area (the
     * smallest of the plot height or plot width).
     *
     */
    public Builder size(double value) {
      object.setSize(value);
      return this;
    }

    /**
     * (Highcharts) The size of the pane, either as a number defining pixels, or
     * a percentage defining a percentage of the available plot area (the
     * smallest of the plot height or plot width).
     *
     */
    public Builder size(@Nullable String value) {
      object.setSize(value);
      return this;
    }

    /**
     * (Highcharts) The start angle of the polar X axis or gauge axis, given in
     * degrees where 0 is north. Defaults to 0.
     *
     */
    public Builder startAngle(double value) {
      object.setStartAngle(value);
      return this;
    }
  }
}
