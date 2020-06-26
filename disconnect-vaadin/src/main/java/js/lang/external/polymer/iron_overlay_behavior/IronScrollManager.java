package js.lang.external.polymer.iron_overlay_behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/iron-overlay-behavior",
    version = "^3.0.3"
)
@Import(
    symbols = {"_lockScrollInteractions as IronScrollManager__lockScrollInteractions", "_composedTreeContains as IronScrollManager__composedTreeContains", "_scrollInteractionHandler as IronScrollManager__scrollInteractionHandler", "_hasCachedUnlockedElement as IronScrollManager__hasCachedUnlockedElement", "elementIsScrollLocked as IronScrollManager_elementIsScrollLocked", "_getScrollInfo as IronScrollManager__getScrollInfo", "_getScrollableNodes as IronScrollManager__getScrollableNodes", "_unlockScrollInteractions as IronScrollManager__unlockScrollInteractions", "pushScrollLock as IronScrollManager_pushScrollLock", "_shouldPreventScrolling as IronScrollManager__shouldPreventScrolling", "_getScrollingNode as IronScrollManager__getScrollingNode", "removeScrollLock as IronScrollManager_removeScrollLock", "_hasCachedLockedElement as IronScrollManager__hasCachedLockedElement"},
    module = "@polymer/iron-overlay-behavior/iron-scroll-manager.js"
)
@Import(
    module = "@polymer/iron-overlay-behavior/iron-scroll-manager.js"
)
public interface IronScrollManager extends Any {
  /**
   * Returns true if the provided element is &quot;scroll locked&quot;, which is to
   * say that it cannot be scrolled via pointer or keyboard interactions.
   *
   */
  @JSBody(
      params = {"element"},
      script = "return IronScrollManager_elementIsScrollLocked(element)"
  )
  static Any elementIsScrollLocked(HTMLElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Push an element onto the current scroll lock stack. The most recently
   * pushed element and its children will be considered scrollable. All
   * other elements will not be scrollable.
   *
   * Scroll locking is implemented as a stack so that cases such as
   * dropdowns within dropdowns are handled well.
   *
   */
  @JSBody(
      params = {"element"},
      script = "IronScrollManager_pushScrollLock(element)"
  )
  static void pushScrollLock(HTMLElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Remove an element from the scroll lock stack. The element being
   * removed does not need to be the most recently pushed element. However,
   * the scroll lock constraints only change when the most recently pushed
   * element is removed.
   *
   */
  @JSBody(
      params = {"element"},
      script = "IronScrollManager_removeScrollLock(element)"
  )
  static void removeScrollLock(HTMLElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
