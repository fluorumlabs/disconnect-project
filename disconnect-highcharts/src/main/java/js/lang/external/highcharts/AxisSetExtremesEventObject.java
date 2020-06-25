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
    version = "^8.1.0"
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

  abstract class Trigger extends JsEnum {
    public static final Trigger NAVIGATOR = JsEnum.of("navigator");

    public static final Trigger PAN = JsEnum.of("pan");

    public static final Trigger SCROLLBAR = JsEnum.of("scrollbar");

    public static final Trigger ZOOM = JsEnum.of("zoom");

    public static final Trigger RANGESELECTORBUTTON = JsEnum.of("rangeSelectorButton");

    public static final Trigger RANGESELECTORINPUT = JsEnum.of("rangeSelectorInput");

    public static final Trigger TRAVERSEUPBUTTON = JsEnum.of("traverseUpButton");
  }

  class Builder {
    private final AxisSetExtremesEventObject object = Any.empty();

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
  }
}
