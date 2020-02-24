package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Event information regarding check of a series box.
 *
 */
public interface SeriesCheckboxClickEventObject extends Any {
  /**
   * Whether the box has been checked.
   *
   * @implspec checked: boolean;
   *
   */
  @JSProperty("checked")
  boolean getChecked();

  /**
   * Whether the box has been checked.
   *
   * @implspec checked: boolean;
   *
   */
  @JSProperty("checked")
  void setChecked(boolean value);

  /**
   * Related series.
   *
   * @implspec item: Series;
   *
   */
  @JSProperty("item")
  Series getItem();

  /**
   * Related series.
   *
   * @implspec item: Series;
   *
   */
  @JSProperty("item")
  void setItem(Series value);

  /**
   * Related series.
   *
   * @implspec target: Series;
   *
   */
  @JSProperty("target")
  Series getTarget();

  /**
   * Related series.
   *
   * @implspec target: Series;
   *
   */
  @JSProperty("target")
  void setTarget(Series value);

  /**
   * Event type.
   *
   * @implspec type: &quot;checkboxClick&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * Event type.
   *
   * @implspec type: &quot;checkboxClick&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type CHECKBOXCLICK = JsEnum.of("checkboxClick");
  }
}
