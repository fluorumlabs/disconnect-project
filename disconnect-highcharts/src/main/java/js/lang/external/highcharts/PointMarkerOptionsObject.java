package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import js.lang.Unknown /* ( string | ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( string | SymbolKeyValue ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the point markers of line-like series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointMarkerOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
   * between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
   * between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
   * between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the marker.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts, Highstock, Highmaps) The color of the marker.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the marker.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps) The color of the marker.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock) Enable or disable the point marker. If
   * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
   * more widespread data points.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) The threshold for how dense the point markers
   * should be before they are hidden, given that <code>enabled</code> is not defined.
   * The number indicates the horizontal distance between the two closest
   * points in the series, as multiples of the <code>marker.radius</code>. In other
   * words, the default value of 2 means points are hidden if overlapping
   * horizontally.
   *
   */
  @JSProperty("enabledThreshold")
  double getEnabledThreshold();

  /**
   * (Highcharts, Highstock) The threshold for how dense the point markers
   * should be before they are hidden, given that <code>enabled</code> is not defined.
   * The number indicates the horizontal distance between the two closest
   * points in the series, as multiples of the <code>marker.radius</code>. In other
   * words, the default value of 2 means points are hidden if overlapping
   * horizontally.
   *
   */
  @JSProperty("enabledThreshold")
  void setEnabledThreshold(double value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFillColor();

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The fill color of the point marker. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts) The fill opacity of the bubble markers.
   *
   */
  @JSProperty("fillOpacity")
  double getFillOpacity();

  /**
   * (Highcharts) The fill opacity of the bubble markers.
   *
   */
  @JSProperty("fillOpacity")
  void setFillOpacity(double value);

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>width</code> must also be set.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  Unknown /* ( string | ColorString | GradientColorObject | PatternObject ) */ getLineColor();

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highcharts, Highstock) The color of the point marker's outline. When
   * <code>undefined</code>, the series' or point's color is used.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highcharts, Highstock) The width of the point marker's outline.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * (Highcharts, Highstock) The radius of the point marker.
   *
   */
  @JSProperty("radius")
  double getRadius();

  /**
   * (Highcharts, Highstock) The radius of the point marker.
   *
   */
  @JSProperty("radius")
  void setRadius(double value);

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   */
  @JSProperty("states")
  @Nullable
  PointStatesOptionsObject getStates();

  /**
   * (Highcharts, Highstock) States for a single point marker.
   *
   */
  @JSProperty("states")
  void setStates(@Nullable PointStatesOptionsObject value);

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are <code>'circle'</code>, <code>'square'</code>,<code>'diamond'</code>, <code>'triangle'</code> and
   * <code>'triangle-down'</code>.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>'url(graphic.png)'</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   */
  @JSProperty("symbol")
  @Nullable
  Unknown /* ( string | SymbolKeyValue ) */ getSymbol();

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are <code>'circle'</code>, <code>'square'</code>,<code>'diamond'</code>, <code>'triangle'</code> and
   * <code>'triangle-down'</code>.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>'url(graphic.png)'</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   */
  @JSProperty("symbol")
  void setSymbol(@Nullable Symbol value);

  /**
   * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
   * undefined, the symbol is pulled from options.symbols. Other possible
   * values are <code>'circle'</code>, <code>'square'</code>,<code>'diamond'</code>, <code>'triangle'</code> and
   * <code>'triangle-down'</code>.
   *
   * Additionally, the URL to a graphic can be given on this form:
   * <code>'url(graphic.png)'</code>. Note that for the image to be applied to exported
   * charts, its URL needs to be accessible by the export server.
   *
   * Custom callbacks for symbol path generation can also be added to
   * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
   * its method name, as shown in the demo.
   *
   */
  @JSProperty("symbol")
  void setSymbol(@Nullable String value);

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock) Image markers only. Set the image width
   * explicitly. When using this option, a <code>height</code> must also be set.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  abstract class Symbol extends JsEnum {
    public static final Symbol ARC = JsEnum.of("arc");

    public static final Symbol CALLOUT = JsEnum.of("callout");

    public static final Symbol CIRCLE = JsEnum.of("circle");

    public static final Symbol DIAMOND = JsEnum.of("diamond");

    public static final Symbol SQUARE = JsEnum.of("square");

    public static final Symbol TRIANGLE = JsEnum.of("triangle");

    public static final Symbol TRIANGLE_DOWN = JsEnum.of("triangle-down");
  }

  class Builder {
    private final PointMarkerOptionsObject object = Any.empty();

    public PointMarkerOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
     * between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
     * between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the marker.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the marker.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps) The color of the marker.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Enable or disable the point marker. If
     * <code>undefined</code>, the markers are hidden when the data is dense, and shown for
     * more widespread data points.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The threshold for how dense the point markers
     * should be before they are hidden, given that <code>enabled</code> is not defined.
     * The number indicates the horizontal distance between the two closest
     * points in the series, as multiples of the <code>marker.radius</code>. In other
     * words, the default value of 2 means points are hidden if overlapping
     * horizontally.
     *
     */
    public Builder enabledThreshold(double value) {
      object.setEnabledThreshold(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the point marker. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the point marker. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The fill color of the point marker. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts) The fill opacity of the bubble markers.
     *
     */
    public Builder fillOpacity(double value) {
      object.setFillOpacity(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Image markers only. Set the image width
     * explicitly. When using this option, a <code>width</code> must also be set.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder lineColor(@Nullable PatternObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * <code>undefined</code>, the series' or point's color is used.
     *
     */
    public Builder lineColor(@Nullable GradientColorObject value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The width of the point marker's outline.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The radius of the point marker.
     *
     */
    public Builder radius(double value) {
      object.setRadius(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) States for a single point marker.
     *
     */
    public Builder states(@Nullable PointStatesOptionsObject value) {
      object.setStates(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
     * undefined, the symbol is pulled from options.symbols. Other possible
     * values are <code>'circle'</code>, <code>'square'</code>,<code>'diamond'</code>, <code>'triangle'</code> and
     * <code>'triangle-down'</code>.
     *
     * Additionally, the URL to a graphic can be given on this form:
     * <code>'url(graphic.png)'</code>. Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     *
     * Custom callbacks for symbol path generation can also be added to
     * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
     * its method name, as shown in the demo.
     *
     */
    public Builder symbol(@Nullable Symbol value) {
      object.setSymbol(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
     * undefined, the symbol is pulled from options.symbols. Other possible
     * values are <code>'circle'</code>, <code>'square'</code>,<code>'diamond'</code>, <code>'triangle'</code> and
     * <code>'triangle-down'</code>.
     *
     * Additionally, the URL to a graphic can be given on this form:
     * <code>'url(graphic.png)'</code>. Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     *
     * Custom callbacks for symbol path generation can also be added to
     * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by
     * its method name, as shown in the demo.
     *
     */
    public Builder symbol(@Nullable String value) {
      object.setSymbol(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Image markers only. Set the image width
     * explicitly. When using this option, a <code>height</code> must also be set.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
