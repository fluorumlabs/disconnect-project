package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;
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
public interface PlotSlowstochasticParamsOptions extends Any {
  /**
   * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
   *
   */
  @JSProperty("periods")
  @Nullable
  Periods3 getPeriods();

  /**
   * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
   *
   */
  @JSProperty("periods")
  void setPeriods(@Nullable Periods3 value);

  interface Periods3 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    double getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(double value);

    @JSBody(
        script = "return this[1]"
    )
    double getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(double value);

    @JSBody(
        script = "return this[2]"
    )
    double getValue2();

    @JSBody(
        params = "value",
        script = "this[2] = value"
    )
    void setValue2(double value);

    class Builder {
      private final Periods3 object = Any.empty();

      public Periods3 build() {
        return object;
      }

      public Periods3.Builder value0(double value) {
        object.setValue0(value);
        return this;
      }

      public Periods3.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }

      public Periods3.Builder value2(double value) {
        object.setValue2(value);
        return this;
      }
    }
  }

  class Builder {
    private final PlotSlowstochasticParamsOptions object = Any.empty();

    public PlotSlowstochasticParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
     *
     */
    public Builder periods(@Nullable Periods3 value) {
      object.setPeriods(value);
      return this;
    }
  }
}
