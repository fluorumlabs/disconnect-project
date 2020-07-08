package js.lang.external.vaadin.dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.RendererWithContext;
import js.web.dom.HTMLElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The overlay element.
 *
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-dialog-overlay&gt;</code> parts.
 *
 * <strong>Mixins:</strong> mixinBehaviors, ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-dialog", version = "^2.5.0-alpha5")
@Import(module = "@vaadin/vaadin-dialog/vaadin-dialog.js")
public interface DialogOverlayElement<T extends Any> extends HTMLElement {

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! bringToFront: (): void
    /**
     * Brings the overlay as visually the frontmost one
     */
    @JSMethod("bringToFront")
    void bringToFront();

    // !wca! close: (sourceEvent?: Event | null | undefined): void

    // !wca! notifyResize: (): void

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! get content: HTMLElement | undefined
    /**
     * References the content container after the template is stamped.
     */
    @JSProperty("content")
    @Nullable
    HTMLElement getContent();

    // !wca! set content: HTMLElement | undefined

    // !wca! get focusTrap: boolean
    /**
     * When true move focus to the first focusable element in the overlay,
     * or to the overlay if there are no focusable elements.
     */
    @JSProperty("focusTrap")
    boolean isFocusTrap();

    // !wca! set focusTrap: boolean
    /**
     * When true move focus to the first focusable element in the overlay,
     * or to the overlay if there are no focusable elements.
     */
    @JSProperty("focusTrap")
    void setFocusTrap(boolean value);

    // !wca! get hidden: boolean
    /**
     * When set to true, the overlay is hidden. This also closes the overlay
     * immediately in case there is a closing animation in progress.
     */
    @JSProperty("hidden")
    boolean isHidden();

    // !wca! set hidden: boolean
    /**
     * When set to true, the overlay is hidden. This also closes the overlay
     * immediately in case there is a closing animation in progress.
     */
    @JSProperty("hidden")
    void setHidden(boolean value);

    // !wca! get instanceProps: object | null | undefined

    // !wca! set instanceProps: object | null | undefined

    // !wca! get model: object | null | undefined
    /**
     * Object with properties that is passed to <code>renderer</code> function
     */
    @JSProperty("model")
    @Nullable
    T getModel();

    // !wca! set model: object | null | undefined
    /**
     * Object with properties that is passed to <code>renderer</code> function
     */
    @JSProperty("model")
    void setModel(@Nullable T value);

    // !wca! get modeless: ?
    /**
     * When true the overlay won't disable the main content, showing
     * it doesnâ€™t change the functionality of the user interface.
     */
    @JSProperty("modeless")
    boolean isModeless();

    // !wca! set modeless: ?
    /**
     * When true the overlay won't disable the main content, showing
     * it doesnâ€™t change the functionality of the user interface.
     */
    @JSProperty("modeless")
    void setModeless(boolean value);

    // !wca! get opened: boolean | null | undefined
    /**
     * When true, the overlay is visible and attached to body.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean | null | undefined
    /**
     * When true, the overlay is visible and attached to body.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get owner: HTMLElement | null
    /**
     * Owner element passed with renderer function
     */
    @JSProperty("owner")
    @Nullable
    HTMLElement getOwner();

    // !wca! set owner: HTMLElement | null
    /**
     * Owner element passed with renderer function
     */
    @JSProperty("owner")
    void setOwner(@Nullable HTMLElement value);

    // !wca! get renderer: OverlayRenderer | null | undefined

    // !wca! set renderer: OverlayRenderer | null | undefined
    /**
     * Custom function for rendering the content of the overlay.
     * Receives three arguments:
     *
     * - <code>root</code> The root container DOM element. Append your content to it.
     * - <code>owner</code> The host element of the renderer function.
     * - <code>model</code> The object with the properties related with rendering.
     */
    @JSProperty("renderer")
    void setRenderer(@Nullable RendererWithContext<HTMLElement, T> value);

    // !wca! get restoreFocusOnClose: boolean
    /**
     * Set to true to enable restoring of focus when overlay is closed.
     */
    @JSProperty("restoreFocusOnClose")
    boolean isRestoreFocusOnClose();

    // !wca! set restoreFocusOnClose: boolean
    /**
     * Set to true to enable restoring of focus when overlay is closed.
     */
    @JSProperty("restoreFocusOnClose")
    void setRestoreFocusOnClose(boolean value);

    // !wca! get template: HTMLTemplateElement | null | undefined
    /**
     * The template of the overlay content.
     */
    @JSProperty("template")
    @Nullable
    HTMLTemplateElement getTemplate();

    // !wca! set template: HTMLTemplateElement | null | undefined
    /**
     * The template of the overlay content.
     */
    @JSProperty("template")
    void setTemplate(@Nullable HTMLTemplateElement value);

    // !wca! get theme: string | null | undefined

    // !wca! get withBackdrop: ?
    /**
     * When true the overlay has backdrop on top of content when opened.
     */
    @JSProperty("withBackdrop")
    boolean isWithBackdrop();

    // !wca! set withBackdrop: ?
    /**
     * When true the overlay has backdrop on top of content when opened.
     */
    @JSProperty("withBackdrop")
    void setWithBackdrop(boolean value);
}
