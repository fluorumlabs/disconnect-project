package js.lang.external.vaadin.textfield;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-number-field&gt;</code> is a Web Component for number field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-number-field label="Number"&gt;
 * &lt;/vaadin-number-field&gt;
 * </code></pre>
 * <strong>Mixins:</strong> TextFieldMixin, ControlStateMixin, ThemableMixin, ElementMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-text-field", version = "^2.7.0-alpha5")
@Import(module = "@vaadin/vaadin-text-field/vaadin-number-field.js")
public interface NumberFieldElement extends TextFieldElement {

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
    /**
     * Set to true to display value increase/decrease controls.
     */
    @JSProperty("hasControls")
    boolean isHasControls();

    // !wca! set hasControls: boolean
    /**
     * Set to true to display value increase/decrease controls.
     */
    @JSProperty("hasControls")
    void setHasControls(boolean value);

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

    // !wca! get max: number
    /**
     * The maximum value of the field.
     */
    @JSProperty("max")
    double getMax();

    // !wca! set max: number
    /**
     * The maximum value of the field.
     */
    @JSProperty("max")
    void setMax(double value);

    // !wca! get maxlength: number | null | undefined

    // !wca! set maxlength: number | null | undefined

    // !wca! get min: number
    /**
     * The minimum value of the field.
     */
    @JSProperty("min")
    double getMin();

    // !wca! set min: number
    /**
     * The minimum value of the field.
     */
    @JSProperty("min")
    void setMin(double value);

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

    // !wca! get step: number
    /**
     * Specifies the allowed number intervals of the field.
     */
    @JSProperty("step")
    double getStep();

    // !wca! set step: number
    /**
     * Specifies the allowed number intervals of the field.
     */
    @JSProperty("step")
    void setStep(double value);

    // !wca! get theme: string | null | undefined

    // !wca! get title: string

    // !wca! set title: string

    // !wca! get value: string

    // !wca! set value: string
}
