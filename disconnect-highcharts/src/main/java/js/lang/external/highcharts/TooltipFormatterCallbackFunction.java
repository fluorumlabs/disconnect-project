package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( false | string | Array < ( string | null | undefined ) > | null | undefined ) */;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TooltipFormatterCallbackFunction extends Any {
  @Nullable
  Unknown /* ( false | string | Array < ( string | null | undefined ) > | null | undefined ) */ apply(
      Tooltip tooltip);
}
