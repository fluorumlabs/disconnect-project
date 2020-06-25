package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Options for a label text which should follow
 * marker's shape. Border and background are disabled for a label that follows a
 * path.
 *
 * <strong>Note:</strong> Only SVG-based renderer supports this option. Setting <code>useHTML</code> to
 * true will disable this option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DataLabelsTextPathOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
   *
   */
  @JSProperty("attributes")
  @Nullable
  SVGAttributes getAttributes();

  /**
   * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
   *
   */
  @JSProperty("attributes")
  void setAttributes(@Nullable SVGAttributes value);

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable <code>textPath</code> option for
   * link's or marker's data labels.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable <code>textPath</code> option for
   * link's or marker's data labels.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  class Builder {
    private final DataLabelsTextPathOptionsObject object = Any.empty();

    public DataLabelsTextPathOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
     *
     */
    public Builder attributes(@Nullable SVGAttributes value) {
      object.setAttributes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable or disable <code>textPath</code> option for
     * link's or marker's data labels.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
