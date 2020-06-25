package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.external.highcharts.Annotation;
import js.lang.external.highcharts.AnnotationsOptions;
import js.lang.external.highcharts.Chart;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/annotations.src.js"
)
public interface AnnotationsChart extends Chart {
  /**
   * Add an annotation to the chart after render time.
   *
   * @param options
   * The annotation options for the new, detailed annotation.
   *
   * @return - The newly generated annotation.
   *
   */
  Annotation addAnnotation(AnnotationsOptions options, boolean redraw);

  /**
   * Add an annotation to the chart after render time.
   *
   * @param options
   * The annotation options for the new, detailed annotation.
   *
   * @return - The newly generated annotation.
   *
   */
  Annotation addAnnotation(AnnotationsOptions options);

  /**
   * Remove an annotation from the chart.
   *
   * @param idOrAnnotation
   * The annotation's id or direct annotation object.
   *
   */
  void removeAnnotation(Annotation idOrAnnotation);

  /**
   * Remove an annotation from the chart.
   *
   * @param idOrAnnotation
   * The annotation's id or direct annotation object.
   *
   */
  void removeAnnotation(String idOrAnnotation);

  /**
   * Remove an annotation from the chart.
   *
   * @param idOrAnnotation
   * The annotation's id or direct annotation object.
   *
   */
  void removeAnnotation(double idOrAnnotation);
}
