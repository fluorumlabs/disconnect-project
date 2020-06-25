package js.lang.external.polymer.iron_a11y_keys_behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.EventTarget;
import js.web.dom.KeyboardEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * <code>Polymer.IronA11yKeysBehavior</code> provides a normalized interface for processing
 * keyboard commands that pertain to [WAI-ARIA best
 * practices](http: * element takes care of browser differences with respect to Keyboard events and
 * uses an expressive syntax to filter key presses.
 *
 * Use the <code>keyBindings</code> prototype property to express what combination of keys
 * will trigger the callback. A key binding has the format
 * <code>&quot;KEY+MODIFIER:EVENT&quot;: &quot;callback&quot;</code> (<code>&quot;KEY&quot;: &quot;callback&quot;</code> or
 * <code>&quot;KEY:EVENT&quot;: &quot;callback&quot;</code> are valid as well). Some examples:
 *
 * <pre><code>  keyBindings: {
 *     'space': '_onKeydown',  *        'shift+tab': '_onKeydown',
 *     'enter:keypress': '_onKeypress',
 *     'esc:keyup': '_onKeyup'
 *   }
 * </code></pre>
 * The callback will receive with an event containing the following information
 * in <code>event.detail</code>:
 *
 * <pre><code>  _onKeydown: function(event) {
 *     console.log(event.detail.combo);  *        console.log(event.detail.key);  *        console.log(event.detail.event);  *        console.log(event.detail.keyboardEvent);  *      }
 * </code></pre>
 * Use the <code>keyEventTarget</code> attribute to set up event handlers on a specific
 * node.
 *
 * See the [demo source
 * code](https: * for an example.
 *
 */
@NpmPackage(
    name = "@polymer/iron-a11y-keys-behavior",
    version = "^3.0.1"
)
@Import(
    symbols = {"IronA11yKeysBehavior as IronA11yKeysBehavior_IronA11yKeysBehavior"},
    module = "@polymer/iron-a11y-keys-behavior/iron-a11y-keys-behavior.js"
)
public interface IronA11yKeysBehavior extends Any {
  /**
   * The EventTarget that will be firing relevant KeyboardEvents. Set it to
   * <code>null</code> to disable the listeners.
   *
   */
  @JSProperty("keyEventTarget")
  @Nullable
  EventTarget getKeyEventTarget();

  /**
   * The EventTarget that will be firing relevant KeyboardEvents. Set it to
   * <code>null</code> to disable the listeners.
   *
   */
  @JSProperty("keyEventTarget")
  void setKeyEventTarget(@Nullable EventTarget value);

  /**
   * If true, this property will cause the implementing element to
   * automatically stop propagation on any handled KeyboardEvents.
   *
   */
  @JSProperty("stopKeyboardEventPropagation")
  boolean getStopKeyboardEventPropagation();

  /**
   * If true, this property will cause the implementing element to
   * automatically stop propagation on any handled KeyboardEvents.
   *
   */
  @JSProperty("stopKeyboardEventPropagation")
  void setStopKeyboardEventPropagation(boolean value);

  /**
   * To be used to express what combination of keys  will trigger the relative
   * callback. e.g. <code>keyBindings: { 'esc': '_onEscPressed'}</code>
   *
   */
  @JSProperty("keyBindings")
  Any getKeyBindings();

  /**
   * To be used to express what combination of keys  will trigger the relative
   * callback. e.g. <code>keyBindings: { 'esc': '_onEscPressed'}</code>
   *
   */
  @JSProperty("keyBindings")
  void setKeyBindings(Any value);

  void registered();

  void attached();

  void detached();

  /**
   * Can be used to imperatively add a key binding to the implementing
   * element. This is the imperative equivalent of declaring a keybinding
   * in the <code>keyBindings</code> prototype property.
   *
   */
  void addOwnKeyBinding(String eventString, String handlerName);

  /**
   * When called, will remove all imperatively-added key bindings.
   *
   */
  void removeOwnKeyBindings();

  /**
   * Returns true if a keyboard event matches <code>eventString</code>.
   *
   */
  boolean keyboardEventMatchesKeys(@Nullable KeyboardEvent event, String eventString);

  @JSBody(
      script = "return IronA11yKeysBehavior_IronA11yKeysBehavior"
  )
  static Any IronA11yKeysBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
