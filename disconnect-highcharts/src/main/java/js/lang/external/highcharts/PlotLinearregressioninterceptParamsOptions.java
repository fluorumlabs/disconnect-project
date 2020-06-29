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
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotLinearregressioninterceptParamsOptions extends Any {
  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   */
  @JSProperty("period")
  double getPeriod();

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) Unit (in milliseconds) for the x axis distances used to
   * compute the regression line paramters (slope &amp; intercept) for every
   * range. In Highstock the x axis values are always represented in
   * milliseconds which may cause that distances between points are &quot;big&quot;
   * integer numbers.
   *
   * Highstock's linear regression algorithm (least squares method) will
   * utilize these &quot;big&quot; integers for finding the slope and the intercept of
   * the regression line for each period. In consequence, this value may be a
   * very &quot;small&quot; decimal number that's hard to interpret by a human.
   *
   * For instance: <code>xAxisUnit</code> equealed to <code>86400000</code> ms (1 day) forces the
   * algorithm to treat <code>86400000</code> as <code>1</code> while computing the slope and the
   * intercept. This may enchance the legiblitity of the indicator's values.
   *
   * Default value is the closest distance between two data points.
   *
   */
  @JSProperty("xAxisUnit")
  double getXAxisUnit();

  /**
   * (Highstock) Unit (in milliseconds) for the x axis distances used to
   * compute the regression line paramters (slope &amp; intercept) for every
   * range. In Highstock the x axis values are always represented in
   * milliseconds which may cause that distances between points are &quot;big&quot;
   * integer numbers.
   *
   * Highstock's linear regression algorithm (least squares method) will
   * utilize these &quot;big&quot; integers for finding the slope and the intercept of
   * the regression line for each period. In consequence, this value may be a
   * very &quot;small&quot; decimal number that's hard to interpret by a human.
   *
   * For instance: <code>xAxisUnit</code> equealed to <code>86400000</code> ms (1 day) forces the
   * algorithm to treat <code>86400000</code> as <code>1</code> while computing the slope and the
   * intercept. This may enchance the legiblitity of the indicator's values.
   *
   * Default value is the closest distance between two data points.
   *
   */
  @JSProperty("xAxisUnit")
  void setXAxisUnit(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotLinearregressioninterceptParamsOptions object = Any.empty();

    private Builder() {
    }

    public PlotLinearregressioninterceptParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     *
     */
    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    /**
     * (Highstock) The base period for indicator calculations. This is the
     * number of data points which are taken into account for the indicator
     * calculations.
     *
     */
    public Builder period(double value) {
      object.setPeriod(value);
      return this;
    }

    /**
     * (Highstock) Unit (in milliseconds) for the x axis distances used to
     * compute the regression line paramters (slope &amp; intercept) for every
     * range. In Highstock the x axis values are always represented in
     * milliseconds which may cause that distances between points are &quot;big&quot;
     * integer numbers.
     *
     * Highstock's linear regression algorithm (least squares method) will
     * utilize these &quot;big&quot; integers for finding the slope and the intercept of
     * the regression line for each period. In consequence, this value may be a
     * very &quot;small&quot; decimal number that's hard to interpret by a human.
     *
     * For instance: <code>xAxisUnit</code> equealed to <code>86400000</code> ms (1 day) forces the
     * algorithm to treat <code>86400000</code> as <code>1</code> while computing the slope and the
     * intercept. This may enchance the legiblitity of the indicator's values.
     *
     * Default value is the closest distance between two data points.
     *
     */
    public Builder xAxisUnit(double value) {
      object.setXAxisUnit(value);
      return this;
    }
  }
}
