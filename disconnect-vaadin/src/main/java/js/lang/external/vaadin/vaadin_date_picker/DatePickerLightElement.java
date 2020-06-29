package js.lang.external.vaadin.vaadin_date_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-date-picker-light&gt;</code> is a customizable version of the <code>&lt;vaadin-date-picker&gt;</code> providing
 * only the scrollable month calendar view and leaving the input field definition to the user.
 *
 * To create a custom input field, you need to add a child element which has a two-way
 * data-bindable property representing the input value. The property name is expected
 * to be <code>bindValue</code> by default. See the example below for a simplest possible example
 * using an <code>&lt;input&gt;</code> element extended with <code>iron-input</code>.
 *
 * <pre><code class="language-html">&lt;vaadin-date-picker-light&gt;
 *   &lt;iron-input&gt;
 *     &lt;input/&gt;
 *   &lt;/iron-input&gt;
 * &lt;/vaadin-date-picker-light&gt;
 * </code></pre>
 * If you are using other custom input fields like <code>&lt;paper-input&gt;</code>, you
 * need to define the name of value property using the <code>attrForValue</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-date-picker-light attr-for-value=&quot;value&quot;&gt;
 *   &lt;paper-input label=&quot;Birthday&quot;&gt;
 *   &lt;/paper-input&gt;
 * &lt;/vaadin-date-picker-light&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th><th>Theme for Element</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>overlay-content</code></td><td>The overlay element</td><td>vaadin-date-picker-light</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 * In addition to <code>&lt;vaadin-date-picker-light&gt;</code> itself, the following
 * internal components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-date-picker-overlay&gt;</code></li>
 * <li><code>&lt;vaadin-date-picker-overlay-content&gt;</code></li>
 * <li><code>&lt;vaadin-month-calendar&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-date-picker-light&gt;</code>
 * is propagated to the internal themable components listed above.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-date-picker",
    version = "^4.3.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-date-picker/src/vaadin-date-picker-light.js"
)
public interface DatePickerLightElement extends PolymerElement, ThemableMixin, DatePickerMixin {
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
}
