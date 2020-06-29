package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( 'auto' | 'default' | boolean ) */;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The front of the frame around a 3D chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Chart3dFrameFrontOptions extends Any {
  /**
   * (Highcharts) The color of the panel.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) The color of the panel.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the panel.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) The color of the panel.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The thickness of the panel.
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts) The thickness of the panel.
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
   * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
   * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
   * ignoring the point of view.
   *
   */
  @JSProperty("visible")
  @Nullable
  Unknown /* ( 'auto' | 'default' | boolean ) */ getVisible();

  /**
   * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
   * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
   * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
   * ignoring the point of view.
   *
   */
  @JSProperty("visible")
  void setVisible(boolean value);

  /**
   * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
   * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
   * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
   * ignoring the point of view.
   *
   */
  @JSProperty("visible")
  void setVisible(@Nullable Visible value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final Chart3dFrameFrontOptions object = Any.empty();

    private Builder() {
    }

    public Chart3dFrameFrontOptions build() {
      return object;
    }

    /**
     * (Highcharts) The color of the panel.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the panel.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the panel.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The thickness of the panel.
     *
     */
    public Builder size(double value) {
      object.setSize(value);
      return this;
    }

    /**
     * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
     * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
     * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
     * ignoring the point of view.
     *
     */
    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }

    /**
     * (Highcharts) Whether to display the frame. Possible values are <code>true</code>,
     * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data, and
     * <code>&quot;default&quot;</code> to display faces behind the data based on the axis layout,
     * ignoring the point of view.
     *
     */
    public Builder visible(@Nullable Visible value) {
      object.setVisible(value);
      return this;
    }
  }
}
