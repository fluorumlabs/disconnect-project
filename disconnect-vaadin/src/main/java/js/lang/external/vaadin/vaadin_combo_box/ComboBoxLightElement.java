package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-combo-box-light&gt;</code> is a customizable version of the <code>&lt;vaadin-combo-box&gt;</code> providing
 * only the dropdown functionality and leaving the input field definition to the user.
 *
 * The element has the same API as <code>&lt;vaadin-combo-box&gt;</code>.
 *
 * To create a custom input field, you need to add a child element which has a two-way
 * data-bindable property representing the input value. The property name is expected
 * to be <code>value</code> by default. See the example below for a simplest possible example
 * using a <code>&lt;vaadin-text-field&gt;</code> element.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light&gt;
 *   &lt;vaadin-text-field&gt;
 *   &lt;/vaadin-text-field&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * If you are using other custom input fields like <code>&lt;iron-input&gt;</code>, you
 * need to define the name of the bindable property with the <code>attrForValue</code> attribute.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light attr-for-value=&quot;bind-value&quot;&gt;
 *   &lt;iron-input&gt;
 *     &lt;input&gt;
 *   &lt;/iron-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 * In the next example you can see how to create a custom input field based
 * on a <code>&lt;paper-input&gt;</code> decorated with a custom <code>&lt;iron-icon&gt;</code> and
 * two <code>&lt;paper-button&gt;</code>s to act as the clear and toggle controls.
 *
 * <pre><code class="language-html">&lt;vaadin-combo-box-light&gt;
 *   &lt;paper-input label=&quot;Elements&quot; class=&quot;input&quot;&gt;
 *     &lt;iron-icon icon=&quot;toll&quot; slot=&quot;prefix&quot;&gt;&lt;/iron-icon&gt;
 *     &lt;paper-button slot=&quot;suffix&quot; class=&quot;clear-button&quot;&gt;Clear&lt;/paper-button&gt;
 *     &lt;paper-button slot=&quot;suffix&quot; class=&quot;toggle-button&quot;&gt;Toggle&lt;/paper-button&gt;
 *   &lt;/paper-input&gt;
 * &lt;/vaadin-combo-box-light&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-combo-box/src/vaadin-combo-box-light.js"
)
public interface ComboBoxLightElement extends PolymerElement, ComboBoxMixin, ThemableMixin, ComboBoxDataProviderMixin {
  @JSProperty("focused")
  boolean getFocused();

  /**
   * Name of the two-way data-bindable property representing the
   * value of the custom input field.
   *
   */
  @JSProperty("attrForValue")
  String getAttrForValue();

  /**
   * Name of the two-way data-bindable property representing the
   * value of the custom input field.
   *
   */
  @JSProperty("attrForValue")
  void setAttrForValue(String value);

  @JSProperty("inputElement")
  @Nullable
  Element getInputElement();

  void ready();
}
