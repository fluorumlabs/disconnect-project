package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesPackedBubbleDataLabelsTextPathOptionsObject object = Any.empty();

    private Builder() {
    }

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
