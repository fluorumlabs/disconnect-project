package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
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
public interface LangStockToolsGuiOptions extends Any {
  @JSProperty("advanced")
  @Nullable
  String getAdvanced();

  @JSProperty("advanced")
  void setAdvanced(@Nullable String value);

  @JSProperty("arrowLine")
  @Nullable
  String getArrowLine();

  @JSProperty("arrowLine")
  void setArrowLine(@Nullable String value);

  @JSProperty("arrowRay")
  @Nullable
  String getArrowRay();

  @JSProperty("arrowRay")
  void setArrowRay(@Nullable String value);

  @JSProperty("arrowSegment")
  @Nullable
  String getArrowSegment();

  @JSProperty("arrowSegment")
  void setArrowSegment(@Nullable String value);

  @JSProperty("circle")
  @Nullable
  String getCircle();

  @JSProperty("circle")
  void setCircle(@Nullable String value);

  @JSProperty("crooked3")
  @Nullable
  String getCrooked3();

  @JSProperty("crooked3")
  void setCrooked3(@Nullable String value);

  @JSProperty("crooked5")
  @Nullable
  String getCrooked5();

  @JSProperty("crooked5")
  void setCrooked5(@Nullable String value);

  @JSProperty("crookedLines")
  @Nullable
  String getCrookedLines();

  @JSProperty("crookedLines")
  void setCrookedLines(@Nullable String value);

  @JSProperty("currentPriceIndicator")
  @Nullable
  String getCurrentPriceIndicator();

  @JSProperty("currentPriceIndicator")
  void setCurrentPriceIndicator(@Nullable String value);

  @JSProperty("elliott3")
  @Nullable
  String getElliott3();

  @JSProperty("elliott3")
  void setElliott3(@Nullable String value);

  @JSProperty("elliott5")
  @Nullable
  String getElliott5();

  @JSProperty("elliott5")
  void setElliott5(@Nullable String value);

  @JSProperty("fibonacci")
  @Nullable
  String getFibonacci();

  @JSProperty("fibonacci")
  void setFibonacci(@Nullable String value);

  @JSProperty("flagCirclepin")
  @Nullable
  String getFlagCirclepin();

  @JSProperty("flagCirclepin")
  void setFlagCirclepin(@Nullable String value);

  @JSProperty("flagDiamondpin")
  @Nullable
  String getFlagDiamondpin();

  @JSProperty("flagDiamondpin")
  void setFlagDiamondpin(@Nullable String value);

  @JSProperty("flags")
  @Nullable
  String getFlags();

  @JSProperty("flags")
  void setFlags(@Nullable String value);

  @JSProperty("flagSimplepin")
  @Nullable
  String getFlagSimplepin();

  @JSProperty("flagSimplepin")
  void setFlagSimplepin(@Nullable String value);

  @JSProperty("flagSquarepin")
  @Nullable
  String getFlagSquarepin();

  @JSProperty("flagSquarepin")
  void setFlagSquarepin(@Nullable String value);

  @JSProperty("fullScreen")
  @Nullable
  String getFullScreen();

  @JSProperty("fullScreen")
  void setFullScreen(@Nullable String value);

  @JSProperty("horizontalLine")
  @Nullable
  String getHorizontalLine();

  @JSProperty("horizontalLine")
  void setHorizontalLine(@Nullable String value);

  @JSProperty("indicators")
  @Nullable
  String getIndicators();

  @JSProperty("indicators")
  void setIndicators(@Nullable String value);

  @JSProperty("infinityLine")
  @Nullable
  String getInfinityLine();

  @JSProperty("infinityLine")
  void setInfinityLine(@Nullable String value);

  @JSProperty("label")
  @Nullable
  String getLabel();

  @JSProperty("label")
  void setLabel(@Nullable String value);

  @JSProperty("line")
  @Nullable
  String getLine();

  @JSProperty("line")
  void setLine(@Nullable String value);

  @JSProperty("lines")
  @Nullable
  String getLines();

  @JSProperty("lines")
  void setLines(@Nullable String value);

  @JSProperty("measure")
  @Nullable
  String getMeasure();

  @JSProperty("measure")
  void setMeasure(@Nullable String value);

  @JSProperty("measureX")
  @Nullable
  String getMeasureX();

  @JSProperty("measureX")
  void setMeasureX(@Nullable String value);

  @JSProperty("measureXY")
  @Nullable
  String getMeasureXY();

  @JSProperty("measureXY")
  void setMeasureXY(@Nullable String value);

