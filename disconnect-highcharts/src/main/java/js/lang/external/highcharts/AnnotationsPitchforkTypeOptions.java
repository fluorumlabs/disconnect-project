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
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsPitchforkTypeOptions extends Any {
  /**
   * (Highstock) Inner background options.
   *
   */
  @JSProperty("innerBackground")
  @Nullable
  AnnotationsPitchforkTypeInnerBackgroundOptions getInnerBackground();

  /**
   * (Highstock) Inner background options.
   *
   */
  @JSProperty("innerBackground")
  void setInnerBackground(@Nullable AnnotationsPitchforkTypeInnerBackgroundOptions value);

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  @Nullable
  AnnotationsPitchforkTypeLineOptions getLine();

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  void setLine(@Nullable AnnotationsPitchforkTypeLineOptions value);

  /**
   * (Highstock) Outer background options.
   *
   */
  @JSProperty("outerBackground")
  @Nullable
  AnnotationsPitchforkTypeOuterBackgroundOptions getOuterBackground();

  /**
   * (Highstock) Outer background options.
   *
   */
  @JSProperty("outerBackground")
  void setOuterBackground(@Nullable AnnotationsPitchforkTypeOuterBackgroundOptions value);

  @JSProperty("points")
  @Nullable
  AnnotationsPitchforkTypePointsOptions[] getPoints();

  @JSProperty("points")
  void setPoints(AnnotationsPitchforkTypePointsOptions[] value);

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

  class Builder {
    private final AnnotationsPitchforkTypeOptions object = Any.empty();

    public AnnotationsPitchforkTypeOptions build() {
      return object;
    }

    /**
     * (Highstock) Inner background options.
     *
     */
    public Builder innerBackground(@Nullable AnnotationsPitchforkTypeInnerBackgroundOptions value) {
      object.setInnerBackground(value);
      return this;
    }

    /**
     * (Highstock) Line options.
     *
     */
    public Builder line(@Nullable AnnotationsPitchforkTypeLineOptions value) {
      object.setLine(value);
      return this;
    }

    /**
     * (Highstock) Outer background options.
     *
     */
    public Builder outerBackground(@Nullable AnnotationsPitchforkTypeOuterBackgroundOptions value) {
      object.setOuterBackground(value);
      return this;
    }

    public Builder points(AnnotationsPitchforkTypePointsOptions[] value) {
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
