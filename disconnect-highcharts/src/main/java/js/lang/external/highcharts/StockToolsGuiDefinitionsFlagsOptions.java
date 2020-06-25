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
public interface StockToolsGuiDefinitionsFlagsOptions extends Any {
  @JSProperty("flagCirclepin")
  @Nullable
  StockToolsGuiDefinitionsFlagsFlagCirclepinOptions getFlagCirclepin();

  @JSProperty("flagCirclepin")
  void setFlagCirclepin(@Nullable StockToolsGuiDefinitionsFlagsFlagCirclepinOptions value);

  @JSProperty("flagDiamondpin")
  @Nullable
  StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions getFlagDiamondpin();

  @JSProperty("flagDiamondpin")
  void setFlagDiamondpin(@Nullable StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions value);

  @JSProperty("flagSimplepin")
  @Nullable
  StockToolsGuiDefinitionsFlagsFlagSimplepinOptions getFlagSimplepin();

  @JSProperty("flagSimplepin")
  void setFlagSimplepin(@Nullable StockToolsGuiDefinitionsFlagsFlagSimplepinOptions value);

  @JSProperty("flagSquarepin")
  @Nullable
  StockToolsGuiDefinitionsFlagsFlagSquarepinOptions getFlagSquarepin();

  @JSProperty("flagSquarepin")
  void setFlagSquarepin(@Nullable StockToolsGuiDefinitionsFlagsFlagSquarepinOptions value);

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

  class Builder {
    private final StockToolsGuiDefinitionsFlagsOptions object = Any.empty();

    public StockToolsGuiDefinitionsFlagsOptions build() {
      return object;
    }

    public Builder flagCirclepin(
        @Nullable StockToolsGuiDefinitionsFlagsFlagCirclepinOptions value) {
      object.setFlagCirclepin(value);
      return this;
    }

    public Builder flagDiamondpin(
        @Nullable StockToolsGuiDefinitionsFlagsFlagDiamondpinOptions value) {
      object.setFlagDiamondpin(value);
      return this;
    }

    public Builder flagSimplepin(
        @Nullable StockToolsGuiDefinitionsFlagsFlagSimplepinOptions value) {
      object.setFlagSimplepin(value);
      return this;
    }

    public Builder flagSquarepin(
        @Nullable StockToolsGuiDefinitionsFlagsFlagSquarepinOptions value) {
      object.setFlagSquarepin(value);
      return this;
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
  }
}
