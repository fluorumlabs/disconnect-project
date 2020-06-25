package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StockToolsGuiDefinitionsTypeChangeOptions extends Any {
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
  void setItems(Any[] value);

  @JSProperty("typeCandlestick")
  @Nullable
  StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions getTypeCandlestick();

  @JSProperty("typeCandlestick")
  void setTypeCandlestick(@Nullable StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions value);

  @JSProperty("typeLine")
  @Nullable
  StockToolsGuiDefinitionsTypeChangeTypeLineOptions getTypeLine();

  @JSProperty("typeLine")
  void setTypeLine(@Nullable StockToolsGuiDefinitionsTypeChangeTypeLineOptions value);

  @JSProperty("typeOHLC")
  @Nullable
  StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions getTypeOHLC();

  @JSProperty("typeOHLC")
  void setTypeOHLC(@Nullable StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions value);

  class Builder {
    private final StockToolsGuiDefinitionsTypeChangeOptions object = Any.empty();

    public StockToolsGuiDefinitionsTypeChangeOptions build() {
      return object;
    }

    /**
     * (Highstock) A collection of strings pointing to config options for the
     * items.
     *
     */
    public Builder items(Any[] value) {
      object.setItems(value);
      return this;
    }

    public Builder typeCandlestick(
        @Nullable StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions value) {
      object.setTypeCandlestick(value);
      return this;
    }

    public Builder typeLine(@Nullable StockToolsGuiDefinitionsTypeChangeTypeLineOptions value) {
      object.setTypeLine(value);
      return this;
    }

    public Builder typeOHLC(@Nullable StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions value) {
      object.setTypeOHLC(value);
      return this;
    }
  }
}
