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
 * <code>&lt;vaadin-login-overlay&gt;</code> is a wrapper of the <code>&lt;vaadin-login-form&gt;</code> which opens a
 * login form in an overlay and
 * having an additional <code>brand</code> part for application title and description. Using <code>&lt;
 * vaadin-login-overlay&gt;</code> allows
 * password managers to work with login form.
 *
 * <pre><code>&lt;vaadin-login-overlay opened&gt;&lt;/vaadin-login-overlay&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * To style the element check:
 * <a href="#/elements/vaadin-login-overlay-wrapper"><code>&lt;vaadin-login-overlay-wrapper&gt;</code></a>,
 * <a href="#/elements/vaadin-login-form-wrapper"><code>&lt;vaadin-login-form-wrapper&gt;</code></a>
 * , <a href="#/elements/vaadin-login-form"><code>&lt;vaadin-login-form&gt;</code></a>
 * and <code>&lt;vaadin-overlay&gt;</code> elements
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-login/theme/lumo/vaadin-login-overlay.js"
)
public interface LoginOverlayElement extends HTMLElement, ElementMixin, ThemableMixin, LoginMixin {
	static String TAGNAME() {
		return "vaadin-login-overlay";
	}

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
