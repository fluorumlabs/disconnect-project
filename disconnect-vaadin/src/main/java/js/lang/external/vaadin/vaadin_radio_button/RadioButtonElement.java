package js.lang.external.vaadin.vaadin_radio_button;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.polymer.mixins.GestureEventListeners;
import js.lang.external.vaadin.vaadin_control_state_mixin.ControlStateMixin;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import js.web.dom.HTMLInputElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-radio-button&gt;</code> is a Web Component for radio buttons.
 *
 * <pre><code class="language-html">&lt;vaadin-radio-button value=&quot;foo&quot;&gt;Foo&lt;/vaadin-radio-button&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>radio</code></td><td>The radio button element</td></tr>
 * <tr><td><code>label</code></td><td>The label content element</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set when the radio button is disabled.</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the radio button is focused using the keyboard.</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the radio button is focused.</td><td>:host</td></tr>
 * <tr><td><code>checked</code></td><td>Set when the radio button is checked.</td><td>:host</td></tr>
 * <tr><td><code>empty</code></td><td>Set when there is no label provided.</td><td>label</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-radio-button",
    version = "^1.4.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-radio-button/vaadin-radio-button.js"
)
public interface RadioButtonElement extends GestureEventListeners, PolymerElement, ControlStateMixin, ThemableMixin, ElementMixin {
  @JSProperty("focusElement")
  HTMLInputElement getFocusElement();

  /**
   * Name of the element.
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * Name of the element.
   *
   */
  @JSProperty("name")
  void setName(@Nullable String value);

  /**
   * True if the radio button is checked.
   *
   */
  @JSProperty("checked")
  boolean getChecked();

  /**
   * True if the radio button is checked.
   *
   */
  @JSProperty("checked")
  void setChecked(boolean value);

  /**
   * The value for this element.
   *
   */
  @JSProperty("value")
  String getValue();

  /**
   * The value for this element.
   *
   */
  @JSProperty("value")
  void setValue(String value);

  void ready();

  /**
   * Toggles the radio button, so that the native <code>change</code> event
   * is dispatched. Overrides the standard <code>HTMLElement.prototype.click</code>.
   *
   */
  void click();
}
