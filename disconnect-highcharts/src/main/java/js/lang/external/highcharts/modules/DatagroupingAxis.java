package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.external.highcharts.Axis;
import js.lang.external.highcharts.DataGroupingOptionsObject;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/datagrouping.src.js"
)
public interface DatagroupingAxis extends Axis {
  /**
   * (Highstock) Highstock only. Force data grouping on all the axis'
   * series.
   *
   * @param dataGrouping
   * A <code>dataGrouping</code> configuration. Use <code>false</code> to disable data
   * grouping dynamically.
   *
   * @param redraw
   * Whether to redraw the chart or wait for a later call to
   * Chart#redraw.
   *
   */
  void setDataGrouping(@Nullable DataGroupingOptionsObject dataGrouping, boolean redraw);

  /**
   * (Highstock) Highstock only. Force data grouping on all the axis'
   * series.
   *
   * @param dataGrouping
   * A <code>dataGrouping</code> configuration. Use <code>false</code> to disable data
   * grouping dynamically.
   *
   * @param redraw
   * Whether to redraw the chart or wait for a later call to
   * Chart#redraw.
   *
   */
  void setDataGrouping(boolean dataGrouping, boolean redraw);

  /**
   * (Highstock) Highstock only. Force data grouping on all the axis'
   * series.
   *
   * @param dataGrouping
   * A <code>dataGrouping</code> configuration. Use <code>false</code> to disable data
   * grouping dynamically.
   *
   */
  void setDataGrouping(@Nullable DataGroupingOptionsObject dataGrouping);

  /**
   * (Highstock) Highstock only. Force data grouping on all the axis'
   * series.
   *
   * @param dataGrouping
   * A <code>dataGrouping</code> configuration. Use <code>false</code> to disable data
   * grouping dynamically.
   *
   */
  void setDataGrouping(boolean dataGrouping);

  /**
   * (Highstock) Highstock only. Force data grouping on all the axis'
   * series.
   *
   */
  void setDataGrouping();
}
