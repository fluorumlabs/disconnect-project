package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
 * points. Each control point inherits options from controlPointOptions object.
 * Options from the controlPointOptions can be overwritten by options in a
 * specific control point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationControlPointOptionsObject extends Any {
  @JSProperty("height")
  double getHeight();

  @JSProperty("height")
  void setHeight(double value);

  @JSProperty("positioner")
  @Nullable
  AnnotationControlPointPositionerFunction getPositioner();

  @JSProperty("positioner")
  void setPositioner(@Nullable AnnotationControlPointPositionerFunction value);

  @JSProperty("style")
  @Nullable
  Unknown /* ( AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions ) */ getStyle(
      );

  @JSProperty("style")
  void setStyle(@Nullable NavigationAnnotationsControlPointStyleOptions value);

  @JSProperty("style")
  void setStyle(@Nullable AnnotationsControlPointStyleOptions value);

  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  @JSProperty("symbol")
  void setSymbol(@Nullable String value);

  @JSProperty("visible")
  boolean getVisible();

  @JSProperty("visible")
  void setVisible(boolean value);

  @JSProperty("width")
  double getWidth();

  @JSProperty("width")
  void setWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationControlPointOptionsObject object = Any.empty();

    private Builder() {
    }

    public AnnotationControlPointOptionsObject build() {
      return object;
    }

    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    public Builder positioner(@Nullable AnnotationControlPointPositionerFunction value) {
      object.setPositioner(value);
      return this;
    }

    public Builder style(@Nullable NavigationAnnotationsControlPointStyleOptions value) {
      object.setStyle(value);
      return this;
    }

    public Builder style(@Nullable AnnotationsControlPointStyleOptions value) {
      object.setStyle(value);
      return this;
    }

    public Builder symbol(@Nullable String value) {
      object.setSymbol(value);
      return this;
    }

    public Builder visible(boolean value) {
      object.setVisible(value);
      return this;
    }

    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
