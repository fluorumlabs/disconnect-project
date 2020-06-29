package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Configuration hash for the data label and tooltip formatters.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointLabelObject extends Any {
  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * The point's current color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * The point's current color index, used in styled mode instead of <code>color</code>.
   * The color index is inserted in class names used for styling.
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * The name of the related point.
   *
   */
  @JSProperty("key")
  @Nullable
  String getKey();

  /**
   * The name of the related point.
   *
   */
  @JSProperty("key")
  void setKey(@Nullable String value);

  /**
   * The percentage for related points in a stacked series or pies.
   *
   */
  @JSProperty("percentage")
  double getPercentage();

  /**
   * The percentage for related points in a stacked series or pies.
   *
   */
  @JSProperty("percentage")
  void setPercentage(double value);

  /**
   * The related point. The point name, if defined, is available through
   * <code>this.point.name</code>.
   *
   */
  @JSProperty("point")
  Point getPoint();

  /**
   * The related point. The point name, if defined, is available through
   * <code>this.point.name</code>.
   *
   */
  @JSProperty("point")
  void setPoint(Point value);

  /**
   * The related series. The series name is available through
   * <code>this.series.name</code>.
   *
   */
  @JSProperty("series")
  Series getSeries();

  /**
   * The related series. The series name is available through
   * <code>this.series.name</code>.
   *
   */
  @JSProperty("series")
  void setSeries(Series value);

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   */
  @JSProperty("total")
  double getTotal();

  /**
   * The total of values in either a stack for stacked series, or a pie in a
   * pie series.
   *
   */
  @JSProperty("total")
  void setTotal(double value);

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   */
  @JSProperty("x")
  @Nullable
  Unknown /* ( number | string ) */ getX();

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * For categorized axes this property holds the category name for the point.
   * For other axes it holds the X value.
   *
   */
  @JSProperty("x")
  void setX(@Nullable String value);

  /**
   * The y value of the point.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * The y value of the point.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointLabelObject object = Any.empty();

    private Builder() {
    }

    public PointLabelObject build() {
      return object;
    }

    /**
     * The point's current color.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * The point's current color.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * The point's current color.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * The point's current color index, used in styled mode instead of <code>color</code>.
     * The color index is inserted in class names used for styling.
     *
     */
    public Builder colorIndex(double value) {
      object.setColorIndex(value);
      return this;
    }

    /**
     * The name of the related point.
     *
     */
    public Builder key(@Nullable String value) {
      object.setKey(value);
      return this;
    }

    /**
     * The percentage for related points in a stacked series or pies.
     *
     */
    public Builder percentage(double value) {
      object.setPercentage(value);
      return this;
    }

    /**
     * The related point. The point name, if defined, is available through
     * <code>this.point.name</code>.
     *
     */
    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }

    /**
     * The related series. The series name is available through
     * <code>this.series.name</code>.
     *
     */
    public Builder series(Series value) {
      object.setSeries(value);
      return this;
    }

    /**
     * The total of values in either a stack for stacked series, or a pie in a
     * pie series.
     *
     */
    public Builder total(double value) {
      object.setTotal(value);
      return this;
    }

    /**
     * For categorized axes this property holds the category name for the point.
     * For other axes it holds the X value.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * For categorized axes this property holds the category name for the point.
     * For other axes it holds the X value.
     *
     */
    public Builder x(@Nullable String value) {
      object.setX(value);
      return this;
    }

    /**
     * The y value of the point.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
