package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( string | AxisExtremesTriggerValue ) */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisSetExtremesEventObject extends ExtremesObject {
  @JSProperty("preventDefault")
  JsFunction getPreventDefault();

  @JSProperty("preventDefault")
  void setPreventDefault(JsFunction value);

  @JSProperty("target")
  SVGElement getTarget();

  @JSProperty("target")
  void setTarget(SVGElement value);

  @JSProperty("trigger")
  Unknown /* ( string | AxisExtremesTriggerValue ) */ getTrigger();

  @JSProperty("trigger")
  void setTrigger(Trigger value);

  @JSProperty("trigger")
  void setTrigger(String value);

  @JSProperty("type")
  Type getType();

  @JSProperty("type")
  void setType(Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Trigger extends JsEnum {
    public static final Trigger NAVIGATOR = JsEnum.of("navigator");

    public static final Trigger PAN = JsEnum.of("pan");

    public static final Trigger SCROLLBAR = JsEnum.of("scrollbar");

    public static final Trigger ZOOM = JsEnum.of("zoom");

    public static final Trigger RANGESELECTORBUTTON = JsEnum.of("rangeSelectorButton");

    public static final Trigger RANGESELECTORINPUT = JsEnum.of("rangeSelectorInput");

    public static final Trigger TRAVERSEUPBUTTON = JsEnum.of("traverseUpButton");
  }

  abstract class Type extends JsEnum {
    public static final Type SETEXTREMES = JsEnum.of("setExtremes");
  }

  final class Builder {
    private final AxisSetExtremesEventObject object = Any.empty();

    private Builder() {
    }

    public AxisSetExtremesEventObject build() {
      return object;
    }

    public Builder preventDefault(JsFunction value) {
      object.setPreventDefault(value);
      return this;
    }

    public Builder target(SVGElement value) {
      object.setTarget(value);
      return this;
    }

    public Builder trigger(Trigger value) {
      object.setTrigger(value);
      return this;
    }

    public Builder trigger(String value) {
      object.setTrigger(value);
      return this;
    }

    public Builder type(Type value) {
      object.setType(value);
      return this;
    }
  }
}
