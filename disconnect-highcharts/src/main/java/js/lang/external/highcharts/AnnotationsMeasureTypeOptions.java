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
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsMeasureTypeOptions extends Any {
  @JSProperty("background")
  @Nullable
  AnnotationsMeasureTypeBackgroundOptions getBackground();

  @JSProperty("background")
  void setBackground(@Nullable AnnotationsMeasureTypeBackgroundOptions value);

  /**
   * (Highstock) Configure a crosshair that is horizontally placed in middle
   * of rectangle.
   *
   */
  @JSProperty("crosshairX")
  @Nullable
  AnnotationsMeasureTypeCrosshairXOptions getCrosshairX();

  /**
   * (Highstock) Configure a crosshair that is horizontally placed in middle
   * of rectangle.
   *
   */
  @JSProperty("crosshairX")
  void setCrosshairX(@Nullable AnnotationsMeasureTypeCrosshairXOptions value);

  /**
   * (Highstock) Configure a crosshair that is vertically placed in middle of
   * rectangle.
   *
   */
  @JSProperty("crosshairY")
  @Nullable
  AnnotationsMeasureTypeCrosshairYOptions getCrosshairY();

  /**
   * (Highstock) Configure a crosshair that is vertically placed in middle of
   * rectangle.
   *
   */
  @JSProperty("crosshairY")
  void setCrosshairY(@Nullable AnnotationsMeasureTypeCrosshairYOptions value);

  @JSProperty("label")
  @Nullable
  AnnotationsMeasureTypeLabelOptions getLabel();

  @JSProperty("label")
  void setLabel(@Nullable AnnotationsMeasureTypeLabelOptions value);

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  @Nullable
  AnnotationsMeasureTypeLineOptions getLine();

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  void setLine(@Nullable AnnotationsMeasureTypeLineOptions value);

  @JSProperty("points")
  @Nullable
  AnnotationsMeasureTypePointsOptions[] getPoints();

  @JSProperty("points")
  void setPoints(AnnotationsMeasureTypePointsOptions[] value);

  /**
   * (Highstock) Decides in what dimensions the user can resize by dragging
   * the mouse. Can be one of x, y or xy.
   *
   */
  @JSProperty("selectType")
  @Nullable
  String getSelectType();

  /**
   * (Highstock) Decides in what dimensions the user can resize by dragging
   * the mouse. Can be one of x, y or xy.
   *
   */
  @JSProperty("selectType")
  void setSelectType(@Nullable String value);

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
   * refers to either the axis id or the index of the axis in the yAxis array.
   *
   */
  @JSProperty("yAxis")
  double getYAxis();

  /**
   * (Highstock) This number defines which yAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the yAxis array.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(double value);

  class Builder {
    private final AnnotationsMeasureTypeOptions object = Any.empty();

    public AnnotationsMeasureTypeOptions build() {
      return object;
    }

    public Builder background(@Nullable AnnotationsMeasureTypeBackgroundOptions value) {
      object.setBackground(value);
      return this;
    }

    /**
     * (Highstock) Configure a crosshair that is horizontally placed in middle
     * of rectangle.
     *
     */
    public Builder crosshairX(@Nullable AnnotationsMeasureTypeCrosshairXOptions value) {
      object.setCrosshairX(value);
      return this;
    }

    /**
     * (Highstock) Configure a crosshair that is vertically placed in middle of
     * rectangle.
     *
     */
    public Builder crosshairY(@Nullable AnnotationsMeasureTypeCrosshairYOptions value) {
      object.setCrosshairY(value);
      return this;
    }

    public Builder label(@Nullable AnnotationsMeasureTypeLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    /**
     * (Highstock) Line options.
     *
     */
    public Builder line(@Nullable AnnotationsMeasureTypeLineOptions value) {
      object.setLine(value);
      return this;
    }

    public Builder points(AnnotationsMeasureTypePointsOptions[] value) {
      object.setPoints(value);
      return this;
    }

    /**
     * (Highstock) Decides in what dimensions the user can resize by dragging
     * the mouse. Can be one of x, y or xy.
     *
     */
    public Builder selectType(@Nullable String value) {
      object.setSelectType(value);
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
     * refers to either the axis id or the index of the axis in the yAxis array.
     *
     */
    public Builder yAxis(double value) {
      object.setYAxis(value);
      return this;
    }
  }
}
