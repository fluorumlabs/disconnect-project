package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The Tick class.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Tick as Tick_Tick"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Tick extends Any {
  /**
   * The Tick class.
   *
   * @param axis
   * The axis of the tick.
   *
   * @param pos
   * The position of the tick on the axis in terms of axis values.
   *
   * @param type
   * The type of tick, either 'minor' or an empty string
   *
   * @param noLabel
   * Whether to disable the label or not. Defaults to false.
   *
   * @param parameters
   * Optional parameters for the tick.
   *
   */
  @JSBody(
      params = {"axis", "pos", "type", "noLabel", "parameters"},
      script = "return new Tick_Tick(axis, pos, type, noLabel, parameters)"
  )
  static Tick create(Axis axis, double pos, @Nullable String type, boolean noLabel,
      @Nullable Any parameters) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Tick class.
   *
   * @param axis
   * The axis of the tick.
   *
   * @param pos
   * The position of the tick on the axis in terms of axis values.
   *
   * @param type
   * The type of tick, either 'minor' or an empty string
   *
   * @param noLabel
   * Whether to disable the label or not. Defaults to false.
   *
   */
  @JSBody(
      params = {"axis", "pos", "type", "noLabel"},
      script = "return new Tick_Tick(axis, pos, type, noLabel)"
  )
  static Tick create(Axis axis, double pos, @Nullable String type, boolean noLabel) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Tick class.
   *
   * @param axis
   * The axis of the tick.
   *
   * @param pos
   * The position of the tick on the axis in terms of axis values.
   *
   * @param type
   * The type of tick, either 'minor' or an empty string
   *
   */
  @JSBody(
      params = {"axis", "pos", "type"},
      script = "return new Tick_Tick(axis, pos, type)"
  )
  static Tick create(Axis axis, double pos, @Nullable String type) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The Tick class.
   *
   * @param axis
   * The axis of the tick.
   *
   * @param pos
   * The position of the tick on the axis in terms of axis values.
   *
   */
  @JSBody(
      params = {"axis", "pos"},
      script = "return new Tick_Tick(axis, pos)"
  )
  static Tick create(Axis axis, double pos) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The related axis of the tick.
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * The related axis of the tick.
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * The rendered grid line of the tick.
   *
   */
  @JSProperty("gridLine")
  @Nullable
  SVGElement getGridLine();

  /**
   * The rendered grid line of the tick.
   *
   */
  @JSProperty("gridLine")
  void setGridLine(@Nullable SVGElement value);

  /**
   * True if the tick is the first one on the axis.
   *
   */
  @JSProperty("isFirst")
  boolean getIsFirst();

  /**
   * True if the tick is the last one on the axis.
   *
   */
  @JSProperty("isLast")
  boolean getIsLast();

  /**
   * The rendered text label of the tick.
   *
   */
  @JSProperty("label")
  @Nullable
  SVGElement getLabel();

  /**
   * The rendered text label of the tick.
   *
   */
  @JSProperty("label")
  void setLabel(@Nullable SVGElement value);

  /**
   * The rendered mark of the tick.
   *
   */
  @JSProperty("mark")
  @Nullable
  SVGElement getMark();

  /**
   * The rendered mark of the tick.
   *
   */
  @JSProperty("mark")
  void setMark(@Nullable SVGElement value);

  /**
   * The logical position of the tick on the axis in terms of axis values.
   *
   */
  @JSProperty("pos")
  double getPos();

  /**
   * The logical position of the tick on the axis in terms of axis values.
   *
   */
  @JSProperty("pos")
  void setPos(double value);

  /**
   * The mark offset of the tick on the axis. Usually <code>undefined</code>, numeric for
   * grid axes.
   *
   */
  @JSProperty("tickmarkOffset")
  double getTickmarkOffset();

  /**
   * The mark offset of the tick on the axis. Usually <code>undefined</code>, numeric for
   * grid axes.
   *
   */
  @JSProperty("tickmarkOffset")
  void setTickmarkOffset(double value);
}
