package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
 * settings. The rules are executed from the top down.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ResponsiveRulesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A full set of chart options to
   * apply as overrides to the general chart options. The chart options are
   * applied when the given rule is active.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the item of the same indexupdated. So for
   * example, setting <code>chartOptions</code> with two series items without an <code>id</code>,
   * will cause the existing chart's two series to be updated with respective
   * options.
   *
   */
  @JSProperty("chartOptions")
  @Nullable
  Options getChartOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A full set of chart options to
   * apply as overrides to the general chart options. The chart options are
   * applied when the given rule is active.
   *
   * A special case is configuration objects that take arrays, for example
   * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
   * map the new option set to an existing object. If an existing object of
   * the same id is not found, the item of the same indexupdated. So for
   * example, setting <code>chartOptions</code> with two series items without an <code>id</code>,
   * will cause the existing chart's two series to be updated with respective
   * options.
   *
   */
  @JSProperty("chartOptions")
  void setChartOptions(@Nullable Options value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
   * applies.
   *
   */
  @JSProperty("condition")
  @Nullable
  ResponsiveRulesConditionOptions getCondition();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
   * applies.
   *
   */
  @JSProperty("condition")
  void setCondition(@Nullable ResponsiveRulesConditionOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ResponsiveRulesOptions object = Any.empty();

    private Builder() {
    }

    public ResponsiveRulesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A full set of chart options to
     * apply as overrides to the general chart options. The chart options are
     * applied when the given rule is active.
     *
     * A special case is configuration objects that take arrays, for example
     * xAxis, yAxis or series. For these collections, an <code>id</code> option is used to
     * map the new option set to an existing object. If an existing object of
     * the same id is not found, the item of the same indexupdated. So for
     * example, setting <code>chartOptions</code> with two series items without an <code>id</code>,
     * will cause the existing chart's two series to be updated with respective
     * options.
     *
     */
    public Builder chartOptions(@Nullable Options value) {
      object.setChartOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
     * applies.
     *
     */
    public Builder condition(@Nullable ResponsiveRulesConditionOptions value) {
      object.setCondition(value);
      return this;
    }
  }
}
