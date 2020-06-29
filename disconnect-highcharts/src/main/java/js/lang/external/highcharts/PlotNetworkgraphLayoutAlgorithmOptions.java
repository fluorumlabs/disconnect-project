package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( 'circle' | 'random' | Function ) */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotNetworkgraphLayoutAlgorithmOptions extends Any {
  /**
   * (Highcharts) Approximation used to calculate repulsive forces affecting
   * nodes. By default, when calculateing net force, nodes are compared
   * against each other, which gives O(N^2) complexity. Using Barnes-Hut
   * approximation, we decrease this to O(N log N), but the resulting graph
   * will have different layout. Barnes-Hut approximation divides space into
   * rectangles via quad tree, where forces exerted on nodes are calculated
   * directly for nearby cells, and for all others, cells are treated as a
   * separate node with center of mass.
   *
   */
  @JSProperty("approximation")
  @Nullable
  Approximation getApproximation();

  /**
   * (Highcharts) Approximation used to calculate repulsive forces affecting
   * nodes. By default, when calculateing net force, nodes are compared
   * against each other, which gives O(N^2) complexity. Using Barnes-Hut
   * approximation, we decrease this to O(N log N), but the resulting graph
   * will have different layout. Barnes-Hut approximation divides space into
   * rectangles via quad tree, where forces exerted on nodes are calculated
   * directly for nearby cells, and for all others, cells are treated as a
   * separate node with center of mass.
   *
   */
  @JSProperty("approximation")
  void setApproximation(@Nullable Approximation value);

  /**
   * (Highcharts) Attraction force applied on a node which is conected to
   * another node by a link. Passed are two arguments:
   *
   * <ul>
   * <li>
   * <code>d</code> - which is current distance between two nodes
   *
   * </li>
   * <li>
   * <code>k</code> - which is desired distance between two nodes
   *
   * </li>
   * </ul>
   * In <code>verlet</code> integration, defaults to: <code>function (d, k) { return (k - d) / d; }</code>
   *
   */
  @JSProperty("attractiveForce")
  @Nullable
  JsFunction getAttractiveForce();

  /**
   * (Highcharts) Attraction force applied on a node which is conected to
   * another node by a link. Passed are two arguments:
   *
   * <ul>
   * <li>
   * <code>d</code> - which is current distance between two nodes
   *
   * </li>
   * <li>
   * <code>k</code> - which is desired distance between two nodes
   *
   * </li>
   * </ul>
   * In <code>verlet</code> integration, defaults to: <code>function (d, k) { return (k - d) / d; }</code>
   *
   */
  @JSProperty("attractiveForce")
  void setAttractiveForce(@Nullable JsFunction value);

  /**
   * (Highcharts) Experimental. Enables live simulation of the algorithm
   * implementation. All nodes are animated as the forces applies on them.
   *
   */
  @JSProperty("enableSimulation")
  boolean getEnableSimulation();

  /**
   * (Highcharts) Experimental. Enables live simulation of the algorithm
   * implementation. All nodes are animated as the forces applies on them.
   *
   */
  @JSProperty("enableSimulation")
  void setEnableSimulation(boolean value);

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

  /**
   * (Highcharts) Repulsive force applied on a node. Passed are two arguments:
   *
   * <ul>
   * <li>
   * <code>d</code> - which is current distance between two nodes
   *
   * </li>
   * <li>
   * <code>k</code> - which is desired distance between two nodes
   *
   * </li>
   * </ul>
   * In <code>verlet</code> integration, defaults to: <code>function (d, k) { return (k - d) / d * (k &gt; d ? 1 : 0) }</code>
   *
   */
  @JSProperty("repulsiveForce")
  @Nullable
  JsFunction getRepulsiveForce();

  /**
   * (Highcharts) Repulsive force applied on a node. Passed are two arguments:
   *
   * <ul>
   * <li>
   * <code>d</code> - which is current distance between two nodes
   *
   * </li>
   * <li>
   * <code>k</code> - which is desired distance between two nodes
   *
   * </li>
   * </ul>
   * In <code>verlet</code> integration, defaults to: <code>function (d, k) { return (k - d) / d * (k &gt; d ? 1 : 0) }</code>
   *
   */
  @JSProperty("repulsiveForce")
  void setRepulsiveForce(@Nullable JsFunction value);

  /**
   * (Highcharts) Barnes-Hut approximation only. Deteremines when distance
   * between cell and node is small enough to caculate forces. Value of
   * <code>theta</code> is compared directly with quotient <code>s / d</code>, where <code>s</code> is the size
   * of the cell, and <code>d</code> is distance between center of cell's mass and
   * currently compared node.
   *
   */
  @JSProperty("theta")
  double getTheta();

  /**
   * (Highcharts) Barnes-Hut approximation only. Deteremines when distance
   * between cell and node is small enough to caculate forces. Value of
   * <code>theta</code> is compared directly with quotient <code>s / d</code>, where <code>s</code> is the size
   * of the cell, and <code>d</code> is distance between center of cell's mass and
   * currently compared node.
   *
   */
  @JSProperty("theta")
  void setTheta(double value);

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

  abstract class Approximation extends JsEnum {
    public static final Approximation BARNES_HUT = JsEnum.of("barnes-hut");

    public static final Approximation NONE = JsEnum.of("none");
  }

  abstract class Type extends JsEnum {
    public static final Type REINGOLD_FRUCHTERMAN = JsEnum.of("reingold-fruchterman");
  }

  final class Builder {
    private final PlotNetworkgraphLayoutAlgorithmOptions object = Any.empty();

    private Builder() {
    }

    public PlotNetworkgraphLayoutAlgorithmOptions build() {
      return object;
    }

    /**
     * (Highcharts) Approximation used to calculate repulsive forces affecting
     * nodes. By default, when calculateing net force, nodes are compared
     * against each other, which gives O(N^2) complexity. Using Barnes-Hut
     * approximation, we decrease this to O(N log N), but the resulting graph
     * will have different layout. Barnes-Hut approximation divides space into
     * rectangles via quad tree, where forces exerted on nodes are calculated
     * directly for nearby cells, and for all others, cells are treated as a
     * separate node with center of mass.
     *
     */
    public Builder approximation(@Nullable Approximation value) {
      object.setApproximation(value);
      return this;
    }

    /**
     * (Highcharts) Attraction force applied on a node which is conected to
     * another node by a link. Passed are two arguments:
     *
     * <ul>
     * <li>
     * <code>d</code> - which is current distance between two nodes
     *
     * </li>
     * <li>
     * <code>k</code> - which is desired distance between two nodes
     *
     * </li>
     * </ul>
     * In <code>verlet</code> integration, defaults to: <code>function (d, k) { return (k - d) / d; }</code>
     *
     */
    public Builder attractiveForce(@Nullable JsFunction value) {
      object.setAttractiveForce(value);
      return this;
    }

    /**
     * (Highcharts) Experimental. Enables live simulation of the algorithm
     * implementation. All nodes are animated as the forces applies on them.
     *
     */
    public Builder enableSimulation(boolean value) {
      object.setEnableSimulation(value);
      return this;
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

    /**
     * (Highcharts) Repulsive force applied on a node. Passed are two arguments:
     *
     * <ul>
     * <li>
     * <code>d</code> - which is current distance between two nodes
     *
     * </li>
     * <li>
     * <code>k</code> - which is desired distance between two nodes
     *
     * </li>
     * </ul>
     * In <code>verlet</code> integration, defaults to: <code>function (d, k) { return (k - d) / d * (k &gt; d ? 1 : 0) }</code>
     *
     */
    public Builder repulsiveForce(@Nullable JsFunction value) {
      object.setRepulsiveForce(value);
      return this;
    }

    /**
     * (Highcharts) Barnes-Hut approximation only. Deteremines when distance
     * between cell and node is small enough to caculate forces. Value of
     * <code>theta</code> is compared directly with quotient <code>s / d</code>, where <code>s</code> is the size
     * of the cell, and <code>d</code> is distance between center of cell's mass and
     * currently compared node.
     *
     */
    public Builder theta(double value) {
      object.setTheta(value);
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
