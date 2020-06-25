package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Point information for positioning a tooltip.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TooltipPositionerPointObject extends Any {
  /**
   * If <code>tooltip.split</code> option is enabled and positioner is called for each of
   * the boxes separately, this property indicates the call on the xAxis
   * header, which is not a point itself.
   *
   */
  @JSProperty("isHeader")
  boolean getIsHeader();

  /**
   * If <code>tooltip.split</code> option is enabled and positioner is called for each of
   * the boxes separately, this property indicates the call on the xAxis
   * header, which is not a point itself.
   *
   */
  @JSProperty("isHeader")
  void setIsHeader(boolean value);

  @JSProperty("negative")
  boolean getNegative();

  @JSProperty("negative")
  void setNegative(boolean value);

  /**
   * The reference point relative to the plot area. Add chart.plotLeft to get
   * the full coordinates.
   *
   */
  @JSProperty("plotX")
  double getPlotX();

  /**
   * The reference point relative to the plot area. Add chart.plotLeft to get
   * the full coordinates.
   *
   */
  @JSProperty("plotX")
  void setPlotX(double value);

  /**
   * The reference point relative to the plot area. Add chart.plotTop to get
   * the full coordinates.
   *
   */
  @JSProperty("plotY")
  double getPlotY();

  /**
   * The reference point relative to the plot area. Add chart.plotTop to get
   * the full coordinates.
   *
   */
  @JSProperty("plotY")
  void setPlotY(double value);

  class Builder {
    private final TooltipPositionerPointObject object = Any.empty();

    public TooltipPositionerPointObject build() {
      return object;
    }

    /**
     * If <code>tooltip.split</code> option is enabled and positioner is called for each of
     * the boxes separately, this property indicates the call on the xAxis
     * header, which is not a point itself.
     *
     */
    public Builder isHeader(boolean value) {
      object.setIsHeader(value);
      return this;
    }

    public Builder negative(boolean value) {
      object.setNegative(value);
      return this;
    }

    /**
     * The reference point relative to the plot area. Add chart.plotLeft to get
     * the full coordinates.
     *
     */
    public Builder plotX(double value) {
      object.setPlotX(value);
      return this;
    }

    /**
     * The reference point relative to the plot area. Add chart.plotTop to get
     * the full coordinates.
     *
     */
    public Builder plotY(double value) {
      object.setPlotY(value);
      return this;
    }
  }
}
