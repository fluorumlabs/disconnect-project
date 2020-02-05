package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.LoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-login-form>` is a Web Component providing an easy way to require users
 * to log in into an application. Note that component has no shadowRoot.
 * <p>
 * ```
 * <vaadin-login-form></vaadin-login-form>
 * ```
 * <p>
 * Component has to be accessible from the `document` layer in order to allow password managers to work properly with
 * form values.
 * Using `<vaadin-login-overlay>` allows to always attach the component to the document body.
 * <p>
 * ### Styling
 * <p>
 * The component doesn't have a shadowRoot, so the html form and input fields can be styled in an upper layer. To style
 * `vaadin-login-form-wrapper` check its documentation.
 * <p>
 * See examples of setting the content into slots in the live demos.
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "LoginFormElement",
        module = "@vaadin/vaadin-login/src/vaadin-login-form.js"
)
public interface LoginFormElement extends HTMLElement, ElementMixin, ThemableMixin, LoginMixin {
    /**
     * Defines the theme of the element.
     * The value is propagated to vaadin-login-form-wrapper element.
     */
    @Nullable
    @JSProperty
    String getTheme();

    /**
     * Defines the theme of the element.
     * The value is propagated to vaadin-login-form-wrapper element.
     */
    @JSProperty
    void setTheme(String theme);

    void submit();
}
