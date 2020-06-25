package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ColorType */;
import org.teavm.jso.JSBody;

/**
 * Handle color operations. Some object methods are chainable.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Color as Color_Color"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Color extends Any {
  /**
   * Creates a color instance out of a color string or object.
   *
   * @param input
   * The input color in either rbga or hex format.
   *
   * @return Color instance.
   *
   */
  @JSBody(
      params = {"input"},
      script = "return Color_Color.parse(input)"
  )
  static Color parse(PatternObject input) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a color instance out of a color string or object.
   *
   * @param input
   * The input color in either rbga or hex format.
   *
   * @return Color instance.
   *
   */
  @JSBody(
      params = {"input"},
      script = "return Color_Color.parse(input)"
  )
  static Color parse(GradientColorObject input) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a color instance out of a color string or object.
   *
   * @param input
   * The input color in either rbga or hex format.
   *
   * @return Color instance.
   *
   */
  @JSBody(
      params = {"input"},
      script = "return Color_Color.parse(input)"
  )
  static Color parse(String input) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Handle color operations. Some object methods are chainable.
   *
   * @param input
   * The input color in either rbga or hex format
   *
   */
  @JSBody(
      params = {"input"},
      script = "return new Color_Color(input)"
  )
  static Color create(PatternObject input) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Handle color operations. Some object methods are chainable.
   *
   * @param input
   * The input color in either rbga or hex format
   *
   */
  @JSBody(
      params = {"input"},
      script = "return new Color_Color(input)"
  )
  static Color create(GradientColorObject input) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Handle color operations. Some object methods are chainable.
   *
   * @param input
   * The input color in either rbga or hex format
   *
   */
  @JSBody(
      params = {"input"},
      script = "return new Color_Color(input)"
  )
  static Color create(String input) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Brighten the color instance.
   *
   * @param alpha
   * The alpha value.
   *
   * @return This color with modifications.
   *
   */
  Color brighten(double alpha);

  /**
   * Return the color or gradient stops in the specified format
   *
   * @param format
   * Possible values are 'a', 'rgb', 'rgba' (default).
   *
   * @return This color as a string or gradient stops.
   *
   */
  Unknown /* ColorType */ get(@Nullable String format);

  /**
   * Return the color or gradient stops in the specified format
   *
   * @return This color as a string or gradient stops.
   *
   */
  Unknown /* ColorType */ get();

  /**
   * Set the color's opacity to a given alpha value.
   *
   * @param alpha
   * Opacity between 0 and 1.
   *
   * @return Color with modifications.
   *
   */
  Color setOpacity(double alpha);

  /**
   * Return an intermediate color between two colors.
   *
   * @param to
   * The color object to tween to.
   *
   * @param pos
   * The intermediate position, where 0 is the from color (current
   * color item), and 1 is the <code>to</code> color.
   *
   * @return The intermediate color in rgba notation.
   *
   */
  String tweenTo(Color to, double pos);
}