  @JSProperty("measureY")
  @Nullable
  String getMeasureY();

  @JSProperty("measureY")
  void setMeasureY(@Nullable String value);

  @JSProperty("parallelChannel")
  @Nullable
  String getParallelChannel();

  @JSProperty("parallelChannel")
  void setParallelChannel(@Nullable String value);

  @JSProperty("pitchfork")
  @Nullable
  String getPitchfork();

  @JSProperty("pitchfork")
  void setPitchfork(@Nullable String value);

  @JSProperty("ray")
  @Nullable
  String getRay();

  @JSProperty("ray")
  void setRay(@Nullable String value);

  @JSProperty("rectangle")
  @Nullable
  String getRectangle();

  @JSProperty("rectangle")
  void setRectangle(@Nullable String value);

  @JSProperty("saveChart")
  @Nullable
  String getSaveChart();

  @JSProperty("saveChart")
  void setSaveChart(@Nullable String value);

  @JSProperty("segment")
  @Nullable
  String getSegment();

  @JSProperty("segment")
  void setSegment(@Nullable String value);

  @JSProperty("simpleShapes")
  @Nullable
  String getSimpleShapes();

  @JSProperty("simpleShapes")
  void setSimpleShapes(@Nullable String value);

  @JSProperty("toggleAnnotations")
  @Nullable
  String getToggleAnnotations();

  @JSProperty("toggleAnnotations")
  void setToggleAnnotations(@Nullable String value);

  @JSProperty("typeCandlestick")
  @Nullable
  String getTypeCandlestick();

  @JSProperty("typeCandlestick")
  void setTypeCandlestick(@Nullable String value);

  @JSProperty("typeChange")
  @Nullable
  String getTypeChange();

  @JSProperty("typeChange")
  void setTypeChange(@Nullable String value);

  @JSProperty("typeLine")
  @Nullable
  String getTypeLine();

  @JSProperty("typeLine")
  void setTypeLine(@Nullable String value);

  @JSProperty("typeOHLC")
  @Nullable
  String getTypeOHLC();

  @JSProperty("typeOHLC")
  void setTypeOHLC(@Nullable String value);

  @JSProperty("verticalArrow")
  @Nullable
  String getVerticalArrow();

  @JSProperty("verticalArrow")
  void setVerticalArrow(@Nullable String value);

  @JSProperty("verticalCounter")
  @Nullable
  String getVerticalCounter();

  @JSProperty("verticalCounter")
  void setVerticalCounter(@Nullable String value);

  @JSProperty("verticalLabel")
  @Nullable
  String getVerticalLabel();

  @JSProperty("verticalLabel")
  void setVerticalLabel(@Nullable String value);

  @JSProperty("verticalLabels")
  @Nullable
  String getVerticalLabels();

  @JSProperty("verticalLabels")
  void setVerticalLabels(@Nullable String value);

  @JSProperty("verticalLine")
  @Nullable
  String getVerticalLine();

  @JSProperty("verticalLine")
  void setVerticalLine(@Nullable String value);

  @JSProperty("zoomChange")
  @Nullable
  String getZoomChange();

  @JSProperty("zoomChange")
  void setZoomChange(@Nullable String value);

  @JSProperty("zoomX")
  @Nullable
  String getZoomX();

  @JSProperty("zoomX")
  void setZoomX(@Nullable String value);

  @JSProperty("zoomXY")
  @Nullable
  String getZoomXY();

  @JSProperty("zoomXY")
  void setZoomXY(@Nullable String value);

  @JSProperty("zoomY")
  @Nullable
  String getZoomY();

