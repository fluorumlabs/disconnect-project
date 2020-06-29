package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border drawn
 * around elements while navigating through them.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface KeyboardNavigationFocusBorderOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
   * chart.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
   * chart.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
   * indicator.
   *
   */
  @JSProperty("hideBrowserFocusOutline")
  boolean getHideBrowserFocusOutline();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
   * indicator.
   *
   */
  @JSProperty("hideBrowserFocusOutline")
  void setHideBrowserFocusOutline(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
   * elements.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
   * elements.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
   * border drawn around elements while navigating through them. Note that
   * some browsers in addition draw their own borders for focused elements.
   * These automatic borders can not be styled by Highcharts.
   *
   * In styled mode, the border is given the <code>.highcharts-focus-border</code> class.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
   * border drawn around elements while navigating through them. Note that
   * some browsers in addition draw their own borders for focused elements.
   * These automatic borders can not be styled by Highcharts.
   *
   * In styled mode, the border is given the <code>.highcharts-focus-border</code> class.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final KeyboardNavigationFocusBorderOptionsObject object = Any.empty();

    private Builder() {
    }

    public KeyboardNavigationFocusBorderOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
     * chart.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
     * indicator.
     *
     */
    public Builder hideBrowserFocusOutline(boolean value) {
      object.setHideBrowserFocusOutline(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
     * elements.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
     * border drawn around elements while navigating through them. Note that
     * some browsers in addition draw their own borders for focused elements.
     * These automatic borders can not be styled by Highcharts.
     *
     * In styled mode, the border is given the <code>.highcharts-focus-border</code> class.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }
  }
}
