package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Provides the option to draw a frame around the charts by
 * defining a bottom, front and back panel.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Chart3dFrameOptions extends Any {
  /**
   * (Highcharts) The back side of the frame around a 3D chart.
   *
   */
  @JSProperty("back")
  @Nullable
  Chart3dFrameBackOptions getBack();

  /**
   * (Highcharts) The back side of the frame around a 3D chart.
   *
   */
  @JSProperty("back")
  void setBack(@Nullable Chart3dFrameBackOptions value);

  /**
   * (Highcharts) The bottom of the frame around a 3D chart.
   *
   */
  @JSProperty("bottom")
  @Nullable
  Chart3dFrameBottomOptions getBottom();

  /**
   * (Highcharts) The bottom of the frame around a 3D chart.
   *
   */
  @JSProperty("bottom")
  void setBottom(@Nullable Chart3dFrameBottomOptions value);

  /**
   * (Highcharts) The front of the frame around a 3D chart.
   *
   */
  @JSProperty("front")
  @Nullable
  Chart3dFrameFrontOptions getFront();

  /**
   * (Highcharts) The front of the frame around a 3D chart.
   *
   */
  @JSProperty("front")
  void setFront(@Nullable Chart3dFrameFrontOptions value);

  /**
   * (Highcharts) The left side of the frame around a 3D chart.
   *
   */
  @JSProperty("left")
  @Nullable
  Chart3dFrameLeftOptions getLeft();

  /**
   * (Highcharts) The left side of the frame around a 3D chart.
   *
   */
  @JSProperty("left")
  void setLeft(@Nullable Chart3dFrameLeftOptions value);

  /**
   * (Highcharts) The right of the frame around a 3D chart.
   *
   */
  @JSProperty("right")
  @Nullable
  Chart3dFrameRightOptions getRight();

  /**
   * (Highcharts) The right of the frame around a 3D chart.
   *
   */
  @JSProperty("right")
  void setRight(@Nullable Chart3dFrameRightOptions value);

  /**
   * (Highcharts) General pixel thickness for the frame faces.
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highcharts) General pixel thickness for the frame faces.
   *
   */
  @JSProperty("size")
  void setSize(double value);

  /**
   * (Highcharts) The top of the frame around a 3D chart.
   *
   */
  @JSProperty("top")
  @Nullable
  Chart3dFrameTopOptions getTop();

  /**
   * (Highcharts) The top of the frame around a 3D chart.
   *
   */
  @JSProperty("top")
  void setTop(@Nullable Chart3dFrameTopOptions value);

  /**
   * (Highcharts) Whether the frames are visible.
   *
   */
  @JSProperty("visible")
  @Nullable
  String getVisible();

  /**
   * (Highcharts) Whether the frames are visible.
   *
   */
  @JSProperty("visible")
  void setVisible(@Nullable String value);

  class Builder {
    private final Chart3dFrameOptions object = Any.empty();

    public Chart3dFrameOptions build() {
      return object;
    }

    /**
     * (Highcharts) The back side of the frame around a 3D chart.
     *
     */
    public Builder back(@Nullable Chart3dFrameBackOptions value) {
      object.setBack(value);
      return this;
    }

    /**
     * (Highcharts) The bottom of the frame around a 3D chart.
     *
     */
    public Builder bottom(@Nullable Chart3dFrameBottomOptions value) {
      object.setBottom(value);
      return this;
    }

    /**
     * (Highcharts) The front of the frame around a 3D chart.
     *
     */
    public Builder front(@Nullable Chart3dFrameFrontOptions value) {
      object.setFront(value);
      return this;
    }

    /**
     * (Highcharts) The left side of the frame around a 3D chart.
     *
     */
    public Builder left(@Nullable Chart3dFrameLeftOptions value) {
      object.setLeft(value);
      return this;
    }

    /**
     * (Highcharts) The right of the frame around a 3D chart.
     *
     */
    public Builder right(@Nullable Chart3dFrameRightOptions value) {
      object.setRight(value);
      return this;
    }

    /**
     * (Highcharts) General pixel thickness for the frame faces.
     *
     */
    public Builder size(double value) {
      object.setSize(value);
      return this;
    }

    /**
     * (Highcharts) The top of the frame around a 3D chart.
     *
     */
    public Builder top(@Nullable Chart3dFrameTopOptions value) {
      object.setTop(value);
      return this;
    }

    /**
     * (Highcharts) Whether the frames are visible.
     *
     */
    public Builder visible(@Nullable String value) {
      object.setVisible(value);
      return this;
    }
  }
}
