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
    module = "highcharts/es-modules/masters/modules/annotations.src.js"
)
public interface AnnotationsPoint extends Point {
  /**
   * Indicates if this is a mock point for an annotation.
   *
   */
  @JSProperty("mock")
  boolean getMock();

  /**
   * Indicates if this is a mock point for an annotation.
   *
   */
  @JSProperty("mock")
  void setMock(boolean value);
}
