package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | string ) */;
import org.teavm.jso.JSProperty;

/**
 * Options for the path on the Axis to be calculated.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisPlotLinePathOptionsObject extends Any {
  /**
   * Used in Highstock. When <code>true</code>, plot paths (crosshair, plotLines,
   * gridLines) will be rendered on all axes when defined on the first axis.
   *
   */
  @JSProperty("acrossPanes")
  boolean getAcrossPanes();

  /**
   * Used in Highstock. When <code>true</code>, plot paths (crosshair, plotLines,
   * gridLines) will be rendered on all axes when defined on the first axis.
   *
   */
  @JSProperty("acrossPanes")
  void setAcrossPanes(boolean value);

  /**
   * If <code>false</code>, the function will return null when it falls outside the axis
   * bounds. If <code>true</code>, the function will return a path aligned to the plot
   * area sides if it falls outside. If <code>pass</code>, it will return a path outside.
   *
   */
  @JSProperty("force")
  @Nullable
  Unknown /* ( boolean | string ) */ getForce();

  /**
   * If <code>false</code>, the function will return null when it falls outside the axis
   * bounds. If <code>true</code>, the function will return a path aligned to the plot
   * area sides if it falls outside. If <code>pass</code>, it will return a path outside.
   *
   */
  @JSProperty("force")
  void setForce(boolean value);

  /**
   * If <code>false</code>, the function will return null when it falls outside the axis
   * bounds. If <code>true</code>, the function will return a path aligned to the plot
   * area sides if it falls outside. If <code>pass</code>, it will return a path outside.
   *
   */
  @JSProperty("force")
  void setForce(@Nullable String value);

  /**
   * Line width used for calculation crisp line coordinates. Defaults to 1.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * Line width used for calculation crisp line coordinates. Defaults to 1.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * Use old coordinates (for resizing and rescaling). If not set, defaults to
   * <code>false</code>.
   *
   */
  @JSProperty("old")
  boolean getOld();

  /**
   * Use old coordinates (for resizing and rescaling). If not set, defaults to
   * <code>false</code>.
   *
   */
  @JSProperty("old")
  void setOld(boolean value);

  /**
   * Used in Polar axes. Reverse the positions for concatenation of polygonal
   * plot bands
   *
   */
  @JSProperty("reverse")
  boolean getReverse();

  /**
   * Used in Polar axes. Reverse the positions for concatenation of polygonal
   * plot bands
   *
   */
  @JSProperty("reverse")
  void setReverse(boolean value);

  /**
   * If given, return the plot line path of a pixel position on the axis.
   *
   */
  @JSProperty("translatedValue")
  double getTranslatedValue();

  /**
   * If given, return the plot line path of a pixel position on the axis.
   *
   */
  @JSProperty("translatedValue")
  void setTranslatedValue(double value);

  /**
   * Axis value.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * Axis value.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  class Builder {
    private final AxisPlotLinePathOptionsObject object = Any.empty();

    public AxisPlotLinePathOptionsObject build() {
      return object;
    }

    /**
     * Used in Highstock. When <code>true</code>, plot paths (crosshair, plotLines,
     * gridLines) will be rendered on all axes when defined on the first axis.
     *
     */
    public Builder acrossPanes(boolean value) {
      object.setAcrossPanes(value);
      return this;
    }

    /**
     * If <code>false</code>, the function will return null when it falls outside the axis
     * bounds. If <code>true</code>, the function will return a path aligned to the plot
     * area sides if it falls outside. If <code>pass</code>, it will return a path outside.
     *
     */
    public Builder force(boolean value) {
      object.setForce(value);
      return this;
    }

    /**
     * If <code>false</code>, the function will return null when it falls outside the axis
     * bounds. If <code>true</code>, the function will return a path aligned to the plot
     * area sides if it falls outside. If <code>pass</code>, it will return a path outside.
     *
     */
    public Builder force(@Nullable String value) {
      object.setForce(value);
      return this;
    }

    /**
     * Line width used for calculation crisp line coordinates. Defaults to 1.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * Use old coordinates (for resizing and rescaling). If not set, defaults to
     * <code>false</code>.
     *
     */
    public Builder old(boolean value) {
      object.setOld(value);
      return this;
    }

    /**
     * Used in Polar axes. Reverse the positions for concatenation of polygonal
     * plot bands
     *
     */
    public Builder reverse(boolean value) {
      object.setReverse(value);
      return this;
    }

    /**
     * If given, return the plot line path of a pixel position on the axis.
     *
     */
    public Builder translatedValue(double value) {
      object.setTranslatedValue(value);
      return this;
    }

    /**
     * Axis value.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
