package js.lang.external.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-password-field&gt;</code> is a Web Component for password field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-password-field label="Password"&gt;
 * &lt;/vaadin-password-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See vaadin-text-field.html for the styling documentation
 *
 * In addition to vaadin-text-field parts, here's the list of vaadin-password-field specific parts
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>reveal-button</code></td>
 *    <td>The eye icon which toggles the password visibility</td>
 *   </tr>
 *  </tbody>
 * </table>
 * In addition to vaadin-text-field state attributes, here's the list of vaadin-password-field specific attributes
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>password-visible</code></td>
 *    <td>Set when the password is visible</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-text-field", version = "^2.7.0-alpha5")
@Import(module = "@vaadin/vaadin-text-field/vaadin-password-field.js")
public interface PasswordFieldElement extends TextFieldElement {

    // !wca! checkValidity: (): boolean

    // !wca! clear: (): void

    // !wca! click: (): void

    // !wca! validate: (): boolean

    // !wca! get autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined

    // !wca! set autocapitalize: "on" | "off" | "none" | "characters" | "words" | "sentences" | undefined

    // !wca! get autocomplete: string | null | undefined

    // !wca! set autocomplete: string | null | undefined

    // !wca! get autocorrect: "on" | "off" | undefined

    // !wca! set autocorrect: "on" | "off" | undefined

    // !wca! get autofocus: boolean | null | undefined

    // !wca! set autofocus: boolean | null | undefined

    // !wca! get autoselect: boolean

    // !wca! set autoselect: boolean

    // !wca! get clearButtonVisible: boolean

    // !wca! set clearButtonVisible: boolean

    // !wca! get disabled: boolean | null | undefined

    // !wca! set disabled: boolean | null | undefined

    // !wca! get errorMessage: string

    // !wca! set errorMessage: string

    // !wca! get focusElement: HTMLElement | null | undefined

    // !wca! get hasValue: boolean | null | undefined

    // !wca! set hasValue: boolean | null | undefined

    // !wca! get i18n: { clear: string; }

    // !wca! set i18n: { clear: string; }

    // !wca! get inputElement: HTMLElement | null | undefined

    // !wca! get invalid: boolean

    // !wca! set invalid: boolean

    // !wca! get label: string

    // !wca! set label: string

    // !wca! get list: string | null | undefined

    // !wca! set list: string | null | undefined

    // !wca! get maxlength: number | null | undefined

    // !wca! set maxlength: number | null | undefined

    // !wca! get minlength: number | null | undefined

    // !wca! set minlength: number | null | undefined

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get passwordVisible: boolean
    /**
     * True if the password is visible ([type=text]).
     */
    @JSProperty("passwordVisible")
    boolean isPasswordVisible();

    // !wca! set passwordVisible: boolean
    /**
     * True if the password is visible ([type=text]).
     */
    @JSProperty("passwordVisible")
    void setPasswordVisible(boolean value);

    // !wca! get pattern: string | null | undefined

    // !wca! set pattern: string | null | undefined

    // !wca! get placeholder: string | null | undefined

    // !wca! set placeholder: string | null | undefined

    // !wca! get preventInvalidInput: boolean | null | undefined

    // !wca! set preventInvalidInput: boolean | null | undefined

    // !wca! get readonly: boolean | null | undefined

    // !wca! set readonly: boolean | null | undefined

    // !wca! get required: boolean | null | undefined

    // !wca! set required: boolean | null | undefined

    // !wca! get revealButtonHidden: boolean
    /**
     * Set to true to hide the eye icon which toggles the password visibility.
     */
    @JSProperty("revealButtonHidden")
    boolean isRevealButtonHidden();

    // !wca! set revealButtonHidden: boolean
    /**
     * Set to true to hide the eye icon which toggles the password visibility.
     */
    @JSProperty("revealButtonHidden")
    void setRevealButtonHidden(boolean value);

    // !wca! get theme: string | null | undefined

    // !wca! get title: string

    // !wca! set title: string

    // !wca! get value: string

    // !wca! set value: string
}
