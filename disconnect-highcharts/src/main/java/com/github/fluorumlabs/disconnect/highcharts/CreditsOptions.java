package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Highchart by default puts a credits label
 * in the lower right corner of the chart. This can be changed using these
 * options.
 *
 * @see <a href="https://api.highcharts.com/highcharts/credits">https://api.highcharts.com/highcharts/credits</a>
 * @see <a href="https://api.highcharts.com/highstock/credits">https://api.highcharts.com/highstock/credits</a>
 * @see <a href="https://api.highcharts.com/highmaps/credits">https://api.highcharts.com/highmaps/credits</a>
 *
 */
public interface CreditsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the credits text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.enabled">https://api.highcharts.com/highcharts/credits.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.enabled">https://api.highcharts.com/highstock/credits.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.enabled">https://api.highcharts.com/highmaps/credits.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the credits text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.enabled">https://api.highcharts.com/highcharts/credits.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.enabled">https://api.highcharts.com/highstock/credits.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.enabled">https://api.highcharts.com/highmaps/credits.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The URL for the credits label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.href">https://api.highcharts.com/highcharts/credits.href</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.href">https://api.highcharts.com/highstock/credits.href</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.href">https://api.highcharts.com/highmaps/credits.href</a>
   *
   * @implspec href?: string;
   *
   */
  @JSProperty("href")
  @Nullable
  String getHref();

  /**
   * (Highcharts, Highstock, Highmaps) The URL for the credits label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.href">https://api.highcharts.com/highcharts/credits.href</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.href">https://api.highcharts.com/highstock/credits.href</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.href">https://api.highcharts.com/highmaps/credits.href</a>
   *
   * @implspec href?: string;
   *
   */
  @JSProperty("href")
  void setHref(String value);

  /**
   * (Highmaps) Credits for map source to be concatenated with conventional
   * credit text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   * @see <a href="https://api.highcharts.com/highmaps/credits.mapText">https://api.highcharts.com/highmaps/credits.mapText</a>
   *
   * @implspec mapText?: string;
   *
   */
  @JSProperty("mapText")
  @Nullable
  String getMapText();

  /**
   * (Highmaps) Credits for map source to be concatenated with conventional
   * credit text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   * @see <a href="https://api.highcharts.com/highmaps/credits.mapText">https://api.highcharts.com/highmaps/credits.mapText</a>
   *
   * @implspec mapText?: string;
   *
   */
  @JSProperty("mapText")
  void setMapText(String value);

  /**
   * (Highmaps) Detailed credits for map source to be displayed on hover of
   * credits text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   * @see <a href="https://api.highcharts.com/highmaps/credits.mapTextFull">https://api.highcharts.com/highmaps/credits.mapTextFull</a>
   *
   * @implspec mapTextFull?: string;
   *
   */
  @JSProperty("mapTextFull")
  @Nullable
  String getMapTextFull();

  /**
   * (Highmaps) Detailed credits for map source to be displayed on hover of
   * credits text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   * @see <a href="https://api.highcharts.com/highmaps/credits.mapTextFull">https://api.highcharts.com/highmaps/credits.mapTextFull</a>
   *
   * @implspec mapTextFull?: string;
   *
   */
  @JSProperty("mapTextFull")
  void setMapTextFull(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Position configuration for the credits
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position">https://api.highcharts.com/highcharts/credits.position</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position">https://api.highcharts.com/highstock/credits.position</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position">https://api.highcharts.com/highmaps/credits.position</a>
   *
   * @implspec position?: CreditsPositionOptions;
   *
   */
  @JSProperty("position")
  @Nullable
  CreditsPositionOptions getPosition();

  /**
   * (Highcharts, Highstock, Highmaps) Position configuration for the credits
   * label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.position">https://api.highcharts.com/highcharts/credits.position</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.position">https://api.highcharts.com/highstock/credits.position</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.position">https://api.highcharts.com/highmaps/credits.position</a>
   *
   * @implspec position?: CreditsPositionOptions;
   *
   */
  @JSProperty("position")
  void setPosition(CreditsPositionOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the credits label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.style">https://api.highcharts.com/highcharts/credits.style</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.style">https://api.highcharts.com/highstock/credits.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.style">https://api.highcharts.com/highmaps/credits.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the credits label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.style">https://api.highcharts.com/highcharts/credits.style</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.style">https://api.highcharts.com/highstock/credits.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.style">https://api.highcharts.com/highmaps/credits.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The text for the credits label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.text">https://api.highcharts.com/highcharts/credits.text</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.text">https://api.highcharts.com/highstock/credits.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.text">https://api.highcharts.com/highmaps/credits.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps) The text for the credits label.
   *
   * @see <a href="https://api.highcharts.com/highcharts/credits.text">https://api.highcharts.com/highcharts/credits.text</a>
   * @see <a href="https://api.highcharts.com/highstock/credits.text">https://api.highcharts.com/highstock/credits.text</a>
   * @see <a href="https://api.highcharts.com/highmaps/credits.text">https://api.highcharts.com/highmaps/credits.text</a>
   *
   * @implspec text?: string;
   *
   */
  @JSProperty("text")
  void setText(String value);
}
