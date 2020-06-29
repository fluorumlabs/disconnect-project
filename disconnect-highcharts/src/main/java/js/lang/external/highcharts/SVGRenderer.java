package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

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
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"SVGRenderer as SVGRenderer_SVGRenderer"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
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
   * @param style
   * The box style, if not in styleMode
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @param styledMode
   * Whether the renderer belongs to a chart that is in styled mode. If
   * it does, it will avoid setting presentational attributes in some
   * cases, but not when set explicitly through <code>.attr</code> and <code>.css</code> etc.
   *
   */
  @JSBody(
      params = {"container", "width", "height", "style", "forExport", "allowHTML", "styledMode"},
      script = "return new SVGRenderer_SVGRenderer(container, width, height, style, forExport, allowHTML, styledMode)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height,
      @Nullable CSSObject style, boolean forExport, boolean allowHTML, boolean styledMode) {
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
   * @param style
   * The box style, if not in styleMode
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   */
  @JSBody(
      params = {"container", "width", "height", "style", "forExport", "allowHTML"},
      script = "return new SVGRenderer_SVGRenderer(container, width, height, style, forExport, allowHTML)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height,
      @Nullable CSSObject style, boolean forExport, boolean allowHTML) {
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
   * @param style
   * The box style, if not in styleMode
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   */
  @JSBody(
      params = {"container", "width", "height", "style", "forExport"},
      script = "return new SVGRenderer_SVGRenderer(container, width, height, style, forExport)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height,
      @Nullable CSSObject style, boolean forExport) {
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
   * @param style
   * The box style, if not in styleMode
   *
   */
  @JSBody(
      params = {"container", "width", "height", "style"},
      script = "return new SVGRenderer_SVGRenderer(container, width, height, style)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height,
      @Nullable CSSObject style) {
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
   */
  @JSBody(
      params = {"container", "width", "height"},
      script = "return new SVGRenderer_SVGRenderer(container, width, height)"
  )
  static SVGRenderer create(HTMLElement container, double width, double height) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The root <code>svg</code> node of the renderer.
   *
   */
  @JSProperty("box")
  js.web.dom.svg.SVGElement getBox();

  /**
   * The root <code>svg</code> node of the renderer.
   *
   */
  @JSProperty("box")
  void setBox(js.web.dom.svg.SVGElement value);

  /**
   * The wrapper for the root <code>svg</code> node of the renderer.
   *
   */
  @JSProperty("boxWrapper")
  SVGElement getBoxWrapper();

  /**
   * The wrapper for the root <code>svg</code> node of the renderer.
   *
   */
  @JSProperty("boxWrapper")
  void setBoxWrapper(SVGElement value);

  /**
   * A pointer to the <code>defs</code> node of the root SVG.
   *
   */
  @JSProperty("defs")
  SVGElement getDefs();

  /**
   * A pointer to the <code>defs</code> node of the root SVG.
   *
   */
  @JSProperty("defs")
  void setDefs(SVGElement value);

  /**
   * A pointer to the renderer's associated Element class. The VMLRenderer
   * will have a pointer to VMLElement here.
   *
   */
  @JSProperty("Element")
  SVGElement getElement();

  /**
   * A pointer to the renderer's associated Element class. The VMLRenderer
   * will have a pointer to VMLElement here.
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
   */
  @JSProperty("escapes")
  Dictionary<Unknown /* string */> getEscapes();

  /**
   * A collection of characters mapped to HTML entities. When <code>useHTML</code> on an
   * element is true, these entities will be rendered correctly by HTML. In
   * the SVG pseudo-HTML, they need to be unescaped back to simple characters,
   * so for example <code>&amp;lt;</code> will render as <code>&lt;</code>.
   *
   */
  @JSProperty("escapes")
  void setEscapes(Dictionary<Unknown /* string */> value);

  /**
   * An extendable collection of functions for defining symbol paths.
   *
   */
  @JSProperty("symbols")
  SymbolDictionary getSymbols();

  /**
   * An extendable collection of functions for defining symbol paths.
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
   * The outer radius' of the arc.
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
   * The outer radius' of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @param start
   * The starting angle of the arc in radians, where 0 is to the right
   * and <code>-Math.PI/2</code> is up.
   *
   * @return The generated wrapper element.
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
   * The outer radius' of the arc.
   *
   * @param innerR
   * Inner radius like used in donut charts.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement arc(double x, double y, double r, double innerR);

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
   * The outer radius' of the arc.
   *
   * @return The generated wrapper element.
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
   * @return The generated wrapper element.
   *
   */
  SVGElement arc(double x, double y);

  /**
   * Draw and return an arc.
   *
   * @param x
   * Center X position.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement arc(double x);

  /**
   * Draw and return an arc.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement arc();

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
   * @param useHTML
   * Wether to use HTML to render the label.
   *
   * @return The button element.
   *
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback,
      @Nullable SVGAttributes normalState, @Nullable SVGAttributes hoverState,
      @Nullable SVGAttributes pressedState, @Nullable SVGAttributes disabledState,
      @Nullable ButtonShape shape, boolean useHTML);

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
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback,
      @Nullable SVGAttributes normalState, @Nullable SVGAttributes hoverState,
      @Nullable SVGAttributes pressedState, @Nullable SVGAttributes disabledState,
      @Nullable ButtonShape shape);

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
   * @return The button element.
   *
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback,
      @Nullable SVGAttributes normalState, @Nullable SVGAttributes hoverState,
      @Nullable SVGAttributes pressedState, @Nullable SVGAttributes disabledState);

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
   * @return The button element.
   *
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback,
      @Nullable SVGAttributes normalState, @Nullable SVGAttributes hoverState,
      @Nullable SVGAttributes pressedState);

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
   * @return The button element.
   *
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback,
      @Nullable SVGAttributes normalState, @Nullable SVGAttributes hoverState);

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
   * @return The button element.
   *
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback,
      @Nullable SVGAttributes normalState);

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
   * @return The button element.
   *
   */
  SVGElement button(String text, double x, double y, EventCallbackFunction<SVGElement> callback);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param attribs
   * The initial attributes.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement circle(@Nullable SVGAttributes attribs);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement circle();

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
   * @return The generated wrapper element.
   *
   */
  SVGElement circle(double x, double y);

  /**
   * Draw a circle, wraps the SVG <code>circle</code> element.
   *
   * @param x
   * The center x position.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement circle(double x);

  /**
   * Define a clipping rectangle. The clipping rectangle is later applied to
   * SVGElement objects through the SVGElement#clip function.
   *
   * @return A clipping rectangle.
   *
   */
  SVGElement clipRect(double x, double y, double width, double height);

  /**
   * Define a clipping rectangle. The clipping rectangle is later applied to
   * SVGElement objects through the SVGElement#clip function.
   *
   * @return A clipping rectangle.
   *
   */
  SVGElement clipRect(double x, double y, double width);

  /**
   * Define a clipping rectangle. The clipping rectangle is later applied to
   * SVGElement objects through the SVGElement#clip function.
   *
   * @return A clipping rectangle.
   *
   */
  SVGElement clipRect(double x, double y);

  /**
   * Define a clipping rectangle. The clipping rectangle is later applied to
   * SVGElement objects through the SVGElement#clip function.
   *
   * @return A clipping rectangle.
   *
   */
  SVGElement clipRect(double x);

  /**
   * Define a clipping rectangle. The clipping rectangle is later applied to
   * SVGElement objects through the SVGElement#clip function.
   *
   * @return A clipping rectangle.
   *
   */
  SVGElement clipRect();

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
   */
  SVGElement createElement(String nodeName);

  /**
   * Make a straight line crisper by not spilling out to neighbour pixels.
   *
   * @param points
   * The original points on the format <code>[['M', 0, 0], ['L', 100, 0]]</code>.
   *
   * @param width
   * The width of the line.
   *
   * @param roundingFunction
   * The rounding function name on the <code>Math</code> object, can be one of
   * <code>round</code>, <code>floor</code> or <code>ceil</code>.
   *
   * @return The original points array, but modified to render crisply.
   *
   */
  CrispLineResult8[] crispLine(CrispLinePoints8[] points, double width, String roundingFunction);

  /**
   * General method for adding a definition to the SVG <code>defs</code> tag. Can be used
   * for gradients, fills, filters etc. Styled mode only. A hook for adding
   * general definitions to the SVG's defs tag. Definitions can be referenced
   * from the CSS by its <code>id</code>. Read more in gradients, shadows and patterns.
   * Styled mode only.
   *
   * @param def
   * A serialized form of an SVG definition, including children.
   *
   * @return The inserted node.
   *
   */
  SVGElement definition(SVGDefinitionObject def);

  /**
   * Destroys the renderer and its allocated members.
   *
   */
  @Nullable
  Unknown /* null */ destroy();

  /**
   * Dummy function for plugins, called every time the renderer is updated.
   * Prior to Highcharts 5, this was used for the canvg renderer.
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
   */
  FontMetricsObject fontMetrics(@Nullable String fontSize, @Nullable SVGElement elem);

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
   */
  FontMetricsObject fontMetrics(@Nullable String fontSize, @Nullable js.web.dom.svg.SVGElement elem);

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
   */
  FontMetricsObject fontMetrics(double fontSize, @Nullable SVGElement elem);

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
   */
  FontMetricsObject fontMetrics(double fontSize, @Nullable js.web.dom.svg.SVGElement elem);

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @param fontSize
   * The current font size to inspect. If not given, the font size will
   * be found from the DOM element.
   *
   * @return The font metrics.
   *
   */
  FontMetricsObject fontMetrics(@Nullable String fontSize);

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @param fontSize
   * The current font size to inspect. If not given, the font size will
   * be found from the DOM element.
   *
   * @return The font metrics.
   *
   */
  FontMetricsObject fontMetrics(double fontSize);

  /**
   * Utility to return the baseline offset and total line height from the font
   * size.
   *
   * @return The font metrics.
   *
   */
  FontMetricsObject fontMetrics();

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
   */
  SVGElement g(@Nullable String name);

  /**
   * Create and return an svg group element. Child Highcharts.SVGElement
   * objects are added to the group by using the group as the first parameter
   * in add().
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement g();

  /**
   * Returns white for dark colors and black for bright colors.
   *
   * @param rgba
   * The color to get the contrast for.
   *
   * @return The contrast color, either <code>#000000</code> or <code>#FFFFFF</code>.
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
   */
  SVGElement image(String src, double x, double y, double width, double height,
      @Nullable JsFunction onload);

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
   * @return The generated wrapper element.
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
   * @return The generated wrapper element.
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
   * @return The generated wrapper element.
   *
   */
  SVGElement image(String src, double x, double y);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @param x
   * The X position.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement image(String src, double x);

  /**
   * Display an image.
   *
   * @param src
   * The image source.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement image(String src);

  /**
   * Initialize the SVGRenderer. Overridable initializer function that takes
   * the same parameters as the constructor.
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
   * @param style
   * The box style, if not in styleMode
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   * @param styledMode
   * Whether the renderer belongs to a chart that is in styled mode. If
   * it does, it will avoid setting presentational attributes in some
   * cases, but not when set explicitly through <code>.attr</code> and <code>.css</code> etc.
   *
   */
  void init(HTMLElement container, double width, double height, @Nullable CSSObject style,
      boolean forExport, boolean allowHTML, boolean styledMode);

  /**
   * Initialize the SVGRenderer. Overridable initializer function that takes
   * the same parameters as the constructor.
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
   * @param style
   * The box style, if not in styleMode
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   * @param allowHTML
   * Whether the renderer is allowed to include HTML text, which will
   * be projected on top of the SVG.
   *
   */
  void init(HTMLElement container, double width, double height, @Nullable CSSObject style,
      boolean forExport, boolean allowHTML);

  /**
   * Initialize the SVGRenderer. Overridable initializer function that takes
   * the same parameters as the constructor.
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
   * @param style
   * The box style, if not in styleMode
   *
   * @param forExport
   * Whether the rendered content is intended for export.
   *
   */
  void init(HTMLElement container, double width, double height, @Nullable CSSObject style,
      boolean forExport);

  /**
   * Initialize the SVGRenderer. Overridable initializer function that takes
   * the same parameters as the constructor.
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
   * @param style
   * The box style, if not in styleMode
   *
   */
  void init(HTMLElement container, double width, double height, @Nullable CSSObject style);

  /**
   * Initialize the SVGRenderer. Overridable initializer function that takes
   * the same parameters as the constructor.
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
   */
  void init(HTMLElement container, double width, double height);

  /**
   * Detect whether the renderer is hidden. This happens when one of the
   * parent elements has <code>display: none</code>. Used internally to detect when we
   * needto render preliminarily in another div to get the text bounding boxes
   * right.
   *
   * @return True if it is hidden.
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
   */
  SVGElement label(String str, double x, double y, @Nullable String shape, double anchorX,
      double anchorY, boolean useHTML, boolean baseline, @Nullable String className);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x, double y, @Nullable String shape, double anchorX,
      double anchorY, boolean useHTML, boolean baseline);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x, double y, @Nullable String shape, double anchorX,
      double anchorY, boolean useHTML);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x, double y, @Nullable String shape, double anchorX,
      double anchorY);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x, double y, @Nullable String shape, double anchorX);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x, double y, @Nullable String shape);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x, double y);

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
   * @return The generated label.
   *
   */
  SVGElement label(String str, double x);

  /**
   * Draw a path, wraps the SVG <code>path</code> element.
   *
   * @param path
   * An SVG path definition in array form.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement path(PathPath8[] path);

  /**
   * Draw a path, wraps the SVG <code>path</code> element.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement path();

  /**
   * Draw a path, wraps the SVG <code>path</code> element.
   *
   * @param attribs
   * The initial attributes.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement path(@Nullable SVGAttributes attribs);

  /**
   * Draw and return a rectangle.
   *
   * @param attributes
   * General SVG attributes for the rectangle.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement rect(@Nullable SVGAttributes attributes);

  /**
   * Draw and return a rectangle.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement rect();

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
   * @return The generated wrapper element.
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
   * @return The generated wrapper element.
   *
   */
  SVGElement rect(double x, double y, double width, double height);

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
   * @return The generated wrapper element.
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
   * @return The generated wrapper element.
   *
   */
  SVGElement rect(double x, double y);

  /**
   * Draw and return a rectangle.
   *
   * @param x
   * Left position.
   *
   * @return The generated wrapper element.
   *
   */
  SVGElement rect(double x);

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
   */
  void setSize(double width, double height, @Nullable AnimationOptionsObject animate);

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
   */
  void setSize(double width, double height);

  /**
   * Apply the global style on the renderer, mixed with the default styles.
   *
   * @param style
   * CSS to apply.
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
   */
  SVGElement symbol(String symbol, double x, double y, double width, double height,
      @Nullable SymbolOptionsObject options);

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
   */
  SVGElement symbol(String symbol, double x, double y, double width, double height);

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
   */
  SVGElement symbol(String symbol, double x, double y, double width);

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
   */
  SVGElement symbol(String symbol, double x, double y);

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
   */
  SVGElement symbol(String symbol, double x);

  /**
   * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It
   * is used in Highcharts for point makers, which cake a <code>symbol</code> option, and
   * label and button backgrounds like in the tooltip and stock flags.
   *
   * @param symbol
   * The symbol name.
   *
   */
  SVGElement symbol(String symbol);

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
   */
  SVGElement text(@Nullable String str, double x, double y, boolean useHTML);

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
   * @return The text object.
   *
   */
  SVGElement text(@Nullable String str, double x, double y);

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
   * @return The text object.
   *
   */
  SVGElement text(@Nullable String str, double x);

  /**
   * Draw text. The text can contain a subset of HTML, like spans and anchors
   * and some basic text styling of these. For more advanced features like
   * border and background, use Highcharts.SVGRenderer#label instead. To
   * update the text after render, run <code>text.attr({ text: 'New text' })</code>.
   *
   * @param str
   * The text of (subset) HTML to draw.
   *
   * @return The text object.
   *
   */
  SVGElement text(@Nullable String str);

  /**
   * Draw text. The text can contain a subset of HTML, like spans and anchors
   * and some basic text styling of these. For more advanced features like
   * border and background, use Highcharts.SVGRenderer#label instead. To
   * update the text after render, run <code>text.attr({ text: 'New text' })</code>.
   *
   * @return The text object.
   *
   */
  SVGElement text();

  abstract class ButtonShape extends JsEnum {
    public static final ButtonShape TRIANGLE_DOWN = JsEnum.of("triangle-down");

    public static final ButtonShape TRIANGLE = JsEnum.of("triangle");

    public static final ButtonShape SQUARE = JsEnum.of("square");

    public static final ButtonShape DIAMOND = JsEnum.of("diamond");

    public static final ButtonShape CIRCLE = JsEnum.of("circle");

    public static final ButtonShape CALLOUT = JsEnum.of("callout");

    public static final ButtonShape ARC = JsEnum.of("arc");
  }

  interface CrispLineResult8 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    Value0 getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(Value0 value);

    @JSBody(
        script = "return this[1]"
    )
    double getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(double value);

    @JSBody(
        script = "return this[2]"
    )
    double getValue2();

    @JSBody(
        params = "value",
        script = "this[2] = value"
    )
    void setValue2(double value);

    @JSBody(
        script = "return this[3]"
    )
    double getValue3();

    @JSBody(
        params = "value",
        script = "this[3] = value"
    )
    void setValue3(double value);

    @JSBody(
        script = "return this[4]"
    )
    double getValue4();

    @JSBody(
        params = "value",
        script = "this[4] = value"
    )
    void setValue4(double value);

    @JSBody(
        script = "return this[5]"
    )
    double getValue5();

    @JSBody(
        params = "value",
        script = "this[5] = value"
    )
    void setValue5(double value);

    @JSBody(
        script = "return this[6]"
    )
    double getValue6();

    @JSBody(
        params = "value",
        script = "this[6] = value"
    )
    void setValue6(double value);

    @JSBody(
        script = "return this[7]"
    )
    double getValue7();

    @JSBody(
        params = "value",
        script = "this[7] = value"
    )
    void setValue7(double value);

    static CrispLineResult8.Builder builder() {
      return new CrispLineResult8.Builder();
    }

    abstract class Value0 extends JsEnum {
      public static final Value0 A = JsEnum.of("a");

      public static final Value0 C = JsEnum.of("c");

      public static final Value0 H = JsEnum.of("h");

      public static final Value0 L = JsEnum.of("l");

      public static final Value0 M = JsEnum.of("m");

      public static final Value0 Q = JsEnum.of("q");

      public static final Value0 S = JsEnum.of("s");

      public static final Value0 T = JsEnum.of("t");

      public static final Value0 V = JsEnum.of("v");

      public static final Value0 Z = JsEnum.of("z");

      public static final Value0 CAPITAL_A = JsEnum.of("A");

      public static final Value0 CAPITAL_C = JsEnum.of("C");

      public static final Value0 CAPITAL_H = JsEnum.of("H");

      public static final Value0 CAPITAL_L = JsEnum.of("L");

      public static final Value0 CAPITAL_M = JsEnum.of("M");

      public static final Value0 CAPITAL_Q = JsEnum.of("Q");

      public static final Value0 CAPITAL_S = JsEnum.of("S");

      public static final Value0 CAPITAL_T = JsEnum.of("T");

      public static final Value0 CAPITAL_V = JsEnum.of("V");

      public static final Value0 CAPITAL_Z = JsEnum.of("Z");
    }

    final class Builder {
      private final CrispLineResult8 object = Any.empty();

      private Builder() {
      }

      public CrispLineResult8 build() {
        return object;
      }

      public CrispLineResult8.Builder value0(Value0 value) {
        object.setValue0(value);
        return this;
      }

      public CrispLineResult8.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }

      public CrispLineResult8.Builder value2(double value) {
        object.setValue2(value);
        return this;
      }

      public CrispLineResult8.Builder value3(double value) {
        object.setValue3(value);
        return this;
      }

      public CrispLineResult8.Builder value4(double value) {
        object.setValue4(value);
        return this;
      }

      public CrispLineResult8.Builder value5(double value) {
        object.setValue5(value);
        return this;
      }

      public CrispLineResult8.Builder value6(double value) {
        object.setValue6(value);
        return this;
      }

      public CrispLineResult8.Builder value7(double value) {
        object.setValue7(value);
        return this;
      }
    }
  }

  interface CrispLinePoints8 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    Value0 getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(Value0 value);

    @JSBody(
        script = "return this[1]"
    )
    double getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(double value);

    @JSBody(
        script = "return this[2]"
    )
    double getValue2();

    @JSBody(
        params = "value",
        script = "this[2] = value"
    )
    void setValue2(double value);

    @JSBody(
        script = "return this[3]"
    )
    double getValue3();

    @JSBody(
        params = "value",
        script = "this[3] = value"
    )
    void setValue3(double value);

    @JSBody(
        script = "return this[4]"
    )
    double getValue4();

    @JSBody(
        params = "value",
        script = "this[4] = value"
    )
    void setValue4(double value);

    @JSBody(
        script = "return this[5]"
    )
    double getValue5();

    @JSBody(
        params = "value",
        script = "this[5] = value"
    )
    void setValue5(double value);

    @JSBody(
        script = "return this[6]"
    )
    double getValue6();

    @JSBody(
        params = "value",
        script = "this[6] = value"
    )
    void setValue6(double value);

    @JSBody(
        script = "return this[7]"
    )
    double getValue7();

    @JSBody(
        params = "value",
        script = "this[7] = value"
    )
    void setValue7(double value);

    static CrispLinePoints8.Builder builder() {
      return new CrispLinePoints8.Builder();
    }

    abstract class Value0 extends JsEnum {
      public static final Value0 A = JsEnum.of("a");

      public static final Value0 C = JsEnum.of("c");

      public static final Value0 H = JsEnum.of("h");

      public static final Value0 L = JsEnum.of("l");

      public static final Value0 M = JsEnum.of("m");

      public static final Value0 Q = JsEnum.of("q");

      public static final Value0 S = JsEnum.of("s");

      public static final Value0 T = JsEnum.of("t");

      public static final Value0 V = JsEnum.of("v");

      public static final Value0 Z = JsEnum.of("z");

      public static final Value0 CAPITAL_A = JsEnum.of("A");

      public static final Value0 CAPITAL_C = JsEnum.of("C");

      public static final Value0 CAPITAL_H = JsEnum.of("H");

      public static final Value0 CAPITAL_L = JsEnum.of("L");

      public static final Value0 CAPITAL_M = JsEnum.of("M");

      public static final Value0 CAPITAL_Q = JsEnum.of("Q");

      public static final Value0 CAPITAL_S = JsEnum.of("S");

      public static final Value0 CAPITAL_T = JsEnum.of("T");

      public static final Value0 CAPITAL_V = JsEnum.of("V");

      public static final Value0 CAPITAL_Z = JsEnum.of("Z");
    }

    final class Builder {
      private final CrispLinePoints8 object = Any.empty();

      private Builder() {
      }

      public CrispLinePoints8 build() {
        return object;
      }

      public CrispLinePoints8.Builder value0(Value0 value) {
        object.setValue0(value);
        return this;
      }

      public CrispLinePoints8.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }

      public CrispLinePoints8.Builder value2(double value) {
        object.setValue2(value);
        return this;
      }

      public CrispLinePoints8.Builder value3(double value) {
        object.setValue3(value);
        return this;
      }

      public CrispLinePoints8.Builder value4(double value) {
        object.setValue4(value);
        return this;
      }

      public CrispLinePoints8.Builder value5(double value) {
        object.setValue5(value);
        return this;
      }

      public CrispLinePoints8.Builder value6(double value) {
        object.setValue6(value);
        return this;
      }

      public CrispLinePoints8.Builder value7(double value) {
        object.setValue7(value);
        return this;
      }
    }
  }

  interface PathPath8 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    Value0 getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(Value0 value);

    @JSBody(
        script = "return this[1]"
    )
    double getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(double value);

    @JSBody(
        script = "return this[2]"
    )
    double getValue2();

    @JSBody(
        params = "value",
        script = "this[2] = value"
    )
    void setValue2(double value);

    @JSBody(
        script = "return this[3]"
    )
    double getValue3();

    @JSBody(
        params = "value",
        script = "this[3] = value"
    )
    void setValue3(double value);

    @JSBody(
        script = "return this[4]"
    )
    double getValue4();

    @JSBody(
        params = "value",
        script = "this[4] = value"
    )
    void setValue4(double value);

    @JSBody(
        script = "return this[5]"
    )
    double getValue5();

    @JSBody(
        params = "value",
        script = "this[5] = value"
    )
    void setValue5(double value);

    @JSBody(
        script = "return this[6]"
    )
    double getValue6();

    @JSBody(
        params = "value",
        script = "this[6] = value"
    )
    void setValue6(double value);

    @JSBody(
        script = "return this[7]"
    )
    double getValue7();

    @JSBody(
        params = "value",
        script = "this[7] = value"
    )
    void setValue7(double value);

    static PathPath8.Builder builder() {
      return new PathPath8.Builder();
    }

    abstract class Value0 extends JsEnum {
      public static final Value0 A = JsEnum.of("a");

      public static final Value0 C = JsEnum.of("c");

      public static final Value0 H = JsEnum.of("h");

      public static final Value0 L = JsEnum.of("l");

      public static final Value0 M = JsEnum.of("m");

      public static final Value0 Q = JsEnum.of("q");

      public static final Value0 S = JsEnum.of("s");

      public static final Value0 T = JsEnum.of("t");

      public static final Value0 V = JsEnum.of("v");

      public static final Value0 Z = JsEnum.of("z");

      public static final Value0 CAPITAL_A = JsEnum.of("A");

      public static final Value0 CAPITAL_C = JsEnum.of("C");

      public static final Value0 CAPITAL_H = JsEnum.of("H");

      public static final Value0 CAPITAL_L = JsEnum.of("L");

      public static final Value0 CAPITAL_M = JsEnum.of("M");

      public static final Value0 CAPITAL_Q = JsEnum.of("Q");

      public static final Value0 CAPITAL_S = JsEnum.of("S");

      public static final Value0 CAPITAL_T = JsEnum.of("T");

      public static final Value0 CAPITAL_V = JsEnum.of("V");

      public static final Value0 CAPITAL_Z = JsEnum.of("Z");
    }

    final class Builder {
      private final PathPath8 object = Any.empty();

      private Builder() {
      }

      public PathPath8 build() {
        return object;
      }

      public PathPath8.Builder value0(Value0 value) {
        object.setValue0(value);
        return this;
      }

      public PathPath8.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }

      public PathPath8.Builder value2(double value) {
        object.setValue2(value);
        return this;
      }

      public PathPath8.Builder value3(double value) {
        object.setValue3(value);
        return this;
      }

      public PathPath8.Builder value4(double value) {
        object.setValue4(value);
        return this;
      }

      public PathPath8.Builder value5(double value) {
        object.setValue5(value);
        return this;
      }

      public PathPath8.Builder value6(double value) {
        object.setValue6(value);
        return this;
      }

      public PathPath8.Builder value7(double value) {
        object.setValue7(value);
        return this;
      }
    }
  }
}
