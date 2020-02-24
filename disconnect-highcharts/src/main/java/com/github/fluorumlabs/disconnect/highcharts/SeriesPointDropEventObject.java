package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Contains common information for a drop event on series points.
 *
 */
public interface SeriesPointDropEventObject extends Any {
  /**
   * New points after drop.
   *
   * @implspec newPoints: Dictionary<SeriesPointDropPointObject>;
   *
   */
  @JSProperty("newPoints")
  Dictionary<SeriesPointDropPointObject> getNewPoints();

  /**
   * New points after drop.
   *
   * @implspec newPoints: Dictionary<SeriesPointDropPointObject>;
   *
   */
  @JSProperty("newPoints")
  void setNewPoints(Dictionary<SeriesPointDropPointObject> value);

  /**
   * Number of new points.
   *
   * @implspec numNewPoints: number;
   *
   */
  @JSProperty("numNewPoints")
  double getNumNewPoints();

  /**
   * Number of new points.
   *
   * @implspec numNewPoints: number;
   *
   */
  @JSProperty("numNewPoints")
  void setNumNewPoints(double value);

  /**
   * Original data.
   *
   * @implspec origin: object;
   *
   */
  @JSProperty("origin")
  Any getOrigin();

  /**
   * Original data.
   *
   * @implspec origin: object;
   *
   */
  @JSProperty("origin")
  void setOrigin(Any value);

  /**
   * Prevent default drop action.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  PreventDefault getPreventDefault();

  /**
   * Prevent default drop action.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  void setPreventDefault(PreventDefault value);

  /**
   * Target point that caused the event.
   *
   * @implspec target: Point;
   *
   */
  @JSProperty("target")
  Point getTarget();

  /**
   * Target point that caused the event.
   *
   * @implspec target: Point;
   *
   */
  @JSProperty("target")
  void setTarget(Point value);

  /**
   * Event type.
   *
   * @implspec type: &quot;drop&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * Event type.
   *
   * @implspec type: &quot;drop&quot;;
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PreventDefault extends Any {
    void apply();
  }

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type DROP = JsEnum.of("drop");
  }
}
