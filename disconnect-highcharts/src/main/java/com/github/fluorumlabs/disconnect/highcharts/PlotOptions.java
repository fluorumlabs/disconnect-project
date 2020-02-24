package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps) The plotOptions is a wrapper object for
 * config objects for each series type. The config objects for each series can
 * also be overridden for each series item as given in the series array.
 *
 * Configuration options for the series are given in three levels. Options for
 * all series in a chart are given in the plotOptions.series object. Then
 * options for all series of a specific type are given in the plotOptions of
 * that type, for example <code>plotOptions.line</code>. Next, options for one single
 * series are given in the series array.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions">https://api.highcharts.com/highcharts/plotOptions</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions">https://api.highcharts.com/highstock/plotOptions</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions">https://api.highcharts.com/highmaps/plotOptions</a>
 *
 */
public interface PlotOptions extends Any {
  /**
   * (Highstock) Accumulation Distribution (AD). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad">https://api.highcharts.com/highstock/plotOptions.ad</a>
   *
   * @implspec ad?: PlotAdOptions;
   *
   */
  @JSProperty("ad")
  @Nullable
  PlotAdOptions getAd();

  /**
   * (Highstock) Accumulation Distribution (AD). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad">https://api.highcharts.com/highstock/plotOptions.ad</a>
   *
   * @implspec ad?: PlotAdOptions;
   *
   */
  @JSProperty("ad")
  void setAd(PlotAdOptions value);

  /**
   * (Highcharts, Highstock) The area series type.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area">https://api.highcharts.com/highcharts/plotOptions.area</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area">https://api.highcharts.com/highstock/plotOptions.area</a>
   *
   * @implspec area?: PlotAreaOptions;
   *
   */
  @JSProperty("area")
  @Nullable
  PlotAreaOptions getArea();

  /**
   * (Highcharts, Highstock) The area series type.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area">https://api.highcharts.com/highcharts/plotOptions.area</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area">https://api.highcharts.com/highstock/plotOptions.area</a>
   *
   * @implspec area?: PlotAreaOptions;
   *
   */
  @JSProperty("area")
  void setArea(PlotAreaOptions value);

  /**
   * (Highcharts, Highstock) The area range series is a carteseian series with
   * higher and lower values for each point along an X axis, where the area
   * between the values is shaded. Requires <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange">https://api.highcharts.com/highcharts/plotOptions.arearange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange">https://api.highcharts.com/highstock/plotOptions.arearange</a>
   *
   * @implspec arearange?: PlotArearangeOptions;
   *
   */
  @JSProperty("arearange")
  @Nullable
  PlotArearangeOptions getArearange();

  /**
   * (Highcharts, Highstock) The area range series is a carteseian series with
   * higher and lower values for each point along an X axis, where the area
   * between the values is shaded. Requires <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange">https://api.highcharts.com/highcharts/plotOptions.arearange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange">https://api.highcharts.com/highstock/plotOptions.arearange</a>
   *
   * @implspec arearange?: PlotArearangeOptions;
   *
   */
  @JSProperty("arearange")
  void setArearange(PlotArearangeOptions value);

  /**
   * (Highcharts, Highstock) The area spline series is an area series where
   * the graph between the points is smoothed into a spline.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline">https://api.highcharts.com/highcharts/plotOptions.areaspline</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline">https://api.highcharts.com/highstock/plotOptions.areaspline</a>
   *
   * @implspec areaspline?: PlotAreasplineOptions;
   *
   */
  @JSProperty("areaspline")
  @Nullable
  PlotAreasplineOptions getAreaspline();

  /**
   * (Highcharts, Highstock) The area spline series is an area series where
   * the graph between the points is smoothed into a spline.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline">https://api.highcharts.com/highcharts/plotOptions.areaspline</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline">https://api.highcharts.com/highstock/plotOptions.areaspline</a>
   *
   * @implspec areaspline?: PlotAreasplineOptions;
   *
   */
  @JSProperty("areaspline")
  void setAreaspline(PlotAreasplineOptions value);

  /**
   * (Highcharts, Highstock) The area spline range is a cartesian series type
   * with higher and lower Y values along an X axis. The area inside the range
   * is colored, and the graph outlining the area is a smoothed spline.
   * Requires <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange">https://api.highcharts.com/highcharts/plotOptions.areasplinerange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange">https://api.highcharts.com/highstock/plotOptions.areasplinerange</a>
   *
   * @implspec areasplinerange?: PlotAreasplinerangeOptions;
   *
   */
  @JSProperty("areasplinerange")
  @Nullable
  PlotAreasplinerangeOptions getAreasplinerange();

  /**
   * (Highcharts, Highstock) The area spline range is a cartesian series type
   * with higher and lower Y values along an X axis. The area inside the range
   * is colored, and the graph outlining the area is a smoothed spline.
   * Requires <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange">https://api.highcharts.com/highcharts/plotOptions.areasplinerange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange">https://api.highcharts.com/highstock/plotOptions.areasplinerange</a>
   *
   * @implspec areasplinerange?: PlotAreasplinerangeOptions;
   *
   */
  @JSProperty("areasplinerange")
  void setAreasplinerange(PlotAreasplinerangeOptions value);

  /**
   * (Highstock) Average true range indicator (ATR). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr">https://api.highcharts.com/highstock/plotOptions.atr</a>
   *
   * @implspec atr?: PlotAtrOptions;
   *
   */
  @JSProperty("atr")
  @Nullable
  PlotAtrOptions getAtr();

  /**
   * (Highstock) Average true range indicator (ATR). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr">https://api.highcharts.com/highstock/plotOptions.atr</a>
   *
   * @implspec atr?: PlotAtrOptions;
   *
   */
  @JSProperty("atr")
  void setAtr(PlotAtrOptions value);

  /**
   * (Highcharts) A bar series is a special type of column series where the
   * columns are horizontal.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar">https://api.highcharts.com/highcharts/plotOptions.bar</a>
   *
   * @implspec bar?: PlotBarOptions;
   *
   */
  @JSProperty("bar")
  @Nullable
  PlotBarOptions getBar();

  /**
   * (Highcharts) A bar series is a special type of column series where the
   * columns are horizontal.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar">https://api.highcharts.com/highcharts/plotOptions.bar</a>
   *
   * @implspec bar?: PlotBarOptions;
   *
   */
  @JSProperty("bar")
  void setBar(PlotBarOptions value);

