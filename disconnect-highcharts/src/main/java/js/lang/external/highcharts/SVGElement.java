package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( HTMLDOMElement | SVGDOMElement ) */;
import js.lang.Unknown /* ( number | string ) */;
import js.util.RegExp;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * The SVGElement prototype is a JavaScript wrapper for SVG elements used in the
 * rendering layer of Highcharts. Combined with the Highcharts.SVGRenderer
 * object, these prototypes allow freeform annotation in the charts or even in
 * HTML pages without instanciating a chart. The SVGElement can also wrap HTML
 * labels, when <code>text</code> or <code>label</code> elements are created with the <code>useHTML</code>
 * parameter.
 *
 * The SVGElement instances are created through factory functions on the
 * Highcharts.SVGRenderer object, like rect, path, text, label, g and more.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SVGElement extends Any {
  /**
   * The primary DOM node. Each <code>SVGElement</code> instance wraps a main DOM node,
   * but may also represent more nodes.
   *
   */
  @JSProperty("element")
  Unknown /* ( HTMLDOMElement | SVGDOMElement ) */ getElement();

  /**
   * The primary DOM node. Each <code>SVGElement</code> instance wraps a main DOM node,
   * but may also represent more nodes.
   *
   */
  @JSProperty("element")
  void setElement(js.web.dom.svg.SVGElement value);

  /**
   * The primary DOM node. Each <code>SVGElement</code> instance wraps a main DOM node,
   * but may also represent more nodes.
   *
   */
  @JSProperty("element")
  void setElement(HTMLElement value);

  /**
   * The renderer that the SVGElement belongs to.
   *
   */
  @JSProperty("renderer")
  SVGRenderer getRenderer();

  /**
   * The renderer that the SVGElement belongs to.
   *
   */
  @JSProperty("renderer")
  void setRenderer(SVGRenderer value);

  /**
   * Add the element to the DOM. All elements must be added this way.
   *
   * @param parent
   * The parent item to add it to. If undefined, the element is added
   * to the Highcharts.SVGRenderer.box.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement add(@Nullable SVGElement parent);

  /**
   * Add the element to the DOM. All elements must be added this way.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement add();

  /**
   * Add a class name to an element.
   *
   * @param className
   * The new class name to add.
   *
   * @param replace
   * When true, the existing class name(s) will be overwritten with the
   * new one. When false, the new one is added.
   *
   * @return Return the SVG element for chainability.
   *
   */
  SVGElement addClass(String className, boolean replace);

  /**
   * Add a class name to an element.
   *
   * @param className
   * The new class name to add.
   *
   * @return Return the SVG element for chainability.
   *
   */
  SVGElement addClass(String className);

  /**
   * Align the element relative to the chart or another box.
   *
   * @param alignOptions
   * The alignment options. The function can be called without this
   * parameter in order to re-align an element after the box has been
   * updated.
   *
   * @param alignByTranslate
   * Align element by translation.
   *
   * @param box
   * The box to align to, needs a width and height. When the box is a
   * string, it refers to an object in the Renderer. For example, when
   * box is <code>spacingBox</code>, it refers to <code>Renderer.spacingBox</code> which
   * holds <code>width</code>, <code>height</code>, <code>x</code> and <code>y</code> properties.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement align(@Nullable AlignObject alignOptions, boolean alignByTranslate,
      @Nullable BBoxObject box);

  /**
   * Align the element relative to the chart or another box.
   *
   * @param alignOptions
   * The alignment options. The function can be called without this
   * parameter in order to re-align an element after the box has been
   * updated.
   *
   * @param alignByTranslate
   * Align element by translation.
   *
   * @param box
   * The box to align to, needs a width and height. When the box is a
   * string, it refers to an object in the Renderer. For example, when
   * box is <code>spacingBox</code>, it refers to <code>Renderer.spacingBox</code> which
   * holds <code>width</code>, <code>height</code>, <code>x</code> and <code>y</code> properties.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement align(@Nullable AlignObject alignOptions, boolean alignByTranslate,
      @Nullable String box);

  /**
   * Align the element relative to the chart or another box.
   *
   * @param alignOptions
   * The alignment options. The function can be called without this
   * parameter in order to re-align an element after the box has been
   * updated.
   *
   * @param alignByTranslate
   * Align element by translation.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement align(@Nullable AlignObject alignOptions, boolean alignByTranslate);

  /**
   * Align the element relative to the chart or another box.
   *
   * @param alignOptions
   * The alignment options. The function can be called without this
   * parameter in order to re-align an element after the box has been
   * updated.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement align(@Nullable AlignObject alignOptions);

  /**
   * Align the element relative to the chart or another box.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement align();

  /**
   * Animate to given attributes or CSS properties.
   *
   * @param params
   * SVG attributes or CSS to animate.
   *
   * @param options
   * Animation options.
   *
   * @param complete
   * Function to perform at the end of animation.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement animate(SVGAttributes params, @Nullable AnimationOptionsObject options,
      @Nullable JsFunction complete);

  /**
   * Animate to given attributes or CSS properties.
   *
   * @param params
   * SVG attributes or CSS to animate.
   *
   * @param options
   * Animation options.
   *
   * @param complete
   * Function to perform at the end of animation.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement animate(SVGAttributes params, boolean options, @Nullable JsFunction complete);

  /**
   * Animate to given attributes or CSS properties.
   *
   * @param params
   * SVG attributes or CSS to animate.
   *
   * @param options
   * Animation options.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement animate(SVGAttributes params, @Nullable AnimationOptionsObject options);

  /**
   * Animate to given attributes or CSS properties.
   *
   * @param params
   * SVG attributes or CSS to animate.
   *
   * @param options
   * Animation options.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement animate(SVGAttributes params, boolean options);

  /**
   * Animate to given attributes or CSS properties.
   *
   * @param params
   * SVG attributes or CSS to animate.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement animate(SVGAttributes params);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, @Nullable AttrVal val,
      @Nullable JsFunction complete, boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, double[] val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, @Nullable String val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, double val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, @Nullable AttrVal val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, double[] val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, @Nullable String val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @param continueAnimation
   * Used internally when <code>.attr</code> is called as part of an animation
   * step. Otherwise, calling <code>.attr</code> for an attribute will stop
   * animation for that attribute.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, double val, @Nullable JsFunction complete,
      boolean continueAnimation);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, @Nullable AttrVal val,
      @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, double[] val, @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, @Nullable String val,
      @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, double val, @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, @Nullable AttrVal val, @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, double[] val, @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, @Nullable String val, @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @param complete
   * A callback function to execute after setting the attributes. This
   * makes the function compliant and interchangeable with the
   * SVGElement#animate function.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, double val, @Nullable JsFunction complete);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, @Nullable AttrVal val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, double[] val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, @Nullable String val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash, double val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, @Nullable AttrVal val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, double[] val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, @Nullable String val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @param val
   * If the type of the first argument is <code>string</code>, the second can be a
   * value, which will serve as a single attribute setter. If the first
   * argument is a string and the second is undefined, the function
   * serves as a getter and the current value of the property is
   * returned.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash, double val);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable SVGAttributes hash);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @param hash
   * The native and custom SVG attributes.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr(@Nullable String hash);

  /**
   * Apply native and custom attributes to the SVG elements.
   *
   * In order to set the rotation center for rotation, set x and y to 0 and
   * use <code>translateX</code> and <code>translateY</code> attributes to position the element
   * instead.
   *
   * Attributes frequently used in Highcharts are <code>fill</code>, <code>stroke</code>,
   * <code>stroke-width</code>.
   *
   * @return If used as a setter, it returns the current Highcharts.SVGElement
   * so the calls can be chained. If used as a getter, the current
   * value of the attribute is returned.
   *
   */
  SVGElement attr();

  /**
   * Apply a clipping rectangle to this element.
   *
   * @param clipRect
   * The clipping rectangle. If skipped, the current clip is removed.
   *
   * @return Returns the SVG element to allow chaining.
   *
   */
  SVGElement clip(@Nullable SVGElement clipRect);

  /**
   * Apply a clipping rectangle to this element.
   *
   * @return Returns the SVG element to allow chaining.
   *
   */
  SVGElement clip();

  /**
   * Calculate the coordinates needed for drawing a rectangle crisply and
   * return the calculated attributes.
   *
   * @param rect
   * Rectangle to crisp.
   *
   * @param strokeWidth
   * The stroke width to consider when computing crisp positioning. It
   * can also be set directly on the rect parameter.
   *
   * @return The modified rectangle arguments.
   *
   */
  RectangleObject crisp(RectangleObject rect, double strokeWidth);

  /**
   * Calculate the coordinates needed for drawing a rectangle crisply and
   * return the calculated attributes.
   *
   * @param rect
   * Rectangle to crisp.
   *
   * @return The modified rectangle arguments.
   *
   */
  RectangleObject crisp(RectangleObject rect);

  /**
   * Set styles for the element. In addition to CSS styles supported by native
   * SVG and HTML elements, there are also some custom made for Highcharts,
   * like <code>width</code>, <code>ellipsis</code> and <code>textOverflow</code> for SVG text elements.
   *
   * @param styles
   * The new CSS styles.
   *
   * @return Return the SVG element for chaining.
   *
   */
  SVGElement css(CSSObject styles);

  /**
   * Destroy the element and element wrapper and clear up the DOM and event
   * hooks.
   *
   */
  void destroy();

  /**
   * Fade out an element by animating its opacity down to 0, and hide it on
   * complete. Used internally for the tooltip.
   *
   * @param duration
   * The fade duration in milliseconds.
   *
   */
  void fadeOut(double duration);

  /**
   * Fade out an element by animating its opacity down to 0, and hide it on
   * complete. Used internally for the tooltip.
   *
   */
  void fadeOut();

  /**
   * Get the bounding box (width, height, x and y) for the element. Generally
   * used to get rendered text size. Since this is called a lot in charts, the
   * results are cached based on text properties, in order to save DOM
   * traffic. The returned bounding box includes the rotation, so for example
   * a single text line of rotation 90 will report a greater height, and a
   * width corresponding to the line-height.
   *
   * @param reload
   * Skip the cache and get the updated DOM bouding box.
   *
   * @param rot
   * Override the element's rotation. This is internally used on axis
   * labels with a value of 0 to find out what the bounding box would
   * be have been if it were not rotated.
   *
   * @return The bounding box with <code>x</code>, <code>y</code>, <code>width</code> and <code>height</code> properties.
   *
   */
  BBoxObject getBBox(boolean reload, double rot);

  /**
   * Get the bounding box (width, height, x and y) for the element. Generally
   * used to get rendered text size. Since this is called a lot in charts, the
   * results are cached based on text properties, in order to save DOM
   * traffic. The returned bounding box includes the rotation, so for example
   * a single text line of rotation 90 will report a greater height, and a
   * width corresponding to the line-height.
   *
   * @param reload
   * Skip the cache and get the updated DOM bouding box.
   *
   * @return The bounding box with <code>x</code>, <code>y</code>, <code>width</code> and <code>height</code> properties.
   *
   */
  BBoxObject getBBox(boolean reload);

  /**
   * Get the bounding box (width, height, x and y) for the element. Generally
   * used to get rendered text size. Since this is called a lot in charts, the
   * results are cached based on text properties, in order to save DOM
   * traffic. The returned bounding box includes the rotation, so for example
   * a single text line of rotation 90 will report a greater height, and a
   * width corresponding to the line-height.
   *
   * @return The bounding box with <code>x</code>, <code>y</code>, <code>width</code> and <code>height</code> properties.
   *
   */
  BBoxObject getBBox();

  /**
   * Get the computed style. Only in styled mode.
   *
   * @param prop
   * The property name to check for.
   *
   * @return The current computed value.
   *
   */
  String getStyle(String prop);

  /**
   * Check if an element has the given class name.
   *
   * @param className
   * The class name to check for.
   *
   * @return Whether the class name is found.
   *
   */
  boolean hasClass(String className);

  /**
   * Hide the element, similar to setting the <code>visibility</code> attribute to
   * <code>hidden</code>.
   *
   * @param hideByTranslation
   * The flag to determine if element should be hidden by moving out of
   * the viewport. Used for example for dataLabels.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement hide(boolean hideByTranslation);

  /**
   * Hide the element, similar to setting the <code>visibility</code> attribute to
   * <code>hidden</code>.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement hide();

  /**
   * Initialize the SVG element. This function only exists to make the
   * initialization process overridable. It should not be called directly.
   *
   * @param renderer
   * The SVGRenderer instance to initialize to.
   *
   * @param nodeName
   * The SVG node name.
   *
   */
  void init(SVGRenderer renderer, String nodeName);

  /**
   * Invert a group, rotate and flip. This is used internally on inverted
   * charts, where the points and graphs are drawn as if not inverted, then
   * the series group elements are inverted.
   *
   * @param inverted
   * Whether to invert or not. An inverted shape can be un-inverted by
   * setting it to false.
   *
   * @return Return the SVGElement for chaining.
   *
   */
  SVGElement invert(boolean inverted);

  /**
   * Add an event listener. This is a simple setter that replaces all other
   * events of the same type, opposed to the Highcharts#addEvent function.
   *
   * @param eventType
   * The event type. If the type is <code>click</code>, Highcharts will internally
   * translate it to a <code>touchstart</code> event on touch devices, to prevent
   * the browser from waiting for a click event from firing.
   *
   * @param handler
   * The handler callback.
   *
   * @return The SVGElement for chaining.
   *
   */
  SVGElement on(String eventType, JsFunction handler);

  /**
   * Remove a class name from the element.
   *
   * @param className
   * The class name to remove.
   *
   * @return Returns the SVG element for chainability.
   *
   */
  SVGElement removeClass(RegExp className);

  /**
   * Remove a class name from the element.
   *
   * @param className
   * The class name to remove.
   *
   * @return Returns the SVG element for chainability.
   *
   */
  SVGElement removeClass(String className);

  /**
   * Set the coordinates needed to draw a consistent radial gradient across a
   * shape regardless of positioning inside the chart. Used on pie slices to
   * make all the slices have the same radial reference point.
   *
   * @param coordinates
   * The center reference. The format is <code>[centerX, centerY, diameter]</code>
   * in pixels.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement setRadialReference(double[] coordinates);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @param shadowOptions
   * The shadow options. If <code>true</code>, the default options are applied. If
   * <code>false</code>, the current shadow will be removed.
   *
   * @param group
   * The SVG group element where the shadows will be applied. The
   * default is to add it to the same parent as the current element.
   * Internally, this is ised for pie slices, where all the shadows are
   * added to an element behind all the slices.
   *
   * @param cutOff
   * Used internally for column shadows.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow(@Nullable ShadowOptionsObject shadowOptions, @Nullable SVGElement group,
      boolean cutOff);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @param shadowOptions
   * The shadow options. If <code>true</code>, the default options are applied. If
   * <code>false</code>, the current shadow will be removed.
   *
   * @param group
   * The SVG group element where the shadows will be applied. The
   * default is to add it to the same parent as the current element.
   * Internally, this is ised for pie slices, where all the shadows are
   * added to an element behind all the slices.
   *
   * @param cutOff
   * Used internally for column shadows.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow(boolean shadowOptions, @Nullable SVGElement group, boolean cutOff);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @param shadowOptions
   * The shadow options. If <code>true</code>, the default options are applied. If
   * <code>false</code>, the current shadow will be removed.
   *
   * @param group
   * The SVG group element where the shadows will be applied. The
   * default is to add it to the same parent as the current element.
   * Internally, this is ised for pie slices, where all the shadows are
   * added to an element behind all the slices.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow(@Nullable ShadowOptionsObject shadowOptions, @Nullable SVGElement group);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @param shadowOptions
   * The shadow options. If <code>true</code>, the default options are applied. If
   * <code>false</code>, the current shadow will be removed.
   *
   * @param group
   * The SVG group element where the shadows will be applied. The
   * default is to add it to the same parent as the current element.
   * Internally, this is ised for pie slices, where all the shadows are
   * added to an element behind all the slices.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow(boolean shadowOptions, @Nullable SVGElement group);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @param shadowOptions
   * The shadow options. If <code>true</code>, the default options are applied. If
   * <code>false</code>, the current shadow will be removed.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow(@Nullable ShadowOptionsObject shadowOptions);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @param shadowOptions
   * The shadow options. If <code>true</code>, the default options are applied. If
   * <code>false</code>, the current shadow will be removed.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow(boolean shadowOptions);

  /**
   * Add a shadow to the element. Must be called after the element is added to
   * the DOM. In styled mode, this method is not used, instead use <code>defs</code> and
   * filters.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement shadow();

  /**
   * Show the element after it has been hidden.
   *
   * @param inherit
   * Set the visibility attribute to <code>inherit</code> rather than <code>visible</code>.
   * The difference is that an element with <code>visibility=&quot;visible&quot;</code> will
   * be visible even if the parent is hidden.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement show(boolean inherit);

  /**
   * Show the element after it has been hidden.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement show();

  /**
   * Get the computed stroke width in pixel values. This is used extensively
   * when drawing shapes to ensure the shapes are rendered crisp and
   * positioned correctly relative to each other. Using <code>shape-rendering: crispEdges</code> leaves us less control over positioning, for example when we
   * want to stack columns next to each other, or position things
   * pixel-perfectly within the plot box.
   *
   * The common pattern when placing a shape is:
   *
   * <ul>
   * <li>
   * Create the SVGElement and add it to the DOM. In styled mode, it will
   * now receive a stroke width from the style sheet. In classic mode we will
   * add the <code>stroke-width</code> attribute.
   *
   * </li>
   * <li>
   * Read the computed <code>elem.strokeWidth()</code>.
   *
   * </li>
   * <li>
   * Place it based on the stroke width.
   *
   * </li>
   * </ul>
   * @return The stroke width in pixels. Even if the given stroke widtch (in
   * CSS or by attributes) is based on <code>em</code> or other units, the pixel
   * size is returned.
   *
   */
  double strokeWidth();

  /**
   * Bring the element to the front. Alternatively, a new zIndex can be set.
   *
   * @return Returns the SVGElement for chaining.
   *
   */
  SVGElement toFront();

  /**
   * Move an object and its children by x and y values.
   *
   * @param x
   * The x value.
   *
   * @param y
   * The y value.
   *
   */
  SVGElement translate(double x, double y);

  abstract class AttrVal extends JsEnum {
    public static final AttrVal Z_CAPITAL = JsEnum.of("Z");

    public static final AttrVal V_CAPITAL = JsEnum.of("V");

    public static final AttrVal T_CAPITAL = JsEnum.of("T");

    public static final AttrVal S_CAPITAL = JsEnum.of("S");

    public static final AttrVal Q_CAPITAL = JsEnum.of("Q");

    public static final AttrVal M_CAPITAL = JsEnum.of("M");

    public static final AttrVal L_CAPITAL = JsEnum.of("L");

    public static final AttrVal H_CAPITAL = JsEnum.of("H");

    public static final AttrVal C_CAPITAL = JsEnum.of("C");

    public static final AttrVal A_CAPITAL = JsEnum.of("A");

    public static final AttrVal Z = JsEnum.of("z");

    public static final AttrVal V = JsEnum.of("v");

    public static final AttrVal T = JsEnum.of("t");

    public static final AttrVal S = JsEnum.of("s");

    public static final AttrVal Q = JsEnum.of("q");

    public static final AttrVal M = JsEnum.of("m");

    public static final AttrVal L = JsEnum.of("l");

    public static final AttrVal H = JsEnum.of("h");

    public static final AttrVal C = JsEnum.of("c");

    public static final AttrVal A = JsEnum.of("a");
  }
}
