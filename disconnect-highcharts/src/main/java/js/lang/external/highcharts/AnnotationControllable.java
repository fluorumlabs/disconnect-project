package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationControllable extends Any {
  @JSProperty("annotation")
  Annotation getAnnotation();

  @JSProperty("annotation")
  void setAnnotation(Annotation value);

  @JSProperty("chart")
  Chart getChart();

  @JSProperty("chart")
  void setChart(Chart value);

  @JSProperty("collection")
  String getCollection();

  @JSProperty("collection")
  void setCollection(String value);

  @JSProperty("points")
  Point[] getPoints();

  @JSProperty("points")
  void setPoints(Point... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationControllable object = Any.empty();

    private Builder() {
    }

    public AnnotationControllable build() {
      return object;
    }

    public Builder annotation(Annotation value) {
      object.setAnnotation(value);
      return this;
    }

    public Builder chart(Chart value) {
      object.setChart(value);
      return this;
    }

    public Builder collection(String value) {
      object.setCollection(value);
      return this;
    }

    public Builder points(Point... value) {
      object.setPoints(value);
      return this;
    }
  }
}
