package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Rotation options for the words in the wordcloud.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotWordcloudRotationOptions extends Any {
  /**
   * (Highcharts) The smallest degree of rotation for a word.
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts) The smallest degree of rotation for a word.
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts) The number of possible orientations for a word, within the
   * range of <code>rotation.from</code> and <code>rotation.to</code>. Must be a number larger than
   * 0.
   *
   */
  @JSProperty("orientations")
  double getOrientations();

  /**
   * (Highcharts) The number of possible orientations for a word, within the
   * range of <code>rotation.from</code> and <code>rotation.to</code>. Must be a number larger than
   * 0.
   *
   */
  @JSProperty("orientations")
  void setOrientations(double value);

  /**
   * (Highcharts) The largest degree of rotation for a word.
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts) The largest degree of rotation for a word.
   *
   */
  @JSProperty("to")
  void setTo(double value);

  class Builder {
    private final PlotWordcloudRotationOptions object = Any.empty();

    public PlotWordcloudRotationOptions build() {
      return object;
    }

    /**
     * (Highcharts) The smallest degree of rotation for a word.
     *
     */
    public Builder from(double value) {
      object.setFrom(value);
      return this;
    }

    /**
     * (Highcharts) The number of possible orientations for a word, within the
     * range of <code>rotation.from</code> and <code>rotation.to</code>. Must be a number larger than
     * 0.
     *
     */
    public Builder orientations(double value) {
      object.setOrientations(value);
      return this;
    }

    /**
     * (Highcharts) The largest degree of rotation for a word.
     *
     */
    public Builder to(double value) {
      object.setTo(value);
      return this;
    }
  }
}
