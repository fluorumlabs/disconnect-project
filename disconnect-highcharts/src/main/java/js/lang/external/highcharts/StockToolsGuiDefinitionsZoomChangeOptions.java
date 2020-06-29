package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StockToolsGuiDefinitionsZoomChangeOptions extends Any {
  /**
   * (Highstock) A collection of strings pointing to config options for the
   * items.
   *
   */
  @JSProperty("items")
  @Nullable
  Any[] getItems();

  /**
   * (Highstock) A collection of strings pointing to config options for the
   * items.
   *
   */
  @JSProperty("items")
  void setItems(Any... value);

  @JSProperty("zoomX")
  @Nullable
  StockToolsGuiDefinitionsZoomChangeZoomXOptions getZoomX();

  @JSProperty("zoomX")
  void setZoomX(@Nullable StockToolsGuiDefinitionsZoomChangeZoomXOptions value);

  @JSProperty("zoomXY")
  @Nullable
  StockToolsGuiDefinitionsZoomChangeZoomXYOptions getZoomXY();

  @JSProperty("zoomXY")
  void setZoomXY(@Nullable StockToolsGuiDefinitionsZoomChangeZoomXYOptions value);

  @JSProperty("zoomY")
  @Nullable
  StockToolsGuiDefinitionsZoomChangeZoomYOptions getZoomY();

  @JSProperty("zoomY")
  void setZoomY(@Nullable StockToolsGuiDefinitionsZoomChangeZoomYOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsZoomChangeOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsZoomChangeOptions build() {
      return object;
    }

    /**
     * (Highstock) A collection of strings pointing to config options for the
     * items.
     *
     */
    public Builder items(Any... value) {
      object.setItems(value);
      return this;
    }

    public Builder zoomX(@Nullable StockToolsGuiDefinitionsZoomChangeZoomXOptions value) {
      object.setZoomX(value);
      return this;
    }

    public Builder zoomXY(@Nullable StockToolsGuiDefinitionsZoomChangeZoomXYOptions value) {
      object.setZoomXY(value);
      return this;
    }

    public Builder zoomY(@Nullable StockToolsGuiDefinitionsZoomChangeZoomYOptions value) {
      object.setZoomY(value);
      return this;
    }
  }
}
