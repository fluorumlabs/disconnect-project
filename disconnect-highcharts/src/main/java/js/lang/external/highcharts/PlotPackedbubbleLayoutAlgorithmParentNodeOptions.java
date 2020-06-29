package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( 'circle' | 'random' | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Layout algorithm options for parent nodes.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPackedbubbleLayoutAlgorithmParentNodeOptions extends Any {
  /**
   * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
   * to the desired positions.
   *
   */
  @JSProperty("friction")
  double getFriction();

  /**
   * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
   * to the desired positions.
   *
   */
  @JSProperty("friction")
  void setFriction(double value);

  /**
   * (Highcharts) Gravitational const used in the barycenter force of the
   * algorithm.
   *
   */
  @JSProperty("gravitationalConstant")
  double getGravitationalConstant();

  /**
   * (Highcharts) Gravitational const used in the barycenter force of the
   * algorithm.
   *
   */
  @JSProperty("gravitationalConstant")
  void setGravitationalConstant(double value);

  /**
   * (Highcharts) When <code>initialPositions</code> are set to 'circle',
   * <code>initialPositionRadius</code> is a distance from the center of circle, in which
   * nodes are created.
   *
   */
  @JSProperty("initialPositionRadius")
  double getInitialPositionRadius();

  /**
   * (Highcharts) When <code>initialPositions</code> are set to 'circle',
   * <code>initialPositionRadius</code> is a distance from the center of circle, in which
   * nodes are created.
   *
   */
  @JSProperty("initialPositionRadius")
  void setInitialPositionRadius(double value);

  /**
   * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
   * of built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where positions
   * should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
   * <code>node.plotY</code>
   *
   */
  @JSProperty("initialPositions")
  @Nullable
  Unknown /* ( 'circle' | 'random' | Function ) */ getInitialPositions();

  /**
   * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
   * of built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where positions
   * should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
   * <code>node.plotY</code>
   *
   */
  @JSProperty("initialPositions")
  void setInitialPositions(@Nullable JsFunction value);

  /**
   * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
   * of built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where positions
   * should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
   * <code>node.plotY</code>
   *
   */
  @JSProperty("initialPositions")
  void setInitialPositions(@Nullable InitialPositions value);

  /**
   * (Highcharts) Integration type. Available options are <code>'euler'</code> and
   * <code>'verlet'</code>. Integration determines how forces are applied on particles.
   * In Euler integration, force is applied direct as <code>newPosition += velocity;</code>. In Verlet integration, new position is based on a previous
   * posittion without velocity: <code>newPosition += previousPosition - newPosition</code>.
   *
   * Note that different integrations give different results as forces are
   * different.
   *
   * In Highcharts v7.0.x only <code>'euler'</code> integration was supported.
   *
   */
  @JSProperty("integration")
  @Nullable
  Integration getIntegration();

  /**
   * (Highcharts) Integration type. Available options are <code>'euler'</code> and
   * <code>'verlet'</code>. Integration determines how forces are applied on particles.
   * In Euler integration, force is applied direct as <code>newPosition += velocity;</code>. In Verlet integration, new position is based on a previous
   * posittion without velocity: <code>newPosition += previousPosition - newPosition</code>.
   *
   * Note that different integrations give different results as forces are
   * different.
   *
   * In Highcharts v7.0.x only <code>'euler'</code> integration was supported.
   *
   */
  @JSProperty("integration")
  void setIntegration(@Nullable Integration value);

  /**
   * (Highcharts) Ideal length (px) of the link between two nodes. When not
   * defined, length is calculated as: <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code>
   *
   * Note: Because of the algorithm specification, length of each link might
   * be not exactly as specified.
   *
   */
  @JSProperty("linkLength")
  double getLinkLength();

  /**
   * (Highcharts) Ideal length (px) of the link between two nodes. When not
   * defined, length is calculated as: <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code>
   *
   * Note: Because of the algorithm specification, length of each link might
   * be not exactly as specified.
   *
   */
  @JSProperty("linkLength")
  void setLinkLength(double value);

  /**
   * (Highcharts) Styling options for parentNodes markers. Similar to
   * line.marker options.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highcharts) Styling options for parentNodes markers. Similar to
   * line.marker options.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Highcharts) Max number of iterations before algorithm will stop. In
   * general, algorithm should find positions sooner, but when rendering huge
   * number of nodes, it is recommended to increase this value as finding
   * perfect graph positions can require more time.
   *
   */
  @JSProperty("maxIterations")
  double getMaxIterations();

  /**
   * (Highcharts) Max number of iterations before algorithm will stop. In
   * general, algorithm should find positions sooner, but when rendering huge
   * number of nodes, it is recommended to increase this value as finding
   * perfect graph positions can require more time.
   *
   */
  @JSProperty("maxIterations")
  void setMaxIterations(double value);

  /**
   * (Highcharts) Verlet integration only. Max speed that node can get in one
   * iteration. In terms of simulation, it's a maximum translation (in pixels)
   * that node can move (in both, x and y, dimensions). While <code>friction</code> is
   * applied on all nodes, max speed is applied only for nodes that move very
   * fast, for example small or disconnected ones.
   *
   */
  @JSProperty("maxSpeed")
  double getMaxSpeed();

  /**
   * (Highcharts) Verlet integration only. Max speed that node can get in one
   * iteration. In terms of simulation, it's a maximum translation (in pixels)
   * that node can move (in both, x and y, dimensions). While <code>friction</code> is
   * applied on all nodes, max speed is applied only for nodes that move very
   * fast, for example small or disconnected ones.
   *
   */
  @JSProperty("maxSpeed")
  void setMaxSpeed(double value);

  @JSProperty("seriesInteraction")
  boolean getSeriesInteraction();

  @JSProperty("seriesInteraction")
  void setSeriesInteraction(boolean value);

  /**
   * (Highcharts) Type of the algorithm used when positioning nodes.
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts) Type of the algorithm used when positioning nodes.
   *
   */
  @JSProperty("type")
  void setType(@Nullable Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type REINGOLD_FRUCHTERMAN = JsEnum.of("reingold-fruchterman");
  }

  final class Builder {
    private final PlotPackedbubbleLayoutAlgorithmParentNodeOptions object = Any.empty();

    private Builder() {
    }

    public PlotPackedbubbleLayoutAlgorithmParentNodeOptions build() {
      return object;
    }

    /**
     * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
     * to the desired positions.
     *
     */
    public Builder friction(double value) {
      object.setFriction(value);
      return this;
    }

    /**
     * (Highcharts) Gravitational const used in the barycenter force of the
     * algorithm.
     *
     */
    public Builder gravitationalConstant(double value) {
      object.setGravitationalConstant(value);
      return this;
    }

    /**
     * (Highcharts) When <code>initialPositions</code> are set to 'circle',
     * <code>initialPositionRadius</code> is a distance from the center of circle, in which
     * nodes are created.
     *
     */
    public Builder initialPositionRadius(double value) {
      object.setInitialPositionRadius(value);
      return this;
    }

    /**
     * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
     * of built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where positions
     * should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
     * <code>node.plotY</code>
     *
     */
    public Builder initialPositions(@Nullable JsFunction value) {
      object.setInitialPositions(value);
      return this;
    }

    /**
     * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
     * of built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where positions
     * should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
     * <code>node.plotY</code>
     *
     */
    public Builder initialPositions(@Nullable InitialPositions value) {
      object.setInitialPositions(value);
      return this;
    }

    /**
     * (Highcharts) Integration type. Available options are <code>'euler'</code> and
     * <code>'verlet'</code>. Integration determines how forces are applied on particles.
     * In Euler integration, force is applied direct as <code>newPosition += velocity;</code>. In Verlet integration, new position is based on a previous
     * posittion without velocity: <code>newPosition += previousPosition - newPosition</code>.
     *
     * Note that different integrations give different results as forces are
     * different.
     *
     * In Highcharts v7.0.x only <code>'euler'</code> integration was supported.
     *
     */
    public Builder integration(@Nullable Integration value) {
      object.setIntegration(value);
      return this;
    }

    /**
     * (Highcharts) Ideal length (px) of the link between two nodes. When not
     * defined, length is calculated as: <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code>
     *
     * Note: Because of the algorithm specification, length of each link might
     * be not exactly as specified.
     *
     */
    public Builder linkLength(double value) {
      object.setLinkLength(value);
      return this;
    }

    /**
     * (Highcharts) Styling options for parentNodes markers. Similar to
     * line.marker options.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highcharts) Max number of iterations before algorithm will stop. In
     * general, algorithm should find positions sooner, but when rendering huge
     * number of nodes, it is recommended to increase this value as finding
     * perfect graph positions can require more time.
     *
     */
    public Builder maxIterations(double value) {
      object.setMaxIterations(value);
      return this;
    }

    /**
     * (Highcharts) Verlet integration only. Max speed that node can get in one
     * iteration. In terms of simulation, it's a maximum translation (in pixels)
     * that node can move (in both, x and y, dimensions). While <code>friction</code> is
     * applied on all nodes, max speed is applied only for nodes that move very
     * fast, for example small or disconnected ones.
     *
     */
    public Builder maxSpeed(double value) {
      object.setMaxSpeed(value);
      return this;
    }

    public Builder seriesInteraction(boolean value) {
      object.setSeriesInteraction(value);
      return this;
    }

    /**
     * (Highcharts) Type of the algorithm used when positioning nodes.
     *
     */
    public Builder type(@Nullable Type value) {
      object.setType(value);
      return this;
    }
  }
}
