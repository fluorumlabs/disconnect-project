package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsMeasureTypeBackgroundOptions extends Any {
  /**
   * (Highstock) The color of the rectangle.
   *
   */
  @JSProperty("fill")
  @Nullable
  String getFill();

  /**
   * (Highstock) The color of the rectangle.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable String value);

  /**
   * (Highstock) The color of border.
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * (Highstock) The color of border.
   *
   */
  @JSProperty("stroke")
  void setStroke(@Nullable String value);

  /**
   * (Highstock) The width of border.
   *
   */
  @JSProperty("strokeWidth")
  double getStrokeWidth();

  /**
   * (Highstock) The width of border.
   *
   */
  @JSProperty("strokeWidth")
  void setStrokeWidth(double value);

  class Builder {
    private final AnnotationsMeasureTypeBackgroundOptions object = Any.empty();

    public AnnotationsMeasureTypeBackgroundOptions build() {
      return object;
    }

    /**
     * (Highstock) The color of the rectangle.
     *
     */
    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highstock) The color of border.
     *
     */
    public Builder stroke(@Nullable String value) {
      object.setStroke(value);
      return this;
    }

    /**
     * (Highstock) The width of border.
     *
     */
    public Builder strokeWidth(double value) {
      object.setStrokeWidth(value);
      return this;
    }
  }
}
