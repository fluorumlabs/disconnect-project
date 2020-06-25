package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a credits
 * label in the lower right corner of the chart. This can be changed using these
 * options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface CreditsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the credits
   * text.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the credits
   * text.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for the credits label.
   *
   */
  @JSProperty("href")
  @Nullable
  String getHref();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for the credits label.
   *
   */
  @JSProperty("href")
  void setHref(@Nullable String value);

  /**
   * (Highmaps) Credits for map source to be concatenated with conventional
   * credit text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   */
  @JSProperty("mapText")
  @Nullable
  String getMapText();

  /**
   * (Highmaps) Credits for map source to be concatenated with conventional
   * credit text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   */
  @JSProperty("mapText")
  void setMapText(@Nullable String value);

  /**
   * (Highmaps) Detailed credits for map source to be displayed on hover of
   * credits text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   */
  @JSProperty("mapTextFull")
  @Nullable
  String getMapTextFull();

  /**
   * (Highmaps) Detailed credits for map source to be displayed on hover of
   * credits text. By default this is a format string that collects copyright
   * information from the map if available.
   *
   */
  @JSProperty("mapTextFull")
  void setMapTextFull(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Position configuration for the
   * credits label.
   *
   */
  @JSProperty("position")
  @Nullable
  AlignObject getPosition();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Position configuration for the
   * credits label.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable AlignObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the credits
   * label.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the credits
   * label.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the credits label.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the credits label.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  class Builder {
    private final CreditsOptions object = Any.empty();

    public CreditsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the credits
     * text.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for the credits label.
     *
     */
    public Builder href(@Nullable String value) {
      object.setHref(value);
      return this;
    }

    /**
     * (Highmaps) Credits for map source to be concatenated with conventional
     * credit text. By default this is a format string that collects copyright
     * information from the map if available.
     *
     */
    public Builder mapText(@Nullable String value) {
      object.setMapText(value);
      return this;
    }

    /**
     * (Highmaps) Detailed credits for map source to be displayed on hover of
     * credits text. By default this is a format string that collects copyright
     * information from the map if available.
     *
     */
    public Builder mapTextFull(@Nullable String value) {
      object.setMapTextFull(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Position configuration for the
     * credits label.
     *
     */
    public Builder position(@Nullable AlignObject value) {
      object.setPosition(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the credits
     * label.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the credits label.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }
  }
}
