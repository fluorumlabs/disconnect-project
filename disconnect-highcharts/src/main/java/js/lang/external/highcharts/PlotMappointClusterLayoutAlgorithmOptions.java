package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* ( string | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Options for layout algorithm. Inside there are options
 * to change the type of the algorithm, gridSize, distance or iterations.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotMappointClusterLayoutAlgorithmOptions extends Any {
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

  /**
   * (Highcharts, Highmaps) Type of the algorithm used to combine points into
   * a cluster. There are three available algorithms:
   *
   * <ol>
   * <li>
   * <code>grid</code> - grid-based clustering technique. Points are assigned to
   * squares of set size depending on their position on the plot area. Points
   * inside the grid square are combined into a cluster. The grid size can be
   * controlled by <code>gridSize</code> property (grid size changes at certain zoom
   * levels).
   *
   * </li>
   * <li>
   * <code>kmeans</code> - based on K-Means clustering technique. In the first step,
   * points are divided using the grid method (distance property is a grid
   * size) to find the initial amount of clusters. Next, each point is
   * classified by computing the distance between each cluster center and that
   * point. When the closest cluster distance is lower than distance property
   * set by a user the point is added to this cluster otherwise is classified
   * as <code>noise</code>. The algorithm is repeated until each cluster center not
   * change its previous position more than one pixel. This technique is more
   * accurate but also more time consuming than the <code>grid</code> algorithm,
   * especially for big datasets.
   *
   * </li>
   * <li>
   * <code>optimizedKmeans</code> - based on K-Means clustering technique. This
   * algorithm uses k-means algorithm only on the chart initialization or when
   * chart extremes have greater range than on initialization. When a chart is
   * redrawn the algorithm checks only clustered points distance from the
   * cluster center and rebuild it when the point is spaced enough to be
   * outside the cluster. It provides performance improvement and more stable
   * clusters position yet can be used rather on small and sparse datasets.
   *
   * </li>
   * </ol>
   * By default, the algorithm depends on visible quantity of points and
   * <code>kmeansThreshold</code>. When there are more visible points than the
   * <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.
   *
   * The custom clustering algorithm can be added by assigning a callback
   * function as the type property. This function takes an array of
   * <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and
   * <code>layoutAlgorithm</code> options as arguments and should return an object with
   * grouped data.
   *
   * The algorithm should return an object like that: (see online
   * documentation for example)
   *
   * <code>clusterId</code> (example above - unique id of a cluster or noise) is an array
   * of points belonging to a cluster. If the array has only one point or
   * fewer points than set in <code>cluster.minimumClusterSize</code> it won't be
   * combined into a cluster.
   *
   */
  @JSProperty("type")
  @Nullable
  Unknown /* ( string | Function ) */ getType();

  /**
   * (Highcharts, Highmaps) Type of the algorithm used to combine points into
   * a cluster. There are three available algorithms:
   *
   * <ol>
   * <li>
   * <code>grid</code> - grid-based clustering technique. Points are assigned to
   * squares of set size depending on their position on the plot area. Points
   * inside the grid square are combined into a cluster. The grid size can be
   * controlled by <code>gridSize</code> property (grid size changes at certain zoom
   * levels).
   *
   * </li>
   * <li>
   * <code>kmeans</code> - based on K-Means clustering technique. In the first step,
   * points are divided using the grid method (distance property is a grid
   * size) to find the initial amount of clusters. Next, each point is
   * classified by computing the distance between each cluster center and that
   * point. When the closest cluster distance is lower than distance property
   * set by a user the point is added to this cluster otherwise is classified
   * as <code>noise</code>. The algorithm is repeated until each cluster center not
   * change its previous position more than one pixel. This technique is more
   * accurate but also more time consuming than the <code>grid</code> algorithm,
   * especially for big datasets.
   *
   * </li>
   * <li>
   * <code>optimizedKmeans</code> - based on K-Means clustering technique. This
   * algorithm uses k-means algorithm only on the chart initialization or when
   * chart extremes have greater range than on initialization. When a chart is
   * redrawn the algorithm checks only clustered points distance from the
   * cluster center and rebuild it when the point is spaced enough to be
   * outside the cluster. It provides performance improvement and more stable
   * clusters position yet can be used rather on small and sparse datasets.
   *
   * </li>
   * </ol>
   * By default, the algorithm depends on visible quantity of points and
   * <code>kmeansThreshold</code>. When there are more visible points than the
   * <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.
   *
   * The custom clustering algorithm can be added by assigning a callback
   * function as the type property. This function takes an array of
   * <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and
   * <code>layoutAlgorithm</code> options as arguments and should return an object with
   * grouped data.
   *
   * The algorithm should return an object like that: (see online
   * documentation for example)
   *
   * <code>clusterId</code> (example above - unique id of a cluster or noise) is an array
   * of points belonging to a cluster. If the array has only one point or
   * fewer points than set in <code>cluster.minimumClusterSize</code> it won't be
   * combined into a cluster.
   *
   */
  @JSProperty("type")
  void setType(@Nullable String value);

  /**
   * (Highcharts, Highmaps) Type of the algorithm used to combine points into
   * a cluster. There are three available algorithms:
   *
   * <ol>
   * <li>
   * <code>grid</code> - grid-based clustering technique. Points are assigned to
   * squares of set size depending on their position on the plot area. Points
   * inside the grid square are combined into a cluster. The grid size can be
   * controlled by <code>gridSize</code> property (grid size changes at certain zoom
   * levels).
   *
   * </li>
   * <li>
   * <code>kmeans</code> - based on K-Means clustering technique. In the first step,
   * points are divided using the grid method (distance property is a grid
   * size) to find the initial amount of clusters. Next, each point is
   * classified by computing the distance between each cluster center and that
   * point. When the closest cluster distance is lower than distance property
   * set by a user the point is added to this cluster otherwise is classified
   * as <code>noise</code>. The algorithm is repeated until each cluster center not
   * change its previous position more than one pixel. This technique is more
   * accurate but also more time consuming than the <code>grid</code> algorithm,
   * especially for big datasets.
   *
   * </li>
   * <li>
   * <code>optimizedKmeans</code> - based on K-Means clustering technique. This
   * algorithm uses k-means algorithm only on the chart initialization or when
   * chart extremes have greater range than on initialization. When a chart is
   * redrawn the algorithm checks only clustered points distance from the
   * cluster center and rebuild it when the point is spaced enough to be
   * outside the cluster. It provides performance improvement and more stable
   * clusters position yet can be used rather on small and sparse datasets.
   *
   * </li>
   * </ol>
   * By default, the algorithm depends on visible quantity of points and
   * <code>kmeansThreshold</code>. When there are more visible points than the
   * <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.
   *
   * The custom clustering algorithm can be added by assigning a callback
   * function as the type property. This function takes an array of
   * <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and
   * <code>layoutAlgorithm</code> options as arguments and should return an object with
   * grouped data.
   *
   * The algorithm should return an object like that: (see online
   * documentation for example)
   *
   * <code>clusterId</code> (example above - unique id of a cluster or noise) is an array
   * of points belonging to a cluster. If the array has only one point or
   * fewer points than set in <code>cluster.minimumClusterSize</code> it won't be
   * combined into a cluster.
   *
   */
  @JSProperty("type")
  void setType(@Nullable JsFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotMappointClusterLayoutAlgorithmOptions object = Any.empty();

    private Builder() {
    }

    public PlotMappointClusterLayoutAlgorithmOptions build() {
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

    /**
     * (Highcharts, Highmaps) Type of the algorithm used to combine points into
     * a cluster. There are three available algorithms:
     *
     * <ol>
     * <li>
     * <code>grid</code> - grid-based clustering technique. Points are assigned to
     * squares of set size depending on their position on the plot area. Points
     * inside the grid square are combined into a cluster. The grid size can be
     * controlled by <code>gridSize</code> property (grid size changes at certain zoom
     * levels).
     *
     * </li>
     * <li>
     * <code>kmeans</code> - based on K-Means clustering technique. In the first step,
     * points are divided using the grid method (distance property is a grid
     * size) to find the initial amount of clusters. Next, each point is
     * classified by computing the distance between each cluster center and that
     * point. When the closest cluster distance is lower than distance property
     * set by a user the point is added to this cluster otherwise is classified
     * as <code>noise</code>. The algorithm is repeated until each cluster center not
     * change its previous position more than one pixel. This technique is more
     * accurate but also more time consuming than the <code>grid</code> algorithm,
     * especially for big datasets.
     *
     * </li>
     * <li>
     * <code>optimizedKmeans</code> - based on K-Means clustering technique. This
     * algorithm uses k-means algorithm only on the chart initialization or when
     * chart extremes have greater range than on initialization. When a chart is
     * redrawn the algorithm checks only clustered points distance from the
     * cluster center and rebuild it when the point is spaced enough to be
     * outside the cluster. It provides performance improvement and more stable
     * clusters position yet can be used rather on small and sparse datasets.
     *
     * </li>
     * </ol>
     * By default, the algorithm depends on visible quantity of points and
     * <code>kmeansThreshold</code>. When there are more visible points than the
     * <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.
     *
     * The custom clustering algorithm can be added by assigning a callback
     * function as the type property. This function takes an array of
     * <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and
     * <code>layoutAlgorithm</code> options as arguments and should return an object with
     * grouped data.
     *
     * The algorithm should return an object like that: (see online
     * documentation for example)
     *
     * <code>clusterId</code> (example above - unique id of a cluster or noise) is an array
     * of points belonging to a cluster. If the array has only one point or
     * fewer points than set in <code>cluster.minimumClusterSize</code> it won't be
     * combined into a cluster.
     *
     */
    public Builder type(@Nullable String value) {
      object.setType(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Type of the algorithm used to combine points into
     * a cluster. There are three available algorithms:
     *
     * <ol>
     * <li>
     * <code>grid</code> - grid-based clustering technique. Points are assigned to
     * squares of set size depending on their position on the plot area. Points
     * inside the grid square are combined into a cluster. The grid size can be
     * controlled by <code>gridSize</code> property (grid size changes at certain zoom
     * levels).
     *
     * </li>
     * <li>
     * <code>kmeans</code> - based on K-Means clustering technique. In the first step,
     * points are divided using the grid method (distance property is a grid
     * size) to find the initial amount of clusters. Next, each point is
     * classified by computing the distance between each cluster center and that
     * point. When the closest cluster distance is lower than distance property
     * set by a user the point is added to this cluster otherwise is classified
     * as <code>noise</code>. The algorithm is repeated until each cluster center not
     * change its previous position more than one pixel. This technique is more
     * accurate but also more time consuming than the <code>grid</code> algorithm,
     * especially for big datasets.
     *
     * </li>
     * <li>
     * <code>optimizedKmeans</code> - based on K-Means clustering technique. This
     * algorithm uses k-means algorithm only on the chart initialization or when
     * chart extremes have greater range than on initialization. When a chart is
     * redrawn the algorithm checks only clustered points distance from the
     * cluster center and rebuild it when the point is spaced enough to be
     * outside the cluster. It provides performance improvement and more stable
     * clusters position yet can be used rather on small and sparse datasets.
     *
     * </li>
     * </ol>
     * By default, the algorithm depends on visible quantity of points and
     * <code>kmeansThreshold</code>. When there are more visible points than the
     * <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.
     *
     * The custom clustering algorithm can be added by assigning a callback
     * function as the type property. This function takes an array of
     * <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and
     * <code>layoutAlgorithm</code> options as arguments and should return an object with
     * grouped data.
     *
     * The algorithm should return an object like that: (see online
     * documentation for example)
     *
     * <code>clusterId</code> (example above - unique id of a cluster or noise) is an array
     * of points belonging to a cluster. If the array has only one point or
     * fewer points than set in <code>cluster.minimumClusterSize</code> it won't be
     * combined into a cluster.
     *
     */
    public Builder type(@Nullable JsFunction value) {
      object.setType(value);
      return this;
    }
  }
}
