package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ColorType */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotVennClusterStatesHoverOptions extends Any {
  /**
   * (Highcharts, Highmaps) The fill color of the cluster marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   */
  @JSProperty("fillColor")
  @Nullable
  Unknown /* ColorType */ getFillColor();

  /**
   * (Highcharts, Highmaps) The fill color of the cluster marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable PatternObject value);

  /**
   * (Highcharts, Highmaps) The fill color of the cluster marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable String value);

  /**
   * (Highcharts, Highmaps) The fill color of the cluster marker in hover
   * state. When <code>undefined</code>, the series' or point's fillColor for normal
   * state is used.
   *
   */
  @JSProperty("fillColor")
  void setFillColor(@Nullable GradientColorObject value);

  class Builder {
    private final PlotVennClusterStatesHoverOptions object = Any.empty();

    public PlotVennClusterStatesHoverOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) The fill color of the cluster marker in hover
     * state. When <code>undefined</code>, the series' or point's fillColor for normal
     * state is used.
     *
     */
    public Builder fillColor(@Nullable PatternObject value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The fill color of the cluster marker in hover
     * state. When <code>undefined</code>, the series' or point's fillColor for normal
     * state is used.
     *
     */
    public Builder fillColor(@Nullable String value) {
      object.setFillColor(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The fill color of the cluster marker in hover
     * state. When <code>undefined</code>, the series' or point's fillColor for normal
     * state is used.
     *
     */
    public Builder fillColor(@Nullable GradientColorObject value) {
      object.setFillColor(value);
      return this;
    }
  }
}
