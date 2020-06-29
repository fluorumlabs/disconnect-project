package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The registry for all types of series options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesOptionsRegistry extends Any {
  @JSProperty("SeriesAbandsOptions")
  SeriesAbandsOptions getSeriesAbandsOptions();

  @JSProperty("SeriesAbandsOptions")
  void setSeriesAbandsOptions(SeriesAbandsOptions value);

  @JSProperty("SeriesAdOptions")
  SeriesAdOptions getSeriesAdOptions();

  @JSProperty("SeriesAdOptions")
  void setSeriesAdOptions(SeriesAdOptions value);

  @JSProperty("SeriesAoOptions")
  SeriesAoOptions getSeriesAoOptions();

  @JSProperty("SeriesAoOptions")
  void setSeriesAoOptions(SeriesAoOptions value);

  @JSProperty("SeriesApoOptions")
  SeriesApoOptions getSeriesApoOptions();

  @JSProperty("SeriesApoOptions")
  void setSeriesApoOptions(SeriesApoOptions value);

  @JSProperty("SeriesAreaOptions")
  SeriesAreaOptions getSeriesAreaOptions();

  @JSProperty("SeriesAreaOptions")
  void setSeriesAreaOptions(SeriesAreaOptions value);

  @JSProperty("SeriesArearangeOptions")
  SeriesArearangeOptions getSeriesArearangeOptions();

  @JSProperty("SeriesArearangeOptions")
  void setSeriesArearangeOptions(SeriesArearangeOptions value);

  @JSProperty("SeriesAreasplineOptions")
  SeriesAreasplineOptions getSeriesAreasplineOptions();

  @JSProperty("SeriesAreasplineOptions")
  void setSeriesAreasplineOptions(SeriesAreasplineOptions value);

  @JSProperty("SeriesAreasplinerangeOptions")
  SeriesAreasplinerangeOptions getSeriesAreasplinerangeOptions();

  @JSProperty("SeriesAreasplinerangeOptions")
  void setSeriesAreasplinerangeOptions(SeriesAreasplinerangeOptions value);

  @JSProperty("SeriesAroonOptions")
  SeriesAroonOptions getSeriesAroonOptions();

  @JSProperty("SeriesAroonOptions")
  void setSeriesAroonOptions(SeriesAroonOptions value);

  @JSProperty("SeriesAroonoscillatorOptions")
  SeriesAroonoscillatorOptions getSeriesAroonoscillatorOptions();

  @JSProperty("SeriesAroonoscillatorOptions")
  void setSeriesAroonoscillatorOptions(SeriesAroonoscillatorOptions value);

  @JSProperty("SeriesAtrOptions")
  SeriesAtrOptions getSeriesAtrOptions();

  @JSProperty("SeriesAtrOptions")
  void setSeriesAtrOptions(SeriesAtrOptions value);

  @JSProperty("SeriesBarOptions")
  SeriesBarOptions getSeriesBarOptions();

  @JSProperty("SeriesBarOptions")
  void setSeriesBarOptions(SeriesBarOptions value);

  @JSProperty("SeriesBbOptions")
  SeriesBbOptions getSeriesBbOptions();

  @JSProperty("SeriesBbOptions")
  void setSeriesBbOptions(SeriesBbOptions value);

  @JSProperty("SeriesBellcurveOptions")
  SeriesBellcurveOptions getSeriesBellcurveOptions();

  @JSProperty("SeriesBellcurveOptions")
  void setSeriesBellcurveOptions(SeriesBellcurveOptions value);

  @JSProperty("SeriesBoxplotOptions")
  SeriesBoxplotOptions getSeriesBoxplotOptions();

  @JSProperty("SeriesBoxplotOptions")
  void setSeriesBoxplotOptions(SeriesBoxplotOptions value);

  @JSProperty("SeriesBubbleOptions")
  SeriesBubbleOptions getSeriesBubbleOptions();

  @JSProperty("SeriesBubbleOptions")
  void setSeriesBubbleOptions(SeriesBubbleOptions value);

  @JSProperty("SeriesBulletOptions")
  SeriesBulletOptions getSeriesBulletOptions();

  @JSProperty("SeriesBulletOptions")
  void setSeriesBulletOptions(SeriesBulletOptions value);

  @JSProperty("SeriesCandlestickOptions")
  SeriesCandlestickOptions getSeriesCandlestickOptions();

  @JSProperty("SeriesCandlestickOptions")
  void setSeriesCandlestickOptions(SeriesCandlestickOptions value);

  @JSProperty("SeriesCciOptions")
  SeriesCciOptions getSeriesCciOptions();

  @JSProperty("SeriesCciOptions")
  void setSeriesCciOptions(SeriesCciOptions value);

  @JSProperty("SeriesChaikinOptions")
  SeriesChaikinOptions getSeriesChaikinOptions();

  @JSProperty("SeriesChaikinOptions")
  void setSeriesChaikinOptions(SeriesChaikinOptions value);

  @JSProperty("SeriesCmfOptions")
  SeriesCmfOptions getSeriesCmfOptions();

  @JSProperty("SeriesCmfOptions")
  void setSeriesCmfOptions(SeriesCmfOptions value);

  @JSProperty("SeriesColumnOptions")
  SeriesColumnOptions getSeriesColumnOptions();

  @JSProperty("SeriesColumnOptions")
  void setSeriesColumnOptions(SeriesColumnOptions value);

  @JSProperty("SeriesColumnpyramidOptions")
  SeriesColumnpyramidOptions getSeriesColumnpyramidOptions();

  @JSProperty("SeriesColumnpyramidOptions")
  void setSeriesColumnpyramidOptions(SeriesColumnpyramidOptions value);

  @JSProperty("SeriesColumnrangeOptions")
  SeriesColumnrangeOptions getSeriesColumnrangeOptions();

  @JSProperty("SeriesColumnrangeOptions")
  void setSeriesColumnrangeOptions(SeriesColumnrangeOptions value);

  @JSProperty("SeriesCylinderOptions")
  SeriesCylinderOptions getSeriesCylinderOptions();

  @JSProperty("SeriesCylinderOptions")
  void setSeriesCylinderOptions(SeriesCylinderOptions value);

  @JSProperty("SeriesDemaOptions")
  SeriesDemaOptions getSeriesDemaOptions();

  @JSProperty("SeriesDemaOptions")
  void setSeriesDemaOptions(SeriesDemaOptions value);

  @JSProperty("SeriesDependencywheelOptions")
  SeriesDependencywheelOptions getSeriesDependencywheelOptions();

  @JSProperty("SeriesDependencywheelOptions")
  void setSeriesDependencywheelOptions(SeriesDependencywheelOptions value);

  @JSProperty("SeriesDpoOptions")
  SeriesDpoOptions getSeriesDpoOptions();

  @JSProperty("SeriesDpoOptions")
  void setSeriesDpoOptions(SeriesDpoOptions value);

  @JSProperty("SeriesDumbbellOptions")
  SeriesDumbbellOptions getSeriesDumbbellOptions();

  @JSProperty("SeriesDumbbellOptions")
  void setSeriesDumbbellOptions(SeriesDumbbellOptions value);

  @JSProperty("SeriesEmaOptions")
  SeriesEmaOptions getSeriesEmaOptions();

  @JSProperty("SeriesEmaOptions")
  void setSeriesEmaOptions(SeriesEmaOptions value);

  @JSProperty("SeriesErrorbarOptions")
  SeriesErrorbarOptions getSeriesErrorbarOptions();

  @JSProperty("SeriesErrorbarOptions")
  void setSeriesErrorbarOptions(SeriesErrorbarOptions value);

  @JSProperty("SeriesFlagsOptions")
  SeriesFlagsOptions getSeriesFlagsOptions();

  @JSProperty("SeriesFlagsOptions")
  void setSeriesFlagsOptions(SeriesFlagsOptions value);

  @JSProperty("SeriesFunnel3dOptions")
  SeriesFunnel3dOptions getSeriesFunnel3dOptions();

  @JSProperty("SeriesFunnel3dOptions")
  void setSeriesFunnel3dOptions(SeriesFunnel3dOptions value);

  @JSProperty("SeriesFunnelOptions")
  SeriesFunnelOptions getSeriesFunnelOptions();

  @JSProperty("SeriesFunnelOptions")
  void setSeriesFunnelOptions(SeriesFunnelOptions value);

  @JSProperty("SeriesGanttOptions")
  SeriesGanttOptions getSeriesGanttOptions();

  @JSProperty("SeriesGanttOptions")
  void setSeriesGanttOptions(SeriesGanttOptions value);

  @JSProperty("SeriesGaugeOptions")
  SeriesGaugeOptions getSeriesGaugeOptions();

  @JSProperty("SeriesGaugeOptions")
  void setSeriesGaugeOptions(SeriesGaugeOptions value);

  @JSProperty("SeriesHeatmapOptions")
  SeriesHeatmapOptions getSeriesHeatmapOptions();

  @JSProperty("SeriesHeatmapOptions")
  void setSeriesHeatmapOptions(SeriesHeatmapOptions value);

  @JSProperty("SeriesHistogramOptions")
  SeriesHistogramOptions getSeriesHistogramOptions();

  @JSProperty("SeriesHistogramOptions")
  void setSeriesHistogramOptions(SeriesHistogramOptions value);

  @JSProperty("SeriesIkhOptions")
  SeriesIkhOptions getSeriesIkhOptions();

  @JSProperty("SeriesIkhOptions")
  void setSeriesIkhOptions(SeriesIkhOptions value);

  @JSProperty("SeriesItemOptions")
  SeriesItemOptions getSeriesItemOptions();

  @JSProperty("SeriesItemOptions")
  void setSeriesItemOptions(SeriesItemOptions value);

  @JSProperty("SeriesKeltnerchannelsOptions")
  SeriesKeltnerchannelsOptions getSeriesKeltnerchannelsOptions();

  @JSProperty("SeriesKeltnerchannelsOptions")
  void setSeriesKeltnerchannelsOptions(SeriesKeltnerchannelsOptions value);

  @JSProperty("SeriesLinearregressionangleOptions")
  SeriesLinearregressionangleOptions getSeriesLinearregressionangleOptions();

  @JSProperty("SeriesLinearregressionangleOptions")
  void setSeriesLinearregressionangleOptions(SeriesLinearregressionangleOptions value);

  @JSProperty("SeriesLinearregressioninterceptOptions")
  SeriesLinearregressioninterceptOptions getSeriesLinearregressioninterceptOptions();

  @JSProperty("SeriesLinearregressioninterceptOptions")
  void setSeriesLinearregressioninterceptOptions(SeriesLinearregressioninterceptOptions value);

  @JSProperty("SeriesLinearregressionOptions")
  SeriesLinearregressionOptions getSeriesLinearregressionOptions();

  @JSProperty("SeriesLinearregressionOptions")
  void setSeriesLinearregressionOptions(SeriesLinearregressionOptions value);

  @JSProperty("SeriesLinearregressionslopeOptions")
  SeriesLinearregressionslopeOptions getSeriesLinearregressionslopeOptions();

  @JSProperty("SeriesLinearregressionslopeOptions")
  void setSeriesLinearregressionslopeOptions(SeriesLinearregressionslopeOptions value);

  @JSProperty("SeriesLineOptions")
  SeriesLineOptions getSeriesLineOptions();

  @JSProperty("SeriesLineOptions")
  void setSeriesLineOptions(SeriesLineOptions value);

  @JSProperty("SeriesLollipopOptions")
  SeriesLollipopOptions getSeriesLollipopOptions();

  @JSProperty("SeriesLollipopOptions")
  void setSeriesLollipopOptions(SeriesLollipopOptions value);

  @JSProperty("SeriesMacdOptions")
  SeriesMacdOptions getSeriesMacdOptions();

  @JSProperty("SeriesMacdOptions")
  void setSeriesMacdOptions(SeriesMacdOptions value);

  @JSProperty("SeriesMapbubbleOptions")
  SeriesMapbubbleOptions getSeriesMapbubbleOptions();

  @JSProperty("SeriesMapbubbleOptions")
  void setSeriesMapbubbleOptions(SeriesMapbubbleOptions value);

  @JSProperty("SeriesMaplineOptions")
  SeriesMaplineOptions getSeriesMaplineOptions();

  @JSProperty("SeriesMaplineOptions")
  void setSeriesMaplineOptions(SeriesMaplineOptions value);

  @JSProperty("SeriesMapOptions")
  SeriesMapOptions getSeriesMapOptions();

  @JSProperty("SeriesMapOptions")
  void setSeriesMapOptions(SeriesMapOptions value);

  @JSProperty("SeriesMappointOptions")
  SeriesMappointOptions getSeriesMappointOptions();

  @JSProperty("SeriesMappointOptions")
  void setSeriesMappointOptions(SeriesMappointOptions value);

  @JSProperty("SeriesMfiOptions")
  SeriesMfiOptions getSeriesMfiOptions();

  @JSProperty("SeriesMfiOptions")
  void setSeriesMfiOptions(SeriesMfiOptions value);

  @JSProperty("SeriesMomentumOptions")
  SeriesMomentumOptions getSeriesMomentumOptions();

  @JSProperty("SeriesMomentumOptions")
  void setSeriesMomentumOptions(SeriesMomentumOptions value);

  @JSProperty("SeriesNatrOptions")
  SeriesNatrOptions getSeriesNatrOptions();

  @JSProperty("SeriesNatrOptions")
  void setSeriesNatrOptions(SeriesNatrOptions value);

  @JSProperty("SeriesNetworkgraphOptions")
  SeriesNetworkgraphOptions getSeriesNetworkgraphOptions();

  @JSProperty("SeriesNetworkgraphOptions")
  void setSeriesNetworkgraphOptions(SeriesNetworkgraphOptions value);

  @JSProperty("SeriesOhlcOptions")
  SeriesOhlcOptions getSeriesOhlcOptions();

  @JSProperty("SeriesOhlcOptions")
  void setSeriesOhlcOptions(SeriesOhlcOptions value);

  @JSProperty("SeriesOrganizationOptions")
  SeriesOrganizationOptions getSeriesOrganizationOptions();

  @JSProperty("SeriesOrganizationOptions")
  void setSeriesOrganizationOptions(SeriesOrganizationOptions value);

  @JSProperty("SeriesPackedbubbleOptions")
  SeriesPackedbubbleOptions getSeriesPackedbubbleOptions();

  @JSProperty("SeriesPackedbubbleOptions")
  void setSeriesPackedbubbleOptions(SeriesPackedbubbleOptions value);

  @JSProperty("SeriesParetoOptions")
  SeriesParetoOptions getSeriesParetoOptions();

  @JSProperty("SeriesParetoOptions")
  void setSeriesParetoOptions(SeriesParetoOptions value);

  @JSProperty("SeriesPcOptions")
  SeriesPcOptions getSeriesPcOptions();

  @JSProperty("SeriesPcOptions")
  void setSeriesPcOptions(SeriesPcOptions value);

  @JSProperty("SeriesPieOptions")
  SeriesPieOptions getSeriesPieOptions();

  @JSProperty("SeriesPieOptions")
  void setSeriesPieOptions(SeriesPieOptions value);

  @JSProperty("SeriesPivotpointsOptions")
  SeriesPivotpointsOptions getSeriesPivotpointsOptions();

  @JSProperty("SeriesPivotpointsOptions")
  void setSeriesPivotpointsOptions(SeriesPivotpointsOptions value);

  @JSProperty("SeriesPolygonOptions")
  SeriesPolygonOptions getSeriesPolygonOptions();

  @JSProperty("SeriesPolygonOptions")
  void setSeriesPolygonOptions(SeriesPolygonOptions value);

  @JSProperty("SeriesPpoOptions")
  SeriesPpoOptions getSeriesPpoOptions();

  @JSProperty("SeriesPpoOptions")
  void setSeriesPpoOptions(SeriesPpoOptions value);

  @JSProperty("SeriesPriceenvelopesOptions")
  SeriesPriceenvelopesOptions getSeriesPriceenvelopesOptions();

  @JSProperty("SeriesPriceenvelopesOptions")
  void setSeriesPriceenvelopesOptions(SeriesPriceenvelopesOptions value);

  @JSProperty("SeriesPsarOptions")
  SeriesPsarOptions getSeriesPsarOptions();

  @JSProperty("SeriesPsarOptions")
  void setSeriesPsarOptions(SeriesPsarOptions value);

  @JSProperty("SeriesPyramid3dOptions")
  SeriesPyramid3dOptions getSeriesPyramid3dOptions();

  @JSProperty("SeriesPyramid3dOptions")
  void setSeriesPyramid3dOptions(SeriesPyramid3dOptions value);

  @JSProperty("SeriesPyramidOptions")
  SeriesPyramidOptions getSeriesPyramidOptions();

  @JSProperty("SeriesPyramidOptions")
  void setSeriesPyramidOptions(SeriesPyramidOptions value);

  @JSProperty("SeriesRocOptions")
  SeriesRocOptions getSeriesRocOptions();

  @JSProperty("SeriesRocOptions")
  void setSeriesRocOptions(SeriesRocOptions value);

  @JSProperty("SeriesRsiOptions")
  SeriesRsiOptions getSeriesRsiOptions();

  @JSProperty("SeriesRsiOptions")
  void setSeriesRsiOptions(SeriesRsiOptions value);

  @JSProperty("SeriesSankeyOptions")
  SeriesSankeyOptions getSeriesSankeyOptions();

  @JSProperty("SeriesSankeyOptions")
  void setSeriesSankeyOptions(SeriesSankeyOptions value);

  @JSProperty("SeriesScatter3dOptions")
  SeriesScatter3dOptions getSeriesScatter3dOptions();

  @JSProperty("SeriesScatter3dOptions")
  void setSeriesScatter3dOptions(SeriesScatter3dOptions value);

  @JSProperty("SeriesScatterOptions")
  SeriesScatterOptions getSeriesScatterOptions();

  @JSProperty("SeriesScatterOptions")
  void setSeriesScatterOptions(SeriesScatterOptions value);

  @JSProperty("SeriesSlowstochasticOptions")
  SeriesSlowstochasticOptions getSeriesSlowstochasticOptions();

  @JSProperty("SeriesSlowstochasticOptions")
  void setSeriesSlowstochasticOptions(SeriesSlowstochasticOptions value);

  @JSProperty("SeriesSmaOptions")
  SeriesSmaOptions getSeriesSmaOptions();

  @JSProperty("SeriesSmaOptions")
  void setSeriesSmaOptions(SeriesSmaOptions value);

  @JSProperty("SeriesSolidgaugeOptions")
  SeriesSolidgaugeOptions getSeriesSolidgaugeOptions();

  @JSProperty("SeriesSolidgaugeOptions")
  void setSeriesSolidgaugeOptions(SeriesSolidgaugeOptions value);

  @JSProperty("SeriesSplineOptions")
  SeriesSplineOptions getSeriesSplineOptions();

  @JSProperty("SeriesSplineOptions")
  void setSeriesSplineOptions(SeriesSplineOptions value);

  @JSProperty("SeriesStochasticOptions")
  SeriesStochasticOptions getSeriesStochasticOptions();

  @JSProperty("SeriesStochasticOptions")
  void setSeriesStochasticOptions(SeriesStochasticOptions value);

  @JSProperty("SeriesStreamgraphOptions")
  SeriesStreamgraphOptions getSeriesStreamgraphOptions();

  @JSProperty("SeriesStreamgraphOptions")
  void setSeriesStreamgraphOptions(SeriesStreamgraphOptions value);

  @JSProperty("SeriesSunburstOptions")
  SeriesSunburstOptions getSeriesSunburstOptions();

  @JSProperty("SeriesSunburstOptions")
  void setSeriesSunburstOptions(SeriesSunburstOptions value);

  @JSProperty("SeriesSupertrendOptions")
  SeriesSupertrendOptions getSeriesSupertrendOptions();

  @JSProperty("SeriesSupertrendOptions")
  void setSeriesSupertrendOptions(SeriesSupertrendOptions value);

  @JSProperty("SeriesTemaOptions")
  SeriesTemaOptions getSeriesTemaOptions();

  @JSProperty("SeriesTemaOptions")
  void setSeriesTemaOptions(SeriesTemaOptions value);

  @JSProperty("SeriesTilemapOptions")
  SeriesTilemapOptions getSeriesTilemapOptions();

  @JSProperty("SeriesTilemapOptions")
  void setSeriesTilemapOptions(SeriesTilemapOptions value);

  @JSProperty("SeriesTimelineOptions")
  SeriesTimelineOptions getSeriesTimelineOptions();

  @JSProperty("SeriesTimelineOptions")
  void setSeriesTimelineOptions(SeriesTimelineOptions value);

  @JSProperty("SeriesTreemapOptions")
  SeriesTreemapOptions getSeriesTreemapOptions();

  @JSProperty("SeriesTreemapOptions")
  void setSeriesTreemapOptions(SeriesTreemapOptions value);

  @JSProperty("SeriesTrendlineOptions")
  SeriesTrendlineOptions getSeriesTrendlineOptions();

  @JSProperty("SeriesTrendlineOptions")
  void setSeriesTrendlineOptions(SeriesTrendlineOptions value);

  @JSProperty("SeriesTrixOptions")
  SeriesTrixOptions getSeriesTrixOptions();

  @JSProperty("SeriesTrixOptions")
  void setSeriesTrixOptions(SeriesTrixOptions value);

  @JSProperty("SeriesVariablepieOptions")
  SeriesVariablepieOptions getSeriesVariablepieOptions();

  @JSProperty("SeriesVariablepieOptions")
  void setSeriesVariablepieOptions(SeriesVariablepieOptions value);

  @JSProperty("SeriesVariwideOptions")
  SeriesVariwideOptions getSeriesVariwideOptions();

  @JSProperty("SeriesVariwideOptions")
  void setSeriesVariwideOptions(SeriesVariwideOptions value);

  @JSProperty("SeriesVbpOptions")
  SeriesVbpOptions getSeriesVbpOptions();

  @JSProperty("SeriesVbpOptions")
  void setSeriesVbpOptions(SeriesVbpOptions value);

  @JSProperty("SeriesVectorOptions")
  SeriesVectorOptions getSeriesVectorOptions();

  @JSProperty("SeriesVectorOptions")
  void setSeriesVectorOptions(SeriesVectorOptions value);

  @JSProperty("SeriesVennOptions")
  SeriesVennOptions getSeriesVennOptions();

  @JSProperty("SeriesVennOptions")
  void setSeriesVennOptions(SeriesVennOptions value);

  @JSProperty("SeriesVwapOptions")
  SeriesVwapOptions getSeriesVwapOptions();

  @JSProperty("SeriesVwapOptions")
  void setSeriesVwapOptions(SeriesVwapOptions value);

  @JSProperty("SeriesWaterfallOptions")
  SeriesWaterfallOptions getSeriesWaterfallOptions();

  @JSProperty("SeriesWaterfallOptions")
  void setSeriesWaterfallOptions(SeriesWaterfallOptions value);

  @JSProperty("SeriesWilliamsrOptions")
  SeriesWilliamsrOptions getSeriesWilliamsrOptions();

  @JSProperty("SeriesWilliamsrOptions")
  void setSeriesWilliamsrOptions(SeriesWilliamsrOptions value);

  @JSProperty("SeriesWindbarbOptions")
  SeriesWindbarbOptions getSeriesWindbarbOptions();

  @JSProperty("SeriesWindbarbOptions")
  void setSeriesWindbarbOptions(SeriesWindbarbOptions value);

  @JSProperty("SeriesWmaOptions")
  SeriesWmaOptions getSeriesWmaOptions();

  @JSProperty("SeriesWmaOptions")
  void setSeriesWmaOptions(SeriesWmaOptions value);

  @JSProperty("SeriesWordcloudOptions")
  SeriesWordcloudOptions getSeriesWordcloudOptions();

  @JSProperty("SeriesWordcloudOptions")
  void setSeriesWordcloudOptions(SeriesWordcloudOptions value);

  @JSProperty("SeriesXrangeOptions")
  SeriesXrangeOptions getSeriesXrangeOptions();

  @JSProperty("SeriesXrangeOptions")
  void setSeriesXrangeOptions(SeriesXrangeOptions value);

  @JSProperty("SeriesZigzagOptions")
  SeriesZigzagOptions getSeriesZigzagOptions();

  @JSProperty("SeriesZigzagOptions")
  void setSeriesZigzagOptions(SeriesZigzagOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesOptionsRegistry object = Any.empty();

    private Builder() {
    }

    public SeriesOptionsRegistry build() {
      return object;
    }

    public Builder SeriesAbandsOptions(SeriesAbandsOptions value) {
      object.setSeriesAbandsOptions(value);
      return this;
    }

    public Builder SeriesAdOptions(SeriesAdOptions value) {
      object.setSeriesAdOptions(value);
      return this;
    }

    public Builder SeriesAoOptions(SeriesAoOptions value) {
      object.setSeriesAoOptions(value);
      return this;
    }

    public Builder SeriesApoOptions(SeriesApoOptions value) {
      object.setSeriesApoOptions(value);
      return this;
    }

    public Builder SeriesAreaOptions(SeriesAreaOptions value) {
      object.setSeriesAreaOptions(value);
      return this;
    }

    public Builder SeriesArearangeOptions(SeriesArearangeOptions value) {
      object.setSeriesArearangeOptions(value);
      return this;
    }

    public Builder SeriesAreasplineOptions(SeriesAreasplineOptions value) {
      object.setSeriesAreasplineOptions(value);
      return this;
    }

    public Builder SeriesAreasplinerangeOptions(SeriesAreasplinerangeOptions value) {
      object.setSeriesAreasplinerangeOptions(value);
      return this;
    }

    public Builder SeriesAroonOptions(SeriesAroonOptions value) {
      object.setSeriesAroonOptions(value);
      return this;
    }

    public Builder SeriesAroonoscillatorOptions(SeriesAroonoscillatorOptions value) {
      object.setSeriesAroonoscillatorOptions(value);
      return this;
    }

    public Builder SeriesAtrOptions(SeriesAtrOptions value) {
      object.setSeriesAtrOptions(value);
      return this;
    }

    public Builder SeriesBarOptions(SeriesBarOptions value) {
      object.setSeriesBarOptions(value);
      return this;
    }

    public Builder SeriesBbOptions(SeriesBbOptions value) {
      object.setSeriesBbOptions(value);
      return this;
    }

    public Builder SeriesBellcurveOptions(SeriesBellcurveOptions value) {
      object.setSeriesBellcurveOptions(value);
      return this;
    }

    public Builder SeriesBoxplotOptions(SeriesBoxplotOptions value) {
      object.setSeriesBoxplotOptions(value);
      return this;
    }

    public Builder SeriesBubbleOptions(SeriesBubbleOptions value) {
      object.setSeriesBubbleOptions(value);
      return this;
    }

    public Builder SeriesBulletOptions(SeriesBulletOptions value) {
      object.setSeriesBulletOptions(value);
      return this;
    }

    public Builder SeriesCandlestickOptions(SeriesCandlestickOptions value) {
      object.setSeriesCandlestickOptions(value);
      return this;
    }

    public Builder SeriesCciOptions(SeriesCciOptions value) {
      object.setSeriesCciOptions(value);
      return this;
    }

    public Builder SeriesChaikinOptions(SeriesChaikinOptions value) {
      object.setSeriesChaikinOptions(value);
      return this;
    }

    public Builder SeriesCmfOptions(SeriesCmfOptions value) {
      object.setSeriesCmfOptions(value);
      return this;
    }

    public Builder SeriesColumnOptions(SeriesColumnOptions value) {
      object.setSeriesColumnOptions(value);
      return this;
    }

    public Builder SeriesColumnpyramidOptions(SeriesColumnpyramidOptions value) {
      object.setSeriesColumnpyramidOptions(value);
      return this;
    }

    public Builder SeriesColumnrangeOptions(SeriesColumnrangeOptions value) {
      object.setSeriesColumnrangeOptions(value);
      return this;
    }

    public Builder SeriesCylinderOptions(SeriesCylinderOptions value) {
      object.setSeriesCylinderOptions(value);
      return this;
    }

    public Builder SeriesDemaOptions(SeriesDemaOptions value) {
      object.setSeriesDemaOptions(value);
      return this;
    }

    public Builder SeriesDependencywheelOptions(SeriesDependencywheelOptions value) {
      object.setSeriesDependencywheelOptions(value);
      return this;
    }

    public Builder SeriesDpoOptions(SeriesDpoOptions value) {
      object.setSeriesDpoOptions(value);
      return this;
    }

    public Builder SeriesDumbbellOptions(SeriesDumbbellOptions value) {
      object.setSeriesDumbbellOptions(value);
      return this;
    }

    public Builder SeriesEmaOptions(SeriesEmaOptions value) {
      object.setSeriesEmaOptions(value);
      return this;
    }

    public Builder SeriesErrorbarOptions(SeriesErrorbarOptions value) {
      object.setSeriesErrorbarOptions(value);
      return this;
    }

    public Builder SeriesFlagsOptions(SeriesFlagsOptions value) {
      object.setSeriesFlagsOptions(value);
      return this;
    }

    public Builder SeriesFunnel3dOptions(SeriesFunnel3dOptions value) {
      object.setSeriesFunnel3dOptions(value);
      return this;
    }

    public Builder SeriesFunnelOptions(SeriesFunnelOptions value) {
      object.setSeriesFunnelOptions(value);
      return this;
    }

    public Builder SeriesGanttOptions(SeriesGanttOptions value) {
      object.setSeriesGanttOptions(value);
      return this;
    }

    public Builder SeriesGaugeOptions(SeriesGaugeOptions value) {
      object.setSeriesGaugeOptions(value);
      return this;
    }

    public Builder SeriesHeatmapOptions(SeriesHeatmapOptions value) {
      object.setSeriesHeatmapOptions(value);
      return this;
    }

    public Builder SeriesHistogramOptions(SeriesHistogramOptions value) {
      object.setSeriesHistogramOptions(value);
      return this;
    }

    public Builder SeriesIkhOptions(SeriesIkhOptions value) {
      object.setSeriesIkhOptions(value);
      return this;
    }

    public Builder SeriesItemOptions(SeriesItemOptions value) {
      object.setSeriesItemOptions(value);
      return this;
    }

    public Builder SeriesKeltnerchannelsOptions(SeriesKeltnerchannelsOptions value) {
      object.setSeriesKeltnerchannelsOptions(value);
      return this;
    }

    public Builder SeriesLinearregressionangleOptions(SeriesLinearregressionangleOptions value) {
      object.setSeriesLinearregressionangleOptions(value);
      return this;
    }

    public Builder SeriesLinearregressioninterceptOptions(
        SeriesLinearregressioninterceptOptions value) {
      object.setSeriesLinearregressioninterceptOptions(value);
      return this;
    }

    public Builder SeriesLinearregressionOptions(SeriesLinearregressionOptions value) {
      object.setSeriesLinearregressionOptions(value);
      return this;
    }

    public Builder SeriesLinearregressionslopeOptions(SeriesLinearregressionslopeOptions value) {
      object.setSeriesLinearregressionslopeOptions(value);
      return this;
    }

    public Builder SeriesLineOptions(SeriesLineOptions value) {
      object.setSeriesLineOptions(value);
      return this;
    }

    public Builder SeriesLollipopOptions(SeriesLollipopOptions value) {
      object.setSeriesLollipopOptions(value);
      return this;
    }

    public Builder SeriesMacdOptions(SeriesMacdOptions value) {
      object.setSeriesMacdOptions(value);
      return this;
    }

    public Builder SeriesMapbubbleOptions(SeriesMapbubbleOptions value) {
      object.setSeriesMapbubbleOptions(value);
      return this;
    }

    public Builder SeriesMaplineOptions(SeriesMaplineOptions value) {
      object.setSeriesMaplineOptions(value);
      return this;
    }

    public Builder SeriesMapOptions(SeriesMapOptions value) {
      object.setSeriesMapOptions(value);
      return this;
    }

    public Builder SeriesMappointOptions(SeriesMappointOptions value) {
      object.setSeriesMappointOptions(value);
      return this;
    }

    public Builder SeriesMfiOptions(SeriesMfiOptions value) {
      object.setSeriesMfiOptions(value);
      return this;
    }

    public Builder SeriesMomentumOptions(SeriesMomentumOptions value) {
      object.setSeriesMomentumOptions(value);
      return this;
    }

    public Builder SeriesNatrOptions(SeriesNatrOptions value) {
      object.setSeriesNatrOptions(value);
      return this;
    }

    public Builder SeriesNetworkgraphOptions(SeriesNetworkgraphOptions value) {
      object.setSeriesNetworkgraphOptions(value);
      return this;
    }

    public Builder SeriesOhlcOptions(SeriesOhlcOptions value) {
      object.setSeriesOhlcOptions(value);
      return this;
    }

    public Builder SeriesOrganizationOptions(SeriesOrganizationOptions value) {
      object.setSeriesOrganizationOptions(value);
      return this;
    }

    public Builder SeriesPackedbubbleOptions(SeriesPackedbubbleOptions value) {
      object.setSeriesPackedbubbleOptions(value);
      return this;
    }

    public Builder SeriesParetoOptions(SeriesParetoOptions value) {
      object.setSeriesParetoOptions(value);
      return this;
    }

    public Builder SeriesPcOptions(SeriesPcOptions value) {
      object.setSeriesPcOptions(value);
      return this;
    }

    public Builder SeriesPieOptions(SeriesPieOptions value) {
      object.setSeriesPieOptions(value);
      return this;
    }

    public Builder SeriesPivotpointsOptions(SeriesPivotpointsOptions value) {
      object.setSeriesPivotpointsOptions(value);
      return this;
    }

    public Builder SeriesPolygonOptions(SeriesPolygonOptions value) {
      object.setSeriesPolygonOptions(value);
      return this;
    }

    public Builder SeriesPpoOptions(SeriesPpoOptions value) {
      object.setSeriesPpoOptions(value);
      return this;
    }

    public Builder SeriesPriceenvelopesOptions(SeriesPriceenvelopesOptions value) {
      object.setSeriesPriceenvelopesOptions(value);
      return this;
    }

    public Builder SeriesPsarOptions(SeriesPsarOptions value) {
      object.setSeriesPsarOptions(value);
      return this;
    }

    public Builder SeriesPyramid3dOptions(SeriesPyramid3dOptions value) {
      object.setSeriesPyramid3dOptions(value);
      return this;
    }

    public Builder SeriesPyramidOptions(SeriesPyramidOptions value) {
      object.setSeriesPyramidOptions(value);
      return this;
    }

    public Builder SeriesRocOptions(SeriesRocOptions value) {
      object.setSeriesRocOptions(value);
      return this;
    }

    public Builder SeriesRsiOptions(SeriesRsiOptions value) {
      object.setSeriesRsiOptions(value);
      return this;
    }

    public Builder SeriesSankeyOptions(SeriesSankeyOptions value) {
      object.setSeriesSankeyOptions(value);
      return this;
    }

    public Builder SeriesScatter3dOptions(SeriesScatter3dOptions value) {
      object.setSeriesScatter3dOptions(value);
      return this;
    }

    public Builder SeriesScatterOptions(SeriesScatterOptions value) {
      object.setSeriesScatterOptions(value);
      return this;
    }

    public Builder SeriesSlowstochasticOptions(SeriesSlowstochasticOptions value) {
      object.setSeriesSlowstochasticOptions(value);
      return this;
    }

    public Builder SeriesSmaOptions(SeriesSmaOptions value) {
      object.setSeriesSmaOptions(value);
      return this;
    }

    public Builder SeriesSolidgaugeOptions(SeriesSolidgaugeOptions value) {
      object.setSeriesSolidgaugeOptions(value);
      return this;
    }

    public Builder SeriesSplineOptions(SeriesSplineOptions value) {
      object.setSeriesSplineOptions(value);
      return this;
    }

    public Builder SeriesStochasticOptions(SeriesStochasticOptions value) {
      object.setSeriesStochasticOptions(value);
      return this;
    }

    public Builder SeriesStreamgraphOptions(SeriesStreamgraphOptions value) {
      object.setSeriesStreamgraphOptions(value);
      return this;
    }

    public Builder SeriesSunburstOptions(SeriesSunburstOptions value) {
      object.setSeriesSunburstOptions(value);
      return this;
    }

    public Builder SeriesSupertrendOptions(SeriesSupertrendOptions value) {
      object.setSeriesSupertrendOptions(value);
      return this;
    }

    public Builder SeriesTemaOptions(SeriesTemaOptions value) {
      object.setSeriesTemaOptions(value);
      return this;
    }

    public Builder SeriesTilemapOptions(SeriesTilemapOptions value) {
      object.setSeriesTilemapOptions(value);
      return this;
    }

    public Builder SeriesTimelineOptions(SeriesTimelineOptions value) {
      object.setSeriesTimelineOptions(value);
      return this;
    }

    public Builder SeriesTreemapOptions(SeriesTreemapOptions value) {
      object.setSeriesTreemapOptions(value);
      return this;
    }

    public Builder SeriesTrendlineOptions(SeriesTrendlineOptions value) {
      object.setSeriesTrendlineOptions(value);
      return this;
    }

    public Builder SeriesTrixOptions(SeriesTrixOptions value) {
      object.setSeriesTrixOptions(value);
      return this;
    }

    public Builder SeriesVariablepieOptions(SeriesVariablepieOptions value) {
      object.setSeriesVariablepieOptions(value);
      return this;
    }

    public Builder SeriesVariwideOptions(SeriesVariwideOptions value) {
      object.setSeriesVariwideOptions(value);
      return this;
    }

    public Builder SeriesVbpOptions(SeriesVbpOptions value) {
      object.setSeriesVbpOptions(value);
      return this;
    }

    public Builder SeriesVectorOptions(SeriesVectorOptions value) {
      object.setSeriesVectorOptions(value);
      return this;
    }

    public Builder SeriesVennOptions(SeriesVennOptions value) {
      object.setSeriesVennOptions(value);
      return this;
    }

    public Builder SeriesVwapOptions(SeriesVwapOptions value) {
      object.setSeriesVwapOptions(value);
      return this;
    }

    public Builder SeriesWaterfallOptions(SeriesWaterfallOptions value) {
      object.setSeriesWaterfallOptions(value);
      return this;
    }

    public Builder SeriesWilliamsrOptions(SeriesWilliamsrOptions value) {
      object.setSeriesWilliamsrOptions(value);
      return this;
    }

    public Builder SeriesWindbarbOptions(SeriesWindbarbOptions value) {
      object.setSeriesWindbarbOptions(value);
      return this;
    }

    public Builder SeriesWmaOptions(SeriesWmaOptions value) {
      object.setSeriesWmaOptions(value);
      return this;
    }

    public Builder SeriesWordcloudOptions(SeriesWordcloudOptions value) {
      object.setSeriesWordcloudOptions(value);
      return this;
    }

    public Builder SeriesXrangeOptions(SeriesXrangeOptions value) {
      object.setSeriesXrangeOptions(value);
      return this;
    }

    public Builder SeriesZigzagOptions(SeriesZigzagOptions value) {
      object.setSeriesZigzagOptions(value);
      return this;
    }
  }
}
