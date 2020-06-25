package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for a <em>parentNode</em> label
 * text.
 *
 * <strong>Note:</strong> Only SVG-based renderer supports this option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesPackedBubbleDataLabelsTextPathOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable <code>textPath</code>
   * option for link's or marker's data labels.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable <code>textPath</code>
   * option for link's or marker's data labels.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  class Builder {
    private final SeriesPackedBubbleDataLabelsTextPathOptionsObject object = Any.empty();

    public SeriesPackedBubbleDataLabelsTextPathOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable <code>textPath</code>
     * option for link's or marker's data labels.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
