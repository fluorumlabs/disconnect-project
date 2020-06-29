package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Marker options for this chart's Pathfinder connectors. Note that this
 * option is overridden by the <code>startMarker</code> and <code>endMarker</code> options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ConnectorsMarkerOptions extends Any {
  /**
   * (Gantt) Horizontal alignment of the markers relative to the points.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Gantt) Horizontal alignment of the markers relative to the points.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Gantt) Set the color of the connector markers. By default this is the
   * same as the connector color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Gantt) Enable markers for the connectors.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable markers for the connectors.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Gantt) Set the height of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Gantt) Set the height of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Gantt) Whether or not to draw the markers inside the points.
   *
   */
  @JSProperty("inside")
  boolean getInside();

  /**
   * (Gantt) Whether or not to draw the markers inside the points.
   *
   */
  @JSProperty("inside")
  void setInside(boolean value);

  /**
   * (Gantt) Set the line/border color of the connector markers. By default
   * this is the same as the marker color.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Gantt) Set the line/border color of the connector markers. By default
   * this is the same as the marker color.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Gantt) Set the line/border width of the pathfinder markers.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Gantt) Set the line/border width of the pathfinder markers.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Gantt) Set the radius of the connector markers. The default is
   * automatically computed based on the algorithmMargin setting.
   *
   * Setting marker.width and marker.height will override this setting.
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Gantt) Set the radius of the connector markers. The default is
   * automatically computed based on the algorithmMargin setting.
   *
   * Setting marker.width and marker.height will override this setting.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Gantt) Vertical alignment of the markers relative to the points.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Gantt) Vertical alignment of the markers relative to the points.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Gantt) Set the width of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Gantt) Set the width of the connector markers. If not supplied, this is
   * inferred from the marker radius.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ConnectorsMarkerOptions object = Any.empty();

    private Builder() {
    }

    public ConnectorsMarkerOptions build() {
      return object;
    }

    /**
     * (Gantt) Horizontal alignment of the markers relative to the points.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Gantt) Set the color of the connector markers. By default this is the
     * same as the connector color.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Gantt) Set the color of the connector markers. By default this is the
     * same as the connector color.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Gantt) Set the color of the connector markers. By default this is the
     * same as the connector color.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Gantt) Enable markers for the connectors.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Gantt) Set the height of the connector markers. If not supplied, this is
     * inferred from the marker radius.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Gantt) Whether or not to draw the markers inside the points.
     *
     */
    public Builder inside(boolean value) {
      object.setInside(value);
      return this;
    }

    /**
     * (Gantt) Set the line/border color of the connector markers. By default
     * this is the same as the marker color.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Gantt) Set the line/border width of the pathfinder markers.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Gantt) Set the radius of the connector markers. The default is
     * automatically computed based on the algorithmMargin setting.
     *
     * Setting marker.width and marker.height will override this setting.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Gantt) Vertical alignment of the markers relative to the points.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Gantt) Set the width of the connector markers. If not supplied, this is
     * inferred from the marker radius.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
