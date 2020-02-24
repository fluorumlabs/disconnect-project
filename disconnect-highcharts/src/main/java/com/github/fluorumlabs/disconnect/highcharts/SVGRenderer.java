package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import js.lang.Symbol;
import js.lang.Unknown;
import js.util.StringRecord;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Allows direct access to the Highcharts rendering layer in order to draw
 * primitive shapes like circles, rectangles, paths or text directly on a chart,
 * or independent from any chart. The SVGRenderer represents a wrapper object
 * for SVG in modern browsers. Through the VMLRenderer, part of the <code>oldie.js</code>
 * module, it also brings vector graphics to IE &lt;= 8.
 *
 * An existing chart's renderer can be accessed through Chart.renderer. The
 * renderer can also be used completely decoupled from a chart.
 *
 */
public interface SVGRenderer extends Any {
  /**
   * Allows direct access to the Highcharts rendering layer in order to draw
   * primitive shapes like circles, rectangles, paths or text directly on a
   * chart, or independent from any chart. The SVGRenderer represents a
   * wrapper object for SVG in modern browsers. Through the VMLRenderer, part
   * of the <code>oldie.js</code> module, it also brings vector graphics to IE &lt;= 8.
   *
   * An existing chart's renderer can be accessed through Chart.renderer. The
   * renderer can also be used completely decoupled from a chart.
   *
   * @param container
   * Where to put the SVG in the web page.
   *
   * @param width
   * The width of the SVG.
   *
   * @param height
   * The height of the SVG.
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @implspec constructor(container: HTMLDOMElement, width: number, height: number, forExport?: boolean, allowHTML?: boolean);
   *
   */
  @JSBody(
      params = {"container", "width", "height", "forExport", "allowHTML"},
      script = "return new SVGRenderer(container, width, height, forExport, allowHTML)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height, boolean forExport,
      boolean allowHTML) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Allows direct access to the Highcharts rendering layer in order to draw
   * primitive shapes like circles, rectangles, paths or text directly on a
   * chart, or independent from any chart. The SVGRenderer represents a
   * wrapper object for SVG in modern browsers. Through the VMLRenderer, part
   * of the <code>oldie.js</code> module, it also brings vector graphics to IE &lt;= 8.
   *
   * An existing chart's renderer can be accessed through Chart.renderer. The
   * renderer can also be used completely decoupled from a chart.
   *
   * @param container
   * Where to put the SVG in the web page.
   *
   * @param width
   * The width of the SVG.
   *
   * @param height
   * The height of the SVG.
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @implspec constructor(container: HTMLDOMElement, width: number, height: number, forExport?: boolean, allowHTML?: boolean);
   *
   */
  @JSBody(
      params = {"container", "width", "height", "forExport"},
      script = "return new SVGRenderer(container, width, height, forExport)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height, boolean forExport) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Allows direct access to the Highcharts rendering layer in order to draw
   * primitive shapes like circles, rectangles, paths or text directly on a
   * chart, or independent from any chart. The SVGRenderer represents a
   * wrapper object for SVG in modern browsers. Through the VMLRenderer, part
   * of the <code>oldie.js</code> module, it also brings vector graphics to IE &lt;= 8.
   *
   * An existing chart's renderer can be accessed through Chart.renderer. The
   * renderer can also be used completely decoupled from a chart.
   *
   * @param container
   * Where to put the SVG in the web page.
   *
   * @param width
   * The width of the SVG.
   *
   * @param height
   * The height of the SVG.
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @implspec constructor(container: HTMLDOMElement, width: number, height: number, forExport?: boolean, allowHTML?: boolean);
   *
   */
  @JSBody(
      params = {"container", "width", "height"},
      script = "return new SVGRenderer(container, width, height)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The root <code>svg</code> node of the renderer.
   *
   * @implspec box: SVGDOMElement;
   *
   */
  @JSProperty("box")
  js.web.dom.svg.SVGElement getBox();

  /**
   * The root <code>svg</code> node of the renderer.
   *
   * @implspec box: SVGDOMElement;
   *
   */
  @JSProperty("box")
  void setBox(js.web.dom.svg.SVGElement value);

  /**
   * The wrapper for the root <code>svg</code> node of the renderer.
   *
   * @implspec boxWrapper: SVGElement;
   *
   */
  @JSProperty("boxWrapper")
  SVGElement getBoxWrapper();

  /**
   * The wrapper for the root <code>svg</code> node of the renderer.
   *
   * @implspec boxWrapper: SVGElement;
   *
   */
  @JSProperty("boxWrapper")
  void setBoxWrapper(SVGElement value);

  /**
   * A pointer to the <code>defs</code> node of the root SVG.
   *
   * @implspec defs: SVGElement;
   *
   */
  @JSProperty("defs")
  SVGElement getDefs();

  /**
   * A pointer to the <code>defs</code> node of the root SVG.
   *
   * @implspec defs: SVGElement;
   *
   */
  @JSProperty("defs")
  void setDefs(SVGElement value);

  /**
   * A pointer to the renderer's associated Element class. The VMLRenderer
   * will have a pointer to VMLElement here.
   *
   * @implspec Element: SVGElement;
   *
   */
  @JSProperty("Element")
  SVGElement getElement();

  /**
   * A pointer to the renderer's associated Element class. The VMLRenderer
   * will have a pointer to VMLElement here.
   *
   * @implspec Element: SVGElement;
   *
   */
  @JSProperty("Element")
  void setElement(SVGElement value);

  /**
   * A collection of characters mapped to HTML entities. When <code>useHTML</code> on an
   * element is true, these entities will be rendered correctly by HTML. In
   * the SVG pseudo-HTML, they need to be unescaped back to simple characters,
   * so for example <code>&amp;lt;</code> will render as <code>&lt;</code>.
   *
   * @implspec escapes: Dictionary<string>;
   *
   */
  @JSProperty("escapes")
  StringRecord getEscapes();

  /**
   * A collection of characters mapped to HTML entities. When <code>useHTML</code> on an
   * element is true, these entities will be rendered correctly by HTML. In
   * the SVG pseudo-HTML, they need to be unescaped back to simple characters,
   * so for example <code>&amp;lt;</code> will render as <code>&lt;</code>.
   *
   * @implspec escapes: Dictionary<string>;
   *
   */
  @JSProperty("escapes")
  void setEscapes(StringRecord value);

  /**
   * An extendable collection of functions for defining symbol paths.
   *
   * @implspec symbols: SymbolDictionary;
   *
   */
  @JSProperty("symbols")
  SymbolDictionary getSymbols();

  /**
   * An extendable collection of functions for defining symbol paths.
   *
   * @implspec symbols: SymbolDictionary;
   *
   */
  @JSProperty("symbols")
  void setSymbols(SymbolDictionary value);

  /**
   * Draw and return an arc. Overloaded function that takes arguments object.
   *
   * @param attribs
   * Initial SVG attributes.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(attribs: SVGAttributes): SVGElement;
   *
   */
  SVGElement arc(SVGAttributes attribs);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc();

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc(double x, double y, double r, double innerR, double start);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc(double x);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc(double x, double y, double r);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc(double x, double y);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc(double x, double y, double r, double innerR, double start, double end);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @param y
   * Center Y position.
   *
   * @param r
   * The outer radius of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @param end
   * The ending angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
   *
   * @implspec arc(x?: number, y?: number, r?: number, innerR?: number, start?: number, end?: number): SVGElement;
   *
   */
  SVGElement arc(double x, double y, double r, double innerR);

  /**
   * Create a button with preset states.
   *
   * @param text
   * The text or HTML to draw.
   *
   * @param x
   * The x position of the button's left side.
   *
   * @param y
   * The y position of the button's top side.
   *
   * @param callback
   * The function to execute on button click or touch.
   *
   * @param normalState
   * SVG attributes for the normal state.
   *
   * @param hoverState
   * SVG attributes for the hover state.
   *
   * @param pressedState
   * SVG attributes for the pressed state.
   *
   * @param disabledState
   * SVG attributes for the disabled state.
   *
   * @param shape
   * The shape type.
   *
   * @return The button element.
   *
   * @implspec button(text: string, x: number, y: number, callback: () =&gt; void, normalState?: SVGAttributes, hoverState?: SVGAttributes, pressedState?: SVGAttributes, disabledState?: SVGAttributes, shape?: SymbolKey): SVGElement;
   *
   */
  SVGElement button(String text, double x, double y, ButtonCallback callback,
      SVGAttributes normalState, SVGAttributes hoverState);

  /**
   * Create a button with preset states.
   *
   * @param text
   * The text or HTML to draw.
   *
   * @param x
   * The x position of the button's left side.
   *
   * @param y
   * The y position of the button's top side.
   *
   * @param callback
   * The function to execute on button click or touch.
   *
   * @param normalState
   * SVG attributes for the normal state.
   *
   * @param hoverState
   * SVG attributes for the hover state.
   *
   * @param pressedState
   * SVG attributes for the pressed state.
   *
   * @param disabledState
   * SVG attributes for the disabled state.
   *
   * @param shape
   * The shape type.
   *
   * @return The button element.
   *
   * @implspec button(text: string, x: number, y: number, callback: () =&gt; void, normalState?: SVGAttributes, hoverState?: SVGAttributes, pressedState?: SVGAttributes, disabledState?: SVGAttributes, shape?: SymbolKey): SVGElement;
   *
   */
  SVGElement button(String text, double x, double y, ButtonCallback callback,
      SVGAttributes normalState);

  /**
   * Create a button with preset states.
   *
   * @param text
   * The text or HTML to draw.
   *
   * @param x
   * The x position of the button's left side.
   *
   * @param y
   * The y position of the button's top side.
   *
   * @param callback
   * The function to execute on button click or touch.
   *
   * @param normalState
   * SVG attributes for the normal state.
   *
   * @param hoverState
   * SVG attributes for the hover state.
   *
   * @param pressedState
   * SVG attributes for the pressed state.
   *
   * @param disabledState
   * SVG attributes for the disabled state.
   *
   * @param shape
   * The shape type.
   *
   * @return The button element.
   *
   * @implspec button(text: string, x: number, y: number, callback: () =&gt; void, normalState?: SVGAttributes, hoverState?: SVGAttributes, pressedState?: SVGAttributes, disabledState?: SVGAttributes, shape?: SymbolKey): SVGElement;
   *
   */
  SVGElement button(String text, double x, double y, ButtonCallback callback,
      SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState,
      SVGAttributes disabledState);

  /**
   * Create a button with preset states.
   *
   * @param text
   * The text or HTML to draw.
   *
   * @param x
   * The x position of the button's left side.
   *
   * @param y
   * The y position of the button's top side.
   *
   * @param callback
   * The function to execute on button click or touch.
   *
   * @param normalState
   * SVG attributes for the normal state.
   *
   * @param hoverState
   * SVG attributes for the hover state.
   *
   * @param pressedState
   * SVG attributes for the pressed state.
   *
   * @param disabledState
   * SVG attributes for the disabled state.
   *
   * @param shape
   * The shape type.
   *
   * @return The button element.
   *
   * @implspec button(text: string, x: number, y: number, callback: () =&gt; void, normalState?: SVGAttributes, hoverState?: SVGAttributes, pressedState?: SVGAttributes, disabledState?: SVGAttributes, shape?: SymbolKey): SVGElement;
   *
   */
  SVGElement button(String text, double x, double y, ButtonCallback callback,
      SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState,
      SVGAttributes disabledState, SymbolKey shape);

  /**
   * Create a button with preset states.
   *
   * @param text
   * The text or HTML to draw.
   *
   * @param x
   * The x position of the button's left side.
   *
   * @param y
   * The y position of the button's top side.
   *
   * @param callback
   * The function to execute on button click or touch.
   *
   * @param normalState
   * SVG attributes for the normal state.
   *
   * @param hoverState
   * SVG attributes for the hover state.
   *
   * @param pressedState
   * SVG attributes for the pressed state.
   *
   * @param disabledState
   * SVG attributes for the disabled state.
   *
   * @param shape
   * The shape type.
   *
   * @return The button element.
   *
   * @implspec button(text: string, x: number, y: number, callback: () =&gt; void, normalState?: SVGAttributes, hoverState?: SVGAttributes, pressedState?: SVGAttributes, disabledState?: SVGAttributes, shape?: SymbolKey): SVGElement;
   *
   */
  SVGElement button(String text, double x, double y, ButtonCallback callback,
      SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState);

  /**
   * Create a button with preset states.
   *
   * @param text
   * The text or HTML to draw.
   *
   * @param x
   * The x position of the button's left side.
   *
   * @param y
   * The y position of the button's top side.
   *
   * @param callback
   * The function to execute on button click or touch.
   *
   * @param normalState
   * SVG attributes for the normal state.
   *
   * @param hoverState
   * SVG attributes for the hover state.
   *
   * @param pressedState
   * SVG attributes for the pressed state.
   *
   * @param disabledState
   * SVG attributes for the disabled state.
   *
   * @param shape
   * The shape type.
   *
   * @return The button element.
   *
   * @implspec button(text: string, x: number, y: number, callback: () =&gt; void, normalState?: SVGAttributes, hoverState?: SVGAttributes, pressedState?: SVGAttributes, disabledState?: SVGAttributes, shape?: SymbolKey): SVGElement;
   *
   */
  SVGElement button(String text, double x, double y, ButtonCallback callback);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param attribs
   * The initial attributes.
   *
   * @return The generated wrapper element.
   *
   * @implspec circle(attribs?: SVGAttributes): SVGElement;
   *
   */
  SVGElement circle();

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param attribs
   * The initial attributes.
   *
   * @return The generated wrapper element.
   *
   * @implspec circle(attribs?: SVGAttributes): SVGElement;
   *
   */
  SVGElement circle(SVGAttributes attribs);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param x
   * The center x position.
   *
   * @param y
   * The center y position.
   *
   * @param r
   * The radius.
   *
   * @return The generated wrapper element.
   *
   * @implspec circle(x?: number, y?: number, r?: number): SVGElement;
   *
   */
  SVGElement circle(double x, double y, double r);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param x
   * The center x position.
   *
   * @param y
   * The center y position.
   *
   * @param r
   * The radius.
   *
   * @return The generated wrapper element.
   *
   * @implspec circle(x?: number, y?: number, r?: number): SVGElement;
   *
   */
  SVGElement circle(double x, double y);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param x
   * The center x position.
   *
   * @param y
   * The center y position.
   *
   * @param r
   * The radius.
   *
   * @return The generated wrapper element.
   *
   * @implspec circle(x?: number, y?: number, r?: number): SVGElement;
   *
   */
  SVGElement circle(double x);

  /**
   * Define a clipping rectangle. The clipping rectangle is later applied to
   * SVGElement objects through the SVGElement#clip function.
   *
   * @return A clipping rectangle.
   *
   * @implspec clipRect(id: string, x: number, y: number, width: number, height: number): ClipRectElement;
   *
   */
  SVGElement clipRect(String id, double x, double y, double width, double height);

  /**
   * Create a wrapper for an SVG element. Serves as a factory for SVGElement,
   * but this function is itself mostly called from primitive factories like
   * SVGRenderer#path, SVGRenderer#rect or SVGRenderer#text.
   *
   * @param nodeName
   * The node name, for example <code>rect</code>, <code>g</code> etc.
   *
   * @return The generated SVGElement.
   *
   * @implspec createElement(nodeName: string): SVGElement;
   *
   */
  SVGElement createElement(String nodeName);

  /**
   * Make a straight line crisper by not spilling out to neighbour pixels.
   *
   * @param points
   * The original points on the format <code>['M', 0, 0, 'L', 100, 0]</code>.
   *
   * @param width
   * The width of the line.
   *
   * @return The original points array, but modified to render crisply.
   *
   * @implspec crispLine(points: SVGPathArray, width: number): SVGPathArray;
   *
   */
  Array<Unknown> crispLine(Array<Unknown> points, double width);

  /**
   * Destroys the renderer and its allocated members.
   *
   * @implspec destroy(): void;
   *
   */
  void destroy();

  /**
   * Dummy function for plugins, called every time the renderer is updated.
   * Prior to Highcharts 5, this was used for the canvg renderer.
   *
   * @implspec draw(): void;
   *
   */
  void draw();

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @param fontSize
   * The current font size to inspect. If not given, the font size will
   * be found from the DOM element.
   *
   * @param elem
   * The element to inspect for a current font size.
   *
   * @return The font metrics.
   *
   * @implspec fontMetrics(fontSize?: string, elem?: (SVGDOMElement|SVGElement)): FontMetricsObject;
   *
   */
  FontMetricsObject fontMetrics();

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @param fontSize
   * The current font size to inspect. If not given, the font size will
   * be found from the DOM element.
   *
   * @param elem
   * The element to inspect for a current font size.
   *
   * @return The font metrics.
   *
   * @implspec fontMetrics(fontSize?: string, elem?: (SVGDOMElement|SVGElement)): FontMetricsObject;
   *
   */
  FontMetricsObject fontMetrics(String fontSize);

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @param fontSize
   * The current font size to inspect. If not given, the font size will
   * be found from the DOM element.
   *
   * @param elem
   * The element to inspect for a current font size.
   *
   * @return The font metrics.
   *
   * @implspec fontMetrics(fontSize?: string, elem?: (SVGDOMElement|SVGElement)): FontMetricsObject;
   *
   */
  FontMetricsObject fontMetrics(String fontSize, SVGElement elem);

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @param fontSize
   * The current font size to inspect. If not given, the font size will
   * be found from the DOM element.
   *
   * @param elem
   * The element to inspect for a current font size.
   *
   * @return The font metrics.
   *
   * @implspec fontMetrics(fontSize?: string, elem?: (SVGDOMElement|SVGElement)): FontMetricsObject;
   *
   */
  FontMetricsObject fontMetrics(String fontSize, js.web.dom.svg.SVGElement elem);

  /**
   * Create and return an svg group element. Child Highcharts.SVGElement
   * objects are added to the group by using the group as the first parameter
   * in add().
   *
   * @param name
   * The group will be given a class name of <code>highcharts-{name}</code>. This
   * can be used for styling and scripting.
   *
   * @return The generated wrapper element.
   *
   * @implspec g(name?: string): SVGElement;
   *
   */
  SVGElement g();

  /**
   * Create and return an svg group element. Child Highcharts.SVGElement
   * objects are added to the group by using the group as the first parameter
   * in add().
   *
   * @param name
   * The group will be given a class name of <code>highcharts-{name}</code>. This
   * can be used for styling and scripting.
   *
   * @return The generated wrapper element.
   *
   * @implspec g(name?: string): SVGElement;
   *
   */
  SVGElement g(String name);

  /**
   * Returns white for dark colors and black for bright colors.
   *
   * @param rgba
   * The color to get the contrast for.
   *
   * @return The contrast color, either <code>#000000</code> or <code>#FFFFFF</code>.
   *
   * @implspec getContrast(rgba: ColorString): string;
   *
   */
  String getContrast(String rgba);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @param y
   * The Y position.
   *
   * @param width
   * The image width. If omitted, it defaults to the image file width.
   *
   * @param height
   * The image height. If omitted it defaults to the image file height.
   *
   * @param onload
   * Event handler for image load.
   *
   * @return The generated wrapper element.
   *
   * @implspec image(src: string, x?: number, y?: number, width?: number, height?: number, onload?: () =&gt; void): SVGElement;
   *
   */
  SVGElement image(String src, double x, double y, double width, double height);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @param y
   * The Y position.
   *
   * @param width
   * The image width. If omitted, it defaults to the image file width.
   *
   * @param height
   * The image height. If omitted it defaults to the image file height.
   *
   * @param onload
   * Event handler for image load.
   *
   * @return The generated wrapper element.
   *
   * @implspec image(src: string, x?: number, y?: number, width?: number, height?: number, onload?: () =&gt; void): SVGElement;
   *
   */
  SVGElement image(String src, double x, double y, double width);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @param y
   * The Y position.
   *
   * @param width
   * The image width. If omitted, it defaults to the image file width.
   *
   * @param height
   * The image height. If omitted it defaults to the image file height.
   *
   * @param onload
   * Event handler for image load.
   *
   * @return The generated wrapper element.
   *
   * @implspec image(src: string, x?: number, y?: number, width?: number, height?: number, onload?: () =&gt; void): SVGElement;
   *
   */
  SVGElement image(String src, double x);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @param y
   * The Y position.
   *
   * @param width
   * The image width. If omitted, it defaults to the image file width.
   *
   * @param height
   * The image height. If omitted it defaults to the image file height.
   *
   * @param onload
   * Event handler for image load.
   *
   * @return The generated wrapper element.
   *
   * @implspec image(src: string, x?: number, y?: number, width?: number, height?: number, onload?: () =&gt; void): SVGElement;
   *
   */
  SVGElement image(String src);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @param y
   * The Y position.
   *
   * @param width
   * The image width. If omitted, it defaults to the image file width.
   *
   * @param height
   * The image height. If omitted it defaults to the image file height.
   *
   * @param onload
   * Event handler for image load.
   *
   * @return The generated wrapper element.
   *
   * @implspec image(src: string, x?: number, y?: number, width?: number, height?: number, onload?: () =&gt; void): SVGElement;
   *
   */
  SVGElement image(String src, double x, double y, double width, double height, ImageOnload onload);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @param y
   * The Y position.
   *
   * @param width
   * The image width. If omitted, it defaults to the image file width.
   *
   * @param height
   * The image height. If omitted it defaults to the image file height.
   *
   * @param onload
   * Event handler for image load.
   *
   * @return The generated wrapper element.
   *
   * @implspec image(src: string, x?: number, y?: number, width?: number, height?: number, onload?: () =&gt; void): SVGElement;
   *
   */
  SVGElement image(String src, double x, double y);

  /**
   * Initialize the SVGRenderer. Overridable initiator function that takes the
   * same parameters as the constructor.
   *
   * @param container
   * Where to put the SVG in the web page.
   *
   * @param width
   * The width of the SVG.
   *
   * @param height
   * The height of the SVG.
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @implspec init(container: HTMLDOMElement, width: number, height: number, forExport?: boolean, allowHTML?: boolean): void;
   *
   */
  void init(HTMLElement container, double width, double height);

  /**
   * Initialize the SVGRenderer. Overridable initiator function that takes the
   * same parameters as the constructor.
   *
   * @param container
   * Where to put the SVG in the web page.
   *
   * @param width
   * The width of the SVG.
   *
   * @param height
   * The height of the SVG.
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @implspec init(container: HTMLDOMElement, width: number, height: number, forExport?: boolean, allowHTML?: boolean): void;
   *
   */
  void init(HTMLElement container, double width, double height, boolean forExport);

  /**
   * Initialize the SVGRenderer. Overridable initiator function that takes the
   * same parameters as the constructor.
   *
   * @param container
   * Where to put the SVG in the web page.
   *
   * @param width
   * The width of the SVG.
   *
   * @param height
   * The height of the SVG.
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @implspec init(container: HTMLDOMElement, width: number, height: number, forExport?: boolean, allowHTML?: boolean): void;
   *
   */
  void init(HTMLElement container, double width, double height, boolean forExport,
      boolean allowHTML);

  /**
   * Detect whether the renderer is hidden. This happens when one of the
   * parent elements has <code>display: none</code>. Used internally to detect when we
   * needto render preliminarily in another div to get the text bounding boxes
   * right.
   *
   * @return True if it is hidden.
   *
   * @implspec isHidden(): boolean;
   *
   */
  boolean isHidden();

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY,
      boolean useHTML, boolean baseline, String className);

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y, String shape);

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y, String shape, double anchorX);

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY,
      boolean useHTML);

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY);

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY,
      boolean useHTML, boolean baseline);

  /**
   * Draw a label, which is an extended text element with support for border
   * and background. Highcharts creates a <code>g</code> element with a text and a <code>path</code>
   * or <code>rect</code> inside, to make it behave somewhat like a HTML div. Border and
   * background are set through <code>stroke</code>, <code>stroke-width</code> and <code>fill</code> attributes
   * using the attr method. To update the text after render, run <code>label.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The initial text string or (subset) HTML to render.
   *
   * @param x
   * The x position of the label's left side.
   *
   * @param y
   * The y position of the label's top side or baseline, depending on
   * the <code>baseline</code> parameter.
   *
   * @param shape
   * The shape of the label's border/background, if any. Defaults to
   * <code>rect</code>. Other possible values are <code>callout</code> or other shapes
   * defined in Highcharts.SVGRenderer#symbols.
   *
   * @param anchorX
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param anchorY
   * In case the <code>shape</code> has a pointer, like a flag, this is the
   * coordinates it should be pinned to.
   *
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @param baseline
   * Whether to position the label relative to the text baseline, like
   * renderer.text, or to the upper border of the rectangle.
   *
   * @param className
   * Class name for the group.
   *
   * @return The generated label.
   *
   * @implspec label(str: string, x: number, y: number, shape?: string, anchorX?: number, anchorY?: number, useHTML?: boolean, baseline?: boolean, className?: string): SVGElement;
   *
   */
  SVGElement label(String str, double x, double y);

  /**
   * Draw a path, wraps the SVG <code>path</code> element.
   *
   * @param path
   * An SVG path definition in array form.
   *
   * @return The generated wrapper element.
   *
   * @implspec path(path?: SVGPathArray): SVGElement;
   *
   */
  SVGElement path();

  /**
   * Draw a path, wraps the SVG <code>path</code> element.
   *
   * @param path
   * An SVG path definition in array form.
   *
   * @return The generated wrapper element.
   *
   * @implspec path(path?: SVGPathArray): SVGElement;
   *
   */
  SVGElement path(Array<Unknown> path);

  /**
   * Draw a path, wraps the SVG <code>path</code> element.
   *
   * @param attribs
   * The initial attributes.
   *
   * @return The generated wrapper element.
   *
   * @implspec path(attribs?: SVGAttributes): SVGElement;
   *
   */
  SVGElement path(SVGAttributes attribs);

  /**
   * Draw and return a rectangle.
   *
   * @param attributes
   * General SVG attributes for the rectangle.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(attributes?: SVGAttributes): SVGElement;
   *
   */
  SVGElement rect();

  /**
   * Draw and return a rectangle.
   *
   * @param attributes
   * General SVG attributes for the rectangle.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(attributes?: SVGAttributes): SVGElement;
   *
   */
  SVGElement rect(SVGAttributes attributes);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @param y
   * Top position.
   *
   * @param width
   * Width of the rectangle.
   *
   * @param height
   * Height of the rectangle.
   *
   * @param r
   * Border corner radius.
   *
   * @param strokeWidth
   * A stroke width can be supplied to allow crisp drawing.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(x?: number, y?: number, width?: number, height?: number, r?: number, strokeWidth?: number): SVGElement;
   *
   */
  SVGElement rect(double x, double y, double width);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @param y
   * Top position.
   *
   * @param width
   * Width of the rectangle.
   *
   * @param height
   * Height of the rectangle.
   *
   * @param r
   * Border corner radius.
   *
   * @param strokeWidth
   * A stroke width can be supplied to allow crisp drawing.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(x?: number, y?: number, width?: number, height?: number, r?: number, strokeWidth?: number): SVGElement;
   *
   */
  SVGElement rect(double x, double y);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @param y
   * Top position.
   *
   * @param width
   * Width of the rectangle.
   *
   * @param height
   * Height of the rectangle.
   *
   * @param r
   * Border corner radius.
   *
   * @param strokeWidth
   * A stroke width can be supplied to allow crisp drawing.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(x?: number, y?: number, width?: number, height?: number, r?: number, strokeWidth?: number): SVGElement;
   *
   */
  SVGElement rect(double x, double y, double width, double height, double r, double strokeWidth);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @param y
   * Top position.
   *
   * @param width
   * Width of the rectangle.
   *
   * @param height
   * Height of the rectangle.
   *
   * @param r
   * Border corner radius.
   *
   * @param strokeWidth
   * A stroke width can be supplied to allow crisp drawing.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(x?: number, y?: number, width?: number, height?: number, r?: number, strokeWidth?: number): SVGElement;
   *
   */
  SVGElement rect(double x, double y, double width, double height, double r);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @param y
   * Top position.
   *
   * @param width
   * Width of the rectangle.
   *
   * @param height
   * Height of the rectangle.
   *
   * @param r
   * Border corner radius.
   *
   * @param strokeWidth
   * A stroke width can be supplied to allow crisp drawing.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(x?: number, y?: number, width?: number, height?: number, r?: number, strokeWidth?: number): SVGElement;
   *
   */
  SVGElement rect(double x);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @param y
   * Top position.
   *
   * @param width
   * Width of the rectangle.
   *
   * @param height
   * Height of the rectangle.
   *
   * @param r
   * Border corner radius.
   *
   * @param strokeWidth
   * A stroke width can be supplied to allow crisp drawing.
   *
   * @return The generated wrapper element.
   *
   * @implspec rect(x?: number, y?: number, width?: number, height?: number, r?: number, strokeWidth?: number): SVGElement;
   *
   */
  SVGElement rect(double x, double y, double width, double height);

  /**
   * Resize the SVGRenderer#box and re-align all aligned child elements.
   *
   * @param width
   * The new pixel width.
   *
   * @param height
   * The new pixel height.
   *
   * @param animate
   * Whether and how to animate.
   *
   * @implspec setSize(width: number, height: number, animate?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void setSize(double width, double height);

  /**
   * Resize the SVGRenderer#box and re-align all aligned child elements.
   *
   * @param width
   * The new pixel width.
   *
   * @param height
   * The new pixel height.
   *
   * @param animate
   * Whether and how to animate.
   *
   * @implspec setSize(width: number, height: number, animate?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void setSize(double width, double height, boolean animate);

  /**
   * Resize the SVGRenderer#box and re-align all aligned child elements.
   *
   * @param width
   * The new pixel width.
   *
   * @param height
   * The new pixel height.
   *
   * @param animate
   * Whether and how to animate.
   *
   * @implspec setSize(width: number, height: number, animate?: (boolean|AnimationOptionsObject)): void;
   *
   */
  void setSize(double width, double height, AnimationOptionsObject animate);

  /**
   * Apply the global style on the renderer, mixed with the default styles.
   *
   * @param style
   * CSS to apply.
   *
   * @implspec setStyle(style: CSSObject): void;
   *
   */
  void setStyle(CSSObject style);

  /**
   * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It
   * is used in Highcharts for point makers, which cake a <code>symbol</code> option, and
   * label and button backgrounds like in the tooltip and stock flags.
   *
   * @param symbol
   * The symbol name.
   *
   * @param x
   * The X coordinate for the top left position.
   *
   * @param y
   * The Y coordinate for the top left position.
   *
   * @param width
   * The pixel width.
   *
   * @param height
   * The pixel height.
   *
   * @param options
   * Additional options, depending on the actual symbol drawn.
   *
   * @implspec symbol(symbol: symbol, x: number, y: number, width: number, height: number, options?: SymbolOptionsObject): SVGElement;
   *
   */
  SVGElement symbol(Symbol symbol, double x, double y, double width, double height);

  /**
   * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It
   * is used in Highcharts for point makers, which cake a <code>symbol</code> option, and
   * label and button backgrounds like in the tooltip and stock flags.
   *
   * @param symbol
   * The symbol name.
   *
   * @param x
   * The X coordinate for the top left position.
   *
   * @param y
   * The Y coordinate for the top left position.
   *
   * @param width
   * The pixel width.
   *
   * @param height
   * The pixel height.
   *
   * @param options
   * Additional options, depending on the actual symbol drawn.
   *
   * @implspec symbol(symbol: symbol, x: number, y: number, width: number, height: number, options?: SymbolOptionsObject): SVGElement;
   *
   */
  SVGElement symbol(Symbol symbol, double x, double y, double width, double height,
      SymbolOptionsObject options);

  /**
   * Draw text. The text can contain a subset of HTML, like spans and anchors
   * and some basic text styling of these. For more advanced features like
   * border and background, use Highcharts.SVGRenderer#label instead. To
   * update the text after render, run <code>text.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The text of (subset) HTML to draw.
   *
   * @param x
   * The x position of the text's lower left corner.
   *
   * @param y
   * The y position of the text's lower left corner.
   *
   * @param useHTML
   * Use HTML to render the text.
   *
   * @return The text object.
   *
   * @implspec text(str: string, x: number, y: number, useHTML?: boolean): SVGElement;
   *
   */
  SVGElement text(String str, double x, double y, boolean useHTML);

  /**
   * Draw text. The text can contain a subset of HTML, like spans and anchors
   * and some basic text styling of these. For more advanced features like
   * border and background, use Highcharts.SVGRenderer#label instead. To
   * update the text after render, run <code>text.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The text of (subset) HTML to draw.
   *
   * @param x
   * The x position of the text's lower left corner.
   *
   * @param y
   * The y position of the text's lower left corner.
   *
   * @param useHTML
   * Use HTML to render the text.
   *
   * @return The text object.
   *
   * @implspec text(str: string, x: number, y: number, useHTML?: boolean): SVGElement;
   *
   */
  SVGElement text(String str, double x, double y);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface ButtonCallback extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface ImageOnload extends Any {
    void apply();
  }
}
