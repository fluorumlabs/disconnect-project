package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemePropertyMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.DialogRenderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-dialog>` is a Web Component for creating customized modal dialogs. The content of the
 * dialog can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the dialog uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `dialog` arguments.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `dialog`. Before generating new content,
 * users are able to check if there is already content in `root` for reusing it.
 * <p>
 * ```html
 * <vaadin-dialog id="dialog"></vaadin-dialog>
 * ```
 * ```js
 * const dialog = document.querySelector('#dialog');
 * dialog.renderer = function(root, dialog) {
 * root.textContent = "Sample dialog";
 * };
 * ```
 * <p>
 * Renderer is called on the opening of the dialog.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Polymer Templates
 * <p>
 * Alternatively, the content can be provided with Polymer's Template.
 * Dialog finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * ```html
 * <vaadin-dialog opened>
 * <template>
 * Sample dialog
 * </template>
 * </vaadin-dialog>
 * ```
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-overlay>` documentation](https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html)
 * for `<vaadin-dialog-overlay>` parts.
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-dialog>` is
 * propagated to the internal `<vaadin-dialog-overlay>` component.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "DialogElement",
        module = "@vaadin/vaadin-dialog/src/vaadin-dialog.js"
)
public interface DialogElement extends HTMLElement, ElementMixin, ThemePropertyMixin {
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
     * Set to true to disable closing dialog on outside click
     */
    @JSProperty
    boolean isNoCloseOnOutsideClick();

    /**
     * Set to true to disable closing dialog on outside click
     */
    @JSProperty
    void setNoCloseOnOutsideClick(boolean noCloseOnOutsideClick);

    /**
     * Set to true to disable closing dialog on Escape press
     */
    @JSProperty
    boolean isNoCloseOnEsc();

    /**
     * Set to true to disable closing dialog on Escape press
     */
    @JSProperty
    void setNoCloseOnEsc(boolean noCloseOnEsc);

    /**
     * Set the `aria-label` attribute for assistive technologies like
     * screen readers. An `undefined` value for this property (the
     * default) means that the `aria-label` attribute is not present at
     * all.
     */
    @Nullable
    @JSProperty
    String getAriaLabel();

    /**
     * Set the `aria-label` attribute for assistive technologies like
     * screen readers. An `undefined` value for this property (the
     * default) means that the `aria-label` attribute is not present at
     * all.
     */
    @JSProperty
    void setAriaLabel(String ariaLabel);

    /**
     * Theme to apply to the overlay element
     */
    @Nullable
    @JSProperty
    String getTheme();

    /**
     * Theme to apply to the overlay element
     */
    @JSProperty
    void setTheme(String theme);

    /**
     * Custom function for rendering the content of the dialog.
     * Receives two arguments:
     * <p>
     * - `root` The root container DOM element. Append your content to it.
     * - `dialog` The reference to the `<vaadin-dialog>` element.
     */
    @Nullable
    @JSProperty
    DialogRenderer getRenderer();

    /**
     * Custom function for rendering the content of the dialog.
     * Receives two arguments:
     * <p>
     * - `root` The root container DOM element. Append your content to it.
     * - `dialog` The reference to the `<vaadin-dialog>` element.
     */
    @JSProperty
    void setRenderer(DialogRenderer renderer);

    /**
     * Manually invoke existing renderer.
     */
    void render();
}
