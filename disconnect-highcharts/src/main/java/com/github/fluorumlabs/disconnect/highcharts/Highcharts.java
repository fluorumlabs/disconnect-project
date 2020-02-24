package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

public interface Highcharts extends Any {
  /**
   * An array containing the current chart objects in the page. A chart's position
   * in the array is preserved throughout the page's lifetime. When a chart is
   * destroyed, the array item becomes <code>undefined</code>.
   *
   * @implspec static getCharts(): Array<Chart>;
   *
   */
  @JSBody(
      script = "return Highcharts.charts"
  )
  static Array<Chart> getCharts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A hook for defining additional date format specifiers. New specifiers are
   * defined as key-value pairs by using the specifier as key, and a function
   * which takes the timestamp as value. This function returns the formatted
   * portion of the date.
   *
   * @implspec static getDateFormats(): Dictionary<TimeFormatCallbackFunction>;
   *
   */
  @JSBody(
      script = "return Highcharts.dateFormats"
  )
  static Dictionary<TimeFormatCallbackFunction> getDateFormats() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Global default settings.
   *
   * @implspec static getDefaultOptions(): Options;
   *
   */
  @JSBody(
      script = "return Highcharts.defaultOptions"
  )
  static Options getDefaultOptions() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Global <code>Time</code> object with default options. Since v6.0.5, time settings can be
   * applied individually for each chart. If no individual settings apply, this
   * <code>Time</code> object is shared by all instances.
   *
   * @implspec static getTime(): Time;
   *
   */
  @JSBody(
      script = "return Highcharts.time"
  )
  static Time getTime() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * Event options
   *
   * @param order
   * The order the event handler should be called. This opens for having
   * one handler be called before another, independent of in which order
   * they were added.
   *
   * @return A callback function to remove the added event.
   *
   * @implspec static addEvent(el: any, type: string, fn: EventCallbackFunction, options: Dictionary<any>, order: number): () =&gt; void;
   *
   */
  @JSBody(
      params = {"el", "type", "fn", "options", "order"},
      script = "return Highcharts.addEvent(el, type, fn, options, order)"
  )
  static AddEventResult addEvent(Any el, String type, EventCallbackFunction fn,
      Dictionary<Any> options, double order) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animate(el: (HTMLDOMElement|SVGElement), params: (HTMLAttributes|SVGAttributes), opt?: AnimationOptionsObject): void;
   *
   */
  @JSBody(
      params = {"el", "params"},
      script = "Highcharts.animate(el, params)"
  )
  static void animate(HTMLElement el, Dictionary<Unknown> params) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animate(el: (HTMLDOMElement|SVGElement), params: (HTMLAttributes|SVGAttributes), opt?: AnimationOptionsObject): void;
   *
   */
  @JSBody(
      params = {"el", "params", "opt"},
      script = "Highcharts.animate(el, params, opt)"
  )
  static void animate(SVGElement el, SVGAttributes params, AnimationOptionsObject opt) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animate(el: (HTMLDOMElement|SVGElement), params: (HTMLAttributes|SVGAttributes), opt?: AnimationOptionsObject): void;
   *
   */
  @JSBody(
      params = {"el", "params", "opt"},
      script = "Highcharts.animate(el, params, opt)"
  )
  static void animate(SVGElement el, Dictionary<Unknown> params, AnimationOptionsObject opt) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animate(el: (HTMLDOMElement|SVGElement), params: (HTMLAttributes|SVGAttributes), opt?: AnimationOptionsObject): void;
   *
   */
  @JSBody(
      params = {"el", "params", "opt"},
      script = "Highcharts.animate(el, params, opt)"
  )
  static void animate(HTMLElement el, Dictionary<Unknown> params, AnimationOptionsObject opt) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animate(el: (HTMLDOMElement|SVGElement), params: (HTMLAttributes|SVGAttributes), opt?: AnimationOptionsObject): void;
   *
   */
  @JSBody(
      params = {"el", "params", "opt"},
      script = "Highcharts.animate(el, params, opt)"
  )
  static void animate(HTMLElement el, SVGAttributes params, AnimationOptionsObject opt) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animObject(animation: (boolean|AnimationOptionsObject)): AnimationOptionsObject;
   *
   */
  @JSBody(
      params = {"animation"},
      script = "return Highcharts.animObject(animation)"
  )
  static AnimationOptionsObject animObject(boolean animation) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static animObject(animation: (boolean|AnimationOptionsObject)): AnimationOptionsObject;
   *
   */
  @JSBody(
      params = {"animation"},
      script = "return Highcharts.animObject(animation)"
  )
  static AnimationOptionsObject animObject(AnimationOptionsObject animation) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static arrayMax(data: any[]): number;
   *
   */
  @JSBody(
      params = {"data"},
      script = "return Highcharts.arrayMax(data)"
  )
  static double arrayMax(Any[] data) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static arrayMin(data: any[]): number;
   *
   */
  @JSBody(
      params = {"data"},
      script = "return Highcharts.arrayMin(data)"
  )
  static double arrayMin(Any[] data) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop", "value"},
      script = "return Highcharts.attr(elem, prop, value)"
  )
  static Any attr(js.web.dom.svg.SVGElement elem, SVGAttributes prop, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop", "value"},
      script = "return Highcharts.attr(elem, prop, value)"
  )
  static Any attr(HTMLElement elem, Dictionary<Unknown> prop, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem"},
      script = "return Highcharts.attr(elem)"
  )
  static Any attr(js.web.dom.svg.SVGElement elem) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop", "value"},
      script = "return Highcharts.attr(elem, prop, value)"
  )
  static Any attr(js.web.dom.svg.SVGElement elem, String prop, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop"},
      script = "return Highcharts.attr(elem, prop)"
  )
  static Any attr(js.web.dom.svg.SVGElement elem, SVGAttributes prop) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop", "value"},
      script = "return Highcharts.attr(elem, prop, value)"
  )
  static Any attr(HTMLElement elem, String prop, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop", "value"},
      script = "return Highcharts.attr(elem, prop, value)"
  )
  static Any attr(HTMLElement elem, SVGAttributes prop, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static attr(elem: (HTMLDOMElement|SVGDOMElement), prop?: (string|HTMLAttributes|SVGAttributes), value?: string): any;
   *
   */
  @JSBody(
      params = {"elem", "prop", "value"},
      script = "return Highcharts.attr(elem, prop, value)"
  )
  static Any attr(js.web.dom.svg.SVGElement elem, Dictionary<Unknown> prop, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Factory function for basic charts.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external images
   * are loaded. Defining a chart.event.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#chart">https://api.highcharts.com/class-reference/Highcharts#chart</a>
   *
   * @implspec static chart(options: Options, callback?: ChartCallbackFunction): Chart;
   *
   */
  @JSBody(
      params = {"options"},
      script = "return Highcharts.chart(options)"
  )
  static Chart chart(Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Factory function for basic charts.
   *
   * @param options
   * The chart options structure.
   *
   * @param callback
   * Function to run when the chart has loaded and and all external images
   * are loaded. Defining a chart.event.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#chart">https://api.highcharts.com/class-reference/Highcharts#chart</a>
   *
   * @implspec static chart(options: Options, callback?: ChartCallbackFunction): Chart;
   *
   */
  @JSBody(
      params = {"options", "callback"},
      script = "return Highcharts.chart(options, callback)"
  )
  static Chart chart(Options options, ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * are loaded. Defining a chart.event.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#chart">https://api.highcharts.com/class-reference/Highcharts#chart</a>
   *
   * @implspec static chart(renderTo: (string|HTMLDOMElement), options: Options, callback?: ChartCallbackFunction): Chart;
   *
   */
  @JSBody(
      params = {"renderTo", "options", "callback"},
      script = "return Highcharts.chart(renderTo, options, callback)"
  )
  static Chart chart(String renderTo, Options options, ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * are loaded. Defining a chart.event.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#chart">https://api.highcharts.com/class-reference/Highcharts#chart</a>
   *
   * @implspec static chart(renderTo: (string|HTMLDOMElement), options: Options, callback?: ChartCallbackFunction): Chart;
   *
   */
  @JSBody(
      params = {"renderTo", "options"},
      script = "return Highcharts.chart(renderTo, options)"
  )
  static Chart chart(String renderTo, Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * are loaded. Defining a chart.event.load handler is equivalent.
   *
   * @return Returns the Chart object.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#chart">https://api.highcharts.com/class-reference/Highcharts#chart</a>
   *
   * @implspec static chart(renderTo: (string|HTMLDOMElement), options: Options, callback?: ChartCallbackFunction): Chart;
   *
   */
  @JSBody(
      params = {"renderTo", "options", "callback"},
      script = "return Highcharts.chart(renderTo, options, callback)"
  )
  static Chart chart(HTMLElement renderTo, Options options, ChartCallbackFunction callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Internal clear timeout. The function checks that the <code>id</code> was not removed
   * (e.g. by <code>chart.destroy()</code>). For the details see issue .7901.
   *
   * @param id
   * Id of a timeout.
   *
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#clearTimeout">https://api.highcharts.com/class-reference/Highcharts#clearTimeout</a>
   *
   * @implspec static clearTimeout(id: number): void;
   *
   */
  @JSBody(
      params = {"id"},
      script = "Highcharts.clearTimeout(id)"
  )
  static void clearTimeout(double id) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static correctFloat(num: number, prec?: number): number;
   *
   */
  @JSBody(
      params = {"num"},
      script = "return Highcharts.correctFloat(num)"
  )
  static double correctFloat(double num) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static correctFloat(num: number, prec?: number): number;
   *
   */
  @JSBody(
      params = {"num", "prec"},
      script = "return Highcharts.correctFloat(num, prec)"
  )
  static double correctFloat(double num, double prec) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static createElement(tag: string, attribs?: HTMLAttributes, styles?: CSSObject, parent?: HTMLDOMElement, nopad?: boolean): HTMLDOMElement;
   *
   */
  @JSBody(
      params = {"tag", "attribs"},
      script = "return Highcharts.createElement(tag, attribs)"
  )
  static HTMLElement createElement(String tag, Dictionary<Unknown> attribs) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static createElement(tag: string, attribs?: HTMLAttributes, styles?: CSSObject, parent?: HTMLDOMElement, nopad?: boolean): HTMLDOMElement;
   *
   */
  @JSBody(
      params = {"tag", "attribs", "styles", "parent"},
      script = "return Highcharts.createElement(tag, attribs, styles, parent)"
  )
  static HTMLElement createElement(String tag, Dictionary<Unknown> attribs, CSSObject styles,
      HTMLElement parent) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static createElement(tag: string, attribs?: HTMLAttributes, styles?: CSSObject, parent?: HTMLDOMElement, nopad?: boolean): HTMLDOMElement;
   *
   */
  @JSBody(
      params = {"tag", "attribs", "styles", "parent", "nopad"},
      script = "return Highcharts.createElement(tag, attribs, styles, parent, nopad)"
  )
  static HTMLElement createElement(String tag, Dictionary<Unknown> attribs, CSSObject styles,
      HTMLElement parent, boolean nopad) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static createElement(tag: string, attribs?: HTMLAttributes, styles?: CSSObject, parent?: HTMLDOMElement, nopad?: boolean): HTMLDOMElement;
   *
   */
  @JSBody(
      params = {"tag"},
      script = "return Highcharts.createElement(tag)"
  )
  static HTMLElement createElement(String tag) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static createElement(tag: string, attribs?: HTMLAttributes, styles?: CSSObject, parent?: HTMLDOMElement, nopad?: boolean): HTMLDOMElement;
   *
   */
  @JSBody(
      params = {"tag", "attribs", "styles"},
      script = "return Highcharts.createElement(tag, attribs, styles)"
  )
  static HTMLElement createElement(String tag, Dictionary<Unknown> attribs, CSSObject styles) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Set CSS on a given element.
   *
   * @param el
   * An HTML DOM element.
   *
   * @param styles
   * Style object with camel case property names.
   *
   * @implspec static css(el: HTMLDOMElement, styles: CSSObject): void;
   *
   */
  @JSBody(
      params = {"el", "styles"},
      script = "Highcharts.css(el, styles)"
  )
  static void css(HTMLElement el, CSSObject styles) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#dateFormat">https://api.highcharts.com/class-reference/Highcharts#dateFormat</a>
   *
   * @implspec static dateFormat(format: string, timestamp: number, capitalize?: boolean): string;
   *
   */
  @JSBody(
      params = {"format", "timestamp", "capitalize"},
      script = "return Highcharts.dateFormat(format, timestamp, capitalize)"
  )
  static String dateFormat(String format, double timestamp, boolean capitalize) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#dateFormat">https://api.highcharts.com/class-reference/Highcharts#dateFormat</a>
   *
   * @implspec static dateFormat(format: string, timestamp: number, capitalize?: boolean): string;
   *
   */
  @JSBody(
      params = {"format", "timestamp"},
      script = "return Highcharts.dateFormat(format, timestamp)"
  )
  static String dateFormat(String format, double timestamp) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Recursively converts all Date properties to timestamps.
   *
   * @param object
   * any object to convert properties of
   *
   * @implspec static datePropsToTimestamps(object: object): void;
   *
   */
  @JSBody(
      params = {"object"},
      script = "Highcharts.datePropsToTimestamps(object)"
  )
  static void datePropsToTimestamps(Any object) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Check if an object is null or undefined.
   *
   * @param obj
   * The object to check.
   *
   * @return False if the object is null or undefined, otherwise true.
   *
   * @implspec static defined(obj: any): boolean;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.defined(obj)"
  )
  static boolean defined(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static destroyObjectProperties(obj: any, except?: any): void;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "Highcharts.destroyObjectProperties(obj)"
  )
  static void destroyObjectProperties(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static destroyObjectProperties(obj: any, except?: any): void;
   *
   */
  @JSBody(
      params = {"obj", "except"},
      script = "Highcharts.destroyObjectProperties(obj, except)"
  )
  static void destroyObjectProperties(Any obj, Any except) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Discard a HTML element by moving it to the bin and delete.
   *
   * @param element
   * The HTML node to discard.
   *
   * @implspec static discardElement(element: HTMLDOMElement): void;
   *
   */
  @JSBody(
      params = {"element"},
      script = "Highcharts.discardElement(element)"
  )
  static void discardElement(HTMLElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Iterate over an array.
   *
   * @param arr
   * The array to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * item - The array item.
   *
   * index - The item's index in the array.
   *
   * arr - The array that each is being applied to.
   *
   * @param ctx
   * The context.
   *
   * @implspec static each<T>(arr: Array<T>, fn: EachCallbackFunction<T>, ctx?: any): void;
   *
   */
  @JSBody(
      params = {"arr", "fn"},
      script = "Highcharts.each<T>(arr, fn)"
  )
  static <T extends Any> void each(Array<T> arr, EachCallbackFunction<T> fn) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Iterate over an array.
   *
   * @param arr
   * The array to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * item - The array item.
   *
   * index - The item's index in the array.
   *
   * arr - The array that each is being applied to.
   *
   * @param ctx
   * The context.
   *
   * @implspec static each<T>(arr: Array<T>, fn: EachCallbackFunction<T>, ctx?: any): void;
   *
   */
  @JSBody(
      params = {"arr", "fn", "ctx"},
      script = "Highcharts.each<T>(arr, fn, ctx)"
  )
  static <T extends Any> void each(Array<T> arr, EachCallbackFunction<T> fn, Any ctx) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Remove the last occurence of an item from an array.
   *
   * @param arr
   * The array.
   *
   * @param item
   * The item to remove.
   *
   * @implspec static erase(arr: any[], item: any): void;
   *
   */
  @JSBody(
      params = {"arr", "item"},
      script = "Highcharts.erase(arr, item)"
  )
  static void erase(Any[] arr, Any item) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#error">https://api.highcharts.com/class-reference/Highcharts#error</a>
   *
   * @implspec static error(code: (number|string), stop?: boolean): void;
   *
   */
  @JSBody(
      params = {"code", "stop"},
      script = "Highcharts.error(code, stop)"
  )
  static void error(double code, boolean stop) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#error">https://api.highcharts.com/class-reference/Highcharts#error</a>
   *
   * @implspec static error(code: (number|string), stop?: boolean): void;
   *
   */
  @JSBody(
      params = {"code"},
      script = "Highcharts.error(code)"
  )
  static void error(double code) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @see <a href="https://api.highcharts.com/class-reference/Highcharts#error">https://api.highcharts.com/class-reference/Highcharts#error</a>
   *
   * @implspec static error(code: (number|string), stop?: boolean): void;
   *
   */
  @JSBody(
      params = {"code", "stop"},
      script = "Highcharts.error(code, stop)"
  )
  static void error(String code, boolean stop) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static extend(a: Dictionary<any>, b: Dictionary<any>): Dictionary<any>;
   *
   */
  @JSBody(
      params = {"a", "b"},
      script = "return Highcharts.extend(a, b)"
  )
  static Dictionary<Any> extend(Dictionary<Any> a, Dictionary<Any> b) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static extendClass(parent: any, members: Dictionary<any>): any;
   *
   */
  @JSBody(
      params = {"parent", "members"},
      script = "return Highcharts.extendClass(parent, members)"
  )
  static Any extendClass(Any parent, Dictionary<Any> members) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static find(arr: any[], callback: () =&gt; void): any;
   *
   */
  @JSBody(
      params = {"arr", "callback"},
      script = "return Highcharts.find(arr, callback)"
  )
  static Any find(Any[] arr, FindCallback callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static fireEvent(el: any, type: string, eventArguments?: Dictionary<any>, defaultFunction?: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"el", "type", "eventArguments", "defaultFunction"},
      script = "Highcharts.fireEvent(el, type, eventArguments, defaultFunction)"
  )
  static void fireEvent(Any el, String type, Dictionary<Any> eventArguments,
      FireEventDefaultFunction defaultFunction) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static fireEvent(el: any, type: string, eventArguments?: Dictionary<any>, defaultFunction?: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"el", "type", "eventArguments"},
      script = "Highcharts.fireEvent(el, type, eventArguments)"
  )
  static void fireEvent(Any el, String type, Dictionary<Any> eventArguments) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static fireEvent(el: any, type: string, eventArguments?: Dictionary<any>, defaultFunction?: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"el", "type"},
      script = "Highcharts.fireEvent(el, type)"
  )
  static void fireEvent(Any el, String type) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @param time
   * A <code>Time</code> instance that determines the date formatting, for example for
   * applying time zone corrections to the formatted date.
   *
   * @return The formatted string.
   *
   * @implspec static format(str: string, ctx: any, time?: Time): string;
   *
   */
  @JSBody(
      params = {"str", "ctx", "time"},
      script = "return Highcharts.format(str, ctx, time)"
  )
  static String format(String str, Any ctx, Time time) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @param time
   * A <code>Time</code> instance that determines the date formatting, for example for
   * applying time zone corrections to the formatted date.
   *
   * @return The formatted string.
   *
   * @implspec static format(str: string, ctx: any, time?: Time): string;
   *
   */
  @JSBody(
      params = {"str", "ctx"},
      script = "return Highcharts.format(str, ctx)"
  )
  static String format(String str, Any ctx) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Format a single variable. Similar to sprintf, without the % prefix.
   *
   * @param format
   * The format string.
   *
   * @param val
   * The value.
   *
   * @param time
   * A <code>Time</code> instance that determines the date formatting, for example for
   * applying time zone corrections to the formatted date.
   *
   * @return The formatted representation of the value.
   *
   * @implspec static formatSingle(format: string, val: any, time?: Time): string;
   *
   */
  @JSBody(
      params = {"format", "val", "time"},
      script = "return Highcharts.formatSingle(format, val, time)"
  )
  static String formatSingle(String format, Any val, Time time) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Format a single variable. Similar to sprintf, without the % prefix.
   *
   * @param format
   * The format string.
   *
   * @param val
   * The value.
   *
   * @param time
   * A <code>Time</code> instance that determines the date formatting, for example for
   * applying time zone corrections to the formatted date.
   *
   * @return The formatted representation of the value.
   *
   * @implspec static formatSingle(format: string, val: any, time?: Time): string;
   *
   */
  @JSBody(
      params = {"format", "val"},
      script = "return Highcharts.formatSingle(format, val)"
  )
  static String formatSingle(String format, Any val) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Get the magnitude of a number.
   *
   * @param number
   * The number.
   *
   * @return The magnitude, where 1-9 are magnitude 1, 10-99 magnitude 2 etc.
   *
   * @implspec static getMagnitude(number: number): number;
   *
   */
  @JSBody(
      params = {"number"},
      script = "return Highcharts.getMagnitude(number)"
  )
  static double getMagnitude(double number) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Get the updated default options. Until 3.0.7, merely exposing defaultOptions
   * for outside modules wasn't enough because the setOptions method created a new
   * object.
   *
   * @implspec static getOptions(): Options;
   *
   */
  @JSBody(
      script = "return Highcharts.getOptions()"
  )
  static Options getOptions() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static getStyle(el: HTMLDOMElement, prop: string, toInt?: boolean): number;
   *
   */
  @JSBody(
      params = {"el", "prop", "toInt"},
      script = "return Highcharts.getStyle(el, prop, toInt)"
  )
  static double getStyle(HTMLElement el, String prop, boolean toInt) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static getStyle(el: HTMLDOMElement, prop: string, toInt?: boolean): number;
   *
   */
  @JSBody(
      params = {"el", "prop"},
      script = "return Highcharts.getStyle(el, prop)"
  )
  static double getStyle(HTMLElement el, String prop) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static grep(arr: any[], callback: () =&gt; void): any[];
   *
   */
  @JSBody(
      params = {"arr", "callback"},
      script = "return Highcharts.grep(arr, callback)"
  )
  static Any[] grep(Any[] arr, GrepCallback callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static inArray(item: any, arr: any[], fromIndex?: number): number;
   *
   */
  @JSBody(
      params = {"item", "arr", "fromIndex"},
      script = "return Highcharts.inArray(item, arr, fromIndex)"
  )
  static double inArray(Any item, Any[] arr, double fromIndex) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static inArray(item: any, arr: any[], fromIndex?: number): number;
   *
   */
  @JSBody(
      params = {"item", "arr"},
      script = "return Highcharts.inArray(item, arr)"
  )
  static double inArray(Any item, Any[] arr) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Utility function to check if an item is an array.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is an array.
   *
   * @implspec static isArray(obj: any): boolean;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.isArray(obj)"
  )
  static boolean isArray(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Utility function to check if an Object is an class.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is an class.
   *
   * @implspec static isClass(obj: any): boolean;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.isClass(obj)"
  )
  static boolean isClass(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Utility function to check if an Object is a HTML Element.
   *
   * @param obj
   * The item to check.
   *
   * @return True if the argument is a HTML Element.
   *
   * @implspec static isDOMElement(obj: any): boolean;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.isDOMElement(obj)"
  )
  static boolean isDOMElement(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Utility function to check if an item is a number and it is finite (not NaN,
   * Infinity or -Infinity).
   *
   * @param n
   * The item to check.
   *
   * @return True if the item is a finite number
   *
   * @implspec static isNumber(n: any): boolean;
   *
   */
  @JSBody(
      params = {"n"},
      script = "return Highcharts.isNumber(n)"
  )
  static boolean isNumber(Any n) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static isObject(obj: any, strict?: boolean): boolean;
   *
   */
  @JSBody(
      params = {"obj", "strict"},
      script = "return Highcharts.isObject(obj, strict)"
  )
  static boolean isObject(Any obj, boolean strict) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static isObject(obj: any, strict?: boolean): boolean;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.isObject(obj)"
  )
  static boolean isObject(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Utility function to check for string type.
   *
   * @param s
   * The item to check.
   *
   * @return True if the argument is a string.
   *
   * @implspec static isString(s: any): boolean;
   *
   */
  @JSBody(
      params = {"s"},
      script = "return Highcharts.isString(s)"
  )
  static boolean isString(Any s) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns an array of a given object's own properties.
   *
   * @param obj
   * The object of which the properties are to be returned.
   *
   * @return An array of strings that represents all the properties.
   *
   * @implspec static keys(obj: any): Array<string>;
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.keys(obj)"
  )
  static String[] keys(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static map(arr: Array<any>, fn: MapArrayCallbackFunction): any[];
   *
   */
  @JSBody(
      params = {"arr", "fn"},
      script = "return Highcharts.map(arr, fn)"
  )
  static Any[] map(Array<Any> arr, MapArrayCallbackFunction fn) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static merge(a: any, n?: any): any;
   *
   */
  @JSBody(
      params = {"a", "n"},
      script = "return Highcharts.merge(a, n)"
  )
  static Any merge(Any a, Any n) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static merge(a: any, n?: any): any;
   *
   */
  @JSBody(
      params = {"a"},
      script = "return Highcharts.merge(a)"
  )
  static Any merge(Any a) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static merge(extend: boolean, a: any, n?: any): any;
   *
   */
  @JSBody(
      params = {"extend", "a"},
      script = "return Highcharts.merge(extend, a)"
  )
  static Any merge(boolean extend, Any a) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static merge(extend: boolean, a: any, n?: any): any;
   *
   */
  @JSBody(
      params = {"extend", "a", "n"},
      script = "return Highcharts.merge(extend, a, n)"
  )
  static Any merge(boolean extend, Any a, Any n) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static normalizeTickInterval(interval: number, multiples?: any[], magnitude?: number, allowDecimals?: boolean, hasTickAmount?: boolean): number;
   *
   */
  @JSBody(
      params = {"interval", "multiples"},
      script = "return Highcharts.normalizeTickInterval(interval, multiples)"
  )
  static double normalizeTickInterval(double interval, Any[] multiples) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static normalizeTickInterval(interval: number, multiples?: any[], magnitude?: number, allowDecimals?: boolean, hasTickAmount?: boolean): number;
   *
   */
  @JSBody(
      params = {"interval", "multiples", "magnitude"},
      script = "return Highcharts.normalizeTickInterval(interval, multiples, magnitude)"
  )
  static double normalizeTickInterval(double interval, Any[] multiples, double magnitude) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static normalizeTickInterval(interval: number, multiples?: any[], magnitude?: number, allowDecimals?: boolean, hasTickAmount?: boolean): number;
   *
   */
  @JSBody(
      params = {"interval", "multiples", "magnitude", "allowDecimals", "hasTickAmount"},
      script = "return Highcharts.normalizeTickInterval(interval, multiples, magnitude, allowDecimals, hasTickAmount)"
  )
  static double normalizeTickInterval(double interval, Any[] multiples, double magnitude,
      boolean allowDecimals, boolean hasTickAmount) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static normalizeTickInterval(interval: number, multiples?: any[], magnitude?: number, allowDecimals?: boolean, hasTickAmount?: boolean): number;
   *
   */
  @JSBody(
      params = {"interval"},
      script = "return Highcharts.normalizeTickInterval(interval)"
  )
  static double normalizeTickInterval(double interval) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static normalizeTickInterval(interval: number, multiples?: any[], magnitude?: number, allowDecimals?: boolean, hasTickAmount?: boolean): number;
   *
   */
  @JSBody(
      params = {"interval", "multiples", "magnitude", "allowDecimals"},
      script = "return Highcharts.normalizeTickInterval(interval, multiples, magnitude, allowDecimals)"
  )
  static double normalizeTickInterval(double interval, Any[] multiples, double magnitude,
      boolean allowDecimals) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static numberFormat(number: number, decimals: number, decimalPoint?: string, thousandsSep?: string): string;
   *
   */
  @JSBody(
      params = {"number", "decimals", "decimalPoint", "thousandsSep"},
      script = "return Highcharts.numberFormat(number, decimals, decimalPoint, thousandsSep)"
  )
  static String numberFormat(double number, double decimals, String decimalPoint,
      String thousandsSep) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static numberFormat(number: number, decimals: number, decimalPoint?: string, thousandsSep?: string): string;
   *
   */
  @JSBody(
      params = {"number", "decimals", "decimalPoint"},
      script = "return Highcharts.numberFormat(number, decimals, decimalPoint)"
  )
  static String numberFormat(double number, double decimals, String decimalPoint) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static numberFormat(number: number, decimals: number, decimalPoint?: string, thousandsSep?: string): string;
   *
   */
  @JSBody(
      params = {"number", "decimals"},
      script = "return Highcharts.numberFormat(number, decimals)"
  )
  static String numberFormat(double number, double decimals) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Iterate over object key pairs in an object.
   *
   * @param obj
   * The object to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * value - The property value.
   *
   * key - The property key.
   *
   * obj - The object that objectEach is being applied to.
   *
   * @param ctx
   * The context.
   *
   * @implspec static objectEach(obj: any, fn: ObjectEachCallbackFunction, ctx?: any): void;
   *
   */
  @JSBody(
      params = {"obj", "fn", "ctx"},
      script = "Highcharts.objectEach(obj, fn, ctx)"
  )
  static void objectEach(Any obj, ObjectEachCallbackFunction fn, Any ctx) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Iterate over object key pairs in an object.
   *
   * @param obj
   * The object to iterate over.
   *
   * @param fn
   * The iterator callback. It passes three arguments:
   *
   * value - The property value.
   *
   * key - The property key.
   *
   * obj - The object that objectEach is being applied to.
   *
   * @param ctx
   * The context.
   *
   * @implspec static objectEach(obj: any, fn: ObjectEachCallbackFunction, ctx?: any): void;
   *
   */
  @JSBody(
      params = {"obj", "fn"},
      script = "Highcharts.objectEach(obj, fn)"
  )
  static void objectEach(Any obj, ObjectEachCallbackFunction fn) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Get the element's offset position, corrected for <code>overflow: auto</code>.
   *
   * @param el
   * The HTML element.
   *
   * @return An object containing <code>left</code> and <code>top</code> properties for the position in
   * the page.
   *
   * @implspec static offset(el: HTMLDOMElement): OffsetObject;
   *
   */
  @JSBody(
      params = {"el"},
      script = "return Highcharts.offset(el)"
  )
  static OffsetObject offset(HTMLElement el) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static pad(number: number, length: number, padder?: string): string;
   *
   */
  @JSBody(
      params = {"number", "length", "padder"},
      script = "return Highcharts.pad(number, length, padder)"
  )
  static String pad(double number, double length, String padder) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static pad(number: number, length: number, padder?: string): string;
   *
   */
  @JSBody(
      params = {"number", "length"},
      script = "return Highcharts.pad(number, length)"
  )
  static String pad(double number, double length) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Return the first value that is not null or undefined.
   *
   * @param items
   * Variable number of arguments to inspect.
   *
   * @return The value of the first argument that is not null or undefined.
   *
   * @implspec static pick(items: any): any;
   *
   */
  @JSBody(
      params = {"items"},
      script = "return Highcharts.pick(items)"
  )
  static Any pick(Any items) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static reduce(arr: Array<any>, fn: () =&gt; void, initialValue: any): any;
   *
   */
  @JSBody(
      params = {"arr", "fn", "initialValue"},
      script = "return Highcharts.reduce(arr, fn, initialValue)"
  )
  static Any reduce(Array<Any> arr, ReduceFn fn, Any initialValue) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static relativeLength(value: RelativeSize, base: number, offset?: number): number;
   *
   */
  @JSBody(
      params = {"value", "base"},
      script = "return Highcharts.relativeLength(value, base)"
  )
  static double relativeLength(double value, double base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static relativeLength(value: RelativeSize, base: number, offset?: number): number;
   *
   */
  @JSBody(
      params = {"value", "base", "offset"},
      script = "return Highcharts.relativeLength(value, base, offset)"
  )
  static double relativeLength(double value, double base, double offset) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static relativeLength(value: RelativeSize, base: number, offset?: number): number;
   *
   */
  @JSBody(
      params = {"value", "base", "offset"},
      script = "return Highcharts.relativeLength(value, base, offset)"
  )
  static double relativeLength(String value, double base, double offset) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static removeEvent(el: any, type?: string, fn?: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"el", "type", "fn"},
      script = "Highcharts.removeEvent(el, type, fn)"
  )
  static void removeEvent(Any el, String type, RemoveEventFn fn) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static removeEvent(el: any, type?: string, fn?: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"el", "type"},
      script = "Highcharts.removeEvent(el, type)"
  )
  static void removeEvent(Any el, String type) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static removeEvent(el: any, type?: string, fn?: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"el"},
      script = "Highcharts.removeEvent(el)"
  )
  static void removeEvent(Any el) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * The additional default options that is merged with the parent's
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
   * @implspec static seriesType(type: string, parent: string, options: any, props: any, pointProps?: any): Series;
   *
   */
  @JSBody(
      params = {"type", "parent", "options", "props", "pointProps"},
      script = "return Highcharts.seriesType(type, parent, options, props, pointProps)"
  )
  static Series seriesType(String type, String parent, Any options, Any props, Any pointProps) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * The additional default options that is merged with the parent's
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
   * @implspec static seriesType(type: string, parent: string, options: any, props: any, pointProps?: any): Series;
   *
   */
  @JSBody(
      params = {"type", "parent", "options", "props"},
      script = "return Highcharts.seriesType(type, parent, options, props)"
  )
  static Series seriesType(String type, String parent, Any options, Any props) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static setAnimation(animation: (boolean|AnimationOptionsObject), chart: Chart): void;
   *
   */
  @JSBody(
      params = {"animation", "chart"},
      script = "Highcharts.setAnimation(animation, chart)"
  )
  static void setAnimation(AnimationOptionsObject animation, Chart chart) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static setAnimation(animation: (boolean|AnimationOptionsObject), chart: Chart): void;
   *
   */
  @JSBody(
      params = {"animation", "chart"},
      script = "Highcharts.setAnimation(animation, chart)"
  )
  static void setAnimation(boolean animation, Chart chart) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Merge the default options with custom options and return the new options
   * structure. Commonly used for defining reusable templates.
   *
   * @param options
   * The new custom chart options.
   *
   * @return Updated options.
   *
   * @implspec static setOptions(options: Options): Options;
   *
   */
  @JSBody(
      params = {"options"},
      script = "return Highcharts.setOptions(options)"
  )
  static Options setOptions(Options options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static some(arr: any[], fn: () =&gt; void, ctx: any): boolean;
   *
   */
  @JSBody(
      params = {"arr", "fn", "ctx"},
      script = "return Highcharts.some(arr, fn, ctx)"
  )
  static boolean some(Any[] arr, SomeFn fn, Any ctx) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Check if an element is an array, and if not, make it into an array.
   *
   * @param obj
   * The object to splat.
   *
   * @return The produced or original array.
   *
   * @implspec static splat(obj: any): any[];
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Highcharts.splat(obj)"
  )
  static Any[] splat(Any obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static stableSort(arr: any[], sortFunction: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"arr", "sortFunction"},
      script = "Highcharts.stableSort(arr, sortFunction)"
  )
  static void stableSort(Any[] arr, StableSortSortFunction sortFunction) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static stop(el: SVGElement, prop?: string): void;
   *
   */
  @JSBody(
      params = {"el", "prop"},
      script = "Highcharts.stop(el, prop)"
  )
  static void stop(SVGElement el, String prop) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * @implspec static stop(el: SVGElement, prop?: string): void;
   *
   */
  @JSBody(
      params = {"el"},
      script = "Highcharts.stop(el)"
  )
  static void stop(SVGElement el) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * The context.
   *
   * @return An identifier for the timeout that can later be cleared with
   * Highcharts.clearTimeout.
   *
   * @implspec static syncTimeout(fn: () =&gt; void, delay: number, context?: any): number;
   *
   */
  @JSBody(
      params = {"fn", "delay", "context"},
      script = "return Highcharts.syncTimeout(fn, delay, context)"
  )
  static double syncTimeout(SyncTimeoutFn fn, double delay, Any context) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

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
   * The context.
   *
   * @return An identifier for the timeout that can later be cleared with
   * Highcharts.clearTimeout.
   *
   * @implspec static syncTimeout(fn: () =&gt; void, delay: number, context?: any): number;
   *
   */
  @JSBody(
      params = {"fn", "delay"},
      script = "return Highcharts.syncTimeout(fn, delay)"
  )
  static double syncTimeout(SyncTimeoutFn fn, double delay) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Get a unique key for using in internal element id's and pointers. The key is
   * composed of a random hash specific to this Highcharts instance, and a
   * counter.
   *
   * @return A unique key.
   *
   * @implspec static uniqueKey(): string;
   *
   */
  @JSBody(
      script = "return Highcharts.uniqueKey()"
  )
  static String uniqueKey() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Wrap a method with extended functionality, preserving the original function.
   *
   * @param obj
   * The context object that the method belongs to. In real cases, this is
   * often a prototype.
   *
   * @param method
   * The name of the method to extend.
   *
   * @param func
   * A wrapper function callback. This function is called with the same
   * arguments as the original function, except that the original function
   * is unshifted and passed as the first argument.
   *
   * @implspec static wrap(obj: any, method: string, func: () =&gt; void): void;
   *
   */
  @JSBody(
      params = {"obj", "method", "func"},
      script = "Highcharts.wrap(obj, method, func)"
  )
  static void wrap(Any obj, String method, WrapFunc func) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface AddEventResult extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface FindCallback extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface FireEventDefaultFunction extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface GrepCallback extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface ReduceFn extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface RemoveEventFn extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface SomeFn extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface StableSortSortFunction extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface SyncTimeoutFn extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface WrapFunc extends Any {
    void apply();
  }
}
