package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Additional options, depending on the actual symbol drawn.
 *
 */
public interface SymbolOptionsObject extends Any {
  /**
   * The anchor X position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   * @implspec anchorX: number;
   *
   */
  @JSProperty("anchorX")
  double getAnchorX();

  /**
   * The anchor X position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   * @implspec anchorX: number;
   *
   */
  @JSProperty("anchorX")
  void setAnchorX(double value);

  /**
   * The anchor Y position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   * @implspec anchorY: number;
   *
   */
  @JSProperty("anchorY")
  double getAnchorY();

  /**
   * The anchor Y position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   * @implspec anchorY: number;
   *
   */
  @JSProperty("anchorY")
  void setAnchorY(double value);

  /**
   * The end angle of an <code>arc</code> symbol.
   *
   * @implspec end: number;
   *
   */
  @JSProperty("end")
  double getEnd();

  /**
   * The end angle of an <code>arc</code> symbol.
   *
   * @implspec end: number;
   *
   */
  @JSProperty("end")
  void setEnd(double value);

  /**
   * Whether to draw <code>arc</code> symbol open or closed.
   *
   * @implspec open: boolean;
   *
   */
  @JSProperty("open")
  boolean getOpen();

  /**
   * Whether to draw <code>arc</code> symbol open or closed.
   *
   * @implspec open: boolean;
   *
   */
  @JSProperty("open")
  void setOpen(boolean value);

  /**
   * The radius of an <code>arc</code> symbol, or the border radius for the <code>callout</code>
   * symbol.
   *
   * @implspec r: number;
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * The radius of an <code>arc</code> symbol, or the border radius for the <code>callout</code>
   * symbol.
   *
   * @implspec r: number;
   *
   */
  @JSProperty("r")
  void setR(double value);

  /**
   * Whether to draw rounded edges.
   *
   * @implspec rounded?: boolean;
   *
   */
  @JSProperty("rounded")
  boolean getRounded();

  /**
   * Whether to draw rounded edges.
   *
   * @implspec rounded?: boolean;
   *
   */
  @JSProperty("rounded")
  void setRounded(boolean value);

  /**
   * The start angle of an <code>arc</code> symbol.
   *
   * @implspec start: number;
   *
   */
  @JSProperty("start")
  double getStart();

  /**
   * The start angle of an <code>arc</code> symbol.
   *
   * @implspec start: number;
   *
   */
  @JSProperty("start")
  void setStart(double value);
}
