package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;

/**
 */
public abstract class Operator extends JsEnum {
  public static final Operator EQUALS = JsEnum.of("==");

  public static final Operator STRICT_EQUALS = JsEnum.of("===");

  public static final Operator GREATER_THAN = JsEnum.of(">");

  public static final Operator GREATER_OR_EQUAL = JsEnum.of(">=");

  public static final Operator LESS_THAN = JsEnum.of("<");

  public static final Operator LESS_OR_EQUAL = JsEnum.of("<=");
}
