package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) All options related with look and positiong of targets.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotBulletTargetOptions extends Any {
  /**
   * (Highcharts) The border color of the rectangle representing the target.
   * When not set, the point's border color is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The border color of the rectangle representing the target.
   * When not set, the point's border color is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts) The border width of the rectangle representing the target.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The border width of the rectangle representing the target.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The height of the rectangle representing the target.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts) The height of the rectangle representing the target.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts) The width of the rectangle representing the target. Could be
   * set as a pixel value or as a percentage of a column width.
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown /* ( number | string ) */ getWidth();

  /**
   * (Highcharts) The width of the rectangle representing the target. Could be
   * set as a pixel value or as a percentage of a column width.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts) The width of the rectangle representing the target. Could be
   * set as a pixel value or as a percentage of a column width.
   *
   */
  @JSProperty("width")
  void setWidth(@Nullable String value);

  class Builder {
    private final PlotBulletTargetOptions object = Any.empty();

    public PlotBulletTargetOptions build() {
      return object;
    }

    /**
     * (Highcharts) The border color of the rectangle representing the target.
     * When not set, the point's border color is used.
     *
     * In styled mode, use class <code>highcharts-bullet-target</code> instead.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts) The border width of the rectangle representing the target.
     *
     * In styled mode, use class <code>highcharts-bullet-target</code> instead.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts) The color of the rectangle representing the target. When not
     * set, point's color (if set in point's options - <code>color</code>) or zone of the
     * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
     * the point has is used.
     *
     * In styled mode, use class <code>highcharts-bullet-target</code> instead.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the rectangle representing the target. When not
     * set, point's color (if set in point's options - <code>color</code>) or zone of the
     * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
     * the point has is used.
     *
     * In styled mode, use class <code>highcharts-bullet-target</code> instead.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color of the rectangle representing the target. When not
     * set, point's color (if set in point's options - <code>color</code>) or zone of the
     * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
     * the point has is used.
     *
     * In styled mode, use class <code>highcharts-bullet-target</code> instead.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The height of the rectangle representing the target.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts) The width of the rectangle representing the target. Could be
     * set as a pixel value or as a percentage of a column width.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts) The width of the rectangle representing the target. Could be
     * set as a pixel value or as a percentage of a column width.
     *
     */
    public Builder width(@Nullable String value) {
      object.setWidth(value);
      return this;
    }
  }
}
