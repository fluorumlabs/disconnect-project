package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Accessibility options for an axis. Requires the accessibility
 * module.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisAccessibilityOptionsObject extends Any {
  /**
   * (Highcharts) Description for an axis to expose to screen reader users.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) Description for an axis to expose to screen reader users.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts) Enable axis accessibility features, including axis
   * information in the screen reader information region. If this is disabled
   * on the xAxis, the x values are not exposed to screen readers for the
   * individual data points by default.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Enable axis accessibility features, including axis
   * information in the screen reader information region. If this is disabled
   * on the xAxis, the x values are not exposed to screen readers for the
   * individual data points by default.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) Range description for an axis. Overrides the default range
   * description. Set to empty to disable range description for this axis.
   *
   */
  @JSProperty("rangeDescription")
  @Nullable
  String getRangeDescription();

  /**
   * (Highcharts) Range description for an axis. Overrides the default range
   * description. Set to empty to disable range description for this axis.
   *
   */
  @JSProperty("rangeDescription")
  void setRangeDescription(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AxisAccessibilityOptionsObject object = Any.empty();

    private Builder() {
    }

    public AxisAccessibilityOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts) Description for an axis to expose to screen reader users.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts) Enable axis accessibility features, including axis
     * information in the screen reader information region. If this is disabled
     * on the xAxis, the x values are not exposed to screen readers for the
     * individual data points by default.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts) Range description for an axis. Overrides the default range
     * description. Set to empty to disable range description for this axis.
     *
     */
    public Builder rangeDescription(@Nullable String value) {
      object.setRangeDescription(value);
      return this;
    }
  }
}
