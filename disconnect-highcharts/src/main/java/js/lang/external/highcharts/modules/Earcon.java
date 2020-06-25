package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

/**
 * The Earcon class. Earcon objects represent a certain sound consisting of
 * one or more instruments playing a predefined sound.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface Earcon extends Any {
  /**
   * Cancel any current sonification of the Earcon. Calls onEnd functions.
   *
   * @param fadeOut
   * Whether or not to fade out as we stop. If false, the earcon is
   * cancelled synchronously.
   *
   */
  void cancelSonify(boolean fadeOut);

  /**
   * Cancel any current sonification of the Earcon. Calls onEnd functions.
   *
   */
  void cancelSonify();

  /**
   * Play the earcon, optionally overriding init options.
   *
   * @param options
   * Override existing options.
   *
   */
  void sonify(EarconOptionsObject options);
}
