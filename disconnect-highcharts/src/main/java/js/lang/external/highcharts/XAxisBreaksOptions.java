package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
 * sections defined will be left out and all the points shifted closer to each
 * other.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface XAxisBreaksOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) A number indicating how much space should
   * be left between the start and the end of the break. The break size is
   * given in axis units, so for instance on a <code>datetime</code> axis, a break size
   * of 3600000 would indicate the equivalent of an hour.
   *
   */
  @JSProperty("breakSize")
  double getBreakSize();

  /**
   * (Highcharts, Highstock, Gantt) A number indicating how much space should
   * be left between the start and the end of the break. The break size is
   * given in axis units, so for instance on a <code>datetime</code> axis, a break size
   * of 3600000 would indicate the equivalent of an hour.
   *
   */
  @JSProperty("breakSize")
  void setBreakSize(double value);

  /**
   * (Highcharts, Highstock, Gantt) The point where the break starts.
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highstock, Gantt) The point where the break starts.
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highstock, Gantt) Defines an interval after which the break
   * appears again. By default the breaks do not repeat.
   *
   */
  @JSProperty("repeat")
  double getRepeat();

  /**
   * (Highcharts, Highstock, Gantt) Defines an interval after which the break
   * appears again. By default the breaks do not repeat.
   *
   */
  @JSProperty("repeat")
  void setRepeat(double value);

  /**
   * (Highcharts, Highstock, Gantt) The point where the break ends.
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highstock, Gantt) The point where the break ends.
   *
   */
  @JSProperty("to")
  void setTo(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final XAxisBreaksOptions object = Any.empty();

    private Builder() {
    }

    public XAxisBreaksOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) A number indicating how much space should
     * be left between the start and the end of the break. The break size is
     * given in axis units, so for instance on a <code>datetime</code> axis, a break size
     * of 3600000 would indicate the equivalent of an hour.
     *
     */
    public Builder breakSize(double value) {
      object.setBreakSize(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The point where the break starts.
     *
     */
    public Builder from(double value) {
      object.setFrom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Defines an interval after which the break
     * appears again. By default the breaks do not repeat.
     *
     */
    public Builder repeat(double value) {
      object.setRepeat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The point where the break ends.
     *
     */
    public Builder to(double value) {
      object.setTo(value);
      return this;
    }
  }
}
