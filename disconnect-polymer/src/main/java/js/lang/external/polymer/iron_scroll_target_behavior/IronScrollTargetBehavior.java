package js.lang.external.polymer.iron_scroll_target_behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * <code>Polymer.IronScrollTargetBehavior</code> allows an element to respond to scroll
 * events from a designated scroll target.
 *
 * Elements that consume this behavior can override the <code>_scrollHandler</code>
 * method to add logic on the scroll event.
 *
 */
@NpmPackage(
    name = "@polymer/iron-scroll-target-behavior",
    version = "^3.0.1"
)
@Import(
    symbols = {"IronScrollTargetBehavior as IronScrollTargetBehavior_IronScrollTargetBehavior"},
    module = "@polymer/iron-scroll-target-behavior/iron-scroll-target-behavior.js"
)
public interface IronScrollTargetBehavior extends Any {
  /**
   * Specifies the element that will handle the scroll event
   * on the behalf of the current element. This is typically a reference to an
   * element, but there are a few more posibilities:
   *
   * <h3>Elements id</h3>
   * <pre><code class="language-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
   *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
   *    &lt;!-- Content--&gt;
   *  &lt;/x-element&gt;
   * &lt;/div&gt;
   * </code></pre>
   * In this case, the <code>scrollTarget</code> will point to the outer div element.
   *
   * <h3>Document scrolling</h3>
   * For document scrolling, you can use the reserved word <code>document</code>:
   *
   * <pre><code class="language-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
   *   &lt;!-- Content --&gt;
   * &lt;/x-element&gt;
   * </code></pre>
   * <h3>Elements reference</h3>
   * <pre><code class="language-js">appHeader.scrollTarget = document.querySelector('#scrollable-element');
   * </code></pre>
   */
  @JSProperty("scrollTarget")
  @Nullable
  HTMLElement getScrollTarget();

  /**
   * Specifies the element that will handle the scroll event
   * on the behalf of the current element. This is typically a reference to an
   * element, but there are a few more posibilities:
   *
   * <h3>Elements id</h3>
   * <pre><code class="language-html">&lt;div id=&quot;scrollable-element&quot; style=&quot;overflow: auto;&quot;&gt;
   *  &lt;x-element scroll-target=&quot;scrollable-element&quot;&gt;
   *    &lt;!-- Content--&gt;
   *  &lt;/x-element&gt;
   * &lt;/div&gt;
   * </code></pre>
   * In this case, the <code>scrollTarget</code> will point to the outer div element.
   *
   * <h3>Document scrolling</h3>
   * For document scrolling, you can use the reserved word <code>document</code>:
   *
   * <pre><code class="language-html">&lt;x-element scroll-target=&quot;document&quot;&gt;
   *   &lt;!-- Content --&gt;
   * &lt;/x-element&gt;
   * </code></pre>
   * <h3>Elements reference</h3>
   * <pre><code class="language-js">appHeader.scrollTarget = document.querySelector('#scrollable-element');
   * </code></pre>
   */
  @JSProperty("scrollTarget")
  void setScrollTarget(@Nullable HTMLElement value);

  /**
   * Enables or disables the scroll event listener.
   *
   * @param yes True to add the event, False to remove it.
   *
   */
  void toggleScrollListener(boolean yes);

  @JSBody(
      script = "return IronScrollTargetBehavior_IronScrollTargetBehavior"
  )
  static Any IronScrollTargetBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
