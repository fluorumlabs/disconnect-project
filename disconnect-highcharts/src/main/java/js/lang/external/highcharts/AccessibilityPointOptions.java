package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
 * individual data points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AccessibilityPointOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
   * datetime axes when describing them to screen reader users.
   *
   * Defaults to the same format as in tooltip.
   *
   * For an overview of the replacement codes, see dateFormat.
   *
   */
  @JSProperty("dateFormat")
  @Nullable
  String getDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
   * datetime axes when describing them to screen reader users.
   *
   * Defaults to the same format as in tooltip.
   *
   * For an overview of the replacement codes, see dateFormat.
   *
   */
  @JSProperty("dateFormat")
  void setDateFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
   * the date/time format used with points on datetime axes when describing
   * them to screen reader users. Receives one argument, <code>point</code>, referring to
   * the point to describe. Should return a date format string compatible with
   * dateFormat.
   *
   */
  @JSProperty("dateFormatter")
  @Nullable
  ScreenReaderFormatterCallbackFunction<Point> getDateFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
   * the date/time format used with points on datetime axes when describing
   * them to screen reader users. Receives one argument, <code>point</code>, referring to
   * the point to describe. Should return a date format string compatible with
   * dateFormat.
   *
   */
  @JSProperty("dateFormatter")
  void setDateFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Point> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
   * instead of the default for point descriptions.
   *
   * Receives one argument, <code>point</code>, referring to the point to describe.
   * Should return a string with the description of the point for a screen
   * reader user. If <code>false</code> is returned, the default formatter will be used
   * for that point.
   *
   * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
   * possible, as default functionality such as describing annotations will be
   * preserved.
   *
   */
  @JSProperty("descriptionFormatter")
  @Nullable
  ScreenReaderFormatterCallbackFunction<Point> getDescriptionFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
   * instead of the default for point descriptions.
   *
   * Receives one argument, <code>point</code>, referring to the point to describe.
   * Should return a string with the description of the point for a screen
   * reader user. If <code>false</code> is returned, the default formatter will be used
   * for that point.
   *
   * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
   * possible, as default functionality such as describing annotations will be
   * preserved.
   *
   */
  @JSProperty("descriptionFormatter")
  void setDescriptionFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Point> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
   * in the point descriptions. Uses tooltip.valueDecimals if not defined.
   *
   */
  @JSProperty("valueDecimals")
  double getValueDecimals();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
   * in the point descriptions. Uses tooltip.valueDecimals if not defined.
   *
   */
  @JSProperty("valueDecimals")
  void setValueDecimals(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
   * values of data points to assistive technology - including screen readers.
   * The point context is available as <code>{point}</code>.
   *
   * Additionally, the series name, annotation info, and description added in
   * <code>point.accessibility.description</code> is added by default if relevant. To
   * override this, use the accessibility.point.descriptionFormatter option.
   *
   */
  @JSProperty("valueDescriptionFormat")
  @Nullable
  String getValueDescriptionFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
   * values of data points to assistive technology - including screen readers.
   * The point context is available as <code>{point}</code>.
   *
   * Additionally, the series name, annotation info, and description added in
   * <code>point.accessibility.description</code> is added by default if relevant. To
   * override this, use the accessibility.point.descriptionFormatter option.
   *
   */
  @JSProperty("valueDescriptionFormat")
  void setValueDescriptionFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
   * the point descriptions. Uses tooltip.valuePrefix if not defined.
   *
   */
  @JSProperty("valuePrefix")
  @Nullable
  String getValuePrefix();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
   * the point descriptions. Uses tooltip.valuePrefix if not defined.
   *
   */
  @JSProperty("valuePrefix")
  void setValuePrefix(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
   * the point descriptions. Uses tooltip.valueSuffix if not defined.
   *
   */
  @JSProperty("valueSuffix")
  @Nullable
  String getValueSuffix();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
   * the point descriptions. Uses tooltip.valueSuffix if not defined.
   *
   */
  @JSProperty("valueSuffix")
  void setValueSuffix(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AccessibilityPointOptions object = Any.empty();

    private Builder() {
    }

    public AccessibilityPointOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
     * datetime axes when describing them to screen reader users.
     *
     * Defaults to the same format as in tooltip.
     *
     * For an overview of the replacement codes, see dateFormat.
     *
     */
    public Builder dateFormat(@Nullable String value) {
      object.setDateFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
     * the date/time format used with points on datetime axes when describing
     * them to screen reader users. Receives one argument, <code>point</code>, referring to
     * the point to describe. Should return a date format string compatible with
     * dateFormat.
     *
     */
    public Builder dateFormatter(@Nullable ScreenReaderFormatterCallbackFunction<Point> value) {
      object.setDateFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
     * instead of the default for point descriptions.
     *
     * Receives one argument, <code>point</code>, referring to the point to describe.
     * Should return a string with the description of the point for a screen
     * reader user. If <code>false</code> is returned, the default formatter will be used
     * for that point.
     *
     * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
     * possible, as default functionality such as describing annotations will be
     * preserved.
     *
     */
    public Builder descriptionFormatter(
        @Nullable ScreenReaderFormatterCallbackFunction<Point> value) {
      object.setDescriptionFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
     * in the point descriptions. Uses tooltip.valueDecimals if not defined.
     *
     */
    public Builder valueDecimals(double value) {
      object.setValueDecimals(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
     * values of data points to assistive technology - including screen readers.
     * The point context is available as <code>{point}</code>.
     *
     * Additionally, the series name, annotation info, and description added in
     * <code>point.accessibility.description</code> is added by default if relevant. To
     * override this, use the accessibility.point.descriptionFormatter option.
     *
     */
    public Builder valueDescriptionFormat(@Nullable String value) {
      object.setValueDescriptionFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
     * the point descriptions. Uses tooltip.valuePrefix if not defined.
     *
     */
    public Builder valuePrefix(@Nullable String value) {
      object.setValuePrefix(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
     * the point descriptions. Uses tooltip.valueSuffix if not defined.
     *
     */
    public Builder valueSuffix(@Nullable String value) {
      object.setValueSuffix(value);
      return this;
    }
  }
}
