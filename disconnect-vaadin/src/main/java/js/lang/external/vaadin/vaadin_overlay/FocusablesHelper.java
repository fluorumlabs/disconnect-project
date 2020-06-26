package js.lang.external.vaadin.vaadin_overlay;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.web.dom.HTMLElement;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

/**
 * <code>Polymer.IronFocusablesHelper</code> relies on some Polymer-specific legacy API,
 * especially the <code>root</code> property which does not exist for native shadow DOM.
 * That's why we have this helper here.
 * See <a href="https://github.com/PolymerElements/iron-overlay-behavior/issues/282">https://github.com/PolymerElements/iron-overlay-behavior/issues/282</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-overlay",
    version = "^3.5.1"
)
@Import(
    symbols = {"FocusablesHelper as FocusablesHelper_FocusablesHelper"},
    module = "@vaadin/vaadin-overlay/src/vaadin-focusables-helper.js"
)
@Import(
    module = "@vaadin/vaadin-overlay/src/vaadin-focusables-helper.js"
)
public interface FocusablesHelper extends Any {
  /**
   * Returns a sorted array of tabbable nodes, including the root node.
   * It searches the tabbable nodes in the light and shadow dom of the children,
   * sorting the result by tabindex.
   *
   */
  @JSBody(
      params = {"node"},
      script = "return FocusablesHelper_FocusablesHelper.getTabbableNodes(node)"
  )
  static HTMLElement[] getTabbableNodes(Node node) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns if a element is focusable.
   *
   */
  @JSBody(
      params = {"element"},
      script = "return FocusablesHelper_FocusablesHelper.isFocusable(element)"
  )
  static boolean isFocusable(HTMLElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns if a element is tabbable. To be tabbable, a element must be
   * focusable, visible, and with a tabindex !== -1.
   *
   */
  @JSBody(
      params = {"element"},
      script = "return FocusablesHelper_FocusablesHelper.isTabbable(element)"
  )
  static boolean isTabbable(HTMLElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
