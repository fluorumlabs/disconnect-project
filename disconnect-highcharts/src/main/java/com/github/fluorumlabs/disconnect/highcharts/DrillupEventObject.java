package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * The event arguments when drilling up from a drilldown series.
 *
 */
public interface DrillupEventObject extends Any {
  /**
   * Prevents the default behaviour of the event.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  PreventDefault getPreventDefault();

  /**
   * Prevents the default behaviour of the event.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(PreventDefault value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  @Nullable
  Unknown getSeriesOptions();

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesAdOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesStochasticOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesGanttOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesParetoOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesHistogramOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMapPointOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesPriceenvelopesOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesBarOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesWmaOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesBubbleOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesAreaOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesErrorbarOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesCandlestickOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesGaugeOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMfiOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesPieOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesRsiOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesPolygonOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesAtrOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesSunburstOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesSankeyOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesAreasplinerangeOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesOhlcOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesZigzagOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesEmaOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesXrangeOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesVariwideOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesCciOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesScatterOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMaplineOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesAreasplineOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesCmfOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesArearangeOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesFlagsOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesFunnelOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesLineOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesVwapOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesWordcloudOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMacdOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesPsarOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesBulletOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesSolidgaugeOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMapbubbleOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesStreamgraphOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesBbOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesPivotpointsOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesScatter3dOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesTilemapOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesPyramidOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesRocOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesIkhOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesVariablepieOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesHeatmapOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesVbpOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesTreemapOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMomentumOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesWindbarbOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesColumnOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesMapOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesWaterfallOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesSplineOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesBoxplotOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesColumnrangeOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesSmaOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesBellcurveOptions value);

  /**
   * Options for the new series.
   *
   * @implspec seriesOptions?: SeriesOptionsType;
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SeriesVectorOptions value);

  /**
   * The event target.
   *
   * @implspec target: Chart;
   *
   */
  @JSProperty("target")
  Chart getTarget();

  /**
   * The event target.
   *
   * @implspec target: Chart;
   *
   */
  @JSProperty("target")
  void setTarget(Chart value);

  /**
   * The event type.
   *
   * @implspec type: &quot;drillup&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * The event type.
   *
   * @implspec type: &quot;drillup&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PreventDefault extends Any {
    void apply();
  }

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type DRILLUP = JsEnum.of("drillup");
  }
}
