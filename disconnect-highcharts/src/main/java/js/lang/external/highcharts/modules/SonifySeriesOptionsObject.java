package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( string | Function ) */;
import js.lang.external.highcharts.Dictionary;
import js.lang.external.highcharts.RangeObject;
import org.teavm.jso.JSProperty;

/**
 * Options for sonifying a series.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface SonifySeriesOptionsObject extends Any {
  /**
   * Optionally provide the minimum/maximum data values for the points. If
   * this is not supplied, it is calculated from all points in the chart
   * on demand. This option is supplied in the following format, as a map
   * of point data properties to objects with min/max values: (see online
   * documentation for example)
   *
   */
  @JSProperty("dataExtremes")
  @Nullable
  Dictionary<RangeObject> getDataExtremes();

  /**
   * Optionally provide the minimum/maximum data values for the points. If
   * this is not supplied, it is calculated from all points in the chart
   * on demand. This option is supplied in the following format, as a map
   * of point data properties to objects with min/max values: (see online
   * documentation for example)
   *
   */
  @JSProperty("dataExtremes")
  void setDataExtremes(@Nullable Dictionary<RangeObject> value);

  /**
   * The duration for playing the points. Note that points might continue
   * to play after the duration has passed, but no new points will start
   * playing.
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * The duration for playing the points. Note that points might continue
   * to play after the duration has passed, but no new points will start
   * playing.
   *
   */
  @JSProperty("duration")
  void setDuration(double value);

  /**
   * Earcons to add to the series.
   *
   */
  @JSProperty("earcons")
  @Nullable
  EarconConfiguration[] getEarcons();

  /**
   * Earcons to add to the series.
   *
   */
  @JSProperty("earcons")
  void setEarcons(EarconConfiguration[] value);

  /**
   * The instrument definitions for the points in this series.
   *
   */
  @JSProperty("instruments")
  PointInstrumentObject[] getInstruments();

  /**
   * The instrument definitions for the points in this series.
   *
   */
  @JSProperty("instruments")
  void setInstruments(PointInstrumentObject[] value);

  /**
   * Callback after the series has played.
   *
   */
  @JSProperty("onEnd")
  @Nullable
  JsFunction getOnEnd();

  /**
   * Callback after the series has played.
   *
   */
  @JSProperty("onEnd")
  void setOnEnd(@Nullable JsFunction value);

  /**
   * Callback after a point has finished playing.
   *
   */
  @JSProperty("onPointEnd")
  @Nullable
  JsFunction getOnPointEnd();

  /**
   * Callback after a point has finished playing.
   *
   */
  @JSProperty("onPointEnd")
  void setOnPointEnd(@Nullable JsFunction value);

  /**
   * Callback before a point is played.
   *
   */
  @JSProperty("onPointStart")
  @Nullable
  JsFunction getOnPointStart();

  /**
   * Callback before a point is played.
   *
   */
  @JSProperty("onPointStart")
  void setOnPointStart(@Nullable JsFunction value);

  /**
   * The axis to use for when to play the points. Can be a string with a
   * data property (e.g. <code>x</code>), or a function. If it is a function, this
   * function receives the point as argument, and should return a numeric
   * value. The points with the lowest numeric values are then played
   * first, and the time between points will be proportional to the
   * distance between the numeric values.
   *
   */
  @JSProperty("pointPlayTime")
  Unknown /* ( string | Function ) */ getPointPlayTime();

  /**
   * The axis to use for when to play the points. Can be a string with a
   * data property (e.g. <code>x</code>), or a function. If it is a function, this
   * function receives the point as argument, and should return a numeric
   * value. The points with the lowest numeric values are then played
   * first, and the time between points will be proportional to the
   * distance between the numeric values.
   *
   */
  @JSProperty("pointPlayTime")
  void setPointPlayTime(String value);

  /**
   * The axis to use for when to play the points. Can be a string with a
   * data property (e.g. <code>x</code>), or a function. If it is a function, this
   * function receives the point as argument, and should return a numeric
   * value. The points with the lowest numeric values are then played
   * first, and the time between points will be proportional to the
   * distance between the numeric values.
   *
   */
  @JSProperty("pointPlayTime")
  void setPointPlayTime(JsFunction value);

  class Builder {
    private final SonifySeriesOptionsObject object = Any.empty();

    public SonifySeriesOptionsObject build() {
      return object;
    }

    /**
     * Optionally provide the minimum/maximum data values for the points. If
     * this is not supplied, it is calculated from all points in the chart
     * on demand. This option is supplied in the following format, as a map
     * of point data properties to objects with min/max values: (see online
     * documentation for example)
     *
     */
    public Builder dataExtremes(@Nullable Dictionary<RangeObject> value) {
      object.setDataExtremes(value);
      return this;
    }

    /**
     * The duration for playing the points. Note that points might continue
     * to play after the duration has passed, but no new points will start
     * playing.
     *
     */
    public Builder duration(double value) {
      object.setDuration(value);
      return this;
    }

    /**
     * Earcons to add to the series.
     *
     */
    public Builder earcons(EarconConfiguration[] value) {
      object.setEarcons(value);
      return this;
    }

    /**
     * The instrument definitions for the points in this series.
     *
     */
    public Builder instruments(PointInstrumentObject[] value) {
      object.setInstruments(value);
      return this;
    }

    /**
     * Callback after the series has played.
     *
     */
    public Builder onEnd(@Nullable JsFunction value) {
      object.setOnEnd(value);
      return this;
    }

    /**
     * Callback after a point has finished playing.
     *
     */
    public Builder onPointEnd(@Nullable JsFunction value) {
      object.setOnPointEnd(value);
      return this;
    }

    /**
     * Callback before a point is played.
     *
     */
    public Builder onPointStart(@Nullable JsFunction value) {
      object.setOnPointStart(value);
      return this;
    }

    /**
     * The axis to use for when to play the points. Can be a string with a
     * data property (e.g. <code>x</code>), or a function. If it is a function, this
     * function receives the point as argument, and should return a numeric
     * value. The points with the lowest numeric values are then played
     * first, and the time between points will be proportional to the
     * distance between the numeric values.
     *
     */
    public Builder pointPlayTime(String value) {
      object.setPointPlayTime(value);
      return this;
    }

    /**
     * The axis to use for when to play the points. Can be a string with a
     * data property (e.g. <code>x</code>), or a function. If it is a function, this
     * function receives the point as argument, and should return a numeric
     * value. The points with the lowest numeric values are then played
     * first, and the time between points will be proportional to the
     * distance between the numeric values.
     *
     */
    public Builder pointPlayTime(JsFunction value) {
      object.setPointPlayTime(value);
      return this;
    }
  }
}
