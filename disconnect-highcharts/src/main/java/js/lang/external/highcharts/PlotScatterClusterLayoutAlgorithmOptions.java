package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Options for layout algorithm. Inside there are options
 * to change the type of the algorithm, gridSize, distance or iterations.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotScatterClusterLayoutAlgorithmOptions extends Any {
  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>distance</code> is a
   * maximum distance between point and cluster center so that this point will
   * be inside the cluster. The distance is either a number defining pixels or
   * a percentage defining a percentage of the plot area width.
   *
   */
  @JSProperty("distance")
  @Nullable
  Unknown /* ( number | string ) */ getDistance();

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>distance</code> is a
   * maximum distance between point and cluster center so that this point will
   * be inside the cluster. The distance is either a number defining pixels or
   * a percentage defining a percentage of the plot area width.
   *
   */
  @JSProperty("distance")
  void setDistance(double value);

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>distance</code> is a
   * maximum distance between point and cluster center so that this point will
   * be inside the cluster. The distance is either a number defining pixels or
   * a percentage defining a percentage of the plot area width.
   *
   */
  @JSProperty("distance")
  void setDistance(@Nullable String value);

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to the <code>grid</code>, <code>gridSize</code> is a
   * size of a grid square element either as a number defining pixels, or a
   * percentage defining a percentage of the plot area width.
   *
   */
  @JSProperty("gridSize")
  @Nullable
  Unknown /* ( number | string ) */ getGridSize();

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to the <code>grid</code>, <code>gridSize</code> is a
   * size of a grid square element either as a number defining pixels, or a
   * percentage defining a percentage of the plot area width.
   *
   */
  @JSProperty("gridSize")
  void setGridSize(double value);

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to the <code>grid</code>, <code>gridSize</code> is a
   * size of a grid square element either as a number defining pixels, or a
   * percentage defining a percentage of the plot area width.
   *
   */
  @JSProperty("gridSize")
  void setGridSize(@Nullable String value);

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>iterations</code> are
   * the number of iterations that this algorithm will be repeated to find
   * clusters positions.
   *
   */
  @JSProperty("iterations")
  double getIterations();

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>iterations</code> are
   * the number of iterations that this algorithm will be repeated to find
   * clusters positions.
   *
   */
  @JSProperty("iterations")
  void setIterations(double value);

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>undefined</code> and there are
   * more visible points than the kmeansThreshold the <code>grid</code> algorithm is used
   * to find clusters, otherwise <code>kmeans</code>. It ensures good performance on
   * large datasets and better clusters arrangement after the zoom.
   *
   */
  @JSProperty("kmeansThreshold")
  double getKmeansThreshold();

  /**
   * (Highcharts, Highmaps) When <code>type</code> is set to <code>undefined</code> and there are
   * more visible points than the kmeansThreshold the <code>grid</code> algorithm is used
   * to find clusters, otherwise <code>kmeans</code>. It ensures good performance on
   * large datasets and better clusters arrangement after the zoom.
   *
   */
  @JSProperty("kmeansThreshold")
  void setKmeansThreshold(double value);

  class Builder {
    private final PlotScatterClusterLayoutAlgorithmOptions object = Any.empty();

    public PlotScatterClusterLayoutAlgorithmOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>distance</code> is a
     * maximum distance between point and cluster center so that this point will
     * be inside the cluster. The distance is either a number defining pixels or
     * a percentage defining a percentage of the plot area width.
     *
     */
    public Builder distance(double value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>distance</code> is a
     * maximum distance between point and cluster center so that this point will
     * be inside the cluster. The distance is either a number defining pixels or
     * a percentage defining a percentage of the plot area width.
     *
     */
    public Builder distance(@Nullable String value) {
      object.setDistance(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) When <code>type</code> is set to the <code>grid</code>, <code>gridSize</code> is a
     * size of a grid square element either as a number defining pixels, or a
     * percentage defining a percentage of the plot area width.
     *
     */
    public Builder gridSize(double value) {
      object.setGridSize(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) When <code>type</code> is set to the <code>grid</code>, <code>gridSize</code> is a
     * size of a grid square element either as a number defining pixels, or a
     * percentage defining a percentage of the plot area width.
     *
     */
    public Builder gridSize(@Nullable String value) {
      object.setGridSize(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) When <code>type</code> is set to <code>kmeans</code>, <code>iterations</code> are
     * the number of iterations that this algorithm will be repeated to find
     * clusters positions.
     *
     */
    public Builder iterations(double value) {
      object.setIterations(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) When <code>type</code> is set to <code>undefined</code> and there are
     * more visible points than the kmeansThreshold the <code>grid</code> algorithm is used
     * to find clusters, otherwise <code>kmeans</code>. It ensures good performance on
     * large datasets and better clusters arrangement after the zoom.
     *
     */
    public Builder kmeansThreshold(double value) {
      object.setKmeansThreshold(value);
      return this;
    }
  }
}
