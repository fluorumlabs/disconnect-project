package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Configure the stockTools gui strings in the chart. Requires the
 * <a href="">stockTools module</a> to be loaded. For a description of the module and
 * information on its features, see <a href="">Highcharts StockTools</a>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StockToolsOptions extends Any {
  /**
   * (Highstock) Definitions of buttons in Stock Tools GUI.
   *
   */
  @JSProperty("gui")
  @Nullable
  StockToolsGuiOptions getGui();

  /**
   * (Highstock) Definitions of buttons in Stock Tools GUI.
   *
   */
  @JSProperty("gui")
  void setGui(@Nullable StockToolsGuiOptions value);

  class Builder {
    private final StockToolsOptions object = Any.empty();

    public StockToolsOptions build() {
      return object;
    }

    /**
     * (Highstock) Definitions of buttons in Stock Tools GUI.
     *
     */
    public Builder gui(@Nullable StockToolsGuiOptions value) {
      object.setGui(value);
      return this;
    }
  }
}