  /**
   * (Highstock) Bollinger bands (BB). This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb">https://api.highcharts.com/highstock/plotOptions.bb</a>
   *
   * @implspec bb?: PlotBbOptions;
   *
   */
  @JSProperty("bb")
  @Nullable
  PlotBbOptions getBb();

  /**
   * (Highstock) Bollinger bands (BB). This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb">https://api.highcharts.com/highstock/plotOptions.bb</a>
   *
   * @implspec bb?: PlotBbOptions;
   *
   */
  @JSProperty("bb")
  void setBb(PlotBbOptions value);

  /**
   * (Highcharts) A bell curve is an areaspline series which represents the
   * probability density function of the normal distribution. It calculates
   * mean and standard deviation of the base series data and plots the curve
   * according to the calculated parameters.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve">https://api.highcharts.com/highcharts/plotOptions.bellcurve</a>
   *
   * @implspec bellcurve?: PlotBellcurveOptions;
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve">https://api.highcharts.com/highcharts/plotOptions.bellcurve</a>
   *
   * @implspec bellcurve?: PlotBellcurveOptions;
   *
   */
  @JSProperty("bellcurve")
  void setBellcurve(PlotBellcurveOptions value);

  /**
   * (Highcharts) A box plot is a convenient way of depicting groups of data
   * through their five-number summaries: the smallest observation (sample
   * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
   * largest observation (sample maximum).
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot">https://api.highcharts.com/highcharts/plotOptions.boxplot</a>
   *
   * @implspec boxplot?: PlotBoxplotOptions;
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.boxplot">https://api.highcharts.com/highcharts/plotOptions.boxplot</a>
   *
   * @implspec boxplot?: PlotBoxplotOptions;
   *
   */
  @JSProperty("boxplot")
  void setBoxplot(PlotBoxplotOptions value);

  /**
   * (Highcharts, Highstock) A bubble series is a three dimensional series
   * type where each point renders an X, Y and Z value. Each points is drawn
   * as a bubble where the position along the X and Y axes mark the X and Y
   * values, and the size of the bubble relates to the Z value. Requires
   * <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble">https://api.highcharts.com/highcharts/plotOptions.bubble</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble">https://api.highcharts.com/highstock/plotOptions.bubble</a>
   *
   * @implspec bubble?: PlotBubbleOptions;
   *
   */
  @JSProperty("bubble")
  @Nullable
  PlotBubbleOptions getBubble();

  /**
   * (Highcharts, Highstock) A bubble series is a three dimensional series
   * type where each point renders an X, Y and Z value. Each points is drawn
   * as a bubble where the position along the X and Y axes mark the X and Y
   * values, and the size of the bubble relates to the Z value. Requires
   * <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble">https://api.highcharts.com/highcharts/plotOptions.bubble</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble">https://api.highcharts.com/highstock/plotOptions.bubble</a>
   *
   * @implspec bubble?: PlotBubbleOptions;
   *
   */
  @JSProperty("bubble")
  void setBubble(PlotBubbleOptions value);

  /**
   * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
   * graph features a single measure, compares it to a target, and displays it
   * in the context of qualitative ranges of performance that could be set
   * using plotBands on yAxis.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet">https://api.highcharts.com/highcharts/plotOptions.bullet</a>
   *
   * @implspec bullet?: PlotBulletOptions;
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet">https://api.highcharts.com/highcharts/plotOptions.bullet</a>
   *
   * @implspec bullet?: PlotBulletOptions;
   *
   */
  @JSProperty("bullet")
  void setBullet(PlotBulletOptions value);

  /**
   * (Highstock) A candlestick chart is a style of financial chart used to
   * describe price movements over time.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick">https://api.highcharts.com/highstock/plotOptions.candlestick</a>
   *
   * @implspec candlestick?: PlotCandlestickOptions;
   *
   */
  @JSProperty("candlestick")
  @Nullable
  PlotCandlestickOptions getCandlestick();

  /**
   * (Highstock) A candlestick chart is a style of financial chart used to
   * describe price movements over time.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.candlestick">https://api.highcharts.com/highstock/plotOptions.candlestick</a>
   *
   * @implspec candlestick?: PlotCandlestickOptions;
   *
   */
  @JSProperty("candlestick")
  void setCandlestick(PlotCandlestickOptions value);

  /**
   * (Highstock) Commodity Channel Index (CCI). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci">https://api.highcharts.com/highstock/plotOptions.cci</a>
   *
   * @implspec cci?: PlotCciOptions;
   *
   */
  @JSProperty("cci")
  @Nullable
  PlotCciOptions getCci();

  /**
   * (Highstock) Commodity Channel Index (CCI). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci">https://api.highcharts.com/highstock/plotOptions.cci</a>
   *
   * @implspec cci?: PlotCciOptions;
   *
   */
  @JSProperty("cci")
  void setCci(PlotCciOptions value);

  /**
   * (Highstock) Chaikin Money Flow indicator (cmf).
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf">https://api.highcharts.com/highstock/plotOptions.cmf</a>
   *
   * @implspec cmf?: PlotCmfOptions;
   *
   */
  @JSProperty("cmf")
  @Nullable
  PlotCmfOptions getCmf();

  /**
   * (Highstock) Chaikin Money Flow indicator (cmf).
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf">https://api.highcharts.com/highstock/plotOptions.cmf</a>
   *
   * @implspec cmf?: PlotCmfOptions;
   *
   */
  @JSProperty("cmf")
  void setCmf(PlotCmfOptions value);

  /**
   * (Highcharts, Highstock) Column series display one column per value along
   * an X axis.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column">https://api.highcharts.com/highcharts/plotOptions.column</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column">https://api.highcharts.com/highstock/plotOptions.column</a>
   *
   * @implspec column?: PlotColumnOptions;
   *
   */
  @JSProperty("column")
  @Nullable
  PlotColumnOptions getColumn();

  /**
   * (Highcharts, Highstock) Column series display one column per value along
   * an X axis.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column">https://api.highcharts.com/highcharts/plotOptions.column</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column">https://api.highcharts.com/highstock/plotOptions.column</a>
   *
   * @implspec column?: PlotColumnOptions;
   *
   */
  @JSProperty("column")
  void setColumn(PlotColumnOptions value);

  /**
   * (Highcharts, Highstock) The column range is a cartesian series type with
   * higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
   * To display horizontal bars, set chart.inverted to <code>true</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange">https://api.highcharts.com/highcharts/plotOptions.columnrange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange">https://api.highcharts.com/highstock/plotOptions.columnrange</a>
   *
   * @implspec columnrange?: PlotColumnrangeOptions;
   *
   */
  @JSProperty("columnrange")
  @Nullable
  PlotColumnrangeOptions getColumnrange();

