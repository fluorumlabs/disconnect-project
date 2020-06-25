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
public interface PlotStochasticParamsOptions extends Any {
  /**
   * (Highstock) Periods for Stochastic oscillator: [%K, %D].
   *
   */
  @JSProperty("periods")
  @Nullable
  Periods2 getPeriods();

  /**
   * (Highstock) Periods for Stochastic oscillator: [%K, %D].
   *
   */
  @JSProperty("periods")
  void setPeriods(@Nullable Periods2 value);

  interface Periods2 extends Any {
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

    class Builder {
      private final Periods2 object = Any.empty();

      public Periods2 build() {
        return object;
      }

      public Periods2.Builder value0(double value) {
        object.setValue0(value);
        return this;
      }

      public Periods2.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }
    }
  }

  class Builder {
    private final PlotStochasticParamsOptions object = Any.empty();

    public PlotStochasticParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Periods for Stochastic oscillator: [%K, %D].
     *
     */
    public Builder periods(@Nullable Periods2 value) {
      object.setPeriods(value);
      return this;
    }
  }
}
