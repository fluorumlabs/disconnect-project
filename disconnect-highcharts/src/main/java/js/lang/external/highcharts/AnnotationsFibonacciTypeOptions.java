package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Additional options for an annotation with the type.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsFibonacciTypeOptions extends Any {
  /**
   * (Highstock) An array of background colors: Default to: (see online
   * documentation for example)
   *
   */
  @JSProperty("backgroundColors")
  @Nullable
  Any getBackgroundColors();

  /**
   * (Highstock) An array of background colors: Default to: (see online
   * documentation for example)
   *
   */
  @JSProperty("backgroundColors")
  void setBackgroundColors(@Nullable Any value);

  /**
   * (Highstock) The height of the fibonacci in terms of yAxis.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) The height of the fibonacci in terms of yAxis.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) An array with options for the labels.
   *
   */
  @JSProperty("labels")
  @Nullable
  AnnotationsFibonacciTypeLabelsOptions[] getLabels();

  /**
   * (Highstock) An array with options for the labels.
   *
   */
  @JSProperty("labels")
  void setLabels(AnnotationsFibonacciTypeLabelsOptions... value);

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  @Nullable
  AnnotationsFibonacciTypeLineOptions getLine();

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  void setLine(@Nullable AnnotationsFibonacciTypeLineOptions value);

  /**
   * (Highstock) The color of line.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) The color of line.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highstock) An array of colors for the lines.
   *
   */
  @JSProperty("lineColors")
  @Nullable
  Any getLineColors();

  /**
   * (Highstock) An array of colors for the lines.
   *
   */
  @JSProperty("lineColors")
  void setLineColors(@Nullable Any value);

  @JSProperty("points")
  @Nullable
  AnnotationsFibonacciTypePointsOptions[] getPoints();

  @JSProperty("points")
  void setPoints(AnnotationsFibonacciTypePointsOptions... value);

  /**
   * (Highstock) This number defines which xAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("xAxis")
  double getXAxis();

  /**
   * (Highstock) This number defines which xAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(double value);

  /**
   * (Highstock) This number defines which yAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("yAxis")
  double getYAxis();

  /**
   * (Highstock) This number defines which yAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsFibonacciTypeOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsFibonacciTypeOptions build() {
      return object;
    }

    /**
     * (Highstock) An array of background colors: Default to: (see online
     * documentation for example)
     *
     */
    public Builder backgroundColors(@Nullable Any value) {
      object.setBackgroundColors(value);
      return this;
    }

    /**
     * (Highstock) The height of the fibonacci in terms of yAxis.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highstock) An array with options for the labels.
     *
     */
    public Builder labels(AnnotationsFibonacciTypeLabelsOptions... value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highstock) Line options.
     *
     */
    public Builder line(@Nullable AnnotationsFibonacciTypeLineOptions value) {
      object.setLine(value);
      return this;
    }

    /**
     * (Highstock) The color of line.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highstock) An array of colors for the lines.
     *
     */
    public Builder lineColors(@Nullable Any value) {
      object.setLineColors(value);
      return this;
    }

    public Builder points(AnnotationsFibonacciTypePointsOptions... value) {
      object.setPoints(value);
      return this;
    }

    /**
     * (Highstock) This number defines which xAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     *
     */
    public Builder xAxis(double value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highstock) This number defines which yAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     *
     */
    public Builder yAxis(double value) {
      object.setYAxis(value);
      return this;
    }
  }
}
