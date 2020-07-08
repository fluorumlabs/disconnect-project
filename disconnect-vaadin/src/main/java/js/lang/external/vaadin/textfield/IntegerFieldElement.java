package js.lang.external.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-integer-field&gt;</code> is a Web Component for integer field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-integer-field label="Number"&gt;
 * &lt;/vaadin-integer-field&gt;
 * </code></pre>
 * <strong>Mixins:</strong> TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-text-field", version = "^2.7.0-alpha5")
@Import(module = "@vaadin/vaadin-text-field/vaadin-integer-field.js")
public interface IntegerFieldElement extends NumberFieldElement {

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

    // !wca! get hasControls: boolean

    // !wca! set hasControls: boolean

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

    // !wca! get max: number | null | undefined

    // !wca! set max: number | null | undefined

    // !wca! get min: number | null | undefined

    // !wca! set min: number | null | undefined

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get placeholder: string | null | undefined

    // !wca! set placeholder: string | null | undefined

    // !wca! get readonly: boolean | null | undefined

    // !wca! set readonly: boolean | null | undefined

    // !wca! get required: boolean | null | undefined

    // !wca! set required: boolean | null | undefined

    // !wca! get step: number

    // !wca! set step: number

    // !wca! get theme: string | null | undefined

    // !wca! get title: string

    // !wca! set title: string

    // !wca! get value: string

    // !wca! set value: string
}
