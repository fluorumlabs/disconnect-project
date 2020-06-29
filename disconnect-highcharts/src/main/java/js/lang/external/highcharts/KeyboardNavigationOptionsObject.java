package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface KeyboardNavigationOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
   * the chart.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
   * the chart.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
   * drawn around elements while navigating through them.
   *
   */
  @JSProperty("focusBorder")
  @Nullable
  KeyboardNavigationFocusBorderOptionsObject getFocusBorder();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
   * drawn around elements while navigating through them.
   *
   */
  @JSProperty("focusBorder")
  void setFocusBorder(@Nullable KeyboardNavigationFocusBorderOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
   * chart. Determines which elements are tabbed to first. Available elements
   * are: <code>series</code>, <code>zoom</code>, <code>rangeSelector</code>, <code>chartMenu</code>, <code>legend</code>. In
   * addition, any custom components can be added here.
   *
   */
  @JSProperty("order")
  @Nullable
  String[] getOrder();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
   * chart. Determines which elements are tabbed to first. Available elements
   * are: <code>series</code>, <code>zoom</code>, <code>rangeSelector</code>, <code>chartMenu</code>, <code>legend</code>. In
   * addition, any custom components can be added here.
   *
   */
  @JSProperty("order")
  void setOrder(String... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
   * navigation of data points and series.
   *
   */
  @JSProperty("seriesNavigation")
  @Nullable
  KeyboardNavigationSeriesNavigationOptionsObject getSeriesNavigation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
   * navigation of data points and series.
   *
   */
  @JSProperty("seriesNavigation")
  void setSeriesNavigation(@Nullable KeyboardNavigationSeriesNavigationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
   * when reaching the end of arrow-key navigation for an element in the
   * chart.
   *
   */
  @JSProperty("wrapAround")
  boolean getWrapAround();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
   * when reaching the end of arrow-key navigation for an element in the
   * chart.
   *
   */
  @JSProperty("wrapAround")
  void setWrapAround(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final KeyboardNavigationOptionsObject object = Any.empty();

    private Builder() {
    }

    public KeyboardNavigationOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
     * the chart.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
     * drawn around elements while navigating through them.
     *
     */
    public Builder focusBorder(@Nullable KeyboardNavigationFocusBorderOptionsObject value) {
      object.setFocusBorder(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
     * chart. Determines which elements are tabbed to first. Available elements
     * are: <code>series</code>, <code>zoom</code>, <code>rangeSelector</code>, <code>chartMenu</code>, <code>legend</code>. In
     * addition, any custom components can be added here.
     *
     */
    public Builder order(String... value) {
      object.setOrder(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
     * navigation of data points and series.
     *
     */
    public Builder seriesNavigation(
        @Nullable KeyboardNavigationSeriesNavigationOptionsObject value) {
      object.setSeriesNavigation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
     * when reaching the end of arrow-key navigation for an element in the
     * chart.
     *
     */
    public Builder wrapAround(boolean value) {
      object.setWrapAround(value);
      return this;
    }
  }
}
