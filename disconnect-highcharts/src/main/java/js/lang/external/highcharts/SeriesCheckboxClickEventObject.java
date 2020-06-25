package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Event information regarding check of a series box.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesCheckboxClickEventObject extends Any {
  /**
   * Whether the box has been checked.
   *
   */
  @JSProperty("checked")
  boolean getChecked();

  /**
   * Whether the box has been checked.
   *
   */
  @JSProperty("checked")
  void setChecked(boolean value);

  /**
   * Related series.
   *
   */
  @JSProperty("item")
  Series getItem();

  /**
   * Related series.
   *
   */
  @JSProperty("item")
  void setItem(Series value);

  /**
   * Related series.
   *
   */
  @JSProperty("target")
  Series getTarget();

  /**
   * Related series.
   *
   */
  @JSProperty("target")
  void setTarget(Series value);

  class Builder {
    private final SeriesCheckboxClickEventObject object = Any.empty();

    public SeriesCheckboxClickEventObject build() {
      return object;
    }

    /**
     * Whether the box has been checked.
     *
     */
    public Builder checked(boolean value) {
      object.setChecked(value);
      return this;
    }

    /**
     * Related series.
     *
     */
    public Builder item(Series value) {
      object.setItem(value);
      return this;
    }

    /**
     * Related series.
     *
     */
    public Builder target(Series value) {
      object.setTarget(value);
      return this;
    }
  }
}
