package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Stack of data points
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StackItemObject extends Any {
  /**
   * Alignment settings
   *
   */
  @JSProperty("alignOptions")
  AlignObject getAlignOptions();

  /**
   * Alignment settings
   *
   */
  @JSProperty("alignOptions")
  void setAlignOptions(AlignObject value);

  /**
   * Related axis
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * Related axis
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * Cumulative value of the stacked data points
   *
   */
  @JSProperty("cumulative")
  double getCumulative();

  /**
   * Cumulative value of the stacked data points
   *
   */
  @JSProperty("cumulative")
  void setCumulative(double value);

  /**
   * True if on the negative side
   *
   */
  @JSProperty("isNegative")
  boolean getIsNegative();

  /**
   * True if on the negative side
   *
   */
  @JSProperty("isNegative")
  void setIsNegative(boolean value);

  /**
   * Related SVG element
   *
   */
  @JSProperty("label")
  SVGElement getLabel();

  /**
   * Related SVG element
   *
   */
  @JSProperty("label")
  void setLabel(SVGElement value);

  /**
   * Related stack options
   *
   */
  @JSProperty("options")
  YAxisStackLabelsOptions getOptions();

  /**
   * Related stack options
   *
   */
  @JSProperty("options")
  void setOptions(YAxisStackLabelsOptions value);

  /**
   * Total value of the stacked data points
   *
   */
  @JSProperty("total")
  double getTotal();

  /**
   * Total value of the stacked data points
   *
   */
  @JSProperty("total")
  void setTotal(double value);

  /**
   * Shared x value of the stack
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Shared x value of the stack
   *
   */
  @JSProperty("x")
  void setX(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StackItemObject object = Any.empty();

    private Builder() {
    }

    public StackItemObject build() {
      return object;
    }

    /**
     * Alignment settings
     *
     */
    public Builder alignOptions(AlignObject value) {
      object.setAlignOptions(value);
      return this;
    }

    /**
     * Related axis
     *
     */
    public Builder axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    /**
     * Cumulative value of the stacked data points
     *
     */
    public Builder cumulative(double value) {
      object.setCumulative(value);
      return this;
    }

    /**
     * True if on the negative side
     *
     */
    public Builder isNegative(boolean value) {
      object.setIsNegative(value);
      return this;
    }

    /**
     * Related SVG element
     *
     */
    public Builder label(SVGElement value) {
      object.setLabel(value);
      return this;
    }

    /**
     * Related stack options
     *
     */
    public Builder options(YAxisStackLabelsOptions value) {
      object.setOptions(value);
      return this;
    }

    /**
     * Total value of the stacked data points
     *
     */
    public Builder total(double value) {
      object.setTotal(value);
      return this;
    }

    /**
     * Shared x value of the stack
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }
  }
}
