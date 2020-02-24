package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Options to align the element relative to the chart or another box.
 *
 */
public interface AlignObject extends Any {
  /**
   * Horizontal alignment. Can be one of <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  @Nullable
  String getAlign();

  /**
   * Horizontal alignment. Can be one of <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * @implspec align?: string;
   *
   */
  @JSProperty("align")
  void setAlign(String value);

  /**
   * Use the <code>transform</code> attribute with translateX and translateY custom
   * attributes to align this elements rather than <code>x</code> and <code>y</code> attributes.
   *
   * @implspec alignByTranslate?: boolean;
   *
   */
  @JSProperty("alignByTranslate")
  boolean getAlignByTranslate();

  /**
   * Use the <code>transform</code> attribute with translateX and translateY custom
   * attributes to align this elements rather than <code>x</code> and <code>y</code> attributes.
   *
   * @implspec alignByTranslate?: boolean;
   *
   */
  @JSProperty("alignByTranslate")
  void setAlignByTranslate(boolean value);

  /**
   * Vertical alignment. Can be one of <code>top</code>, <code>middle</code> and <code>bottom</code>.
   *
   * @implspec verticalAlign?: string;
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  String getVerticalAlign();

  /**
   * Vertical alignment. Can be one of <code>top</code>, <code>middle</code> and <code>bottom</code>.
   *
   * @implspec verticalAlign?: string;
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(String value);

  /**
   * Horizontal pixel offset from alignment.
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal pixel offset from alignment.
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical pixel offset from alignment.
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical pixel offset from alignment.
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
