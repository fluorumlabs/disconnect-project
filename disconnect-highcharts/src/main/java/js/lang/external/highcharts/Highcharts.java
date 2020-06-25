package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import js.util.Record;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"Highcharts as Highcharts_Highcharts"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Highcharts extends Any {
  /**
   * An array containing the current chart objects in the page. A chart's position
   * in the array is preserved throughout the page's lifetime. When a chart is
   * destroyed, the array item becomes <code>undefined</code>.
   *
   */
  @JSProperty("charts")
  Chart[] getCharts();

  /**
   * A hook for defining additional date format specifiers. New specifiers are
   * defined as key-value pairs by using the specifier as key, and a function
   * which takes the timestamp as value. This function returns the formatted
   * portion of the date.
   *
   */
  @JSProperty("dateFormats")
  Dictionary<TimeFormatCallbackFunction> getDateFormats();

  /**
   * Global default settings.
   *
   */
  @JSProperty("defaultOptions")
  Options getDefaultOptions();

  /**
   * Global <code>Time</code> object with default options. Since v6.0.5, time settings can be
   * applied individually for each chart. If no individual settings apply, this
   * <code>Time</code> object is shared by all instances.
   *
   */
  @JSProperty("time")
  Time getTime();

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @param options
   * Options for adding the event.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(Class<T> el, String type, EventCallbackFunction<T> fn,
      @Nullable EventOptionsObject options);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @param options
   * Options for adding the event.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(Class<T> el, String type, JsFunction fn,
      @Nullable EventOptionsObject options);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @param options
   * Options for adding the event.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(T el, String type, EventCallbackFunction<T> fn,
      @Nullable EventOptionsObject options);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @param options
   * Options for adding the event.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(T el, String type, JsFunction fn,
      @Nullable EventOptionsObject options);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(Class<T> el, String type, EventCallbackFunction<T> fn);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(Class<T> el, String type, JsFunction fn);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(T el, String type, EventCallbackFunction<T> fn);

  /**
   * Add an event listener.
   *
   * @param el
   * The element or object to add a listener to. It can be a
   * HTMLDOMElement, an SVGElement or any other object.
   *
   * @param type
   * The event type.
   *
   * @param fn
   * The function callback to execute when the event is fired.
   *
   * @return A callback function to remove the added event.
   *
   */
  <T extends Any> JsFunction addEvent(T el, String type, JsFunction fn);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   * @param opt
   * Animation options.
   *
   */
  void animate(SVGElement el, SVGAttributes params, @Nullable AnimationOptionsObject opt);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   * @param opt
   * Animation options.
   *
   */
  void animate(SVGElement el, CSSObject params, @Nullable AnimationOptionsObject opt);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   * @param opt
   * Animation options.
   *
   */
  void animate(HTMLElement el, SVGAttributes params, @Nullable AnimationOptionsObject opt);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   * @param opt
   * Animation options.
   *
   */
  void animate(HTMLElement el, CSSObject params, @Nullable AnimationOptionsObject opt);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   */
  void animate(SVGElement el, SVGAttributes params);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   */
  void animate(SVGElement el, CSSObject params);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   */
  void animate(HTMLElement el, SVGAttributes params);

  /**
   * The global animate method, which uses Fx to create individual animators.
   *
   * @param el
   * The element to animate.
   *
   * @param params
   * An object containing key-value pairs of the properties to animate.
   * Supports numeric as pixel-based CSS properties for HTML objects and
   * attributes for SVGElements.
   *
   */
  void animate(HTMLElement el, CSSObject params);

  /**
   * Get the animation in object form, where a disabled animation is always
   * returned as <code>{ duration: 0 }</code>.
   *
   * @param animation
   * An animation setting. Can be an object with duration, complete and
   * easing properties, or a boolean to enable or disable.
   *
   * @return An object with at least a duration property.
   *
   */
  AnimationOptionsObject animObject(@Nullable AnimationOptionsObject animation);

  /**
   * Get the animation in object form, where a disabled animation is always
   * returned as <code>{ duration: 0 }</code>.
   *
   * @param animation
   * An animation setting. Can be an object with duration, complete and
   * easing properties, or a boolean to enable or disable.
   *
   * @return An object with at least a duration property.
   *
   */
  AnimationOptionsObject animObject(boolean animation);

  /**
   * Get the animation in object form, where a disabled animation is always
   * returned as <code>{ duration: 0 }</code>.
   *
   * @return An object with at least a duration property.
   *
   */
  AnimationOptionsObject animObject();

  /**
   * Non-recursive method to find the lowest member of an array. <code>Math.max</code> raises
   * a maximum call stack size exceeded error in Chrome when trying to apply more
   * than 150.000 points. This method is slightly slower, but safe.
   *
   * @param data
   * An array of numbers.
   *
   * @return The highest number.
   *
   */
  double arrayMax(Any[] data);

  /**
   * Non-recursive method to find the lowest member of an array. <code>Math.min</code> raises
   * a maximum call stack size exceeded error in Chrome when trying to apply more
   * than 150.000 points. This method is slightly slower, but safe.
   *
   * @param data
   * An array of numbers.
   *
   * @return The lowest number.
   *
   */
  double arrayMin(Any[] data);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable SVGAttributes prop, @Nullable String value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable SVGAttributes prop, double value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable Dictionary<Unknown /* boolean */> prop,
      @Nullable String value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable Dictionary<Unknown /* boolean */> prop,
      double value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable String prop, @Nullable String value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable String prop, double value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable SVGAttributes prop, @Nullable String value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable SVGAttributes prop, double value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable Dictionary<Unknown /* boolean */> prop,
      @Nullable String value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable Dictionary<Unknown /* boolean */> prop, double value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable String prop, @Nullable String value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @param value
   * The value if a single property is set.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable String prop, double value);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable SVGAttributes prop);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable Dictionary<Unknown /* boolean */> prop);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem, @Nullable String prop);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable SVGAttributes prop);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable Dictionary<Unknown /* boolean */> prop);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @param prop
   * The property or an object of key-value pairs.
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem, @Nullable String prop);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(js.web.dom.svg.SVGElement elem);

  /**
   * Set or get an attribute or an object of attributes. To use as a setter, pass
   * a key and a value, or let the second argument be a collection of keys and
   * values. To use as a getter, pass only a string as the second argument.
   *
   * @param elem
   * The DOM element to receive the attribute(s).
   *
   * @return When used as a getter, return the value.
   *
   */
  @Nullable
  String attr(HTMLElement elem);

  /**
   * Factory function for basic charts.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external images
   * are loaded. Defining a chart.events.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   */
  Chart chart(Options options, @Nullable ChartCallbackFunction callback);

  /**
   * Factory function for basic charts.
   *
   * @param options
   * The chart options structure.
   *
   * @return Returns the Chart object.
   *
   */
  Chart chart(Options options);

  /**
   * Factory function for basic charts.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external images
   * are loaded. Defining a chart.events.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   */
  Chart chart(HTMLElement renderTo, Options options, @Nullable ChartCallbackFunction callback);

  /**
   * Factory function for basic charts.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external images
   * are loaded. Defining a chart.events.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   */
  Chart chart(String renderTo, Options options, @Nullable ChartCallbackFunction callback);

  /**
   * Factory function for basic charts.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @return Returns the Chart object.
   *
   */
  Chart chart(HTMLElement renderTo, Options options);

  /**
   * Factory function for basic charts.
   *
   * @param renderTo
   * The DOM element to render to, or its id.
   *
   * @param options
   * The chart options structure.
   *
   * @return Returns the Chart object.
   *
   */
  Chart chart(String renderTo, Options options);

  /**
   * Internal clear timeout. The function checks that the <code>id</code> was not removed
   * (e.g. by <code>chart.destroy()</code>). For the details see issue .7901.
   *
   * @param id
   * Id of a timeout.
   *
   */
  void clearTimeout(double id);

  /**
   * Creates a color instance out of a color string.
   *
   * @param input
   * The input color in either rbga or hex format
   *
   * @return Color instance
   *
   */
  Color color(PatternObject input);

  /**
   * Creates a color instance out of a color string.
   *
   * @param input
   * The input color in either rbga or hex format
   *
   * @return Color instance
   *
   */
  Color color(GradientColorObject input);

  /**
   * Creates a color instance out of a color string.
   *
   * @param input
   * The input color in either rbga or hex format
   *
   * @return Color instance
   *
   */
  Color color(String input);

  /**
   * Fix JS round off float errors.
   *
   * @param num
   * A float number to fix.
   *
   * @param prec
   * The precision.
   *
   * @return The corrected float number.
   *
   */
  double correctFloat(double num, double prec);

  /**
   * Fix JS round off float errors.
   *
   * @param num
   * A float number to fix.
   *
   * @return The corrected float number.
   *
   */
  double correctFloat(double num);

  /**
   * Utility function to create an HTML element with attributes and styles.
   *
   * @param tag
   * The HTML tag.
   *
   * @param attribs
   * Attributes as an object of key-value pairs.
   *
   * @param styles
   * Styles as an object of key-value pairs.
   *
   * @param parent
   * The parent HTML object.
   *
   * @param nopad
   * If true, remove all padding, border and margin.
   *
   * @return The created DOM element.
   *
   */
  HTMLElement createElement(String tag, @Nullable Dictionary<Unknown /* boolean */> attribs,
      @Nullable CSSObject styles, @Nullable HTMLElement parent, boolean nopad);

  /**
   * Utility function to create an HTML element with attributes and styles.
   *
   * @param tag
   * The HTML tag.
   *
   * @param attribs
   * Attributes as an object of key-value pairs.
   *
   * @param styles
   * Styles as an object of key-value pairs.
   *
   * @param parent
   * The parent HTML object.
   *
   * @return The created DOM element.
   *
   */
  HTMLElement createElement(String tag, @Nullable Dictionary<Unknown /* boolean */> attribs,
      @Nullable CSSObject styles, @Nullable HTMLElement parent);

  /**
   * Utility function to create an HTML element with attributes and styles.
   *
   * @param tag
   * The HTML tag.
   *
   * @param attribs
   * Attributes as an object of key-value pairs.
   *
   * @param styles
   * Styles as an object of key-value pairs.
   *
   * @return The created DOM element.
   *
   */
  HTMLElement createElement(String tag, @Nullable Dictionary<Unknown /* boolean */> attribs,
      @Nullable CSSObject styles);

  /**
   * Utility function to create an HTML element with attributes and styles.
   *
   * @param tag
   * The HTML tag.
   *
   * @param attribs
   * Attributes as an object of key-value pairs.
   *
   * @return The created DOM element.
   *
   */
  HTMLElement createElement(String tag, @Nullable Dictionary<Unknown /* boolean */> attribs);

  /**
   * Utility function to create an HTML element with attributes and styles.
   *
   * @param tag
   * The HTML tag.
   *
   * @return The created DOM element.
   *
   */
  HTMLElement createElement(String tag);

  /**
   * Set CSS on a given element.
   *
   * @param el
   * An HTML DOM element.
   *
   * @param styles
   * Style object with camel case property names.
   *
   */
  void css(js.web.dom.svg.SVGElement el, CSSObject styles);

  /**
   * Set CSS on a given element.
   *
   * @param el
   * An HTML DOM element.
   *
   * @param styles
   * Style object with camel case property names.
   *
   */
  void css(HTMLElement el, CSSObject styles);

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a
   * human readable date string. The format is a subset of the formats for PHP's
   * strftime function. Additional formats can be given in the
   * Highcharts.dateFormats hook.
   *
   * Since v6.0.5, all internal dates are formatted through the
   * Highcharts.Chart#time instance to respect chart-level time settings. The
   * <code>Highcharts.dateFormat</code> function only reflects global time settings set with
   * <code>setOptions</code>.
   *
   * Supported format keys:
   *
   * <ul>
   * <li>
   * <code>%a</code>: Short weekday, like 'Mon'
   *
   * </li>
   * <li>
   * <code>%A</code>: Long weekday, like 'Monday'
   *
   * </li>
   * <li>
   * <code>%d</code>: Two digit day of the month, 01 to 31
   *
   * </li>
   * <li>
   * <code>%e</code>: Day of the month, 1 through 31
   *
   * </li>
   * <li>
   * <code>%w</code>: Day of the week, 0 through 6
   *
   * </li>
   * <li>
   * <code>%b</code>: Short month, like 'Jan'
   *
   * </li>
   * <li>
   * <code>%B</code>: Long month, like 'January'
   *
   * </li>
   * <li>
   * <code>%m</code>: Two digit month number, 01 through 12
   *
   * </li>
   * <li>
   * <code>%y</code>: Two digits year, like 09 for 2009
   *
   * </li>
   * <li>
   * <code>%Y</code>: Four digits year, like 2009
   *
   * </li>
   * <li>
   * <code>%H</code>: Two digits hours in 24h format, 00 through 23
   *
   * </li>
   * <li>
   * <code>%k</code>: Hours in 24h format, 0 through 23
   *
   * </li>
   * <li>
   * <code>%I</code>: Two digits hours in 12h format, 00 through 11
   *
   * </li>
   * <li>
   * <code>%l</code>: Hours in 12h format, 1 through 12
   *
   * </li>
   * <li>
   * <code>%M</code>: Two digits minutes, 00 through 59
   *
   * </li>
   * <li>
   * <code>%p</code>: Upper case AM or PM
   *
   * </li>
   * <li>
   * <code>%P</code>: Lower case AM or PM
   *
   * </li>
   * <li>
   * <code>%S</code>: Two digits seconds, 00 through 59
   *
   * </li>
   * <li>
   * <code>%L</code>: Milliseconds (naming from Ruby)
   *
   * </li>
   * </ul>
   * @param format
   * The desired format where various time representations are prefixed
   * with <code>%</code>.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @param capitalize
   * Upper case first letter in the return.
   *
   * @return The formatted date.
   *
   */
  String dateFormat(String format, double timestamp, boolean capitalize);

  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a
   * human readable date string. The format is a subset of the formats for PHP's
   * strftime function. Additional formats can be given in the
   * Highcharts.dateFormats hook.
   *
   * Since v6.0.5, all internal dates are formatted through the
   * Highcharts.Chart#time instance to respect chart-level time settings. The
   * <code>Highcharts.dateFormat</code> function only reflects global time settings set with
   * <code>setOptions</code>.
   *
   * Supported format keys:
   *
   * <ul>
   * <li>
   * <code>%a</code>: Short weekday, like 'Mon'
   *
   * </li>
   * <li>
   * <code>%A</code>: Long weekday, like 'Monday'
   *
   * </li>
   * <li>
   * <code>%d</code>: Two digit day of the month, 01 to 31
   *
   * </li>
   * <li>
   * <code>%e</code>: Day of the month, 1 through 31
   *
   * </li>
   * <li>
   * <code>%w</code>: Day of the week, 0 through 6
   *
   * </li>
   * <li>
   * <code>%b</code>: Short month, like 'Jan'
   *
   * </li>
   * <li>
   * <code>%B</code>: Long month, like 'January'
   *
   * </li>
   * <li>
   * <code>%m</code>: Two digit month number, 01 through 12
   *
   * </li>
   * <li>
   * <code>%y</code>: Two digits year, like 09 for 2009
   *
   * </li>
   * <li>
   * <code>%Y</code>: Four digits year, like 2009
   *
   * </li>
   * <li>
   * <code>%H</code>: Two digits hours in 24h format, 00 through 23
   *
   * </li>
   * <li>
   * <code>%k</code>: Hours in 24h format, 0 through 23
   *
   * </li>
   * <li>
   * <code>%I</code>: Two digits hours in 12h format, 00 through 11
   *
   * </li>
   * <li>
   * <code>%l</code>: Hours in 12h format, 1 through 12
   *
   * </li>
   * <li>
   * <code>%M</code>: Two digits minutes, 00 through 59
   *
   * </li>
   * <li>
   * <code>%p</code>: Upper case AM or PM
   *
   * </li>
   * <li>
   * <code>%P</code>: Lower case AM or PM
   *
   * </li>
   * <li>
   * <code>%S</code>: Two digits seconds, 00 through 59
   *
   * </li>
   * <li>
   * <code>%L</code>: Milliseconds (naming from Ruby)
   *
   * </li>
   * </ul>
   * @param format
   * The desired format where various time representations are prefixed
   * with <code>%</code>.
   *
   * @param timestamp
   * The JavaScript timestamp.
   *
   * @return The formatted date.
   *
   */
  String dateFormat(String format, double timestamp);

  /**
   * Check if an object is null or undefined.
   *
   * @param obj
   * The object to check.
   *
   * @return False if the object is null or undefined, otherwise true.
   *
   */
  boolean defined(Any obj);

  /**
   * Utility method that destroys any SVGElement instances that are properties on
   * the given object. It loops all properties and invokes destroy if there is a
   * destroy method. The property is then delete.
   *
   * @param obj
   * The object to destroy properties on.
   *
   * @param except
   * Exception, do not destroy this property, only delete it.
   *
   */
  void destroyObjectProperties(Any obj, @Nullable Any except);

  /**
   * Utility method that destroys any SVGElement instances that are properties on
   * the given object. It loops all properties and invokes destroy if there is a
   * destroy method. The property is then delete.
   *
   * @param obj
   * The object to destroy properties on.
   *
   */
  void destroyObjectProperties(Any obj);

  /**
   * Discard a HTML element by moving it to the bin and delete.
   *
   * @param element
   * The HTML node to discard.
   *
   */
  void discardElement(HTMLElement element);

  /**
   * Iterate over an array.
   *
   * @param arr
   * The array to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * <pre><code>    - `item`: The array item.
   *
   *     - `index`: The item's index in the array.
   *
   *     - `arr`: The array that each is being applied to.
   * </code></pre>
   * @param ctx
   * The context.
   *
   */
  void each(Any[] arr, JsFunction fn, @Nullable Any ctx);

  /**
   * Iterate over an array.
   *
   * @param arr
   * The array to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * <pre><code>    - `item`: The array item.
   *
   *     - `index`: The item's index in the array.
   *
   *     - `arr`: The array that each is being applied to.
   * </code></pre>
   */
  void each(Any[] arr, JsFunction fn);

  /**
   * Remove the last occurence of an item from an array.
   *
   * @param arr
   * The array.
   *
   * @param item
   * The item to remove.
   *
   */
  void erase(Any[] arr, Any item);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   * @param stop
   * Whether to throw an error or just log a warning in the console.
   *
   * @param chart
   * Reference to the chart that causes the error. Used in 'debugger'
   * module to display errors directly on the chart. Important note: This
   * argument is undefined for errors that lack access to the Chart
   * instance.
   *
   * @param params
   * Additional parameters for the generated message.
   *
   */
  void error(String code, boolean stop, @Nullable Chart chart,
      @Nullable Dictionary<Unknown /* string */> params);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   * @param stop
   * Whether to throw an error or just log a warning in the console.
   *
   * @param chart
   * Reference to the chart that causes the error. Used in 'debugger'
   * module to display errors directly on the chart. Important note: This
   * argument is undefined for errors that lack access to the Chart
   * instance.
   *
   * @param params
   * Additional parameters for the generated message.
   *
   */
  void error(double code, boolean stop, @Nullable Chart chart,
      @Nullable Dictionary<Unknown /* string */> params);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   * @param stop
   * Whether to throw an error or just log a warning in the console.
   *
   * @param chart
   * Reference to the chart that causes the error. Used in 'debugger'
   * module to display errors directly on the chart. Important note: This
   * argument is undefined for errors that lack access to the Chart
   * instance.
   *
   */
  void error(String code, boolean stop, @Nullable Chart chart);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   * @param stop
   * Whether to throw an error or just log a warning in the console.
   *
   * @param chart
   * Reference to the chart that causes the error. Used in 'debugger'
   * module to display errors directly on the chart. Important note: This
   * argument is undefined for errors that lack access to the Chart
   * instance.
   *
   */
  void error(double code, boolean stop, @Nullable Chart chart);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   * @param stop
   * Whether to throw an error or just log a warning in the console.
   *
   */
  void error(String code, boolean stop);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   * @param stop
   * Whether to throw an error or just log a warning in the console.
   *
   */
  void error(double code, boolean stop);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   */
  void error(String code);

  /**
   * Provide error messages for debugging, with links to online explanation. This
   * function can be overridden to provide custom error handling.
   *
   * @param code
   * The error code. See errors.xml for available codes. If it is a string,
   * the error message is printed directly in the console.
   *
   */
  void error(double code);

  /**
   * Utility function to extend an object with the members of another.
   *
   * @param a
   * The object to be extended.
   *
   * @param b
   * The object to add to the first one.
   *
   * @return Object a, the original object.
   *
   */
  <T extends Any> T extend(@Nullable T a, Any b);

  /**
   * Extend a prototyped class by new members.
   *
   * @param parent
   * The parent prototype to inherit.
   *
   * @param members
   * A collection of prototype members to add or override compared to the
   * parent prototype.
   *
   * @return A new prototype.
   *
   */
  <T extends Any> Class<T> extendClass(Class<T> parent, Dictionary<Any> members);

  /**
   * Return the value of the first element in the array that satisfies the
   * provided testing function.
   *
   * @param arr
   * The array to test.
   *
   * @param callback
   * The callback function. The function receives the item as the first
   * argument. Return <code>true</code> if this item satisfies the condition.
   *
   * @return The value of the element.
   *
   */
  @Nullable
  <T extends Any> T find(T[] arr, JsFunction callback);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   * @param eventArguments
   * Custom event arguments that are passed on as an argument to the event
   * handler.
   *
   * @param defaultFunction
   * The default function to execute if the other listeners haven't
   * returned false.
   *
   */
  <T extends Any> void fireEvent(T el, String type, @Nullable Dictionary<Any> eventArguments,
      @Nullable EventCallbackFunction<T> defaultFunction);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   * @param eventArguments
   * Custom event arguments that are passed on as an argument to the event
   * handler.
   *
   * @param defaultFunction
   * The default function to execute if the other listeners haven't
   * returned false.
   *
   */
  <T extends Any> void fireEvent(T el, String type, @Nullable Dictionary<Any> eventArguments,
      @Nullable JsFunction defaultFunction);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   * @param eventArguments
   * Custom event arguments that are passed on as an argument to the event
   * handler.
   *
   * @param defaultFunction
   * The default function to execute if the other listeners haven't
   * returned false.
   *
   */
  <T extends Any> void fireEvent(T el, String type, @Nullable Event eventArguments,
      @Nullable EventCallbackFunction<T> defaultFunction);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   * @param eventArguments
   * Custom event arguments that are passed on as an argument to the event
   * handler.
   *
   * @param defaultFunction
   * The default function to execute if the other listeners haven't
   * returned false.
   *
   */
  <T extends Any> void fireEvent(T el, String type, @Nullable Event eventArguments,
      @Nullable JsFunction defaultFunction);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   * @param eventArguments
   * Custom event arguments that are passed on as an argument to the event
   * handler.
   *
   */
  <T extends Any> void fireEvent(T el, String type, @Nullable Dictionary<Any> eventArguments);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   * @param eventArguments
   * Custom event arguments that are passed on as an argument to the event
   * handler.
   *
   */
  <T extends Any> void fireEvent(T el, String type, @Nullable Event eventArguments);

  /**
   * Fire an event that was registered with Highcharts#addEvent.
   *
   * @param el
   * The object to fire the event on. It can be a HTMLDOMElement, an
   * SVGElement or any other object.
   *
   * @param type
   * The type of event.
   *
   */
  <T extends Any> void fireEvent(T el, String type);

  /**
   * Format a string according to a subset of the rules of Python's String.format
   * method.
   *
   * @param str
   * The string to format.
   *
   * @param ctx
   * The context, a collection of key-value pairs where each key is
   * replaced by its value.
   *
   * @param chart
   * A <code>Chart</code> instance used to get numberFormatter and time.
   *
   * @return The formatted string.
   *
   */
  String format(String str, Record<Any> ctx, @Nullable Chart chart);

  /**
   * Format a string according to a subset of the rules of Python's String.format
   * method.
   *
   * @param str
   * The string to format.
   *
   * @param ctx
   * The context, a collection of key-value pairs where each key is
   * replaced by its value.
   *
   * @return The formatted string.
   *
   */
  String format(String str, Record<Any> ctx);

  /**
   * Get the magnitude of a number.
   *
   * @param num
   * The number.
   *
   * @return The magnitude, where 1-9 are magnitude 1, 10-99 magnitude 2 etc.
   *
   */
  double getMagnitude(double num);

  /**
   * Get the updated default options. Until 3.0.7, merely exposing defaultOptions
   * for outside modules wasn't enough because the setOptions method created a new
   * object.
   *
   */
  Options getOptions();

  /**
   * Get the computed CSS value for given element and property, only for numerical
   * properties. For width and height, the dimension of the inner box (excluding
   * padding) is returned. Used for fitting the chart within the container.
   *
   * @param el
   * An HTML element.
   *
   * @param prop
   * The property name.
   *
   * @param toInt
   * Parse to integer.
   *
   * @return The numeric value.
   *
   */
  Unknown /* ( number | string ) */ getStyle(HTMLElement el, String prop, boolean toInt);

  /**
   * Get the computed CSS value for given element and property, only for numerical
   * properties. For width and height, the dimension of the inner box (excluding
   * padding) is returned. Used for fitting the chart within the container.
   *
   * @param el
   * An HTML element.
   *
   * @param prop
   * The property name.
   *
   * @return The numeric value.
   *
   */
  Unknown /* ( number | string ) */ getStyle(HTMLElement el, String prop);

  /**
   * Filter an array by a callback.
   *
   * @param arr
   * The array to filter.
   *
   * @param callback
   * The callback function. The function receives the item as the first
   * argument. Return <code>true</code> if the item is to be preserved.
   *
   * @return A new, filtered array.
   *
   */
  Any[] grep(Any[] arr, JsFunction callback);

  /**
   * Search for an item in an array.
   *
   * @param item
   * The item to search for.
   *
   * @param arr
   * The array or node collection to search in.
   *
   * @param fromIndex
   * The index to start searching from.
   *
   * @return The index within the array, or -1 if not found.
   *
   */
  double inArray(Any item, Any[] arr, double fromIndex);

  /**
   * Search for an item in an array.
   *
   * @param item
   * The item to search for.
   *
   * @param arr
   * The array or node collection to search in.
   *
   * @return The index within the array, or -1 if not found.
   *
   */
  double inArray(Any item, Any[] arr);

  /**
   * Utility function to check if an item is an array.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is an array.
   *
   */
  boolean isArray(Any obj);

  /**
   * Utility function to check if an Object is a class.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is a class.
   *
   */
  boolean isClass(@Nullable Any obj);

  /**
   * Utility function to check if an Object is a class.
   *
   * @return True if the argument is a class.
   *
   */
  boolean isClass();

  /**
   * Utility function to check if an Object is a HTML Element.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is a HTML Element.
   *
   */
  boolean isDOMElement(Any obj);

  /**
   * Utility function to check if an item is a number and it is finite (not NaN,
   * Infinity or -Infinity).
   *
   * @param n
   * The item to check.
   *
   * @return True if the item is a finite number
   *
   */
  boolean isNumber(Any n);

  /**
   * Utility function to check if an item is of type object.
   *
   * @param obj
   * The item to check.
   *
   * @param strict
   * Also checks that the object is not an array.
   *
   * @return True if the argument is an object.
   *
   */
  boolean isObject(Any obj, boolean strict);

  /**
   * Utility function to check if an item is of type object.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is an object.
   *
   */
  boolean isObject(Any obj);

  /**
   * Utility function to check for string type.
   *
   * @param s
   * The item to check.
   *
   * @return True if the argument is a string.
   *
   */
  boolean isString(Any s);

  /**
   * Returns an array of a given object's own properties.
   *
   * @param obj
   * The object of which the properties are to be returned.
   *
   * @return An array of strings that represents all the properties.
   *
   */
  String[] keys(Any obj);

  /**
   * Map an array by a callback.
   *
   * @param arr
   * The array to map.
   *
   * @param fn
   * The callback function. Return the new value for the new array.
   *
   * @return A new array item with modified items.
   *
   */
  Any[] map(Any[] arr, JsFunction fn);

  /**
   * Utility function to deep merge two or more objects and return a third object.
   * The merge function can also be used with a single object argument to create a
   * deep copy of an object.
   *
   * @param a
   * The first object to extend. When only this is given, the function
   * returns a deep copy.
   *
   * @param n
   * An object to merge into the previous one.
   *
   * @return The merged object. If the first argument is true, the return is the
   * same as the second argument.
   *
   */
  @JSBody(
      params = {"a", "n"},
      script = "return this.merge.apply(this, [a].concat(n))"
  )
  <T extends Any> T merge(@Nullable T a, Any... n);

  /**
   * Utility function to deep merge two or more objects and return a third object.
   * If the first argument is true, the contents of the second object is copied
   * into the first object. The merge function can also be used with a single
   * object argument to create a deep copy of an object.
   *
   * @param extend
   * Whether to extend the left-side object (a) or return a whole new
   * object.
   *
   * @param a
   * The first object to extend. When only this is given, the function
   * returns a deep copy.
   *
   * @param n
   * An object to merge into the previous one.
   *
   * @return The merged object. If the first argument is true, the return is the
   * same as the second argument.
   *
   */
  @JSBody(
      params = {"extend", "a", "n"},
      script = "return this.merge.apply(this, [extend, a].concat(n))"
  )
  <T extends Any> T merge(boolean extend, @Nullable T a, Any... n);

  /**
   * Take an interval and normalize it to multiples of round numbers.
   *
   * @param interval
   * The raw, un-rounded interval.
   *
   * @param multiples
   * Allowed multiples.
   *
   * @param magnitude
   * The magnitude of the number.
   *
   * @param allowDecimals
   * Whether to allow decimals.
   *
   * @param hasTickAmount
   * If it has tickAmount, avoid landing on tick intervals lower than
   * original.
   *
   * @return The normalized interval.
   *
   */
  double normalizeTickInterval(double interval, Any[] multiples, double magnitude,
      boolean allowDecimals, boolean hasTickAmount);

  /**
   * Take an interval and normalize it to multiples of round numbers.
   *
   * @param interval
   * The raw, un-rounded interval.
   *
   * @param multiples
   * Allowed multiples.
   *
   * @param magnitude
   * The magnitude of the number.
   *
   * @param allowDecimals
   * Whether to allow decimals.
   *
   * @return The normalized interval.
   *
   */
  double normalizeTickInterval(double interval, Any[] multiples, double magnitude,
      boolean allowDecimals);

  /**
   * Take an interval and normalize it to multiples of round numbers.
   *
   * @param interval
   * The raw, un-rounded interval.
   *
   * @param multiples
   * Allowed multiples.
   *
   * @param magnitude
   * The magnitude of the number.
   *
   * @return The normalized interval.
   *
   */
  double normalizeTickInterval(double interval, Any[] multiples, double magnitude);

  /**
   * Take an interval and normalize it to multiples of round numbers.
   *
   * @param interval
   * The raw, un-rounded interval.
   *
   * @param multiples
   * Allowed multiples.
   *
   * @return The normalized interval.
   *
   */
  double normalizeTickInterval(double interval, Any[] multiples);

  /**
   * Take an interval and normalize it to multiples of round numbers.
   *
   * @param interval
   * The raw, un-rounded interval.
   *
   * @return The normalized interval.
   *
   */
  double normalizeTickInterval(double interval);

  /**
   * Format a number and return a string based on input settings.
   *
   * @param number
   * The input number to format.
   *
   * @param decimals
   * The amount of decimals. A value of -1 preserves the amount in the
   * input number.
   *
   * @param decimalPoint
   * The decimal point, defaults to the one given in the lang options, or a
   * dot.
   *
   * @param thousandsSep
   * The thousands separator, defaults to the one given in the lang
   * options, or a space character.
   *
   * @return The formatted number.
   *
   */
  String numberFormat(double number, double decimals, @Nullable String decimalPoint,
      @Nullable String thousandsSep);

  /**
   * Format a number and return a string based on input settings.
   *
   * @param number
   * The input number to format.
   *
   * @param decimals
   * The amount of decimals. A value of -1 preserves the amount in the
   * input number.
   *
   * @param decimalPoint
   * The decimal point, defaults to the one given in the lang options, or a
   * dot.
   *
   * @return The formatted number.
   *
   */
  String numberFormat(double number, double decimals, @Nullable String decimalPoint);

  /**
   * Format a number and return a string based on input settings.
   *
   * @param number
   * The input number to format.
   *
   * @param decimals
   * The amount of decimals. A value of -1 preserves the amount in the
   * input number.
   *
   * @return The formatted number.
   *
   */
  String numberFormat(double number, double decimals);

  /**
   * Iterate over object key pairs in an object.
   *
   * @param obj
   * The object to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * <pre><code>    * value - The property value.
   *
   *     * key - The property key.
   *
   *     * obj - The object that objectEach is being applied to.
   * </code></pre>
   * @param ctx
   * The context.
   *
   */
  <T extends Any> void objectEach(Any obj, ObjectEachCallbackFunction<T> fn, @Nullable T ctx);

  /**
   * Iterate over object key pairs in an object.
   *
   * @param obj
   * The object to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * <pre><code>    * value - The property value.
   *
   *     * key - The property key.
   *
   *     * obj - The object that objectEach is being applied to.
   * </code></pre>
   */
  <T extends Any> void objectEach(Any obj, ObjectEachCallbackFunction<T> fn);

  /**
   * Get the element's offset position, corrected for <code>overflow: auto</code>.
   *
   * @param el
   * The DOM element.
   *
   * @return An object containing <code>left</code> and <code>top</code> properties for the position in
   * the page.
   *
   */
  OffsetObject offset(Element el);

  /**
   * Left-pad a string to a given length by adding a character repetetively.
   *
   * @param number
   * The input string or number.
   *
   * @param length
   * The desired string length.
   *
   * @param padder
   * The character to pad with.
   *
   * @return The padded string.
   *
   */
  String pad(double number, double length, @Nullable String padder);

  /**
   * Left-pad a string to a given length by adding a character repetetively.
   *
   * @param number
   * The input string or number.
   *
   * @param length
   * The desired string length.
   *
   * @return The padded string.
   *
   */
  String pad(double number, double length);

  /**
   * Left-pad a string to a given length by adding a character repetetively.
   *
   * @param number
   * The input string or number.
   *
   * @return The padded string.
   *
   */
  String pad(double number);

  /**
   * Return the first value that is not null or undefined.
   *
   * @param items
   * Variable number of arguments to inspect.
   *
   * @return The value of the first argument that is not null or undefined.
   *
   */
  @JSBody(
      params = {"items"},
      script = "return this.pick.apply(this, items)"
  )
  <T extends Any> T pick(T... items);

  /**
   * Reduce an array to a single value.
   *
   * @param arr
   * The array to reduce.
   *
   * @param fn
   * The callback function. Return the reduced value. Receives 4 arguments:
   * Accumulated/reduced value, current value, current array index, and the
   * array.
   *
   * @param initialValue
   * The initial value of the accumulator.
   *
   * @return The reduced value.
   *
   */
  Any reduce(Any[] arr, JsFunction fn, Any initialValue);

  /**
   * Return a length based on either the integer value, or a percentage of a base.
   *
   * @param value
   * A percentage string or a number.
   *
   * @param base
   * The full length that represents 100%.
   *
   * @param offset
   * A pixel offset to apply for percentage values. Used internally in axis
   * positioning.
   *
   * @return The computed length.
   *
   */
  double relativeLength(String value, double base, double offset);

  /**
   * Return a length based on either the integer value, or a percentage of a base.
   *
   * @param value
   * A percentage string or a number.
   *
   * @param base
   * The full length that represents 100%.
   *
   * @param offset
   * A pixel offset to apply for percentage values. Used internally in axis
   * positioning.
   *
   * @return The computed length.
   *
   */
  double relativeLength(double value, double base, double offset);

  /**
   * Return a length based on either the integer value, or a percentage of a base.
   *
   * @param value
   * A percentage string or a number.
   *
   * @param base
   * The full length that represents 100%.
   *
   * @return The computed length.
   *
   */
  double relativeLength(String value, double base);

  /**
   * Return a length based on either the integer value, or a percentage of a base.
   *
   * @param value
   * A percentage string or a number.
   *
   * @param base
   * The full length that represents 100%.
   *
   * @return The computed length.
   *
   */
  double relativeLength(double value, double base);

  /**
   * Remove an event that was added with Highcharts#addEvent.
   *
   * @param el
   * The element to remove events on.
   *
   * @param type
   * The type of events to remove. If undefined, all events are removed
   * from the element.
   *
   * @param fn
   * The specific callback to remove. If undefined, all events that match
   * the element and optionally the type are removed.
   *
   */
  <T extends Any> void removeEvent(Class<T> el, @Nullable String type,
      @Nullable EventCallbackFunction<T> fn);

  /**
   * Remove an event that was added with Highcharts#addEvent.
   *
   * @param el
   * The element to remove events on.
   *
   * @param type
   * The type of events to remove. If undefined, all events are removed
   * from the element.
   *
   * @param fn
   * The specific callback to remove. If undefined, all events that match
   * the element and optionally the type are removed.
   *
   */
  <T extends Any> void removeEvent(T el, @Nullable String type,
      @Nullable EventCallbackFunction<T> fn);

  /**
   * Remove an event that was added with Highcharts#addEvent.
   *
   * @param el
   * The element to remove events on.
   *
   * @param type
   * The type of events to remove. If undefined, all events are removed
   * from the element.
   *
   */
  <T extends Any> void removeEvent(Class<T> el, @Nullable String type);

  /**
   * Remove an event that was added with Highcharts#addEvent.
   *
   * @param el
   * The element to remove events on.
   *
   * @param type
   * The type of events to remove. If undefined, all events are removed
   * from the element.
   *
   */
  <T extends Any> void removeEvent(T el, @Nullable String type);

  /**
   * Remove an event that was added with Highcharts#addEvent.
   *
   * @param el
   * The element to remove events on.
   *
   */
  <T extends Any> void removeEvent(Class<T> el);

  /**
   * Remove an event that was added with Highcharts#addEvent.
   *
   * @param el
   * The element to remove events on.
   *
   */
  <T extends Any> void removeEvent(T el);

  /**
   * Factory to create new series prototypes.
   *
   * @param type
   * The series type name.
   *
   * @param parent
   * The parent series type name. Use <code>line</code> to inherit from the basic
   * Series object.
   *
   * @param options
   * The additional default options that are merged with the parent's
   * options.
   *
   * @param props
   * The properties (functions and primitives) to set on the new prototype.
   *
   * @param pointProps
   * Members for a series-specific extension of the Point prototype if
   * needed.
   *
   * @return The newly created prototype as extended from Series or its
   * derivatives.
   *
   */
  Series seriesType(String type, String parent, Dictionary<Any> options,
      @Nullable Dictionary<Any> props, @Nullable Dictionary<Any> pointProps);

  /**
   * Factory to create new series prototypes.
   *
   * @param type
   * The series type name.
   *
   * @param parent
   * The parent series type name. Use <code>line</code> to inherit from the basic
   * Series object.
   *
   * @param options
   * The additional default options that are merged with the parent's
   * options.
   *
   * @param props
   * The properties (functions and primitives) to set on the new prototype.
   *
   * @param pointProps
   * Members for a series-specific extension of the Point prototype if
   * needed.
   *
   * @return The newly created prototype as extended from Series or its
   * derivatives.
   *
   */
  Series seriesType(String type, String parent, SeriesOptionsRegistry[] options,
      @Nullable Dictionary<Any> props, @Nullable Dictionary<Any> pointProps);

  /**
   * Factory to create new series prototypes.
   *
   * @param type
   * The series type name.
   *
   * @param parent
   * The parent series type name. Use <code>line</code> to inherit from the basic
   * Series object.
   *
   * @param options
   * The additional default options that are merged with the parent's
   * options.
   *
   * @param props
   * The properties (functions and primitives) to set on the new prototype.
   *
   * @return The newly created prototype as extended from Series or its
   * derivatives.
   *
   */
  Series seriesType(String type, String parent, Dictionary<Any> options,
      @Nullable Dictionary<Any> props);

  /**
   * Factory to create new series prototypes.
   *
   * @param type
   * The series type name.
   *
   * @param parent
   * The parent series type name. Use <code>line</code> to inherit from the basic
   * Series object.
   *
   * @param options
   * The additional default options that are merged with the parent's
   * options.
   *
   * @param props
   * The properties (functions and primitives) to set on the new prototype.
   *
   * @return The newly created prototype as extended from Series or its
   * derivatives.
   *
   */
  Series seriesType(String type, String parent, SeriesOptionsRegistry[] options,
      @Nullable Dictionary<Any> props);

  /**
   * Factory to create new series prototypes.
   *
   * @param type
   * The series type name.
   *
   * @param parent
   * The parent series type name. Use <code>line</code> to inherit from the basic
   * Series object.
   *
   * @param options
   * The additional default options that are merged with the parent's
   * options.
   *
   * @return The newly created prototype as extended from Series or its
   * derivatives.
   *
   */
  Series seriesType(String type, String parent, Dictionary<Any> options);

  /**
   * Factory to create new series prototypes.
   *
   * @param type
   * The series type name.
   *
   * @param parent
   * The parent series type name. Use <code>line</code> to inherit from the basic
   * Series object.
   *
   * @param options
   * The additional default options that are merged with the parent's
   * options.
   *
   * @return The newly created prototype as extended from Series or its
   * derivatives.
   *
   */
  Series seriesType(String type, String parent, SeriesOptionsRegistry[] options);

  /**
   * Set the global animation to either a given value, or fall back to the given
   * chart's animation option.
   *
   * @param animation
   * The animation object.
   *
   * @param chart
   * The chart instance.
   *
   */
  void setAnimation(@Nullable AnimationOptionsObject animation, Chart chart);

  /**
   * Set the global animation to either a given value, or fall back to the given
   * chart's animation option.
   *
   * @param animation
   * The animation object.
   *
   * @param chart
   * The chart instance.
   *
   */
  void setAnimation(boolean animation, Chart chart);

  /**
   * Merge the default options with custom options and return the new options
   * structure. Commonly used for defining reusable templates.
   *
   * @param options
   * The new custom chart options.
   *
   * @return Updated options.
   *
   */
  Options setOptions(Options options);

  /**
   * Test whether at least one element in the array passes the test implemented by
   * the provided function.
   *
   * @param arr
   * The array to test
   *
   * @param fn
   * The function to run on each item. Return truty to pass the test.
   * Receives arguments <code>currentValue</code>, <code>index</code> and <code>array</code>.
   *
   * @param ctx
   * The context.
   *
   */
  boolean some(Any[] arr, JsFunction fn, Any ctx);

  /**
   * Check if an element is an array, and if not, make it into an array.
   *
   * @param obj
   * The object to splat.
   *
   * @return The produced or original array.
   *
   */
  Any[] splat(Any obj);

  /**
   * Sort an object array and keep the order of equal items. The ECMAScript
   * standard does not specify the behaviour when items are equal.
   *
   * @param arr
   * The array to sort.
   *
   * @param sortFunction
   * The function to sort it with, like with regular Array.prototype.sort.
   *
   */
  void stableSort(Any[] arr, JsFunction sortFunction);

  /**
   * Stop running animation.
   *
   * @param el
   * The SVGElement to stop animation on.
   *
   * @param prop
   * The property to stop animating. If given, the stop method will stop a
   * single property from animating, while others continue.
   *
   */
  void stop(SVGElement el, @Nullable String prop);

  /**
   * Stop running animation.
   *
   * @param el
   * The SVGElement to stop animation on.
   *
   */
  void stop(SVGElement el);

  /**
   * Set a timeout if the delay is given, otherwise perform the function
   * synchronously.
   *
   * @param fn
   * The function callback.
   *
   * @param delay
   * Delay in milliseconds.
   *
   * @param context
   * An optional context to send to the function callback.
   *
   * @return An identifier for the timeout that can later be cleared with
   * Highcharts.clearTimeout. Returns -1 if there is no timeout.
   *
   */
  double syncTimeout(JsFunction fn, double delay, @Nullable Any context);

  /**
   * Set a timeout if the delay is given, otherwise perform the function
   * synchronously.
   *
   * @param fn
   * The function callback.
   *
   * @param delay
   * Delay in milliseconds.
   *
   * @return An identifier for the timeout that can later be cleared with
   * Highcharts.clearTimeout. Returns -1 if there is no timeout.
   *
   */
  double syncTimeout(JsFunction fn, double delay);

  /**
   * Get a unique key for using in internal element id's and pointers. The key is
   * composed of a random hash specific to this Highcharts instance, and a
   * counter.
   *
   * @return A unique key.
   *
   */
  String uniqueKey();

  /**
   * Wrap a method with extended functionality, preserving the original function.
   *
   * ' * @function Highcharts.wrap
   *
   */
  @JSProperty("wrap")
  Any getWrap();

  @JSBody(
      script = "return Highcharts_Highcharts"
  )
  static Highcharts INSTANCE() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
