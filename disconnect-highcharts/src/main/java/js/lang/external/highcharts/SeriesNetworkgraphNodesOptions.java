package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( SeriesNetworkgraphDataLabelsOptionsObject | Array < SeriesNetworkgraphDataLabelsOptionsObject > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A collection of options for the individual nodes. The nodes in a
 * networkgraph diagram are auto-generated instances of <code>Highcharts.Point</code>, but
 * options can be applied here and linked by the <code>id</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesNetworkgraphNodesOptions extends Any {
  /**
   * (Highcharts) The color of the auto generated node.
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * (Highcharts) The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) The color index of the auto generated node, especially for
   * use in styled mode.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * (Highcharts) The color index of the auto generated node, especially for
   * use in styled mode.
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * (Highcharts) Individual data label for each node. The options are the
   * same as the ones for series.networkgraph.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( SeriesNetworkgraphDataLabelsOptionsObject | Array < SeriesNetworkgraphDataLabelsOptionsObject > ) */ getDataLabels(
      );

  /**
   * (Highcharts) Individual data label for each node. The options are the
   * same as the ones for series.networkgraph.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesNetworkgraphDataLabelsOptionsObject value);

  /**
   * (Highcharts) Individual data label for each node. The options are the
   * same as the ones for series.networkgraph.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesNetworkgraphDataLabelsOptionsObject[] value);

  /**
   * (Highcharts) The id of the auto-generated node, refering to the <code>from</code> or
   * <code>to</code> setting of the link.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * (Highcharts) The id of the auto-generated node, refering to the <code>from</code> or
   * <code>to</code> setting of the link.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * (Highcharts) Mass of the node. By default, each node has mass equal to
   * it's marker radius . Mass is used to determine how two connected nodes
   * should affect each other:
   *
   * Attractive force is multiplied by the ratio of two connected nodes; if a
   * big node has weights twice as the small one, then the small one will move
   * towards the big one twice faster than the big one to the small one .
   *
   */
  @JSProperty("mass")
  double getMass();

  /**
   * (Highcharts) Mass of the node. By default, each node has mass equal to
   * it's marker radius . Mass is used to determine how two connected nodes
   * should affect each other:
   *
   * Attractive force is multiplied by the ratio of two connected nodes; if a
   * big node has weights twice as the small one, then the small one will move
   * towards the big one twice faster than the big one to the small one .
   *
   */
  @JSProperty("mass")
  void setMass(double value);

  /**
   * (Highcharts) The name to display for the node in data labels and
   * tooltips. Use this when the name is different from the <code>id</code>. Where the id
   * must be unique for each node, this is not necessary for the name.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * (Highcharts) The name to display for the node in data labels and
   * tooltips. Use this when the name is different from the <code>id</code>. Where the id
   * must be unique for each node, this is not necessary for the name.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  class Builder {
    private final SeriesNetworkgraphNodesOptions object = Any.empty();

    public SeriesNetworkgraphNodesOptions build() {
      return object;
    }

    /**
     * (Highcharts) The color of the auto generated node.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) The color index of the auto generated node, especially for
     * use in styled mode.
     *
     */
    public Builder colorIndex(double value) {
      object.setColorIndex(value);
      return this;
    }

    /**
     * (Highcharts) Individual data label for each node. The options are the
     * same as the ones for series.networkgraph.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesNetworkgraphDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) Individual data label for each node. The options are the
     * same as the ones for series.networkgraph.dataLabels.
     *
     */
    public Builder dataLabels(SeriesNetworkgraphDataLabelsOptionsObject[] value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) The id of the auto-generated node, refering to the <code>from</code> or
     * <code>to</code> setting of the link.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts) Mass of the node. By default, each node has mass equal to
     * it's marker radius . Mass is used to determine how two connected nodes
     * should affect each other:
     *
     * Attractive force is multiplied by the ratio of two connected nodes; if a
     * big node has weights twice as the small one, then the small one will move
     * towards the big one twice faster than the big one to the small one .
     *
     */
    public Builder mass(double value) {
      object.setMass(value);
      return this;
    }

    /**
     * (Highcharts) The name to display for the node in data labels and
     * tooltips. Use this when the name is different from the <code>id</code>. Where the id
     * must be unique for each node, this is not necessary for the name.
     *
     */
    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }
  }
}
