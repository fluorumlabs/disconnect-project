package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The returned object literal from the Highcharts.Axis#getExtremes function.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExtremesObject extends Any {
  /**
   * The maximum value of the axis' associated series.
   *
   */
  @JSProperty("dataMax")
  double getDataMax();

  /**
   * The maximum value of the axis' associated series.
   *
   */
  @JSProperty("dataMax")
  void setDataMax(double value);

  /**
   * The minimum value of the axis' associated series.
   *
   */
  @JSProperty("dataMin")
  double getDataMin();

  /**
   * The minimum value of the axis' associated series.
   *
   */
  @JSProperty("dataMin")
  void setDataMin(double value);

  /**
   * The maximum axis value, either automatic or set manually. If the <code>max</code>
   * option is not set, <code>maxPadding</code> is 0 and <code>endOnTick</code> is false, this value
   * will be the same as <code>dataMax</code>.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * The maximum axis value, either automatic or set manually. If the <code>max</code>
   * option is not set, <code>maxPadding</code> is 0 and <code>endOnTick</code> is false, this value
   * will be the same as <code>dataMax</code>.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * The minimum axis value, either automatic or set manually. If the <code>min</code>
   * option is not set, <code>minPadding</code> is 0 and <code>startOnTick</code> is false, this
   * value will be the same as <code>dataMin</code>.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * The minimum axis value, either automatic or set manually. If the <code>min</code>
   * option is not set, <code>minPadding</code> is 0 and <code>startOnTick</code> is false, this
   * value will be the same as <code>dataMin</code>.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * The user defined maximum, either from the <code>max</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   */
  @JSProperty("userMax")
  double getUserMax();

  /**
   * The user defined maximum, either from the <code>max</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   */
  @JSProperty("userMax")
  void setUserMax(double value);

  /**
   * The user defined minimum, either from the <code>min</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   */
  @JSProperty("userMin")
  double getUserMin();

  /**
   * The user defined minimum, either from the <code>min</code> option or from a zoom or
   * <code>setExtremes</code> action.
   *
   */
  @JSProperty("userMin")
  void setUserMin(double value);

  class Builder {
    private final ExtremesObject object = Any.empty();

    public ExtremesObject build() {
      return object;
    }

    /**
     * The maximum value of the axis' associated series.
     *
     */
    public Builder dataMax(double value) {
      object.setDataMax(value);
      return this;
    }

    /**
     * The minimum value of the axis' associated series.
     *
     */
    public Builder dataMin(double value) {
      object.setDataMin(value);
      return this;
    }

    /**
     * The maximum axis value, either automatic or set manually. If the <code>max</code>
     * option is not set, <code>maxPadding</code> is 0 and <code>endOnTick</code> is false, this value
     * will be the same as <code>dataMax</code>.
     *
     */
    public Builder max(double value) {
      object.setMax(value);
      return this;
    }

    /**
     * The minimum axis value, either automatic or set manually. If the <code>min</code>
     * option is not set, <code>minPadding</code> is 0 and <code>startOnTick</code> is false, this
     * value will be the same as <code>dataMin</code>.
     *
     */
    public Builder min(double value) {
      object.setMin(value);
      return this;
    }

    /**
     * The user defined maximum, either from the <code>max</code> option or from a zoom or
     * <code>setExtremes</code> action.
     *
     */
    public Builder userMax(double value) {
      object.setUserMax(value);
      return this;
    }

    /**
     * The user defined minimum, either from the <code>min</code> option or from a zoom or
     * <code>setExtremes</code> action.
     *
     */
    public Builder userMin(double value) {
      object.setUserMin(value);
      return this;
    }
  }
}
