package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Contains common information for a drag event on series points.
 *
 */
public interface SeriesPointDragEventObject extends Any {
  /**
   * New points during drag.
   *
   * @implspec newPoints: Dictionary<SeriesPointDragPointObject>;
   *
   */
  @JSProperty("newPoints")
  Dictionary<SeriesPointDragPointObject> getNewPoints();

  /**
   * New points during drag.
   *
   * @implspec newPoints: Dictionary<SeriesPointDragPointObject>;
   *
   */
  @JSProperty("newPoints")
  void setNewPoints(Dictionary<SeriesPointDragPointObject> value);

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
   * Prevent default drag action.
   *
   * @implspec preventDefault: () =&gt; void;
   *
   */
  @JSProperty("preventDefault")
  PreventDefault getPreventDefault();

  /**
   * Prevent default drag action.
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
   * @implspec type: &quot;drag&quot;;
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * Event type.
   *
   * @implspec type: &quot;drag&quot;;
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
    public static final Type DRAG = JsEnum.of("drag");
  }
}
