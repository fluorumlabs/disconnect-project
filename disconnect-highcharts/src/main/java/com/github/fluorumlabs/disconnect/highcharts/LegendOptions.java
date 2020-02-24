package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The legend is a box containing a symbol and
 * name for each series item or point item in the chart. Each series (or points
 * in case of pie charts) is represented by a symbol and its name in the legend.
 *
 * It is possible to override the symbol creator function and create custom
 * legend symbols.
 *
 * @see <a href="https://api.highcharts.com/highcharts/legend">https://api.highcharts.com/highcharts/legend</a>
 * @see <a href="https://api.highcharts.com/highstock/legend">https://api.highcharts.com/highstock/legend</a>
 * @see <a href="https://api.highcharts.com/highmaps/legend">https://api.highcharts.com/highmaps/legend</a>
 *
 */
public interface LegendOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the legend
   * box within the chart area. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.align">https://api.highcharts.com/highcharts/legend.align</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.align">https://api.highcharts.com/highstock/legend.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.align">https://api.highcharts.com/highmaps/legend.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The horizontal alignment of the legend
   * box within the chart area. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.align">https://api.highcharts.com/highcharts/legend.align</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.align">https://api.highcharts.com/highstock/legend.align</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.align">https://api.highcharts.com/highmaps/legend.align</a>
   *
   * @implspec align?: (&quot;center&quot;|&quot;left&quot;|&quot;right&quot;);
   *
   */
  @JSProperty("align")
  void setAlign(Align value);

  /**
   * (Highcharts, Highstock, Highmaps) If the layout is <code>horizontal</code> and the
   * legend items span over two lines or more, whether to align the items into
   * vertical columns. Setting this to <code>false</code> makes room for more items, but
   * will look more messy.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.alignColumns">https://api.highcharts.com/highcharts/legend.alignColumns</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.alignColumns">https://api.highcharts.com/highstock/legend.alignColumns</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.alignColumns">https://api.highcharts.com/highmaps/legend.alignColumns</a>
   *
   * @implspec alignColumns?: boolean;
   *
   */
  @JSProperty("alignColumns")
  boolean getAlignColumns();

  /**
   * (Highcharts, Highstock, Highmaps) If the layout is <code>horizontal</code> and the
   * legend items span over two lines or more, whether to align the items into
   * vertical columns. Setting this to <code>false</code> makes room for more items, but
   * will look more messy.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.alignColumns">https://api.highcharts.com/highcharts/legend.alignColumns</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.alignColumns">https://api.highcharts.com/highstock/legend.alignColumns</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.alignColumns">https://api.highcharts.com/highmaps/legend.alignColumns</a>
   *
   * @implspec alignColumns?: boolean;
   *
   */
  @JSProperty("alignColumns")
  void setAlignColumns(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color of the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.backgroundColor">https://api.highcharts.com/highcharts/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.backgroundColor">https://api.highcharts.com/highstock/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.backgroundColor">https://api.highcharts.com/highmaps/legend.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps) The background color of the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.backgroundColor">https://api.highcharts.com/highcharts/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.backgroundColor">https://api.highcharts.com/highstock/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.backgroundColor">https://api.highcharts.com/highmaps/legend.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color of the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.backgroundColor">https://api.highcharts.com/highcharts/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.backgroundColor">https://api.highcharts.com/highstock/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.backgroundColor">https://api.highcharts.com/highmaps/legend.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The background color of the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.backgroundColor">https://api.highcharts.com/highcharts/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.backgroundColor">https://api.highcharts.com/highstock/legend.backgroundColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.backgroundColor">https://api.highcharts.com/highmaps/legend.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the drawn border around
   * the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.borderColor">https://api.highcharts.com/highcharts/legend.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.borderColor">https://api.highcharts.com/highstock/legend.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.borderColor">https://api.highcharts.com/highmaps/legend.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the drawn border around
   * the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.borderColor">https://api.highcharts.com/highcharts/legend.borderColor</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.borderColor">https://api.highcharts.com/highstock/legend.borderColor</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.borderColor">https://api.highcharts.com/highmaps/legend.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The border corner radius of the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.borderRadius">https://api.highcharts.com/highcharts/legend.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.borderRadius">https://api.highcharts.com/highstock/legend.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.borderRadius">https://api.highcharts.com/highmaps/legend.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The border corner radius of the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.borderRadius">https://api.highcharts.com/highcharts/legend.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.borderRadius">https://api.highcharts.com/highstock/legend.borderRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.borderRadius">https://api.highcharts.com/highmaps/legend.borderRadius</a>
   *
   * @implspec borderRadius?: number;
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the drawn border around
   * the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.borderWidth">https://api.highcharts.com/highcharts/legend.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.borderWidth">https://api.highcharts.com/highstock/legend.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.borderWidth">https://api.highcharts.com/highmaps/legend.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the drawn border around
   * the legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.borderWidth">https://api.highcharts.com/highcharts/legend.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.borderWidth">https://api.highcharts.com/highstock/legend.borderWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.borderWidth">https://api.highcharts.com/highmaps/legend.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the legend. There is
   * also a series-specific option, showInLegend, that can hide the series
   * from the legend. In some series types this is <code>false</code> by default, so it
   * must set to <code>true</code> in order to show the legend for the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.enabled">https://api.highcharts.com/highcharts/legend.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.enabled">https://api.highcharts.com/highstock/legend.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.enabled">https://api.highcharts.com/highmaps/legend.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the legend. There is
   * also a series-specific option, showInLegend, that can hide the series
   * from the legend. In some series types this is <code>false</code> by default, so it
   * must set to <code>true</code> in order to show the legend for the series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.enabled">https://api.highcharts.com/highcharts/legend.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.enabled">https://api.highcharts.com/highstock/legend.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.enabled">https://api.highcharts.com/highmaps/legend.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) When the legend is floating, the plot
   * area ignores it and is allowed to be placed below it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.floating">https://api.highcharts.com/highcharts/legend.floating</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.floating">https://api.highcharts.com/highstock/legend.floating</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.floating">https://api.highcharts.com/highmaps/legend.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps) When the legend is floating, the plot
   * area ignores it and is allowed to be placed below it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.floating">https://api.highcharts.com/highcharts/legend.floating</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.floating">https://api.highcharts.com/highstock/legend.floating</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.floating">https://api.highcharts.com/highmaps/legend.floating</a>
   *
   * @implspec floating?: boolean;
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Default styling for the checkbox next
   * to a legend item when <code>showCheckbox</code> is true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemCheckboxStyle">https://api.highcharts.com/highcharts/legend.itemCheckboxStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemCheckboxStyle">https://api.highcharts.com/highstock/legend.itemCheckboxStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemCheckboxStyle">https://api.highcharts.com/highmaps/legend.itemCheckboxStyle</a>
   *
   * @implspec itemCheckboxStyle?: (CSSObject|LegendItemCheckboxStyleOptions);
   *
   */
  @JSProperty("itemCheckboxStyle")
  @Nullable
  Unknown getItemCheckboxStyle();

  /**
   * (Highcharts, Highstock, Highmaps) Default styling for the checkbox next
   * to a legend item when <code>showCheckbox</code> is true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemCheckboxStyle">https://api.highcharts.com/highcharts/legend.itemCheckboxStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemCheckboxStyle">https://api.highcharts.com/highstock/legend.itemCheckboxStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemCheckboxStyle">https://api.highcharts.com/highmaps/legend.itemCheckboxStyle</a>
   *
   * @implspec itemCheckboxStyle?: (CSSObject|LegendItemCheckboxStyleOptions);
   *
   */
  @JSProperty("itemCheckboxStyle")
  void setItemCheckboxStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) Default styling for the checkbox next
   * to a legend item when <code>showCheckbox</code> is true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemCheckboxStyle">https://api.highcharts.com/highcharts/legend.itemCheckboxStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemCheckboxStyle">https://api.highcharts.com/highstock/legend.itemCheckboxStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemCheckboxStyle">https://api.highcharts.com/highmaps/legend.itemCheckboxStyle</a>
   *
   * @implspec itemCheckboxStyle?: (CSSObject|LegendItemCheckboxStyleOptions);
   *
   */
  @JSProperty("itemCheckboxStyle")
  void setItemCheckboxStyle(LegendItemCheckboxStyleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) In a legend with horizontal layout, the
   * itemDistance defines the pixel distance between each item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemDistance">https://api.highcharts.com/highcharts/legend.itemDistance</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemDistance">https://api.highcharts.com/highstock/legend.itemDistance</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemDistance">https://api.highcharts.com/highmaps/legend.itemDistance</a>
   *
   * @implspec itemDistance?: number;
   *
   */
  @JSProperty("itemDistance")
  double getItemDistance();

  /**
   * (Highcharts, Highstock, Highmaps) In a legend with horizontal layout, the
   * itemDistance defines the pixel distance between each item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemDistance">https://api.highcharts.com/highcharts/legend.itemDistance</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemDistance">https://api.highcharts.com/highstock/legend.itemDistance</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemDistance">https://api.highcharts.com/highmaps/legend.itemDistance</a>
   *
   * @implspec itemDistance?: number;
   *
   */
  @JSProperty("itemDistance")
  void setItemDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item when
   * the corresponding series or point is hidden. Only a subset of CSS is
   * supported, notably those options related to text. Properties are
   * inherited from <code>style</code> unless overridden here.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemHiddenStyle">https://api.highcharts.com/highcharts/legend.itemHiddenStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemHiddenStyle">https://api.highcharts.com/highstock/legend.itemHiddenStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemHiddenStyle">https://api.highcharts.com/highmaps/legend.itemHiddenStyle</a>
   *
   * @implspec itemHiddenStyle?: CSSObject;
   *
   */
  @JSProperty("itemHiddenStyle")
  @Nullable
  CSSObject getItemHiddenStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item when
   * the corresponding series or point is hidden. Only a subset of CSS is
   * supported, notably those options related to text. Properties are
   * inherited from <code>style</code> unless overridden here.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemHiddenStyle">https://api.highcharts.com/highcharts/legend.itemHiddenStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemHiddenStyle">https://api.highcharts.com/highstock/legend.itemHiddenStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemHiddenStyle">https://api.highcharts.com/highmaps/legend.itemHiddenStyle</a>
   *
   * @implspec itemHiddenStyle?: CSSObject;
   *
   */
  @JSProperty("itemHiddenStyle")
  void setItemHiddenStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item in
   * hover mode. Only a subset of CSS is supported, notably those options
   * related to text. Properties are inherited from <code>style</code> unless overridden
   * here.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemHoverStyle">https://api.highcharts.com/highcharts/legend.itemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemHoverStyle">https://api.highcharts.com/highstock/legend.itemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemHoverStyle">https://api.highcharts.com/highmaps/legend.itemHoverStyle</a>
   *
   * @implspec itemHoverStyle?: CSSObject;
   *
   */
  @JSProperty("itemHoverStyle")
  @Nullable
  CSSObject getItemHoverStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item in
   * hover mode. Only a subset of CSS is supported, notably those options
   * related to text. Properties are inherited from <code>style</code> unless overridden
   * here.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemHoverStyle">https://api.highcharts.com/highcharts/legend.itemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemHoverStyle">https://api.highcharts.com/highstock/legend.itemHoverStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemHoverStyle">https://api.highcharts.com/highmaps/legend.itemHoverStyle</a>
   *
   * @implspec itemHoverStyle?: CSSObject;
   *
   */
  @JSProperty("itemHoverStyle")
  void setItemHoverStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel bottom margin for each legend
   * item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemMarginBottom">https://api.highcharts.com/highcharts/legend.itemMarginBottom</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemMarginBottom">https://api.highcharts.com/highstock/legend.itemMarginBottom</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemMarginBottom">https://api.highcharts.com/highmaps/legend.itemMarginBottom</a>
   *
   * @implspec itemMarginBottom?: number;
   *
   */
  @JSProperty("itemMarginBottom")
  double getItemMarginBottom();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel bottom margin for each legend
   * item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemMarginBottom">https://api.highcharts.com/highcharts/legend.itemMarginBottom</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemMarginBottom">https://api.highcharts.com/highstock/legend.itemMarginBottom</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemMarginBottom">https://api.highcharts.com/highmaps/legend.itemMarginBottom</a>
   *
   * @implspec itemMarginBottom?: number;
   *
   */
  @JSProperty("itemMarginBottom")
  void setItemMarginBottom(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel top margin for each legend
   * item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemMarginTop">https://api.highcharts.com/highcharts/legend.itemMarginTop</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemMarginTop">https://api.highcharts.com/highstock/legend.itemMarginTop</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemMarginTop">https://api.highcharts.com/highmaps/legend.itemMarginTop</a>
   *
   * @implspec itemMarginTop?: number;
   *
   */
  @JSProperty("itemMarginTop")
  double getItemMarginTop();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel top margin for each legend
   * item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemMarginTop">https://api.highcharts.com/highcharts/legend.itemMarginTop</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemMarginTop">https://api.highcharts.com/highstock/legend.itemMarginTop</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemMarginTop">https://api.highcharts.com/highmaps/legend.itemMarginTop</a>
   *
   * @implspec itemMarginTop?: number;
   *
   */
  @JSProperty("itemMarginTop")
  void setItemMarginTop(double value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item. Only a
   * subset of CSS is supported, notably those options related to text. The
   * default <code>textOverflow</code> property makes long texts truncate. Set it to
   * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to
   * control the text width.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemStyle">https://api.highcharts.com/highcharts/legend.itemStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemStyle">https://api.highcharts.com/highstock/legend.itemStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemStyle">https://api.highcharts.com/highmaps/legend.itemStyle</a>
   *
   * @implspec itemStyle?: (CSSObject|LegendItemStyleOptions);
   *
   */
  @JSProperty("itemStyle")
  @Nullable
  Unknown getItemStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item. Only a
   * subset of CSS is supported, notably those options related to text. The
   * default <code>textOverflow</code> property makes long texts truncate. Set it to
   * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to
   * control the text width.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemStyle">https://api.highcharts.com/highcharts/legend.itemStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemStyle">https://api.highcharts.com/highstock/legend.itemStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemStyle">https://api.highcharts.com/highmaps/legend.itemStyle</a>
   *
   * @implspec itemStyle?: (CSSObject|LegendItemStyleOptions);
   *
   */
  @JSProperty("itemStyle")
  void setItemStyle(LegendItemStyleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for each legend item. Only a
   * subset of CSS is supported, notably those options related to text. The
   * default <code>textOverflow</code> property makes long texts truncate. Set it to
   * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to
   * control the text width.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemStyle">https://api.highcharts.com/highcharts/legend.itemStyle</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemStyle">https://api.highcharts.com/highstock/legend.itemStyle</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemStyle">https://api.highcharts.com/highmaps/legend.itemStyle</a>
   *
   * @implspec itemStyle?: (CSSObject|LegendItemStyleOptions);
   *
   */
  @JSProperty("itemStyle")
  void setItemStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The width for each legend item. By
   * default the items are laid out successively. In a horizontal layout, if
   * the items are laid out across two rows or more, they will be vertically
   * aligned depending on the legend.alignColumns option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemWidth">https://api.highcharts.com/highcharts/legend.itemWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemWidth">https://api.highcharts.com/highstock/legend.itemWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemWidth">https://api.highcharts.com/highmaps/legend.itemWidth</a>
   *
   * @implspec itemWidth?: number;
   *
   */
  @JSProperty("itemWidth")
  double getItemWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width for each legend item. By
   * default the items are laid out successively. In a horizontal layout, if
   * the items are laid out across two rows or more, they will be vertically
   * aligned depending on the legend.alignColumns option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.itemWidth">https://api.highcharts.com/highcharts/legend.itemWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.itemWidth">https://api.highcharts.com/highstock/legend.itemWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.itemWidth">https://api.highcharts.com/highmaps/legend.itemWidth</a>
   *
   * @implspec itemWidth?: number;
   *
   */
  @JSProperty("itemWidth")
  void setItemWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Keyboard navigation for the legend.
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.keyboardNavigation">https://api.highcharts.com/highcharts/legend.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.keyboardNavigation">https://api.highcharts.com/highstock/legend.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.keyboardNavigation">https://api.highcharts.com/highmaps/legend.keyboardNavigation</a>
   *
   * @implspec keyboardNavigation?: LegendKeyboardNavigationOptions;
   *
   */
  @JSProperty("keyboardNavigation")
  @Nullable
  LegendKeyboardNavigationOptions getKeyboardNavigation();

  /**
   * (Highcharts, Highstock, Highmaps) Keyboard navigation for the legend.
   * Requires the Accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.keyboardNavigation">https://api.highcharts.com/highcharts/legend.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.keyboardNavigation">https://api.highcharts.com/highstock/legend.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.keyboardNavigation">https://api.highcharts.com/highmaps/legend.keyboardNavigation</a>
   *
   * @implspec keyboardNavigation?: LegendKeyboardNavigationOptions;
   *
   */
  @JSProperty("keyboardNavigation")
  void setKeyboardNavigation(LegendKeyboardNavigationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) A format string for each legend label.
   * Available variables relates to properties on the series, or the point in
   * case of pies.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.labelFormat">https://api.highcharts.com/highcharts/legend.labelFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.labelFormat">https://api.highcharts.com/highstock/legend.labelFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.labelFormat">https://api.highcharts.com/highmaps/legend.labelFormat</a>
   *
   * @implspec labelFormat?: string;
   *
   */
  @JSProperty("labelFormat")
  @Nullable
  String getLabelFormat();

  /**
   * (Highcharts, Highstock, Highmaps) A format string for each legend label.
   * Available variables relates to properties on the series, or the point in
   * case of pies.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.labelFormat">https://api.highcharts.com/highcharts/legend.labelFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.labelFormat">https://api.highcharts.com/highstock/legend.labelFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.labelFormat">https://api.highcharts.com/highmaps/legend.labelFormat</a>
   *
   * @implspec labelFormat?: string;
   *
   */
  @JSProperty("labelFormat")
  void setLabelFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Callback function to format each of the
   * series' labels. The <code>this</code> keyword refers to the series object, or the
   * point object in case of pie charts. By default the series or point name
   * is printed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.labelFormatter">https://api.highcharts.com/highcharts/legend.labelFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.labelFormatter">https://api.highcharts.com/highstock/legend.labelFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.labelFormatter">https://api.highcharts.com/highmaps/legend.labelFormatter</a>
   *
   * @implspec labelFormatter?: object;
   *
   */
  @JSProperty("labelFormatter")
  @Nullable
  Any getLabelFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Callback function to format each of the
   * series' labels. The <code>this</code> keyword refers to the series object, or the
   * point object in case of pie charts. By default the series or point name
   * is printed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.labelFormatter">https://api.highcharts.com/highcharts/legend.labelFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.labelFormatter">https://api.highcharts.com/highstock/legend.labelFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.labelFormatter">https://api.highcharts.com/highmaps/legend.labelFormatter</a>
   *
   * @implspec labelFormatter?: object;
   *
   */
  @JSProperty("labelFormatter")
  void setLabelFormatter(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) The layout of the legend items. Can be
   * one of <code>horizontal</code> or <code>vertical</code> or <code>proximate</code>. When <code>proximate</code>, the
   * legend items will be placed as close as possible to the graphs they're
   * representing, except in inverted charts or when the legend position
   * doesn't allow it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.layout">https://api.highcharts.com/highcharts/legend.layout</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.layout">https://api.highcharts.com/highstock/legend.layout</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.layout">https://api.highcharts.com/highmaps/legend.layout</a>
   *
   * @implspec layout?: (&quot;horizontal&quot;|&quot;proximate&quot;|&quot;vertical&quot;);
   *
   */
  @JSProperty("layout")
  @Nullable
  Layout getLayout();

  /**
   * (Highcharts, Highstock, Highmaps) The layout of the legend items. Can be
   * one of <code>horizontal</code> or <code>vertical</code> or <code>proximate</code>. When <code>proximate</code>, the
   * legend items will be placed as close as possible to the graphs they're
   * representing, except in inverted charts or when the legend position
   * doesn't allow it.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.layout">https://api.highcharts.com/highcharts/legend.layout</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.layout">https://api.highcharts.com/highstock/legend.layout</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.layout">https://api.highcharts.com/highmaps/legend.layout</a>
   *
   * @implspec layout?: (&quot;horizontal&quot;|&quot;proximate&quot;|&quot;vertical&quot;);
   *
   */
  @JSProperty("layout")
  void setLayout(Layout value);

  /**
   * (Highcharts, Gantt) Line height for the legend items. Deprecated as of
   * 2.1. Instead, the line height for each item can be set using
   * itemStyle.lineHeight, and the padding between items using <code>itemMarginTop</code>
   * and <code>itemMarginBottom</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.lineHeight">https://api.highcharts.com/highcharts/legend.lineHeight</a>
   * @see <a href="https://api.highcharts.com/gantt/legend.lineHeight">https://api.highcharts.com/gantt/legend.lineHeight</a>
   *
   * @implspec lineHeight?: number;
   *
   */
  @JSProperty("lineHeight")
  double getLineHeight();

  /**
   * (Highcharts, Gantt) Line height for the legend items. Deprecated as of
   * 2.1. Instead, the line height for each item can be set using
   * itemStyle.lineHeight, and the padding between items using <code>itemMarginTop</code>
   * and <code>itemMarginBottom</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.lineHeight">https://api.highcharts.com/highcharts/legend.lineHeight</a>
   * @see <a href="https://api.highcharts.com/gantt/legend.lineHeight">https://api.highcharts.com/gantt/legend.lineHeight</a>
   *
   * @implspec lineHeight?: number;
   *
   */
  @JSProperty("lineHeight")
  void setLineHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) If the plot area sized is calculated
   * automatically and the legend is not floating, the legend margin is the
   * space between the legend and the axis labels or plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.margin">https://api.highcharts.com/highcharts/legend.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.margin">https://api.highcharts.com/highstock/legend.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.margin">https://api.highcharts.com/highmaps/legend.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps) If the plot area sized is calculated
   * automatically and the legend is not floating, the legend margin is the
   * space between the legend and the axis labels or plot area.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.margin">https://api.highcharts.com/highcharts/legend.margin</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.margin">https://api.highcharts.com/highstock/legend.margin</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.margin">https://api.highcharts.com/highmaps/legend.margin</a>
   *
   * @implspec margin?: number;
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Maximum pixel height for the legend.
   * When the maximum height is extended, navigation will show.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.maxHeight">https://api.highcharts.com/highcharts/legend.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.maxHeight">https://api.highcharts.com/highstock/legend.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.maxHeight">https://api.highcharts.com/highmaps/legend.maxHeight</a>
   *
   * @implspec maxHeight?: number;
   *
   */
  @JSProperty("maxHeight")
  double getMaxHeight();

  /**
   * (Highcharts, Highstock, Highmaps) Maximum pixel height for the legend.
   * When the maximum height is extended, navigation will show.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.maxHeight">https://api.highcharts.com/highcharts/legend.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.maxHeight">https://api.highcharts.com/highstock/legend.maxHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.maxHeight">https://api.highcharts.com/highmaps/legend.maxHeight</a>
   *
   * @implspec maxHeight?: number;
   *
   */
  @JSProperty("maxHeight")
  void setMaxHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the paging or navigation
   * appearing when the legend is overflown. Navigation works well on screen,
   * but not in static exported images. One way of working around that is to
   * increase the chart height in export.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation">https://api.highcharts.com/highcharts/legend.navigation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation">https://api.highcharts.com/highstock/legend.navigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation">https://api.highcharts.com/highmaps/legend.navigation</a>
   *
   * @implspec navigation?: LegendNavigationOptions;
   *
   */
  @JSProperty("navigation")
  @Nullable
  LegendNavigationOptions getNavigation();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the paging or navigation
   * appearing when the legend is overflown. Navigation works well on screen,
   * but not in static exported images. One way of working around that is to
   * increase the chart height in export.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.navigation">https://api.highcharts.com/highcharts/legend.navigation</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.navigation">https://api.highcharts.com/highstock/legend.navigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.navigation">https://api.highcharts.com/highmaps/legend.navigation</a>
   *
   * @implspec navigation?: LegendNavigationOptions;
   *
   */
  @JSProperty("navigation")
  void setNavigation(LegendNavigationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The inner padding of the legend box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.padding">https://api.highcharts.com/highcharts/legend.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.padding">https://api.highcharts.com/highstock/legend.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.padding">https://api.highcharts.com/highmaps/legend.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps) The inner padding of the legend box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.padding">https://api.highcharts.com/highcharts/legend.padding</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.padding">https://api.highcharts.com/highstock/legend.padding</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.padding">https://api.highcharts.com/highmaps/legend.padding</a>
   *
   * @implspec padding?: number;
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the order of the
   * legend items compared to the order of the series or points as defined in
   * the configuration object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.reversed">https://api.highcharts.com/highcharts/legend.reversed</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.reversed">https://api.highcharts.com/highstock/legend.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.reversed">https://api.highcharts.com/highmaps/legend.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to reverse the order of the
   * legend items compared to the order of the series or points as defined in
   * the configuration object.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.reversed">https://api.highcharts.com/highcharts/legend.reversed</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.reversed">https://api.highcharts.com/highstock/legend.reversed</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.reversed">https://api.highcharts.com/highmaps/legend.reversed</a>
   *
   * @implspec reversed?: boolean;
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the symbol on the right
   * side of the text rather than the left side. This is common in Arabic and
   * Hebraic.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.rtl">https://api.highcharts.com/highcharts/legend.rtl</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.rtl">https://api.highcharts.com/highstock/legend.rtl</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.rtl">https://api.highcharts.com/highmaps/legend.rtl</a>
   *
   * @implspec rtl?: boolean;
   *
   */
  @JSProperty("rtl")
  boolean getRtl();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to show the symbol on the right
   * side of the text rather than the left side. This is common in Arabic and
   * Hebraic.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.rtl">https://api.highcharts.com/highcharts/legend.rtl</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.rtl">https://api.highcharts.com/highstock/legend.rtl</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.rtl">https://api.highcharts.com/highmaps/legend.rtl</a>
   *
   * @implspec rtl?: boolean;
   *
   */
  @JSProperty("rtl")
  void setRtl(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * legend. A <code>backgroundColor</code> also needs to be applied for this to take
   * effect. The shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.shadow">https://api.highcharts.com/highcharts/legend.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.shadow">https://api.highcharts.com/highstock/legend.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.shadow">https://api.highcharts.com/highmaps/legend.shadow</a>
   *
   * @implspec shadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown getShadow();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * legend. A <code>backgroundColor</code> also needs to be applied for this to take
   * effect. The shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.shadow">https://api.highcharts.com/highcharts/legend.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.shadow">https://api.highcharts.com/highstock/legend.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.shadow">https://api.highcharts.com/highmaps/legend.shadow</a>
   *
   * @implspec shadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to apply a drop shadow to the
   * legend. A <code>backgroundColor</code> also needs to be applied for this to take
   * effect. The shadow can be an object configuration containing <code>color</code>,
   * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.shadow">https://api.highcharts.com/highcharts/legend.shadow</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.shadow">https://api.highcharts.com/highstock/legend.shadow</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.shadow">https://api.highcharts.com/highmaps/legend.shadow</a>
   *
   * @implspec shadow?: (boolean|CSSObject);
   *
   */
  @JSProperty("shadow")
  void setShadow(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) When this is true, the legend symbol
   * width will be the same as the symbol height, which in turn defaults to
   * the font size of the legend items.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.squareSymbol">https://api.highcharts.com/highcharts/legend.squareSymbol</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.squareSymbol">https://api.highcharts.com/highstock/legend.squareSymbol</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.squareSymbol">https://api.highcharts.com/highmaps/legend.squareSymbol</a>
   *
   * @implspec squareSymbol?: boolean;
   *
   */
  @JSProperty("squareSymbol")
  boolean getSquareSymbol();

  /**
   * (Highcharts, Highstock, Highmaps) When this is true, the legend symbol
   * width will be the same as the symbol height, which in turn defaults to
   * the font size of the legend items.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.squareSymbol">https://api.highcharts.com/highcharts/legend.squareSymbol</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.squareSymbol">https://api.highcharts.com/highstock/legend.squareSymbol</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.squareSymbol">https://api.highcharts.com/highmaps/legend.squareSymbol</a>
   *
   * @implspec squareSymbol?: boolean;
   *
   */
  @JSProperty("squareSymbol")
  void setSquareSymbol(boolean value);

  /**
   * (Highcharts, Highstock) CSS styles for the legend area. In the 1.x
   * versions the position of the legend area was determined by CSS. In 2.x,
   * the position is determined by properties like <code>align</code>, <code>verticalAlign</code>,
   * <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.style">https://api.highcharts.com/highcharts/legend.style</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.style">https://api.highcharts.com/highstock/legend.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock) CSS styles for the legend area. In the 1.x
   * versions the position of the legend area was determined by CSS. In 2.x,
   * the position is determined by properties like <code>align</code>, <code>verticalAlign</code>,
   * <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.style">https://api.highcharts.com/highcharts/legend.style</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.style">https://api.highcharts.com/highstock/legend.style</a>
   *
   * @implspec style?: CSSObject;
   *
   */
  @JSProperty("style")
  void setStyle(CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel height of the symbol for
   * series types that use a rectangle in the legend. Defaults to the font
   * size of legend items.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolHeight">https://api.highcharts.com/highcharts/legend.symbolHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolHeight">https://api.highcharts.com/highstock/legend.symbolHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolHeight">https://api.highcharts.com/highmaps/legend.symbolHeight</a>
   *
   * @implspec symbolHeight?: number;
   *
   */
  @JSProperty("symbolHeight")
  double getSymbolHeight();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel height of the symbol for
   * series types that use a rectangle in the legend. Defaults to the font
   * size of legend items.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolHeight">https://api.highcharts.com/highcharts/legend.symbolHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolHeight">https://api.highcharts.com/highstock/legend.symbolHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolHeight">https://api.highcharts.com/highmaps/legend.symbolHeight</a>
   *
   * @implspec symbolHeight?: number;
   *
   */
  @JSProperty("symbolHeight")
  void setSymbolHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel padding between the legend
   * item symbol and the legend item text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolPadding">https://api.highcharts.com/highcharts/legend.symbolPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolPadding">https://api.highcharts.com/highstock/legend.symbolPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolPadding">https://api.highcharts.com/highmaps/legend.symbolPadding</a>
   *
   * @implspec symbolPadding?: number;
   *
   */
  @JSProperty("symbolPadding")
  double getSymbolPadding();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel padding between the legend
   * item symbol and the legend item text.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolPadding">https://api.highcharts.com/highcharts/legend.symbolPadding</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolPadding">https://api.highcharts.com/highstock/legend.symbolPadding</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolPadding">https://api.highcharts.com/highmaps/legend.symbolPadding</a>
   *
   * @implspec symbolPadding?: number;
   *
   */
  @JSProperty("symbolPadding")
  void setSymbolPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The border radius of the symbol for
   * series types that use a rectangle in the legend. Defaults to half the
   * <code>symbolHeight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolRadius">https://api.highcharts.com/highcharts/legend.symbolRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolRadius">https://api.highcharts.com/highstock/legend.symbolRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolRadius">https://api.highcharts.com/highmaps/legend.symbolRadius</a>
   *
   * @implspec symbolRadius?: number;
   *
   */
  @JSProperty("symbolRadius")
  double getSymbolRadius();

  /**
   * (Highcharts, Highstock, Highmaps) The border radius of the symbol for
   * series types that use a rectangle in the legend. Defaults to half the
   * <code>symbolHeight</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolRadius">https://api.highcharts.com/highcharts/legend.symbolRadius</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolRadius">https://api.highcharts.com/highstock/legend.symbolRadius</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolRadius">https://api.highcharts.com/highmaps/legend.symbolRadius</a>
   *
   * @implspec symbolRadius?: number;
   *
   */
  @JSProperty("symbolRadius")
  void setSymbolRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the legend item
   * symbol. When the <code>squareSymbol</code> option is set, this defaults to the
   * <code>symbolHeight</code>, otherwise 16.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolWidth">https://api.highcharts.com/highcharts/legend.symbolWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolWidth">https://api.highcharts.com/highstock/legend.symbolWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolWidth">https://api.highcharts.com/highmaps/legend.symbolWidth</a>
   *
   * @implspec symbolWidth?: number;
   *
   */
  @JSProperty("symbolWidth")
  double getSymbolWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of the legend item
   * symbol. When the <code>squareSymbol</code> option is set, this defaults to the
   * <code>symbolHeight</code>, otherwise 16.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.symbolWidth">https://api.highcharts.com/highcharts/legend.symbolWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.symbolWidth">https://api.highcharts.com/highstock/legend.symbolWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.symbolWidth">https://api.highcharts.com/highmaps/legend.symbolWidth</a>
   *
   * @implspec symbolWidth?: number;
   *
   */
  @JSProperty("symbolWidth")
  void setSymbolWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A title to be added on top of the
   * legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.title">https://api.highcharts.com/highcharts/legend.title</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.title">https://api.highcharts.com/highstock/legend.title</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.title">https://api.highcharts.com/highmaps/legend.title</a>
   *
   * @implspec title?: LegendTitleOptions;
   *
   */
  @JSProperty("title")
  @Nullable
  LegendTitleOptions getTitle();

  /**
   * (Highcharts, Highstock, Highmaps) A title to be added on top of the
   * legend.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.title">https://api.highcharts.com/highcharts/legend.title</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.title">https://api.highcharts.com/highstock/legend.title</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.title">https://api.highcharts.com/highmaps/legend.title</a>
   *
   * @implspec title?: LegendTitleOptions;
   *
   */
  @JSProperty("title")
  void setTitle(LegendTitleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the
   * legend item texts.
   *
   * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.useHTML">https://api.highcharts.com/highcharts/legend.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.useHTML">https://api.highcharts.com/highstock/legend.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.useHTML">https://api.highcharts.com/highmaps/legend.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to use HTML to render the
   * legend item texts.
   *
   * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.useHTML">https://api.highcharts.com/highcharts/legend.useHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.useHTML">https://api.highcharts.com/highstock/legend.useHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.useHTML">https://api.highcharts.com/highmaps/legend.useHTML</a>
   *
   * @implspec useHTML?: boolean;
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the legend
   * box. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. Vertical position can be
   * further determined by the <code>y</code> option.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   * When the layout option is <code>proximate</code>, the <code>verticalAlign</code> option doesn't
   * apply.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.verticalAlign">https://api.highcharts.com/highcharts/legend.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.verticalAlign">https://api.highcharts.com/highstock/legend.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.verticalAlign">https://api.highcharts.com/highmaps/legend.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical alignment of the legend
   * box. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. Vertical position can be
   * further determined by the <code>y</code> option.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   * When the layout option is <code>proximate</code>, the <code>verticalAlign</code> option doesn't
   * apply.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.verticalAlign">https://api.highcharts.com/highcharts/legend.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.verticalAlign">https://api.highcharts.com/highstock/legend.verticalAlign</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.verticalAlign">https://api.highcharts.com/highmaps/legend.verticalAlign</a>
   *
   * @implspec verticalAlign?: (&quot;bottom&quot;|&quot;middle&quot;|&quot;top&quot;);
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the legend box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.width">https://api.highcharts.com/highcharts/legend.width</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.width">https://api.highcharts.com/highstock/legend.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.width">https://api.highcharts.com/highmaps/legend.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the legend box.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.width">https://api.highcharts.com/highcharts/legend.width</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.width">https://api.highcharts.com/highstock/legend.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.width">https://api.highcharts.com/highmaps/legend.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The x offset of the legend relative to
   * its horizontal alignment <code>align</code> within chart.spacingLeft and
   * chart.spacingRight. Negative x moves it to the left, positive x moves it
   * to the right.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.x">https://api.highcharts.com/highcharts/legend.x</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.x">https://api.highcharts.com/highstock/legend.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.x">https://api.highcharts.com/highmaps/legend.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The x offset of the legend relative to
   * its horizontal alignment <code>align</code> within chart.spacingLeft and
   * chart.spacingRight. Negative x moves it to the left, positive x moves it
   * to the right.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.x">https://api.highcharts.com/highcharts/legend.x</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.x">https://api.highcharts.com/highstock/legend.x</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.x">https://api.highcharts.com/highmaps/legend.x</a>
   *
   * @implspec x?: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the legend
   * relative to it's vertical alignment <code>verticalAlign</code> within
   * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
   * positive y moves it down.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.y">https://api.highcharts.com/highcharts/legend.y</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.y">https://api.highcharts.com/highstock/legend.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.y">https://api.highcharts.com/highmaps/legend.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The vertical offset of the legend
   * relative to it's vertical alignment <code>verticalAlign</code> within
   * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
   * positive y moves it down.
   *
   * @see <a href="https://api.highcharts.com/highcharts/legend.y">https://api.highcharts.com/highcharts/legend.y</a>
   * @see <a href="https://api.highcharts.com/highstock/legend.y">https://api.highcharts.com/highstock/legend.y</a>
   * @see <a href="https://api.highcharts.com/highmaps/legend.y">https://api.highcharts.com/highmaps/legend.y</a>
   *
   * @implspec y?: number;
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   */
  abstract class Align extends JsEnum {
    public static final Align CENTER = JsEnum.of("center");

    public static final Align LEFT = JsEnum.of("left");

    public static final Align RIGHT = JsEnum.of("right");
  }

  /**
   */
  abstract class Layout extends JsEnum {
    public static final Layout HORIZONTAL = JsEnum.of("horizontal");

    public static final Layout PROXIMATE = JsEnum.of("proximate");

    public static final Layout VERTICAL = JsEnum.of("vertical");
  }

  /**
   */
  abstract class VerticalAlign extends JsEnum {
    public static final VerticalAlign BOTTOM = JsEnum.of("bottom");

    public static final VerticalAlign MIDDLE = JsEnum.of("middle");

    public static final VerticalAlign TOP = JsEnum.of("top");
  }
}
