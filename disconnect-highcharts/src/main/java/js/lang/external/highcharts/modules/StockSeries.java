package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.external.highcharts.Series;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/stock.src.js"
)
public interface StockSeries extends Series {
  /**
   * Highstock only. Set the compare mode of the series after render time.
   * In most cases it is more useful running Axis#setCompare on the X axis
   * to update all its series.
   *
   * @param compare
   * Can be one of <code>null</code> (default), <code>&quot;percent&quot;</code> or <code>&quot;value&quot;</code>.
   *
   */
  void setCompare(@Nullable String compare);

  /**
   * Highstock only. Set the compare mode of the series after render time.
   * In most cases it is more useful running Axis#setCompare on the X axis
   * to update all its series.
   *
   */
  void setCompare();
}
