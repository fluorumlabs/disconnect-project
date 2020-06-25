package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper object
 * for config objects for each series type. The config objects for each series
 * can also be overridden for each series item as given in the series array.
 *
 * Configuration options for the series are given in three levels. Options for
 * all series in a chart are given in the plotOptions.series object. Then
 * options for all series of a specific type are given in the plotOptions of
 * that type, for example <code>plotOptions.line</code>. Next, options for one single
 * series are given in the series array.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotOptions extends Any {
  /**
   * (Highstock) Acceleration bands (ABANDS). This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>abands</code> series are defined in plotOptions.abands.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("abands")
  @Nullable
  PlotAbandsOptions getAbands();

  /**
   * (Highstock) Acceleration bands (ABANDS). This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>abands</code> series are defined in plotOptions.abands.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("abands")
  void setAbands(@Nullable PlotAbandsOptions value);

  /**
   * (Highstock) Accumulation Distribution (AD). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ad</code> series are defined in plotOptions.ad.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ad")
  @Nullable
  PlotAdOptions getAd();

  /**
   * (Highstock) Accumulation Distribution (AD). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ad</code> series are defined in plotOptions.ad.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ad")
  void setAd(@Nullable PlotAdOptions value);

  /**
   * (Highstock) Awesome Oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ao</code> series are defined in plotOptions.ao.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ao")
  @Nullable
  PlotAoOptions getAo();

  /**
   * (Highstock) Awesome Oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ao</code> series are defined in plotOptions.ao.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ao")
  void setAo(@Nullable PlotAoOptions value);

  /**
   * (Highstock) Absolute Price Oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>apo</code> series are defined in plotOptions.apo.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("apo")
  @Nullable
  PlotApoOptions getApo();

  /**
   * (Highstock) Absolute Price Oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>apo</code> series are defined in plotOptions.apo.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("apo")
  void setApo(@Nullable PlotApoOptions value);

  /**
   * (Highcharts, Highstock) The area series type.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>area</code> series are defined in plotOptions.area.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("area")
  @Nullable
  PlotAreaOptions getArea();

  /**
   * (Highcharts, Highstock) The area series type.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>area</code> series are defined in plotOptions.area.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("area")
  void setArea(@Nullable PlotAreaOptions value);

  /**
   * (Highcharts, Highstock) The area range series is a carteseian series with
   * higher and lower values for each point along an X axis, where the area
   * between the values is shaded.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>arearange</code> series are defined in
   * plotOptions.arearange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("arearange")
  @Nullable
  PlotArearangeOptions getArearange();

  /**
   * (Highcharts, Highstock) The area range series is a carteseian series with
   * higher and lower values for each point along an X axis, where the area
   * between the values is shaded.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>arearange</code> series are defined in
   * plotOptions.arearange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("arearange")
  void setArearange(@Nullable PlotArearangeOptions value);

  /**
   * (Highcharts, Highstock) The area spline series is an area series where
   * the graph between the points is smoothed into a spline.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>areaspline</code> series are defined in
   * plotOptions.areaspline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("areaspline")
  @Nullable
  PlotAreasplineOptions getAreaspline();

  /**
   * (Highcharts, Highstock) The area spline series is an area series where
   * the graph between the points is smoothed into a spline.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>areaspline</code> series are defined in
   * plotOptions.areaspline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("areaspline")
  void setAreaspline(@Nullable PlotAreasplineOptions value);

  /**
   * (Highcharts, Highstock) The area spline range is a cartesian series type
   * with higher and lower Y values along an X axis. The area inside the range
   * is colored, and the graph outlining the area is a smoothed spline.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>areasplinerange</code> series are defined in
   * plotOptions.areasplinerange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("areasplinerange")
  @Nullable
  PlotAreasplinerangeOptions getAreasplinerange();

  /**
   * (Highcharts, Highstock) The area spline range is a cartesian series type
   * with higher and lower Y values along an X axis. The area inside the range
   * is colored, and the graph outlining the area is a smoothed spline.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>areasplinerange</code> series are defined in
   * plotOptions.areasplinerange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("areasplinerange")
  void setAreasplinerange(@Nullable PlotAreasplinerangeOptions value);

  /**
   * (Highstock) Aroon. This series requires the <code>linkedTo</code> option to be set
   * and should be loaded after the <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>aroon</code> series are defined in plotOptions.aroon.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("aroon")
  @Nullable
  PlotAroonOptions getAroon();

  /**
   * (Highstock) Aroon. This series requires the <code>linkedTo</code> option to be set
   * and should be loaded after the <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>aroon</code> series are defined in plotOptions.aroon.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("aroon")
  void setAroon(@Nullable PlotAroonOptions value);

  /**
   * (Highstock) Aroon Oscillator. This series requires the <code>linkedTo</code> option
   * to be set and should be loaded after the <code>stock/indicators/indicators.js</code>
   * and <code>stock/indicators/aroon.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>aroonoscillator</code> series are defined in
   * plotOptions.aroonoscillator.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("aroonoscillator")
  @Nullable
  PlotAroonoscillatorOptions getAroonoscillator();

  /**
   * (Highstock) Aroon Oscillator. This series requires the <code>linkedTo</code> option
   * to be set and should be loaded after the <code>stock/indicators/indicators.js</code>
   * and <code>stock/indicators/aroon.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>aroonoscillator</code> series are defined in
   * plotOptions.aroonoscillator.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("aroonoscillator")
  void setAroonoscillator(@Nullable PlotAroonoscillatorOptions value);

  /**
   * (Highstock) Average true range indicator (ATR). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>atr</code> series are defined in plotOptions.atr.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("atr")
  @Nullable
  PlotAtrOptions getAtr();

  /**
   * (Highstock) Average true range indicator (ATR). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>atr</code> series are defined in plotOptions.atr.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("atr")
  void setAtr(@Nullable PlotAtrOptions value);

  /**
   * (Highcharts) A bar series is a special type of column series where the
   * columns are horizontal.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bar</code> series are defined in plotOptions.bar.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bar")
  @Nullable
  PlotBarOptions getBar();

  /**
   * (Highcharts) A bar series is a special type of column series where the
   * columns are horizontal.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bar</code> series are defined in plotOptions.bar.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bar")
  void setBar(@Nullable PlotBarOptions value);

  /**
   * (Highstock) Bollinger bands (BB). This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bb</code> series are defined in plotOptions.bb.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bb")
  @Nullable
  PlotBbOptions getBb();

  /**
   * (Highstock) Bollinger bands (BB). This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bb</code> series are defined in plotOptions.bb.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bb")
  void setBb(@Nullable PlotBbOptions value);

  /**
   * (Highcharts) A bell curve is an areaspline series which represents the
   * probability density function of the normal distribution. It calculates
   * mean and standard deviation of the base series data and plots the curve
   * according to the calculated parameters.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bellcurve</code> series are defined in
   * plotOptions.bellcurve.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bellcurve")
  @Nullable
  PlotBellcurveOptions getBellcurve();

  /**
   * (Highcharts) A bell curve is an areaspline series which represents the
   * probability density function of the normal distribution. It calculates
   * mean and standard deviation of the base series data and plots the curve
   * according to the calculated parameters.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bellcurve</code> series are defined in
   * plotOptions.bellcurve.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bellcurve")
  void setBellcurve(@Nullable PlotBellcurveOptions value);

  /**
   * (Highcharts) A box plot is a convenient way of depicting groups of data
   * through their five-number summaries: the smallest observation (sample
   * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
   * largest observation (sample maximum).
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>boxplot</code> series are defined in plotOptions.boxplot.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("boxplot")
  @Nullable
  PlotBoxplotOptions getBoxplot();

  /**
   * (Highcharts) A box plot is a convenient way of depicting groups of data
   * through their five-number summaries: the smallest observation (sample
   * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
   * largest observation (sample maximum).
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>boxplot</code> series are defined in plotOptions.boxplot.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("boxplot")
  void setBoxplot(@Nullable PlotBoxplotOptions value);

  /**
   * (Highcharts, Highstock) A bubble series is a three dimensional series
   * type where each point renders an X, Y and Z value. Each points is drawn
   * as a bubble where the position along the X and Y axes mark the X and Y
   * values, and the size of the bubble relates to the Z value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bubble</code> series are defined in plotOptions.bubble.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bubble")
  @Nullable
  PlotBubbleOptions getBubble();

  /**
   * (Highcharts, Highstock) A bubble series is a three dimensional series
   * type where each point renders an X, Y and Z value. Each points is drawn
   * as a bubble where the position along the X and Y axes mark the X and Y
   * values, and the size of the bubble relates to the Z value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bubble</code> series are defined in plotOptions.bubble.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bubble")
  void setBubble(@Nullable PlotBubbleOptions value);

  /**
   * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
   * graph features a single measure, compares it to a target, and displays it
   * in the context of qualitative ranges of performance that could be set
   * using plotBands on yAxis.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bullet</code> series are defined in plotOptions.bullet.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bullet")
  @Nullable
  PlotBulletOptions getBullet();

  /**
   * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
   * graph features a single measure, compares it to a target, and displays it
   * in the context of qualitative ranges of performance that could be set
   * using plotBands on yAxis.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>bullet</code> series are defined in plotOptions.bullet.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("bullet")
  void setBullet(@Nullable PlotBulletOptions value);

  /**
   * (Highstock) A candlestick chart is a style of financial chart used to
   * describe price movements over time.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>candlestick</code> series are defined in
   * plotOptions.candlestick.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("candlestick")
  @Nullable
  PlotCandlestickOptions getCandlestick();

  /**
   * (Highstock) A candlestick chart is a style of financial chart used to
   * describe price movements over time.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>candlestick</code> series are defined in
   * plotOptions.candlestick.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("candlestick")
  void setCandlestick(@Nullable PlotCandlestickOptions value);

  /**
   * (Highstock) Commodity Channel Index (CCI). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>cci</code> series are defined in plotOptions.cci.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("cci")
  @Nullable
  PlotCciOptions getCci();

  /**
   * (Highstock) Commodity Channel Index (CCI). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>cci</code> series are defined in plotOptions.cci.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("cci")
  void setCci(@Nullable PlotCciOptions value);

  /**
   * (Highstock) Chaikin Oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>chaikin</code> series are defined in plotOptions.chaikin.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("chaikin")
  @Nullable
  PlotChaikinOptions getChaikin();

  /**
   * (Highstock) Chaikin Oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>chaikin</code> series are defined in plotOptions.chaikin.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("chaikin")
  void setChaikin(@Nullable PlotChaikinOptions value);

  /**
   * (Highstock) Chaikin Money Flow indicator (cmf).
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>cmf</code> series are defined in plotOptions.cmf.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("cmf")
  @Nullable
  PlotCmfOptions getCmf();

  /**
   * (Highstock) Chaikin Money Flow indicator (cmf).
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>cmf</code> series are defined in plotOptions.cmf.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("cmf")
  void setCmf(@Nullable PlotCmfOptions value);

  /**
   * (Highcharts, Highstock) Column series display one column per value along
   * an X axis.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>column</code> series are defined in plotOptions.column.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("column")
  @Nullable
  PlotColumnOptions getColumn();

  /**
   * (Highcharts, Highstock) Column series display one column per value along
   * an X axis.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>column</code> series are defined in plotOptions.column.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("column")
  void setColumn(@Nullable PlotColumnOptions value);

  /**
   * (Highcharts, Highstock) Column pyramid series display one pyramid per
   * value along an X axis. To display horizontal pyramids, set chart.inverted
   * to <code>true</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>columnpyramid</code> series are defined in
   * plotOptions.columnpyramid.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("columnpyramid")
  @Nullable
  PlotColumnpyramidOptions getColumnpyramid();

  /**
   * (Highcharts, Highstock) Column pyramid series display one pyramid per
   * value along an X axis. To display horizontal pyramids, set chart.inverted
   * to <code>true</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>columnpyramid</code> series are defined in
   * plotOptions.columnpyramid.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("columnpyramid")
  void setColumnpyramid(@Nullable PlotColumnpyramidOptions value);

  /**
   * (Highcharts, Highstock) The column range is a cartesian series type with
   * higher and lower Y values along an X axis. To display horizontal bars,
   * set chart.inverted to <code>true</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>columnrange</code> series are defined in
   * plotOptions.columnrange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("columnrange")
  @Nullable
  PlotColumnrangeOptions getColumnrange();

  /**
   * (Highcharts, Highstock) The column range is a cartesian series type with
   * higher and lower Y values along an X axis. To display horizontal bars,
   * set chart.inverted to <code>true</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>columnrange</code> series are defined in
   * plotOptions.columnrange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("columnrange")
  void setColumnrange(@Nullable PlotColumnrangeOptions value);

  /**
   * (Highcharts) A cylinder graph is a variation of a 3d column graph. The
   * cylinder graph features cylindrical points.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>cylinder</code> series are defined in plotOptions.cylinder.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("cylinder")
  @Nullable
  PlotCylinderOptions getCylinder();

  /**
   * (Highcharts) A cylinder graph is a variation of a 3d column graph. The
   * cylinder graph features cylindrical points.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>cylinder</code> series are defined in plotOptions.cylinder.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("cylinder")
  void setCylinder(@Nullable PlotCylinderOptions value);

  /**
   * (Highstock) Double exponential moving average (DEMA) indicator. This
   * series requires <code>linkedTo</code> option to be set and should be loaded after
   * the <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dema</code> series are defined in plotOptions.dema.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dema")
  @Nullable
  PlotDemaOptions getDema();

  /**
   * (Highstock) Double exponential moving average (DEMA) indicator. This
   * series requires <code>linkedTo</code> option to be set and should be loaded after
   * the <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dema</code> series are defined in plotOptions.dema.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dema")
  void setDema(@Nullable PlotDemaOptions value);

  /**
   * (Highcharts) A dependency wheel chart is a type of flow diagram, where
   * all nodes are laid out in a circle, and the flow between the are drawn as
   * link bands.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dependencywheel</code> series are defined in
   * plotOptions.dependencywheel.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dependencywheel")
  @Nullable
  PlotDependencywheelOptions getDependencywheel();

  /**
   * (Highcharts) A dependency wheel chart is a type of flow diagram, where
   * all nodes are laid out in a circle, and the flow between the are drawn as
   * link bands.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dependencywheel</code> series are defined in
   * plotOptions.dependencywheel.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dependencywheel")
  void setDependencywheel(@Nullable PlotDependencywheelOptions value);

  /**
   * (Highstock) Detrended Price Oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dpo</code> series are defined in plotOptions.dpo.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dpo")
  @Nullable
  PlotDpoOptions getDpo();

  /**
   * (Highstock) Detrended Price Oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dpo</code> series are defined in plotOptions.dpo.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dpo")
  void setDpo(@Nullable PlotDpoOptions value);

  /**
   * (Highcharts, Highstock) The dumbbell series is a cartesian series with
   * higher and lower values for each point along an X axis, connected with a
   * line between the values. Requires <code>highcharts-more.js</code> and
   * <code>modules/dumbbell.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dumbbell</code> series are defined in plotOptions.dumbbell.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dumbbell")
  @Nullable
  PlotDumbbellOptions getDumbbell();

  /**
   * (Highcharts, Highstock) The dumbbell series is a cartesian series with
   * higher and lower values for each point along an X axis, connected with a
   * line between the values. Requires <code>highcharts-more.js</code> and
   * <code>modules/dumbbell.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>dumbbell</code> series are defined in plotOptions.dumbbell.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("dumbbell")
  void setDumbbell(@Nullable PlotDumbbellOptions value);

  /**
   * (Highstock) Exponential moving average indicator (EMA). This series
   * requires the <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ema</code> series are defined in plotOptions.ema.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ema")
  @Nullable
  PlotEmaOptions getEma();

  /**
   * (Highstock) Exponential moving average indicator (EMA). This series
   * requires the <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ema</code> series are defined in plotOptions.ema.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ema")
  void setEma(@Nullable PlotEmaOptions value);

  /**
   * (Highcharts, Highstock) Error bars are a graphical representation of the
   * variability of data and are used on graphs to indicate the error, or
   * uncertainty in a reported measurement.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>errorbar</code> series are defined in plotOptions.errorbar.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("errorbar")
  @Nullable
  PlotErrorbarOptions getErrorbar();

  /**
   * (Highcharts, Highstock) Error bars are a graphical representation of the
   * variability of data and are used on graphs to indicate the error, or
   * uncertainty in a reported measurement.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>errorbar</code> series are defined in plotOptions.errorbar.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("errorbar")
  void setErrorbar(@Nullable PlotErrorbarOptions value);

  /**
   * (Highstock) Flags are used to mark events in stock charts. They can be
   * added on the timeline, or attached to a specific series.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>flags</code> series are defined in plotOptions.flags.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("flags")
  @Nullable
  PlotFlagsOptions getFlags();

  /**
   * (Highstock) Flags are used to mark events in stock charts. They can be
   * added on the timeline, or attached to a specific series.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>flags</code> series are defined in plotOptions.flags.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("flags")
  void setFlags(@Nullable PlotFlagsOptions value);

  /**
   * (Highcharts) Funnel charts are a type of chart often used to visualize
   * stages in a sales project, where the top are the initial stages with the
   * most clients. It requires that the modules/funnel.js file is loaded.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>funnel</code> series are defined in plotOptions.funnel.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("funnel")
  @Nullable
  PlotFunnelOptions getFunnel();

  /**
   * (Highcharts) Funnel charts are a type of chart often used to visualize
   * stages in a sales project, where the top are the initial stages with the
   * most clients. It requires that the modules/funnel.js file is loaded.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>funnel</code> series are defined in plotOptions.funnel.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("funnel")
  void setFunnel(@Nullable PlotFunnelOptions value);

  /**
   * (Highcharts) A funnel3d is a 3d version of funnel series type. Funnel
   * charts are a type of chart often used to visualize stages in a sales
   * project, where the top are the initial stages with the most clients.
   *
   * It requires that the <code>highcharts-3d.js</code>, <code>cylinder.js</code> and <code>funnel3d.js</code>
   * module are loaded.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>funnel3d</code> series are defined in plotOptions.funnel3d.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("funnel3d")
  @Nullable
  PlotFunnel3dOptions getFunnel3d();

  /**
   * (Highcharts) A funnel3d is a 3d version of funnel series type. Funnel
   * charts are a type of chart often used to visualize stages in a sales
   * project, where the top are the initial stages with the most clients.
   *
   * It requires that the <code>highcharts-3d.js</code>, <code>cylinder.js</code> and <code>funnel3d.js</code>
   * module are loaded.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>funnel3d</code> series are defined in plotOptions.funnel3d.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("funnel3d")
  void setFunnel3d(@Nullable PlotFunnel3dOptions value);

  /**
   * (Gantt) A <code>gantt</code> series. If the type option is not specified, it is
   * inherited from chart.type.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>gantt</code> series are defined in plotOptions.gantt.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("gantt")
  @Nullable
  PlotGanttOptions getGantt();

  /**
   * (Gantt) A <code>gantt</code> series. If the type option is not specified, it is
   * inherited from chart.type.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>gantt</code> series are defined in plotOptions.gantt.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("gantt")
  void setGantt(@Nullable PlotGanttOptions value);

  /**
   * (Highcharts) Gauges are circular plots displaying one or more values with
   * a dial pointing to values along the perimeter.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>gauge</code> series are defined in plotOptions.gauge.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("gauge")
  @Nullable
  PlotGaugeOptions getGauge();

  /**
   * (Highcharts) Gauges are circular plots displaying one or more values with
   * a dial pointing to values along the perimeter.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>gauge</code> series are defined in plotOptions.gauge.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("gauge")
  void setGauge(@Nullable PlotGaugeOptions value);

  /**
   * (Highcharts, Highmaps) A heatmap is a graphical representation of data
   * where the individual values contained in a matrix are represented as
   * colors.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>heatmap</code> series are defined in plotOptions.heatmap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("heatmap")
  @Nullable
  PlotHeatmapOptions getHeatmap();

  /**
   * (Highcharts, Highmaps) A heatmap is a graphical representation of data
   * where the individual values contained in a matrix are represented as
   * colors.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>heatmap</code> series are defined in plotOptions.heatmap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("heatmap")
  void setHeatmap(@Nullable PlotHeatmapOptions value);

  /**
   * (Highcharts) A histogram is a column series which represents the
   * distribution of the data set in the base series. Histogram splits data
   * into bins and shows their frequencies.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>histogram</code> series are defined in
   * plotOptions.histogram.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("histogram")
  @Nullable
  PlotHistogramOptions getHistogram();

  /**
   * (Highcharts) A histogram is a column series which represents the
   * distribution of the data set in the base series. Histogram splits data
   * into bins and shows their frequencies.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>histogram</code> series are defined in
   * plotOptions.histogram.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("histogram")
  void setHistogram(@Nullable PlotHistogramOptions value);

  /**
   * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code>
   * option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ikh</code> series are defined in plotOptions.ikh.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ikh")
  @Nullable
  PlotIkhOptions getIkh();

  /**
   * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code>
   * option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ikh</code> series are defined in plotOptions.ikh.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ikh")
  void setIkh(@Nullable PlotIkhOptions value);

  /**
   * (Highcharts) An item chart is an infographic chart where a number of
   * items are laid out in either a rectangular or circular pattern. It can be
   * used to visualize counts within a group, or for the circular pattern,
   * typically a parliament.
   *
   * The circular layout has much in common with a pie chart. Many of the item
   * series options, like <code>center</code>, <code>size</code> and data label positioning, are
   * inherited from the pie series and don't apply for rectangular layouts.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>item</code> series are defined in plotOptions.item.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("item")
  @Nullable
  PlotItemOptions getItem();

  /**
   * (Highcharts) An item chart is an infographic chart where a number of
   * items are laid out in either a rectangular or circular pattern. It can be
   * used to visualize counts within a group, or for the circular pattern,
   * typically a parliament.
   *
   * The circular layout has much in common with a pie chart. Many of the item
   * series options, like <code>center</code>, <code>size</code> and data label positioning, are
   * inherited from the pie series and don't apply for rectangular layouts.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>item</code> series are defined in plotOptions.item.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("item")
  void setItem(@Nullable PlotItemOptions value);

  /**
   * (Highstock) Keltner Channels. This series requires the <code>linkedTo</code> option
   * to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>, <code>stock/indicators/atr.js</code>, and
   * <code>stock/ema/.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>keltnerchannels</code> series are defined in
   * plotOptions.keltnerchannels.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("keltnerchannels")
  @Nullable
  PlotKeltnerchannelsOptions getKeltnerchannels();

  /**
   * (Highstock) Keltner Channels. This series requires the <code>linkedTo</code> option
   * to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>, <code>stock/indicators/atr.js</code>, and
   * <code>stock/ema/.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>keltnerchannels</code> series are defined in
   * plotOptions.keltnerchannels.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("keltnerchannels")
  void setKeltnerchannels(@Nullable PlotKeltnerchannelsOptions value);

  /**
   * (Highcharts, Highstock) A line series displays information as a series of
   * data points connected by straight line segments.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>line</code> series are defined in plotOptions.line.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("line")
  @Nullable
  PlotLineOptions getLine();

  /**
   * (Highcharts, Highstock) A line series displays information as a series of
   * data points connected by straight line segments.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>line</code> series are defined in plotOptions.line.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("line")
  void setLine(@Nullable PlotLineOptions value);

  /**
   * (Highstock) Linear regression indicator. This series requires <code>linkedTo</code>
   * option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregression</code> series are defined in
   * plotOptions.linearregression.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregression")
  @Nullable
  PlotLinearregressionOptions getLinearregression();

  /**
   * (Highstock) Linear regression indicator. This series requires <code>linkedTo</code>
   * option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregression</code> series are defined in
   * plotOptions.linearregression.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregression")
  void setLinearregression(@Nullable PlotLinearregressionOptions value);

  /**
   * (Highstock) Linear regression angle indicator. This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregressionangle</code> series are defined in
   * plotOptions.linearregressionangle.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregressionangle")
  @Nullable
  PlotLinearregressionangleOptions getLinearregressionangle();

  /**
   * (Highstock) Linear regression angle indicator. This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregressionangle</code> series are defined in
   * plotOptions.linearregressionangle.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregressionangle")
  void setLinearregressionangle(@Nullable PlotLinearregressionangleOptions value);

  /**
   * (Highstock) Linear regression intercept indicator. This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregressionintercept</code> series are defined in
   * plotOptions.linearregressionintercept.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregressionintercept")
  @Nullable
  PlotLinearregressioninterceptOptions getLinearregressionintercept();

  /**
   * (Highstock) Linear regression intercept indicator. This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregressionintercept</code> series are defined in
   * plotOptions.linearregressionintercept.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregressionintercept")
  void setLinearregressionintercept(@Nullable PlotLinearregressioninterceptOptions value);

  /**
   * (Highstock) Linear regression slope indicator. This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregressionslope</code> series are defined in
   * plotOptions.linearregressionslope.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregressionslope")
  @Nullable
  PlotLinearregressionslopeOptions getLinearregressionslope();

  /**
   * (Highstock) Linear regression slope indicator. This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>linearregressionslope</code> series are defined in
   * plotOptions.linearregressionslope.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("linearregressionslope")
  void setLinearregressionslope(@Nullable PlotLinearregressionslopeOptions value);

  /**
   * (Highcharts, Highstock) The lollipop series is a carteseian series with a
   * line anchored from the x axis and a dot at the end to mark the value.
   * Requires <code>highcharts-more.js</code>, <code>modules/dumbbell.js</code> and
   * <code>modules/lollipop.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>lollipop</code> series are defined in plotOptions.lollipop.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("lollipop")
  @Nullable
  PlotLollipopOptions getLollipop();

  /**
   * (Highcharts, Highstock) The lollipop series is a carteseian series with a
   * line anchored from the x axis and a dot at the end to mark the value.
   * Requires <code>highcharts-more.js</code>, <code>modules/dumbbell.js</code> and
   * <code>modules/lollipop.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>lollipop</code> series are defined in plotOptions.lollipop.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("lollipop")
  void setLollipop(@Nullable PlotLollipopOptions value);

  /**
   * (Highstock) Moving Average Convergence Divergence (MACD). This series
   * requires <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>macd</code> series are defined in plotOptions.macd.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("macd")
  @Nullable
  PlotMacdOptions getMacd();

  /**
   * (Highstock) Moving Average Convergence Divergence (MACD). This series
   * requires <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>macd</code> series are defined in plotOptions.macd.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("macd")
  void setMacd(@Nullable PlotMacdOptions value);

  /**
   * (Highmaps) The map series is used for basic choropleth maps, where each
   * map area has a color based on its value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>map</code> series are defined in plotOptions.map.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("map")
  @Nullable
  PlotMapOptions getMap();

  /**
   * (Highmaps) The map series is used for basic choropleth maps, where each
   * map area has a color based on its value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>map</code> series are defined in plotOptions.map.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("map")
  void setMap(@Nullable PlotMapOptions value);

  /**
   * (Highmaps) A map bubble series is a bubble series laid out on top of a
   * map series, where each bubble is tied to a specific map area.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mapbubble</code> series are defined in
   * plotOptions.mapbubble.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mapbubble")
  @Nullable
  PlotMapbubbleOptions getMapbubble();

  /**
   * (Highmaps) A map bubble series is a bubble series laid out on top of a
   * map series, where each bubble is tied to a specific map area.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mapbubble</code> series are defined in
   * plotOptions.mapbubble.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mapbubble")
  void setMapbubble(@Nullable PlotMapbubbleOptions value);

  /**
   * (Highmaps) A mapline series is a special case of the map series where the
   * value colors are applied to the strokes rather than the fills. It can
   * also be used for freeform drawing, like dividers, in the map.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mapline</code> series are defined in plotOptions.mapline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mapline")
  @Nullable
  PlotMaplineOptions getMapline();

  /**
   * (Highmaps) A mapline series is a special case of the map series where the
   * value colors are applied to the strokes rather than the fills. It can
   * also be used for freeform drawing, like dividers, in the map.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mapline</code> series are defined in plotOptions.mapline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mapline")
  void setMapline(@Nullable PlotMaplineOptions value);

  /**
   * (Highmaps) A mappoint series is a special form of scatter series where
   * the points can be laid out in map coordinates on top of a map.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mappoint</code> series are defined in plotOptions.mappoint.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mappoint")
  @Nullable
  PlotMappointOptions getMappoint();

  /**
   * (Highmaps) A mappoint series is a special form of scatter series where
   * the points can be laid out in map coordinates on top of a map.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mappoint</code> series are defined in plotOptions.mappoint.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mappoint")
  void setMappoint(@Nullable PlotMappointOptions value);

  /**
   * (Highstock) Money Flow Index. This series requires <code>linkedTo</code> option to
   * be set and should be loaded after the <code>stock/indicators/indicators.js</code>
   * file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mfi</code> series are defined in plotOptions.mfi.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mfi")
  @Nullable
  PlotMfiOptions getMfi();

  /**
   * (Highstock) Money Flow Index. This series requires <code>linkedTo</code> option to
   * be set and should be loaded after the <code>stock/indicators/indicators.js</code>
   * file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>mfi</code> series are defined in plotOptions.mfi.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("mfi")
  void setMfi(@Nullable PlotMfiOptions value);

  /**
   * (Highstock) Momentum. This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>momentum</code> series are defined in plotOptions.momentum.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("momentum")
  @Nullable
  PlotMomentumOptions getMomentum();

  /**
   * (Highstock) Momentum. This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>momentum</code> series are defined in plotOptions.momentum.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("momentum")
  void setMomentum(@Nullable PlotMomentumOptions value);

  /**
   * (Highstock) Normalized average true range indicator (NATR). This series
   * requires <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/atr.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>natr</code> series are defined in plotOptions.natr.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("natr")
  @Nullable
  PlotNatrOptions getNatr();

  /**
   * (Highstock) Normalized average true range indicator (NATR). This series
   * requires <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/atr.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>natr</code> series are defined in plotOptions.natr.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("natr")
  void setNatr(@Nullable PlotNatrOptions value);

  /**
   * (Highcharts) A networkgraph is a type of relationship chart, where
   * connnections (links) attracts nodes (points) and other nodes repulse each
   * other.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>networkgraph</code> series are defined in
   * plotOptions.networkgraph.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("networkgraph")
  @Nullable
  PlotNetworkgraphOptions getNetworkgraph();

  /**
   * (Highcharts) A networkgraph is a type of relationship chart, where
   * connnections (links) attracts nodes (points) and other nodes repulse each
   * other.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>networkgraph</code> series are defined in
   * plotOptions.networkgraph.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("networkgraph")
  void setNetworkgraph(@Nullable PlotNetworkgraphOptions value);

  /**
   * (Highstock) An OHLC chart is a style of financial chart used to describe
   * price movements over time. It displays open, high, low and close values
   * per data point.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ohlc</code> series are defined in plotOptions.ohlc.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ohlc")
  @Nullable
  PlotOhlcOptions getOhlc();

  /**
   * (Highstock) An OHLC chart is a style of financial chart used to describe
   * price movements over time. It displays open, high, low and close values
   * per data point.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ohlc</code> series are defined in plotOptions.ohlc.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ohlc")
  void setOhlc(@Nullable PlotOhlcOptions value);

  /**
   * (Highcharts) An organization chart is a diagram that shows the structure
   * of an organization and the relationships and relative ranks of its parts
   * and positions.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>organization</code> series are defined in
   * plotOptions.organization.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("organization")
  @Nullable
  PlotOrganizationOptions getOrganization();

  /**
   * (Highcharts) An organization chart is a diagram that shows the structure
   * of an organization and the relationships and relative ranks of its parts
   * and positions.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>organization</code> series are defined in
   * plotOptions.organization.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("organization")
  void setOrganization(@Nullable PlotOrganizationOptions value);

  /**
   * (Highcharts) A packed bubble series is a two dimensional series type,
   * where each point renders a value in X, Y position. Each point is drawn as
   * a bubble where the bubbles don't overlap with each other and the radius
   * of the bubble relates to the value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>packedbubble</code> series are defined in
   * plotOptions.packedbubble.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("packedbubble")
  @Nullable
  PlotPackedbubbleOptions getPackedbubble();

  /**
   * (Highcharts) A packed bubble series is a two dimensional series type,
   * where each point renders a value in X, Y position. Each point is drawn as
   * a bubble where the bubbles don't overlap with each other and the radius
   * of the bubble relates to the value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>packedbubble</code> series are defined in
   * plotOptions.packedbubble.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("packedbubble")
  void setPackedbubble(@Nullable PlotPackedbubbleOptions value);

  /**
   * (Highcharts) A pareto diagram is a type of chart that contains both bars
   * and a line graph, where individual values are represented in descending
   * order by bars, and the cumulative total is represented by the line.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pareto</code> series are defined in plotOptions.pareto.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pareto")
  @Nullable
  PlotParetoOptions getPareto();

  /**
   * (Highcharts) A pareto diagram is a type of chart that contains both bars
   * and a line graph, where individual values are represented in descending
   * order by bars, and the cumulative total is represented by the line.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pareto</code> series are defined in plotOptions.pareto.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pareto")
  void setPareto(@Nullable PlotParetoOptions value);

  /**
   * (Highstock) Price channel (PC). This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pc</code> series are defined in plotOptions.pc.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pc")
  @Nullable
  PlotPcOptions getPc();

  /**
   * (Highstock) Price channel (PC). This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pc</code> series are defined in plotOptions.pc.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pc")
  void setPc(@Nullable PlotPcOptions value);

  /**
   * (Highcharts) A pie chart is a circular graphic which is divided into
   * slices to illustrate numerical proportion.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pie</code> series are defined in plotOptions.pie.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pie")
  @Nullable
  PlotPieOptions getPie();

  /**
   * (Highcharts) A pie chart is a circular graphic which is divided into
   * slices to illustrate numerical proportion.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pie</code> series are defined in plotOptions.pie.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pie")
  void setPie(@Nullable PlotPieOptions value);

  /**
   * (Highstock) Pivot points indicator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after
   * <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pivotpoints</code> series are defined in
   * plotOptions.pivotpoints.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pivotpoints")
  @Nullable
  PlotPivotpointsOptions getPivotpoints();

  /**
   * (Highstock) Pivot points indicator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after
   * <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pivotpoints</code> series are defined in
   * plotOptions.pivotpoints.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pivotpoints")
  void setPivotpoints(@Nullable PlotPivotpointsOptions value);

  /**
   * (Highcharts, Highstock) A polygon series can be used to draw any freeform
   * shape in the cartesian coordinate system. A fill is applied with the
   * <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code>
   * options.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>polygon</code> series are defined in plotOptions.polygon.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("polygon")
  @Nullable
  PlotPolygonOptions getPolygon();

  /**
   * (Highcharts, Highstock) A polygon series can be used to draw any freeform
   * shape in the cartesian coordinate system. A fill is applied with the
   * <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code>
   * options.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>polygon</code> series are defined in plotOptions.polygon.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("polygon")
  void setPolygon(@Nullable PlotPolygonOptions value);

  /**
   * (Highstock) Percentage Price Oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ppo</code> series are defined in plotOptions.ppo.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ppo")
  @Nullable
  PlotPpoOptions getPpo();

  /**
   * (Highstock) Percentage Price Oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>ppo</code> series are defined in plotOptions.ppo.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("ppo")
  void setPpo(@Nullable PlotPpoOptions value);

  /**
   * (Highstock) Price envelopes indicator based on SMA calculations. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>priceenvelopes</code> series are defined in
   * plotOptions.priceenvelopes.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("priceenvelopes")
  @Nullable
  PlotPriceenvelopesOptions getPriceenvelopes();

  /**
   * (Highstock) Price envelopes indicator based on SMA calculations. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>priceenvelopes</code> series are defined in
   * plotOptions.priceenvelopes.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("priceenvelopes")
  void setPriceenvelopes(@Nullable PlotPriceenvelopesOptions value);

  /**
   * (Highstock) Parabolic SAR. This series requires <code>linkedTo</code> option to be
   * set and should be loaded after <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>psar</code> series are defined in plotOptions.psar.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("psar")
  @Nullable
  PlotPsarOptions getPsar();

  /**
   * (Highstock) Parabolic SAR. This series requires <code>linkedTo</code> option to be
   * set and should be loaded after <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>psar</code> series are defined in plotOptions.psar.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("psar")
  void setPsar(@Nullable PlotPsarOptions value);

  /**
   * (Highcharts) A pyramid series is a special type of funnel, without neck
   * and reversed by default.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pyramid</code> series are defined in plotOptions.pyramid.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pyramid")
  @Nullable
  PlotPyramidOptions getPyramid();

  /**
   * (Highcharts) A pyramid series is a special type of funnel, without neck
   * and reversed by default.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pyramid</code> series are defined in plotOptions.pyramid.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pyramid")
  void setPyramid(@Nullable PlotPyramidOptions value);

  /**
   * (Highcharts) A pyramid3d is a 3d version of pyramid series type. Pyramid
   * charts are a type of chart often used to visualize stages in a sales
   * project, where the top are the initial stages with the most clients.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pyramid3d</code> series are defined in
   * plotOptions.pyramid3d.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pyramid3d")
  @Nullable
  PlotPyramid3dOptions getPyramid3d();

  /**
   * (Highcharts) A pyramid3d is a 3d version of pyramid series type. Pyramid
   * charts are a type of chart often used to visualize stages in a sales
   * project, where the top are the initial stages with the most clients.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>pyramid3d</code> series are defined in
   * plotOptions.pyramid3d.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("pyramid3d")
  void setPyramid3d(@Nullable PlotPyramid3dOptions value);

  /**
   * (Highstock) Rate of change indicator (ROC). The indicator value for each
   * point is defined as:
   *
   * <code>(C - Cn) / Cn * 100</code>
   *
   * where: <code>C</code> is the close value of the point of the same x in the linked
   * series and <code>Cn</code> is the close value of the point <code>n</code> periods ago. <code>n</code> is
   * set through period.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>roc</code> series are defined in plotOptions.roc.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("roc")
  @Nullable
  PlotRocOptions getRoc();

  /**
   * (Highstock) Rate of change indicator (ROC). The indicator value for each
   * point is defined as:
   *
   * <code>(C - Cn) / Cn * 100</code>
   *
   * where: <code>C</code> is the close value of the point of the same x in the linked
   * series and <code>Cn</code> is the close value of the point <code>n</code> periods ago. <code>n</code> is
   * set through period.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>roc</code> series are defined in plotOptions.roc.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("roc")
  void setRoc(@Nullable PlotRocOptions value);

  /**
   * (Highstock) Relative strength index (RSI) technical indicator. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>rsi</code> series are defined in plotOptions.rsi.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("rsi")
  @Nullable
  PlotRsiOptions getRsi();

  /**
   * (Highstock) Relative strength index (RSI) technical indicator. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>rsi</code> series are defined in plotOptions.rsi.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("rsi")
  void setRsi(@Nullable PlotRsiOptions value);

  /**
   * (Highcharts) A sankey diagram is a type of flow diagram, in which the
   * width of the link between two nodes is shown proportionally to the flow
   * quantity.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>sankey</code> series are defined in plotOptions.sankey.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("sankey")
  @Nullable
  PlotSankeyOptions getSankey();

  /**
   * (Highcharts) A sankey diagram is a type of flow diagram, in which the
   * width of the link between two nodes is shown proportionally to the flow
   * quantity.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>sankey</code> series are defined in plotOptions.sankey.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("sankey")
  void setSankey(@Nullable PlotSankeyOptions value);

  /**
   * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
   * display values for two variables for a set of data.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>scatter</code> series are defined in plotOptions.scatter.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("scatter")
  @Nullable
  PlotScatterOptions getScatter();

  /**
   * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
   * display values for two variables for a set of data.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>scatter</code> series are defined in plotOptions.scatter.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("scatter")
  void setScatter(@Nullable PlotScatterOptions value);

  /**
   * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
   * values for three variables for a set of data.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>scatter3d</code> series are defined in
   * plotOptions.scatter3d.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("scatter3d")
  @Nullable
  PlotScatter3dOptions getScatter3d();

  /**
   * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
   * values for three variables for a set of data.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>scatter3d</code> series are defined in
   * plotOptions.scatter3d.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("scatter3d")
  void setScatter3d(@Nullable PlotScatter3dOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) General options for all series
   * types.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>line</code> series are defined in plotOptions.line.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("series")
  @Nullable
  PlotSeriesOptions getSeries();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) General options for all series
   * types.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>line</code> series are defined in plotOptions.line.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("series")
  void setSeries(@Nullable PlotSeriesOptions value);

  /**
   * (Highstock) Slow Stochastic oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/stochastic.js</code>
   * files.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>slowstochastic</code> series are defined in
   * plotOptions.slowstochastic.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("slowstochastic")
  @Nullable
  PlotSlowstochasticOptions getSlowstochastic();

  /**
   * (Highstock) Slow Stochastic oscillator. This series requires the
   * <code>linkedTo</code> option to be set and should be loaded after
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/stochastic.js</code>
   * files.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>slowstochastic</code> series are defined in
   * plotOptions.slowstochastic.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("slowstochastic")
  void setSlowstochastic(@Nullable PlotSlowstochasticOptions value);

  /**
   * (Highstock) Simple moving average indicator (SMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>sma</code> series are defined in plotOptions.sma.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("sma")
  @Nullable
  PlotSmaOptions getSma();

  /**
   * (Highstock) Simple moving average indicator (SMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>sma</code> series are defined in plotOptions.sma.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("sma")
  void setSma(@Nullable PlotSmaOptions value);

  /**
   * (Highcharts) A solid gauge is a circular gauge where the value is
   * indicated by a filled arc, and the color of the arc may variate with the
   * value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>solidgauge</code> series are defined in
   * plotOptions.solidgauge.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("solidgauge")
  @Nullable
  PlotSolidgaugeOptions getSolidgauge();

  /**
   * (Highcharts) A solid gauge is a circular gauge where the value is
   * indicated by a filled arc, and the color of the arc may variate with the
   * value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>solidgauge</code> series are defined in
   * plotOptions.solidgauge.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("solidgauge")
  void setSolidgauge(@Nullable PlotSolidgaugeOptions value);

  /**
   * (Highcharts, Highstock) A spline series is a special type of line series,
   * where the segments between the data points are smoothed.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>spline</code> series are defined in plotOptions.spline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("spline")
  @Nullable
  PlotSplineOptions getSpline();

  /**
   * (Highcharts, Highstock) A spline series is a special type of line series,
   * where the segments between the data points are smoothed.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>spline</code> series are defined in plotOptions.spline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("spline")
  void setSpline(@Nullable PlotSplineOptions value);

  /**
   * (Highstock) Stochastic oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>stochastic</code> series are defined in
   * plotOptions.stochastic.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("stochastic")
  @Nullable
  PlotStochasticOptions getStochastic();

  /**
   * (Highstock) Stochastic oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>stochastic</code> series are defined in
   * plotOptions.stochastic.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("stochastic")
  void setStochastic(@Nullable PlotStochasticOptions value);

  /**
   * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
   * which is displaced around a central axis, resulting in a flowing, organic
   * shape.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>streamgraph</code> series are defined in
   * plotOptions.streamgraph.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("streamgraph")
  @Nullable
  PlotStreamgraphOptions getStreamgraph();

  /**
   * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
   * which is displaced around a central axis, resulting in a flowing, organic
   * shape.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>streamgraph</code> series are defined in
   * plotOptions.streamgraph.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("streamgraph")
  void setStreamgraph(@Nullable PlotStreamgraphOptions value);

  /**
   * (Highcharts) A Sunburst displays hierarchical data, where a level in the
   * hierarchy is represented by a circle. The center represents the root node
   * of the tree. The visualization bears a resemblance to both treemap and
   * pie charts.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>sunburst</code> series are defined in plotOptions.sunburst.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("sunburst")
  @Nullable
  PlotSunburstOptions getSunburst();

  /**
   * (Highcharts) A Sunburst displays hierarchical data, where a level in the
   * hierarchy is represented by a circle. The center represents the root node
   * of the tree. The visualization bears a resemblance to both treemap and
   * pie charts.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>sunburst</code> series are defined in plotOptions.sunburst.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("sunburst")
  void setSunburst(@Nullable PlotSunburstOptions value);

  /**
   * (Highstock) Supertrend indicator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/sma.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>supertrend</code> series are defined in
   * plotOptions.supertrend.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("supertrend")
  @Nullable
  PlotSupertrendOptions getSupertrend();

  /**
   * (Highstock) Supertrend indicator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/sma.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>supertrend</code> series are defined in
   * plotOptions.supertrend.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("supertrend")
  void setSupertrend(@Nullable PlotSupertrendOptions value);

  /**
   * (Highstock) Triple exponential moving average (TEMA) indicator. This
   * series requires <code>linkedTo</code> option to be set and should be loaded after
   * the <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>tema</code> series are defined in plotOptions.tema.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("tema")
  @Nullable
  PlotTemaOptions getTema();

  /**
   * (Highstock) Triple exponential moving average (TEMA) indicator. This
   * series requires <code>linkedTo</code> option to be set and should be loaded after
   * the <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>tema</code> series are defined in plotOptions.tema.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("tema")
  void setTema(@Nullable PlotTemaOptions value);

  /**
   * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
   * tile shapes are configurable.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>tilemap</code> series are defined in plotOptions.tilemap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("tilemap")
  @Nullable
  PlotTilemapOptions getTilemap();

  /**
   * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
   * tile shapes are configurable.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>tilemap</code> series are defined in plotOptions.tilemap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("tilemap")
  void setTilemap(@Nullable PlotTilemapOptions value);

  /**
   * (Highcharts) The timeline series presents given events along a drawn
   * line.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>timeline</code> series are defined in plotOptions.timeline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("timeline")
  @Nullable
  PlotTimelineOptions getTimeline();

  /**
   * (Highcharts) The timeline series presents given events along a drawn
   * line.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>timeline</code> series are defined in plotOptions.timeline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("timeline")
  void setTimeline(@Nullable PlotTimelineOptions value);

  /**
   * (Highcharts) A treemap displays hierarchical data using nested
   * rectangles. The data can be laid out in varying ways depending on
   * options.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>treemap</code> series are defined in plotOptions.treemap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("treemap")
  @Nullable
  PlotTreemapOptions getTreemap();

  /**
   * (Highcharts) A treemap displays hierarchical data using nested
   * rectangles. The data can be laid out in varying ways depending on
   * options.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>treemap</code> series are defined in plotOptions.treemap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("treemap")
  void setTreemap(@Nullable PlotTreemapOptions value);

  /**
   * (Highstock) Trendline (linear regression) fits a straight line to the
   * selected data using a method called the Sum Of Least Squares. This series
   * requires the <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>trendline</code> series are defined in
   * plotOptions.trendline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("trendline")
  @Nullable
  PlotTrendlineOptions getTrendline();

  /**
   * (Highstock) Trendline (linear regression) fits a straight line to the
   * selected data using a method called the Sum Of Least Squares. This series
   * requires the <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>trendline</code> series are defined in
   * plotOptions.trendline.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("trendline")
  void setTrendline(@Nullable PlotTrendlineOptions value);

  /**
   * (Highstock) Triple exponential average (TRIX) oscillator. This series
   * requires <code>linkedTo</code> option to be set.
   *
   * Requires <a href="https://code.highcharts.com/stock/indicators/ema.js">https://code.highcharts.com/stock/indicators/ema.js</a> and
   * <a href="https://code.highcharts.com/stock/indicators/tema.js">https://code.highcharts.com/stock/indicators/tema.js</a>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>trix</code> series are defined in plotOptions.trix.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("trix")
  @Nullable
  PlotTrixOptions getTrix();

  /**
   * (Highstock) Triple exponential average (TRIX) oscillator. This series
   * requires <code>linkedTo</code> option to be set.
   *
   * Requires <a href="https://code.highcharts.com/stock/indicators/ema.js">https://code.highcharts.com/stock/indicators/ema.js</a> and
   * <a href="https://code.highcharts.com/stock/indicators/tema.js">https://code.highcharts.com/stock/indicators/tema.js</a>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>trix</code> series are defined in plotOptions.trix.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("trix")
  void setTrix(@Nullable PlotTrixOptions value);

  /**
   * (Highcharts) A variable pie series is a two dimensional series type,
   * where each point renders an Y and Z value. Each point is drawn as a pie
   * slice where the size (arc) of the slice relates to the Y value and the
   * radius of pie slice relates to the Z value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>variablepie</code> series are defined in
   * plotOptions.variablepie.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("variablepie")
  @Nullable
  PlotVariablepieOptions getVariablepie();

  /**
   * (Highcharts) A variable pie series is a two dimensional series type,
   * where each point renders an Y and Z value. Each point is drawn as a pie
   * slice where the size (arc) of the slice relates to the Y value and the
   * radius of pie slice relates to the Z value.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>variablepie</code> series are defined in
   * plotOptions.variablepie.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("variablepie")
  void setVariablepie(@Nullable PlotVariablepieOptions value);

  /**
   * (Highcharts) A variwide chart (related to marimekko chart) is a column
   * chart with a variable width expressing a third dimension.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>variwide</code> series are defined in plotOptions.variwide.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("variwide")
  @Nullable
  PlotVariwideOptions getVariwide();

  /**
   * (Highcharts) A variwide chart (related to marimekko chart) is a column
   * chart with a variable width expressing a third dimension.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>variwide</code> series are defined in plotOptions.variwide.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("variwide")
  void setVariwide(@Nullable PlotVariwideOptions value);

  /**
   * (Highstock) Volume By Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>vbp</code> series are defined in plotOptions.vbp.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("vbp")
  @Nullable
  PlotVbpOptions getVbp();

  /**
   * (Highstock) Volume By Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>vbp</code> series are defined in plotOptions.vbp.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("vbp")
  void setVbp(@Nullable PlotVbpOptions value);

  /**
   * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
   * each point has an X and Y position, a length and a direction. Vectors are
   * drawn as arrows.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>vector</code> series are defined in plotOptions.vector.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("vector")
  @Nullable
  PlotVectorOptions getVector();

  /**
   * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
   * each point has an X and Y position, a length and a direction. Vectors are
   * drawn as arrows.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>vector</code> series are defined in plotOptions.vector.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("vector")
  void setVector(@Nullable PlotVectorOptions value);

  /**
   * (Highcharts) A Venn diagram displays all possible logical relations
   * between a collection of different sets. The sets are represented by
   * circles, and the relation between the sets are displayed by the overlap
   * or lack of overlap between them. The venn diagram is a special case of
   * Euler diagrams, which can also be displayed by this series type.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>venn</code> series are defined in plotOptions.venn.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("venn")
  @Nullable
  PlotVennOptions getVenn();

  /**
   * (Highcharts) A Venn diagram displays all possible logical relations
   * between a collection of different sets. The sets are represented by
   * circles, and the relation between the sets are displayed by the overlap
   * or lack of overlap between them. The venn diagram is a special case of
   * Euler diagrams, which can also be displayed by this series type.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>venn</code> series are defined in plotOptions.venn.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("venn")
  void setVenn(@Nullable PlotVennOptions value);

  /**
   * (Highstock) Volume Weighted Average Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>vwap</code> series are defined in plotOptions.vwap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("vwap")
  @Nullable
  PlotVwapOptions getVwap();

  /**
   * (Highstock) Volume Weighted Average Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>vwap</code> series are defined in plotOptions.vwap.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("vwap")
  void setVwap(@Nullable PlotVwapOptions value);

  /**
   * (Highcharts) A waterfall chart displays sequentially introduced positive
   * or negative values in cumulative columns.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>waterfall</code> series are defined in
   * plotOptions.waterfall.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("waterfall")
  @Nullable
  PlotWaterfallOptions getWaterfall();

  /**
   * (Highcharts) A waterfall chart displays sequentially introduced positive
   * or negative values in cumulative columns.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>waterfall</code> series are defined in
   * plotOptions.waterfall.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("waterfall")
  void setWaterfall(@Nullable PlotWaterfallOptions value);

  /**
   * (Highstock) Williams %R. This series requires the <code>linkedTo</code> option to be
   * set and should be loaded after the <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>williamsr</code> series are defined in
   * plotOptions.williamsr.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("williamsr")
  @Nullable
  PlotWilliamsrOptions getWilliamsr();

  /**
   * (Highstock) Williams %R. This series requires the <code>linkedTo</code> option to be
   * set and should be loaded after the <code>stock/indicators/indicators.js</code>.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>williamsr</code> series are defined in
   * plotOptions.williamsr.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("williamsr")
  void setWilliamsr(@Nullable PlotWilliamsrOptions value);

  /**
   * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
   * speed and direction in one graphical form. Wind direction is given by the
   * stem direction, and wind speed by the number and shape of barbs.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>windbarb</code> series are defined in plotOptions.windbarb.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("windbarb")
  @Nullable
  PlotWindbarbOptions getWindbarb();

  /**
   * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
   * speed and direction in one graphical form. Wind direction is given by the
   * stem direction, and wind speed by the number and shape of barbs.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>windbarb</code> series are defined in plotOptions.windbarb.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("windbarb")
  void setWindbarb(@Nullable PlotWindbarbOptions value);

  /**
   * (Highstock) Weighted moving average indicator (WMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>wma</code> series are defined in plotOptions.wma.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("wma")
  @Nullable
  PlotWmaOptions getWma();

  /**
   * (Highstock) Weighted moving average indicator (WMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>wma</code> series are defined in plotOptions.wma.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("wma")
  void setWma(@Nullable PlotWmaOptions value);

  /**
   * (Highcharts) A word cloud is a visualization of a set of words, where the
   * size and placement of a word is determined by how it is weighted.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>wordcloud</code> series are defined in
   * plotOptions.wordcloud.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("wordcloud")
  @Nullable
  PlotWordcloudOptions getWordcloud();

  /**
   * (Highcharts) A word cloud is a visualization of a set of words, where the
   * size and placement of a word is determined by how it is weighted.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>wordcloud</code> series are defined in
   * plotOptions.wordcloud.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("wordcloud")
  void setWordcloud(@Nullable PlotWordcloudOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
   * X axis, typically time intervals with a start and end date.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("xrange")
  @Nullable
  PlotXrangeOptions getXrange();

  /**
   * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
   * X axis, typically time intervals with a start and end date.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("xrange")
  void setXrange(@Nullable PlotXrangeOptions value);

  /**
   * (Highstock) Zig Zag indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>zigzag</code> series are defined in plotOptions.zigzag.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("zigzag")
  @Nullable
  PlotZigzagOptions getZigzag();

  /**
   * (Highstock) Zig Zag indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
   * In TypeScript the type option must always be set.
   *
   * Configuration options for the series are given in three levels:
   *
   * <ol>
   * <li>
   * Options for all series in a chart are defined in the
   * plotOptions.series object.
   *
   * </li>
   * <li>
   * Options for all <code>zigzag</code> series are defined in plotOptions.zigzag.
   *
   * </li>
   * <li>
   * Options for one single series are given in the series instance array.
   * (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("zigzag")
  void setZigzag(@Nullable PlotZigzagOptions value);

  class Builder {
    private final PlotOptions object = Any.empty();

    public PlotOptions build() {
      return object;
    }

    /**
     * (Highstock) Acceleration bands (ABANDS). This series requires the
     * <code>linkedTo</code> option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>abands</code> series are defined in plotOptions.abands.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder abands(@Nullable PlotAbandsOptions value) {
      object.setAbands(value);
      return this;
    }

    /**
     * (Highstock) Accumulation Distribution (AD). This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>ad</code> series are defined in plotOptions.ad.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder ad(@Nullable PlotAdOptions value) {
      object.setAd(value);
      return this;
    }

    /**
     * (Highstock) Awesome Oscillator. This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code>
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>ao</code> series are defined in plotOptions.ao.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder ao(@Nullable PlotAoOptions value) {
      object.setAo(value);
      return this;
    }

    /**
     * (Highstock) Absolute Price Oscillator. This series requires the
     * <code>linkedTo</code> option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>apo</code> series are defined in plotOptions.apo.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder apo(@Nullable PlotApoOptions value) {
      object.setApo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The area series type.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>area</code> series are defined in plotOptions.area.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder area(@Nullable PlotAreaOptions value) {
      object.setArea(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The area range series is a carteseian series with
     * higher and lower values for each point along an X axis, where the area
     * between the values is shaded.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>arearange</code> series are defined in
     * plotOptions.arearange.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder arearange(@Nullable PlotArearangeOptions value) {
      object.setArearange(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The area spline series is an area series where
     * the graph between the points is smoothed into a spline.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>areaspline</code> series are defined in
     * plotOptions.areaspline.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder areaspline(@Nullable PlotAreasplineOptions value) {
      object.setAreaspline(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The area spline range is a cartesian series type
     * with higher and lower Y values along an X axis. The area inside the range
     * is colored, and the graph outlining the area is a smoothed spline.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>areasplinerange</code> series are defined in
     * plotOptions.areasplinerange.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder areasplinerange(@Nullable PlotAreasplinerangeOptions value) {
      object.setAreasplinerange(value);
      return this;
    }

    /**
     * (Highstock) Aroon. This series requires the <code>linkedTo</code> option to be set
     * and should be loaded after the <code>stock/indicators/indicators.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>aroon</code> series are defined in plotOptions.aroon.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder aroon(@Nullable PlotAroonOptions value) {
      object.setAroon(value);
      return this;
    }

    /**
     * (Highstock) Aroon Oscillator. This series requires the <code>linkedTo</code> option
     * to be set and should be loaded after the <code>stock/indicators/indicators.js</code>
     * and <code>stock/indicators/aroon.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>aroonoscillator</code> series are defined in
     * plotOptions.aroonoscillator.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder aroonoscillator(@Nullable PlotAroonoscillatorOptions value) {
      object.setAroonoscillator(value);
      return this;
    }

    /**
     * (Highstock) Average true range indicator (ATR). This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>atr</code> series are defined in plotOptions.atr.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder atr(@Nullable PlotAtrOptions value) {
      object.setAtr(value);
      return this;
    }

    /**
     * (Highcharts) A bar series is a special type of column series where the
     * columns are horizontal.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>bar</code> series are defined in plotOptions.bar.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder bar(@Nullable PlotBarOptions value) {
      object.setBar(value);
      return this;
    }

    /**
     * (Highstock) Bollinger bands (BB). This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>bb</code> series are defined in plotOptions.bb.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder bb(@Nullable PlotBbOptions value) {
      object.setBb(value);
      return this;
    }

    /**
     * (Highcharts) A bell curve is an areaspline series which represents the
     * probability density function of the normal distribution. It calculates
     * mean and standard deviation of the base series data and plots the curve
     * according to the calculated parameters.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>bellcurve</code> series are defined in
     * plotOptions.bellcurve.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder bellcurve(@Nullable PlotBellcurveOptions value) {
      object.setBellcurve(value);
      return this;
    }

    /**
     * (Highcharts) A box plot is a convenient way of depicting groups of data
     * through their five-number summaries: the smallest observation (sample
     * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
     * largest observation (sample maximum).
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>boxplot</code> series are defined in plotOptions.boxplot.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder boxplot(@Nullable PlotBoxplotOptions value) {
      object.setBoxplot(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A bubble series is a three dimensional series
     * type where each point renders an X, Y and Z value. Each points is drawn
     * as a bubble where the position along the X and Y axes mark the X and Y
     * values, and the size of the bubble relates to the Z value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>bubble</code> series are defined in plotOptions.bubble.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder bubble(@Nullable PlotBubbleOptions value) {
      object.setBubble(value);
      return this;
    }

    /**
     * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
     * graph features a single measure, compares it to a target, and displays it
     * in the context of qualitative ranges of performance that could be set
     * using plotBands on yAxis.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>bullet</code> series are defined in plotOptions.bullet.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder bullet(@Nullable PlotBulletOptions value) {
      object.setBullet(value);
      return this;
    }

    /**
     * (Highstock) A candlestick chart is a style of financial chart used to
     * describe price movements over time.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>candlestick</code> series are defined in
     * plotOptions.candlestick.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder candlestick(@Nullable PlotCandlestickOptions value) {
      object.setCandlestick(value);
      return this;
    }

    /**
     * (Highstock) Commodity Channel Index (CCI). This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>cci</code> series are defined in plotOptions.cci.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder cci(@Nullable PlotCciOptions value) {
      object.setCci(value);
      return this;
    }

    /**
     * (Highstock) Chaikin Oscillator. This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>chaikin</code> series are defined in plotOptions.chaikin.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder chaikin(@Nullable PlotChaikinOptions value) {
      object.setChaikin(value);
      return this;
    }

    /**
     * (Highstock) Chaikin Money Flow indicator (cmf).
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>cmf</code> series are defined in plotOptions.cmf.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder cmf(@Nullable PlotCmfOptions value) {
      object.setCmf(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Column series display one column per value along
     * an X axis.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>column</code> series are defined in plotOptions.column.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder column(@Nullable PlotColumnOptions value) {
      object.setColumn(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Column pyramid series display one pyramid per
     * value along an X axis. To display horizontal pyramids, set chart.inverted
     * to <code>true</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>columnpyramid</code> series are defined in
     * plotOptions.columnpyramid.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder columnpyramid(@Nullable PlotColumnpyramidOptions value) {
      object.setColumnpyramid(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The column range is a cartesian series type with
     * higher and lower Y values along an X axis. To display horizontal bars,
     * set chart.inverted to <code>true</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>columnrange</code> series are defined in
     * plotOptions.columnrange.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder columnrange(@Nullable PlotColumnrangeOptions value) {
      object.setColumnrange(value);
      return this;
    }

    /**
     * (Highcharts) A cylinder graph is a variation of a 3d column graph. The
     * cylinder graph features cylindrical points.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>cylinder</code> series are defined in plotOptions.cylinder.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder cylinder(@Nullable PlotCylinderOptions value) {
      object.setCylinder(value);
      return this;
    }

    /**
     * (Highstock) Double exponential moving average (DEMA) indicator. This
     * series requires <code>linkedTo</code> option to be set and should be loaded after
     * the <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>dema</code> series are defined in plotOptions.dema.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder dema(@Nullable PlotDemaOptions value) {
      object.setDema(value);
      return this;
    }

    /**
     * (Highcharts) A dependency wheel chart is a type of flow diagram, where
     * all nodes are laid out in a circle, and the flow between the are drawn as
     * link bands.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>dependencywheel</code> series are defined in
     * plotOptions.dependencywheel.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder dependencywheel(@Nullable PlotDependencywheelOptions value) {
      object.setDependencywheel(value);
      return this;
    }

    /**
     * (Highstock) Detrended Price Oscillator. This series requires the
     * <code>linkedTo</code> option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>dpo</code> series are defined in plotOptions.dpo.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder dpo(@Nullable PlotDpoOptions value) {
      object.setDpo(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The dumbbell series is a cartesian series with
     * higher and lower values for each point along an X axis, connected with a
     * line between the values. Requires <code>highcharts-more.js</code> and
     * <code>modules/dumbbell.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>dumbbell</code> series are defined in plotOptions.dumbbell.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder dumbbell(@Nullable PlotDumbbellOptions value) {
      object.setDumbbell(value);
      return this;
    }

    /**
     * (Highstock) Exponential moving average indicator (EMA). This series
     * requires the <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>ema</code> series are defined in plotOptions.ema.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder ema(@Nullable PlotEmaOptions value) {
      object.setEma(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Error bars are a graphical representation of the
     * variability of data and are used on graphs to indicate the error, or
     * uncertainty in a reported measurement.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>errorbar</code> series are defined in plotOptions.errorbar.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder errorbar(@Nullable PlotErrorbarOptions value) {
      object.setErrorbar(value);
      return this;
    }

    /**
     * (Highstock) Flags are used to mark events in stock charts. They can be
     * added on the timeline, or attached to a specific series.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>flags</code> series are defined in plotOptions.flags.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder flags(@Nullable PlotFlagsOptions value) {
      object.setFlags(value);
      return this;
    }

    /**
     * (Highcharts) Funnel charts are a type of chart often used to visualize
     * stages in a sales project, where the top are the initial stages with the
     * most clients. It requires that the modules/funnel.js file is loaded.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>funnel</code> series are defined in plotOptions.funnel.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder funnel(@Nullable PlotFunnelOptions value) {
      object.setFunnel(value);
      return this;
    }

    /**
     * (Highcharts) A funnel3d is a 3d version of funnel series type. Funnel
     * charts are a type of chart often used to visualize stages in a sales
     * project, where the top are the initial stages with the most clients.
     *
     * It requires that the <code>highcharts-3d.js</code>, <code>cylinder.js</code> and <code>funnel3d.js</code>
     * module are loaded.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>funnel3d</code> series are defined in plotOptions.funnel3d.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder funnel3d(@Nullable PlotFunnel3dOptions value) {
      object.setFunnel3d(value);
      return this;
    }

    /**
     * (Gantt) A <code>gantt</code> series. If the type option is not specified, it is
     * inherited from chart.type.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>gantt</code> series are defined in plotOptions.gantt.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder gantt(@Nullable PlotGanttOptions value) {
      object.setGantt(value);
      return this;
    }

    /**
     * (Highcharts) Gauges are circular plots displaying one or more values with
     * a dial pointing to values along the perimeter.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>gauge</code> series are defined in plotOptions.gauge.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder gauge(@Nullable PlotGaugeOptions value) {
      object.setGauge(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) A heatmap is a graphical representation of data
     * where the individual values contained in a matrix are represented as
     * colors.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>heatmap</code> series are defined in plotOptions.heatmap.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder heatmap(@Nullable PlotHeatmapOptions value) {
      object.setHeatmap(value);
      return this;
    }

    /**
     * (Highcharts) A histogram is a column series which represents the
     * distribution of the data set in the base series. Histogram splits data
     * into bins and shows their frequencies.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>histogram</code> series are defined in
     * plotOptions.histogram.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder histogram(@Nullable PlotHistogramOptions value) {
      object.setHistogram(value);
      return this;
    }

    /**
     * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code>
     * option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>ikh</code> series are defined in plotOptions.ikh.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder ikh(@Nullable PlotIkhOptions value) {
      object.setIkh(value);
      return this;
    }

    /**
     * (Highcharts) An item chart is an infographic chart where a number of
     * items are laid out in either a rectangular or circular pattern. It can be
     * used to visualize counts within a group, or for the circular pattern,
     * typically a parliament.
     *
     * The circular layout has much in common with a pie chart. Many of the item
     * series options, like <code>center</code>, <code>size</code> and data label positioning, are
     * inherited from the pie series and don't apply for rectangular layouts.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>item</code> series are defined in plotOptions.item.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder item(@Nullable PlotItemOptions value) {
      object.setItem(value);
      return this;
    }

    /**
     * (Highstock) Keltner Channels. This series requires the <code>linkedTo</code> option
     * to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code>, <code>stock/indicators/atr.js</code>, and
     * <code>stock/ema/.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>keltnerchannels</code> series are defined in
     * plotOptions.keltnerchannels.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder keltnerchannels(@Nullable PlotKeltnerchannelsOptions value) {
      object.setKeltnerchannels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A line series displays information as a series of
     * data points connected by straight line segments.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>line</code> series are defined in plotOptions.line.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder line(@Nullable PlotLineOptions value) {
      object.setLine(value);
      return this;
    }

    /**
     * (Highstock) Linear regression indicator. This series requires <code>linkedTo</code>
     * option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>linearregression</code> series are defined in
     * plotOptions.linearregression.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder linearregression(@Nullable PlotLinearregressionOptions value) {
      object.setLinearregression(value);
      return this;
    }

    /**
     * (Highstock) Linear regression angle indicator. This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>linearregressionangle</code> series are defined in
     * plotOptions.linearregressionangle.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder linearregressionangle(@Nullable PlotLinearregressionangleOptions value) {
      object.setLinearregressionangle(value);
      return this;
    }

    /**
     * (Highstock) Linear regression intercept indicator. This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>linearregressionintercept</code> series are defined in
     * plotOptions.linearregressionintercept.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder linearregressionintercept(@Nullable PlotLinearregressioninterceptOptions value) {
      object.setLinearregressionintercept(value);
      return this;
    }

    /**
     * (Highstock) Linear regression slope indicator. This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>linearregressionslope</code> series are defined in
     * plotOptions.linearregressionslope.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder linearregressionslope(@Nullable PlotLinearregressionslopeOptions value) {
      object.setLinearregressionslope(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The lollipop series is a carteseian series with a
     * line anchored from the x axis and a dot at the end to mark the value.
     * Requires <code>highcharts-more.js</code>, <code>modules/dumbbell.js</code> and
     * <code>modules/lollipop.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>lollipop</code> series are defined in plotOptions.lollipop.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder lollipop(@Nullable PlotLollipopOptions value) {
      object.setLollipop(value);
      return this;
    }

    /**
     * (Highstock) Moving Average Convergence Divergence (MACD). This series
     * requires <code>linkedTo</code> option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>macd</code> series are defined in plotOptions.macd.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder macd(@Nullable PlotMacdOptions value) {
      object.setMacd(value);
      return this;
    }

    /**
     * (Highmaps) The map series is used for basic choropleth maps, where each
     * map area has a color based on its value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>map</code> series are defined in plotOptions.map.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder map(@Nullable PlotMapOptions value) {
      object.setMap(value);
      return this;
    }

    /**
     * (Highmaps) A map bubble series is a bubble series laid out on top of a
     * map series, where each bubble is tied to a specific map area.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>mapbubble</code> series are defined in
     * plotOptions.mapbubble.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder mapbubble(@Nullable PlotMapbubbleOptions value) {
      object.setMapbubble(value);
      return this;
    }

    /**
     * (Highmaps) A mapline series is a special case of the map series where the
     * value colors are applied to the strokes rather than the fills. It can
     * also be used for freeform drawing, like dividers, in the map.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>mapline</code> series are defined in plotOptions.mapline.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder mapline(@Nullable PlotMaplineOptions value) {
      object.setMapline(value);
      return this;
    }

    /**
     * (Highmaps) A mappoint series is a special form of scatter series where
     * the points can be laid out in map coordinates on top of a map.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>mappoint</code> series are defined in plotOptions.mappoint.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder mappoint(@Nullable PlotMappointOptions value) {
      object.setMappoint(value);
      return this;
    }

    /**
     * (Highstock) Money Flow Index. This series requires <code>linkedTo</code> option to
     * be set and should be loaded after the <code>stock/indicators/indicators.js</code>
     * file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>mfi</code> series are defined in plotOptions.mfi.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder mfi(@Nullable PlotMfiOptions value) {
      object.setMfi(value);
      return this;
    }

    /**
     * (Highstock) Momentum. This series requires <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>momentum</code> series are defined in plotOptions.momentum.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder momentum(@Nullable PlotMomentumOptions value) {
      object.setMomentum(value);
      return this;
    }

    /**
     * (Highstock) Normalized average true range indicator (NATR). This series
     * requires <code>linkedTo</code> option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/atr.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>natr</code> series are defined in plotOptions.natr.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder natr(@Nullable PlotNatrOptions value) {
      object.setNatr(value);
      return this;
    }

    /**
     * (Highcharts) A networkgraph is a type of relationship chart, where
     * connnections (links) attracts nodes (points) and other nodes repulse each
     * other.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>networkgraph</code> series are defined in
     * plotOptions.networkgraph.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder networkgraph(@Nullable PlotNetworkgraphOptions value) {
      object.setNetworkgraph(value);
      return this;
    }

    /**
     * (Highstock) An OHLC chart is a style of financial chart used to describe
     * price movements over time. It displays open, high, low and close values
     * per data point.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>ohlc</code> series are defined in plotOptions.ohlc.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder ohlc(@Nullable PlotOhlcOptions value) {
      object.setOhlc(value);
      return this;
    }

    /**
     * (Highcharts) An organization chart is a diagram that shows the structure
     * of an organization and the relationships and relative ranks of its parts
     * and positions.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>organization</code> series are defined in
     * plotOptions.organization.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder organization(@Nullable PlotOrganizationOptions value) {
      object.setOrganization(value);
      return this;
    }

    /**
     * (Highcharts) A packed bubble series is a two dimensional series type,
     * where each point renders a value in X, Y position. Each point is drawn as
     * a bubble where the bubbles don't overlap with each other and the radius
     * of the bubble relates to the value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>packedbubble</code> series are defined in
     * plotOptions.packedbubble.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder packedbubble(@Nullable PlotPackedbubbleOptions value) {
      object.setPackedbubble(value);
      return this;
    }

    /**
     * (Highcharts) A pareto diagram is a type of chart that contains both bars
     * and a line graph, where individual values are represented in descending
     * order by bars, and the cumulative total is represented by the line.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>pareto</code> series are defined in plotOptions.pareto.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder pareto(@Nullable PlotParetoOptions value) {
      object.setPareto(value);
      return this;
    }

    /**
     * (Highstock) Price channel (PC). This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>pc</code> series are defined in plotOptions.pc.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder pc(@Nullable PlotPcOptions value) {
      object.setPc(value);
      return this;
    }

    /**
     * (Highcharts) A pie chart is a circular graphic which is divided into
     * slices to illustrate numerical proportion.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>pie</code> series are defined in plotOptions.pie.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder pie(@Nullable PlotPieOptions value) {
      object.setPie(value);
      return this;
    }

    /**
     * (Highstock) Pivot points indicator. This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after
     * <code>stock/indicators/indicators.js</code> file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>pivotpoints</code> series are defined in
     * plotOptions.pivotpoints.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder pivotpoints(@Nullable PlotPivotpointsOptions value) {
      object.setPivotpoints(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A polygon series can be used to draw any freeform
     * shape in the cartesian coordinate system. A fill is applied with the
     * <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code>
     * options.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>polygon</code> series are defined in plotOptions.polygon.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder polygon(@Nullable PlotPolygonOptions value) {
      object.setPolygon(value);
      return this;
    }

    /**
     * (Highstock) Percentage Price Oscillator. This series requires the
     * <code>linkedTo</code> option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>ppo</code> series are defined in plotOptions.ppo.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder ppo(@Nullable PlotPpoOptions value) {
      object.setPpo(value);
      return this;
    }

    /**
     * (Highstock) Price envelopes indicator based on SMA calculations. This
     * series requires the <code>linkedTo</code> option to be set and should be loaded
     * after the <code>stock/indicators/indicators.js</code> file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>priceenvelopes</code> series are defined in
     * plotOptions.priceenvelopes.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder priceenvelopes(@Nullable PlotPriceenvelopesOptions value) {
      object.setPriceenvelopes(value);
      return this;
    }

    /**
     * (Highstock) Parabolic SAR. This series requires <code>linkedTo</code> option to be
     * set and should be loaded after <code>stock/indicators/indicators.js</code> file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>psar</code> series are defined in plotOptions.psar.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder psar(@Nullable PlotPsarOptions value) {
      object.setPsar(value);
      return this;
    }

    /**
     * (Highcharts) A pyramid series is a special type of funnel, without neck
     * and reversed by default.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>pyramid</code> series are defined in plotOptions.pyramid.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder pyramid(@Nullable PlotPyramidOptions value) {
      object.setPyramid(value);
      return this;
    }

    /**
     * (Highcharts) A pyramid3d is a 3d version of pyramid series type. Pyramid
     * charts are a type of chart often used to visualize stages in a sales
     * project, where the top are the initial stages with the most clients.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>pyramid3d</code> series are defined in
     * plotOptions.pyramid3d.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder pyramid3d(@Nullable PlotPyramid3dOptions value) {
      object.setPyramid3d(value);
      return this;
    }

    /**
     * (Highstock) Rate of change indicator (ROC). The indicator value for each
     * point is defined as:
     *
     * <code>(C - Cn) / Cn * 100</code>
     *
     * where: <code>C</code> is the close value of the point of the same x in the linked
     * series and <code>Cn</code> is the close value of the point <code>n</code> periods ago. <code>n</code> is
     * set through period.
     *
     * This series requires <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>roc</code> series are defined in plotOptions.roc.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder roc(@Nullable PlotRocOptions value) {
      object.setRoc(value);
      return this;
    }

    /**
     * (Highstock) Relative strength index (RSI) technical indicator. This
     * series requires the <code>linkedTo</code> option to be set and should be loaded
     * after the <code>stock/indicators/indicators.js</code> file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>rsi</code> series are defined in plotOptions.rsi.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder rsi(@Nullable PlotRsiOptions value) {
      object.setRsi(value);
      return this;
    }

    /**
     * (Highcharts) A sankey diagram is a type of flow diagram, in which the
     * width of the link between two nodes is shown proportionally to the flow
     * quantity.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>sankey</code> series are defined in plotOptions.sankey.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder sankey(@Nullable PlotSankeyOptions value) {
      object.setSankey(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
     * display values for two variables for a set of data.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>scatter</code> series are defined in plotOptions.scatter.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder scatter(@Nullable PlotScatterOptions value) {
      object.setScatter(value);
      return this;
    }

    /**
     * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
     * values for three variables for a set of data.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>scatter3d</code> series are defined in
     * plotOptions.scatter3d.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder scatter3d(@Nullable PlotScatter3dOptions value) {
      object.setScatter3d(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) General options for all series
     * types.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>line</code> series are defined in plotOptions.line.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder series(@Nullable PlotSeriesOptions value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highstock) Slow Stochastic oscillator. This series requires the
     * <code>linkedTo</code> option to be set and should be loaded after
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/stochastic.js</code>
     * files.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>slowstochastic</code> series are defined in
     * plotOptions.slowstochastic.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder slowstochastic(@Nullable PlotSlowstochasticOptions value) {
      object.setSlowstochastic(value);
      return this;
    }

    /**
     * (Highstock) Simple moving average indicator (SMA). This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>sma</code> series are defined in plotOptions.sma.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder sma(@Nullable PlotSmaOptions value) {
      object.setSma(value);
      return this;
    }

    /**
     * (Highcharts) A solid gauge is a circular gauge where the value is
     * indicated by a filled arc, and the color of the arc may variate with the
     * value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>solidgauge</code> series are defined in
     * plotOptions.solidgauge.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder solidgauge(@Nullable PlotSolidgaugeOptions value) {
      object.setSolidgauge(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A spline series is a special type of line series,
     * where the segments between the data points are smoothed.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>spline</code> series are defined in plotOptions.spline.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder spline(@Nullable PlotSplineOptions value) {
      object.setSpline(value);
      return this;
    }

    /**
     * (Highstock) Stochastic oscillator. This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>stochastic</code> series are defined in
     * plotOptions.stochastic.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder stochastic(@Nullable PlotStochasticOptions value) {
      object.setStochastic(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
     * which is displaced around a central axis, resulting in a flowing, organic
     * shape.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>streamgraph</code> series are defined in
     * plotOptions.streamgraph.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder streamgraph(@Nullable PlotStreamgraphOptions value) {
      object.setStreamgraph(value);
      return this;
    }

    /**
     * (Highcharts) A Sunburst displays hierarchical data, where a level in the
     * hierarchy is represented by a circle. The center represents the root node
     * of the tree. The visualization bears a resemblance to both treemap and
     * pie charts.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>sunburst</code> series are defined in plotOptions.sunburst.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder sunburst(@Nullable PlotSunburstOptions value) {
      object.setSunburst(value);
      return this;
    }

    /**
     * (Highstock) Supertrend indicator. This series requires the <code>linkedTo</code>
     * option to be set and should be loaded after the
     * <code>stock/indicators/indicators.js</code> and <code>stock/indicators/sma.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>supertrend</code> series are defined in
     * plotOptions.supertrend.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder supertrend(@Nullable PlotSupertrendOptions value) {
      object.setSupertrend(value);
      return this;
    }

    /**
     * (Highstock) Triple exponential moving average (TEMA) indicator. This
     * series requires <code>linkedTo</code> option to be set and should be loaded after
     * the <code>stock/indicators/indicators.js</code> and <code>stock/indicators/ema.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>tema</code> series are defined in plotOptions.tema.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder tema(@Nullable PlotTemaOptions value) {
      object.setTema(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
     * tile shapes are configurable.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>tilemap</code> series are defined in plotOptions.tilemap.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder tilemap(@Nullable PlotTilemapOptions value) {
      object.setTilemap(value);
      return this;
    }

    /**
     * (Highcharts) The timeline series presents given events along a drawn
     * line.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>timeline</code> series are defined in plotOptions.timeline.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder timeline(@Nullable PlotTimelineOptions value) {
      object.setTimeline(value);
      return this;
    }

    /**
     * (Highcharts) A treemap displays hierarchical data using nested
     * rectangles. The data can be laid out in varying ways depending on
     * options.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>treemap</code> series are defined in plotOptions.treemap.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder treemap(@Nullable PlotTreemapOptions value) {
      object.setTreemap(value);
      return this;
    }

    /**
     * (Highstock) Trendline (linear regression) fits a straight line to the
     * selected data using a method called the Sum Of Least Squares. This series
     * requires the <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>trendline</code> series are defined in
     * plotOptions.trendline.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder trendline(@Nullable PlotTrendlineOptions value) {
      object.setTrendline(value);
      return this;
    }

    /**
     * (Highstock) Triple exponential average (TRIX) oscillator. This series
     * requires <code>linkedTo</code> option to be set.
     *
     * Requires <a href="https://code.highcharts.com/stock/indicators/ema.js">https://code.highcharts.com/stock/indicators/ema.js</a> and
     * <a href="https://code.highcharts.com/stock/indicators/tema.js">https://code.highcharts.com/stock/indicators/tema.js</a>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>trix</code> series are defined in plotOptions.trix.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder trix(@Nullable PlotTrixOptions value) {
      object.setTrix(value);
      return this;
    }

    /**
     * (Highcharts) A variable pie series is a two dimensional series type,
     * where each point renders an Y and Z value. Each point is drawn as a pie
     * slice where the size (arc) of the slice relates to the Y value and the
     * radius of pie slice relates to the Z value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>variablepie</code> series are defined in
     * plotOptions.variablepie.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder variablepie(@Nullable PlotVariablepieOptions value) {
      object.setVariablepie(value);
      return this;
    }

    /**
     * (Highcharts) A variwide chart (related to marimekko chart) is a column
     * chart with a variable width expressing a third dimension.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>variwide</code> series are defined in plotOptions.variwide.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder variwide(@Nullable PlotVariwideOptions value) {
      object.setVariwide(value);
      return this;
    }

    /**
     * (Highstock) Volume By Price indicator.
     *
     * This series requires <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>vbp</code> series are defined in plotOptions.vbp.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder vbp(@Nullable PlotVbpOptions value) {
      object.setVbp(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
     * each point has an X and Y position, a length and a direction. Vectors are
     * drawn as arrows.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>vector</code> series are defined in plotOptions.vector.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder vector(@Nullable PlotVectorOptions value) {
      object.setVector(value);
      return this;
    }

    /**
     * (Highcharts) A Venn diagram displays all possible logical relations
     * between a collection of different sets. The sets are represented by
     * circles, and the relation between the sets are displayed by the overlap
     * or lack of overlap between them. The venn diagram is a special case of
     * Euler diagrams, which can also be displayed by this series type.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>venn</code> series are defined in plotOptions.venn.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder venn(@Nullable PlotVennOptions value) {
      object.setVenn(value);
      return this;
    }

    /**
     * (Highstock) Volume Weighted Average Price indicator.
     *
     * This series requires <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>vwap</code> series are defined in plotOptions.vwap.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder vwap(@Nullable PlotVwapOptions value) {
      object.setVwap(value);
      return this;
    }

    /**
     * (Highcharts) A waterfall chart displays sequentially introduced positive
     * or negative values in cumulative columns.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>waterfall</code> series are defined in
     * plotOptions.waterfall.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder waterfall(@Nullable PlotWaterfallOptions value) {
      object.setWaterfall(value);
      return this;
    }

    /**
     * (Highstock) Williams %R. This series requires the <code>linkedTo</code> option to be
     * set and should be loaded after the <code>stock/indicators/indicators.js</code>.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>williamsr</code> series are defined in
     * plotOptions.williamsr.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder williamsr(@Nullable PlotWilliamsrOptions value) {
      object.setWilliamsr(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
     * speed and direction in one graphical form. Wind direction is given by the
     * stem direction, and wind speed by the number and shape of barbs.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>windbarb</code> series are defined in plotOptions.windbarb.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder windbarb(@Nullable PlotWindbarbOptions value) {
      object.setWindbarb(value);
      return this;
    }

    /**
     * (Highstock) Weighted moving average indicator (WMA). This series requires
     * <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>wma</code> series are defined in plotOptions.wma.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder wma(@Nullable PlotWmaOptions value) {
      object.setWma(value);
      return this;
    }

    /**
     * (Highcharts) A word cloud is a visualization of a set of words, where the
     * size and placement of a word is determined by how it is weighted.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>wordcloud</code> series are defined in
     * plotOptions.wordcloud.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder wordcloud(@Nullable PlotWordcloudOptions value) {
      object.setWordcloud(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
     * X axis, typically time intervals with a start and end date.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder xrange(@Nullable PlotXrangeOptions value) {
      object.setXrange(value);
      return this;
    }

    /**
     * (Highstock) Zig Zag indicator.
     *
     * This series requires <code>linkedTo</code> option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * <ol>
     * <li>
     * Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * </li>
     * <li>
     * Options for all <code>zigzag</code> series are defined in plotOptions.zigzag.
     *
     * </li>
     * <li>
     * Options for one single series are given in the series instance array.
     * (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder zigzag(@Nullable PlotZigzagOptions value) {
      object.setZigzag(value);
      return this;
    }
  }
}
