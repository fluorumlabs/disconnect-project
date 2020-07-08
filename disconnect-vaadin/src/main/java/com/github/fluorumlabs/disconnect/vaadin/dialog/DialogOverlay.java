package com.github.fluorumlabs.disconnect.vaadin.dialog;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.components.html.webcomponent.Template;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.Any;
import js.lang.external.vaadin.dialog.DialogOverlayElement;
import js.web.dom.HTMLElement;
import org.checkerframework.checker.units.qual.A;

import javax.annotation.Nullable;

/**
 * The overlay element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-dialog-overlay&gt;</code> parts.
 *
 * <strong>Mixins:</strong> mixinBehaviors, ThemableMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-dialog-overlay", external = true)
public class DialogOverlay<T> extends HtmlComponent<DialogOverlayElement<Any>> implements Themable<DialogOverlayElement<Any>> {

    public DialogOverlay() {
    }

    public DialogOverlay(String textContent) {
        super(textContent);
    }

    public DialogOverlay(Component<?>... components) {
        super(components);
    }

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! bringToFront: (): void
    /**
     * Brings the overlay as visually the frontmost one
     */
    public void bringToFront() {
        getElement().bringToFront();
    }

    // !wca! close: (sourceEvent?: Event | null | undefined): void

    // !wca! notifyResize: (): void

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! get content: HTMLElement | undefined
    /**
     * References the content container after the template is stamped.
     */
    public @Nullable Component<? extends HTMLElement> getContent() {
        return TagRegistry.recover(getElement().getContent());
    }

    // !wca! set content: HTMLElement | undefined

    // !wca! observe content: HTMLElement | undefined

    // !wca! get focusTrap: boolean
    /**
     * When true move focus to the first focusable element in the overlay,
     * or to the overlay if there are no focusable elements.
     */
    public boolean isFocusTrap() {
        return getElement().isFocusTrap();
    }

    // !wca! set focusTrap: boolean
    /**
     * When true move focus to the first focusable element in the overlay,
     * or to the overlay if there are no focusable elements.
     */
    public void setFocusTrap(boolean value) {
        getElement().setFocusTrap(value);
    }

    // !wca! observe focusTrap: boolean

    // !wca! get hidden: boolean
    /**
     * When set to true, the overlay is hidden. This also closes the overlay
     * immediately in case there is a closing animation in progress.
     */
    public boolean isHidden() {
        return getElement().isHidden();
    }

    // !wca! set hidden: boolean
    /**
     * When set to true, the overlay is hidden. This also closes the overlay
     * immediately in case there is a closing animation in progress.
     */
    public void setHidden(boolean value) {
        getElement().setHidden(value);
    }

    // !wca! observe hidden: boolean

    // !wca! get instanceProps: object | null | undefined

    // !wca! set instanceProps: object | null | undefined

    // !wca! observe instanceProps: object | null | undefined

    // !wca! get model: object | null | undefined
    /**
     * Object with properties that is passed to <code>renderer</code> function
     */
    public @Nullable T getModel() {
        return DisconnectUtils.asJavaObject(getElement().getModel());
    }

    // !wca! set model: object | null | undefined
    /**
     * Object with properties that is passed to <code>renderer</code> function
     */
    public void setModel(@Nullable T value) {
        getElement().setModel(DisconnectUtils.asJsObject(value));
    }

    // !wca! observe model: object | null | undefined

    // !wca! get modeless: ?

    // !wca! set modeless: ?
    /**
     * When true the overlay won't disable the main content, showing
     * it doesnâ€™t change the functionality of the user interface.
     */
    public void setModeless(boolean value) {
        getElement().setModeless(value);
    }

    // !wca! observe modeless: ?

    // !wca! get opened: boolean | null | undefined
    /**
     * When true, the overlay is visible and attached to body.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean | null | undefined
    /**
     * When true, the overlay is visible and attached to body.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean | null | undefined
    /**
     * When true, the overlay is visible and attached to body.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get owner: HTMLElement | null
    /**
     * Owner element passed with renderer function
     */
    public @Nullable Component<? extends HTMLElement> getOwner() {
        return TagRegistry.recover(getElement().getOwner());
    }

    // !wca! set owner: HTMLElement | null
    /**
     * Owner element passed with renderer function
     */
    public void setOwner(@Nullable Component<? extends HTMLElement> value) {
        getElement().setOwner(value != null ? value.getElement(): null);
    }

    // !wca! observe owner: HTMLElement | null

    // !wca! get renderer: OverlayRenderer | null | undefined

    // !wca! set renderer: OverlayRenderer | null | undefined
    /**
     * Custom function for rendering the content of the overlay.
     * Receives three arguments:
     *
     * - <code>root</code> The root container DOM element. Append your content to it.
     * - <code>owner</code> The host element of the renderer function.
     * - <code>model</code> The object with the properties related with rendering.
     * @param value
     */
    public void setRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setRenderer(null);
            return;
        }
        getElement().setRenderer(((root, element, context) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe renderer: OverlayRenderer | null | undefined

    // !wca! get restoreFocusOnClose: boolean
    /**
     * Set to true to enable restoring of focus when overlay is closed.
     */
    public boolean isRestoreFocusOnClose() {
        return getElement().isRestoreFocusOnClose();
    }

    // !wca! set restoreFocusOnClose: boolean
    /**
     * Set to true to enable restoring of focus when overlay is closed.
     */
    public void setRestoreFocusOnClose(boolean value) {
        getElement().setRestoreFocusOnClose(value);
    }

    // !wca! observe restoreFocusOnClose: boolean

    // !wca! get template: HTMLTemplateElement | null | undefined
    /**
     * The template of the overlay content.
     */
    public @Nullable
    Template getTemplate() {
        return TagRegistry.recover(getElement().getTemplate(), Template.class);
    }

    // !wca! set template: HTMLTemplateElement | null | undefined
    /**
     * The template of the overlay content.
     */
    public void setTemplate(@Nullable Template value) {
        getElement().setTemplate(value != null ? value.getElement():null);
    }

    // !wca! observe template: HTMLTemplateElement | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get withBackdrop: ?

    // !wca! set withBackdrop: ?
    /**
     * When true the overlay has backdrop on top of content when opened.
     */
    public void setWithBackdrop(boolean value) {
        getElement().setWithBackdrop(value);
    }

    // !wca! observe withBackdrop: ?
}
