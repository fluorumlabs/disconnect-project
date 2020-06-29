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
public interface StockToolsGuiDefinitionsSimpleShapesOptions extends Any {
  @JSProperty("circle")
  @Nullable
  StockToolsGuiDefinitionsSimpleShapesCircleOptions getCircle();

  @JSProperty("circle")
  void setCircle(@Nullable StockToolsGuiDefinitionsSimpleShapesCircleOptions value);

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

  @JSProperty("label")
  @Nullable
  StockToolsGuiDefinitionsSimpleShapesLabelOptions getLabel();

  @JSProperty("label")
  void setLabel(@Nullable StockToolsGuiDefinitionsSimpleShapesLabelOptions value);

  @JSProperty("rectangle")
  @Nullable
  StockToolsGuiDefinitionsSimpleShapesRectangleOptions getRectangle();

  @JSProperty("rectangle")
  void setRectangle(@Nullable StockToolsGuiDefinitionsSimpleShapesRectangleOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsSimpleShapesOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsSimpleShapesOptions build() {
      return object;
    }

    public Builder circle(@Nullable StockToolsGuiDefinitionsSimpleShapesCircleOptions value) {
      object.setCircle(value);
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

    public Builder label(@Nullable StockToolsGuiDefinitionsSimpleShapesLabelOptions value) {
      object.setLabel(value);
      return this;
    }

    public Builder rectangle(@Nullable StockToolsGuiDefinitionsSimpleShapesRectangleOptions value) {
      object.setRectangle(value);
      return this;
    }
  }
}
