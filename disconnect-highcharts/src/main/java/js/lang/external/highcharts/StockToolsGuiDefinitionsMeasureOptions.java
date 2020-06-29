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
public interface StockToolsGuiDefinitionsMeasureOptions extends Any {
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

  @JSProperty("measureX")
  @Nullable
  StockToolsGuiDefinitionsMeasureMeasureXOptions getMeasureX();

  @JSProperty("measureX")
  void setMeasureX(@Nullable StockToolsGuiDefinitionsMeasureMeasureXOptions value);

  @JSProperty("measureXY")
  @Nullable
  StockToolsGuiDefinitionsMeasureMeasureXYOptions getMeasureXY();

  @JSProperty("measureXY")
  void setMeasureXY(@Nullable StockToolsGuiDefinitionsMeasureMeasureXYOptions value);

  @JSProperty("measureY")
  @Nullable
  StockToolsGuiDefinitionsMeasureMeasureYOptions getMeasureY();

  @JSProperty("measureY")
  void setMeasureY(@Nullable StockToolsGuiDefinitionsMeasureMeasureYOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsMeasureOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsMeasureOptions build() {
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

    public Builder measureX(@Nullable StockToolsGuiDefinitionsMeasureMeasureXOptions value) {
      object.setMeasureX(value);
      return this;
    }

    public Builder measureXY(@Nullable StockToolsGuiDefinitionsMeasureMeasureXYOptions value) {
      object.setMeasureXY(value);
      return this;
    }

    public Builder measureY(@Nullable StockToolsGuiDefinitionsMeasureMeasureYOptions value) {
      object.setMeasureY(value);
      return this;
    }
  }
}
