package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ColorAxisGridOptions extends Any {
  /**
   * (Gantt) Set border color for the label grid lines.
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Gantt) Set border color for the label grid lines.
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(@Nullable String value);

  /**
   * (Gantt) Set border width of the label grid lines.
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Gantt) Set border width of the label grid lines.
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Gantt) Set cell height for grid axis labels. By default this is
   * calculated from font size. This option only applies to horizontal axes.
   *
   */
  @JSProperty("cellHeight")
  double getCellHeight();

  /**
   * (Gantt) Set cell height for grid axis labels. By default this is
   * calculated from font size. This option only applies to horizontal axes.
   *
   */
  @JSProperty("cellHeight")
  void setCellHeight(double value);

  /**
   * (Gantt) Set specific options for each column (or row for horizontal axes)
   * in the grid. Each extra column/row is its own axis, and the axis options
   * can be set here.
   *
   */
  @JSProperty("columns")
  @Nullable
  XAxisOptions[] getColumns();

  /**
   * (Gantt) Set specific options for each column (or row for horizontal axes)
   * in the grid. Each extra column/row is its own axis, and the axis options
   * can be set here.
   *
   */
  @JSProperty("columns")
  void setColumns(XAxisOptions... value);

  /**
   * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
   * charts.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
   * charts.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ColorAxisGridOptions object = Any.empty();

    private Builder() {
    }

    public ColorAxisGridOptions build() {
      return object;
    }

    /**
     * (Gantt) Set border color for the label grid lines.
     *
     */
    public Builder borderColor(@Nullable String value) {
      object.setBorderColor(value);
      return this;
    }

    /**
     * (Gantt) Set border width of the label grid lines.
     *
     */
    public Builder borderWidth(double value) {
      object.setBorderWidth(value);
      return this;
    }

    /**
     * (Gantt) Set cell height for grid axis labels. By default this is
     * calculated from font size. This option only applies to horizontal axes.
     *
     */
    public Builder cellHeight(double value) {
      object.setCellHeight(value);
      return this;
    }

    /**
     * (Gantt) Set specific options for each column (or row for horizontal axes)
     * in the grid. Each extra column/row is its own axis, and the axis options
     * can be set here.
     *
     */
    public Builder columns(XAxisOptions... value) {
      object.setColumns(value);
      return this;
    }

    /**
     * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
     * charts.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
