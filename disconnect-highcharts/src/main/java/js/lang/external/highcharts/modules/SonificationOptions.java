package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( object | Array < object > ) */;
import js.lang.Unknown /* ( string | Array < ( string | Earcon | Array < ( string | Earcon ) > ) > ) */;
import js.lang.Unknown /* ( string | Function ) */;
import js.lang.external.highcharts.Dictionary;
import js.lang.external.highcharts.RangeObject;
import org.teavm.jso.JSProperty;

/**
 * Options for sonifying a chart.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface SonificationOptions extends Any {
  /**
   * Milliseconds of silent waiting to add between series. Note that
   * waiting time is considered part of the sonify duration.
   *
   */
  @JSProperty("afterSeriesWait")
  double getAfterSeriesWait();

  /**
   * Milliseconds of silent waiting to add between series. Note that
   * waiting time is considered part of the sonify duration.
   *
   */
  @JSProperty("afterSeriesWait")
  void setAfterSeriesWait(double value);

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
   * Duration for sonifying the entire chart. The duration is distributed
   * across the different series intelligently, but does not take earcons
   * into account. It is also possible to set the duration explicitly per
   * series, using <code>seriesOptions</code>. Note that points may continue to play
   * after the duration has passed, but no new points will start playing.
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * Duration for sonifying the entire chart. The duration is distributed
   * across the different series intelligently, but does not take earcons
   * into account. It is also possible to set the duration explicitly per
   * series, using <code>seriesOptions</code>. Note that points may continue to play
   * after the duration has passed, but no new points will start playing.
   *
   */
  @JSProperty("duration")
  void setDuration(double value);

  /**
   * Earcons to add to the chart. Note that earcons can also be added per
   * series using <code>seriesOptions</code>.
   *
   */
  @JSProperty("earcons")
  @Nullable
  EarconConfiguration[] getEarcons();

  /**
   * Earcons to add to the chart. Note that earcons can also be added per
   * series using <code>seriesOptions</code>.
   *
   */
  @JSProperty("earcons")
  void setEarcons(EarconConfiguration[] value);

  /**
   * The instrument definitions for the points in this chart.
   *
   */
  @JSProperty("instruments")
  @Nullable
  PointInstrumentObject[] getInstruments();

  /**
   * The instrument definitions for the points in this chart.
   *
   */
  @JSProperty("instruments")
  void setInstruments(PointInstrumentObject[] value);

  /**
   * Callback after the chart has played.
   *
   */
  @JSProperty("onEnd")
  @Nullable
  JsFunction getOnEnd();

  /**
   * Callback after the chart has played.
   *
   */
  @JSProperty("onEnd")
  void setOnEnd(@Nullable JsFunction value);

  /**
   * Callback after a series has finished playing.
   *
   */
  @JSProperty("onSeriesEnd")
  @Nullable
  JsFunction getOnSeriesEnd();

  /**
   * Callback after a series has finished playing.
   *
   */
  @JSProperty("onSeriesEnd")
  void setOnSeriesEnd(@Nullable JsFunction value);

  /**
   * Callback before a series is played.
   *
   */
  @JSProperty("onSeriesStart")
  @Nullable
  JsFunction getOnSeriesStart();

  /**
   * Callback before a series is played.
   *
   */
  @JSProperty("onSeriesStart")
  void setOnSeriesStart(@Nullable JsFunction value);

  /**
   * Define the order to play the series in. This can be given as a
   * string, or an array specifying a custom ordering. If given as a
   * string, valid values are <code>sequential</code> - where each series is played
   * in order - or <code>simultaneous</code>, where all series are played at once.
   * For custom ordering, supply an array as the order. Each element in
   * the array can be either a string with a series ID, an Earcon object,
   * or an object with a numeric <code>silentWait</code> property designating a
   * number of milliseconds to wait before continuing. Each element of the
   * array will be played in order. To play elements simultaneously, group
   * the elements in an array.
   *
   */
  @JSProperty("order")
  Unknown /* ( string | Array < ( string | Earcon | Array < ( string | Earcon ) > ) > ) */ getOrder(
      );

  /**
   * Define the order to play the series in. This can be given as a
   * string, or an array specifying a custom ordering. If given as a
   * string, valid values are <code>sequential</code> - where each series is played
   * in order - or <code>simultaneous</code>, where all series are played at once.
   * For custom ordering, supply an array as the order. Each element in
   * the array can be either a string with a series ID, an Earcon object,
   * or an object with a numeric <code>silentWait</code> property designating a
   * number of milliseconds to wait before continuing. Each element of the
   * array will be played in order. To play elements simultaneously, group
   * the elements in an array.
   *
   */
  @JSProperty("order")
  void setOrder(Earcon[] value);

  /**
   * Define the order to play the series in. This can be given as a
   * string, or an array specifying a custom ordering. If given as a
   * string, valid values are <code>sequential</code> - where each series is played
   * in order - or <code>simultaneous</code>, where all series are played at once.
   * For custom ordering, supply an array as the order. Each element in
   * the array can be either a string with a series ID, an Earcon object,
   * or an object with a numeric <code>silentWait</code> property designating a
   * number of milliseconds to wait before continuing. Each element of the
   * array will be played in order. To play elements simultaneously, group
   * the elements in an array.
   *
   */
  @JSProperty("order")
  void setOrder(String value);

  /**
   * Define the order to play the series in. This can be given as a
   * string, or an array specifying a custom ordering. If given as a
   * string, valid values are <code>sequential</code> - where each series is played
   * in order - or <code>simultaneous</code>, where all series are played at once.
   * For custom ordering, supply an array as the order. Each element in
   * the array can be either a string with a series ID, an Earcon object,
   * or an object with a numeric <code>silentWait</code> property designating a
   * number of milliseconds to wait before continuing. Each element of the
   * array will be played in order. To play elements simultaneously, group
   * the elements in an array.
   *
   */
  @JSProperty("order")
  void setOrder(String[] value);

  /**
   * The axis to use for when to play the points. Can be a string with a
   * data property (e.g. <code>x</code>), or a function. If it is a function, this
   * function receives the point as argument, and should return a numeric
   * value. The points with the lowest numeric values are then played
   * first, and the time between points will be proportional to the
   * distance between the numeric values. This option can not be
   * overridden per series.
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
   * distance between the numeric values. This option can not be
   * overridden per series.
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
   * distance between the numeric values. This option can not be
   * overridden per series.
   *
   */
  @JSProperty("pointPlayTime")
  void setPointPlayTime(JsFunction value);

  /**
   * Options as given to <code>series.sonify</code> to override options per series.
   * If the option is supplied as an array of options objects, the <code>id</code>
   * property of the object should correspond to the series' id. If the
   * option is supplied as a single object, the options apply to all
   * series.
   *
   */
  @JSProperty("seriesOptions")
  @Nullable
  Unknown /* ( object | Array < object > ) */ getSeriesOptions();

  /**
   * Options as given to <code>series.sonify</code> to override options per series.
   * If the option is supplied as an array of options objects, the <code>id</code>
   * property of the object should correspond to the series' id. If the
   * option is supplied as a single object, the options apply to all
   * series.
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(SonificationObject[] value);

  /**
   * Options as given to <code>series.sonify</code> to override options per series.
   * If the option is supplied as an array of options objects, the <code>id</code>
   * property of the object should correspond to the series' id. If the
   * option is supplied as a single object, the options apply to all
   * series.
   *
   */
  @JSProperty("seriesOptions")
  void setSeriesOptions(@Nullable SonificationObject value);

  class Builder {
    private final SonificationOptions object = Any.empty();

    public SonificationOptions build() {
      return object;
    }

    /**
     * Milliseconds of silent waiting to add between series. Note that
     * waiting time is considered part of the sonify duration.
     *
     */
    public Builder afterSeriesWait(double value) {
      object.setAfterSeriesWait(value);
      return this;
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
     * Duration for sonifying the entire chart. The duration is distributed
     * across the different series intelligently, but does not take earcons
     * into account. It is also possible to set the duration explicitly per
     * series, using <code>seriesOptions</code>. Note that points may continue to play
     * after the duration has passed, but no new points will start playing.
     *
     */
    public Builder duration(double value) {
      object.setDuration(value);
      return this;
    }

    /**
     * Earcons to add to the chart. Note that earcons can also be added per
     * series using <code>seriesOptions</code>.
     *
     */
    public Builder earcons(EarconConfiguration[] value) {
      object.setEarcons(value);
      return this;
    }

    /**
     * The instrument definitions for the points in this chart.
     *
     */
    public Builder instruments(PointInstrumentObject[] value) {
      object.setInstruments(value);
      return this;
    }

    /**
     * Callback after the chart has played.
     *
     */
    public Builder onEnd(@Nullable JsFunction value) {
      object.setOnEnd(value);
      return this;
    }

    /**
     * Callback after a series has finished playing.
     *
     */
    public Builder onSeriesEnd(@Nullable JsFunction value) {
      object.setOnSeriesEnd(value);
      return this;
    }

    /**
     * Callback before a series is played.
     *
     */
    public Builder onSeriesStart(@Nullable JsFunction value) {
      object.setOnSeriesStart(value);
      return this;
    }

    /**
     * Define the order to play the series in. This can be given as a
     * string, or an array specifying a custom ordering. If given as a
     * string, valid values are <code>sequential</code> - where each series is played
     * in order - or <code>simultaneous</code>, where all series are played at once.
     * For custom ordering, supply an array as the order. Each element in
     * the array can be either a string with a series ID, an Earcon object,
     * or an object with a numeric <code>silentWait</code> property designating a
     * number of milliseconds to wait before continuing. Each element of the
     * array will be played in order. To play elements simultaneously, group
     * the elements in an array.
     *
     */
    public Builder order(Earcon[] value) {
      object.setOrder(value);
      return this;
    }

    /**
     * Define the order to play the series in. This can be given as a
     * string, or an array specifying a custom ordering. If given as a
     * string, valid values are <code>sequential</code> - where each series is played
     * in order - or <code>simultaneous</code>, where all series are played at once.
     * For custom ordering, supply an array as the order. Each element in
     * the array can be either a string with a series ID, an Earcon object,
     * or an object with a numeric <code>silentWait</code> property designating a
     * number of milliseconds to wait before continuing. Each element of the
     * array will be played in order. To play elements simultaneously, group
     * the elements in an array.
     *
     */
    public Builder order(String value) {
      object.setOrder(value);
      return this;
    }

    /**
     * Define the order to play the series in. This can be given as a
     * string, or an array specifying a custom ordering. If given as a
     * string, valid values are <code>sequential</code> - where each series is played
     * in order - or <code>simultaneous</code>, where all series are played at once.
     * For custom ordering, supply an array as the order. Each element in
     * the array can be either a string with a series ID, an Earcon object,
     * or an object with a numeric <code>silentWait</code> property designating a
     * number of milliseconds to wait before continuing. Each element of the
     * array will be played in order. To play elements simultaneously, group
     * the elements in an array.
     *
     */
    public Builder order(String[] value) {
      object.setOrder(value);
      return this;
    }

    /**
     * The axis to use for when to play the points. Can be a string with a
     * data property (e.g. <code>x</code>), or a function. If it is a function, this
     * function receives the point as argument, and should return a numeric
     * value. The points with the lowest numeric values are then played
     * first, and the time between points will be proportional to the
     * distance between the numeric values. This option can not be
     * overridden per series.
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
     * distance between the numeric values. This option can not be
     * overridden per series.
     *
     */
    public Builder pointPlayTime(JsFunction value) {
      object.setPointPlayTime(value);
      return this;
    }

    /**
     * Options as given to <code>series.sonify</code> to override options per series.
     * If the option is supplied as an array of options objects, the <code>id</code>
     * property of the object should correspond to the series' id. If the
     * option is supplied as a single object, the options apply to all
     * series.
     *
     */
    public Builder seriesOptions(SonificationObject[] value) {
      object.setSeriesOptions(value);
      return this;
    }

    /**
     * Options as given to <code>series.sonify</code> to override options per series.
     * If the option is supplied as an array of options objects, the <code>id</code>
     * property of the object should correspond to the series' id. If the
     * option is supplied as a single object, the options apply to all
     * series.
     *
     */
    public Builder seriesOptions(@Nullable SonificationObject value) {
      object.setSeriesOptions(value);
      return this;
    }
  }
}
