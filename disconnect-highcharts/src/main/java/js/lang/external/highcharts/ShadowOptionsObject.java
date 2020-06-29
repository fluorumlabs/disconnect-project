package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The shadow options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ShadowOptionsObject extends Any {
  /**
   * The shadow color.
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * The shadow color.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * The horizontal offset from the element.
   *
   */
  @JSProperty("offsetX")
  double getOffsetX();

  /**
   * The horizontal offset from the element.
   *
   */
  @JSProperty("offsetX")
  void setOffsetX(double value);

  /**
   * The vertical offset from the element.
   *
   */
  @JSProperty("offsetY")
  double getOffsetY();

  /**
   * The vertical offset from the element.
   *
   */
  @JSProperty("offsetY")
  void setOffsetY(double value);

  /**
   * The shadow opacity.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * The shadow opacity.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * The shadow width or distance from the element.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * The shadow width or distance from the element.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ShadowOptionsObject object = Any.empty();

    private Builder() {
    }

    public ShadowOptionsObject build() {
      return object;
    }

    /**
     * The shadow color.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * The horizontal offset from the element.
     *
     */
    public Builder offsetX(double value) {
      object.setOffsetX(value);
      return this;
    }

    /**
     * The vertical offset from the element.
     *
     */
    public Builder offsetY(double value) {
      object.setOffsetY(value);
      return this;
    }

    /**
     * The shadow opacity.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * The shadow width or distance from the element.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
