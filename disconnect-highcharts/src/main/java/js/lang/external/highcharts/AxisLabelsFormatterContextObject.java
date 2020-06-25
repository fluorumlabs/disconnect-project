package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisLabelsFormatterContextObject extends Any {
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
  double getValue();

  @JSProperty("value")
  void setValue(double value);

  class Builder {
    private final AxisLabelsFormatterContextObject object = Any.empty();

    public AxisLabelsFormatterContextObject build() {
      return object;
    }

    public Builder axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    public Builder chart(Chart value) {
      object.setChart(value);
      return this;
    }

    public Builder isFirst(boolean value) {
      object.setIsFirst(value);
      return this;
    }

    public Builder isLast(boolean value) {
      object.setIsLast(value);
      return this;
    }

    public Builder pos(double value) {
      object.setPos(value);
      return this;
    }

    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
