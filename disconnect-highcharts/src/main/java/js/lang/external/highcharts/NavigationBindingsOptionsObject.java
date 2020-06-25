package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * A config object for navigation bindings in annotations.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationBindingsOptionsObject extends Any {
  /**
   * ClassName of the element for a binding.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * ClassName of the element for a binding.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * Last event to be fired after last step event.
   *
   */
  @JSProperty("end")
  @Nullable
  JsFunction getEnd();

  /**
   * Last event to be fired after last step event.
   *
   */
  @JSProperty("end")
  void setEnd(@Nullable JsFunction value);

  /**
   * Initial event, fired on a button click.
   *
   */
  @JSProperty("init")
  @Nullable
  JsFunction getInit();

  /**
   * Initial event, fired on a button click.
   *
   */
  @JSProperty("init")
  void setInit(@Nullable JsFunction value);

  /**
   * Event fired on first click on a chart.
   *
   */
  @JSProperty("start")
  @Nullable
  JsFunction getStart();

  /**
   * Event fired on first click on a chart.
   *
   */
  @JSProperty("start")
  void setStart(@Nullable JsFunction value);

  /**
   * Last event to be fired after last step event. Array of step events to be
   * called sequentially after each user click.
   *
   */
  @JSProperty("steps")
  @Nullable
  JsFunction[] getSteps();

  /**
   * Last event to be fired after last step event. Array of step events to be
   * called sequentially after each user click.
   *
   */
  @JSProperty("steps")
  void setSteps(JsFunction[] value);

  class Builder {
    private final NavigationBindingsOptionsObject object = Any.empty();

    public NavigationBindingsOptionsObject build() {
      return object;
    }

    /**
     * ClassName of the element for a binding.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * Last event to be fired after last step event.
     *
     */
    public Builder end(@Nullable JsFunction value) {
      object.setEnd(value);
      return this;
    }

    /**
     * Initial event, fired on a button click.
     *
     */
    public Builder init(@Nullable JsFunction value) {
      object.setInit(value);
      return this;
    }

    /**
     * Event fired on first click on a chart.
     *
     */
    public Builder start(@Nullable JsFunction value) {
      object.setStart(value);
      return this;
    }

    /**
     * Last event to be fired after last step event. Array of step events to be
     * called sequentially after each user click.
     *
     */
    public Builder steps(JsFunction[] value) {
      object.setSteps(value);
      return this;
    }
  }
}
