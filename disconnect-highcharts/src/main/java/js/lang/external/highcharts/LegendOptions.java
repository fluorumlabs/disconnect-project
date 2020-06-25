package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a
 * symbol and name for each series item or point item in the chart. Each series
 * (or points in case of pie charts) is represented by a symbol and its name in
 * the legend.
 *
 * It is possible to override the symbol creator function and create custom
 * legend symbols.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
   * legend. Requires the Accessibility module.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  LegendAccessibilityOptions getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
   * legend. Requires the Accessibility module.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable LegendAccessibilityOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * legend box within the chart area. Valid values are <code>left</code>, <code>center</code> and
   * <code>right</code>.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
   * legend box within the chart area. Valid values are <code>left</code>, <code>center</code> and
   * <code>right</code>.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If the layout is <code>horizontal</code>
   * and the legend items span over two lines or more, whether to align the
   * items into vertical columns. Setting this to <code>false</code> makes room for more
   * items, but will look more messy.
   *
   */
  @JSProperty("alignColumns")
  boolean getAlignColumns();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If the layout is <code>horizontal</code>
   * and the legend items span over two lines or more, whether to align the
   * items into vertical columns. Setting this to <code>false</code> makes room for more
   * items, but will look more messy.
   *
   */
  @JSProperty("alignColumns")
  void setAlignColumns(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * legend.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * legend.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * legend.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
   * legend.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
   * around the legend.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
   * around the legend.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
   * around the legend.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
   * around the legend.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the
   * legend.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the
   * legend.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border
   * around the legend.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border
   * around the legend.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The bubble legend is an additional
   * element in legend which presents the scale of the bubble series.
   * Individual bubble ranges can be defined by user or calculated from
   * series. In the case of automatically calculated ranges, a 1px margin of
   * error is permitted.
   *
   */
  @JSProperty("bubbleLegend")
  @Nullable
  LegendBubbleLegendOptions getBubbleLegend();

  /**
   * (Highcharts, Highstock, Highmaps) The bubble legend is an additional
   * element in legend which presents the scale of the bubble series.
   * Individual bubble ranges can be defined by user or calculated from
   * series. In the case of automatically calculated ranges, a 1px margin of
   * error is permitted.
   *
   */
  @JSProperty("bubbleLegend")
  void setBubbleLegend(@Nullable LegendBubbleLegendOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend.
   * There is also a series-specific option, showInLegend, that can hide the
   * series from the legend. In some series types this is <code>false</code> by default,
   * so it must set to <code>true</code> in order to show the legend for the series.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend.
   * There is also a series-specific option, showInLegend, that can hide the
   * series from the legend. In some series types this is <code>false</code> by default,
   * so it must set to <code>true</code> in order to show the legend for the series.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the
   * plot area ignores it and is allowed to be placed below it.
   *
   */
  @JSProperty("floating")
  boolean getFloating();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the
   * plot area ignores it and is allowed to be placed below it.
   *
   */
  @JSProperty("floating")
  void setFloating(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox
   * next to a legend item when <code>showCheckbox</code> is true.
   *
   */
  @JSProperty("itemCheckboxStyle")
  @Nullable
  CSSObject getItemCheckboxStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox
   * next to a legend item when <code>showCheckbox</code> is true.
   *
   */
  @JSProperty("itemCheckboxStyle")
  void setItemCheckboxStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal
   * layout, the itemDistance defines the pixel distance between each item.
   *
   */
  @JSProperty("itemDistance")
  double getItemDistance();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal
   * layout, the itemDistance defines the pixel distance between each item.
   *
   */
  @JSProperty("itemDistance")
  void setItemDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
   * when the corresponding series or point is hidden. Only a subset of CSS is
   * supported, notably those options related to text. Properties are
   * inherited from <code>style</code> unless overridden here.
   *
   */
  @JSProperty("itemHiddenStyle")
  @Nullable
  CSSObject getItemHiddenStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
   * when the corresponding series or point is hidden. Only a subset of CSS is
   * supported, notably those options related to text. Properties are
   * inherited from <code>style</code> unless overridden here.
   *
   */
  @JSProperty("itemHiddenStyle")
  void setItemHiddenStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
   * in hover mode. Only a subset of CSS is supported, notably those options
   * related to text. Properties are inherited from <code>style</code> unless overridden
   * here.
   *
   */
  @JSProperty("itemHoverStyle")
  @Nullable
  CSSObject getItemHoverStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
   * in hover mode. Only a subset of CSS is supported, notably those options
   * related to text. Properties are inherited from <code>style</code> unless overridden
   * here.
   *
   */
  @JSProperty("itemHoverStyle")
  void setItemHoverStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each
   * legend item.
   *
   */
  @JSProperty("itemMarginBottom")
  double getItemMarginBottom();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each
   * legend item.
   *
   */
  @JSProperty("itemMarginBottom")
  void setItemMarginBottom(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each
   * legend item.
   *
   */
  @JSProperty("itemMarginTop")
  double getItemMarginTop();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each
   * legend item.
   *
   */
  @JSProperty("itemMarginTop")
  void setItemMarginTop(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item.
   * Only a subset of CSS is supported, notably those options related to text.
   * The default <code>textOverflow</code> property makes long texts truncate. Set it to
   * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to
   * control the text width.
   *
   */
  @JSProperty("itemStyle")
  @Nullable
  CSSObject getItemStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item.
   * Only a subset of CSS is supported, notably those options related to text.
   * The default <code>textOverflow</code> property makes long texts truncate. Set it to
   * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to
   * control the text width.
   *
   */
  @JSProperty("itemStyle")
  void setItemStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item.
   * By default the items are laid out successively. In a horizontal layout,
   * if the items are laid out across two rows or more, they will be
   * vertically aligned depending on the legend.alignColumns option.
   *
   */
  @JSProperty("itemWidth")
  double getItemWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item.
   * By default the items are laid out successively. In a horizontal layout,
   * if the items are laid out across two rows or more, they will be
   * vertically aligned depending on the legend.alignColumns option.
   *
   */
  @JSProperty("itemWidth")
  void setItemWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend
   * label. Available variables relates to properties on the series, or the
   * point in case of pies.
   *
   */
  @JSProperty("labelFormat")
  @Nullable
  String getLabelFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend
   * label. Available variables relates to properties on the series, or the
   * point in case of pies.
   *
   */
  @JSProperty("labelFormat")
  void setLabelFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each
   * of the series' labels. The <code>this</code> keyword refers to the series object, or
   * the point object in case of pie charts. By default the series or point
   * name is printed.
   *
   */
  @JSProperty("labelFormatter")
  @Nullable
  Unknown /* FormatterCallbackFunction < ( Point | Series ) > */ getLabelFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each
   * of the series' labels. The <code>this</code> keyword refers to the series object, or
   * the point object in case of pie charts. By default the series or point
   * name is printed.
   *
   */
  @JSProperty("labelFormatter")
  void setLabelFormatter(@Nullable FormatterCallbackFunction<Unknown> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
   * Can be one of <code>horizontal</code> or <code>vertical</code> or <code>proximate</code>. When
   * <code>proximate</code>, the legend items will be placed as close as possible to the
   * graphs they're representing, except in inverted charts or when the legend
   * position doesn't allow it.
   *
   */
  @JSProperty("layout")
  @Nullable
  Layout getLayout();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
   * Can be one of <code>horizontal</code> or <code>vertical</code> or <code>proximate</code>. When
   * <code>proximate</code>, the legend items will be placed as close as possible to the
   * graphs they're representing, except in inverted charts or when the legend
   * position doesn't allow it.
   *
   */
  @JSProperty("layout")
  void setLayout(@Nullable Layout value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is
   * calculated automatically and the legend is not floating, the legend
   * margin is the space between the legend and the axis labels or plot area.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is
   * calculated automatically and the legend is not floating, the legend
   * margin is the space between the legend and the axis labels or plot area.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the
   * legend. When the maximum height is extended, navigation will show.
   *
   */
  @JSProperty("maxHeight")
  double getMaxHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the
   * legend. When the maximum height is extended, navigation will show.
   *
   */
  @JSProperty("maxHeight")
  void setMaxHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or
   * navigation appearing when the legend is overflown. Navigation works well
   * on screen, but not in static exported images. One way of working around
   * that is to increase the chart height in export.
   *
   */
  @JSProperty("navigation")
  @Nullable
  LegendNavigationOptions getNavigation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or
   * navigation appearing when the legend is overflown. Navigation works well
   * on screen, but not in static exported images. One way of working around
   * that is to increase the chart height in export.
   *
   */
  @JSProperty("navigation")
  void setNavigation(@Nullable LegendNavigationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend
   * box.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend
   * box.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of
   * the legend items compared to the order of the series or points as defined
   * in the configuration object.
   *
   */
  @JSProperty("reversed")
  boolean getReversed();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of
   * the legend items compared to the order of the series or points as defined
   * in the configuration object.
   *
   */
  @JSProperty("reversed")
  void setReversed(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on
   * the right side of the text rather than the left side. This is common in
   * Arabic and Hebraic.
   *
   */
  @JSProperty("rtl")
  boolean getRtl();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on
   * the right side of the text rather than the left side. This is common in
   * Arabic and Hebraic.
   *
   */
  @JSProperty("rtl")
  void setRtl(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the legend. A <code>backgroundColor</code> also needs to be applied for this to
   * take effect. The shadow can be an object configuration containing
   * <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | CSSObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the legend. A <code>backgroundColor</code> also needs to be applied for this to
   * take effect. The shadow can be an object configuration containing
   * <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
   * to the legend. A <code>backgroundColor</code> also needs to be applied for this to
   * take effect. The shadow can be an object configuration containing
   * <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend
   * symbol width will be the same as the symbol height, which in turn
   * defaults to the font size of the legend items.
   *
   */
  @JSProperty("squareSymbol")
  boolean getSquareSymbol();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend
   * symbol width will be the same as the symbol height, which in turn
   * defaults to the font size of the legend items.
   *
   */
  @JSProperty("squareSymbol")
  void setSquareSymbol(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol
   * for series types that use a rectangle in the legend. Defaults to the font
   * size of legend items.
   *
   */
  @JSProperty("symbolHeight")
  double getSymbolHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol
   * for series types that use a rectangle in the legend. Defaults to the font
   * size of legend items.
   *
   */
  @JSProperty("symbolHeight")
  void setSymbolHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the
   * legend item symbol and the legend item text.
   *
   */
  @JSProperty("symbolPadding")
  double getSymbolPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the
   * legend item symbol and the legend item text.
   *
   */
  @JSProperty("symbolPadding")
  void setSymbolPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol
   * for series types that use a rectangle in the legend. Defaults to half the
   * <code>symbolHeight</code>.
   *
   */
  @JSProperty("symbolRadius")
  double getSymbolRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol
   * for series types that use a rectangle in the legend. Defaults to half the
   * <code>symbolHeight</code>.
   *
   */
  @JSProperty("symbolRadius")
  void setSymbolRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend
   * item symbol. When the <code>squareSymbol</code> option is set, this defaults to the
   * <code>symbolHeight</code>, otherwise 16.
   *
   */
  @JSProperty("symbolWidth")
  double getSymbolWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend
   * item symbol. When the <code>squareSymbol</code> option is set, this defaults to the
   * <code>symbolHeight</code>, otherwise 16.
   *
   */
  @JSProperty("symbolWidth")
  void setSymbolWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of
   * the legend.
   *
   */
  @JSProperty("title")
  @Nullable
  LegendTitleOptions getTitle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of
   * the legend.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable LegendTitleOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the legend item texts.
   *
   * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the legend item texts.
   *
   * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * legend box. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. Vertical position
   * can be further determined by the <code>y</code> option.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   * When the layout option is <code>proximate</code>, the <code>verticalAlign</code> option doesn't
   * apply.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
   * legend box. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. Vertical position
   * can be further determined by the <code>y</code> option.
   *
   * In the case that the legend is aligned in a corner position, the <code>layout</code>
   * option will determine whether to place it above/below or on the side of
   * the plot area.
   *
   * When the layout option is <code>proximate</code>, the <code>verticalAlign</code> option doesn't
   * apply.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
   * a number is set, it translates to pixels. Since v7.0.2 it allows setting
   * a percent string of the full chart width, for example <code>40%</code>.
   *
   * Defaults to the full chart width from legends below or above the chart,
   * half the chart width for legends to the left and right.
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown /* ( number | string ) */ getWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
   * a number is set, it translates to pixels. Since v7.0.2 it allows setting
   * a percent string of the full chart width, for example <code>40%</code>.
   *
   * Defaults to the full chart width from legends below or above the chart,
   * half the chart width for legends to the left and right.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
   * a number is set, it translates to pixels. Since v7.0.2 it allows setting
   * a percent string of the full chart width, for example <code>40%</code>.
   *
   * Defaults to the full chart width from legends below or above the chart,
   * half the chart width for legends to the left and right.
   *
   */
  @JSProperty("width")
  void setWidth(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend
   * relative to its horizontal alignment <code>align</code> within chart.spacingLeft and
   * chart.spacingRight. Negative x moves it to the left, positive x moves it
   * to the right.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend
   * relative to its horizontal alignment <code>align</code> within chart.spacingLeft and
   * chart.spacingRight. Negative x moves it to the left, positive x moves it
   * to the right.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
   * legend relative to it's vertical alignment <code>verticalAlign</code> within
   * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
   * positive y moves it down.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
   * legend relative to it's vertical alignment <code>verticalAlign</code> within
   * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
   * positive y moves it down.
   *
   */
  @JSProperty("y")
  void setY(double value);

  abstract class Layout extends JsEnum {
    public static final Layout HORIZONTAL = JsEnum.of("horizontal");

    public static final Layout PROXIMATE = JsEnum.of("proximate");

    public static final Layout VERTICAL = JsEnum.of("vertical");
  }

  class Builder {
    private final LegendOptions object = Any.empty();

    public LegendOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
     * legend. Requires the Accessibility module.
     *
     */
    public Builder accessibility(@Nullable LegendAccessibilityOptions value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * legend box within the chart area. Valid values are <code>left</code>, <code>center</code> and
     * <code>right</code>.
     *
     * In the case that the legend is aligned in a corner position, the <code>layout</code>
     * option will determine whether to place it above/below or on the side of
     * the plot area.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) If the layout is <code>horizontal</code>
     * and the legend items span over two lines or more, whether to align the
     * items into vertical columns. Setting this to <code>false</code> makes room for more
     * items, but will look more messy.
     *
     */
    public Builder alignColumns(boolean value) {
      object.setAlignColumns(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
     * legend.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
     * legend.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
     * legend.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
     * around the legend.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
     * around the legend.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
     * around the legend.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the
     * legend.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border
     * around the legend.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The bubble legend is an additional
     * element in legend which presents the scale of the bubble series.
     * Individual bubble ranges can be defined by user or calculated from
     * series. In the case of automatically calculated ranges, a 1px margin of
     * error is permitted.
     *
     */
    public Builder bubbleLegend(@Nullable LegendBubbleLegendOptions value) {
      object.setBubbleLegend(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend.
     * There is also a series-specific option, showInLegend, that can hide the
     * series from the legend. In some series types this is <code>false</code> by default,
     * so it must set to <code>true</code> in order to show the legend for the series.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the
     * plot area ignores it and is allowed to be placed below it.
     *
     */
    public Builder floating(boolean value) {
      object.setFloating(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox
     * next to a legend item when <code>showCheckbox</code> is true.
     *
     */
    public Builder itemCheckboxStyle(@Nullable CSSObject value) {
      object.setItemCheckboxStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal
     * layout, the itemDistance defines the pixel distance between each item.
     *
     */
    public Builder itemDistance(double value) {
      object.setItemDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
     * when the corresponding series or point is hidden. Only a subset of CSS is
     * supported, notably those options related to text. Properties are
     * inherited from <code>style</code> unless overridden here.
     *
     */
    public Builder itemHiddenStyle(@Nullable CSSObject value) {
      object.setItemHiddenStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
     * in hover mode. Only a subset of CSS is supported, notably those options
     * related to text. Properties are inherited from <code>style</code> unless overridden
     * here.
     *
     */
    public Builder itemHoverStyle(@Nullable CSSObject value) {
      object.setItemHoverStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each
     * legend item.
     *
     */
    public Builder itemMarginBottom(double value) {
      object.setItemMarginBottom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each
     * legend item.
     *
     */
    public Builder itemMarginTop(double value) {
      object.setItemMarginTop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item.
     * Only a subset of CSS is supported, notably those options related to text.
     * The default <code>textOverflow</code> property makes long texts truncate. Set it to
     * <code>undefined</code> to wrap text instead. A <code>width</code> property can be added to
     * control the text width.
     *
     */
    public Builder itemStyle(@Nullable CSSObject value) {
      object.setItemStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item.
     * By default the items are laid out successively. In a horizontal layout,
     * if the items are laid out across two rows or more, they will be
     * vertically aligned depending on the legend.alignColumns option.
     *
     */
    public Builder itemWidth(double value) {
      object.setItemWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend
     * label. Available variables relates to properties on the series, or the
     * point in case of pies.
     *
     */
    public Builder labelFormat(@Nullable String value) {
      object.setLabelFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each
     * of the series' labels. The <code>this</code> keyword refers to the series object, or
     * the point object in case of pie charts. By default the series or point
     * name is printed.
     *
     */
    public Builder labelFormatter(@Nullable FormatterCallbackFunction<Unknown> value) {
      object.setLabelFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
     * Can be one of <code>horizontal</code> or <code>vertical</code> or <code>proximate</code>. When
     * <code>proximate</code>, the legend items will be placed as close as possible to the
     * graphs they're representing, except in inverted charts or when the legend
     * position doesn't allow it.
     *
     */
    public Builder layout(@Nullable Layout value) {
      object.setLayout(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is
     * calculated automatically and the legend is not floating, the legend
     * margin is the space between the legend and the axis labels or plot area.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the
     * legend. When the maximum height is extended, navigation will show.
     *
     */
    public Builder maxHeight(double value) {
      object.setMaxHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or
     * navigation appearing when the legend is overflown. Navigation works well
     * on screen, but not in static exported images. One way of working around
     * that is to increase the chart height in export.
     *
     */
    public Builder navigation(@Nullable LegendNavigationOptions value) {
      object.setNavigation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend
     * box.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of
     * the legend items compared to the order of the series or points as defined
     * in the configuration object.
     *
     */
    public Builder reversed(boolean value) {
      object.setReversed(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on
     * the right side of the text rather than the left side. This is common in
     * Arabic and Hebraic.
     *
     */
    public Builder rtl(boolean value) {
      object.setRtl(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the legend. A <code>backgroundColor</code> also needs to be applied for this to
     * take effect. The shadow can be an object configuration containing
     * <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the legend. A <code>backgroundColor</code> also needs to be applied for this to
     * take effect. The shadow can be an object configuration containing
     * <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable CSSObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend
     * symbol width will be the same as the symbol height, which in turn
     * defaults to the font size of the legend items.
     *
     */
    public Builder squareSymbol(boolean value) {
      object.setSquareSymbol(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol
     * for series types that use a rectangle in the legend. Defaults to the font
     * size of legend items.
     *
     */
    public Builder symbolHeight(double value) {
      object.setSymbolHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the
     * legend item symbol and the legend item text.
     *
     */
    public Builder symbolPadding(double value) {
      object.setSymbolPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol
     * for series types that use a rectangle in the legend. Defaults to half the
     * <code>symbolHeight</code>.
     *
     */
    public Builder symbolRadius(double value) {
      object.setSymbolRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend
     * item symbol. When the <code>squareSymbol</code> option is set, this defaults to the
     * <code>symbolHeight</code>, otherwise 16.
     *
     */
    public Builder symbolWidth(double value) {
      object.setSymbolWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of
     * the legend.
     *
     */
    public Builder title(@Nullable LegendTitleOptions value) {
      object.setTitle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the legend item texts.
     *
     * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * legend box. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. Vertical position
     * can be further determined by the <code>y</code> option.
     *
     * In the case that the legend is aligned in a corner position, the <code>layout</code>
     * option will determine whether to place it above/below or on the side of
     * the plot area.
     *
     * When the layout option is <code>proximate</code>, the <code>verticalAlign</code> option doesn't
     * apply.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
     * a number is set, it translates to pixels. Since v7.0.2 it allows setting
     * a percent string of the full chart width, for example <code>40%</code>.
     *
     * Defaults to the full chart width from legends below or above the chart,
     * half the chart width for legends to the left and right.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
     * a number is set, it translates to pixels. Since v7.0.2 it allows setting
     * a percent string of the full chart width, for example <code>40%</code>.
     *
     * Defaults to the full chart width from legends below or above the chart,
     * half the chart width for legends to the left and right.
     *
     */
    public Builder width(@Nullable String value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend
     * relative to its horizontal alignment <code>align</code> within chart.spacingLeft and
     * chart.spacingRight. Negative x moves it to the left, positive x moves it
     * to the right.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
     * legend relative to it's vertical alignment <code>verticalAlign</code> within
     * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
     * positive y moves it down.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
