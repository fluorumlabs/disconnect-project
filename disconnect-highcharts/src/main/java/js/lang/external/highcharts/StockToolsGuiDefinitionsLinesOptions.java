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
public interface StockToolsGuiDefinitionsLinesOptions extends Any {
  @JSProperty("arrowLine")
  @Nullable
  StockToolsGuiDefinitionsLinesArrowLineOptions getArrowLine();

  @JSProperty("arrowLine")
  void setArrowLine(@Nullable StockToolsGuiDefinitionsLinesArrowLineOptions value);

  @JSProperty("arrowRay")
  @Nullable
  StockToolsGuiDefinitionsLinesArrowRayOptions getArrowRay();

  @JSProperty("arrowRay")
  void setArrowRay(@Nullable StockToolsGuiDefinitionsLinesArrowRayOptions value);

  @JSProperty("arrowSegment")
  @Nullable
  StockToolsGuiDefinitionsLinesArrowSegmentOptions getArrowSegment();

  @JSProperty("arrowSegment")
  void setArrowSegment(@Nullable StockToolsGuiDefinitionsLinesArrowSegmentOptions value);

  @JSProperty("horizontalLine")
  @Nullable
  StockToolsGuiDefinitionsLinesHorizontalLineOptions getHorizontalLine();

  @JSProperty("horizontalLine")
  void setHorizontalLine(@Nullable StockToolsGuiDefinitionsLinesHorizontalLineOptions value);

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

  @JSProperty("line")
  @Nullable
  StockToolsGuiDefinitionsLinesLineOptions getLine();

  @JSProperty("line")
  void setLine(@Nullable StockToolsGuiDefinitionsLinesLineOptions value);

  @JSProperty("ray")
  @Nullable
  StockToolsGuiDefinitionsLinesRayOptions getRay();

  @JSProperty("ray")
  void setRay(@Nullable StockToolsGuiDefinitionsLinesRayOptions value);

  @JSProperty("segment")
  @Nullable
  StockToolsGuiDefinitionsLinesSegmentOptions getSegment();

  @JSProperty("segment")
  void setSegment(@Nullable StockToolsGuiDefinitionsLinesSegmentOptions value);

  @JSProperty("verticalLine")
  @Nullable
  StockToolsGuiDefinitionsLinesVerticalLineOptions getVerticalLine();

  @JSProperty("verticalLine")
  void setVerticalLine(@Nullable StockToolsGuiDefinitionsLinesVerticalLineOptions value);

  class Builder {
    private final StockToolsGuiDefinitionsLinesOptions object = Any.empty();

    public StockToolsGuiDefinitionsLinesOptions build() {
      return object;
    }

    public Builder arrowLine(@Nullable StockToolsGuiDefinitionsLinesArrowLineOptions value) {
      object.setArrowLine(value);
      return this;
    }

    public Builder arrowRay(@Nullable StockToolsGuiDefinitionsLinesArrowRayOptions value) {
      object.setArrowRay(value);
      return this;
    }

    public Builder arrowSegment(@Nullable StockToolsGuiDefinitionsLinesArrowSegmentOptions value) {
      object.setArrowSegment(value);
      return this;
    }

    public Builder horizontalLine(
        @Nullable StockToolsGuiDefinitionsLinesHorizontalLineOptions value) {
      object.setHorizontalLine(value);
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

    public Builder line(@Nullable StockToolsGuiDefinitionsLinesLineOptions value) {
      object.setLine(value);
      return this;
    }

    public Builder ray(@Nullable StockToolsGuiDefinitionsLinesRayOptions value) {
      object.setRay(value);
      return this;
    }

    public Builder segment(@Nullable StockToolsGuiDefinitionsLinesSegmentOptions value) {
      object.setSegment(value);
      return this;
    }

    public Builder verticalLine(@Nullable StockToolsGuiDefinitionsLinesVerticalLineOptions value) {
      object.setVerticalLine(value);
      return this;
    }
  }
}
