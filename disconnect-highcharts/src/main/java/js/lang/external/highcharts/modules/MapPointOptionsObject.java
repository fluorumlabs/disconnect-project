package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.PointOptionsObject;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/map.src.js"
)
public interface MapPointOptionsObject extends PointOptionsObject {
  @JSProperty("pointPadding")
  double getPointPadding();

  @JSProperty("pointPadding")
  void setPointPadding(double value);

  @JSProperty("value")
  double getValue();

  @JSProperty("value")
  void setValue(double value);
}
