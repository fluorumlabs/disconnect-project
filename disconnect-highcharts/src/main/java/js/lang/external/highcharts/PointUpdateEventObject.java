package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* PointOptionsType */;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * Information about the update event.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointUpdateEventObject extends Event {
  /**
   * Options data of the update event.
   *
   */
  @JSProperty("options")
  @Nullable
  Unknown /* PointOptionsType */ getOptions();

  /**
   * Options data of the update event.
   *
   */
  @JSProperty("options")
  void setOptions(double... value);

  /**
   * Options data of the update event.
   *
   */
  @JSProperty("options")
  void setOptions(double value);

  /**
   * Options data of the update event.
   *
   */
  @JSProperty("options")
  void setOptions(@Nullable PointOptionsObject value);

  /**
   * Options data of the update event.
   *
   */
  @JSProperty("options")
  void setOptions(@Nullable String value);

  /**
   * Options data of the update event.
   *
   */
  @JSProperty("options")
  void setOptions(String... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointUpdateEventObject object = Any.empty();

    private Builder() {
    }

    public PointUpdateEventObject build() {
      return object;
    }

    /**
     * Options data of the update event.
     *
     */
    public Builder options(double... value) {
      object.setOptions(value);
      return this;
    }

    /**
     * Options data of the update event.
     *
     */
    public Builder options(double value) {
      object.setOptions(value);
      return this;
    }

    /**
     * Options data of the update event.
     *
     */
    public Builder options(@Nullable PointOptionsObject value) {
      object.setOptions(value);
      return this;
    }

    /**
     * Options data of the update event.
     *
     */
    public Builder options(@Nullable String value) {
      object.setOptions(value);
      return this;
    }

    /**
     * Options data of the update event.
     *
     */
    public Builder options(String... value) {
      object.setOptions(value);
      return this;
    }
  }
}
