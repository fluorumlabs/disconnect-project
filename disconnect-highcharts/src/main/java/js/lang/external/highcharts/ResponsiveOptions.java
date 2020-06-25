package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
 * apply for different screen or chart sizes. Each rule specifies additional
 * chart options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ResponsiveOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
   * settings. The rules are executed from the top down.
   *
   */
  @JSProperty("rules")
  @Nullable
  ResponsiveRulesOptions[] getRules();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
   * settings. The rules are executed from the top down.
   *
   */
  @JSProperty("rules")
  void setRules(ResponsiveRulesOptions[] value);

  class Builder {
    private final ResponsiveOptions object = Any.empty();

    public ResponsiveOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
     * settings. The rules are executed from the top down.
     *
     */
    public Builder rules(ResponsiveRulesOptions[] value) {
      object.setRules(value);
      return this;
    }
  }
}
