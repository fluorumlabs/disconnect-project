package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options to render charts in 3 dimensions. This feature requires
 * <code>highcharts-3d.js</code>, found in the download package or online at
 * code.highcharts.com/highcharts-3d.js.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Chart3dOptions extends Any {
  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   */
  @JSProperty("alpha")
  double getAlpha();

  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   */
  @JSProperty("alpha")
  void setAlpha(double value);

  /**
   * (Highcharts) Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the
   * best edge.
   *
   */
  @JSProperty("axisLabelPosition")
  @Nullable
  AxisLabelPosition getAxisLabelPosition();

  /**
   * (Highcharts) Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the
   * best edge.
   *
   */
  @JSProperty("axisLabelPosition")
  void setAxisLabelPosition(@Nullable AxisLabelPosition value);

  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   */
  @JSProperty("beta")
  double getBeta();

  /**
   * (Highcharts) One of the two rotation angles for the chart.
   *
   */
  @JSProperty("beta")
  void setBeta(double value);

  /**
   * (Highcharts) The total depth of the chart.
   *
   */
  @JSProperty("depth")
  double getDepth();

  /**
   * (Highcharts) The total depth of the chart.
   *
   */
  @JSProperty("depth")
  void setDepth(double value);

  /**
   * (Highcharts) Wether to render the chart using the 3D functionality.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts) Wether to render the chart using the 3D functionality.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts) Whether the 3d box should automatically adjust to the chart
   * plot area.
   *
   */
  @JSProperty("fitToPlot")
  boolean getFitToPlot();

  /**
   * (Highcharts) Whether the 3d box should automatically adjust to the chart
   * plot area.
   *
   */
  @JSProperty("fitToPlot")
  void setFitToPlot(boolean value);

  /**
   * (Highcharts) Provides the option to draw a frame around the charts by
   * defining a bottom, front and back panel.
   *
   */
  @JSProperty("frame")
  @Nullable
  Chart3dFrameOptions getFrame();

  /**
   * (Highcharts) Provides the option to draw a frame around the charts by
   * defining a bottom, front and back panel.
   *
   */
  @JSProperty("frame")
  void setFrame(@Nullable Chart3dFrameOptions value);

  /**
   * (Highcharts) Defines the distance the viewer is standing in front of the
   * chart, this setting is important to calculate the perspective effect in
   * column and scatter charts. It is not used for 3D pie charts.
   *
   */
  @JSProperty("viewDistance")
  double getViewDistance();

  /**
   * (Highcharts) Defines the distance the viewer is standing in front of the
   * chart, this setting is important to calculate the perspective effect in
   * column and scatter charts. It is not used for 3D pie charts.
   *
   */
  @JSProperty("viewDistance")
  void setViewDistance(double value);

  static Builder builder() {
    return new Builder();
  }

  abstract class AxisLabelPosition extends JsEnum {
    public static final AxisLabelPosition AUTO = JsEnum.of("auto");
  }

  final class Builder {
    private final Chart3dOptions object = Any.empty();

    private Builder() {
    }

    public Chart3dOptions build() {
      return object;
    }

    /**
     * (Highcharts) One of the two rotation angles for the chart.
     *
     */
    public Builder alpha(double value) {
      object.setAlpha(value);
      return this;
    }

    /**
     * (Highcharts) Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the
     * best edge.
     *
     */
    public Builder axisLabelPosition(@Nullable AxisLabelPosition value) {
      object.setAxisLabelPosition(value);
      return this;
    }

    /**
     * (Highcharts) One of the two rotation angles for the chart.
     *
     */
    public Builder beta(double value) {
      object.setBeta(value);
      return this;
    }

    /**
     * (Highcharts) The total depth of the chart.
     *
     */
    public Builder depth(double value) {
      object.setDepth(value);
      return this;
    }

    /**
     * (Highcharts) Wether to render the chart using the 3D functionality.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts) Whether the 3d box should automatically adjust to the chart
     * plot area.
     *
     */
    public Builder fitToPlot(boolean value) {
      object.setFitToPlot(value);
      return this;
    }

    /**
     * (Highcharts) Provides the option to draw a frame around the charts by
     * defining a bottom, front and back panel.
     *
     */
    public Builder frame(@Nullable Chart3dFrameOptions value) {
      object.setFrame(value);
      return this;
    }

    /**
     * (Highcharts) Defines the distance the viewer is standing in front of the
     * chart, this setting is important to calculate the perspective effect in
     * column and scatter charts. It is not used for 3D pie charts.
     *
     */
    public Builder viewDistance(double value) {
      object.setViewDistance(value);
      return this;
    }
  }
}
