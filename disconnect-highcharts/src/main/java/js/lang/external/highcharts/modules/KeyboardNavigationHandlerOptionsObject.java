package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Options for the keyboard navigation handler.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/accessibility.src.js"
)
public interface KeyboardNavigationHandlerOptionsObject extends Any {
  /**
   * Function to run on initialization of module.
   *
   */
  @JSProperty("init")
  JsFunction getInit();

  /**
   * Function to run on initialization of module.
   *
   */
  @JSProperty("init")
  void setInit(JsFunction value);

  /**
   * An array containing pairs of an array of keycodes, mapped to a
   * handler function. When the keycode is received, the handler is called
   * with the keycode as parameter.
   *
   */
  @JSProperty("keyCodeMap")
  KeyCodeMap2[] getKeyCodeMap();

  /**
   * An array containing pairs of an array of keycodes, mapped to a
   * handler function. When the keycode is received, the handler is called
   * with the keycode as parameter.
   *
   */
  @JSProperty("keyCodeMap")
  void setKeyCodeMap(KeyCodeMap2[] value);

  /**
   * Function to run before moving to next/prev module. Receives moving
   * direction as parameter: +1 for next, -1 for previous.
   *
   */
  @JSProperty("terminate")
  @Nullable
  JsFunction getTerminate();

  /**
   * Function to run before moving to next/prev module. Receives moving
   * direction as parameter: +1 for next, -1 for previous.
   *
   */
  @JSProperty("terminate")
  void setTerminate(@Nullable JsFunction value);

  /**
   * Function to run to validate module. Should return false if module
   * should not run, true otherwise. Receives chart as parameter.
   *
   */
  @JSProperty("validate")
  @Nullable
  JsFunction getValidate();

  /**
   * Function to run to validate module. Should return false if module
   * should not run, true otherwise. Receives chart as parameter.
   *
   */
  @JSProperty("validate")
  void setValidate(@Nullable JsFunction value);

  interface KeyCodeMap2 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    double[] getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(double[] value);

    @JSBody(
        script = "return this[1]"
    )
    JsFunction getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(JsFunction value);

    class Builder {
      private final KeyCodeMap2 object = Any.empty();

      public KeyCodeMap2 build() {
        return object;
      }

      public KeyCodeMap2.Builder value0(double[] value) {
        object.setValue0(value);
        return this;
      }

      public KeyCodeMap2.Builder value1(JsFunction value) {
        object.setValue1(value);
        return this;
      }
    }
  }

  class Builder {
    private final KeyboardNavigationHandlerOptionsObject object = Any.empty();

    public KeyboardNavigationHandlerOptionsObject build() {
      return object;
    }

    /**
     * Function to run on initialization of module.
     *
     */
    public Builder init(JsFunction value) {
      object.setInit(value);
      return this;
    }

    /**
     * An array containing pairs of an array of keycodes, mapped to a
     * handler function. When the keycode is received, the handler is called
     * with the keycode as parameter.
     *
     */
    public Builder keyCodeMap(KeyCodeMap2[] value) {
      object.setKeyCodeMap(value);
      return this;
    }

    /**
     * Function to run before moving to next/prev module. Receives moving
     * direction as parameter: +1 for next, -1 for previous.
     *
     */
    public Builder terminate(@Nullable JsFunction value) {
      object.setTerminate(value);
      return this;
    }

    /**
     * Function to run to validate module. Should return false if module
     * should not run, true otherwise. Receives chart as parameter.
     *
     */
    public Builder validate(@Nullable JsFunction value) {
      object.setValidate(value);
      return this;
    }
  }
}
