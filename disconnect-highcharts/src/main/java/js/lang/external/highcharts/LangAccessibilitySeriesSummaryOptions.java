package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the series
 * main summary. Each series type has two modes:
 *
 * <ol>
 * <li>
 * This series type is the only series type used in the chart
 *
 * </li>
 * <li>
 * This is a combination chart with multiple series types
 *
 * </li>
 * </ol>
 * If a definition does not exist for the specific series type and mode, the
 * 'default' lang definitions are used.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilitySeriesSummaryOptions extends Any {
  @JSProperty("bar")
  @Nullable
  String getBar();

  @JSProperty("bar")
  void setBar(@Nullable String value);

  @JSProperty("barCombination")
  @Nullable
  String getBarCombination();

  @JSProperty("barCombination")
  void setBarCombination(@Nullable String value);

  @JSProperty("boxplot")
  @Nullable
  String getBoxplot();

  @JSProperty("boxplot")
  void setBoxplot(@Nullable String value);

  @JSProperty("boxplotCombination")
  @Nullable
  String getBoxplotCombination();

  @JSProperty("boxplotCombination")
  void setBoxplotCombination(@Nullable String value);

  @JSProperty("bubble")
  @Nullable
  String getBubble();

  @JSProperty("bubble")
  void setBubble(@Nullable String value);

  @JSProperty("bubbleCombination")
  @Nullable
  String getBubbleCombination();

  @JSProperty("bubbleCombination")
  void setBubbleCombination(@Nullable String value);

  @JSProperty("column")
  @Nullable
  String getColumn();

  @JSProperty("column")
  void setColumn(@Nullable String value);

  @JSProperty("columnCombination")
  @Nullable
  String getColumnCombination();

  @JSProperty("columnCombination")
  void setColumnCombination(@Nullable String value);

  @JSProperty("default")
  @Nullable
  String getDefaultValue();

  @JSProperty("default")
  void setDefaultValue(@Nullable String value);

  @JSProperty("defaultCombination")
  @Nullable
  String getDefaultCombination();

  @JSProperty("defaultCombination")
  void setDefaultCombination(@Nullable String value);

  @JSProperty("line")
  @Nullable
  String getLine();

  @JSProperty("line")
  void setLine(@Nullable String value);

  @JSProperty("lineCombination")
  @Nullable
  String getLineCombination();

  @JSProperty("lineCombination")
  void setLineCombination(@Nullable String value);

  @JSProperty("map")
  @Nullable
  String getMap();

  @JSProperty("map")
  void setMap(@Nullable String value);

  @JSProperty("mapbubble")
  @Nullable
  String getMapbubble();

  @JSProperty("mapbubble")
  void setMapbubble(@Nullable String value);

  @JSProperty("mapbubbleCombination")
  @Nullable
  String getMapbubbleCombination();

  @JSProperty("mapbubbleCombination")
  void setMapbubbleCombination(@Nullable String value);

  @JSProperty("mapCombination")
  @Nullable
  String getMapCombination();

  @JSProperty("mapCombination")
  void setMapCombination(@Nullable String value);

  @JSProperty("mapline")
  @Nullable
  String getMapline();

  @JSProperty("mapline")
  void setMapline(@Nullable String value);

  @JSProperty("maplineCombination")
  @Nullable
  String getMaplineCombination();

  @JSProperty("maplineCombination")
  void setMaplineCombination(@Nullable String value);

  @JSProperty("pie")
  @Nullable
  String getPie();

  @JSProperty("pie")
  void setPie(@Nullable String value);

  @JSProperty("pieCombination")
  @Nullable
  String getPieCombination();

  @JSProperty("pieCombination")
  void setPieCombination(@Nullable String value);

  @JSProperty("scatter")
  @Nullable
  String getScatter();

  @JSProperty("scatter")
  void setScatter(@Nullable String value);

  @JSProperty("scatterCombination")
  @Nullable
  String getScatterCombination();

  @JSProperty("scatterCombination")
  void setScatterCombination(@Nullable String value);

  @JSProperty("spline")
  @Nullable
  String getSpline();

  @JSProperty("spline")
  void setSpline(@Nullable String value);

  @JSProperty("splineCombination")
  @Nullable
  String getSplineCombination();

  @JSProperty("splineCombination")
  void setSplineCombination(@Nullable String value);

  class Builder {
    private final LangAccessibilitySeriesSummaryOptions object = Any.empty();

    public LangAccessibilitySeriesSummaryOptions build() {
      return object;
    }

    public Builder bar(@Nullable String value) {
      object.setBar(value);
      return this;
    }

    public Builder barCombination(@Nullable String value) {
      object.setBarCombination(value);
      return this;
    }

    public Builder boxplot(@Nullable String value) {
      object.setBoxplot(value);
      return this;
    }

    public Builder boxplotCombination(@Nullable String value) {
      object.setBoxplotCombination(value);
      return this;
    }

    public Builder bubble(@Nullable String value) {
      object.setBubble(value);
      return this;
    }

    public Builder bubbleCombination(@Nullable String value) {
      object.setBubbleCombination(value);
      return this;
    }

    public Builder column(@Nullable String value) {
      object.setColumn(value);
      return this;
    }

    public Builder columnCombination(@Nullable String value) {
      object.setColumnCombination(value);
      return this;
    }

    public Builder defaultValue(@Nullable String value) {
      object.setDefaultValue(value);
      return this;
    }

    public Builder defaultCombination(@Nullable String value) {
      object.setDefaultCombination(value);
      return this;
    }

    public Builder line(@Nullable String value) {
      object.setLine(value);
      return this;
    }

    public Builder lineCombination(@Nullable String value) {
      object.setLineCombination(value);
      return this;
    }

    public Builder map(@Nullable String value) {
      object.setMap(value);
      return this;
    }

    public Builder mapbubble(@Nullable String value) {
      object.setMapbubble(value);
      return this;
    }

    public Builder mapbubbleCombination(@Nullable String value) {
      object.setMapbubbleCombination(value);
      return this;
    }

    public Builder mapCombination(@Nullable String value) {
      object.setMapCombination(value);
      return this;
    }

    public Builder mapline(@Nullable String value) {
      object.setMapline(value);
      return this;
    }

    public Builder maplineCombination(@Nullable String value) {
      object.setMaplineCombination(value);
      return this;
    }

    public Builder pie(@Nullable String value) {
      object.setPie(value);
      return this;
    }

    public Builder pieCombination(@Nullable String value) {
      object.setPieCombination(value);
      return this;
    }

    public Builder scatter(@Nullable String value) {
      object.setScatter(value);
      return this;
    }

    public Builder scatterCombination(@Nullable String value) {
      object.setScatterCombination(value);
      return this;
    }

    public Builder spline(@Nullable String value) {
      object.setSpline(value);
      return this;
    }

    public Builder splineCombination(@Nullable String value) {
      object.setSplineCombination(value);
      return this;
    }
  }
}
