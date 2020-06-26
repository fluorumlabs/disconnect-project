package js.lang.external.polymer.iron_fit_behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * <code>Polymer.IronFitBehavior</code> fits an element in another element using <code>max-height</code>
 * and <code>max-width</code>, and optionally centers it in the window or another element.
 *
 * The element will only be sized and/or positioned if it has not already been
 * sized and/or positioned by CSS.
 *
 * <table>
 * <thead>
 * <tr><th>CSS properties</th><th>Action</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>position</code> set</td><td>Element is not centered horizontally or vertically</td></tr>
 * <tr><td><code>top</code> or <code>bottom</code> set</td><td>Element is not vertically centered</td></tr>
 * <tr><td><code>left</code> or <code>right</code> set</td><td>Element is not horizontally centered</td></tr>
 * <tr><td><code>max-height</code> set</td><td>Element respects <code>max-height</code></td></tr>
 * <tr><td><code>max-width</code> set</td><td>Element respects <code>max-width</code></td></tr>
 * </tbody>
 * </table>
 * <code>Polymer.IronFitBehavior</code> can position an element into another element using
 * <code>verticalAlign</code> and <code>horizontalAlign</code>. This will override the element's css
 * position.
 *
 * <pre><code> &lt;div class=&quot;container&quot;&gt;
 *    &lt;iron-fit-impl vertical-align=&quot;top&quot; horizontal-align=&quot;auto&quot;&gt;
 *      Positioned into the container
 *    &lt;/iron-fit-impl&gt;
 *  &lt;/div&gt;
 * </code></pre>
 * Use <code>noOverlap</code> to position the element around another element without
 * overlapping it.
 *
 * <pre><code> &lt;div class=&quot;container&quot;&gt;
 *    &lt;iron-fit-impl no-overlap vertical-align=&quot;auto&quot; horizontal-align=&quot;auto&quot;&gt;
 *      Positioned around the container
 *    &lt;/iron-fit-impl&gt;
 *  &lt;/div&gt;
 * </code></pre>
 * Use <code>horizontalOffset, verticalOffset</code> to offset the element from its
 * <code>positionTarget</code>; <code>Polymer.IronFitBehavior</code> will collapse these in order to
 * keep the element within <code>fitInto</code> boundaries, while preserving the element's
 * CSS margin values.
 *
 * <pre><code> &lt;div class=&quot;container&quot;&gt;
 *    &lt;iron-fit-impl vertical-align=&quot;top&quot; vertical-offset=&quot;20&quot;&gt;
 *      With vertical offset
 *    &lt;/iron-fit-impl&gt;
 *  &lt;/div&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@polymer/iron-fit-behavior",
    version = "^3.0.2"
)
@Import(
    symbols = {"IronFitBehavior as IronFitBehavior_IronFitBehavior"},
    module = "@polymer/iron-fit-behavior/iron-fit-behavior.js"
)
@Import(
    module = "@polymer/iron-fit-behavior/iron-fit-behavior.js"
)
public interface IronFitBehavior extends Any {
  /**
   * The element that will receive a <code>max-height</code>/<code>width</code>. By default it is
   * the same as <code>this</code>, but it can be set to a child element. This is useful,
   * for example, for implementing a scrolling region inside the element.
   *
   */
  @JSProperty("sizingTarget")
  Element getSizingTarget();

  /**
   * The element that will receive a <code>max-height</code>/<code>width</code>. By default it is
   * the same as <code>this</code>, but it can be set to a child element. This is useful,
   * for example, for implementing a scrolling region inside the element.
   *
   */
  @JSProperty("sizingTarget")
  void setSizingTarget(Element value);

  /**
   * The element to fit <code>this</code> into.
   *
   */
  @JSProperty("fitInto")
  @Nullable
  Any getFitInto();

  /**
   * The element to fit <code>this</code> into.
   *
   */
  @JSProperty("fitInto")
  void setFitInto(@Nullable Any value);

  /**
   * Will position the element around the positionTarget without overlapping
   * it.
   *
   */
  @JSProperty("noOverlap")
  boolean getNoOverlap();

  /**
   * Will position the element around the positionTarget without overlapping
   * it.
   *
   */
  @JSProperty("noOverlap")
  void setNoOverlap(boolean value);

  /**
   * The element that should be used to position the element. If not set, it
   * will default to the parent node.
   *
   */
  @JSProperty("positionTarget")
  Element getPositionTarget();

  /**
   * The element that should be used to position the element. If not set, it
   * will default to the parent node.
   *
   */
  @JSProperty("positionTarget")
  void setPositionTarget(Element value);

  /**
   * The orientation against which to align the element horizontally
   * relative to the <code>positionTarget</code>. Possible values are &quot;left&quot;, &quot;right&quot;,
   * &quot;center&quot;, &quot;auto&quot;.
   *
   */
  @JSProperty("horizontalAlign")
  @Nullable
  String getHorizontalAlign();

  /**
   * The orientation against which to align the element horizontally
   * relative to the <code>positionTarget</code>. Possible values are &quot;left&quot;, &quot;right&quot;,
   * &quot;center&quot;, &quot;auto&quot;.
   *
   */
  @JSProperty("horizontalAlign")
  void setHorizontalAlign(@Nullable String value);

