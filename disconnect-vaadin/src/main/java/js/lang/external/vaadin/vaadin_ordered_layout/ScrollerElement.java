package js.lang.external.vaadin.vaadin_ordered_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-scroller&gt;</code> provides a simple way to enable scrolling when its content is overflowing.
 *
 * <pre><code>&lt;vaadin-scroller&gt;
 *   &lt;div&gt;Content&lt;/div&gt;
 * &lt;/vaadin-scroller&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-ordered-layout",
    version = "^1.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-ordered-layout/vaadin-scroller.js"
)
public interface ScrollerElement extends PolymerElement, ThemableMixin, ElementMixin {
  /**
   * This property indicates the scroll direction. Supported values are <code>vertical</code>, <code>horizontal</code>, <code>none</code>.
   * When <code>scrollDirection</code> is undefined scrollbars will be shown in both directions.
   *
   */
  @JSProperty("scrollDirection")
  ScrollerScrollDirection getScrollDirection();

  /**
   * This property indicates the scroll direction. Supported values are <code>vertical</code>, <code>horizontal</code>, <code>none</code>.
   * When <code>scrollDirection</code> is undefined scrollbars will be shown in both directions.
   *
   */
  @JSProperty("scrollDirection")
  void setScrollDirection(ScrollerScrollDirection value);
}
