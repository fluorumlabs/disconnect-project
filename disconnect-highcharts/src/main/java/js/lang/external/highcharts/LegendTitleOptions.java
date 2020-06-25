package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of the
 * legend.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendTitleOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
   * legend title.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
   * legend title.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
   * title.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
   * title.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  class Builder {
    private final LegendTitleOptions object = Any.empty();

    public LegendTitleOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
     * legend title.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
     * title.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }
  }
}
