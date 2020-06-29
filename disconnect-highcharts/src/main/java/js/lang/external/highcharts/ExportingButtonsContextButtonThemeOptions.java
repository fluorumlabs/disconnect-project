package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
 * button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code>
 * and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and
 * <code>states.select</code> objects.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingButtonsContextButtonThemeOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
   * capture hover events.
   *
   */
  @JSProperty("fill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFill();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
   * capture hover events.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
   * capture hover events.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
   * capture hover events.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Padding for the button.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Padding for the button.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default stroke for the buttons.
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default stroke for the buttons.
   *
   */
  @JSProperty("stroke")
  void setStroke(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ExportingButtonsContextButtonThemeOptions object = Any.empty();

    private Builder() {
    }

    public ExportingButtonsContextButtonThemeOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
     * capture hover events.
     *
     */
    public Builder fill(@Nullable PatternObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
     * capture hover events.
     *
     */
    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
     * capture hover events.
     *
     */
    public Builder fill(@Nullable GradientColorObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Padding for the button.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default stroke for the buttons.
     *
     */
    public Builder stroke(@Nullable String value) {
      object.setStroke(value);
      return this;
    }
  }
}
