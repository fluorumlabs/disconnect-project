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
public interface SeriesLastVisiblePriceLabelOptionsObject extends Any {
  /**
   * (Highstock) Enable or disable the label.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the label.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesLastVisiblePriceLabelOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesLastVisiblePriceLabelOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) Enable or disable the label.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
