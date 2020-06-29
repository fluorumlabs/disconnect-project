package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * Holds a pattern definition.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PatternObject extends Any {
  /**
   * Animation options for the image pattern loading.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * Animation options for the image pattern loading.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * Animation options for the image pattern loading.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * Pattern options
   *
   */
  @JSProperty("pattern")
  PatternOptionsObject getPattern();

  /**
   * Pattern options
   *
   */
  @JSProperty("pattern")
  void setPattern(PatternOptionsObject value);

  /**
   * Optionally an index referencing which pattern to use. Highcharts adds 10
   * default patterns to the <code>Highcharts.patterns</code> array. Additional pattern
   * definitions can be pushed to this array if desired. This option is an
   * index into this array.
   *
   */
  @JSProperty("patternIndex")
  double getPatternIndex();

  /**
   * Optionally an index referencing which pattern to use. Highcharts adds 10
   * default patterns to the <code>Highcharts.patterns</code> array. Additional pattern
   * definitions can be pushed to this array if desired. This option is an
   * index into this array.
   *
   */
  @JSProperty("patternIndex")
  void setPatternIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PatternObject object = Any.empty();

    private Builder() {
    }

    public PatternObject build() {
      return object;
    }

    /**
     * Animation options for the image pattern loading.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * Animation options for the image pattern loading.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * Pattern options
     *
     */
    public Builder pattern(PatternOptionsObject value) {
      object.setPattern(value);
      return this;
    }

    /**
     * Optionally an index referencing which pattern to use. Highcharts adds 10
     * default patterns to the <code>Highcharts.patterns</code> array. Additional pattern
     * definitions can be pushed to this array if desired. This option is an
     * index into this array.
     *
     */
    public Builder patternIndex(double value) {
      object.setPatternIndex(value);
      return this;
    }
  }
}
