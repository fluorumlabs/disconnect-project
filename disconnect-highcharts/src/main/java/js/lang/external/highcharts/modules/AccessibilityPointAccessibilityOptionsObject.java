package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.external.highcharts.PointAccessibilityOptionsObject;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/accessibility.src.js"
)
public interface AccessibilityPointAccessibilityOptionsObject extends PointAccessibilityOptionsObject {
  /**
   * Provide a description of the data point, announced to screen readers.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * Provide a description of the data point, announced to screen readers.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);
}
