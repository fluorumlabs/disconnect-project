package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings. This
 * is added to the chart information region.
 *
 * If there is only a single series type used in the chart, we use the format
 * string for the series type, or default if missing. There is one format string
 * for cases where there is only a single series in the chart, and one for
 * multiple series of the same type.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityChartTypesOptions extends Any {
  @JSProperty("barMultiple")
  @Nullable
  String getBarMultiple();

  @JSProperty("barMultiple")
  void setBarMultiple(@Nullable String value);

  @JSProperty("barSingle")
  @Nullable
  String getBarSingle();

  @JSProperty("barSingle")
  void setBarSingle(@Nullable String value);

  @JSProperty("boxplotMultiple")
  @Nullable
  String getBoxplotMultiple();

  @JSProperty("boxplotMultiple")
  void setBoxplotMultiple(@Nullable String value);

  @JSProperty("boxplotSingle")
  @Nullable
  String getBoxplotSingle();

  @JSProperty("boxplotSingle")
  void setBoxplotSingle(@Nullable String value);

  @JSProperty("bubbleMultiple")
  @Nullable
  String getBubbleMultiple();

  @JSProperty("bubbleMultiple")
  void setBubbleMultiple(@Nullable String value);

  @JSProperty("bubbleSingle")
  @Nullable
  String getBubbleSingle();

  @JSProperty("bubbleSingle")
  void setBubbleSingle(@Nullable String value);

  @JSProperty("columnMultiple")
  @Nullable
  String getColumnMultiple();

  @JSProperty("columnMultiple")
  void setColumnMultiple(@Nullable String value);

  @JSProperty("columnSingle")
  @Nullable
  String getColumnSingle();

  @JSProperty("columnSingle")
  void setColumnSingle(@Nullable String value);

  @JSProperty("combinationChart")
  @Nullable
  String getCombinationChart();

  @JSProperty("combinationChart")
  void setCombinationChart(@Nullable String value);

  @JSProperty("defaultMultiple")
  @Nullable
  String getDefaultMultiple();

  @JSProperty("defaultMultiple")
  void setDefaultMultiple(@Nullable String value);

  @JSProperty("defaultSingle")
  @Nullable
  String getDefaultSingle();

  @JSProperty("defaultSingle")
  void setDefaultSingle(@Nullable String value);

  @JSProperty("emptyChart")
  @Nullable
  String getEmptyChart();

  @JSProperty("emptyChart")
  void setEmptyChart(@Nullable String value);

  @JSProperty("lineMultiple")
  @Nullable
  String getLineMultiple();

  @JSProperty("lineMultiple")
  void setLineMultiple(@Nullable String value);

  @JSProperty("lineSingle")
  @Nullable
  String getLineSingle();

  @JSProperty("lineSingle")
  void setLineSingle(@Nullable String value);

  @JSProperty("mapTypeDescription")
  @Nullable
  String getMapTypeDescription();

  @JSProperty("mapTypeDescription")
  void setMapTypeDescription(@Nullable String value);

  @JSProperty("pieMultiple")
  @Nullable
  String getPieMultiple();

  @JSProperty("pieMultiple")
  void setPieMultiple(@Nullable String value);

  @JSProperty("pieSingle")
  @Nullable
  String getPieSingle();

  @JSProperty("pieSingle")
  void setPieSingle(@Nullable String value);

  @JSProperty("scatterMultiple")
  @Nullable
  String getScatterMultiple();

  @JSProperty("scatterMultiple")
  void setScatterMultiple(@Nullable String value);

  @JSProperty("scatterSingle")
  @Nullable
  String getScatterSingle();

  @JSProperty("scatterSingle")
  void setScatterSingle(@Nullable String value);

  @JSProperty("splineMultiple")
  @Nullable
  String getSplineMultiple();

  @JSProperty("splineMultiple")
  void setSplineMultiple(@Nullable String value);

  @JSProperty("splineSingle")
  @Nullable
  String getSplineSingle();

  @JSProperty("splineSingle")
  void setSplineSingle(@Nullable String value);

  @JSProperty("unknownMap")
  @Nullable
  String getUnknownMap();

  @JSProperty("unknownMap")
  void setUnknownMap(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityChartTypesOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityChartTypesOptions build() {
      return object;
    }

    public Builder barMultiple(@Nullable String value) {
      object.setBarMultiple(value);
      return this;
    }

    public Builder barSingle(@Nullable String value) {
      object.setBarSingle(value);
      return this;
    }

    public Builder boxplotMultiple(@Nullable String value) {
      object.setBoxplotMultiple(value);
      return this;
    }

    public Builder boxplotSingle(@Nullable String value) {
      object.setBoxplotSingle(value);
      return this;
    }

    public Builder bubbleMultiple(@Nullable String value) {
      object.setBubbleMultiple(value);
      return this;
    }

    public Builder bubbleSingle(@Nullable String value) {
      object.setBubbleSingle(value);
      return this;
    }

    public Builder columnMultiple(@Nullable String value) {
      object.setColumnMultiple(value);
      return this;
    }

    public Builder columnSingle(@Nullable String value) {
      object.setColumnSingle(value);
      return this;
    }

    public Builder combinationChart(@Nullable String value) {
      object.setCombinationChart(value);
      return this;
    }

    public Builder defaultMultiple(@Nullable String value) {
      object.setDefaultMultiple(value);
      return this;
    }

    public Builder defaultSingle(@Nullable String value) {
      object.setDefaultSingle(value);
      return this;
    }

    public Builder emptyChart(@Nullable String value) {
      object.setEmptyChart(value);
      return this;
    }

    public Builder lineMultiple(@Nullable String value) {
      object.setLineMultiple(value);
      return this;
    }

    public Builder lineSingle(@Nullable String value) {
      object.setLineSingle(value);
      return this;
    }

    public Builder mapTypeDescription(@Nullable String value) {
      object.setMapTypeDescription(value);
      return this;
    }

    public Builder pieMultiple(@Nullable String value) {
      object.setPieMultiple(value);
      return this;
    }

    public Builder pieSingle(@Nullable String value) {
      object.setPieSingle(value);
      return this;
    }

    public Builder scatterMultiple(@Nullable String value) {
      object.setScatterMultiple(value);
      return this;
    }

    public Builder scatterSingle(@Nullable String value) {
      object.setScatterSingle(value);
      return this;
    }

    public Builder splineMultiple(@Nullable String value) {
      object.setSplineMultiple(value);
      return this;
    }

    public Builder splineSingle(@Nullable String value) {
      object.setSplineSingle(value);
      return this;
    }

    public Builder unknownMap(@Nullable String value) {
      object.setUnknownMap(value);
      return this;
    }
  }
}
