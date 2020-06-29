package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Point;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/stock-tools.src.js"
)
public interface StockToolsPoint extends Point {
  @JSProperty("mock")
  boolean getMock();

  @JSProperty("mock")
  void setMock(boolean value);
}
