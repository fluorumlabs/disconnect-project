package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* _Highcharts */;
import js.lang.external.highcharts.Highcharts;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Handles displaying chart's container in the fullscreen mode.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"factory as Fullscreen_factory", "Highcharts as Fullscreen_Highcharts"},
    module = "highcharts/es-modules/masters/modules/exporting.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/modules/exporting.src.js"
)
public interface Fullscreen extends Any {
  /**
   * Chart managed by the fullscreen controller.
   *
   */
  @JSProperty("chart")
  ExportingChart getChart();

  /**
   * Chart managed by the fullscreen controller.
   *
   */
  @JSProperty("chart")
  void setChart(ExportingChart value);

  /**
   * The flag is set to <code>true</code> when the chart is displayed in the
   * fullscreen mode.
   *
   */
  @JSProperty("isOpen")
  boolean getIsOpen();

  /**
   * The flag is set to <code>true</code> when the chart is displayed in the
   * fullscreen mode.
   *
   */
  @JSProperty("isOpen")
  void setIsOpen(boolean value);

  /**
   * Stops displaying the chart in fullscreen mode. Exporting module
   * required.
   *
   */
  void close();

  /**
   * Displays the chart in fullscreen mode. When fired customly by user
   * before exporting context button is created, button's text will not be
   * replaced - it's on the user side. Exporting module required.
   *
   */
  void open();

  /**
   * Toggles displaying the chart in fullscreen mode. By default, when the
   * exporting module is enabled, a context button with a drop down menu
   * in the upper right corner accesses this function. Exporting module
   * required.
   *
   */
  void toggle();

  /**
   * Adds the module to the imported Highcharts namespace.
   *
   * @param highcharts
   * The imported Highcharts namespace to extend.
   *
   */
  @JSBody(
      params = {"highcharts"},
      script = "Fullscreen_factory(highcharts)"
  )
  static void factory(Highcharts highcharts) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return Fullscreen_Highcharts"
  )
  static Unknown /* _Highcharts */ Highcharts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