  /**
   * (Highcharts, Highstock) The column range is a cartesian series type with
   * higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
   * To display horizontal bars, set chart.inverted to <code>true</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange">https://api.highcharts.com/highcharts/plotOptions.columnrange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange">https://api.highcharts.com/highstock/plotOptions.columnrange</a>
   *
   * @implspec columnrange?: PlotColumnrangeOptions;
   *
   */
  @JSProperty("columnrange")
  void setColumnrange(PlotColumnrangeOptions value);

  /**
   * (Highstock) Exponential moving average indicator (EMA). This series
   * requires the <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema">https://api.highcharts.com/highstock/plotOptions.ema</a>
   *
   * @implspec ema?: PlotEmaOptions;
   *
   */
  @JSProperty("ema")
  @Nullable
  PlotEmaOptions getEma();

  /**
   * (Highstock) Exponential moving average indicator (EMA). This series
   * requires the <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema">https://api.highcharts.com/highstock/plotOptions.ema</a>
   *
   * @implspec ema?: PlotEmaOptions;
   *
   */
  @JSProperty("ema")
  void setEma(PlotEmaOptions value);

  /**
   * (Highcharts, Highstock) Error bars are a graphical representation of the
   * variability of data and are used on graphs to indicate the error, or
   * uncertainty in a reported measurement.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar">https://api.highcharts.com/highcharts/plotOptions.errorbar</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar">https://api.highcharts.com/highstock/plotOptions.errorbar</a>
   *
   * @implspec errorbar?: PlotErrorbarOptions;
   *
   */
  @JSProperty("errorbar")
  @Nullable
  PlotErrorbarOptions getErrorbar();

  /**
   * (Highcharts, Highstock) Error bars are a graphical representation of the
   * variability of data and are used on graphs to indicate the error, or
   * uncertainty in a reported measurement.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.errorbar">https://api.highcharts.com/highcharts/plotOptions.errorbar</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.errorbar">https://api.highcharts.com/highstock/plotOptions.errorbar</a>
   *
   * @implspec errorbar?: PlotErrorbarOptions;
   *
   */
  @JSProperty("errorbar")
  void setErrorbar(PlotErrorbarOptions value);

  /**
   * (Highstock) Flags are used to mark events in stock charts. They can be
   * added on the timeline, or attached to a specific series.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags">https://api.highcharts.com/highstock/plotOptions.flags</a>
   *
   * @implspec flags?: PlotFlagsOptions;
   *
   */
  @JSProperty("flags")
  @Nullable
  PlotFlagsOptions getFlags();

  /**
   * (Highstock) Flags are used to mark events in stock charts. They can be
   * added on the timeline, or attached to a specific series.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags">https://api.highcharts.com/highstock/plotOptions.flags</a>
   *
   * @implspec flags?: PlotFlagsOptions;
   *
   */
  @JSProperty("flags")
  void setFlags(PlotFlagsOptions value);

  /**
   * (Highcharts) Funnel charts are a type of chart often used to visualize
   * stages in a sales project, where the top are the initial stages with the
   * most clients. It requires that the modules/funnel.js file is loaded.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel">https://api.highcharts.com/highcharts/plotOptions.funnel</a>
   *
   * @implspec funnel?: PlotFunnelOptions;
   *
   */
  @JSProperty("funnel")
  @Nullable
  PlotFunnelOptions getFunnel();

  /**
   * (Highcharts) Funnel charts are a type of chart often used to visualize
   * stages in a sales project, where the top are the initial stages with the
   * most clients. It requires that the modules/funnel.js file is loaded.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.funnel">https://api.highcharts.com/highcharts/plotOptions.funnel</a>
   *
   * @implspec funnel?: PlotFunnelOptions;
   *
   */
  @JSProperty("funnel")
  void setFunnel(PlotFunnelOptions value);

  /**
   * (Gantt) A <code>gantt</code> series. If the type option is not specified, it is
   * inherited from chart.type.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt">https://api.highcharts.com/gantt/plotOptions.gantt</a>
   *
   * @implspec gantt?: PlotGanttOptions;
   *
   */
  @JSProperty("gantt")
  @Nullable
  PlotGanttOptions getGantt();

  /**
   * (Gantt) A <code>gantt</code> series. If the type option is not specified, it is
   * inherited from chart.type.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt">https://api.highcharts.com/gantt/plotOptions.gantt</a>
   *
   * @implspec gantt?: PlotGanttOptions;
   *
   */
  @JSProperty("gantt")
  void setGantt(PlotGanttOptions value);

  /**
   * (Highcharts) Gauges are circular plots displaying one or more values with
   * a dial pointing to values along the perimeter.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge">https://api.highcharts.com/highcharts/plotOptions.gauge</a>
   *
   * @implspec gauge?: PlotGaugeOptions;
   *
   */
  @JSProperty("gauge")
  @Nullable
  PlotGaugeOptions getGauge();

  /**
   * (Highcharts) Gauges are circular plots displaying one or more values with
   * a dial pointing to values along the perimeter.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge">https://api.highcharts.com/highcharts/plotOptions.gauge</a>
   *
   * @implspec gauge?: PlotGaugeOptions;
   *
   */
  @JSProperty("gauge")
  void setGauge(PlotGaugeOptions value);

  /**
   * (Highcharts, Highmaps) A heatmap is a graphical representation of data
   * where the individual values contained in a matrix are represented as
   * colors.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap">https://api.highcharts.com/highcharts/plotOptions.heatmap</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap">https://api.highcharts.com/highmaps/plotOptions.heatmap</a>
   *
   * @implspec heatmap?: PlotHeatmapOptions;
   *
   */
  @JSProperty("heatmap")
  @Nullable
  PlotHeatmapOptions getHeatmap();

  /**
   * (Highcharts, Highmaps) A heatmap is a graphical representation of data
   * where the individual values contained in a matrix are represented as
   * colors.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap">https://api.highcharts.com/highcharts/plotOptions.heatmap</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap">https://api.highcharts.com/highmaps/plotOptions.heatmap</a>
   *
   * @implspec heatmap?: PlotHeatmapOptions;
   *
   */
  @JSProperty("heatmap")
  void setHeatmap(PlotHeatmapOptions value);

