package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Events to communicate between Stock Tools and custom
 * GUI.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationEventsOptions extends Any {
  /**
   * (Highcharts, Highstock) A <code>closePopup</code> event. Fired when Popup should be
   * hidden, for example when clicking on an annotation again.
   *
   */
  @JSProperty("closePopup")
  @Nullable
  JsFunction getClosePopup();

  /**
   * (Highcharts, Highstock) A <code>closePopup</code> event. Fired when Popup should be
   * hidden, for example when clicking on an annotation again.
   *
   */
  @JSProperty("closePopup")
  void setClosePopup(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock) Event fired when button state should change, for
   * example after adding an annotation.
   *
   */
  @JSProperty("deselectButton")
  @Nullable
  JsFunction getDeselectButton();

  /**
   * (Highcharts, Highstock) Event fired when button state should change, for
   * example after adding an annotation.
   *
   */
  @JSProperty("deselectButton")
  void setDeselectButton(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock) Event fired on a button click.
   *
   */
  @JSProperty("selectButton")
  @Nullable
  JsFunction getSelectButton();

  /**
   * (Highcharts, Highstock) Event fired on a button click.
   *
   */
  @JSProperty("selectButton")
  void setSelectButton(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock) A <code>showPopup</code> event. Fired when selecting for
   * example an annotation.
   *
   */
  @JSProperty("showPopup")
  @Nullable
  JsFunction getShowPopup();

  /**
   * (Highcharts, Highstock) A <code>showPopup</code> event. Fired when selecting for
   * example an annotation.
   *
   */
  @JSProperty("showPopup")
  void setShowPopup(@Nullable JsFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigationEventsOptions object = Any.empty();

    private Builder() {
    }

    public NavigationEventsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) A <code>closePopup</code> event. Fired when Popup should be
     * hidden, for example when clicking on an annotation again.
     *
     */
    public Builder closePopup(@Nullable JsFunction value) {
      object.setClosePopup(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Event fired when button state should change, for
     * example after adding an annotation.
     *
     */
    public Builder deselectButton(@Nullable JsFunction value) {
      object.setDeselectButton(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Event fired on a button click.
     *
     */
    public Builder selectButton(@Nullable JsFunction value) {
      object.setSelectButton(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A <code>showPopup</code> event. Fired when selecting for
     * example an annotation.
     *
     */
    public Builder showPopup(@Nullable JsFunction value) {
      object.setShowPopup(value);
      return this;
    }
  }
}
