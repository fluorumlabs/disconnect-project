package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) A declarative filter to control of which data
 * labels to display. The declarative filter is designed for use when callback
 * functions are not available, like when the chart options require a pure JSON
 * structure or for use with graphical editors. For programmatic control, use
 * the <code>formatter</code> instead, and return <code>undefined</code> to disable a single data
 * label.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DataLabelsFilterOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
   * <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>, <code>==</code>, and <code>===</code>.
   *
   */
  @JSProperty("operator")
  @Nullable
  OptionsOperatorValue getOperator();

  /**
   * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
   * <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>, <code>==</code>, and <code>===</code>.
   *
   */
  @JSProperty("operator")
  void setOperator(@Nullable OptionsOperatorValue value);

  /**
   * (Highcharts, Highstock, Gantt) The point property to filter by. Point
   * options are passed directly to properties, additionally there are <code>y</code>
   * value, <code>percentage</code> and others listed under Highcharts.Point members.
   *
   */
  @JSProperty("property")
  @Nullable
  String getProperty();

  /**
   * (Highcharts, Highstock, Gantt) The point property to filter by. Point
   * options are passed directly to properties, additionally there are <code>y</code>
   * value, <code>percentage</code> and others listed under Highcharts.Point members.
   *
   */
  @JSProperty("property")
  void setProperty(@Nullable String value);

  /**
   * (Highcharts, Highstock, Gantt) The value to compare against.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * (Highcharts, Highstock, Gantt) The value to compare against.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final DataLabelsFilterOptionsObject object = Any.empty();

    private Builder() {
    }

    public DataLabelsFilterOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
     * <code>&gt;</code>, <code>&lt;</code>, <code>&gt;=</code>, <code>&lt;=</code>, <code>==</code>, and <code>===</code>.
     *
     */
    public Builder operator(@Nullable OptionsOperatorValue value) {
      object.setOperator(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The point property to filter by. Point
     * options are passed directly to properties, additionally there are <code>y</code>
     * value, <code>percentage</code> and others listed under Highcharts.Point members.
     *
     */
    public Builder property(@Nullable String value) {
      object.setProperty(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) The value to compare against.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