  /**
   * The orientation against which to align the element vertically
   * relative to the <code>positionTarget</code>. Possible values are &quot;top&quot;, &quot;bottom&quot;,
   * &quot;middle&quot;, &quot;auto&quot;.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  String getVerticalAlign();

  /**
   * The orientation against which to align the element vertically
   * relative to the <code>positionTarget</code>. Possible values are &quot;top&quot;, &quot;bottom&quot;,
   * &quot;middle&quot;, &quot;auto&quot;.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable String value);

  /**
   * If true, it will use <code>horizontalAlign</code> and <code>verticalAlign</code> values as
   * preferred alignment and if there's not enough space, it will pick the
   * values which minimize the cropping.
   *
   */
  @JSProperty("dynamicAlign")
  boolean getDynamicAlign();

  /**
   * If true, it will use <code>horizontalAlign</code> and <code>verticalAlign</code> values as
   * preferred alignment and if there's not enough space, it will pick the
   * values which minimize the cropping.
   *
   */
  @JSProperty("dynamicAlign")
  void setDynamicAlign(boolean value);

  /**
   * A pixel value that will be added to the position calculated for the
   * given <code>horizontalAlign</code>, in the direction of alignment. You can think
   * of it as increasing or decreasing the distance to the side of the
   * screen given by <code>horizontalAlign</code>.
   *
   * If <code>horizontalAlign</code> is &quot;left&quot; or &quot;center&quot;, this offset will increase or
   * decrease the distance to the left side of the screen: a negative offset
   * will move the dropdown to the left; a positive one, to the right.
   *
   * Conversely if <code>horizontalAlign</code> is &quot;right&quot;, this offset will increase
   * or decrease the distance to the right side of the screen: a negative
   * offset will move the dropdown to the right; a positive one, to the left.
   *
   */
  @JSProperty("horizontalOffset")
  double getHorizontalOffset();

  /**
   * A pixel value that will be added to the position calculated for the
   * given <code>horizontalAlign</code>, in the direction of alignment. You can think
   * of it as increasing or decreasing the distance to the side of the
   * screen given by <code>horizontalAlign</code>.
   *
   * If <code>horizontalAlign</code> is &quot;left&quot; or &quot;center&quot;, this offset will increase or
   * decrease the distance to the left side of the screen: a negative offset
   * will move the dropdown to the left; a positive one, to the right.
   *
   * Conversely if <code>horizontalAlign</code> is &quot;right&quot;, this offset will increase
   * or decrease the distance to the right side of the screen: a negative
   * offset will move the dropdown to the right; a positive one, to the left.
   *
   */
  @JSProperty("horizontalOffset")
  void setHorizontalOffset(double value);

  /**
   * A pixel value that will be added to the position calculated for the
   * given <code>verticalAlign</code>, in the direction of alignment. You can think
   * of it as increasing or decreasing the distance to the side of the
   * screen given by <code>verticalAlign</code>.
   *
   * If <code>verticalAlign</code> is &quot;top&quot; or &quot;middle&quot;, this offset will increase or
   * decrease the distance to the top side of the screen: a negative offset
   * will move the dropdown upwards; a positive one, downwards.
   *
   * Conversely if <code>verticalAlign</code> is &quot;bottom&quot;, this offset will increase
   * or decrease the distance to the bottom side of the screen: a negative
   * offset will move the dropdown downwards; a positive one, upwards.
   *
   */
  @JSProperty("verticalOffset")
  double getVerticalOffset();

  /**
   * A pixel value that will be added to the position calculated for the
   * given <code>verticalAlign</code>, in the direction of alignment. You can think
   * of it as increasing or decreasing the distance to the side of the
   * screen given by <code>verticalAlign</code>.
   *
   * If <code>verticalAlign</code> is &quot;top&quot; or &quot;middle&quot;, this offset will increase or
   * decrease the distance to the top side of the screen: a negative offset
   * will move the dropdown upwards; a positive one, downwards.
   *
   * Conversely if <code>verticalAlign</code> is &quot;bottom&quot;, this offset will increase
   * or decrease the distance to the bottom side of the screen: a negative
   * offset will move the dropdown downwards; a positive one, upwards.
   *
   */
  @JSProperty("verticalOffset")
  void setVerticalOffset(double value);

  /**
   * Set to true to auto-fit on attach.
   *
   */
  @JSProperty("autoFitOnAttach")
  boolean getAutoFitOnAttach();

  /**
   * Set to true to auto-fit on attach.
   *
   */
  @JSProperty("autoFitOnAttach")
  void setAutoFitOnAttach(boolean value);

  /**
   * The horizontal align value, accounting for the RTL/LTR text direction.
   *
   */
  void attached();

  void detached();

  /**
   * Positions and fits the element into the <code>fitInto</code> element.
   *
   */
  void fit();

  /**
   * Resets the target element's position and size constraints, and clear
   * the memoized data.
   *
   */
  void resetFit();

  /**
   * Equivalent to calling <code>resetFit()</code> and <code>fit()</code>. Useful to call this after
   * the element or the <code>fitInto</code> element has been resized, or if any of the
   * positioning properties (e.g. <code>horizontalAlign, verticalAlign</code>) is updated.
   * It preserves the scroll position of the sizingTarget.
   *
   */
  void refit();

  /**
   * Positions the element according to <code>horizontalAlign, verticalAlign</code>.
   *
   */
  void position();

  /**
   * Constrains the size of the element to <code>fitInto</code> by setting <code>max-height</code>
   * and/or <code>max-width</code>.
   *
   */
  void constrain();

  /**
   * Centers horizontally and vertically if not already positioned. This also
   * sets <code>position:fixed</code>.
   *
   */
  void center();

  @JSBody(
      script = "return IronFitBehavior_IronFitBehavior"
  )
  static Any IronFitBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
