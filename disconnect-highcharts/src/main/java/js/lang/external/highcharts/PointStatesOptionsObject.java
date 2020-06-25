package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointStatesOptionsObject extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   */
  @JSProperty("hover")
  @Nullable
  PointStatesHoverOptionsObject getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   */
  @JSProperty("hover")
  void setHover(@Nullable PointStatesHoverOptionsObject value);

  /**
   * (Highcharts) The opposite state of a hover for a single point node.
   * Applied to all not connected nodes to the hovered one.
   *
   */
  @JSProperty("inactive")
  @Nullable
  PointStatesInactiveOptionsObject getInactive();

  /**
   * (Highcharts) The opposite state of a hover for a single point node.
   * Applied to all not connected nodes to the hovered one.
   *
   */
  @JSProperty("inactive")
  void setInactive(@Nullable PointStatesInactiveOptionsObject value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   */
  @JSProperty("normal")
  @Nullable
  PointStatesNormalOptionsObject getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   */
  @JSProperty("normal")
  void setNormal(@Nullable PointStatesNormalOptionsObject value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   */
  @JSProperty("select")
  @Nullable
  PointStatesSelectOptionsObject getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   */
  @JSProperty("select")
  void setSelect(@Nullable PointStatesSelectOptionsObject value);

  class Builder {
    private final PointStatesOptionsObject object = Any.empty();

    public PointStatesOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) The hover state for a single point marker.
     *
     */
    public Builder hover(@Nullable PointStatesHoverOptionsObject value) {
      object.setHover(value);
      return this;
    }

    /**
     * (Highcharts) The opposite state of a hover for a single point node.
     * Applied to all not connected nodes to the hovered one.
     *
     */
    public Builder inactive(@Nullable PointStatesInactiveOptionsObject value) {
      object.setInactive(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The normal state of a single point marker.
     * Currently only used for setting animation when returning to normal state
     * from hover.
     *
     */
    public Builder normal(@Nullable PointStatesNormalOptionsObject value) {
      object.setNormal(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The appearance of the point marker when selected.
     * In order to allow a point to be selected, set the
     * <code>series.allowPointSelect</code> option to true.
     *
     */
    public Builder select(@Nullable PointStatesSelectOptionsObject value) {
      object.setSelect(value);
      return this;
    }
  }
}
