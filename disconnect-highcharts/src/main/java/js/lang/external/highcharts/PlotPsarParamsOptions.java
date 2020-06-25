package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of regression series' points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPsarParamsOptions extends Any {
  /**
   * (Highstock) Number of maximum decimals that are used in PSAR
   * calculations.
   *
   */
  @JSProperty("decimals")
  double getDecimals();

  /**
   * (Highstock) Number of maximum decimals that are used in PSAR
   * calculations.
   *
   */
  @JSProperty("decimals")
  void setDecimals(double value);

  /**
   * (Highstock) Acceleration factor increases by increment each time the
   * extreme point makes a new high.
   *
   */
  @JSProperty("increment")
  double getIncrement();

  /**
   * (Highstock) Acceleration factor increases by increment each time the
   * extreme point makes a new high.
   *
   */
  @JSProperty("increment")
  void setIncrement(double value);

  /**
   * (Highstock) Index from which PSAR is starting calculation
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highstock) Index from which PSAR is starting calculation
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highstock) The initial value for acceleration factor. Acceleration
   * factor is starting with this value and increases by specified increment
   * each time the extreme point makes a new high. AF can reach a maximum of
   * maxAccelerationFactor, no matter how long the uptrend extends.
   *
   */
  @JSProperty("initialAccelerationFactor")
  double getInitialAccelerationFactor();

  /**
   * (Highstock) The initial value for acceleration factor. Acceleration
   * factor is starting with this value and increases by specified increment
   * each time the extreme point makes a new high. AF can reach a maximum of
   * maxAccelerationFactor, no matter how long the uptrend extends.
   *
   */
  @JSProperty("initialAccelerationFactor")
  void setInitialAccelerationFactor(double value);

  /**
   * (Highstock) The Maximum value for acceleration factor. AF can reach a
   * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
   *
   */
  @JSProperty("maxAccelerationFactor")
  double getMaxAccelerationFactor();

  /**
   * (Highstock) The Maximum value for acceleration factor. AF can reach a
   * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
   *
   */
  @JSProperty("maxAccelerationFactor")
  void setMaxAccelerationFactor(double value);

  class Builder {
    private final PlotPsarParamsOptions object = Any.empty();

    public PlotPsarParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Number of maximum decimals that are used in PSAR
     * calculations.
     *
     */
    public Builder decimals(double value) {
      object.setDecimals(value);
      return this;
    }

    /**
     * (Highstock) Acceleration factor increases by increment each time the
     * extreme point makes a new high.
     *
     */
    public Builder increment(double value) {
      object.setIncrement(value);
      return this;
    }

    /**
     * (Highstock) Index from which PSAR is starting calculation
     *
     */
    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    /**
     * (Highstock) The initial value for acceleration factor. Acceleration
     * factor is starting with this value and increases by specified increment
     * each time the extreme point makes a new high. AF can reach a maximum of
     * maxAccelerationFactor, no matter how long the uptrend extends.
     *
     */
    public Builder initialAccelerationFactor(double value) {
      object.setInitialAccelerationFactor(value);
      return this;
    }

    /**
     * (Highstock) The Maximum value for acceleration factor. AF can reach a
     * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
     *
     */
    public Builder maxAccelerationFactor(double value) {
      object.setMaxAccelerationFactor(value);
      return this;
    }
  }
}
