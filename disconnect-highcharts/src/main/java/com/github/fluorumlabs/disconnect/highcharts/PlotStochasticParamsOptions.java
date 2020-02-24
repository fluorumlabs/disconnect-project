package com.github.fluorumlabs.disconnect.highcharts;

import com.github.fluorumlabs.disconnect.types.DoublePair;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

public interface PlotStochasticParamsOptions extends Any {
  /**
   * (Highstock) Periods for Stochastic oscillator: [%K, %D].
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.params.periods">https://api.highcharts.com/highstock/plotOptions.stochastic.params.periods</a>
   *
   * @implspec periods?: [number, number];
   *
   */
  @JSProperty("periods")
  @Nullable
  DoublePair getPeriods();

  /**
   * (Highstock) Periods for Stochastic oscillator: [%K, %D].
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.params.periods">https://api.highcharts.com/highstock/plotOptions.stochastic.params.periods</a>
   *
   * @implspec periods?: [number, number];
   *
   */
  @JSProperty("periods")
  void setPeriods(DoublePair value);
}
