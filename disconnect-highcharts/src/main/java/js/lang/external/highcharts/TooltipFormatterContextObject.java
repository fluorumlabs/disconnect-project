package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TooltipFormatterContextObject extends Any {
  @JSProperty("color")
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  @JSProperty("color")
  void setColor(PatternObject value);

  @JSProperty("color")
  void setColor(String value);

  @JSProperty("color")
  void setColor(GradientColorObject value);

  @JSProperty("colorIndex")
  double getColorIndex();

  @JSProperty("colorIndex")
  void setColorIndex(double value);

  @JSProperty("key")
  double getKey();

  @JSProperty("key")
  void setKey(double value);

  @JSProperty("percentage")
  double getPercentage();

  @JSProperty("percentage")
  void setPercentage(double value);

  @JSProperty("point")
  Point getPoint();

  @JSProperty("point")
  void setPoint(Point value);

  @JSProperty("points")
  @Nullable
  TooltipFormatterContextObject[] getPoints();

  @JSProperty("points")
  void setPoints(TooltipFormatterContextObject[] value);

  @JSProperty("series")
  Series getSeries();

  @JSProperty("series")
  void setSeries(Series value);

  @JSProperty("total")
  double getTotal();

  @JSProperty("total")
  void setTotal(double value);

  @JSProperty("x")
  double getX();

  @JSProperty("x")
  void setX(double value);

  @JSProperty("y")
  double getY();

  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final TooltipFormatterContextObject object = Any.empty();

    public TooltipFormatterContextObject build() {
      return object;
    }

    public Builder color(PatternObject value) {
      object.setColor(value);
      return this;
    }

    public Builder color(String value) {
      object.setColor(value);
      return this;
    }

    public Builder color(GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    public Builder colorIndex(double value) {
      object.setColorIndex(value);
      return this;
    }

    public Builder key(double value) {
      object.setKey(value);
      return this;
    }

    public Builder percentage(double value) {
      object.setPercentage(value);
      return this;
    }

    public Builder point(Point value) {
      object.setPoint(value);
      return this;
    }

    public Builder points(TooltipFormatterContextObject[] value) {
      object.setPoints(value);
      return this;
    }

    public Builder series(Series value) {
      object.setSeries(value);
      return this;
    }

    public Builder total(double value) {
      object.setTotal(value);
      return this;
    }

    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
