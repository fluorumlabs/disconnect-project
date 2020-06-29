package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An options object of the buttons definitions. Each name refers to
 * unique key from buttons array.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StockToolsGuiDefinitionsOptions extends Any {
  @JSProperty("advanced")
  @Nullable
  StockToolsGuiDefinitionsAdvancedOptions getAdvanced();

  @JSProperty("advanced")
  void setAdvanced(@Nullable StockToolsGuiDefinitionsAdvancedOptions value);

  @JSProperty("crookedLines")
  @Nullable
  StockToolsGuiDefinitionsCrookedLinesOptions getCrookedLines();

  @JSProperty("crookedLines")
  void setCrookedLines(@Nullable StockToolsGuiDefinitionsCrookedLinesOptions value);

  @JSProperty("currentPriceIndicator")
  @Nullable
  StockToolsGuiDefinitionsCurrentPriceIndicatorOptions getCurrentPriceIndicator();

  @JSProperty("currentPriceIndicator")
  void setCurrentPriceIndicator(
      @Nullable StockToolsGuiDefinitionsCurrentPriceIndicatorOptions value);

  @JSProperty("flags")
  @Nullable
  StockToolsGuiDefinitionsFlagsOptions getFlags();

  @JSProperty("flags")
  void setFlags(@Nullable StockToolsGuiDefinitionsFlagsOptions value);

  @JSProperty("fullScreen")
  @Nullable
  StockToolsGuiDefinitionsFullScreenOptions getFullScreen();

  @JSProperty("fullScreen")
  void setFullScreen(@Nullable StockToolsGuiDefinitionsFullScreenOptions value);

  @JSProperty("indicators")
  @Nullable
  StockToolsGuiDefinitionsIndicatorsOptions getIndicators();

  @JSProperty("indicators")
  void setIndicators(@Nullable StockToolsGuiDefinitionsIndicatorsOptions value);

  @JSProperty("lines")
  @Nullable
  StockToolsGuiDefinitionsLinesOptions getLines();

  @JSProperty("lines")
  void setLines(@Nullable StockToolsGuiDefinitionsLinesOptions value);

  @JSProperty("measure")
  @Nullable
  StockToolsGuiDefinitionsMeasureOptions getMeasure();

  @JSProperty("measure")
  void setMeasure(@Nullable StockToolsGuiDefinitionsMeasureOptions value);

  @JSProperty("saveChart")
  @Nullable
  StockToolsGuiDefinitionsSaveChartOptions getSaveChart();

  @JSProperty("saveChart")
  void setSaveChart(@Nullable StockToolsGuiDefinitionsSaveChartOptions value);

  @JSProperty("separator")
  @Nullable
  StockToolsGuiDefinitionsSeparatorOptions getSeparator();

  @JSProperty("separator")
  void setSeparator(@Nullable StockToolsGuiDefinitionsSeparatorOptions value);

  @JSProperty("simpleShapes")
  @Nullable
  StockToolsGuiDefinitionsSimpleShapesOptions getSimpleShapes();

  @JSProperty("simpleShapes")
  void setSimpleShapes(@Nullable StockToolsGuiDefinitionsSimpleShapesOptions value);

  @JSProperty("toggleAnnotations")
  @Nullable
  StockToolsGuiDefinitionsToggleAnnotationsOptions getToggleAnnotations();

  @JSProperty("toggleAnnotations")
  void setToggleAnnotations(@Nullable StockToolsGuiDefinitionsToggleAnnotationsOptions value);

  @JSProperty("typeChange")
  @Nullable
  StockToolsGuiDefinitionsTypeChangeOptions getTypeChange();

  @JSProperty("typeChange")
  void setTypeChange(@Nullable StockToolsGuiDefinitionsTypeChangeOptions value);

  @JSProperty("verticalLabels")
  @Nullable
  StockToolsGuiDefinitionsVerticalLabelsOptions getVerticalLabels();

  @JSProperty("verticalLabels")
  void setVerticalLabels(@Nullable StockToolsGuiDefinitionsVerticalLabelsOptions value);

  @JSProperty("zoomChange")
  @Nullable
  StockToolsGuiDefinitionsZoomChangeOptions getZoomChange();

  @JSProperty("zoomChange")
  void setZoomChange(@Nullable StockToolsGuiDefinitionsZoomChangeOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsOptions build() {
      return object;
    }

    public Builder advanced(@Nullable StockToolsGuiDefinitionsAdvancedOptions value) {
      object.setAdvanced(value);
      return this;
    }

    public Builder crookedLines(@Nullable StockToolsGuiDefinitionsCrookedLinesOptions value) {
      object.setCrookedLines(value);
      return this;
    }

    public Builder currentPriceIndicator(
        @Nullable StockToolsGuiDefinitionsCurrentPriceIndicatorOptions value) {
      object.setCurrentPriceIndicator(value);
      return this;
    }

    public Builder flags(@Nullable StockToolsGuiDefinitionsFlagsOptions value) {
      object.setFlags(value);
      return this;
    }

    public Builder fullScreen(@Nullable StockToolsGuiDefinitionsFullScreenOptions value) {
      object.setFullScreen(value);
      return this;
    }

    public Builder indicators(@Nullable StockToolsGuiDefinitionsIndicatorsOptions value) {
      object.setIndicators(value);
      return this;
    }

    public Builder lines(@Nullable StockToolsGuiDefinitionsLinesOptions value) {
      object.setLines(value);
      return this;
    }

    public Builder measure(@Nullable StockToolsGuiDefinitionsMeasureOptions value) {
      object.setMeasure(value);
      return this;
    }

    public Builder saveChart(@Nullable StockToolsGuiDefinitionsSaveChartOptions value) {
      object.setSaveChart(value);
      return this;
    }

    public Builder separator(@Nullable StockToolsGuiDefinitionsSeparatorOptions value) {
      object.setSeparator(value);
      return this;
    }

    public Builder simpleShapes(@Nullable StockToolsGuiDefinitionsSimpleShapesOptions value) {
      object.setSimpleShapes(value);
      return this;
    }

    public Builder toggleAnnotations(
        @Nullable StockToolsGuiDefinitionsToggleAnnotationsOptions value) {
      object.setToggleAnnotations(value);
      return this;
    }

    public Builder typeChange(@Nullable StockToolsGuiDefinitionsTypeChangeOptions value) {
      object.setTypeChange(value);
      return this;
    }

    public Builder verticalLabels(@Nullable StockToolsGuiDefinitionsVerticalLabelsOptions value) {
      object.setVerticalLabels(value);
      return this;
    }

    public Builder zoomChange(@Nullable StockToolsGuiDefinitionsZoomChangeOptions value) {
      object.setZoomChange(value);
      return this;
    }
  }
}
