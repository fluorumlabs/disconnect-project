package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.external.highcharts.Chart;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/data.src.js"
)
public interface DataChart extends Chart {
  /**
   * The data parser for this chart.
   *
   */
  @JSProperty("data")
  @Nullable
  Data getData();

  /**
   * The data parser for this chart.
   *
   */
  @JSProperty("data")
  void setData(@Nullable Data value);
}
