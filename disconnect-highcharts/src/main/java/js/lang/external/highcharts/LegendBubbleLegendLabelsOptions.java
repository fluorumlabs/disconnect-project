package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendBubbleLegendLabelsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
   * the bubble legend. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
   * the bubble legend. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
   * overlap.
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
   * overlap.
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) An additional class name to apply to
   * the bubble legend label graphical elements. This option does not replace
   * default class names of the graphical element.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps) An additional class name to apply to
   * the bubble legend label graphical elements. This option does not replace
   * default class names of the graphical element.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
   * labels. Available variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  @Nullable
  String getFormat();

  /**
   * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
   * labels. Available variables are the same as for <code>formatter</code>.
   *
   */
  @JSProperty("format")
  void setFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) Available <code>this</code> properties are:
   *
   * <ul>
   * <li>
   * <code>this.value</code>: The bubble value.
   *
   * </li>
   * <li>
   * <code>this.radius</code>: The radius of the bubble range.
   *
   * </li>
   * <li>
   * <code>this.center</code>: The center y position of the range.
   *
   * </li>
   * </ul>
   */
  @JSProperty("formatter")
  @Nullable
  FormatterCallbackFunction<BubbleLegendFormatterContextObject> getFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Available <code>this</code> properties are:
   *
   * <ul>
   * <li>
   * <code>this.value</code>: The bubble value.
   *
   * </li>
   * <li>
   * <code>this.radius</code>: The radius of the bubble range.
   *
   * </li>
   * <li>
   * <code>this.center</code>: The center y position of the range.
   *
   * </li>
   * </ul>
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable FormatterCallbackFunction<BubbleLegendFormatterContextObject> value);

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The x position offset of the label
   * relative to the connector.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps) The x position offset of the label
   * relative to the connector.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The y position offset of the label
   * relative to the connector.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps) The y position offset of the label
   * relative to the connector.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LegendBubbleLegendLabelsOptions object = Any.empty();

    private Builder() {
    }

    public LegendBubbleLegendLabelsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
     * the bubble legend. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
     * overlap.
     *
     */
    public Builder allowOverlap(boolean value) {
      object.setAllowOverlap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) An additional class name to apply to
     * the bubble legend label graphical elements. This option does not replace
     * default class names of the graphical element.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
     * labels. Available variables are the same as for <code>formatter</code>.
     *
     */
    public Builder format(@Nullable String value) {
      object.setFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Available <code>this</code> properties are:
     *
     * <ul>
     * <li>
     * <code>this.value</code>: The bubble value.
     *
     * </li>
     * <li>
     * <code>this.radius</code>: The radius of the bubble range.
     *
     * </li>
     * <li>
     * <code>this.center</code>: The center y position of the range.
     *
     * </li>
     * </ul>
     */
    public Builder formatter(
        @Nullable FormatterCallbackFunction<BubbleLegendFormatterContextObject> value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The x position offset of the label
     * relative to the connector.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The y position offset of the label
     * relative to the connector.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
