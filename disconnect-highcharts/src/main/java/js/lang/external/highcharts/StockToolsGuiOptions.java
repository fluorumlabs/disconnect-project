package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Definitions of buttons in Stock Tools GUI.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StockToolsGuiOptions extends Any {
  /**
   * (Highstock) A collection of strings pointing to config options for the
   * toolbar items. Each name refers to unique key from definitions object.
   *
   */
  @JSProperty("buttons")
  @Nullable
  String getButtons();

  /**
   * (Highstock) A collection of strings pointing to config options for the
   * toolbar items. Each name refers to unique key from definitions object.
   *
   */
  @JSProperty("buttons")
  void setButtons(@Nullable String value);

  /**
   * (Highstock) A CSS class name to apply to the stocktools' div, allowing
   * unique CSS styling for each chart.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highstock) A CSS class name to apply to the stocktools' div, allowing
   * unique CSS styling for each chart.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highstock) An options object of the buttons definitions. Each name
   * refers to unique key from buttons array.
   *
   */
  @JSProperty("definitions")
  @Nullable
  StockToolsGuiDefinitionsOptions getDefinitions();

  /**
   * (Highstock) An options object of the buttons definitions. Each name
   * refers to unique key from buttons array.
   *
   */
  @JSProperty("definitions")
  void setDefinitions(@Nullable StockToolsGuiDefinitionsOptions value);

  /**
   * (Highstock) Enable or disable the stockTools gui.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the stockTools gui.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) A CSS class name to apply to the container of buttons,
   * allowing unique CSS styling for each chart.
   *
   */
  @JSProperty("toolbarClassName")
  @Nullable
  String getToolbarClassName();

  /**
   * (Highstock) A CSS class name to apply to the container of buttons,
   * allowing unique CSS styling for each chart.
   *
   */
  @JSProperty("toolbarClassName")
  void setToolbarClassName(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiOptions build() {
      return object;
    }

    /**
     * (Highstock) A collection of strings pointing to config options for the
     * toolbar items. Each name refers to unique key from definitions object.
     *
     */
    public Builder buttons(@Nullable String value) {
      object.setButtons(value);
      return this;
    }

    /**
     * (Highstock) A CSS class name to apply to the stocktools' div, allowing
     * unique CSS styling for each chart.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highstock) An options object of the buttons definitions. Each name
     * refers to unique key from buttons array.
     *
     */
    public Builder definitions(@Nullable StockToolsGuiDefinitionsOptions value) {
      object.setDefinitions(value);
      return this;
    }

    /**
     * (Highstock) Enable or disable the stockTools gui.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) A CSS class name to apply to the container of buttons,
     * allowing unique CSS styling for each chart.
     *
     */
    public Builder toolbarClassName(@Nullable String value) {
      object.setToolbarClassName(value);
      return this;
    }
  }
}
