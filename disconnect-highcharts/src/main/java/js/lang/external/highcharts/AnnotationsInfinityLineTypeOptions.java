package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
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
public interface AnnotationsInfinityLineTypeOptions extends Any {
  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  @Nullable
  AnnotationsInfinityLineTypeLineOptions getLine();

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  void setLine(@Nullable AnnotationsInfinityLineTypeLineOptions value);

  @JSProperty("points")
  @Nullable
  AnnotationsInfinityLineTypePointsOptions[] getPoints();

  @JSProperty("points")
  void setPoints(AnnotationsInfinityLineTypePointsOptions... value);

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
    private final AnnotationsInfinityLineTypeOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsInfinityLineTypeOptions build() {
      return object;
    }

    /**
     * (Highstock) Line options.
     *
     */
    public Builder line(@Nullable AnnotationsInfinityLineTypeLineOptions value) {
      object.setLine(value);
      return this;
    }

    public Builder points(AnnotationsInfinityLineTypePointsOptions... value) {
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
