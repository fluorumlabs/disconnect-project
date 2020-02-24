package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import js.util.collections.Array;
import com.github.fluorumlabs.disconnect.types.DoubleKeyStringValue;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Gradient options instead of a solid color.
 *
 */
public interface GradientColorObject extends Any {
  /**
   * Holds an object that defines the start position and the end position
   * relative to the shape.
   *
   * @implspec linearGradient?: LinearGradientColorObject;
   *
   */
  @JSProperty("linearGradient")
  @Nullable
  LinearGradientColorObject getLinearGradient();

  /**
   * Holds an object that defines the start position and the end position
   * relative to the shape.
   *
   * @implspec linearGradient?: LinearGradientColorObject;
   *
   */
  @JSProperty("linearGradient")
  void setLinearGradient(LinearGradientColorObject value);

  /**
   * Holds an object that defines the center position and the radius.
   *
   * @implspec radialGradient?: RadialGradientColorObject;
   *
   */
  @JSProperty("radialGradient")
  @Nullable
  RadialGradientColorObject getRadialGradient();

  /**
   * Holds an object that defines the center position and the radius.
   *
   * @implspec radialGradient?: RadialGradientColorObject;
   *
   */
  @JSProperty("radialGradient")
  void setRadialGradient(RadialGradientColorObject value);

  /**
   * The first item in each tuple is the position in the gradient, where 0 is
   * the start of the gradient and 1 is the end of the gradient. Multiple
   * stops can be applied. The second item is the color for each stop. This
   * color can also be given in the rgba format.
   *
   * @implspec stops?: Array&lt;[number, ColorString]&gt;;
   *
   */
  @JSProperty("stops")
  @Nullable
  Array<DoubleKeyStringValue> getStops();

  /**
   * The first item in each tuple is the position in the gradient, where 0 is
   * the start of the gradient and 1 is the end of the gradient. Multiple
   * stops can be applied. The second item is the color for each stop. This
   * color can also be given in the rgba format.
   *
   * @implspec stops?: Array&lt;[number, ColorString]&gt;;
   *
   */
  @JSProperty("stops")
  void setStops(Array<DoubleKeyStringValue> value);
}
