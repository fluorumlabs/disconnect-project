package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) A partial fill for each point, typically used
 * to visualize how much of a task is performed. The partial fill object can be
 * set either on series or point level.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface XrangePointPartialFillOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
   * filled. Values can be 0-1 and are converted to percentages in the default
   * data label formatter.
   *
   */
  @JSProperty("amount")
  double getAmount();

  /**
   * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
   * filled. Values can be 0-1 and are converted to percentages in the default
   * data label formatter.
   *
   */
  @JSProperty("amount")
  void setAmount(double value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   */
  @JSProperty("fill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFill();

  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable GradientColorObject value);

  class Builder {
    private final XrangePointPartialFillOptionsObject object = Any.empty();

    public XrangePointPartialFillOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
     * filled. Values can be 0-1 and are converted to percentages in the default
     * data label formatter.
     *
     */
    public Builder amount(double value) {
      object.setAmount(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The fill color to be used for partial
     * fills. Defaults to a darker shade of the point color.
     *
     */
    public Builder fill(@Nullable PatternObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The fill color to be used for partial
     * fills. Defaults to a darker shade of the point color.
     *
     */
    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The fill color to be used for partial
     * fills. Defaults to a darker shade of the point color.
     *
     */
    public Builder fill(@Nullable GradientColorObject value) {
      object.setFill(value);
      return this;
    }
  }
}