  /**
   * (Highcharts) A histogram is a column series which represents the
   * distribution of the data set in the base series. Histogram splits data
   * into bins and shows their frequencies.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram">https://api.highcharts.com/highcharts/plotOptions.histogram</a>
   *
   * @implspec histogram?: PlotHistogramOptions;
   *
   */
  @JSProperty("histogram")
  @Nullable
  PlotHistogramOptions getHistogram();

  /**
   * (Highcharts) A histogram is a column series which represents the
   * distribution of the data set in the base series. Histogram splits data
   * into bins and shows their frequencies.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram">https://api.highcharts.com/highcharts/plotOptions.histogram</a>
   *
   * @implspec histogram?: PlotHistogramOptions;
   *
   */
  @JSProperty("histogram")
  void setHistogram(PlotHistogramOptions value);

  /**
   * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code>
   * option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh">https://api.highcharts.com/highstock/plotOptions.ikh</a>
   *
   * @implspec ikh?: PlotIkhOptions;
   *
   */
  @JSProperty("ikh")
  @Nullable
  PlotIkhOptions getIkh();

  /**
   * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires <code>linkedTo</code>
   * option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh">https://api.highcharts.com/highstock/plotOptions.ikh</a>
   *
   * @implspec ikh?: PlotIkhOptions;
   *
   */
  @JSProperty("ikh")
  void setIkh(PlotIkhOptions value);

  /**
   * (Highcharts, Highstock) A line series displays information as a series of
   * data points connected by straight line segments.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line">https://api.highcharts.com/highcharts/plotOptions.line</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line">https://api.highcharts.com/highstock/plotOptions.line</a>
   *
   * @implspec line?: PlotLineOptions;
   *
   */
  @JSProperty("line")
  @Nullable
  PlotLineOptions getLine();

  /**
   * (Highcharts, Highstock) A line series displays information as a series of
   * data points connected by straight line segments.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line">https://api.highcharts.com/highcharts/plotOptions.line</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line">https://api.highcharts.com/highstock/plotOptions.line</a>
   *
   * @implspec line?: PlotLineOptions;
   *
   */
  @JSProperty("line")
  void setLine(PlotLineOptions value);

  /**
   * (Highstock) Moving Average Convergence Divergence (MACD). This series
   * requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd">https://api.highcharts.com/highstock/plotOptions.macd</a>
   *
   * @implspec macd?: PlotMacdOptions;
   *
   */
  @JSProperty("macd")
  @Nullable
  PlotMacdOptions getMacd();

  /**
   * (Highstock) Moving Average Convergence Divergence (MACD). This series
   * requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd">https://api.highcharts.com/highstock/plotOptions.macd</a>
   *
   * @implspec macd?: PlotMacdOptions;
   *
   */
  @JSProperty("macd")
  void setMacd(PlotMacdOptions value);

  /**
   * (Highmaps) The map series is used for basic choropleth maps, where each
   * map area has a color based on its value.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map">https://api.highcharts.com/highmaps/plotOptions.map</a>
   *
   * @implspec map?: PlotMapOptions;
   *
   */
  @JSProperty("map")
  @Nullable
  PlotMapOptions getMap();

  /**
   * (Highmaps) The map series is used for basic choropleth maps, where each
   * map area has a color based on its value.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map">https://api.highcharts.com/highmaps/plotOptions.map</a>
   *
   * @implspec map?: PlotMapOptions;
   *
   */
  @JSProperty("map")
  void setMap(PlotMapOptions value);

  /**
   * (Highmaps) A map bubble series is a bubble series laid out on top of a
   * map series, where each bubble is tied to a specific map area.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble">https://api.highcharts.com/highmaps/plotOptions.mapbubble</a>
   *
   * @implspec mapbubble?: PlotMapbubbleOptions;
   *
   */
  @JSProperty("mapbubble")
  @Nullable
  PlotMapbubbleOptions getMapbubble();

  /**
   * (Highmaps) A map bubble series is a bubble series laid out on top of a
   * map series, where each bubble is tied to a specific map area.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapbubble">https://api.highcharts.com/highmaps/plotOptions.mapbubble</a>
   *
   * @implspec mapbubble?: PlotMapbubbleOptions;
   *
   */
  @JSProperty("mapbubble")
  void setMapbubble(PlotMapbubbleOptions value);

  /**
   * (Highmaps) A mapline series is a special case of the map series where the
   * value colors are applied to the strokes rather than the fills. It can
   * also be used for freeform drawing, like dividers, in the map.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline">https://api.highcharts.com/highmaps/plotOptions.mapline</a>
   *
   * @implspec mapline?: PlotMaplineOptions;
   *
   */
  @JSProperty("mapline")
  @Nullable
  PlotMaplineOptions getMapline();

  /**
   * (Highmaps) A mapline series is a special case of the map series where the
   * value colors are applied to the strokes rather than the fills. It can
   * also be used for freeform drawing, like dividers, in the map.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline">https://api.highcharts.com/highmaps/plotOptions.mapline</a>
   *
   * @implspec mapline?: PlotMaplineOptions;
   *
   */
  @JSProperty("mapline")
  void setMapline(PlotMaplineOptions value);

  /**
   * (Highmaps) A mappoint series is a special form of scatter series where
   * the points can be laid out in map coordinates on top of a map.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint">https://api.highcharts.com/highmaps/plotOptions.mappoint</a>
   *
   * @implspec mappoint?: PlotMappointOptions;
   *
   */
  @JSProperty("mappoint")
  @Nullable
  PlotMapPointOptions getMappoint();

  /**
   * (Highmaps) A mappoint series is a special form of scatter series where
   * the points can be laid out in map coordinates on top of a map.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint">https://api.highcharts.com/highmaps/plotOptions.mappoint</a>
   *
   * @implspec mappoint?: PlotMappointOptions;
   *
   */
  @JSProperty("mappoint")
  void setMappoint(PlotMapPointOptions value);

  /**
   * (Highstock) Money Flow Index. This series requires <code>linkedTo</code> option to
   * be set and should be loaded after the <code>stock/indicators/indicators.js</code>
   * file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi">https://api.highcharts.com/highstock/plotOptions.mfi</a>
   *
   * @implspec mfi?: PlotMfiOptions;
   *
   */
  @JSProperty("mfi")
  @Nullable
  PlotMfiOptions getMfi();

  /**
   * (Highstock) Money Flow Index. This series requires <code>linkedTo</code> option to
   * be set and should be loaded after the <code>stock/indicators/indicators.js</code>
   * file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi">https://api.highcharts.com/highstock/plotOptions.mfi</a>
   *
   * @implspec mfi?: PlotMfiOptions;
   *
   */
  @JSProperty("mfi")
  void setMfi(PlotMfiOptions value);

