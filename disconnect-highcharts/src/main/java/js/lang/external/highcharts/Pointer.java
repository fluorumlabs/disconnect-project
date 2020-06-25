package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.HTMLElement;
import js.web.dom.MouseEvent;
import js.web.pointerevents.PointerEvent;
import js.web.touchevents.TouchEvent;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/**
 * The mouse and touch tracker object. Each Chart item has one assosiated
 * Pointer item that can be accessed from the Chart.pointer property.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Pointer as Pointer_Pointer"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Pointer extends Any {
  /**
   * The mouse and touch tracker object. Each Chart item has one assosiated
   * Pointer item that can be accessed from the Chart.pointer property.
   *
   * @param chart
   * The chart instance.
   *
   * @param options
   * The root options object. The pointer uses options from the chart
   * and tooltip structures.
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Pointer_Pointer(chart, options)"
  )
  static Pointer create(Chart chart, Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Destroys the Pointer object and disconnects DOM events.
   *
   */
  void destroy();

  /**
   * Finds the closest point to a set of coordinates, using the k-d-tree
   * algorithm.
   *
   * @param series
   * All the series to search in.
   *
   * @param shared
   * Whether it is a shared tooltip or not.
   *
   * @param e
   * The pointer event object, containing chart coordinates of the
   * pointer.
   *
   * @return The point closest to given coordinates.
   *
   */
  @Nullable
  Point findNearestKDPoints(Series[] series, boolean shared, PointerEventObject e);

  /**
   * Return the cached chartPosition if it is available on the Pointer,
   * otherwise find it. Running offset is quite expensive, so it should be
   * avoided when we know the chart hasn't moved.
   *
   * @return The offset of the chart container within the page
   *
   */
  OffsetObject getChartPosition();

  /**
   * Get the click position in terms of axis values.
   *
   * @param e
   * Pointer event, extended with <code>chartX</code> and <code>chartY</code> properties.
   *
   */
  PointerAxisCoordinatesObject getCoordinates(PointerEventObject e);

  /**
   * Utility to detect whether an element has, or has a parent with, a
   * specificclass name. Used on detection of tracker objects and on deciding
   * whether hovering the tooltip should cause the active series to mouse out.
   *
   * @param element
   * The element to investigate.
   *
   * @param className
   * The class name to look for.
   *
   * @return True if either the element or one of its parents has the given
   * class name.
   *
   */
  boolean inClass(js.web.dom.svg.SVGElement element, String className);

  /**
   * Utility to detect whether an element has, or has a parent with, a
   * specificclass name. Used on detection of tracker objects and on deciding
   * whether hovering the tooltip should cause the active series to mouse out.
   *
   * @param element
   * The element to investigate.
   *
   * @param className
   * The class name to look for.
   *
   * @return True if either the element or one of its parents has the given
   * class name.
   *
   */
  boolean inClass(HTMLElement element, String className);

  /**
   * Takes a browser event object and extends it with custom Highcharts
   * properties <code>chartX</code> and <code>chartY</code> in order to work on the internal
   * coordinate system.
   *
   * @param e
   * Event object in standard browsers.
   *
   * @param chartPosition
   * Additional chart offset.
   *
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   */
  PointerEventObject normalize(TouchEvent e, @Nullable OffsetObject chartPosition);

  /**
   * Takes a browser event object and extends it with custom Highcharts
   * properties <code>chartX</code> and <code>chartY</code> in order to work on the internal
   * coordinate system.
   *
   * @param e
   * Event object in standard browsers.
   *
   * @param chartPosition
   * Additional chart offset.
   *
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   */
  PointerEventObject normalize(PointerEvent e, @Nullable OffsetObject chartPosition);

  /**
   * Takes a browser event object and extends it with custom Highcharts
   * properties <code>chartX</code> and <code>chartY</code> in order to work on the internal
   * coordinate system.
   *
   * @param e
   * Event object in standard browsers.
   *
   * @param chartPosition
   * Additional chart offset.
   *
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   */
  PointerEventObject normalize(MouseEvent e, @Nullable OffsetObject chartPosition);

  /**
   * Takes a browser event object and extends it with custom Highcharts
   * properties <code>chartX</code> and <code>chartY</code> in order to work on the internal
   * coordinate system.
   *
   * @param e
   * Event object in standard browsers.
   *
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   */
  PointerEventObject normalize(TouchEvent e);

  /**
   * Takes a browser event object and extends it with custom Highcharts
   * properties <code>chartX</code> and <code>chartY</code> in order to work on the internal
   * coordinate system.
   *
   * @param e
   * Event object in standard browsers.
   *
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   */
  PointerEventObject normalize(PointerEvent e);

  /**
   * Takes a browser event object and extends it with custom Highcharts
   * properties <code>chartX</code> and <code>chartY</code> in order to work on the internal
   * coordinate system.
   *
   * @param e
   * Event object in standard browsers.
   *
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   */
  PointerEventObject normalize(MouseEvent e);

  /**
   * Reset the tracking by hiding the tooltip, the hover series state and the
   * hover point
   *
   * @param allowMove
   * Instead of destroying the tooltip altogether, allow moving it if
   * possible.
   *
   */
  void reset(boolean allowMove, double delay);

  /**
   * Reset the tracking by hiding the tooltip, the hover series state and the
   * hover point
   *
   * @param allowMove
   * Instead of destroying the tooltip altogether, allow moving it if
   * possible.
   *
   */
  void reset(boolean allowMove);

  /**
   * Reset the tracking by hiding the tooltip, the hover series state and the
   * hover point
   *
   */
  void reset();
}
