package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Style options for the guide box. The guide box has one state by
 * default, the <code>default</code> state.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotGanttDragDropGuideBoxOptions extends Any {
  /**
   * (Gantt) Style options for the guide box default state.
   *
   */
  @JSProperty("default")
  @Nullable
  DragDropGuideBoxOptionsObject getDefaultValue();

  /**
   * (Gantt) Style options for the guide box default state.
   *
   */
  @JSProperty("default")
  void setDefaultValue(@Nullable DragDropGuideBoxOptionsObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotGanttDragDropGuideBoxOptions object = Any.empty();

    private Builder() {
    }

    public PlotGanttDragDropGuideBoxOptions build() {
      return object;
    }

    /**
     * (Gantt) Style options for the guide box default state.
     *
     */
    public Builder defaultValue(@Nullable DragDropGuideBoxOptionsObject value) {
      object.setDefaultValue(value);
      return this;
    }
  }
}