  /**
   * (Highstock) Momentum. This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum">https://api.highcharts.com/highstock/plotOptions.momentum</a>
   *
   * @implspec momentum?: PlotMomentumOptions;
   *
   */
  @JSProperty("momentum")
  @Nullable
  PlotMomentumOptions getMomentum();

  /**
   * (Highstock) Momentum. This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum">https://api.highcharts.com/highstock/plotOptions.momentum</a>
   *
   * @implspec momentum?: PlotMomentumOptions;
   *
   */
  @JSProperty("momentum")
  void setMomentum(PlotMomentumOptions value);

  /**
   * (Highstock) An OHLC chart is a style of financial chart used to describe
   * price movements over time. It displays open, high, low and close values
   * per data point.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc">https://api.highcharts.com/highstock/plotOptions.ohlc</a>
   *
   * @implspec ohlc?: PlotOhlcOptions;
   *
   */
  @JSProperty("ohlc")
  @Nullable
  PlotOhlcOptions getOhlc();

  /**
   * (Highstock) An OHLC chart is a style of financial chart used to describe
   * price movements over time. It displays open, high, low and close values
   * per data point.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ohlc">https://api.highcharts.com/highstock/plotOptions.ohlc</a>
   *
   * @implspec ohlc?: PlotOhlcOptions;
   *
   */
  @JSProperty("ohlc")
  void setOhlc(PlotOhlcOptions value);

  /**
   * (Highcharts) A pareto diagram is a type of chart that contains both bars
   * and a line graph, where individual values are represented in descending
   * order by bars, and the cumulative total is represented by the line.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto">https://api.highcharts.com/highcharts/plotOptions.pareto</a>
   *
   * @implspec pareto?: PlotParetoOptions;
   *
   */
  @JSProperty("pareto")
  @Nullable
  PlotParetoOptions getPareto();

  /**
   * (Highcharts) A pareto diagram is a type of chart that contains both bars
   * and a line graph, where individual values are represented in descending
   * order by bars, and the cumulative total is represented by the line.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto">https://api.highcharts.com/highcharts/plotOptions.pareto</a>
   *
   * @implspec pareto?: PlotParetoOptions;
   *
   */
  @JSProperty("pareto")
  void setPareto(PlotParetoOptions value);

  /**
   * (Highcharts) A pie chart is a circular graphic which is divided into
   * slices to illustrate numerical proportion.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie">https://api.highcharts.com/highcharts/plotOptions.pie</a>
   *
   * @implspec pie?: PlotPieOptions;
   *
   */
  @JSProperty("pie")
  @Nullable
  PlotPieOptions getPie();

  /**
   * (Highcharts) A pie chart is a circular graphic which is divided into
   * slices to illustrate numerical proportion.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie">https://api.highcharts.com/highcharts/plotOptions.pie</a>
   *
   * @implspec pie?: PlotPieOptions;
   *
   */
  @JSProperty("pie")
  void setPie(PlotPieOptions value);

  /**
   * (Highstock) Pivot points indicator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after
   * <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints">https://api.highcharts.com/highstock/plotOptions.pivotpoints</a>
   *
   * @implspec pivotpoints?: PlotPivotpointsOptions;
   *
   */
  @JSProperty("pivotpoints")
  @Nullable
  PlotPivotpointsOptions getPivotpoints();

  /**
   * (Highstock) Pivot points indicator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after
   * <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints">https://api.highcharts.com/highstock/plotOptions.pivotpoints</a>
   *
   * @implspec pivotpoints?: PlotPivotpointsOptions;
   *
   */
  @JSProperty("pivotpoints")
  void setPivotpoints(PlotPivotpointsOptions value);

  /**
   * (Highcharts, Highstock) A polygon series can be used to draw any freeform
   * shape in the cartesian coordinate system. A fill is applied with the
   * <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code>
   * options. Requires the <code>highcharts-more.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon">https://api.highcharts.com/highcharts/plotOptions.polygon</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon">https://api.highcharts.com/highstock/plotOptions.polygon</a>
   *
   * @implspec polygon?: PlotPolygonOptions;
   *
   */
  @JSProperty("polygon")
  @Nullable
  PlotPolygonOptions getPolygon();

  /**
   * (Highcharts, Highstock) A polygon series can be used to draw any freeform
   * shape in the cartesian coordinate system. A fill is applied with the
   * <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code>
   * options. Requires the <code>highcharts-more.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon">https://api.highcharts.com/highcharts/plotOptions.polygon</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon">https://api.highcharts.com/highstock/plotOptions.polygon</a>
   *
   * @implspec polygon?: PlotPolygonOptions;
   *
   */
  @JSProperty("polygon")
  void setPolygon(PlotPolygonOptions value);

  /**
   * (Highstock) Price envelopes indicator based on SMA calculations. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes">https://api.highcharts.com/highstock/plotOptions.priceenvelopes</a>
   *
   * @implspec priceenvelopes?: PlotPriceenvelopesOptions;
   *
   */
  @JSProperty("priceenvelopes")
  @Nullable
  PlotPriceenvelopesOptions getPriceenvelopes();

  /**
   * (Highstock) Price envelopes indicator based on SMA calculations. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes">https://api.highcharts.com/highstock/plotOptions.priceenvelopes</a>
   *
   * @implspec priceenvelopes?: PlotPriceenvelopesOptions;
   *
   */
  @JSProperty("priceenvelopes")
  void setPriceenvelopes(PlotPriceenvelopesOptions value);

  /**
   * (Highstock) Parabolic SAR. This series requires <code>linkedTo</code> option to be
   * set and should be loaded after <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar">https://api.highcharts.com/highstock/plotOptions.psar</a>
   *
   * @implspec psar?: PlotPsarOptions;
   *
   */
  @JSProperty("psar")
  @Nullable
  PlotPsarOptions getPsar();

  /**
   * (Highstock) Parabolic SAR. This series requires <code>linkedTo</code> option to be
   * set and should be loaded after <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar">https://api.highcharts.com/highstock/plotOptions.psar</a>
   *
   * @implspec psar?: PlotPsarOptions;
   *
   */
  @JSProperty("psar")
  void setPsar(PlotPsarOptions value);

