package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Determines the width of the ring per level.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize</a>
 *
 */
public interface PlotSunburstLevelSizeOptions extends Any {
  /**
   * (Highcharts) How to interpret <code>levelSize.value</code>.
   *
   * <ul>
   * <li>
   * <code>percentage</code> gives a width relative to result of outer radius minus
   * inner radius.
   *
   * </li>
   * <li>
   * <code>pixels</code> gives the ring a fixed width in pixels.
   *
   * </li>
   * <li>
   * <code>weight</code> takes the remaining width after percentage and pixels, and
   * distributes it accross all &quot;weighted&quot; levels. The value relative to the
   * sum of all weights determines the width.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.unit">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.unit</a>
   *
   * @implspec unit?: (&quot;percentage&quot;|&quot;pixels&quot;|&quot;weight&quot;);
   *
   */
  @JSProperty("unit")
  @Nullable
  Unit getUnit();

  /**
   * (Highcharts) How to interpret <code>levelSize.value</code>.
   *
   * <ul>
   * <li>
   * <code>percentage</code> gives a width relative to result of outer radius minus
   * inner radius.
   *
   * </li>
   * <li>
   * <code>pixels</code> gives the ring a fixed width in pixels.
   *
   * </li>
   * <li>
   * <code>weight</code> takes the remaining width after percentage and pixels, and
   * distributes it accross all &quot;weighted&quot; levels. The value relative to the
   * sum of all weights determines the width.
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.unit">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.unit</a>
   *
   * @implspec unit?: (&quot;percentage&quot;|&quot;pixels&quot;|&quot;weight&quot;);
   *
   */
  @JSProperty("unit")
  void setUnit(Unit value);

  /**
   * (Highcharts) The value used for calculating the width of the ring. Its'
   * affect is determined by <code>levelSize.unit</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.value">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts) The value used for calculating the width of the ring. Its'
   * affect is determined by <code>levelSize.unit</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.value">https://api.highcharts.com/highcharts/plotOptions.sunburst.levelSize.value</a>
   *
   * @implspec value?: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   */
  abstract class Unit extends JsEnum {
    public static final Unit PERCENTAGE = JsEnum.of("percentage");

    public static final Unit PIXELS = JsEnum.of("pixels");

    public static final Unit WEIGHT = JsEnum.of("weight");
  }
}
