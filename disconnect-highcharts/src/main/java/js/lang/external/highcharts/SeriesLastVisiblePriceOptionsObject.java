package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The line marks the last price from visible range of points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesLastVisiblePriceOptionsObject extends Any {
  /**
   * (Highstock) Enable or disable the indicator.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the indicator.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  @JSProperty("label")
  @Nullable
  SeriesLastVisiblePriceLabelOptionsObject getLabel();

  @JSProperty("label")
  void setLabel(@Nullable SeriesLastVisiblePriceLabelOptionsObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesLastVisiblePriceOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesLastVisiblePriceOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) Enable or disable the indicator.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    public Builder label(@Nullable SeriesLastVisiblePriceLabelOptionsObject value) {
      object.setLabel(value);
      return this;
    }
  }
}