  /**
   * (Highcharts) A pyramid series is a special type of funnel, without neck
   * and reversed by default. Requires the funnel module.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid">https://api.highcharts.com/highcharts/plotOptions.pyramid</a>
   *
   * @implspec pyramid?: PlotPyramidOptions;
   *
   */
  @JSProperty("pyramid")
  @Nullable
  PlotPyramidOptions getPyramid();

  /**
   * (Highcharts) A pyramid series is a special type of funnel, without neck
   * and reversed by default. Requires the funnel module.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid">https://api.highcharts.com/highcharts/plotOptions.pyramid</a>
   *
   * @implspec pyramid?: PlotPyramidOptions;
   *
   */
  @JSProperty("pyramid")
  void setPyramid(PlotPyramidOptions value);

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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc">https://api.highcharts.com/highstock/plotOptions.roc</a>
   *
   * @implspec roc?: PlotRocOptions;
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc">https://api.highcharts.com/highstock/plotOptions.roc</a>
   *
   * @implspec roc?: PlotRocOptions;
   *
   */
  @JSProperty("roc")
  void setRoc(PlotRocOptions value);

  /**
   * (Highstock) Relative strength index (RSI) technical indicator. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi">https://api.highcharts.com/highstock/plotOptions.rsi</a>
   *
   * @implspec rsi?: PlotRsiOptions;
   *
   */
  @JSProperty("rsi")
  @Nullable
  PlotRsiOptions getRsi();

  /**
   * (Highstock) Relative strength index (RSI) technical indicator. This
   * series requires the <code>linkedTo</code> option to be set and should be loaded
   * after the <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi">https://api.highcharts.com/highstock/plotOptions.rsi</a>
   *
   * @implspec rsi?: PlotRsiOptions;
   *
   */
  @JSProperty("rsi")
  void setRsi(PlotRsiOptions value);

  /**
   * (Highcharts) A sankey diagram is a type of flow diagram, in which the
   * width of the link between two nodes is shown proportionally to the flow
   * quantity.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey">https://api.highcharts.com/highcharts/plotOptions.sankey</a>
   *
   * @implspec sankey?: PlotSankeyOptions;
   *
   */
  @JSProperty("sankey")
  @Nullable
  PlotSankeyOptions getSankey();

  /**
   * (Highcharts) A sankey diagram is a type of flow diagram, in which the
   * width of the link between two nodes is shown proportionally to the flow
   * quantity.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey">https://api.highcharts.com/highcharts/plotOptions.sankey</a>
   *
   * @implspec sankey?: PlotSankeyOptions;
   *
   */
  @JSProperty("sankey")
  void setSankey(PlotSankeyOptions value);

  /**
   * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
   * display values for two variables for a set of data.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter">https://api.highcharts.com/highcharts/plotOptions.scatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter">https://api.highcharts.com/highstock/plotOptions.scatter</a>
   *
   * @implspec scatter?: PlotScatterOptions;
   *
   */
  @JSProperty("scatter")
  @Nullable
  PlotScatterOptions getScatter();

  /**
   * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
   * display values for two variables for a set of data.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter">https://api.highcharts.com/highcharts/plotOptions.scatter</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter">https://api.highcharts.com/highstock/plotOptions.scatter</a>
   *
   * @implspec scatter?: PlotScatterOptions;
   *
   */
  @JSProperty("scatter")
  void setScatter(PlotScatterOptions value);

  /**
   * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
   * values for three variables for a set of data.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d">https://api.highcharts.com/highcharts/plotOptions.scatter3d</a>
   *
   * @implspec scatter3d?: PlotScatter3dOptions;
   *
   */
  @JSProperty("scatter3d")
  @Nullable
  PlotScatter3dOptions getScatter3d();

  /**
   * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
   * values for three variables for a set of data.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d">https://api.highcharts.com/highcharts/plotOptions.scatter3d</a>
   *
   * @implspec scatter3d?: PlotScatter3dOptions;
   *
   */
  @JSProperty("scatter3d")
  void setScatter3d(PlotScatter3dOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) General options for all series types.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series">https://api.highcharts.com/highcharts/plotOptions.series</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series">https://api.highcharts.com/highstock/plotOptions.series</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series">https://api.highcharts.com/highmaps/plotOptions.series</a>
   *
   * @implspec series?: PlotSeriesOptions;
   *
   */
  @JSProperty("series")
  @Nullable
  PlotSeriesOptions getSeries();

  /**
   * (Highcharts, Highstock, Highmaps) General options for all series types.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series">https://api.highcharts.com/highcharts/plotOptions.series</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series">https://api.highcharts.com/highstock/plotOptions.series</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series">https://api.highcharts.com/highmaps/plotOptions.series</a>
   *
   * @implspec series?: PlotSeriesOptions;
   *
   */
  @JSProperty("series")
  void setSeries(PlotSeriesOptions value);

  /**
   * (Highstock) Simple moving average indicator (SMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma">https://api.highcharts.com/highstock/plotOptions.sma</a>
   *
   * @implspec sma?: PlotSmaOptions;
   *
   */
  @JSProperty("sma")
  @Nullable
  PlotSmaOptions getSma();

  /**
   * (Highstock) Simple moving average indicator (SMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma">https://api.highcharts.com/highstock/plotOptions.sma</a>
   *
   * @implspec sma?: PlotSmaOptions;
   *
   */
  @JSProperty("sma")
  void setSma(PlotSmaOptions value);

  /**
   * (Highcharts) A solid gauge is a circular gauge where the value is
   * indicated by a filled arc, and the color of the arc may variate with the
   * value.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge">https://api.highcharts.com/highcharts/plotOptions.solidgauge</a>
   *
   * @implspec solidgauge?: PlotSolidgaugeOptions;
   *
   */
  @JSProperty("solidgauge")
  @Nullable
  PlotSolidgaugeOptions getSolidgauge();

  /**
   * (Highcharts) A solid gauge is a circular gauge where the value is
   * indicated by a filled arc, and the color of the arc may variate with the
   * value.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.solidgauge">https://api.highcharts.com/highcharts/plotOptions.solidgauge</a>
   *
   * @implspec solidgauge?: PlotSolidgaugeOptions;
   *
   */
  @JSProperty("solidgauge")
  void setSolidgauge(PlotSolidgaugeOptions value);

  /**
   * (Highcharts, Highstock) A spline series is a special type of line series,
   * where the segments between the data points are smoothed.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline">https://api.highcharts.com/highcharts/plotOptions.spline</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline">https://api.highcharts.com/highstock/plotOptions.spline</a>
   *
   * @implspec spline?: PlotSplineOptions;
   *
   */
  @JSProperty("spline")
  @Nullable
  PlotSplineOptions getSpline();

