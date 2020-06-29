package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* PathfinderTypeValue */;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) The Pathfinder module allows you to define connections between any
 * two points, represented as lines - optionally with markers for the start
 * and/or end points. Multiple algorithms are available for calculating how the
 * connecting lines are drawn.
 *
 * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
 * charts, the connectors are used to draw dependencies between tasks.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ConnectorsOptions extends Any {
  /**
   * (Gantt) Set the default pathfinder margin to use, in pixels. Some
   * Pathfinder algorithms attempt to avoid obstacles, such as other points in
   * the chart. These algorithms use this margin to determine how close lines
   * can be to an obstacle. The default is to compute this automatically from
   * the size of the obstacles in the chart.
   *
   * To draw connecting lines close to existing points, set this to a low
   * number. For more space around existing points, set this number higher.
   *
   */
  @JSProperty("algorithmMargin")
  double getAlgorithmMargin();

  /**
   * (Gantt) Set the default pathfinder margin to use, in pixels. Some
   * Pathfinder algorithms attempt to avoid obstacles, such as other points in
   * the chart. These algorithms use this margin to determine how close lines
   * can be to an obstacle. The default is to compute this automatically from
   * the size of the obstacles in the chart.
   *
   * To draw connecting lines close to existing points, set this to a low
   * number. For more space around existing points, set this number higher.
   *
   */
  @JSProperty("algorithmMargin")
  void setAlgorithmMargin(double value);

  /**
   * (Gantt) Set the default dash style for this chart's connecting lines.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  String getDashStyle();

  /**
   * (Gantt) Set the default dash style for this chart's connecting lines.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable String value);

  /**
   * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Gantt) Marker options specific to the end markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   */
  @JSProperty("endMarker")
  @Nullable
  ConnectorsEndMarkerOptions getEndMarker();

  /**
   * (Gantt) Marker options specific to the end markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   */
  @JSProperty("endMarker")
  void setEndMarker(@Nullable ConnectorsEndMarkerOptions value);

  /**
   * (Gantt) Set the default color for this chart's Pathfinder connecting
   * lines. Defaults to the color of the point being connected.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Gantt) Set the default color for this chart's Pathfinder connecting
   * lines. Defaults to the color of the point being connected.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Gantt) Set the default pixel width for this chart's Pathfinder
   * connecting lines.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) Set the default pixel width for this chart's Pathfinder
   * connecting lines.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
   * this option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
   *
   */
  @JSProperty("marker")
  @Nullable
  ConnectorsMarkerOptions getMarker();

  /**
   * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
   * this option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable ConnectorsMarkerOptions value);

  /**
   * (Gantt) Marker options specific to the start markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   */
  @JSProperty("startMarker")
  @Nullable
  ConnectorsStartMarkerOptions getStartMarker();

  /**
   * (Gantt) Marker options specific to the start markers for this chart's
   * Pathfinder connectors. Overrides the generic marker options.
   *
   */
  @JSProperty("startMarker")
  void setStartMarker(@Nullable ConnectorsStartMarkerOptions value);

  /**
   * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
   * possible to define your own algorithms by adding them to the
   * Highcharts.Pathfinder.prototype.algorithms object before the chart has
   * been created.
   *
   * The default algorithms are as follows:
   *
   * <code>straight</code>: Draws a straight line between the connecting points. Does not
   * avoid other points when drawing.
   *
   * <code>simpleConnect</code>: Finds a path between the points using right angles only.
   * Takes only starting/ending points into account, and will not avoid other
   * points.
   *
   * <code>fastAvoid</code>: Finds a path between the points using right angles only.
   * Will attempt to avoid other points, but its focus is performance over
   * accuracy. Works well with less dense datasets.
   *
   * Default value: <code>straight</code> is used as default for most series types, while
   * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
   * between points.
   *
   */
  @JSProperty("type")
  @Nullable
  Unknown /* PathfinderTypeValue */ getType();

  /**
   * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
   * possible to define your own algorithms by adding them to the
   * Highcharts.Pathfinder.prototype.algorithms object before the chart has
   * been created.
   *
   * The default algorithms are as follows:
   *
   * <code>straight</code>: Draws a straight line between the connecting points. Does not
   * avoid other points when drawing.
   *
   * <code>simpleConnect</code>: Finds a path between the points using right angles only.
   * Takes only starting/ending points into account, and will not avoid other
   * points.
   *
   * <code>fastAvoid</code>: Finds a path between the points using right angles only.
   * Will attempt to avoid other points, but its focus is performance over
   * accuracy. Works well with less dense datasets.
   *
   * Default value: <code>straight</code> is used as default for most series types, while
   * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
   * between points.
   *
   */
  @JSProperty("type")
  void setType(@Nullable Type value);

  /**
   * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
   * possible to define your own algorithms by adding them to the
   * Highcharts.Pathfinder.prototype.algorithms object before the chart has
   * been created.
   *
   * The default algorithms are as follows:
   *
   * <code>straight</code>: Draws a straight line between the connecting points. Does not
   * avoid other points when drawing.
   *
   * <code>simpleConnect</code>: Finds a path between the points using right angles only.
   * Takes only starting/ending points into account, and will not avoid other
   * points.
   *
   * <code>fastAvoid</code>: Finds a path between the points using right angles only.
   * Will attempt to avoid other points, but its focus is performance over
   * accuracy. Works well with less dense datasets.
   *
   * Default value: <code>straight</code> is used as default for most series types, while
   * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
   * between points.
   *
   */
  @JSProperty("type")
  void setType(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type STRAIGHT = JsEnum.of("straight");

    public static final Type FASTAVOID = JsEnum.of("fastAvoid");

    public static final Type SIMPLECONNECT = JsEnum.of("simpleConnect");
  }

  final class Builder {
    private final ConnectorsOptions object = Any.empty();

    private Builder() {
    }

    public ConnectorsOptions build() {
      return object;
    }

    /**
     * (Gantt) Set the default pathfinder margin to use, in pixels. Some
     * Pathfinder algorithms attempt to avoid obstacles, such as other points in
     * the chart. These algorithms use this margin to determine how close lines
     * can be to an obstacle. The default is to compute this automatically from
     * the size of the obstacles in the chart.
     *
     * To draw connecting lines close to existing points, set this to a low
     * number. For more space around existing points, set this number higher.
     *
     */
    public Builder algorithmMargin(double value) {
      object.setAlgorithmMargin(value);
      return this;
    }

    /**
     * (Gantt) Set the default dash style for this chart's connecting lines.
     *
     */
    public Builder dashStyle(@Nullable String value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Gantt) Marker options specific to the end markers for this chart's
     * Pathfinder connectors. Overrides the generic marker options.
     *
     */
    public Builder endMarker(@Nullable ConnectorsEndMarkerOptions value) {
      object.setEndMarker(value);
      return this;
    }

    /**
     * (Gantt) Set the default color for this chart's Pathfinder connecting
     * lines. Defaults to the color of the point being connected.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Gantt) Set the default pixel width for this chart's Pathfinder
     * connecting lines.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
     * this option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
     *
     */
    public Builder marker(@Nullable ConnectorsMarkerOptions value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Gantt) Marker options specific to the start markers for this chart's
     * Pathfinder connectors. Overrides the generic marker options.
     *
     */
    public Builder startMarker(@Nullable ConnectorsStartMarkerOptions value) {
      object.setStartMarker(value);
      return this;
    }

    /**
     * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
     * possible to define your own algorithms by adding them to the
     * Highcharts.Pathfinder.prototype.algorithms object before the chart has
     * been created.
     *
     * The default algorithms are as follows:
     *
     * <code>straight</code>: Draws a straight line between the connecting points. Does not
     * avoid other points when drawing.
     *
     * <code>simpleConnect</code>: Finds a path between the points using right angles only.
     * Takes only starting/ending points into account, and will not avoid other
     * points.
     *
     * <code>fastAvoid</code>: Finds a path between the points using right angles only.
     * Will attempt to avoid other points, but its focus is performance over
     * accuracy. Works well with less dense datasets.
     *
     * Default value: <code>straight</code> is used as default for most series types, while
     * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
     * between points.
     *
     */
    public Builder type(@Nullable Type value) {
      object.setType(value);
      return this;
    }

    /**
     * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
     * possible to define your own algorithms by adding them to the
     * Highcharts.Pathfinder.prototype.algorithms object before the chart has
     * been created.
     *
     * The default algorithms are as follows:
     *
     * <code>straight</code>: Draws a straight line between the connecting points. Does not
     * avoid other points when drawing.
     *
     * <code>simpleConnect</code>: Finds a path between the points using right angles only.
     * Takes only starting/ending points into account, and will not avoid other
     * points.
     *
     * <code>fastAvoid</code>: Finds a path between the points using right angles only.
     * Will attempt to avoid other points, but its focus is performance over
     * accuracy. Works well with less dense datasets.
     *
     * Default value: <code>straight</code> is used as default for most series types, while
     * <code>simpleConnect</code> is used as default for Gantt series, to show dependencies
     * between points.
     *
     */
    public Builder type(@Nullable String value) {
      object.setType(value);
      return this;
    }
  }
}
