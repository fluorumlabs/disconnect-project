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
public interface StockToolsGuiDefinitionsVerticalLabelsOptions extends Any {
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

  @JSProperty("verticalArrow")
  @Nullable
  StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions getVerticalArrow();

  @JSProperty("verticalArrow")
  void setVerticalArrow(@Nullable StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions value);

  @JSProperty("verticalCounter")
  @Nullable
  StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions getVerticalCounter();

  @JSProperty("verticalCounter")
  void setVerticalCounter(
      @Nullable StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions value);

  @JSProperty("verticalLabel")
  @Nullable
  StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions getVerticalLabel();

  @JSProperty("verticalLabel")
  void setVerticalLabel(@Nullable StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsVerticalLabelsOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsVerticalLabelsOptions build() {
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

    public Builder verticalArrow(
        @Nullable StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions value) {
      object.setVerticalArrow(value);
      return this;
    }

    public Builder verticalCounter(
        @Nullable StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions value) {
      object.setVerticalCounter(value);
      return this;
    }

    public Builder verticalLabel(
        @Nullable StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions value) {
      object.setVerticalLabel(value);
      return this;
    }
  }
}
