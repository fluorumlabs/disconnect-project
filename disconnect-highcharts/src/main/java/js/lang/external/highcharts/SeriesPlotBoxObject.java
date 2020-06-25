package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Translation and scale for the plot area of a series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesPlotBoxObject extends Any {
  @JSProperty("scaleX")
  double getScaleX();

  @JSProperty("scaleX")
  void setScaleX(double value);

  @JSProperty("scaleY")
  double getScaleY();

  @JSProperty("scaleY")
  void setScaleY(double value);

  @JSProperty("translateX")
  double getTranslateX();

  @JSProperty("translateX")
  void setTranslateX(double value);

  @JSProperty("translateY")
  double getTranslateY();

  @JSProperty("translateY")
  void setTranslateY(double value);

  class Builder {
    private final SeriesPlotBoxObject object = Any.empty();

    public SeriesPlotBoxObject build() {
      return object;
    }

    public Builder scaleX(double value) {
      object.setScaleX(value);
      return this;
    }

    public Builder scaleY(double value) {
      object.setScaleY(value);
      return this;
    }

    public Builder translateX(double value) {
      object.setTranslateX(value);
      return this;
    }

    public Builder translateY(double value) {
      object.setTranslateY(value);
      return this;
    }
  }
}
