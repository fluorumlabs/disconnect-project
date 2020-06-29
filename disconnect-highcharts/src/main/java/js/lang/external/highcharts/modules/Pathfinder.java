package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* _Highcharts */;
import js.lang.external.highcharts.Highcharts;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"factory as Pathfinder_factory", "Highcharts as Pathfinder_Highcharts"},
    module = "highcharts/es-modules/masters/modules/pathfinder.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/modules/pathfinder.src.js"
)
public interface Pathfinder extends Any {
  /**
   * Adds the module to the imported Highcharts namespace.
   *
   * @param highcharts
   * The imported Highcharts namespace to extend.
   *
   */
  @JSBody(
      params = {"highcharts"},
      script = "Pathfinder_factory(highcharts)"
  )
  static void factory(Highcharts highcharts) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return Pathfinder_Highcharts"
  )
  static Unknown /* _Highcharts */ Highcharts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
