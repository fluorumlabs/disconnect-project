package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( PlotTilemapStatesHoverHaloAttributesOptions | SVGAttributes ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) Options for the halo appearing around the hovered
 * point in line-type series as well as outside the hovered slice in pie charts.
 * By default the halo is filled by the current point or series color with an
 * opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to
 * <code>null</code>.
 *
 * In styled mode, the halo is styled with the <code>.highcharts-halo</code> class, with
 * colors inherited from <code>.highcharts-color-{n}</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesStatesHoverHaloOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) A collection of SVG attributes to override the
   * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
   *
   */
  @JSProperty("attributes")
  @Nullable
  Unknown /* ( PlotTilemapStatesHoverHaloAttributesOptions | SVGAttributes ) */ getAttributes();

  /**
   * (Highcharts, Highstock) A collection of SVG attributes to override the
   * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
   *
   */
  @JSProperty("attributes")
  void setAttributes(@Nullable PlotTilemapStatesHoverHaloAttributesOptions value);

  /**
   * (Highcharts, Highstock) A collection of SVG attributes to override the
   * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
   *
   */
  @JSProperty("attributes")
  void setAttributes(@Nullable SVGAttributes value);

  @JSProperty("enabled")
  boolean getEnabled();

  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
   * overridden using the <code>attributes</code> setting. Note that Highcharts is only
   * able to apply opacity to colors of hex or rgb(a) formats.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
   * overridden using the <code>attributes</code> setting. Note that Highcharts is only
   * able to apply opacity to colors of hex or rgb(a) formats.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * (Highcharts, Highstock) The pixel size of the halo. For point markers
   * this is the radius of the halo. For pie slices it is the width of the
   * halo outside the slice. For bubbles it defaults to 5 and is the width of
   * the halo outside the bubble.
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts, Highstock) The pixel size of the halo. For point markers
   * this is the radius of the halo. For pie slices it is the width of the
   * halo outside the slice. For bubbles it defaults to 5 and is the width of
   * the halo outside the bubble.
   *
   */
  @JSProperty("size")
  void setSize(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesStatesHoverHaloOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesStatesHoverHaloOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) A collection of SVG attributes to override the
     * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
     *
     */
    public Builder attributes(@Nullable PlotTilemapStatesHoverHaloAttributesOptions value) {
      object.setAttributes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) A collection of SVG attributes to override the
     * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
     *
     */
    public Builder attributes(@Nullable SVGAttributes value) {
      object.setAttributes(value);
      return this;
    }

    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
     * overridden using the <code>attributes</code> setting. Note that Highcharts is only
     * able to apply opacity to colors of hex or rgb(a) formats.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The pixel size of the halo. For point markers
     * this is the radius of the halo. For pie slices it is the width of the
     * halo outside the slice. For bubbles it defaults to 5 and is the width of
     * the halo outside the bubble.
     *
     */
    public Builder size(double value) {
      object.setSize(value);
      return this;
    }
  }
}
