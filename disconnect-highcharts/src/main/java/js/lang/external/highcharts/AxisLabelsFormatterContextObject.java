package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisLabelsFormatterContextObject<T extends Any> extends Any {
  @JSProperty("axis")
  Axis getAxis();

  @JSProperty("axis")
  void setAxis(Axis value);

  @JSProperty("chart")
  Chart getChart();

  @JSProperty("chart")
  void setChart(Chart value);

  @JSProperty("isFirst")
  boolean getIsFirst();

  @JSProperty("isFirst")
  void setIsFirst(boolean value);

  @JSProperty("isLast")
  boolean getIsLast();

  @JSProperty("isLast")
  void setIsLast(boolean value);

  @JSProperty("pos")
  double getPos();

  @JSProperty("pos")
  void setPos(double value);

  @JSProperty("value")
  T getValue();

  @JSProperty("value")
  void setValue(T value);

  static <T extends Any> Builder<T> builder() {
    return new Builder<T>();
  }

  final class Builder<T extends Any> {
    private final AxisLabelsFormatterContextObject<T> object = Any.empty();

    private Builder() {
    }

    public AxisLabelsFormatterContextObject<T> build() {
      return object;
    }

    public Builder<T> axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    public Builder<T> chart(Chart value) {
      object.setChart(value);
      return this;
    }

    public Builder<T> isFirst(boolean value) {
      object.setIsFirst(value);
      return this;
    }

    public Builder<T> isLast(boolean value) {
      object.setIsLast(value);
      return this;
    }

    public Builder<T> pos(double value) {
      object.setPos(value);
      return this;
    }

    public Builder<T> value(T value) {
      object.setValue(value);
      return this;
    }
  }
}
