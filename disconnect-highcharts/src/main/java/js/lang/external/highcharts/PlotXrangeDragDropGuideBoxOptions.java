package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide box
 * has one state by default, the <code>default</code> state.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotXrangeDragDropGuideBoxOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box default
   * state.
   *
   */
  @JSProperty("default")
  @Nullable
  DragDropGuideBoxOptionsObject getDefaultValue();

  /**
   * (Highcharts, Highstock, Gantt) Style options for the guide box default
   * state.
   *
   */
  @JSProperty("default")
  void setDefaultValue(@Nullable DragDropGuideBoxOptionsObject value);

  class Builder {
    private final PlotXrangeDragDropGuideBoxOptions object = Any.empty();

    public PlotXrangeDragDropGuideBoxOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box default
     * state.
     *
     */
    public Builder defaultValue(@Nullable DragDropGuideBoxOptionsObject value) {
      object.setDefaultValue(value);
      return this;
    }
  }
}
