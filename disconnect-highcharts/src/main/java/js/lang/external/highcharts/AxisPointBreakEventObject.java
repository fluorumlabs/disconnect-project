package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* number */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisPointBreakEventObject extends Any {
  @JSProperty("brk")
  Dictionary<Unknown /* number */> getBrk();

  @JSProperty("brk")
  void setBrk(Dictionary<Unknown /* number */> value);

  @JSProperty("point")
  Point getPoint();

  @JSProperty("point")
  void setPoint(Point value);

  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  @JSProperty("target")
  SVGElement getTarget();

  @JSProperty("target")
  void setTarget(SVGElement value);

  @JSProperty("type")
  Type getType();

  @JSProperty("type")
  void setType(Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type POINTBREAK = JsEnum.of("pointBreak");

    public static final Type POINTINBREAK = JsEnum.of("pointInBreak");
  }

  final class Builder {
    private final AxisPointBreakEventObject object = Any.empty();

    private Builder() {
    }

    public AxisPointBreakEventObject build() {
      return object;
    }

    public Builder brk(Dictionary<Unknown /* number */> value) {
      object.setBrk(value);
      return this;
    }

    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }

    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    public Builder target(SVGElement value) {
      object.setTarget(value);
      return this;
    }

    public Builder type(Type value) {
      object.setType(value);
      return this;
    }
  }
}
