package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Containing the position of a box that should be avoided by labels.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LabelIntersectBoxObject extends Any {
  @JSProperty("bottom")
  double getBottom();

  @JSProperty("bottom")
  void setBottom(double value);

  @JSProperty("left")
  double getLeft();

  @JSProperty("left")
  void setLeft(double value);

  @JSProperty("right")
  double getRight();

  @JSProperty("right")
  void setRight(double value);

  @JSProperty("top")
  double getTop();

  @JSProperty("top")
  void setTop(double value);

  class Builder {
    private final LabelIntersectBoxObject object = Any.empty();

    public LabelIntersectBoxObject build() {
      return object;
    }

    public Builder bottom(double value) {
      object.setBottom(value);
      return this;
    }

    public Builder left(double value) {
      object.setLeft(value);
      return this;
    }

    public Builder right(double value) {
      object.setRight(value);
      return this;
    }

    public Builder top(double value) {
      object.setTop(value);
      return this;
    }
  }
}
