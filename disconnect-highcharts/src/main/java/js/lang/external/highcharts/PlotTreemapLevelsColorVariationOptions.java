package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts) A configuration object to define how the color of a child varies
 * from the parent's color. The variation is distributed among the children of
 * node. For example when setting brightness, the brightness change will range
 * from the parent's original brightness on the first child, to the amount set
 * in the <code>to</code> setting on the last node. This allows a gradient-like color
 * scheme that sets children out from each other while highlighting the grouping
 * on treemaps and sectors on sunburst charts.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotTreemapLevelsColorVariationOptions extends Any {
  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   */
  @JSProperty("key")
  @Nullable
  Key getKey();

  /**
   * (Highcharts) The key of a color variation. Currently supports
   * <code>brightness</code> only.
   *
   */
  @JSProperty("key")
  void setKey(@Nullable Key value);

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

  abstract class Key extends JsEnum {
    public static final Key BRIGHTNESS = JsEnum.of("brightness");
  }

  final class Builder {
    private final PlotTreemapLevelsColorVariationOptions object = Any.empty();

    private Builder() {
    }

    public PlotTreemapLevelsColorVariationOptions build() {
      return object;
    }

    /**
     * (Highcharts) The key of a color variation. Currently supports
     * <code>brightness</code> only.
     *
     */
    public Builder key(@Nullable Key value) {
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
