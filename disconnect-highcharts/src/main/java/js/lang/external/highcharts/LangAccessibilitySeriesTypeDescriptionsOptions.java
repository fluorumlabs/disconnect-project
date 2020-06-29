package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known series
 * types. The relevant description is added to the screen reader information
 * region when these series types are used.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilitySeriesTypeDescriptionsOptions extends Any {
  @JSProperty("arearange")
  @Nullable
  String getArearange();

  @JSProperty("arearange")
  void setArearange(@Nullable String value);

  @JSProperty("areasplinerange")
  @Nullable
  String getAreasplinerange();

  @JSProperty("areasplinerange")
  void setAreasplinerange(@Nullable String value);

  @JSProperty("boxplot")
  @Nullable
  String getBoxplot();

  @JSProperty("boxplot")
  void setBoxplot(@Nullable String value);

  @JSProperty("bubble")
  @Nullable
  String getBubble();

  @JSProperty("bubble")
  void setBubble(@Nullable String value);

  @JSProperty("columnrange")
  @Nullable
  String getColumnrange();

  @JSProperty("columnrange")
  void setColumnrange(@Nullable String value);

  @JSProperty("errorbar")
  @Nullable
  String getErrorbar();

  @JSProperty("errorbar")
  void setErrorbar(@Nullable String value);

  @JSProperty("funnel")
  @Nullable
  String getFunnel();

  @JSProperty("funnel")
  void setFunnel(@Nullable String value);

  @JSProperty("pyramid")
  @Nullable
  String getPyramid();

  @JSProperty("pyramid")
  void setPyramid(@Nullable String value);

  @JSProperty("waterfall")
  @Nullable
  String getWaterfall();

  @JSProperty("waterfall")
  void setWaterfall(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilitySeriesTypeDescriptionsOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilitySeriesTypeDescriptionsOptions build() {
      return object;
    }

    public Builder arearange(@Nullable String value) {
      object.setArearange(value);
      return this;
    }

    public Builder areasplinerange(@Nullable String value) {
      object.setAreasplinerange(value);
      return this;
    }

    public Builder boxplot(@Nullable String value) {
      object.setBoxplot(value);
      return this;
    }

    public Builder bubble(@Nullable String value) {
      object.setBubble(value);
      return this;
    }

    public Builder columnrange(@Nullable String value) {
      object.setColumnrange(value);
      return this;
    }

    public Builder errorbar(@Nullable String value) {
      object.setErrorbar(value);
      return this;
    }

    public Builder funnel(@Nullable String value) {
      object.setFunnel(value);
      return this;
    }

    public Builder pyramid(@Nullable String value) {
      object.setPyramid(value);
      return this;
    }

    public Builder waterfall(@Nullable String value) {
      object.setWaterfall(value);
      return this;
    }
  }
}
