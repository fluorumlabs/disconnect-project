package js.lang.external.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-email-field&gt;</code> is a Web Component for email field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-email-field label="Email"&gt;
 * &lt;/vaadin-email-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See vaadin-text-field.html for the styling documentation
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-text-field", version = "^2.7.0-alpha5")
@Import(module = "@vaadin/vaadin-text-field/vaadin-email-field.js")
public interface EmailFieldElement extends TextFieldElement {

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

    // !wca! get theme: string | null | undefined

    // !wca! get title: string

    // !wca! set title: string

    // !wca! get value: string

    // !wca! set value: string
}
