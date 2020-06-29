package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.external.highcharts.Chart;
import js.lang.external.highcharts.Dictionary;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/accessibility.src.js"
)
public interface AccessibilityChart extends Chart {
  /**
   * Dismiss popup content in chart, including export menu and tooltip.
   *
   */
  void dismissPopupContent();

  /**
   * Apply context to a format string from lang options of the chart.
   *
   * @param langKey
   * Key (using dot notation) into lang option structure.
   *
   * @param context
   * Context to apply to the format string.
   *
   * @return The formatted string.
   *
   */
  String langFormat(String langKey, Dictionary<Any> context);
}
