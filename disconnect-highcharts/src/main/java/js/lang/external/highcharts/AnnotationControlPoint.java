package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * A control point class which is a connection between controllable transform
 * methods and a user actions.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"AnnotationControlPoint as AnnotationControlPoint_AnnotationControlPoint"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationControlPoint extends Any {
  /**
   * A control point class which is a connection between controllable
   * transform methods and a user actions.
   *
   * @param chart
   * A chart instance.
   *
   * @param target
   * A controllable instance which is a target for a control point.
   *
   * @param options
   * An options object.
   *
   * @param index
   * Point index.
   *
   */
  @JSBody(
      params = {"chart", "target", "options", "index"},
      script = "return new AnnotationControlPoint_AnnotationControlPoint(chart, target, options, index)"
  )
  static AnnotationControlPoint create(Chart chart, AnnotationControllable target,
      AnnotationControlPointOptionsObject options, double index) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A control point class which is a connection between controllable
   * transform methods and a user actions.
   *
   * @param chart
   * A chart instance.
   *
   * @param target
   * A controllable instance which is a target for a control point.
   *
   * @param options
   * An options object.
   *
   */
  @JSBody(
      params = {"chart", "target", "options"},
      script = "return new AnnotationControlPoint_AnnotationControlPoint(chart, target, options)"
  )
  static AnnotationControlPoint create(Chart chart, AnnotationControllable target,
      AnnotationControlPointOptionsObject options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Set the visibility of the control point.
   *
   * @param visible
   * Visibility of the control point.
   *
   */
  void setVisibility(boolean visible);

  /**
   * Update the control point.
   *
   * @param userOptions
   * New options for the control point.
   *
   */
  void update(AnnotationControlPointOptionsObject userOptions);
}
