package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

/**
 * The AccessibilityComponent base class, representing a part of the chart
 * that has accessibility logic connected to it. This class can be inherited
 * from to create a custom accessibility component for a chart.
 *
 * Components should take care to destroy added elements and unregister
 * event handlers on destroy. This is handled automatically if using
 * this.addEvent and this.createElement.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/accessibility.src.js"
)
public interface AccessibilityComponent extends Any {
}
