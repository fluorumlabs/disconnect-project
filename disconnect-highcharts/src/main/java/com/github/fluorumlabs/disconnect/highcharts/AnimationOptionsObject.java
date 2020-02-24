package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * An animation configuration. Animation configurations can also be defined as
 * booleans, where <code>false</code> turns off animation and <code>true</code> defaults to a duration
 * of 500ms.
 *
 */
public interface AnimationOptionsObject extends Any {
  /**
   * A callback function to exectute when the animation finishes.
   *
   * @implspec complete?: () =&gt; void;
   *
   */
  @JSProperty("complete")
  @Nullable
  Complete getComplete();

  /**
   * A callback function to exectute when the animation finishes.
   *
   * @implspec complete?: () =&gt; void;
   *
   */
  @JSProperty("complete")
  void setComplete(Complete value);

  /**
   * The animation duration in milliseconds.
   *
   * @implspec duration: number;
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * The animation duration in milliseconds.
   *
   * @implspec duration: number;
   *
   */
  @JSProperty("duration")
  void setDuration(double value);

  /**
   * The name of an easing function as defined on the <code>Math</code> object.
   *
   * @implspec easing?: string;
   *
   */
  @JSProperty("easing")
  @Nullable
  String getEasing();

  /**
   * The name of an easing function as defined on the <code>Math</code> object.
   *
   * @implspec easing?: string;
   *
   */
  @JSProperty("easing")
  void setEasing(String value);

  /**
   * A callback function to execute on each step of each attribute or CSS
   * property that's being animated. The first argument contains information
   * about the animation and progress.
   *
   * @implspec step?: () =&gt; void;
   *
   */
  @JSProperty("step")
  @Nullable
  Step getStep();

  /**
   * A callback function to execute on each step of each attribute or CSS
   * property that's being animated. The first argument contains information
   * about the animation and progress.
   *
   * @implspec step?: () =&gt; void;
   *
   */
  @JSProperty("step")
  void setStep(Step value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Complete extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Step extends Any {
    void apply();
  }
}
