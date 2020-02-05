package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.LoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

/**
 * `<vaadin-login-form-wrapper>` is a helper component providing a wrapper for the login form.
 * <p>
 * See the usage in `<vaadin-login-form>`.
 * <p>
 * ### Styling
 * <p>
 * The following Shadow DOM parts of the `<vaadin-login-form-wrapper>` are available for styling:
 * <p>
 * Part name      | Description
 * ---------------|---------------------------------------------------------|
 * `form`         | Container for the entire component's content
 * `form-title`   | Title of the login form
 * `error-message`| Container for error message, contains error-message-title and error-message-description parts.
 * Hidden by default.
 * `error-message-title`       | Container for error message title
 * `error-message-description` | Container for error message description
 * `error-message-description` | Container for error message description
 * `footer`  | Container additional information text from `i18n` object
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * ### Component's slots
 * <p>
 * The following slots are available for being set
 * <p>
 * Slot name | Description
 * ----------|---------------------------------------------------|
 * `form`    | Html form placeholder. See the usage in `<vaadin-login-form>`.
 * <p>
 * See examples of setting the content into slots in the live demos.
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "LoginFormWrapperElement",
        module = "@vaadin/vaadin-login/src/vaadin-login-form-wrapper.js"
)
public interface LoginFormWrapperElement extends HTMLElement, ElementMixin, ThemableMixin, LoginMixin {
}
