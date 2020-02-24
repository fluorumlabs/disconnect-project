package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) The triangular marker on a scalar color axis that
 * points to the value of the hovered area. To disable the marker, set <code>marker: null</code>.
 *
 * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker">https://api.highcharts.com/highcharts/colorAxis.marker</a>
 * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker">https://api.highcharts.com/highmaps/colorAxis.marker</a>
 *
 */
public interface ColorAxisMarkerOptions extends Any {
  /**
   * (Highcharts, Highmaps) Animation for the marker as it moves between
   * values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.animation">https://api.highcharts.com/highcharts/colorAxis.marker.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.animation">https://api.highcharts.com/highmaps/colorAxis.marker.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highmaps) Animation for the marker as it moves between
   * values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.animation">https://api.highcharts.com/highcharts/colorAxis.marker.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.animation">https://api.highcharts.com/highmaps/colorAxis.marker.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highmaps) Animation for the marker as it moves between
   * values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.animation">https://api.highcharts.com/highcharts/colorAxis.marker.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.animation">https://api.highcharts.com/highmaps/colorAxis.marker.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);

  /**
   * (Highcharts, Highmaps) The color of the marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.color">https://api.highcharts.com/highcharts/colorAxis.marker.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.color">https://api.highcharts.com/highmaps/colorAxis.marker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts, Highmaps) The color of the marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.color">https://api.highcharts.com/highcharts/colorAxis.marker.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.color">https://api.highcharts.com/highmaps/colorAxis.marker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts, Highmaps) The color of the marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.color">https://api.highcharts.com/highcharts/colorAxis.marker.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.color">https://api.highcharts.com/highmaps/colorAxis.marker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts, Highmaps) The color of the marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/colorAxis.marker.color">https://api.highcharts.com/highcharts/colorAxis.marker.color</a>
   * @see <a href="https://api.highcharts.com/highmaps/colorAxis.marker.color">https://api.highcharts.com/highmaps/colorAxis.marker.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);
}
