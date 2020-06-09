package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.polymer.GestureRecognizer;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"prevent as Gestures_prevent", "resetMouseCanceller as Gestures_resetMouseCanceller", "deepTargetFind as Gestures_deepTargetFind", "removeListener as Gestures_removeListener", "addListener as Gestures_addListener", "register as Gestures_register", "setTouchAction as Gestures_setTouchAction"},
    module = "@polymer/polymer/lib/utils/gestures.js"
)
public interface Gestures extends Any {
  /**
   * Finds the element rendered on the screen at the provided coordinates.
   *
   * Similar to <code>document.elementFromPoint</code>, but pierces through
   * shadow roots.
   *
   * @return Returns the deepest shadowRoot inclusive element
   * found at the screen position given.
   *
   */
  @JSBody(
      params = {"x", "y"},
      script = "return Gestures_deepTargetFind(x, y)"
  )
  @Nullable
  static Element deepTargetFind(int x, int y) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Adds an event listener to a node for the given gesture type.
   *
   * @return Returns true if a gesture event listener was added.
   *
   */
  @JSBody(
      params = {"node", "evType", "handler"},
      script = "return Gestures_addListener(node, evType, handler)"
  )
  static boolean addListener(EventTarget node, String evType, AddListenerHandler handler) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Removes an event listener from a node for the given gesture type.
   *
   * @return Returns true if a gesture event listener was removed.
   *
   */
  @JSBody(
      params = {"node", "evType", "handler"},
      script = "return Gestures_removeListener(node, evType, handler)"
  )
  static boolean removeListener(EventTarget node, String evType, RemoveListenerHandler handler) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers a new gesture event recognizer for adding new custom
   * gesture event types.
   *
   */
  @JSBody(
      params = {"recog"},
      script = "Gestures_register(recog)"
  )
  static void register(GestureRecognizer recog) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets scrolling direction on node.
   *
   * This value is checked on first move, thus it should be called prior to
   * adding event listeners.
   *
   */
  @JSBody(
      params = {"node", "value"},
      script = "Gestures_setTouchAction(node, value)"
  )
  static void setTouchAction(EventTarget node, String value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Prevents the dispatch and default action of the given event name.
   *
   */
  @JSBody(
      params = {"evName"},
      script = "Gestures_prevent(evName)"
  )
  static void prevent(String evName) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reset the 2500ms timeout on processing mouse input after detecting touch input.
   *
   * Touch inputs create synthesized mouse inputs anywhere from 0 to 2000ms after the touch.
   * This method should only be called during testing with simulated touch inputs.
   * Calling this method in production may cause duplicate taps or other Gestures.
   *
   */
  @JSBody(
      script = "Gestures_resetMouseCanceller()"
  )
  static void resetMouseCanceller() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface AddListenerHandler extends Any {
    void apply(Event p0);
  }

  @FunctionalInterface
  @JSFunctor
  interface RemoveListenerHandler extends Any {
    void apply(Event p0);
  }
}
