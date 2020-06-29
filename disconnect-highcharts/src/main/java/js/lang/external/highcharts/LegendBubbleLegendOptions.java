package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The bubble legend is an additional element
 * in legend which presents the scale of the bubble series. Individual bubble
 * ranges can be defined by user or calculated from series. In the case of
 * automatically calculated ranges, a 1px margin of error is permitted.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendBubbleLegendOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
   * also defined for an individual range.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBorderColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
   * also defined for an individual range.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
   * also defined for an individual range.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
   * also defined for an individual range.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
   * pixels, can be also defined for an individual range.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
   * pixels, can be also defined for an individual range.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) An additional class name to apply to
   * the bubble legend' circle graphical elements. This option does not
   * replace default class names of the graphical element.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highstock, Highmaps) An additional class name to apply to
   * the bubble legend' circle graphical elements. This option does not
   * replace default class names of the graphical element.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
   * Applies to ranges, if individual color is not defined.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
   * Applies to ranges, if individual color is not defined.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
   * Applies to ranges, if individual color is not defined.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
   * Applies to ranges, if individual color is not defined.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) An additional class name to apply to
   * the bubble legend's connector graphical elements. This option does not
   * replace default class names of the graphical element.
   *
   */
  @JSProperty("connectorClassName")
  @Nullable
  String getConnectorClassName();

  /**
   * (Highcharts, Highstock, Highmaps) An additional class name to apply to
   * the bubble legend's connector graphical elements. This option does not
   * replace default class names of the graphical element.
   *
   */
  @JSProperty("connectorClassName")
  void setConnectorClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
   * defined for an individual range.
   *
   */
  @JSProperty("connectorColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getConnectorColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
   * defined for an individual range.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
   * defined for an individual range.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
   * defined for an individual range.
   *
   */
  @JSProperty("connectorColor")
  void setConnectorColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
   * If labels are centered, the distance is reduced to 0.
   *
   */
  @JSProperty("connectorDistance")
  double getConnectorDistance();

  /**
   * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
   * If labels are centered, the distance is reduced to 0.
   *
   */
  @JSProperty("connectorDistance")
  void setConnectorDistance(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
   *
   */
  @JSProperty("connectorWidth")
  double getConnectorWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
   *
   */
  @JSProperty("connectorWidth")
  void setConnectorWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
   *
   */
  @JSProperty("labels")
  @Nullable
  LegendBubbleLegendLabelsOptions getLabels();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
   *
   */
  @JSProperty("labels")
  void setLabels(@Nullable LegendBubbleLegendLabelsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
   * the legend.
   *
   */
  @JSProperty("legendIndex")
  double getLegendIndex();

  /**
   * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
   * the legend.
   *
   */
  @JSProperty("legendIndex")
  void setLegendIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
   * values for ranges are not specified, the <code>minSize</code> and the <code>maxSize</code> are
   * calculated from bubble series.
   *
   */
  @JSProperty("maxSize")
  double getMaxSize();

  /**
   * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
   * values for ranges are not specified, the <code>minSize</code> and the <code>maxSize</code> are
   * calculated from bubble series.
   *
   */
  @JSProperty("maxSize")
  void setMaxSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
   * values for ranges are not specified, the <code>minSize</code> and the <code>maxSize</code> are
   * calculated from bubble series.
   *
   */
  @JSProperty("minSize")
  double getMinSize();

  /**
   * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
   * values for ranges are not specified, the <code>minSize</code> and the <code>maxSize</code> are
   * calculated from bubble series.
   *
   */
  @JSProperty("minSize")
  void setMinSize(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for specific range. One range
   * consists of bubble, label and connector.
   *
   */
  @JSProperty("ranges")
  @Nullable
  LegendBubbleLegendRangesOptions[] getRanges();

  /**
   * (Highcharts, Highstock, Highmaps) Options for specific range. One range
   * consists of bubble, label and connector.
   *
   */
  @JSProperty("ranges")
  void setRanges(LegendBubbleLegendRangesOptions... value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
   * should be represented by the area or the width of the bubble. The
   * default, area, corresponds best to the human perception of the size of
   * each bubble.
   *
   */
  @JSProperty("sizeBy")
  @Nullable
  SizeBy getSizeBy();

  /**
   * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
   * should be represented by the area or the width of the bubble. The
   * default, area, corresponds best to the human perception of the size of
   * each bubble.
   *
   */
  @JSProperty("sizeBy")
  void setSizeBy(@Nullable SizeBy value);

  /**
   * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
   * of z determines the size of the bubble. This means that with the default
   * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
   * of value 1, while a bubble of value 0 will have a smaller size according
   * to minSize.
   *
   */
  @JSProperty("sizeByAbsoluteValue")
  boolean getSizeByAbsoluteValue();

  /**
   * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
   * of z determines the size of the bubble. This means that with the default
   * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
   * of value 1, while a bubble of value 0 will have a smaller size according
   * to minSize.
   *
   */
  @JSProperty("sizeByAbsoluteValue")
  void setSizeByAbsoluteValue(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
   * legend.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
   * legend.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
   * zThreshold, are skipped.
   *
   */
  @JSProperty("zThreshold")
  double getZThreshold();

  /**
   * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
   * zThreshold, are skipped.
   *
   */
  @JSProperty("zThreshold")
  void setZThreshold(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LegendBubbleLegendOptions object = Any.empty();

    private Builder() {
    }

    public LegendBubbleLegendOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
     * also defined for an individual range.
     *
     */
    public Builder borderColor(@Nullable PatternObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
     * also defined for an individual range.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
     * also defined for an individual range.
     *
     */
    public Builder borderColor(@Nullable GradientColorObject value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
     * pixels, can be also defined for an individual range.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) An additional class name to apply to
     * the bubble legend' circle graphical elements. This option does not
     * replace default class names of the graphical element.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
     * Applies to ranges, if individual color is not defined.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
     * Applies to ranges, if individual color is not defined.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
     * Applies to ranges, if individual color is not defined.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) An additional class name to apply to
     * the bubble legend's connector graphical elements. This option does not
     * replace default class names of the graphical element.
     *
     */
    public Builder connectorClassName(@Nullable String value) {
      object.setConnectorClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
     * defined for an individual range.
     *
     */
    public Builder connectorColor(@Nullable PatternObject value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
     * defined for an individual range.
     *
     */
    public Builder connectorColor(@Nullable String value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
     * defined for an individual range.
     *
     */
    public Builder connectorColor(@Nullable GradientColorObject value) {
      object.setConnectorColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
     * If labels are centered, the distance is reduced to 0.
     *
     */
    public Builder connectorDistance(double value) {
      object.setConnectorDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
     *
     */
    public Builder connectorWidth(double value) {
      object.setConnectorWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
     *
     */
    public Builder labels(@Nullable LegendBubbleLegendLabelsOptions value) {
      object.setLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
     * the legend.
     *
     */
    public Builder legendIndex(double value) {
      object.setLegendIndex(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
     * values for ranges are not specified, the <code>minSize</code> and the <code>maxSize</code> are
     * calculated from bubble series.
     *
     */
    public Builder maxSize(double value) {
      object.setMaxSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
     * values for ranges are not specified, the <code>minSize</code> and the <code>maxSize</code> are
     * calculated from bubble series.
     *
     */
    public Builder minSize(double value) {
      object.setMinSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Options for specific range. One range
     * consists of bubble, label and connector.
     *
     */
    public Builder ranges(LegendBubbleLegendRangesOptions... value) {
      object.setRanges(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
     * should be represented by the area or the width of the bubble. The
     * default, area, corresponds best to the human perception of the size of
     * each bubble.
     *
     */
    public Builder sizeBy(@Nullable SizeBy value) {
      object.setSizeBy(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
     * of z determines the size of the bubble. This means that with the default
     * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
     * of value 1, while a bubble of value 0 will have a smaller size according
     * to minSize.
     *
     */
    public Builder sizeByAbsoluteValue(boolean value) {
      object.setSizeByAbsoluteValue(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
     * legend.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
     * zThreshold, are skipped.
     *
     */
    public Builder zThreshold(double value) {
      object.setZThreshold(value);
      return this;
    }
  }
}
