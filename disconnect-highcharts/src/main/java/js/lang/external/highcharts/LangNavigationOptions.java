package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Configure the Popup strings in the chart. Requires
 * the <code>annotations.js</code> or <code>annotations-advanced.src.js</code> module to be loaded.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangNavigationOptions extends Any {
  /**
   * (Highcharts, Highstock) Translations for all field names used in popup.
   *
   */
  @JSProperty("popup")
  @Nullable
  LangNavigationPopupOptions getPopup();

  /**
   * (Highcharts, Highstock) Translations for all field names used in popup.
   *
   */
  @JSProperty("popup")
  void setPopup(@Nullable LangNavigationPopupOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangNavigationOptions object = Any.empty();

    private Builder() {
    }

    public LangNavigationOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) Translations for all field names used in popup.
     *
     */
    public Builder popup(@Nullable LangNavigationPopupOptions value) {
      object.setPopup(value);
      return this;
    }
  }
}
