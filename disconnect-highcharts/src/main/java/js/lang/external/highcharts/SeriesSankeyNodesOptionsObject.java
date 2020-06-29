package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | Array < SeriesOrganizationDataLabelsOptionsObject > | Array < SeriesSankeyDataLabelsOptionsObject > ) */;
import js.lang.Unknown /* ( number | string ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A collection of options for the individual nodes. The nodes in a
 * sankey diagram are auto-generated instances of <code>Highcharts.Point</code>, but
 * options can be applied here and linked by the <code>id</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesSankeyNodesOptionsObject extends Any {
  /**
   * (Highcharts) The color of the auto generated node.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getColor();

  /**
   * (Highcharts) The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable PatternObject value);

  /**
   * (Highcharts) The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) The color of the auto generated node.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable GradientColorObject value);

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
   * (Highcharts) An optional column index of where to place the node. The
   * default behaviour is to place it next to the preceding node. Note that
   * this option name is counter intuitive in inverted charts, like for
   * example an organization chart rendered top down. In this case the
   * &quot;columns&quot; are horizontal.
   *
   */
  @JSProperty("column")
  double getColumn();

  /**
   * (Highcharts) An optional column index of where to place the node. The
   * default behaviour is to place it next to the preceding node. Note that
   * this option name is counter intuitive in inverted charts, like for
   * example an organization chart rendered top down. In this case the
   * &quot;columns&quot; are horizontal.
   *
   */
  @JSProperty("column")
  void setColumn(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
   * node. The options are the same as the ones for series.sankey.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  Unknown /* ( SeriesOrganizationDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | SeriesSankeyDataLabelsOptionsObject | Array < SeriesOrganizationDataLabelsOptionsObject > | Array < SeriesSankeyDataLabelsOptionsObject > ) */ getDataLabels(
      );

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
   * node. The options are the same as the ones for series.sankey.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesSankeyDataLabelsOptionsObject... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
   * node. The options are the same as the ones for series.sankey.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesOrganizationDataLabelsOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
   * node. The options are the same as the ones for series.sankey.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(SeriesOrganizationDataLabelsOptionsObject... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
   * node. The options are the same as the ones for series.sankey.dataLabels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable SeriesSankeyDataLabelsOptionsObject value);

  /**
   * (Highcharts) The job description for the node card, will be inserted by
   * the default <code>dataLabel.nodeFormatter</code>.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts) The job description for the node card, will be inserted by
   * the default <code>dataLabel.nodeFormatter</code>.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

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
   * (Highcharts) An image for the node card, will be inserted by the default
   * <code>dataLabel.nodeFormatter</code>.
   *
   */
  @JSProperty("image")
  @Nullable
  String getImage();

  /**
   * (Highcharts) An image for the node card, will be inserted by the default
   * <code>dataLabel.nodeFormatter</code>.
   *
   */
  @JSProperty("image")
  void setImage(@Nullable String value);

  /**
   * (Highcharts) Layout for the node's children. If <code>hanging</code>, this node's
   * children will hang below their parent, allowing a tighter packing of
   * nodes in the diagram.
   *
   */
  @JSProperty("layout")
  @Nullable
  Layout getLayout();

  /**
   * (Highcharts) Layout for the node's children. If <code>hanging</code>, this node's
   * children will hang below their parent, allowing a tighter packing of
   * nodes in the diagram.
   *
   */
  @JSProperty("layout")
  void setLayout(@Nullable Layout value);

  /**
   * (Highcharts) An optional level index of where to place the node. The
   * default behaviour is to place it next to the preceding node. Alias of
   * <code>nodes.column</code>, but in inverted sankeys and org charts, the levels are
   * laid out as rows.
   *
   */
  @JSProperty("level")
  double getLevel();

  /**
   * (Highcharts) An optional level index of where to place the node. The
   * default behaviour is to place it next to the preceding node. Alias of
   * <code>nodes.column</code>, but in inverted sankeys and org charts, the levels are
   * laid out as rows.
   *
   */
  @JSProperty("level")
  void setLevel(double value);

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

  /**
   * (Highcharts) In a horizontal layout, the vertical offset of a node in
   * terms of weight. Positive values shift the node downwards, negative shift
   * it upwards. In a vertical layout, like organization chart, the offset is
   * horizontal.
   *
   * If a percantage string is given, the node is offset by the percentage of
   * the node size plus <code>nodePadding</code>.
   *
   */
  @JSProperty("offset")
  @Nullable
  Unknown /* ( number | string ) */ getOffset();

  /**
   * (Highcharts) In a horizontal layout, the vertical offset of a node in
   * terms of weight. Positive values shift the node downwards, negative shift
   * it upwards. In a vertical layout, like organization chart, the offset is
   * horizontal.
   *
   * If a percantage string is given, the node is offset by the percentage of
   * the node size plus <code>nodePadding</code>.
   *
   */
  @JSProperty("offset")
  void setOffset(double value);

  /**
   * (Highcharts) In a horizontal layout, the vertical offset of a node in
   * terms of weight. Positive values shift the node downwards, negative shift
   * it upwards. In a vertical layout, like organization chart, the offset is
   * horizontal.
   *
   * If a percantage string is given, the node is offset by the percentage of
   * the node size plus <code>nodePadding</code>.
   *
   */
  @JSProperty("offset")
  void setOffset(@Nullable String value);

  /**
   * (Highcharts) The job title for the node card, will be inserted by the
   * default <code>dataLabel.nodeFormatter</code>.
   *
   */
  @JSProperty("title")
  @Nullable
  String getTitle();

  /**
   * (Highcharts) The job title for the node card, will be inserted by the
   * default <code>dataLabel.nodeFormatter</code>.
   *
   */
  @JSProperty("title")
  void setTitle(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Layout extends JsEnum {
    public static final Layout HANGING = JsEnum.of("hanging");

    public static final Layout NORMAL = JsEnum.of("normal");
  }

  final class Builder {
    private final SeriesSankeyNodesOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesSankeyNodesOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts) The color of the auto generated node.
     *
     */
    public Builder color(@Nullable PatternObject value) {
      object.setColor(value);
      return this;
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
     * (Highcharts) The color of the auto generated node.
     *
     */
    public Builder color(@Nullable GradientColorObject value) {
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
     * (Highcharts) An optional column index of where to place the node. The
     * default behaviour is to place it next to the preceding node. Note that
     * this option name is counter intuitive in inverted charts, like for
     * example an organization chart rendered top down. In this case the
     * &quot;columns&quot; are horizontal.
     *
     */
    public Builder column(double value) {
      object.setColumn(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
     * node. The options are the same as the ones for series.sankey.dataLabels.
     *
     */
    public Builder dataLabels(SeriesSankeyDataLabelsOptionsObject... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
     * node. The options are the same as the ones for series.sankey.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesOrganizationDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
     * node. The options are the same as the ones for series.sankey.dataLabels.
     *
     */
    public Builder dataLabels(SeriesOrganizationDataLabelsOptionsObject... value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
     * node. The options are the same as the ones for series.sankey.dataLabels.
     *
     */
    public Builder dataLabels(@Nullable SeriesSankeyDataLabelsOptionsObject value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts) The job description for the node card, will be inserted by
     * the default <code>dataLabel.nodeFormatter</code>.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
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
     * (Highcharts) An image for the node card, will be inserted by the default
     * <code>dataLabel.nodeFormatter</code>.
     *
     */
    public Builder image(@Nullable String value) {
      object.setImage(value);
      return this;
    }

    /**
     * (Highcharts) Layout for the node's children. If <code>hanging</code>, this node's
     * children will hang below their parent, allowing a tighter packing of
     * nodes in the diagram.
     *
     */
    public Builder layout(@Nullable Layout value) {
      object.setLayout(value);
      return this;
    }

    /**
     * (Highcharts) An optional level index of where to place the node. The
     * default behaviour is to place it next to the preceding node. Alias of
     * <code>nodes.column</code>, but in inverted sankeys and org charts, the levels are
     * laid out as rows.
     *
     */
    public Builder level(double value) {
      object.setLevel(value);
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

    /**
     * (Highcharts) In a horizontal layout, the vertical offset of a node in
     * terms of weight. Positive values shift the node downwards, negative shift
     * it upwards. In a vertical layout, like organization chart, the offset is
     * horizontal.
     *
     * If a percantage string is given, the node is offset by the percentage of
     * the node size plus <code>nodePadding</code>.
     *
     */
    public Builder offset(double value) {
      object.setOffset(value);
      return this;
    }

    /**
     * (Highcharts) In a horizontal layout, the vertical offset of a node in
     * terms of weight. Positive values shift the node downwards, negative shift
     * it upwards. In a vertical layout, like organization chart, the offset is
     * horizontal.
     *
     * If a percantage string is given, the node is offset by the percentage of
     * the node size plus <code>nodePadding</code>.
     *
     */
    public Builder offset(@Nullable String value) {
      object.setOffset(value);
      return this;
    }

    /**
     * (Highcharts) The job title for the node card, will be inserted by the
     * default <code>dataLabel.nodeFormatter</code>.
     *
     */
    public Builder title(@Nullable String value) {
      object.setTitle(value);
      return this;
    }
  }
}
