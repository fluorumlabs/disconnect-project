package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;

/**
 * Can be one of <code>arc</code>, <code>callout</code>, <code>circle</code>, <code>diamond</code>, <code>square</code>, <code>triangle</code>,
 * <code>triangle-down</code>. Symbols are used internally for point markers, button and
 * label borders and backgrounds, or custom shapes. Extendable by adding to
 * SVGRenderer#symbols.
 *
 */
public abstract class SymbolKey extends JsEnum {
  public static final SymbolKey ARC = JsEnum.of("arc");

  public static final SymbolKey CALLOUT = JsEnum.of("callout");

  public static final SymbolKey CIRCLE = JsEnum.of("circle");

  public static final SymbolKey DIAMOND = JsEnum.of("diamond");

  public static final SymbolKey SQUARE = JsEnum.of("square");

  public static final SymbolKey TRIANGLE = JsEnum.of("triangle");

  public static final SymbolKey TRIANGLE_DOWN = JsEnum.of("triangle-down");
}
