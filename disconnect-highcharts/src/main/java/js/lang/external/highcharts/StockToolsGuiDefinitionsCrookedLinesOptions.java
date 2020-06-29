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
public interface StockToolsGuiDefinitionsCrookedLinesOptions extends Any {
  @JSProperty("crooked3")
  @Nullable
  StockToolsGuiDefinitionsCrookedLinesCrooked3Options getCrooked3();

  @JSProperty("crooked3")
  void setCrooked3(@Nullable StockToolsGuiDefinitionsCrookedLinesCrooked3Options value);

  @JSProperty("crooked5")
  @Nullable
  StockToolsGuiDefinitionsCrookedLinesCrooked5Options getCrooked5();

  @JSProperty("crooked5")
  void setCrooked5(@Nullable StockToolsGuiDefinitionsCrookedLinesCrooked5Options value);

  @JSProperty("elliott3")
  @Nullable
  StockToolsGuiDefinitionsCrookedLinesElliott3Options getElliott3();

  @JSProperty("elliott3")
  void setElliott3(@Nullable StockToolsGuiDefinitionsCrookedLinesElliott3Options value);

  @JSProperty("elliott5")
  @Nullable
  StockToolsGuiDefinitionsCrookedLinesElliott5Options getElliott5();

  @JSProperty("elliott5")
  void setElliott5(@Nullable StockToolsGuiDefinitionsCrookedLinesElliott5Options value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsCrookedLinesOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsCrookedLinesOptions build() {
      return object;
    }

    public Builder crooked3(@Nullable StockToolsGuiDefinitionsCrookedLinesCrooked3Options value) {
      object.setCrooked3(value);
      return this;
    }

    public Builder crooked5(@Nullable StockToolsGuiDefinitionsCrookedLinesCrooked5Options value) {
      object.setCrooked5(value);
      return this;
    }

    public Builder elliott3(@Nullable StockToolsGuiDefinitionsCrookedLinesElliott3Options value) {
      object.setElliott3(value);
      return this;
    }

    public Builder elliott5(@Nullable StockToolsGuiDefinitionsCrookedLinesElliott5Options value) {
      object.setElliott5(value);
      return this;
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
  }
}
