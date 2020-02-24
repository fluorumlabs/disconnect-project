package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface YAxisDateTimeLabelFormatsWeekOptions extends Any {
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
}
