package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Accessibility options for a series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesAccessibilityOptionsObject extends Any {
  /**
   * (Highstock) Provide a description of the series, announced to screen
   * readers.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highstock) Provide a description of the series, announced to screen
   * readers.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highstock) Enable/disable accessibility functionality for a specific
   * series.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable/disable accessibility functionality for a specific
   * series.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Expose only the series element to screen readers, not its
   * points.
   *
   */
  @JSProperty("exposeAsGroupOnly")
  boolean getExposeAsGroupOnly();

  /**
   * (Highstock) Expose only the series element to screen readers, not its
   * points.
   *
   */
  @JSProperty("exposeAsGroupOnly")
  void setExposeAsGroupOnly(boolean value);

  /**
   * (Highstock) Keyboard navigation for a series
   *
   */
  @JSProperty("keyboardNavigation")
  @Nullable
  SeriesAccessibilityKeyboardNavigationOptionsObject getKeyboardNavigation();

  /**
   * (Highstock) Keyboard navigation for a series
   *
   */
  @JSProperty("keyboardNavigation")
  void setKeyboardNavigation(@Nullable SeriesAccessibilityKeyboardNavigationOptionsObject value);

  /**
   * (Highstock) Formatter function to use instead of the default for point
   * descriptions. Same as <code>accessibility.point.descriptionFormatter</code>, but for
   * a single series.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  ScreenReaderFormatterCallbackFunction<Point> getPointDescriptionFormatter();

  /**
   * (Highstock) Formatter function to use instead of the default for point
   * descriptions. Same as <code>accessibility.point.descriptionFormatter</code>, but for
   * a single series.
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Point> value);

  class Builder {
    private final SeriesAccessibilityOptionsObject object = Any.empty();

    public SeriesAccessibilityOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) Provide a description of the series, announced to screen
     * readers.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highstock) Enable/disable accessibility functionality for a specific
     * series.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) Expose only the series element to screen readers, not its
     * points.
     *
     */
    public Builder exposeAsGroupOnly(boolean value) {
      object.setExposeAsGroupOnly(value);
      return this;
    }

    /**
     * (Highstock) Keyboard navigation for a series
     *
     */
    public Builder keyboardNavigation(
        @Nullable SeriesAccessibilityKeyboardNavigationOptionsObject value) {
      object.setKeyboardNavigation(value);
      return this;
    }

    /**
     * (Highstock) Formatter function to use instead of the default for point
     * descriptions. Same as <code>accessibility.point.descriptionFormatter</code>, but for
     * a single series.
     *
     */
    public Builder pointDescriptionFormatter(
        @Nullable ScreenReaderFormatterCallbackFunction<Point> value) {
      object.setPointDescriptionFormatter(value);
      return this;
    }
  }
}
