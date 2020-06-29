package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An annotation class which serves as a container for items like labels or
 * shapes. Created items are positioned on the chart either by linking them to
 * existing points or created mock points
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"Annotation as Annotation_Annotation"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Annotation extends Any {
  /**
   * An annotation class which serves as a container for items like labels or
   * shapes. Created items are positioned on the chart either by linking them
   * to existing points or created mock points
   *
   * @param chart
   * a chart instance
   *
   * @param userOptions
   * the options object
   *
   */
  @JSBody(
      params = {"chart", "userOptions"},
      script = "return new Annotation_Annotation(chart, userOptions)"
  )
  static Annotation create(Chart chart, AnnotationsOptions userOptions) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The group svg element.
   *
   */
  @JSProperty("group")
  SVGElement getGroup();

  /**
   * The group svg element.
   *
   */
  @JSProperty("group")
  void setGroup(SVGElement value);

  /**
   * The group svg element of the annotation's labels.
   *
   */
  @JSProperty("labelsGroup")
  SVGElement getLabelsGroup();

  /**
   * The group svg element of the annotation's labels.
   *
   */
  @JSProperty("labelsGroup")
  void setLabelsGroup(SVGElement value);

  /**
   * The options for the annotations.
   *
   */
  @JSProperty("options")
  AnnotationsOptions getOptions();

  /**
   * The options for the annotations.
   *
   */
  @JSProperty("options")
  void setOptions(AnnotationsOptions value);

  /**
   * The group svg element of the annotation's shapes.
   *
   */
  @JSProperty("shapesGroup")
  SVGElement getShapesGroup();

  /**
   * The group svg element of the annotation's shapes.
   *
   */
  @JSProperty("shapesGroup")
  void setShapesGroup(SVGElement value);

  /**
   * The user options for the annotations.
   *
   */
  @JSProperty("userOptions")
  AnnotationsOptions getUserOptions();

  /**
   * The user options for the annotations.
   *
   */
  @JSProperty("userOptions")
  void setUserOptions(AnnotationsOptions value);

  /**
   * Updates an annotation.
   *
   * @param userOptions
   * New user options for the annotation.
   *
   */
  void update(AnnotationsOptions userOptions);
}
