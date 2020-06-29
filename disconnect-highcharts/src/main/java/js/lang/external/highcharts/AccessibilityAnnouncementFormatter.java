package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;

import javax.annotation.Nullable;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AccessibilityAnnouncementFormatter extends Any {
  Unknown /* ( false | string ) */ apply(Series[] updatedSeries, @Nullable Series addedSeries,
      @Nullable Point addedPoint);
}
