package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Chart;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/full-screen.src.js"
)
public interface FullScreenChart extends Chart {
  @JSProperty("fullscreen")
  Fullscreen getFullscreen();

  @JSProperty("fullscreen")
  void setFullscreen(Fullscreen value);
}
