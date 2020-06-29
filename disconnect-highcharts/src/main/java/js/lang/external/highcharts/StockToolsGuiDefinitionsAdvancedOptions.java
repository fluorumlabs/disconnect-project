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
public interface StockToolsGuiDefinitionsAdvancedOptions extends Any {
  @JSProperty("fibonacci")
  @Nullable
  StockToolsGuiDefinitionsAdvancedFibonacciOptions getFibonacci();

  @JSProperty("fibonacci")
  void setFibonacci(@Nullable StockToolsGuiDefinitionsAdvancedFibonacciOptions value);

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

  @JSProperty("parallelChannel")
  @Nullable
  StockToolsGuiDefinitionsAdvancedParallelChannelOptions getParallelChannel();

  @JSProperty("parallelChannel")
  void setParallelChannel(@Nullable StockToolsGuiDefinitionsAdvancedParallelChannelOptions value);

  @JSProperty("pitchfork")
  @Nullable
  StockToolsGuiDefinitionsAdvancedPitchforkOptions getPitchfork();

  @JSProperty("pitchfork")
  void setPitchfork(@Nullable StockToolsGuiDefinitionsAdvancedPitchforkOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsAdvancedOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsAdvancedOptions build() {
      return object;
    }

    public Builder fibonacci(@Nullable StockToolsGuiDefinitionsAdvancedFibonacciOptions value) {
      object.setFibonacci(value);
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

    public Builder parallelChannel(
        @Nullable StockToolsGuiDefinitionsAdvancedParallelChannelOptions value) {
      object.setParallelChannel(value);
      return this;
    }

    public Builder pitchfork(@Nullable StockToolsGuiDefinitionsAdvancedPitchforkOptions value) {
      object.setPitchfork(value);
      return this;
    }
  }
}
