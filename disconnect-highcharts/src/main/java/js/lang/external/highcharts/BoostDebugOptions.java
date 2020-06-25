package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost. Useful
 * for benchmarking, and general timing.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface BoostDebugOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
   * skipped through culling.
   *
   * When set to true, the number of points skipped in series processing is
   * outputted. Points are skipped if they are closer than 1 pixel from each
   * other.
   *
   */
  @JSProperty("showSkipSummary")
  boolean getShowSkipSummary();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
   * skipped through culling.
   *
   * When set to true, the number of points skipped in series processing is
   * outputted. Points are skipped if they are closer than 1 pixel from each
   * other.
   *
   */
  @JSProperty("showSkipSummary")
  void setShowSkipSummary(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
   * copy
   *
   * After rendering, the result is copied to an image which is injected into
   * the SVG.
   *
   * If this property is set to true, the time it takes for the buffer copy to
   * complete is outputted.
   *
   */
  @JSProperty("timeBufferCopy")
  boolean getTimeBufferCopy();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
   * copy
   *
   * After rendering, the result is copied to an image which is injected into
   * the SVG.
   *
   * If this property is set to true, the time it takes for the buffer copy to
   * complete is outputted.
   *
   */
  @JSProperty("timeBufferCopy")
  void setTimeBufferCopy(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
   * tree.
   *
   * This outputs the time spent building the k-d tree used for markers etc.
   *
   * Note that the k-d tree is built async, and runs post-rendering.
   * Following, it does not affect the performance of the rendering itself.
   *
   */
  @JSProperty("timeKDTree")
  boolean getTimeKDTree();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
   * tree.
   *
   * This outputs the time spent building the k-d tree used for markers etc.
   *
   * Note that the k-d tree is built async, and runs post-rendering.
   * Following, it does not affect the performance of the rendering itself.
   *
   */
  @JSProperty("timeKDTree")
  void setTimeKDTree(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
   *
   * This outputs the time spent on actual rendering in the console when set
   * to true.
   *
   */
  @JSProperty("timeRendering")
  boolean getTimeRendering();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
   *
   * This outputs the time spent on actual rendering in the console when set
   * to true.
   *
   */
  @JSProperty("timeRendering")
  void setTimeRendering(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
   *
   * This outputs the time spent on transforming the series data to vertex
   * buffers when set to true.
   *
   */
  @JSProperty("timeSeriesProcessing")
  boolean getTimeSeriesProcessing();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
   *
   * This outputs the time spent on transforming the series data to vertex
   * buffers when set to true.
   *
   */
  @JSProperty("timeSeriesProcessing")
  void setTimeSeriesProcessing(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
   *
   * This outputs the time spent on setting up the WebGL context, creating
   * shaders, and textures.
   *
   */
  @JSProperty("timeSetup")
  boolean getTimeSetup();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
   *
   * This outputs the time spent on setting up the WebGL context, creating
   * shaders, and textures.
   *
   */
  @JSProperty("timeSetup")
  void setTimeSetup(boolean value);

  class Builder {
    private final BoostDebugOptions object = Any.empty();

    public BoostDebugOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
     * skipped through culling.
     *
     * When set to true, the number of points skipped in series processing is
     * outputted. Points are skipped if they are closer than 1 pixel from each
     * other.
     *
     */
    public Builder showSkipSummary(boolean value) {
      object.setShowSkipSummary(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
     * copy
     *
     * After rendering, the result is copied to an image which is injected into
     * the SVG.
     *
     * If this property is set to true, the time it takes for the buffer copy to
     * complete is outputted.
     *
     */
    public Builder timeBufferCopy(boolean value) {
      object.setTimeBufferCopy(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
     * tree.
     *
     * This outputs the time spent building the k-d tree used for markers etc.
     *
     * Note that the k-d tree is built async, and runs post-rendering.
     * Following, it does not affect the performance of the rendering itself.
     *
     */
    public Builder timeKDTree(boolean value) {
      object.setTimeKDTree(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
     *
     * This outputs the time spent on actual rendering in the console when set
     * to true.
     *
     */
    public Builder timeRendering(boolean value) {
      object.setTimeRendering(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
     *
     * This outputs the time spent on transforming the series data to vertex
     * buffers when set to true.
     *
     */
    public Builder timeSeriesProcessing(boolean value) {
      object.setTimeSeriesProcessing(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
     *
     * This outputs the time spent on setting up the WebGL context, creating
     * shaders, and textures.
     *
     */
    public Builder timeSetup(boolean value) {
      object.setTimeSetup(value);
      return this;
    }
  }
}
