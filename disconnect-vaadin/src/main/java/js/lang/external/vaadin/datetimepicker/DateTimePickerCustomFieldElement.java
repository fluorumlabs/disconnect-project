package js.lang.external.vaadin.datetimepicker;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * The custom-field element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-custom-field/blob/master/src/vaadin-custom-field.html"><code>&lt;vaadin-custom-field&gt;</code> documentation</a> for <code>&lt;vaadin-date-time-picker-custom-field&gt;</code> parts and available slots (prefix, suffix etc.)
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, CustomFieldMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-date-time-picker", version = "^1.3.0-alpha3")
@Import(module = "@vaadin/vaadin-date-time-picker/src/vaadin-date-time-picker-custom-field.js")
public interface DateTimePickerCustomFieldElement extends HTMLElement {

    // !wca! checkValidity: (): boolean

    // !wca! focus: (): void

    // !wca! validate: (): void

    // !wca! get errorMessage: string

    // !wca! set errorMessage: string

    // !wca! get i18n: CustomFieldI18n

    // !wca! set i18n: CustomFieldI18n

    // !wca! get inputs: HTMLElement[] | undefined

    // !wca! get invalid: boolean

    // !wca! set invalid: boolean

    // !wca! get label: string

    // !wca! set label: string

    // !wca! get name: string | null | undefined

    // !wca! set name: string | null | undefined

    // !wca! get required: boolean | null | undefined

    // !wca! set required: boolean | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get value: string | null | undefined

    // !wca! set value: string | null | undefined
}
