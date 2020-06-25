package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.external.highcharts.PointOptionsObject;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/accessibility.src.js"
)
public interface AccessibilityPointOptionsObject extends PointOptionsObject {
  @JSProperty("accessibility")
  @Nullable
  AccessibilityPointAccessibilityOptionsObject getAccessibility();

  @JSProperty("accessibility")
  void setAccessibility(@Nullable AccessibilityPointAccessibilityOptionsObject value);
}