  /**
   * (Highcharts, Highstock) A spline series is a special type of line series,
   * where the segments between the data points are smoothed.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline">https://api.highcharts.com/highcharts/plotOptions.spline</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline">https://api.highcharts.com/highstock/plotOptions.spline</a>
   *
   * @implspec spline?: PlotSplineOptions;
   *
   */
  @JSProperty("spline")
  void setSpline(PlotSplineOptions value);

  /**
   * (Highstock) Stochastic oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic">https://api.highcharts.com/highstock/plotOptions.stochastic</a>
   *
   * @implspec stochastic?: PlotStochasticOptions;
   *
   */
  @JSProperty("stochastic")
  @Nullable
  PlotStochasticOptions getStochastic();

  /**
   * (Highstock) Stochastic oscillator. This series requires the <code>linkedTo</code>
   * option to be set and should be loaded after the
   * <code>stock/indicators/indicators.js</code> file.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic">https://api.highcharts.com/highstock/plotOptions.stochastic</a>
   *
   * @implspec stochastic?: PlotStochasticOptions;
   *
   */
  @JSProperty("stochastic")
  void setStochastic(PlotStochasticOptions value);

  /**
   * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
   * which is displaced around a central axis, resulting in a flowing, organic
   * shape.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph">https://api.highcharts.com/highcharts/plotOptions.streamgraph</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph">https://api.highcharts.com/highstock/plotOptions.streamgraph</a>
   *
   * @implspec streamgraph?: PlotStreamgraphOptions;
   *
   */
  @JSProperty("streamgraph")
  @Nullable
  PlotStreamgraphOptions getStreamgraph();

  /**
   * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
   * which is displaced around a central axis, resulting in a flowing, organic
   * shape.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.streamgraph">https://api.highcharts.com/highcharts/plotOptions.streamgraph</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.streamgraph">https://api.highcharts.com/highstock/plotOptions.streamgraph</a>
   *
   * @implspec streamgraph?: PlotStreamgraphOptions;
   *
   */
  @JSProperty("streamgraph")
  void setStreamgraph(PlotStreamgraphOptions value);

  /**
   * (Highcharts) A Sunburst displays hierarchical data, where a level in the
   * hierarchy is represented by a circle. The center represents the root node
   * of the tree. The visualization bears a resemblance to both treemap and
   * pie charts.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst">https://api.highcharts.com/highcharts/plotOptions.sunburst</a>
   *
   * @implspec sunburst?: PlotSunburstOptions;
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst">https://api.highcharts.com/highcharts/plotOptions.sunburst</a>
   *
   * @implspec sunburst?: PlotSunburstOptions;
   *
   */
  @JSProperty("sunburst")
  void setSunburst(PlotSunburstOptions value);

  /**
   * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
   * tile shapes are configurable.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap">https://api.highcharts.com/highcharts/plotOptions.tilemap</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap">https://api.highcharts.com/highmaps/plotOptions.tilemap</a>
   *
   * @implspec tilemap?: PlotTilemapOptions;
   *
   */
  @JSProperty("tilemap")
  @Nullable
  PlotTilemapOptions getTilemap();

  /**
   * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
   * tile shapes are configurable.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap">https://api.highcharts.com/highcharts/plotOptions.tilemap</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.tilemap">https://api.highcharts.com/highmaps/plotOptions.tilemap</a>
   *
   * @implspec tilemap?: PlotTilemapOptions;
   *
   */
  @JSProperty("tilemap")
  void setTilemap(PlotTilemapOptions value);

  /**
   * (Highcharts) A treemap displays hierarchical data using nested
   * rectangles. The data can be laid out in varying ways depending on
   * options.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap">https://api.highcharts.com/highcharts/plotOptions.treemap</a>
   *
   * @implspec treemap?: PlotTreemapOptions;
   *
   */
  @JSProperty("treemap")
  @Nullable
  PlotTreemapOptions getTreemap();

  /**
   * (Highcharts) A treemap displays hierarchical data using nested
   * rectangles. The data can be laid out in varying ways depending on
   * options.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap">https://api.highcharts.com/highcharts/plotOptions.treemap</a>
   *
   * @implspec treemap?: PlotTreemapOptions;
   *
   */
  @JSProperty("treemap")
  void setTreemap(PlotTreemapOptions value);

  /**
   * (Highcharts) A variable pie series is a two dimensional series type,
   * where each point renders an Y and Z value. Each point is drawn as a pie
   * slice where the size (arc) of the slice relates to the Y value and the
   * radius of pie slice relates to the Z value. Requires
   * <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie">https://api.highcharts.com/highcharts/plotOptions.variablepie</a>
   *
   * @implspec variablepie?: PlotVariablepieOptions;
   *
   */
  @JSProperty("variablepie")
  @Nullable
  PlotVariablepieOptions getVariablepie();

  /**
   * (Highcharts) A variable pie series is a two dimensional series type,
   * where each point renders an Y and Z value. Each point is drawn as a pie
   * slice where the size (arc) of the slice relates to the Y value and the
   * radius of pie slice relates to the Z value. Requires
   * <code>highcharts-more.js</code>.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie">https://api.highcharts.com/highcharts/plotOptions.variablepie</a>
   *
   * @implspec variablepie?: PlotVariablepieOptions;
   *
   */
  @JSProperty("variablepie")
  void setVariablepie(PlotVariablepieOptions value);

  /**
   * (Highcharts) A variwide chart (related to marimekko chart) is a column
   * chart with a variable width expressing a third dimension.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide">https://api.highcharts.com/highcharts/plotOptions.variwide</a>
   *
   * @implspec variwide?: PlotVariwideOptions;
   *
   */
  @JSProperty("variwide")
  @Nullable
  PlotVariwideOptions getVariwide();

  /**
   * (Highcharts) A variwide chart (related to marimekko chart) is a column
   * chart with a variable width expressing a third dimension.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide">https://api.highcharts.com/highcharts/plotOptions.variwide</a>
   *
   * @implspec variwide?: PlotVariwideOptions;
   *
   */
  @JSProperty("variwide")
  void setVariwide(PlotVariwideOptions value);

  /**
   * (Highstock) Volume By Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp">https://api.highcharts.com/highstock/plotOptions.vbp</a>
   *
   * @implspec vbp?: PlotVbpOptions;
   *
   */
  @JSProperty("vbp")
  @Nullable
  PlotVbpOptions getVbp();

