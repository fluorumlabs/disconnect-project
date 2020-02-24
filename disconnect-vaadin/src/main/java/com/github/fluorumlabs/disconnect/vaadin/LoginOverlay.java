package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.LoginOverlayElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasLoginMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

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
@WebComponent
public class LoginOverlay extends AbstractComponent<LoginOverlayElement>
		implements HasElementMixin<LoginOverlayElement, LoginOverlay>,
		HasLoginMixin<LoginOverlayElement, LoginOverlay>,
		HasStyle<LoginOverlayElement, LoginOverlay>, HasComponents<LoginOverlayElement, LoginOverlay, Component<?>> {
	public LoginOverlay() {
		super(LoginOverlayElement.TAGNAME());
	}

	/**
	 * Defines the application description
	 */
	@Nullable
	public String description() {
		return getNode().getDescription();
	}

	/**
	 * Defines the application description
	 */
	public LoginOverlay description(String description) {
		getNode().setDescription(description);
		return this;
	}

	/**
	 * True if the overlay is currently displayed.
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * True if the overlay is currently displayed.
	 */
	public LoginOverlay opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Defines the application title
	 */
	@Nullable
	public String title() {
		return getNode().getTitle();
	}

	/**
	 * Defines the application title
	 */
	public LoginOverlay title(String title) {
		getNode().setTitle(title);
		return this;
	}

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-overlay-wrapper element.
	 */
	@Nullable
	public String theme() {
		return getNode().getTheme();
	}

	/**
	 * Defines the theme of the element.
	 * The value is propagated to vaadin-login-overlay-wrapper element.
	 */
	public LoginOverlay theme(String theme) {
		getNode().setTheme(theme);
		return this;
	}

	/**
	 * Fired when the <code>description</code> property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> descriptionChangedEvent() {
		return createEvent("description-changed");
	}
}
