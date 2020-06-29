package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Can set a <code>colorVariation</code> on all points which lies on the same
 * level.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSunburstLevelsColorVariationOptions extends Any {
  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   */
  @JSProperty("key")
  @Nullable
  String getKey();

  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   */
  @JSProperty("key")
  void setKey(@Nullable String value);

  /**
   * (Highcharts) The ending value of a color variation. The last sibling will
   * receive this value.
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts) The ending value of a color variation. The last sibling will
   * receive this value.
   *
   */
  @JSProperty("to")
  void setTo(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotSunburstLevelsColorVariationOptions object = Any.empty();

    private Builder() {
    }

    public PlotSunburstLevelsColorVariationOptions build() {
      return object;
    }

    /**
     * (Highcharts) The key of a color variation. Currently supports
     * <code>brightness</code> only.
     *
     */
    public Builder key(@Nullable String value) {
      object.setKey(value);
      return this;
    }

    /**
     * (Highcharts) The ending value of a color variation. The last sibling will
     * receive this value.
     *
     */
    public Builder to(double value) {
      object.setTo(value);
      return this;
    }
  }
}
