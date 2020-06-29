package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( 'circle' | 'random' | Function ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for layout algorithm when simulation is enabled. Inside
 * there are options to change the speed, padding, initial bubbles positions and
 * more.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPackedbubbleLayoutAlgorithmOptions extends Any {
  /**
   * (Highcharts) The distance between two bubbles, when the algorithm starts
   * to treat two bubbles as overlapping. The <code>bubblePadding</code> is also the
   * expected distance between all the bubbles on simulation end.
   *
   */
  @JSProperty("bubblePadding")
  double getBubblePadding();

  /**
   * (Highcharts) The distance between two bubbles, when the algorithm starts
   * to treat two bubbles as overlapping. The <code>bubblePadding</code> is also the
   * expected distance between all the bubbles on simulation end.
   *
   */
  @JSProperty("bubblePadding")
  void setBubblePadding(double value);

  /**
   * (Highcharts) In case of split series, this option allows user to drag and
   * drop points between series, for changing point related series.
   *
   */
  @JSProperty("dragBetweenSeries")
  boolean getDragBetweenSeries();

  /**
   * (Highcharts) In case of split series, this option allows user to drag and
   * drop points between series, for changing point related series.
   *
   */
  @JSProperty("dragBetweenSeries")
  void setDragBetweenSeries(boolean value);

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
   * of the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
   * positions should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
   * <code>node.plotY</code>.
   *
   */
  @JSProperty("initialPositions")
  @Nullable
  Unknown /* ( 'circle' | 'random' | Function ) */ getInitialPositions();

  /**
   * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
   * of the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
   * positions should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
   * <code>node.plotY</code>.
   *
   */
  @JSProperty("initialPositions")
  void setInitialPositions(@Nullable JsFunction value);

  /**
   * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
   * of the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
   * positions should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
   * <code>node.plotY</code>.
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
   * (Highcharts) Max speed that node can get in one iteration. In terms of
   * simulation, it's a maximum translation (in pixels) that a node can move
   * (in both, x and y, dimensions). While <code>friction</code> is applied on all nodes,
   * max speed is applied only for nodes that move very fast, for example
   * small or disconnected ones.
   *
   */
  @JSProperty("maxSpeed")
  double getMaxSpeed();

  /**
   * (Highcharts) Max speed that node can get in one iteration. In terms of
   * simulation, it's a maximum translation (in pixels) that a node can move
   * (in both, x and y, dimensions). While <code>friction</code> is applied on all nodes,
   * max speed is applied only for nodes that move very fast, for example
   * small or disconnected ones.
   *
   */
  @JSProperty("maxSpeed")
  void setMaxSpeed(double value);

  /**
   * (Highcharts) Whether bubbles should interact with their parentNode to
   * keep them inside.
   *
   */
  @JSProperty("parentNodeLimit")
  boolean getParentNodeLimit();

  /**
   * (Highcharts) Whether bubbles should interact with their parentNode to
   * keep them inside.
   *
   */
  @JSProperty("parentNodeLimit")
  void setParentNodeLimit(boolean value);

  /**
   * (Highcharts) Layout algorithm options for parent nodes.
   *
   */
  @JSProperty("parentNodeOptions")
  @Nullable
  PlotPackedbubbleLayoutAlgorithmParentNodeOptions getParentNodeOptions();

  /**
   * (Highcharts) Layout algorithm options for parent nodes.
   *
   */
  @JSProperty("parentNodeOptions")
  void setParentNodeOptions(@Nullable PlotPackedbubbleLayoutAlgorithmParentNodeOptions value);

  /**
   * (Highcharts) Whether series should interact with each other or not. When
   * <code>parentNodeLimit</code> is set to true, thi option should be set to false to
   * avoid sticking points in wrong series parentNode.
   *
   */
  @JSProperty("seriesInteraction")
  boolean getSeriesInteraction();

  /**
   * (Highcharts) Whether series should interact with each other or not. When
   * <code>parentNodeLimit</code> is set to true, thi option should be set to false to
   * avoid sticking points in wrong series parentNode.
   *
   */
  @JSProperty("seriesInteraction")
  void setSeriesInteraction(boolean value);

  /**
   * (Highcharts) Whether to split series into individual groups or to mix all
   * series together.
   *
   */
  @JSProperty("splitSeries")
  @Nullable
  String getSplitSeries();

  /**
   * (Highcharts) Whether to split series into individual groups or to mix all
   * series together.
   *
   */
  @JSProperty("splitSeries")
  void setSplitSeries(@Nullable String value);

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
    private final PlotPackedbubbleLayoutAlgorithmOptions object = Any.empty();

    private Builder() {
    }

    public PlotPackedbubbleLayoutAlgorithmOptions build() {
      return object;
    }

    /**
     * (Highcharts) The distance between two bubbles, when the algorithm starts
     * to treat two bubbles as overlapping. The <code>bubblePadding</code> is also the
     * expected distance between all the bubbles on simulation end.
     *
     */
    public Builder bubblePadding(double value) {
      object.setBubblePadding(value);
      return this;
    }

    /**
     * (Highcharts) In case of split series, this option allows user to drag and
     * drop points between series, for changing point related series.
     *
     */
    public Builder dragBetweenSeries(boolean value) {
      object.setDragBetweenSeries(value);
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
     * of the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
     * positions should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
     * <code>node.plotY</code>.
     *
     */
    public Builder initialPositions(@Nullable JsFunction value) {
      object.setInitialPositions(value);
      return this;
    }

    /**
     * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
     * of the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
     * positions should be set on each node (<code>this.nodes</code>) as <code>node.plotX</code> and
     * <code>node.plotY</code>.
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
     * (Highcharts) Max speed that node can get in one iteration. In terms of
     * simulation, it's a maximum translation (in pixels) that a node can move
     * (in both, x and y, dimensions). While <code>friction</code> is applied on all nodes,
     * max speed is applied only for nodes that move very fast, for example
     * small or disconnected ones.
     *
     */
    public Builder maxSpeed(double value) {
      object.setMaxSpeed(value);
      return this;
    }

    /**
     * (Highcharts) Whether bubbles should interact with their parentNode to
     * keep them inside.
     *
     */
    public Builder parentNodeLimit(boolean value) {
      object.setParentNodeLimit(value);
      return this;
    }

    /**
     * (Highcharts) Layout algorithm options for parent nodes.
     *
     */
    public Builder parentNodeOptions(
        @Nullable PlotPackedbubbleLayoutAlgorithmParentNodeOptions value) {
      object.setParentNodeOptions(value);
      return this;
    }

    /**
     * (Highcharts) Whether series should interact with each other or not. When
     * <code>parentNodeLimit</code> is set to true, thi option should be set to false to
     * avoid sticking points in wrong series parentNode.
     *
     */
    public Builder seriesInteraction(boolean value) {
      object.setSeriesInteraction(value);
      return this;
    }

    /**
     * (Highcharts) Whether to split series into individual groups or to mix all
     * series together.
     *
     */
    public Builder splitSeries(@Nullable String value) {
      object.setSplitSeries(value);
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
