package com.github.fluorumlabs.disconnect.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.StringRecord;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps) Options for the tooltip that appears when
 * the user hovers over a series or point.
 *
 * @see <a href="https://api.highcharts.com/highcharts/tooltip">https://api.highcharts.com/highcharts/tooltip</a>
 * @see <a href="https://api.highcharts.com/highstock/tooltip">https://api.highcharts.com/highstock/tooltip</a>
 * @see <a href="https://api.highcharts.com/highmaps/tooltip">https://api.highcharts.com/highmaps/tooltip</a>
 *
 */
public interface TooltipOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable animation of the
   * tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.animation">https://api.highcharts.com/highcharts/tooltip.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.animation">https://api.highcharts.com/highstock/tooltip.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.animation">https://api.highcharts.com/highmaps/tooltip.animation</a>
   *
   * @implspec animation?: boolean;
   *
   */
  @JSProperty("animation")
  boolean getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable animation of the
   * tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.animation">https://api.highcharts.com/highcharts/tooltip.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.animation">https://api.highcharts.com/highstock/tooltip.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.animation">https://api.highcharts.com/highmaps/tooltip.animation</a>
   *
   * @implspec animation?: boolean;
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.backgroundColor">https://api.highcharts.com/highcharts/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.backgroundColor">https://api.highcharts.com/highstock/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.backgroundColor">https://api.highcharts.com/highmaps/tooltip.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.backgroundColor">https://api.highcharts.com/highcharts/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.backgroundColor">https://api.highcharts.com/highstock/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.backgroundColor">https://api.highcharts.com/highmaps/tooltip.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.backgroundColor">https://api.highcharts.com/highcharts/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.backgroundColor">https://api.highcharts.com/highstock/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.backgroundColor">https://api.highcharts.com/highmaps/tooltip.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color or gradient for
   * the tooltip.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.backgroundColor">https://api.highcharts.com/highcharts/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.backgroundColor">https://api.highcharts.com/highstock/tooltip.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.backgroundColor">https://api.highcharts.com/highmaps/tooltip.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the tooltip border. When
   * <code>undefined</code>, the border takes the color of the corresponding series or
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.borderColor">https://api.highcharts.com/highcharts/tooltip.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.borderColor">https://api.highcharts.com/highstock/tooltip.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.borderColor">https://api.highcharts.com/highmaps/tooltip.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the tooltip border. When
   * <code>undefined</code>, the border takes the color of the corresponding series or
   * point.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.borderColor">https://api.highcharts.com/highcharts/tooltip.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.borderColor">https://api.highcharts.com/highstock/tooltip.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.borderColor">https://api.highcharts.com/highmaps/tooltip.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the rounded border
   * corners.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.borderRadius">https://api.highcharts.com/highcharts/tooltip.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.borderRadius">https://api.highcharts.com/highstock/tooltip.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.borderRadius">https://api.highcharts.com/highmaps/tooltip.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The radius of the rounded border
   * corners.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.borderRadius">https://api.highcharts.com/highcharts/tooltip.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.borderRadius">https://api.highcharts.com/highstock/tooltip.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.borderRadius">https://api.highcharts.com/highmaps/tooltip.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the tooltip border.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.borderWidth">https://api.highcharts.com/highcharts/tooltip.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.borderWidth">https://api.highcharts.com/highstock/tooltip.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.borderWidth">https://api.highcharts.com/highmaps/tooltip.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the tooltip border.
   *
   * In styled mode, the stroke width is set in the <code>.highcharts-tooltip-box</code>
   * class.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.borderWidth">https://api.highcharts.com/highcharts/tooltip.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.borderWidth">https://api.highcharts.com/highstock/tooltip.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.borderWidth">https://api.highcharts.com/highmaps/tooltip.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highstock) How many decimals to show for the <code>point.change</code> value when
   * the <code>series.compare</code> option is set. This is overridable in each series'
   * tooltip options object. The default is to preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highstock/tooltip.changeDecimals">https://api.highcharts.com/highstock/tooltip.changeDecimals</a>
   *
   * @implspec changeDecimals?: number;
   *
   */
  @JSProperty("changeDecimals")
  double getChangeDecimals();

  /**
   * (Highstock) How many decimals to show for the <code>point.change</code> value when
   * the <code>series.compare</code> option is set. This is overridable in each series'
   * tooltip options object. The default is to preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highstock/tooltip.changeDecimals">https://api.highcharts.com/highstock/tooltip.changeDecimals</a>
   *
   * @implspec changeDecimals?: number;
   *
   */
  @JSProperty("changeDecimals")
  void setChangeDecimals(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Since 4.1, the crosshair definitions
   * are moved to the Axis object in order for a better separation from the
   * tooltip. See xAxis.crosshair(see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.crosshairs">https://api.highcharts.com/highcharts/tooltip.crosshairs</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.crosshairs">https://api.highcharts.com/highstock/tooltip.crosshairs</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.crosshairs">https://api.highcharts.com/highmaps/tooltip.crosshairs</a>
   *
   * @implspec crosshairs?: any;
   *
   */
  @JSProperty("crosshairs")
  @Nullable
  Any getCrosshairs();

  /**
   * (Highcharts, Highstock, Highmaps) Since 4.1, the crosshair definitions
   * are moved to the Axis object in order for a better separation from the
   * tooltip. See xAxis.crosshair(see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.crosshairs">https://api.highcharts.com/highcharts/tooltip.crosshairs</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.crosshairs">https://api.highcharts.com/highstock/tooltip.crosshairs</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.crosshairs">https://api.highcharts.com/highmaps/tooltip.crosshairs</a>
   *
   * @implspec crosshairs?: any;
   *
   */
  @JSProperty("crosshairs")
  void setCrosshairs(Any value);

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/tooltip.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: (TooltipDateTimeLabelFormatsOptions|Dictionary<string>);
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  Unknown getDateTimeLabelFormats();

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/tooltip.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: (TooltipDateTimeLabelFormatsOptions|Dictionary<string>);
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(StringRecord value);

  /**
   * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
   * format in the tooltip's header will by default be guessed based on the
   * closest data points. This member gives the default string representations
   * used for each unit. For an overview of the replacement codes, see
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.dateTimeLabelFormats">https://api.highcharts.com/highcharts/tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.dateTimeLabelFormats">https://api.highcharts.com/highstock/tooltip.dateTimeLabelFormats</a>
   * @see <a href="https://api.highcharts.com/gantt/tooltip.dateTimeLabelFormats">https://api.highcharts.com/gantt/tooltip.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: (TooltipDateTimeLabelFormatsOptions|Dictionary<string>);
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(TooltipDateTimeLabelFormatsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.enabled">https://api.highcharts.com/highcharts/tooltip.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.enabled">https://api.highcharts.com/highstock/tooltip.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.enabled">https://api.highcharts.com/highmaps/tooltip.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.enabled">https://api.highcharts.com/highcharts/tooltip.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.enabled">https://api.highcharts.com/highstock/tooltip.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.enabled">https://api.highcharts.com/highmaps/tooltip.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether the tooltip should follow the
   * mouse as it moves across columns, pie slices and other point types with
   * an extent. By default it behaves this way for scatter, bubble and pie
   * series by override in the <code>plotOptions</code> for those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.followPointer">https://api.highcharts.com/highcharts/tooltip.followPointer</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.followPointer">https://api.highcharts.com/highstock/tooltip.followPointer</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.followPointer">https://api.highcharts.com/highmaps/tooltip.followPointer</a>
   *
   * @implspec followPointer?: boolean;
   *
   */
  @JSProperty("followPointer")
  boolean getFollowPointer();

  /**
   * (Highcharts, Highstock, Highmaps) Whether the tooltip should follow the
   * mouse as it moves across columns, pie slices and other point types with
   * an extent. By default it behaves this way for scatter, bubble and pie
   * series by override in the <code>plotOptions</code> for those series types.
   *
   * For touch moves to behave the same way, followTouchMove must be <code>true</code>
   * also.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.followPointer">https://api.highcharts.com/highcharts/tooltip.followPointer</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.followPointer">https://api.highcharts.com/highstock/tooltip.followPointer</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.followPointer">https://api.highcharts.com/highmaps/tooltip.followPointer</a>
   *
   * @implspec followPointer?: boolean;
   *
   */
  @JSProperty("followPointer")
  void setFollowPointer(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether the tooltip should update as
   * the finger moves on a touch device. If this is <code>true</code> and chart.panning
   * is set,<code>followTouchMove</code> will take over one-finger touches, so the user
   * needs to use two fingers for zooming and panning.
   *
   * Note the difference to followPointer that only defines the <em>position</em> of
   * the tooltip. If <code>followPointer</code> is false in for example a column series,
   * the tooltip will show above or below the column, but as <code>followTouchMove</code>
   * is true, the tooltip will jump from column to column as the user swipes
   * across the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.followTouchMove">https://api.highcharts.com/highcharts/tooltip.followTouchMove</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.followTouchMove">https://api.highcharts.com/highstock/tooltip.followTouchMove</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.followTouchMove">https://api.highcharts.com/highmaps/tooltip.followTouchMove</a>
   *
   * @implspec followTouchMove?: boolean;
   *
   */
  @JSProperty("followTouchMove")
  boolean getFollowTouchMove();

  /**
   * (Highcharts, Highstock, Highmaps) Whether the tooltip should update as
   * the finger moves on a touch device. If this is <code>true</code> and chart.panning
   * is set,<code>followTouchMove</code> will take over one-finger touches, so the user
   * needs to use two fingers for zooming and panning.
   *
   * Note the difference to followPointer that only defines the <em>position</em> of
   * the tooltip. If <code>followPointer</code> is false in for example a column series,
   * the tooltip will show above or below the column, but as <code>followTouchMove</code>
   * is true, the tooltip will jump from column to column as the user swipes
   * across the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.followTouchMove">https://api.highcharts.com/highcharts/tooltip.followTouchMove</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.followTouchMove">https://api.highcharts.com/highstock/tooltip.followTouchMove</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.followTouchMove">https://api.highcharts.com/highmaps/tooltip.followTouchMove</a>
   *
   * @implspec followTouchMove?: boolean;
   *
   */
  @JSProperty("followTouchMove")
  void setFollowTouchMove(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) A string to append to the tooltip
   * format.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.footerFormat">https://api.highcharts.com/highcharts/tooltip.footerFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.footerFormat">https://api.highcharts.com/highstock/tooltip.footerFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.footerFormat">https://api.highcharts.com/highmaps/tooltip.footerFormat</a>
   *
   * @implspec footerFormat?: string;
   *
   */
  @JSProperty("footerFormat")
  @Nullable
  String getFooterFormat();

  /**
   * (Highcharts, Highstock, Highmaps) A string to append to the tooltip
   * format.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.footerFormat">https://api.highcharts.com/highcharts/tooltip.footerFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.footerFormat">https://api.highcharts.com/highstock/tooltip.footerFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.footerFormat">https://api.highcharts.com/highmaps/tooltip.footerFormat</a>
   *
   * @implspec footerFormat?: string;
   *
   */
  @JSProperty("footerFormat")
  void setFooterFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Callback function to format the text of
   * the tooltip from scratch. Return <code>false</code> to disable tooltip for a
   * specific point on series.
   *
   * A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of the
   * tooltip is parsed and converted to SVG, therefore this isn't a complete
   * HTML renderer. The following tags are supported: <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>,
   * <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code>
   * attribute, but only text-related CSS that is shared with SVG is handled.
   *
   * Since version 2.1 the tooltip can be shared between multiple series
   * through the <code>shared</code> option. The available data in the formatter differ a
   * bit depending on whether the tooltip is shared or not. In a shared
   * tooltip, all properties except <code>x</code>, which is common for all points, are
   * kept in an array, <code>this.points</code>.
   *
   * Available data are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.formatter">https://api.highcharts.com/highcharts/tooltip.formatter</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.formatter">https://api.highcharts.com/highstock/tooltip.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.formatter">https://api.highcharts.com/highmaps/tooltip.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<TooltipFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<TooltipFormatterContextObject> getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Callback function to format the text of
   * the tooltip from scratch. Return <code>false</code> to disable tooltip for a
   * specific point on series.
   *
   * A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of the
   * tooltip is parsed and converted to SVG, therefore this isn't a complete
   * HTML renderer. The following tags are supported: <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>,
   * <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code>
   * attribute, but only text-related CSS that is shared with SVG is handled.
   *
   * Since version 2.1 the tooltip can be shared between multiple series
   * through the <code>shared</code> option. The available data in the formatter differ a
   * bit depending on whether the tooltip is shared or not. In a shared
   * tooltip, all properties except <code>x</code>, which is common for all points, are
   * kept in an array, <code>this.points</code>.
   *
   * Available data are:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.formatter">https://api.highcharts.com/highcharts/tooltip.formatter</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.formatter">https://api.highcharts.com/highstock/tooltip.formatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.formatter">https://api.highcharts.com/highmaps/tooltip.formatter</a>
   *
   * @implspec formatter?: FormatterCallbackFunction<TooltipFormatterContextObject>;
   *
   */
  @JSProperty("formatter")
  void setFormatter(FormatterCallbackFunction<TooltipFormatterContextObject> value);

  /**
   * (Highcharts, Highstock, Highmaps) The HTML of the tooltip header line.
   * Variables are enclosed by curly brackets. Available variables are
   * <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the
   * <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the
   * category name, x value or datetime string depending on the type of axis.
   * For datetime axes, the <code>point.key</code> date format can be set using
   * <code>tooltip.xDateFormat</code>. To access the original point use <code>point.point</code>.
   *
   * Set an empty string to avoid header on a shared or split tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.headerFormat">https://api.highcharts.com/highcharts/tooltip.headerFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.headerFormat">https://api.highcharts.com/highstock/tooltip.headerFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.headerFormat">https://api.highcharts.com/highmaps/tooltip.headerFormat</a>
   *
   * @implspec headerFormat?: string;
   *
   */
  @JSProperty("headerFormat")
  @Nullable
  String getHeaderFormat();

  /**
   * (Highcharts, Highstock, Highmaps) The HTML of the tooltip header line.
   * Variables are enclosed by curly brackets. Available variables are
   * <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the
   * <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the
   * category name, x value or datetime string depending on the type of axis.
   * For datetime axes, the <code>point.key</code> date format can be set using
   * <code>tooltip.xDateFormat</code>. To access the original point use <code>point.point</code>.
   *
   * Set an empty string to avoid header on a shared or split tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.headerFormat">https://api.highcharts.com/highcharts/tooltip.headerFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.headerFormat">https://api.highcharts.com/highstock/tooltip.headerFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.headerFormat">https://api.highcharts.com/highmaps/tooltip.headerFormat</a>
   *
   * @implspec headerFormat?: string;
   *
   */
  @JSProperty("headerFormat")
  void setHeaderFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The number of milliseconds to wait
   * until the tooltip is hidden when mouse out from a point or chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.hideDelay">https://api.highcharts.com/highcharts/tooltip.hideDelay</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.hideDelay">https://api.highcharts.com/highstock/tooltip.hideDelay</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.hideDelay">https://api.highcharts.com/highmaps/tooltip.hideDelay</a>
   *
   * @implspec hideDelay?: number;
   *
   */
  @JSProperty("hideDelay")
  double getHideDelay();

  /**
   * (Highcharts, Highstock, Highmaps) The number of milliseconds to wait
   * until the tooltip is hidden when mouse out from a point or chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.hideDelay">https://api.highcharts.com/highcharts/tooltip.hideDelay</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.hideDelay">https://api.highcharts.com/highstock/tooltip.hideDelay</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.hideDelay">https://api.highcharts.com/highmaps/tooltip.hideDelay</a>
   *
   * @implspec hideDelay?: number;
   *
   */
  @JSProperty("hideDelay")
  void setHideDelay(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow the tooltip to render
   * outside the chart's SVG element box. By default (<code>false</code>), the tooltip is
   * rendered within the chart's SVG element, which results in the tooltip
   * being aligned inside the chart area. For small charts, this may result in
   * clipping or overlapping. When <code>true</code>, a separate SVG element is created
   * and overlaid on the page, allowing the tooltip to be aligned inside the
   * page itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.outside">https://api.highcharts.com/highcharts/tooltip.outside</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.outside">https://api.highcharts.com/highstock/tooltip.outside</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.outside">https://api.highcharts.com/highmaps/tooltip.outside</a>
   *
   * @implspec outside?: boolean;
   *
   */
  @JSProperty("outside")
  boolean getOutside();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow the tooltip to render
   * outside the chart's SVG element box. By default (<code>false</code>), the tooltip is
   * rendered within the chart's SVG element, which results in the tooltip
   * being aligned inside the chart area. For small charts, this may result in
   * clipping or overlapping. When <code>true</code>, a separate SVG element is created
   * and overlaid on the page, allowing the tooltip to be aligned inside the
   * page itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.outside">https://api.highcharts.com/highcharts/tooltip.outside</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.outside">https://api.highcharts.com/highstock/tooltip.outside</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.outside">https://api.highcharts.com/highmaps/tooltip.outside</a>
   *
   * @implspec outside?: boolean;
   *
   */
  @JSProperty("outside")
  void setOutside(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Padding inside the tooltip, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.padding">https://api.highcharts.com/highcharts/tooltip.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.padding">https://api.highcharts.com/highstock/tooltip.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.padding">https://api.highcharts.com/highmaps/tooltip.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps) Padding inside the tooltip, in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.padding">https://api.highcharts.com/highcharts/tooltip.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.padding">https://api.highcharts.com/highstock/tooltip.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.padding">https://api.highcharts.com/highmaps/tooltip.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The HTML of the point's line in the
   * tooltip. Variables are enclosed by curly brackets. Available variables
   * are point.x, point.y, series. name and series.color and other properties
   * on the same form. Furthermore, <code>point.y</code> can be extended by the
   * <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also
   * be overridden for each series, which makes it a good hook for displaying
   * units.
   *
   * Set an empty string to leave out a series from a shared or split tooltip.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.pointFormat">https://api.highcharts.com/highcharts/tooltip.pointFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">https://api.highcharts.com/highstock/tooltip.pointFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.pointFormat">https://api.highcharts.com/highmaps/tooltip.pointFormat</a>
   *
   * @implspec pointFormat?: string;
   *
   */
  @JSProperty("pointFormat")
  @Nullable
  String getPointFormat();

  /**
   * (Highcharts, Highstock, Highmaps) The HTML of the point's line in the
   * tooltip. Variables are enclosed by curly brackets. Available variables
   * are point.x, point.y, series. name and series.color and other properties
   * on the same form. Furthermore, <code>point.y</code> can be extended by the
   * <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also
   * be overridden for each series, which makes it a good hook for displaying
   * units.
   *
   * Set an empty string to leave out a series from a shared or split tooltip.
   *
   * In styled mode, the dot is colored by a class name rather than the point
   * color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.pointFormat">https://api.highcharts.com/highcharts/tooltip.pointFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">https://api.highcharts.com/highstock/tooltip.pointFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.pointFormat">https://api.highcharts.com/highmaps/tooltip.pointFormat</a>
   *
   * @implspec pointFormat?: string;
   *
   */
  @JSProperty("pointFormat")
  void setPointFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A callback function for formatting the
   * HTML output for a single point in the tooltip. Like the <code>pointFormat</code>
   * string, but with more flexibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.pointFormatter">https://api.highcharts.com/highcharts/tooltip.pointFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.pointFormatter">https://api.highcharts.com/highstock/tooltip.pointFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.pointFormatter">https://api.highcharts.com/highmaps/tooltip.pointFormatter</a>
   *
   * @implspec pointFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointFormatter")
  @Nullable
  PointFormatter getPointFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function for formatting the
   * HTML output for a single point in the tooltip. Like the <code>pointFormat</code>
   * string, but with more flexibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.pointFormatter">https://api.highcharts.com/highcharts/tooltip.pointFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.pointFormatter">https://api.highcharts.com/highstock/tooltip.pointFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.pointFormatter">https://api.highcharts.com/highmaps/tooltip.pointFormatter</a>
   *
   * @implspec pointFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointFormatter")
  void setPointFormatter(PointFormatter value);

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to place the
   * tooltip in a default position. The callback receives three parameters:
   * <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for
   * <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot
   * area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full
   * coordinates.
   *
   * The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.positioner">https://api.highcharts.com/highcharts/tooltip.positioner</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.positioner">https://api.highcharts.com/highstock/tooltip.positioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.positioner">https://api.highcharts.com/highmaps/tooltip.positioner</a>
   *
   * @implspec positioner?: () =&gt; void;
   *
   */
  @JSProperty("positioner")
  @Nullable
  Positioner getPositioner();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to place the
   * tooltip in a default position. The callback receives three parameters:
   * <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for
   * <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot
   * area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full
   * coordinates.
   *
   * The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.positioner">https://api.highcharts.com/highcharts/tooltip.positioner</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.positioner">https://api.highcharts.com/highstock/tooltip.positioner</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.positioner">https://api.highcharts.com/highmaps/tooltip.positioner</a>
   *
   * @implspec positioner?: () =&gt; void;
   *
   */
  @JSProperty("positioner")
  void setPositioner(Positioner value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.shadow">https://api.highcharts.com/highcharts/tooltip.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.shadow">https://api.highcharts.com/highstock/tooltip.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.shadow">https://api.highcharts.com/highmaps/tooltip.shadow</a>
   *
   * @implspec shadow?: boolean;
   *
   */
  @JSProperty("shadow")
  boolean getShadow();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * tooltip.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.shadow">https://api.highcharts.com/highcharts/tooltip.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.shadow">https://api.highcharts.com/highstock/tooltip.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.shadow">https://api.highcharts.com/highmaps/tooltip.shadow</a>
   *
   * @implspec shadow?: boolean;
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The name of a symbol to use for the
   * border around the tooltip. Can be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code> or
   * <code>&quot;square&quot;</code>.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
   * series.marker.symbol.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.shape">https://api.highcharts.com/highcharts/tooltip.shape</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.shape">https://api.highcharts.com/highstock/tooltip.shape</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.shape">https://api.highcharts.com/highmaps/tooltip.shape</a>
   *
   * @implspec shape?: (&quot;callout&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("shape")
  @Nullable
  Shape getShape();

  /**
   * (Highcharts, Highstock, Highmaps) The name of a symbol to use for the
   * border around the tooltip. Can be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code> or
   * <code>&quot;square&quot;</code>.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
   * series.marker.symbol.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.shape">https://api.highcharts.com/highcharts/tooltip.shape</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.shape">https://api.highcharts.com/highstock/tooltip.shape</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.shape">https://api.highcharts.com/highmaps/tooltip.shape</a>
   *
   * @implspec shape?: (&quot;callout&quot;|&quot;square&quot;);
   *
   */
  @JSProperty("shape")
  void setShape(Shape value);

  /**
   * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
   * will capture mouse movement or touch events. Tooltip texts for series
   * types with ordered data (not pie, scatter, flags etc) will be shown in a
   * single bubble. This is recommended for single series charts and for
   * tablet/mobile optimized charts.
   *
   * See also tooltip.split, that is better suited for charts with many
   * series, especially line-type series. The <code>tooltip.split</code> option takes
   * precedence over <code>tooltip.shared</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.shared">https://api.highcharts.com/highcharts/tooltip.shared</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.shared">https://api.highcharts.com/highstock/tooltip.shared</a>
   *
   * @implspec shared?: boolean;
   *
   */
  @JSProperty("shared")
  boolean getShared();

  /**
   * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
   * will capture mouse movement or touch events. Tooltip texts for series
   * types with ordered data (not pie, scatter, flags etc) will be shown in a
   * single bubble. This is recommended for single series charts and for
   * tablet/mobile optimized charts.
   *
   * See also tooltip.split, that is better suited for charts with many
   * series, especially line-type series. The <code>tooltip.split</code> option takes
   * precedence over <code>tooltip.shared</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.shared">https://api.highcharts.com/highcharts/tooltip.shared</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.shared">https://api.highcharts.com/highstock/tooltip.shared</a>
   *
   * @implspec shared?: boolean;
   *
   */
  @JSProperty("shared")
  void setShared(boolean value);

  /**
   * (Highcharts, Highstock) Proximity snap for graphs or single points. It
   * defaults to 10 for mouse-powered devices and 25 for touch devices.
   *
   * Note that in most cases the whole plot area captures the mouse movement,
   * and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when
   * stickyTracking is <code>true</code> (default) and when the tooltip is shared or
   * split.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.snap">https://api.highcharts.com/highcharts/tooltip.snap</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.snap">https://api.highcharts.com/highstock/tooltip.snap</a>
   *
   * @implspec snap?: number;
   *
   */
  @JSProperty("snap")
  double getSnap();

  /**
   * (Highcharts, Highstock) Proximity snap for graphs or single points. It
   * defaults to 10 for mouse-powered devices and 25 for touch devices.
   *
   * Note that in most cases the whole plot area captures the mouse movement,
   * and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when
   * stickyTracking is <code>true</code> (default) and when the tooltip is shared or
   * split.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.snap">https://api.highcharts.com/highcharts/tooltip.snap</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.snap">https://api.highcharts.com/highstock/tooltip.snap</a>
   *
   * @implspec snap?: number;
   *
   */
  @JSProperty("snap")
  void setSnap(double value);

  /**
   * (Highcharts, Highstock) Split the tooltip into one label per series, with
   * the header close to the axis. This is recommended over shared tooltips
   * for charts with multiple line series, generally making them easier to
   * read. This option takes precedence over <code>tooltip.shared</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.split">https://api.highcharts.com/highcharts/tooltip.split</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.split">https://api.highcharts.com/highstock/tooltip.split</a>
   *
   * @implspec split?: boolean;
   *
   */
  @JSProperty("split")
  boolean getSplit();

  /**
   * (Highcharts, Highstock) Split the tooltip into one label per series, with
   * the header close to the axis. This is recommended over shared tooltips
   * for charts with multiple line series, generally making them easier to
   * read. This option takes precedence over <code>tooltip.shared</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.split">https://api.highcharts.com/highcharts/tooltip.split</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.split">https://api.highcharts.com/highstock/tooltip.split</a>
   *
   * @implspec split?: boolean;
   *
   */
  @JSProperty("split")
  void setSplit(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the tooltip. The tooltip
   * can also be styled through the CSS class <code>.highcharts-tooltip</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.style">https://api.highcharts.com/highcharts/tooltip.style</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.style">https://api.highcharts.com/highstock/tooltip.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.style">https://api.highcharts.com/highmaps/tooltip.style</a>
   *
   * @implspec style?: (CSSObject|TooltipStyleOptions);
   *
   */
  @JSProperty("style")
  @Nullable
  Unknown getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the tooltip. The tooltip
   * can also be styled through the CSS class <code>.highcharts-tooltip</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.style">https://api.highcharts.com/highcharts/tooltip.style</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.style">https://api.highcharts.com/highstock/tooltip.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.style">https://api.highcharts.com/highmaps/tooltip.style</a>
   *
   * @implspec style?: (CSSObject|TooltipStyleOptions);
   *
   */
  @JSProperty("style")
  void setStyle(TooltipStyleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the tooltip. The tooltip
   * can also be styled through the CSS class <code>.highcharts-tooltip</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.style">https://api.highcharts.com/highcharts/tooltip.style</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.style">https://api.highcharts.com/highstock/tooltip.style</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.style">https://api.highcharts.com/highmaps/tooltip.style</a>
   *
   * @implspec style?: (CSSObject|TooltipStyleOptions);
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Use HTML to render the contents of the
   * tooltip instead of SVG. Using HTML allows advanced formatting like tables
   * and images in the tooltip. It is also recommended for rtl languages as it
   * works around rtl bugs in early Firefox.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.useHTML">https://api.highcharts.com/highcharts/tooltip.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.useHTML">https://api.highcharts.com/highstock/tooltip.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.useHTML">https://api.highcharts.com/highmaps/tooltip.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps) Use HTML to render the contents of the
   * tooltip instead of SVG. Using HTML allows advanced formatting like tables
   * and images in the tooltip. It is also recommended for rtl languages as it
   * works around rtl bugs in early Firefox.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.useHTML">https://api.highcharts.com/highcharts/tooltip.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.useHTML">https://api.highcharts.com/highstock/tooltip.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.useHTML">https://api.highcharts.com/highmaps/tooltip.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) How many decimals to show in each
   * series' y value. This is overridable in each series' tooltip options
   * object. The default is to preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.valueDecimals">https://api.highcharts.com/highcharts/tooltip.valueDecimals</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.valueDecimals">https://api.highcharts.com/highstock/tooltip.valueDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.valueDecimals">https://api.highcharts.com/highmaps/tooltip.valueDecimals</a>
   *
   * @implspec valueDecimals?: number;
   *
   */
  @JSProperty("valueDecimals")
  double getValueDecimals();

  /**
   * (Highcharts, Highstock, Highmaps) How many decimals to show in each
   * series' y value. This is overridable in each series' tooltip options
   * object. The default is to preserve all decimals.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.valueDecimals">https://api.highcharts.com/highcharts/tooltip.valueDecimals</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.valueDecimals">https://api.highcharts.com/highstock/tooltip.valueDecimals</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.valueDecimals">https://api.highcharts.com/highmaps/tooltip.valueDecimals</a>
   *
   * @implspec valueDecimals?: number;
   *
   */
  @JSProperty("valueDecimals")
  void setValueDecimals(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A string to prepend to each series' y
   * value. Overridable in each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.valuePrefix">https://api.highcharts.com/highcharts/tooltip.valuePrefix</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.valuePrefix">https://api.highcharts.com/highstock/tooltip.valuePrefix</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.valuePrefix">https://api.highcharts.com/highmaps/tooltip.valuePrefix</a>
   *
   * @implspec valuePrefix?: string;
   *
   */
  @JSProperty("valuePrefix")
  @Nullable
  String getValuePrefix();

  /**
   * (Highcharts, Highstock, Highmaps) A string to prepend to each series' y
   * value. Overridable in each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.valuePrefix">https://api.highcharts.com/highcharts/tooltip.valuePrefix</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.valuePrefix">https://api.highcharts.com/highstock/tooltip.valuePrefix</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.valuePrefix">https://api.highcharts.com/highmaps/tooltip.valuePrefix</a>
   *
   * @implspec valuePrefix?: string;
   *
   */
  @JSProperty("valuePrefix")
  void setValuePrefix(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A string to append to each series' y
   * value. Overridable in each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.valueSuffix">https://api.highcharts.com/highcharts/tooltip.valueSuffix</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.valueSuffix">https://api.highcharts.com/highstock/tooltip.valueSuffix</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.valueSuffix">https://api.highcharts.com/highmaps/tooltip.valueSuffix</a>
   *
   * @implspec valueSuffix?: string;
   *
   */
  @JSProperty("valueSuffix")
  @Nullable
  String getValueSuffix();

  /**
   * (Highcharts, Highstock, Highmaps) A string to append to each series' y
   * value. Overridable in each series' tooltip options object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.valueSuffix">https://api.highcharts.com/highcharts/tooltip.valueSuffix</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.valueSuffix">https://api.highcharts.com/highstock/tooltip.valueSuffix</a>
   * @see <a href="https://api.highcharts.com/highmaps/tooltip.valueSuffix">https://api.highcharts.com/highmaps/tooltip.valueSuffix</a>
   *
   * @implspec valueSuffix?: string;
   *
   */
  @JSProperty("valueSuffix")
  void setValueSuffix(String value);

  /**
   * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
   * header if the X axis is a datetime axis. The default is a best guess
   * based on the smallest distance between points in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.xDateFormat">https://api.highcharts.com/highcharts/tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.xDateFormat">https://api.highcharts.com/highstock/tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/gantt/tooltip.xDateFormat">https://api.highcharts.com/gantt/tooltip.xDateFormat</a>
   *
   * @implspec xDateFormat?: string;
   *
   */
  @JSProperty("xDateFormat")
  @Nullable
  String getXDateFormat();

  /**
   * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
   * header if the X axis is a datetime axis. The default is a best guess
   * based on the smallest distance between points in the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/tooltip.xDateFormat">https://api.highcharts.com/highcharts/tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/tooltip.xDateFormat">https://api.highcharts.com/highstock/tooltip.xDateFormat</a>
   * @see <a href="https://api.highcharts.com/gantt/tooltip.xDateFormat">https://api.highcharts.com/gantt/tooltip.xDateFormat</a>
   *
   * @implspec xDateFormat?: string;
   *
   */
  @JSProperty("xDateFormat")
  void setXDateFormat(String value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointFormatter extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface Positioner extends Any {
    void apply();
  }

  /**
   */
  abstract class Shape extends JsEnum {
    public static final Shape CALLOUT = JsEnum.of("callout");

    public static final Shape SQUARE = JsEnum.of("square");
  }
}