  @JSProperty("zoomY")
  void setZoomY(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangStockToolsGuiOptions object = Any.empty();

    private Builder() {
    }

    public LangStockToolsGuiOptions build() {
      return object;
    }

    public Builder advanced(@Nullable String value) {
      object.setAdvanced(value);
      return this;
    }

    public Builder arrowLine(@Nullable String value) {
      object.setArrowLine(value);
      return this;
    }

    public Builder arrowRay(@Nullable String value) {
      object.setArrowRay(value);
      return this;
    }

    public Builder arrowSegment(@Nullable String value) {
      object.setArrowSegment(value);
      return this;
    }

    public Builder circle(@Nullable String value) {
      object.setCircle(value);
      return this;
    }

    public Builder crooked3(@Nullable String value) {
      object.setCrooked3(value);
      return this;
    }

    public Builder crooked5(@Nullable String value) {
      object.setCrooked5(value);
      return this;
    }

    public Builder crookedLines(@Nullable String value) {
      object.setCrookedLines(value);
      return this;
    }

    public Builder currentPriceIndicator(@Nullable String value) {
      object.setCurrentPriceIndicator(value);
      return this;
    }

    public Builder elliott3(@Nullable String value) {
      object.setElliott3(value);
      return this;
    }

    public Builder elliott5(@Nullable String value) {
      object.setElliott5(value);
      return this;
    }

    public Builder fibonacci(@Nullable String value) {
      object.setFibonacci(value);
      return this;
    }

    public Builder flagCirclepin(@Nullable String value) {
      object.setFlagCirclepin(value);
      return this;
    }

    public Builder flagDiamondpin(@Nullable String value) {
      object.setFlagDiamondpin(value);
      return this;
    }

    public Builder flags(@Nullable String value) {
      object.setFlags(value);
      return this;
    }

    public Builder flagSimplepin(@Nullable String value) {
      object.setFlagSimplepin(value);
      return this;
    }

    public Builder flagSquarepin(@Nullable String value) {
      object.setFlagSquarepin(value);
      return this;
    }

    public Builder fullScreen(@Nullable String value) {
      object.setFullScreen(value);
      return this;
    }

    public Builder horizontalLine(@Nullable String value) {
      object.setHorizontalLine(value);
      return this;
    }

    public Builder indicators(@Nullable String value) {
      object.setIndicators(value);
      return this;
    }

    public Builder infinityLine(@Nullable String value) {
      object.setInfinityLine(value);
      return this;
    }

    public Builder label(@Nullable String value) {
      object.setLabel(value);
      return this;
    }

    public Builder line(@Nullable String value) {
      object.setLine(value);
      return this;
    }

    public Builder lines(@Nullable String value) {
      object.setLines(value);
      return this;
    }

    public Builder measure(@Nullable String value) {
      object.setMeasure(value);
      return this;
    }

    public Builder measureX(@Nullable String value) {
      object.setMeasureX(value);
      return this;
    }

    public Builder measureXY(@Nullable String value) {
      object.setMeasureXY(value);
      return this;
    }

    public Builder measureY(@Nullable String value) {
      object.setMeasureY(value);
      return this;
    }

    public Builder parallelChannel(@Nullable String value) {
      object.setParallelChannel(value);
      return this;
    }

    public Builder pitchfork(@Nullable String value) {
      object.setPitchfork(value);
      return this;
    }

    public Builder ray(@Nullable String value) {
      object.setRay(value);
      return this;
    }

    public Builder rectangle(@Nullable String value) {
      object.setRectangle(value);
      return this;
    }

    public Builder saveChart(@Nullable String value) {
      object.setSaveChart(value);
      return this;
    }

    public Builder segment(@Nullable String value) {
      object.setSegment(value);
      return this;
    }

    public Builder simpleShapes(@Nullable String value) {
      object.setSimpleShapes(value);
      return this;
    }

    public Builder toggleAnnotations(@Nullable String value) {
      object.setToggleAnnotations(value);
      return this;
    }

    public Builder typeCandlestick(@Nullable String value) {
      object.setTypeCandlestick(value);
      return this;
    }

    public Builder typeChange(@Nullable String value) {
      object.setTypeChange(value);
      return this;
    }

    public Builder typeLine(@Nullable String value) {
      object.setTypeLine(value);
      return this;
    }

    public Builder typeOHLC(@Nullable String value) {
      object.setTypeOHLC(value);
      return this;
    }

    public Builder verticalArrow(@Nullable String value) {
      object.setVerticalArrow(value);
      return this;
    }

    public Builder verticalCounter(@Nullable String value) {
      object.setVerticalCounter(value);
      return this;
    }

    public Builder verticalLabel(@Nullable String value) {
      object.setVerticalLabel(value);
      return this;
    }

    public Builder verticalLabels(@Nullable String value) {
      object.setVerticalLabels(value);
      return this;
    }

    public Builder verticalLine(@Nullable String value) {
      object.setVerticalLine(value);
      return this;
    }

    public Builder zoomChange(@Nullable String value) {
      object.setZoomChange(value);
      return this;
    }

    public Builder zoomX(@Nullable String value) {
      object.setZoomX(value);
      return this;
    }

    public Builder zoomXY(@Nullable String value) {
      object.setZoomXY(value);
      return this;
    }

    public Builder zoomY(@Nullable String value) {
      object.setZoomY(value);
      return this;
    }
  }
}
