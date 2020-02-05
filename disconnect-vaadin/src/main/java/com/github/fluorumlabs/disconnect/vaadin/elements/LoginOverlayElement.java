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
 * `<vaadin-login-overlay>` is a wrapper of the `<vaadin-login-form>` which opens a login form in an overlay and
 * having an additional `brand` part for application title and description. Using `<vaadin-login-overlay>` allows
 * password managers to work with login form.
 * <p>
 * ```
 * <vaadin-login-overlay opened></vaadin-login-overlay>
 * ```
 * <p>
 * ### Styling
 * <p>
 * To style the element check: [`<vaadin-login-overlay-wrapper>`](#/elements/vaadin-login-overlay-wrapper),
 * [`<vaadin-login-form-wrapper>`](#/elements/vaadin-login-form-wrapper), [`<vaadin-login-form>`]
 * (#/elements/vaadin-login-form)
 * and `<vaadin-overlay>` elements
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "LoginOverlayElement",
		module = "@vaadin/vaadin-login/src/vaadin-login-overlay.js"
)
public interface LoginOverlayElement extends HTMLElement, ElementMixin, ThemableMixin, LoginMixin {
	/**
	 * Defines the application description
	 */
	@Nullable
	@JSProperty
	String getDescription();

	/**
	 * Defines the application description
	 */
	@JSProperty
	void setDescription(String description);

	/**
	 * True if the overlay is currently displayed.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True if the overlay is currently displayed.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-overlay-wrapper element.
	 */
	@Nullable
	@JSProperty
	String getTheme();

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-overlay-wrapper element.
	 */
	@JSProperty
	void setTheme(String theme);
}
