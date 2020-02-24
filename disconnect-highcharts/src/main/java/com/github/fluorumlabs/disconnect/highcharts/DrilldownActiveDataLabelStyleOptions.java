package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Additional styles to apply to the data label of a
 * point that has drilldown data. By default it is underlined and blue to invite
 * to interaction.
 *
 * In styled mode, active data label styles can be applied with the
 * <code>.highcharts-drilldown-data-label</code> class.
 *
 * @see <a href="https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle">https://api.highcharts.com/highcharts/drilldown.activeDataLabelStyle</a>
 * @see <a href="https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle">https://api.highcharts.com/highmaps/drilldown.activeDataLabelStyle</a>
 *
 */
public interface DrilldownActiveDataLabelStyleOptions extends Any {
  /**
   * @implspec color?: string;
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * @implspec color?: string;
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  @Nullable
  String getCursor();

  /**
   * @implspec cursor?: string;
   *
   */
  @JSProperty("cursor")
  void setCursor(String value);

  /**
   * @implspec fontWeight?: string;
   *
   */
  @JSProperty("fontWeight")
  @Nullable
  String getFontWeight();

  /**
   * @implspec fontWeight?: string;
   *
   */
  @JSProperty("fontWeight")
  void setFontWeight(String value);

  /**
   * @implspec textDecoration?: string;
   *
   */
  @JSProperty("textDecoration")
  @Nullable
  String getTextDecoration();

  /**
   * @implspec textDecoration?: string;
   *
   */
  @JSProperty("textDecoration")
  void setTextDecoration(String value);
}
