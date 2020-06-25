package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.SymbolOptionsObject;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/solid-gauge.src.js"
)
public interface SolidGaugeSymbolOptionsObject extends SymbolOptionsObject {
  /**
   * Whether to draw rounded edges.
   *
   */
  @JSProperty("rounded")
  boolean getRounded();

  /**
   * Whether to draw rounded edges.
   *
   */
  @JSProperty("rounded")
  void setRounded(boolean value);
}
