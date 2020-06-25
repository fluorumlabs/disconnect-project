package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) Set options on specific levels in a tree grid axis. Takes precedence
 * over labels options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface YAxisLabelsLevelsOptions extends Any {
  /**
   * (Gantt) Specify the level which the options within this object applies
   * to.
   *
   */
  @JSProperty("level")
  double getLevel();

  /**
   * (Gantt) Specify the level which the options within this object applies
   * to.
   *
   */
  @JSProperty("level")
  void setLevel(double value);

  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  class Builder {
    private final YAxisLabelsLevelsOptions object = Any.empty();

    public YAxisLabelsLevelsOptions build() {
      return object;
    }

    /**
     * (Gantt) Specify the level which the options within this object applies
     * to.
     *
     */
    public Builder level(double value) {
      object.setLevel(value);
      return this;
    }

    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }
  }
}
