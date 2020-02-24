package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;

/**
 * The mouse and touch tracker object. Each Chart item has one assosiated
 * Pointer item that can be accessed from the Chart.pointer property.
 *
 */
public interface Pointer extends Any {
  /**
   * The mouse and touch tracker object. Each Chart item has one assosiated
   * Pointer item that can be accessed from the Chart.pointer property.
   *
   * @param chart
   * The Chart instance.
   *
   * @param options
   * The root options object. The pointer uses options from the chart
   * and tooltip structures.
   *
   * @implspec constructor(chart: Chart, options: Options);
   *
   */
  @JSBody(
      params = {"chart", "options"},
      script = "return new Pointer(chart, options)"
  )
  static Pointer create(Chart chart, Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Destroys the Pointer object and disconnects DOM events.
   *
   * @implspec destroy(): void;
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
   * @param coordinates
   * Chart coordinates of the pointer.
   *
   * @return The point closest to given coordinates.
   *
   * @implspec findNearestKDPoints(series: Array<Series>, shared: boolean, coordinates: PointerCoordinatesObject): (Point|undefined);
   *
   */
  Point findNearestKDPoints(Array<Series> series, boolean shared,
      PointerCoordinatesObject coordinates);

  /**
   * Get the click position in terms of axis values.
   *
   * @param e
   * Pointer event, extended with <code>chartX</code> and <code>chartY</code> properties.
   *
   * @implspec getCoordinates(e: PointerEventObject): PointerAxisCoordinatesObject;
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
   * @implspec inClass(element: (HTMLDOMElement|SVGDOMElement), className: string): boolean;
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
   * @implspec inClass(element: (HTMLDOMElement|SVGDOMElement), className: string): boolean;
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
   * @return A browser event with extended properties <code>chartX</code> and <code>chartY</code>.
   *
   * @implspec normalize(e: Event): PointerEventObject;
   *
   */
  PointerEventObject normalize(Event e);

  /**
   * Reset the tracking by hiding the tooltip, the hover series state and the
   * hover point
   *
   * @param allowMove
   * Instead of destroying the tooltip altogether, allow moving it if
   * possible.
   *
   * @implspec reset(allowMove: boolean, delay: number): void;
   *
   */
  void reset(boolean allowMove, double delay);
}
