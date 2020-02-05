package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSProperty;

/**
 * `<vaadin-password-field>` is a Web Component for password field control in forms.
 * <p>
 * ```html
 * <vaadin-password-field label="Password">
 * </vaadin-password-field>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See vaadin-text-field.html for the styling documentation
 * <p>
 * In addition to vaadin-text-field parts, here's the list of vaadin-password-field specific parts
 * <p>
 * Part name       | Description
 * ----------------|----------------------------------------------------
 * `reveal-button` | The eye icon which toggles the password visibility
 * <p>
 * In addition to vaadin-text-field state attributes, here's the list of vaadin-password-field specific attributes
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `password-visible` | Set when the password is visible | :host
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "PasswordFieldElement",
        module = "@vaadin/vaadin-text-field/src/vaadin-password-field.js"
)
public interface PasswordFieldElement extends TextFieldElement {
    /**
     * Set to true to hide the eye icon which toggles the password visibility.
     */
    @JSProperty
    boolean isRevealButtonHidden();

    /**
     * Set to true to hide the eye icon which toggles the password visibility.
     */
    @JSProperty
    void setRevealButtonHidden(boolean revealButtonHidden);

    /**
     * True if the password is visible ([type=text]).
     */
    @JSProperty
    boolean isPasswordVisible();
}
