package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( AlignObject | NoDataPositionOptions ) */;
import js.lang.Unknown /* ( NoDataAttrOptions | SVGAttributes ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Options for displaying a message like &quot;No data
 * to display&quot;. This feature requires the file no-data-to-display.js to be
 * loaded in the page. The actual text to display is set in the lang.noData
 * option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NoDataOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
   * the no-data label.
   *
   */
  @JSProperty("attr")
  @Nullable
  Unknown /* ( NoDataAttrOptions | SVGAttributes ) */ getAttr();

  /**
   * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
   * the no-data label.
   *
   */
  @JSProperty("attr")
  void setAttr(@Nullable SVGAttributes value);

  /**
   * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
   * the no-data label.
   *
   */
  @JSProperty("attr")
  void setAttr(@Nullable NoDataAttrOptions value);

  /**
   * (Highcharts, Highstock, Gantt) The position of the no-data label,
   * relative to the plot area.
   *
   */
  @JSProperty("position")
  @Nullable
  Unknown /* ( AlignObject | NoDataPositionOptions ) */ getPosition();

  /**
   * (Highcharts, Highstock, Gantt) The position of the no-data label,
   * relative to the plot area.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable AlignObject value);

  /**
   * (Highcharts, Highstock, Gantt) The position of the no-data label,
   * relative to the plot area.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable NoDataPositionOptions value);

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
   * pseudo-HTML rendered with SVG.
   *
   */
  @JSProperty("useHTML")
  boolean getUseHTML();

  /**
   * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
   * pseudo-HTML rendered with SVG.
   *
   */
  @JSProperty("useHTML")
  void setUseHTML(boolean value);

  class Builder {
    private final NoDataOptions object = Any.empty();

    public NoDataOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
     * the no-data label.
     *
     */
    public Builder attr(@Nullable SVGAttributes value) {
      object.setAttr(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
     * the no-data label.
     *
     */
    public Builder attr(@Nullable NoDataAttrOptions value) {
      object.setAttr(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The position of the no-data label,
     * relative to the plot area.
     *
     */
    public Builder position(@Nullable AlignObject value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The position of the no-data label,
     * relative to the plot area.
     *
     */
    public Builder position(@Nullable NoDataPositionOptions value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
     * pseudo-HTML rendered with SVG.
     *
     */
    public Builder useHTML(boolean value) {
      object.setUseHTML(value);
      return this;
    }
  }
}
