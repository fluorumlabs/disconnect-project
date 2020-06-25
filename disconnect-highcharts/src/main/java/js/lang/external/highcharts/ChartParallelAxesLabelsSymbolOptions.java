package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) The symbol for the collapse and expand icon in a treegrid.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartParallelAxesLabelsSymbolOptions extends Any {
  @JSProperty("height")
  double getHeight();

  @JSProperty("height")
  void setHeight(double value);

  @JSProperty("padding")
  double getPadding();

  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Gantt) The symbol type. Points to a definition function in the
   * <code>Highcharts.Renderer.symbols</code> collection.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Gantt) The symbol type. Points to a definition function in the
   * <code>Highcharts.Renderer.symbols</code> collection.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  @JSProperty("x")
  double getX();

  @JSProperty("x")
  void setX(double value);

  @JSProperty("y")
  double getY();

  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final ChartParallelAxesLabelsSymbolOptions object = Any.empty();

    public ChartParallelAxesLabelsSymbolOptions build() {
      return object;
    }

    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Gantt) The symbol type. Points to a definition function in the
     * <code>Highcharts.Renderer.symbols</code> collection.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
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
