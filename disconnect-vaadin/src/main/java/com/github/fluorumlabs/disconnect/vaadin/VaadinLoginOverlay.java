package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.LoginOverlayElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasLoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

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
public class VaadinLoginOverlay extends AbstractComponent<LoginOverlayElement>
        implements HasElementMixin<LoginOverlayElement, VaadinLoginOverlay>,
        HasThemableMixin<LoginOverlayElement, VaadinLoginOverlay>,
        HasLoginMixin<LoginOverlayElement, VaadinLoginOverlay>,
        HasComponents<LoginOverlayElement, VaadinLoginOverlay, Component<?>> {
    public VaadinLoginOverlay() {
        super("vaadin-login-overlay");
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
    public VaadinLoginOverlay description(String description) {
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
    public VaadinLoginOverlay opened(boolean opened) {
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
    public VaadinLoginOverlay title(String title) {
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
    public VaadinLoginOverlay theme(String theme) {
        getNode().setTheme(theme);
        return this;
    }

    /**
     * Fired when the `description` property changes.
     */
    public ObservableEvent<StringPropertyChangeEvent> descriptionChangedEvent() {
        return createEvent("description-changed");
    }
}
