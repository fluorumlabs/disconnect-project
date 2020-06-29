package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Series options for parent nodes.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPackedbubbleParentNodeOptions extends Any {
  /**
   * (Highcharts) Allow this series' parent nodes to be selected by clicking
   * on the graph.
   *
   */
  @JSProperty("allowPointSelect")
  boolean getAllowPointSelect();

  /**
   * (Highcharts) Allow this series' parent nodes to be selected by clicking
   * on the graph.
   *
   */
  @JSProperty("allowPointSelect")
  void setAllowPointSelect(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotPackedbubbleParentNodeOptions object = Any.empty();

    private Builder() {
    }

    public PlotPackedbubbleParentNodeOptions build() {
      return object;
    }

    /**
     * (Highcharts) Allow this series' parent nodes to be selected by clicking
     * on the graph.
     *
     */
    public Builder allowPointSelect(boolean value) {
      object.setAllowPointSelect(value);
      return this;
    }
  }
}
