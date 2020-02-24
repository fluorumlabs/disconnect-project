package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface YAxisDateTimeLabelFormatsMinuteOptions extends Any {
  /**
   * @implspec main?: string;
   *
   */
  @JSProperty("main")
  @Nullable
  String getMain();

  /**
   * @implspec main?: string;
   *
   */
  @JSProperty("main")
  void setMain(String value);

  /**
   * @implspec range?: boolean;
   *
   */
  @JSProperty("range")
  boolean getRange();

  /**
   * @implspec range?: boolean;
   *
   */
  @JSProperty("range")
  void setRange(boolean value);
}
