package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigatorHandlesOptions extends Any {
  /**
   * (Highstock, Gantt) The fill for the handle.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highstock, Gantt) The fill for the handle.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The fill for the handle.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The fill for the handle.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The stroke for the handle border and the stripes
   * inside.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highstock, Gantt) The stroke for the handle border and the stripes
   * inside.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The stroke for the handle border and the stripes
   * inside.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The stroke for the handle border and the stripes
   * inside.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) Allows to enable/disable handles.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock, Gantt) Allows to enable/disable handles.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock, Gantt) Height for handles.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock, Gantt) Height for handles.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock, Gantt) The width for the handle border and the stripes
   * inside.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock, Gantt) The width for the handle border and the stripes
   * inside.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
   * 1-index for right.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   */
  @JSProperty("symbols")
  @Nullable
  String[] getSymbols();

  /**
   * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
   * 1-index for right.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   */
  @JSProperty("symbols")
  void setSymbols(String[] value);

  /**
   * (Highstock, Gantt) Width for handles.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highstock, Gantt) Width for handles.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  class Builder {
    private final NavigatorHandlesOptions object = Any.empty();

    public NavigatorHandlesOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) The fill for the handle.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The fill for the handle.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The fill for the handle.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The stroke for the handle border and the stripes
     * inside.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The stroke for the handle border and the stripes
     * inside.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The stroke for the handle border and the stripes
     * inside.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Allows to enable/disable handles.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Height for handles.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The width for the handle border and the stripes
     * inside.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
     * 1-index for right.
     *
     * Additionally, the URL to a graphic can be given on this form:
     * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     *
     * Custom callbacks for symbol path generation can also be added to
     * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
     * its method name, as shown in the demo.
     *
     */
    public Builder symbols(String[] value) {
      object.setSymbols(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Width for handles.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
