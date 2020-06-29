package js.lang.external.vaadin.vaadin_charts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.highcharts.PointOptionsObject;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-charts",
    version = "^7.0.0-alpha7"
)
@Import(
    module = "@vaadin/vaadin-charts/vaadin-chart.js"
)
public interface ChartSeriesConfig extends Any {
  @JSProperty("data")
  @Nullable
  Unknown /* ChartSeriesValues */ getData();

  @JSProperty("data")
  void setData(PointOptionsObject... value);

  @JSProperty("data")
  void setData(double... value);

  @JSProperty("marker")
  @Nullable
  Marker getMarker();

  @JSProperty("marker")
  void setMarker(@Nullable Marker value);

  @JSProperty("neckWidth")
  @Nullable
  Unknown /* number | string */ getNeckWidth();

  @JSProperty("neckWidth")
  void setNeckWidth(double value);

  @JSProperty("neckWidth")
  void setNeckWidth(@Nullable String value);

  @JSProperty("neckHeight")
  @Nullable
  Unknown /* number | string */ getNeckHeight();

  @JSProperty("neckHeight")
  void setNeckHeight(double value);

  @JSProperty("neckHeight")
  void setNeckHeight(@Nullable String value);

  @JSProperty("stack")
  @Nullable
  Unknown /* number | string */ getStack();

  @JSProperty("stack")
  void setStack(double value);

  @JSProperty("stack")
  void setStack(@Nullable String value);

  @JSProperty("type")
  @Nullable
  String getType();

  @JSProperty("type")
  void setType(@Nullable String value);

  @JSProperty("yAxis")
  @Nullable
  String getYAxis();

  @JSProperty("yAxis")
  void setYAxis(@Nullable String value);

  @JSProperty("yAxisValueMin")
  double getYAxisValueMin();

  @JSProperty("yAxisValueMin")
  void setYAxisValueMin(double value);

  @JSProperty("yAxisValueMax")
  double getYAxisValueMax();

  @JSProperty("yAxisValueMax")
  void setYAxisValueMax(double value);

  static Builder builder() {
    return new Builder();
  }

  interface Marker extends Any {
    @JSProperty("enabled")
    boolean getEnabled();

    @JSProperty("enabled")
    void setEnabled(boolean value);

    static Marker.Builder builder() {
      return new Marker.Builder();
    }

    final class Builder {
      private final Marker object = Any.empty();

      private Builder() {
      }

      public Marker build() {
        return object;
      }

      public Marker.Builder enabled(boolean value) {
        object.setEnabled(value);
        return this;
      }
    }
  }

  final class Builder {
    private final ChartSeriesConfig object = Any.empty();

    private Builder() {
    }

    public ChartSeriesConfig build() {
      return object;
    }

    public Builder data(PointOptionsObject... value) {
      object.setData(value);
      return this;
    }

    public Builder data(double... value) {
      object.setData(value);
      return this;
    }

    public Builder marker(@Nullable Marker value) {
      object.setMarker(value);
      return this;
    }

    public Builder neckWidth(double value) {
      object.setNeckWidth(value);
      return this;
    }

    public Builder neckWidth(@Nullable String value) {
      object.setNeckWidth(value);
      return this;
    }

    public Builder neckHeight(double value) {
      object.setNeckHeight(value);
      return this;
    }

    public Builder neckHeight(@Nullable String value) {
      object.setNeckHeight(value);
      return this;
    }

    public Builder stack(double value) {
      object.setStack(value);
      return this;
    }

    public Builder stack(@Nullable String value) {
      object.setStack(value);
      return this;
    }

    public Builder type(@Nullable String value) {
      object.setType(value);
      return this;
    }

    public Builder yAxis(@Nullable String value) {
      object.setYAxis(value);
      return this;
    }

    public Builder yAxisValueMin(double value) {
      object.setYAxisValueMin(value);
      return this;
    }

    public Builder yAxisValueMax(double value) {
      object.setYAxisValueMax(value);
      return this;
    }
  }
}
