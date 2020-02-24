package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The shadow options.
 *
 */
public interface ShadowOptionsObject extends Any {
  /**
   * The shadow color.
   *
   * @implspec color?: string;
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * The shadow color.
   *
   * @implspec color?: string;
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * The horizontal offset from the element.
   *
   * @implspec offsetX?: number;
   *
   */
  @JSProperty("offsetX")
  double getOffsetX();

  /**
   * The horizontal offset from the element.
   *
   * @implspec offsetX?: number;
   *
   */
  @JSProperty("offsetX")
  void setOffsetX(double value);

  /**
   * The vertical offset from the element.
   *
   * @implspec offsetY?: number;
   *
   */
  @JSProperty("offsetY")
  double getOffsetY();

  /**
   * The vertical offset from the element.
   *
   * @implspec offsetY?: number;
   *
   */
  @JSProperty("offsetY")
  void setOffsetY(double value);

  /**
   * The shadow opacity.
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * The shadow opacity.
   *
   * @implspec opacity?: number;
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * The shadow width or distance from the element.
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * The shadow width or distance from the element.
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);
}
