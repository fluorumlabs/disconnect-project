package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The line marks the last price from all points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesLastPriceOptionsObject extends Any {
  /**
   * (Highstock) The color of the line of last price.
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * (Highstock) The color of the line of last price.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesLastPriceOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesLastPriceOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) The color of the line of last price.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highstock) Enable or disable the indicator.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
