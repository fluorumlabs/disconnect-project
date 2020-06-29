package js.lang.external.vaadin.vaadin_button;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.polymer.mixins.GestureEventListeners;
import js.lang.external.vaadin.vaadin_control_state_mixin.ControlStateMixin;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-button&gt;</code> is a Web Component providing an accessible and customizable button.
 *
 * <pre><code class="language-html">&lt;vaadin-button&gt;
 * &lt;/vaadin-button&gt;
 * </code></pre>
 * <pre><code class="language-js">document.querySelector('vaadin-button').addEventListener('click', () =&gt; alert('Hello World!'));
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>label</code></td><td>The label (text) inside the button</td></tr>
 * <tr><td><code>prefix</code></td><td>A slot for e.g. an icon before the label</td></tr>
 * <tr><td><code>suffix</code></td><td>A slot for e.g. an icon after the label</td></tr>
 * </tbody>
 * </table>
 * The following attributes are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>active</code></td><td>Set when the button is pressed down, either with mouse, touch or the keyboard.</td></tr>
 * <tr><td><code>disabled</code></td><td>Set when the button is disabled.</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the button is focused using the keyboard.</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the button is focused.</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-button",
    version = "^2.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-button/src/vaadin-button.js"
)
public interface ButtonElement extends GestureEventListeners, PolymerElement, ControlStateMixin, ThemableMixin, ElementMixin {
  @JSProperty("focusElement")
  @Nullable
  Element getFocusElement();

  void ready();
}
