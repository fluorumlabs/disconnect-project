package js.lang.external.polymer.iron_resizable_behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;

/**
 * <code>IronResizableBehavior</code> is a behavior that can be used in Polymer elements to
 * coordinate the flow of resize events between &quot;resizers&quot; (elements that
 * control the size or hidden state of their children) and &quot;resizables&quot; (elements
 * that need to be notified when they are resized or un-hidden by their parents
 * in order to take action on their new measurements).
 *
 * Elements that perform measurement should add the <code>IronResizableBehavior</code>
 * behavior to their element definition and listen for the <code>iron-resize</code> event on
 * themselves. This event will be fired when they become showing after having
 * been hidden, when they are resized explicitly by another resizable, or when
 * the window has been resized.
 *
 * Note, the <code>iron-resize</code> event is non-bubbling.
 *
 */
@NpmPackage(
    name = "@polymer/iron-resizable-behavior",
    version = "^3.0.1"
)
@Import(
    symbols = {"IronResizableBehavior as IronResizableBehavior_IronResizableBehavior"},
    module = "@polymer/iron-resizable-behavior/iron-resizable-behavior.js"
)
@Import(
    module = "@polymer/iron-resizable-behavior/iron-resizable-behavior.js"
)
public interface IronResizableBehavior extends Any {
  /**
   * True if this element is currently notifying its descendant elements of
   * resize.
   *
   */
  void created();

  void attached();

  void detached();

  /**
   * Can be called to manually notify a resizable and its descendant
   * resizables of a resize change.
   *
   */
  void notifyResize();

  /**
   * Used to assign the closest resizable ancestor to this resizable
   * if the ancestor detects a request for notifications.
   *
   */
  void assignParentResizable(Any parentResizable);

  /**
   * Used to remove a resizable descendant from the list of descendants
   * that should be notified of a resize change.
   *
   */
  void stopResizeNotificationsFor(Any target);

  /**
   * This method can be overridden to filter nested elements that should or
   * should not be notified by the current element. Return true if an element
   * should be notified, or false if it should not be notified.
   *
   * @param element A candidate descendant element that
   * implements <code>IronResizableBehavior</code>.
   * @return True if the <code>element</code> should be notified of resize.
   *
   */
  boolean resizerShouldNotify(@Nullable HTMLElement element);

  /**
   * This method can be overridden to filter nested elements that should or
   * should not be notified by the current element. Return true if an element
   * should be notified, or false if it should not be notified.
   *
   * @return True if the <code>element</code> should be notified of resize.
   *
   */
  boolean resizerShouldNotify();

  @JSBody(
      script = "return IronResizableBehavior_IronResizableBehavior"
  )
  static Any IronResizableBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
