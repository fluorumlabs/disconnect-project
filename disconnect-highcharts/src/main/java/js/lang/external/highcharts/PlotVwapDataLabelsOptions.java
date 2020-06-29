package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | ShadowOptionsObject ) */;
import js.lang.Unknown /* ( boolean | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data labels,
 * appearing next to each data point.
 *
 * Since v6.2.0, multiple data labels can be applied to each single point by
 * defining them as an array of configs.
 *
 * In styled mode, the data labels can be styled with the
 * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names (see
 * example).
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotVwapDataLabelsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the data label
   * compared to the point. If <code>right</code>, the right side of the label should be
   * touching the point. For points with an extent, like columns, the
   * alignments also dictates how to align it inside the box, as given with
   * the inside option. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the data label
   * compared to the point. If <code>right</code>, the right side of the label should be
   * touching the point. For points with an extent, like columns, the
   * alignments also dictates how to align it inside the box, as given with
   * the inside option. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow data labels to
   * overlap. To make the labels less sensitive for overlapping, the
   * dataLabels.padding can be set to 0.
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow data labels to
   * overlap. To make the labels less sensitive for overlapping, the
   * dataLabels.padding can be set to 0.
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBackgroundColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
   * for the data label.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
   * label. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
   * the data label.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
   * the data label.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
   * the data label.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
   * the data label.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
   * Particularly in styled mode, this can be used to give each series' or
   * point's data label unique styling. In addition to this option, a default
   * color class name is added so that we can give the labels a contrast text
   * shadow.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
   * Particularly in styled mode, this can be used to give each series' or
   * point's data label unique styling. In addition to this option, a default
   * color class name is added so that we can give the labels a contrast text
   * shadow.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
   * labels. Defaults to <code>undefined</code>. For certain series types, like column or
   * map, the data labels can be drawn inside the points. In this case the
   * data label will be drawn with maximum contrast by default. Additionally,
   * it will be given a <code>text-outline</code> style with the opposite color, to
   * further increase the contrast. This can be overridden by setting the
   * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
   * are outside the plot area. By default, the data label is moved inside the
   * plot area according to the overflow option.
   *
   */
  @JSProperty("crop")
  boolean getCrop();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
   * are outside the plot area. By default, the data label is moved inside the
   * plot area according to the overflow option.
   *
   */
  @JSProperty("crop")
  void setCrop(boolean value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
   * labels until the initial series animation has finished.
   *
   */
  @JSProperty("defer")
  boolean getDefer();

  /**
   * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
   * labels until the initial series animation has finished.
   *
   */
  @JSProperty("defer")
  void setDefer(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
   * labels.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
   * labels.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
   * of which data labels to display. The declarative filter is designed for
   * use when callback functions are not available, like when the chart
   * options require a pure JSON structure or for use with graphical editors.
   * For programmatic control, use the <code>formatter</code> instead, and return
   * <code>undefined</code> to disable a single data label.
   *
   */
  @JSProperty("filter")
  @Nullable
  DataLabelsFilterOptionsObject getFilter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
   * of which data labels to display. The declarative filter is designed for
   * use when callback functions are not available, like when the chart
   * options require a pure JSON structure or for use with graphical editors.
   * For programmatic control, use the <code>formatter</code> instead, and return
   * <code>undefined</code> to disable a single data label.
   *
   */
  @JSProperty("filter")
  void setFilter(@Nullable DataLabelsFilterOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
   * label. Available variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
   * label. Available variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
   * format the data label. Note that if a <code>format</code> is defined, the format
   * takes precedence and the formatter is ignored.
   *
   */
  @JSProperty("formatter")
  @Nullable
  DataLabelsFormatterCallbackFunction getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
   * format the data label. Note that if a <code>format</code> is defined, the format
   * takes precedence and the formatter is ignored.
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable DataLabelsFormatterCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) For points with an extent, like
   * columns or map areas, whether to align the data label inside the box or
   * to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in
   * stacked columns.
   *
   */
  @JSProperty("inside")
  boolean getInside();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) For points with an extent, like
   * columns or map areas, whether to align the data label inside the box or
   * to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in
   * stacked columns.
   *
   */
  @JSProperty("inside")
  void setInside(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
   * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormat")
  @Nullable
  Unknown /* ( boolean | string ) */ getNullFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
   * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormat")
  void setNullFormat(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
   * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormat")
  void setNullFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
   * that defines formatting for points with the value of null. Works
   * analogously to formatter. <code>nullPointFormatter</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormatter")
  @Nullable
  DataLabelsFormatterCallbackFunction getNullFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
   * that defines formatting for points with the value of null. Works
   * analogously to formatter. <code>nullPointFormatter</code> can be applied only to
   * series which support displaying null points.
   *
   */
  @JSProperty("nullFormatter")
  void setNullFormatter(@Nullable DataLabelsFormatterCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
   * flow outside the plot area. The default is <code>&quot;justify&quot;</code>, which aligns them
   * inside the plot area. For columns and bars, this means it will be moved
   * inside the bar. To display data labels outside the plot area, set <code>crop</code>
   * to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.
   *
   */
  @JSProperty("overflow")
  @Nullable
  Overflow getOverflow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
   * flow outside the plot area. The default is <code>&quot;justify&quot;</code>, which aligns them
   * inside the plot area. For columns and bars, this means it will be moved
   * inside the bar. To display data labels outside the plot area, set <code>crop</code>
   * to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.
   *
   */
  @JSProperty("overflow")
  void setOverflow(@Nullable Overflow value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When either the <code>borderWidth</code> or
   * the <code>backgroundColor</code> is set, this is the padding within the box.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When either the <code>borderWidth</code> or
   * the <code>backgroundColor</code> is set, this is the padding within the box.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
   * points. If <code>center</code> alignment is not possible, it defaults to <code>right</code>.
   *
   */
  @JSProperty("position")
  @Nullable
  Position getPosition();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
   * points. If <code>center</code> alignment is not possible, it defaults to <code>right</code>.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable Position value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
   * that due to a more complex structure, backgrounds, borders and padding
   * will be lost on a rotated data label.
   *
   */
  @JSProperty("rotation")
  double getRotation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
   * that due to a more complex structure, backgrounds, borders and padding
   * will be lost on a rotated data label.
   *
   */
  @JSProperty("rotation")
  void setRotation(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
   * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  @Nullable
  Unknown /* ( boolean | ShadowOptionsObject ) */ getShadow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
   * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
   * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
   * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
   * <code>opacity</code> and <code>width</code>.
   *
   */
  @JSProperty("shadow")
  void setShadow(@Nullable ShadowOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the label. Symbols are predefined functions on the
   * Renderer object.
   *
   */
  @JSProperty("shape")
  @Nullable
  String getShape();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
   * the border around the label. Symbols are predefined functions on the
   * Renderer object.
   *
   */
  @JSProperty("shape")
  void setShape(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
   * default <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that
   * Highcharts picks up and applies the maximum contrast to the underlying
   * point item, for example the bar in a bar chart.
   *
   * The <code>textOutline</code> is a pseudo property that applies an outline of the
   * given width with the given color, which by default is the maximum
   * contrast to the text. So a bright text color will result in a black text
   * outline for maximum readability on a mixed background. In some cases,
   * especially with grayscale text, the text outline doesn't work well, in
   * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
   * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
   * effect can be acheived through the <code>text-shadow</code> CSS property.
   *
   * For some series types, where each point has an extent, like for example
   * tree maps, the data label may overflow the point. There are two
   * strategies for handling overflow. By default, the text will wrap to
   * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
   * <code>ellipsis</code>, which will keep the text on one line plus it will break
   * inside long words.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
   * default <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that
   * Highcharts picks up and applies the maximum contrast to the underlying
   * point item, for example the bar in a bar chart.
   *
   * The <code>textOutline</code> is a pseudo property that applies an outline of the
   * given width with the given color, which by default is the maximum
   * contrast to the text. So a bright text color will result in a black text
   * outline for maximum readability on a mixed background. In some cases,
   * especially with grayscale text, the text outline doesn't work well, in
   * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
   * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
   * effect can be acheived through the <code>text-shadow</code> CSS property.
   *
   * For some series types, where each point has an extent, like for example
   * tree maps, the data label may overflow the point. There are two
   * strategies for handling overflow. By default, the text will wrap to
   * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
   * <code>ellipsis</code>, which will keep the text on one line plus it will break
   * inside long words.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
   * should follow marker's shape. Border and background are disabled for a
   * label that follows a path.
   *
   * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code>
   * to true will disable this option.
   *
   */
  @JSProperty("textPath")
  @Nullable
  DataLabelsTextPathOptionsObject getTextPath();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
   * should follow marker's shape. Border and background are disabled for a
   * label that follows a path.
   *
   * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code>
   * to true will disable this option.
   *
   */
  @JSProperty("textPath")
  void setTextPath(@Nullable DataLabelsTextPathOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the labels.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
   * the labels.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
   * label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value
   * depends on the data, for instance in a column chart, the label is above
   * positive values and below negative values.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
   * label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value
   * depends on the data, for instance in a column chart, the label is above
   * positive values and below negative values.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
   * label relative to the point in pixels.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
   * The default Z index puts it above the series. Use a Z index of 2 to
   * display it behind the series.
   *
   */
  @JSProperty("z")
  double getZ();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
   * The default Z index puts it above the series. Use a Z index of 2 to
   * display it behind the series.
   *
   */
  @JSProperty("z")
  void setZ(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotVwapDataLabelsOptions object = Any.empty();

    private Builder() {
    }

    public PlotVwapDataLabelsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the data label
     * compared to the point. If <code>right</code>, the right side of the label should be
     * touching the point. For points with an extent, like columns, the
     * alignments also dictates how to align it inside the box, as given with
     * the inside option. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow data labels to
     * overlap. To make the labels less sensitive for overlapping, the
     * dataLabels.padding can be set to 0.
     *
     */
    public Builder allowOverlap(boolean value) {
      object.setAllowOverlap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     *
     */
    public Builder backgroundColor(@Nullable PatternObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     *
     */
    public Builder backgroundColor(@Nullable GradientColorObject value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to <code>undefined</code>.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
     * the data label.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
     * the data label.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
     * Particularly in styled mode, this can be used to give each series' or
     * point's data label unique styling. In addition to this option, a default
     * color class name is added so that we can give the labels a contrast text
     * shadow.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to <code>undefined</code>. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a <code>text-outline</code> style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to <code>undefined</code>. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a <code>text-outline</code> style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to <code>undefined</code>. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a <code>text-outline</code> style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
     * are outside the plot area. By default, the data label is moved inside the
     * plot area according to the overflow option.
     *
     */
    public Builder crop(boolean value) {
      object.setCrop(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
     * labels until the initial series animation has finished.
     *
     */
    public Builder defer(boolean value) {
      object.setDefer(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
     * labels.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
     * of which data labels to display. The declarative filter is designed for
     * use when callback functions are not available, like when the chart
     * options require a pure JSON structure or for use with graphical editors.
     * For programmatic control, use the <code>formatter</code> instead, and return
     * <code>undefined</code> to disable a single data label.
     *
     */
    public Builder filter(@Nullable DataLabelsFilterOptionsObject value) {
      object.setFilter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
     * label. Available variables are the same as for <code>formatter</code>.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
     * format the data label. Note that if a <code>format</code> is defined, the format
     * takes precedence and the formatter is ignored.
     *
     */
    public Builder formatter(@Nullable DataLabelsFormatterCallbackFunction value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) For points with an extent, like
     * columns or map areas, whether to align the data label inside the box or
     * to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in
     * stacked columns.
     *
     */
    public Builder inside(boolean value) {
      object.setInside(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
     * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
     * series which support displaying null points.
     *
     */
    public Builder nullFormat(boolean value) {
      object.setNullFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
     * of null. Works analogously to format. <code>nullFormat</code> can be applied only to
     * series which support displaying null points.
     *
     */
    public Builder nullFormat(@Nullable String value) {
      object.setNullFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
     * that defines formatting for points with the value of null. Works
     * analogously to formatter. <code>nullPointFormatter</code> can be applied only to
     * series which support displaying null points.
     *
     */
    public Builder nullFormatter(@Nullable DataLabelsFormatterCallbackFunction value) {
      object.setNullFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
     * flow outside the plot area. The default is <code>&quot;justify&quot;</code>, which aligns them
     * inside the plot area. For columns and bars, this means it will be moved
     * inside the bar. To display data labels outside the plot area, set <code>crop</code>
     * to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.
     *
     */
    public Builder overflow(@Nullable Overflow value) {
      object.setOverflow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When either the <code>borderWidth</code> or
     * the <code>backgroundColor</code> is set, this is the padding within the box.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
     * points. If <code>center</code> alignment is not possible, it defaults to <code>right</code>.
     *
     */
    public Builder position(@Nullable Position value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
     * that due to a more complex structure, backgrounds, borders and padding
     * will be lost on a rotated data label.
     *
     */
    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
     * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
     * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(boolean value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
     * best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be
     * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
     * <code>opacity</code> and <code>width</code>.
     *
     */
    public Builder shadow(@Nullable ShadowOptionsObject value) {
      object.setShadow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the label. Symbols are predefined functions on the
     * Renderer object.
     *
     */
    public Builder shape(@Nullable String value) {
      object.setShape(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
     * default <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that
     * Highcharts picks up and applies the maximum contrast to the underlying
     * point item, for example the bar in a bar chart.
     *
     * The <code>textOutline</code> is a pseudo property that applies an outline of the
     * given width with the given color, which by default is the maximum
     * contrast to the text. So a bright text color will result in a black text
     * outline for maximum readability on a mixed background. In some cases,
     * especially with grayscale text, the text outline doesn't work well, in
     * which cases it can be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code>
     * is true, the <code>textOutline</code> will not be picked up. In this, case, the same
     * effect can be acheived through the <code>text-shadow</code> CSS property.
     *
     * For some series types, where each point has an extent, like for example
     * tree maps, the data label may overflow the point. There are two
     * strategies for handling overflow. By default, the text will wrap to
     * multiple lines. The other strategy is to set <code>style.textOverflow</code> to
     * <code>ellipsis</code>, which will keep the text on one line plus it will break
     * inside long words.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
     * should follow marker's shape. Border and background are disabled for a
     * label that follows a path.
     *
     * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code>
     * to true will disable this option.
     *
     */
    public Builder textPath(@Nullable DataLabelsTextPathOptionsObject value) {
      object.setTextPath(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the labels.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
     * label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value
     * depends on the data, for instance in a column chart, the label is above
     * positive values and below negative values.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
     * label relative to the point in pixels.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
     * label relative to the point in pixels.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
     * The default Z index puts it above the series. Use a Z index of 2 to
     * display it behind the series.
     *
     */
    public Builder z(double value) {
      object.setZ(value);
      return this;
    }
  }
}
