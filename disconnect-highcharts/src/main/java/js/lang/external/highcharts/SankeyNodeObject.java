package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A node in a sankey diagram.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SankeyNodeObject extends Point {
  /**
   * The color of the auto generated node.
   *
   */
  @JSProperty("color")
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(PatternObject value);

  /**
   * The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * The color index of the auto generated node, especially for use in styled
   * mode.
   *
   */
  @JSProperty("colorIndex")
  double getColorIndex();

  /**
   * The color index of the auto generated node, especially for use in styled
   * mode.
   *
   */
  @JSProperty("colorIndex")
  void setColorIndex(double value);

  /**
   * An optional column index of where to place the node. The default
   * behaviour is to place it next to the preceding node.
   *
   */
  @JSProperty("column")
  double getColumn();

  /**
   * An optional column index of where to place the node. The default
   * behaviour is to place it next to the preceding node.
   *
   */
  @JSProperty("column")
  void setColumn(double value);

  /**
   * The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting
   * of the link.
   *
   */
  @JSProperty("id")
  String getId();

  /**
   * The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting
   * of the link.
   *
   */
  @JSProperty("id")
  void setId(String value);

  /**
   * (Highcharts) The name to display for the node in data labels and
   * tooltips. Use this when the name is different from the <code>id</code>. Where the id
   * must be unique for each node, this is not necessary for the name.
   *
   */
  @JSProperty("name")
  String getName();

  /**
   * (Highcharts) The name to display for the node in data labels and
   * tooltips. Use this when the name is different from the <code>id</code>. Where the id
   * must be unique for each node, this is not necessary for the name.
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * The vertical offset of a node in terms of weight. Positive values shift
   * the node downwards, negative shift it upwards.
   *
   */
  @JSProperty("offset")
  double getOffset();

  /**
   * The vertical offset of a node in terms of weight. Positive values shift
   * the node downwards, negative shift it upwards.
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

  class Builder {
    private final SankeyNodeObject object = Any.empty();

    public SankeyNodeObject build() {
      return object;
    }

    /**
     * The color of the auto generated node.
     *
     */
    public Builder color(PatternObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * The color of the auto generated node.
     *
     */
    public Builder color(String value) {
      object.setColor(value);
      return this;
    }

    /**
     * The color of the auto generated node.
     *
     */
    public Builder color(GradientColorObject value) {
      object.setColor(value);
      return this;
    }

    /**
     * The color index of the auto generated node, especially for use in styled
     * mode.
     *
     */
    public Builder colorIndex(double value) {
      object.setColorIndex(value);
      return this;
    }

    /**
     * An optional column index of where to place the node. The default
     * behaviour is to place it next to the preceding node.
     *
     */
    public Builder column(double value) {
      object.setColumn(value);
      return this;
    }

    /**
     * The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting
     * of the link.
     *
     */
    public Builder id(String value) {
      object.setId(value);
      return this;
    }

    /**
     * (Highcharts) The name to display for the node in data labels and
     * tooltips. Use this when the name is different from the <code>id</code>. Where the id
     * must be unique for each node, this is not necessary for the name.
     *
     */
    public Builder name(String value) {
      object.setName(value);
      return this;
    }

    /**
     * The vertical offset of a node in terms of weight. Positive values shift
     * the node downwards, negative shift it upwards.
     *
     */
    public Builder offset(double value) {
      object.setOffset(value);
      return this;
    }
  }
}