  /**
   * (Highstock) Volume By Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp">https://api.highcharts.com/highstock/plotOptions.vbp</a>
   *
   * @implspec vbp?: PlotVbpOptions;
   *
   */
  @JSProperty("vbp")
  void setVbp(PlotVbpOptions value);

  /**
   * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
   * each point has an X and Y position, a length and a direction. Vectors are
   * drawn as arrows.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector">https://api.highcharts.com/highcharts/plotOptions.vector</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector">https://api.highcharts.com/highstock/plotOptions.vector</a>
   *
   * @implspec vector?: PlotVectorOptions;
   *
   */
  @JSProperty("vector")
  @Nullable
  PlotVectorOptions getVector();

  /**
   * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
   * each point has an X and Y position, a length and a direction. Vectors are
   * drawn as arrows.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector">https://api.highcharts.com/highcharts/plotOptions.vector</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector">https://api.highcharts.com/highstock/plotOptions.vector</a>
   *
   * @implspec vector?: PlotVectorOptions;
   *
   */
  @JSProperty("vector")
  void setVector(PlotVectorOptions value);

  /**
   * (Highstock) Volume Weighted Average Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap">https://api.highcharts.com/highstock/plotOptions.vwap</a>
   *
   * @implspec vwap?: PlotVwapOptions;
   *
   */
  @JSProperty("vwap")
  @Nullable
  PlotVwapOptions getVwap();

  /**
   * (Highstock) Volume Weighted Average Price indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap">https://api.highcharts.com/highstock/plotOptions.vwap</a>
   *
   * @implspec vwap?: PlotVwapOptions;
   *
   */
  @JSProperty("vwap")
  void setVwap(PlotVwapOptions value);

  /**
   * (Highcharts) A waterfall chart displays sequentially introduced positive
   * or negative values in cumulative columns.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall">https://api.highcharts.com/highcharts/plotOptions.waterfall</a>
   *
   * @implspec waterfall?: PlotWaterfallOptions;
   *
   */
  @JSProperty("waterfall")
  @Nullable
  PlotWaterfallOptions getWaterfall();

  /**
   * (Highcharts) A waterfall chart displays sequentially introduced positive
   * or negative values in cumulative columns.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall">https://api.highcharts.com/highcharts/plotOptions.waterfall</a>
   *
   * @implspec waterfall?: PlotWaterfallOptions;
   *
   */
  @JSProperty("waterfall")
  void setWaterfall(PlotWaterfallOptions value);

  /**
   * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
   * speed and direction in one graphical form. Wind direction is given by the
   * stem direction, and wind speed by the number and shape of barbs.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb">https://api.highcharts.com/highcharts/plotOptions.windbarb</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb">https://api.highcharts.com/highstock/plotOptions.windbarb</a>
   *
   * @implspec windbarb?: PlotWindbarbOptions;
   *
   */
  @JSProperty("windbarb")
  @Nullable
  PlotWindbarbOptions getWindbarb();

  /**
   * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
   * speed and direction in one graphical form. Wind direction is given by the
   * stem direction, and wind speed by the number and shape of barbs.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb">https://api.highcharts.com/highcharts/plotOptions.windbarb</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb">https://api.highcharts.com/highstock/plotOptions.windbarb</a>
   *
   * @implspec windbarb?: PlotWindbarbOptions;
   *
   */
  @JSProperty("windbarb")
  void setWindbarb(PlotWindbarbOptions value);

  /**
   * (Highstock) Weighted moving average indicator (WMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma">https://api.highcharts.com/highstock/plotOptions.wma</a>
   *
   * @implspec wma?: PlotWmaOptions;
   *
   */
  @JSProperty("wma")
  @Nullable
  PlotWmaOptions getWma();

  /**
   * (Highstock) Weighted moving average indicator (WMA). This series requires
   * <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma">https://api.highcharts.com/highstock/plotOptions.wma</a>
   *
   * @implspec wma?: PlotWmaOptions;
   *
   */
  @JSProperty("wma")
  void setWma(PlotWmaOptions value);

  /**
   * (Highcharts) A word cloud is a visualization of a set of words, where the
   * size and placement of a word is determined by how it is weighted.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud">https://api.highcharts.com/highcharts/plotOptions.wordcloud</a>
   *
   * @implspec wordcloud?: PlotWordcloudOptions;
   *
   */
  @JSProperty("wordcloud")
  @Nullable
  PlotWordcloudOptions getWordcloud();

  /**
   * (Highcharts) A word cloud is a visualization of a set of words, where the
   * size and placement of a word is determined by how it is weighted.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.wordcloud">https://api.highcharts.com/highcharts/plotOptions.wordcloud</a>
   *
   * @implspec wordcloud?: PlotWordcloudOptions;
   *
   */
  @JSProperty("wordcloud")
  void setWordcloud(PlotWordcloudOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
   * X axis, typically time intervals with a start and end date.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange">https://api.highcharts.com/highcharts/plotOptions.xrange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange">https://api.highcharts.com/highstock/plotOptions.xrange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange">https://api.highcharts.com/gantt/plotOptions.xrange</a>
   *
   * @implspec xrange?: PlotXrangeOptions;
   *
   */
  @JSProperty("xrange")
  @Nullable
  PlotXrangeOptions getXrange();

  /**
   * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
   * X axis, typically time intervals with a start and end date.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange">https://api.highcharts.com/highcharts/plotOptions.xrange</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange">https://api.highcharts.com/highstock/plotOptions.xrange</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange">https://api.highcharts.com/gantt/plotOptions.xrange</a>
   *
   * @implspec xrange?: PlotXrangeOptions;
   *
   */
  @JSProperty("xrange")
  void setXrange(PlotXrangeOptions value);

  /**
   * (Highstock) Zig Zag indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag">https://api.highcharts.com/highstock/plotOptions.zigzag</a>
   *
   * @implspec zigzag?: PlotZigzagOptions;
   *
   */
  @JSProperty("zigzag")
  @Nullable
  PlotZigzagOptions getZigzag();

  /**
   * (Highstock) Zig Zag indicator.
   *
   * This series requires <code>linkedTo</code> option to be set.
   *
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
   *
   * </li>
   * </ol>
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag">https://api.highcharts.com/highstock/plotOptions.zigzag</a>
   *
   * @implspec zigzag?: PlotZigzagOptions;
   *
   */
  @JSProperty("zigzag")
  void setZigzag(PlotZigzagOptions value);
}
