package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Definition for a menu item in the context menu.
 *
 */
public interface ExportingMenuObject extends Any {
  /**
   * The click handler for the menu item.
   *
   * @implspec onclick?: () =&gt; void;
   *
   */
  @JSProperty("onclick")
  @Nullable
  Onclick getOnclick();

  /**
   * The click handler for the menu item.
   *
   * @implspec onclick?: () =&gt; void;
   *
   */
  @JSProperty("onclick")
  void setOnclick(Onclick value);

  /**
   * Indicates a separator line instead of an item.
   *
   * @implspec separator?: boolean;
   *
   */
  @JSProperty("separator")
  boolean getSeparator();

  /**
   * Indicates a separator line instead of an item.
   *
   * @implspec separator?: boolean;
   *
   */
  @JSProperty("separator")
  void setSeparator(boolean value);

  /**
   * The text for the menu item.
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * The text for the menu item.
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);

  /**
   * If internationalization is required, the key to a language string.
   *
   * @implspec textKey?: string;
   *
   */
  @JSProperty("textKey")
  @Nullable
  String getTextKey();

  /**
   * If internationalization is required, the key to a language string.
   *
   * @implspec textKey?: string;
   *
   */
  @JSProperty("textKey")
  void setTextKey(String value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Onclick extends Any {
    void apply();
  }
}
