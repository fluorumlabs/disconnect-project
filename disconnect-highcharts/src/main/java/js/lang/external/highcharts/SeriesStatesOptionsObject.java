package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesStatesOptionsObject extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesStatesHoverOptionsObject getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   */
  @JSProperty("hover")
  void setHover(@Nullable SeriesStatesHoverOptionsObject value);

  /**
   * (Highstock) The opposite state of a hover for series.
   *
   */
  @JSProperty("inactive")
  @Nullable
  SeriesStatesInactiveOptionsObject getInactive();

  /**
   * (Highstock) The opposite state of a hover for series.
   *
   */
  @JSProperty("inactive")
  void setInactive(@Nullable SeriesStatesInactiveOptionsObject value);

  /**
   * (Highstock) The normal state of a series, or for point items in column,
   * pie and similar series. Currently only used for setting animation when
   * returning to normal state from hover.
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesStatesNormalOptionsObject getNormal();

  /**
   * (Highstock) The normal state of a series, or for point items in column,
   * pie and similar series. Currently only used for setting animation when
   * returning to normal state from hover.
   *
   */
  @JSProperty("normal")
  void setNormal(@Nullable SeriesStatesNormalOptionsObject value);

  /**
   * (Highstock) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesStatesSelectOptionsObject getSelect();

  /**
   * (Highstock) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   */
  @JSProperty("select")
  void setSelect(@Nullable SeriesStatesSelectOptionsObject value);

  class Builder {
    private final SeriesStatesOptionsObject object = Any.empty();

    public SeriesStatesOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) Options for the hovered series. These settings override the
     * normal state options when a series is moused over or touched.
     *
     */
    public Builder hover(@Nullable SeriesStatesHoverOptionsObject value) {
      object.setHover(value);
      return this;
    }

    /**
     * (Highstock) The opposite state of a hover for series.
     *
     */
    public Builder inactive(@Nullable SeriesStatesInactiveOptionsObject value) {
      object.setInactive(value);
      return this;
    }

    /**
     * (Highstock) The normal state of a series, or for point items in column,
     * pie and similar series. Currently only used for setting animation when
     * returning to normal state from hover.
     *
     */
    public Builder normal(@Nullable SeriesStatesNormalOptionsObject value) {
      object.setNormal(value);
      return this;
    }

    /**
     * (Highstock) Specific options for point in selected states, after being
     * selected by allowPointSelect or programmatically.
     *
     */
    public Builder select(@Nullable SeriesStatesSelectOptionsObject value) {
      object.setSelect(value);
      return this;
    }
  }
}
