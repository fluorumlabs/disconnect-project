package js.lang.external.vaadin.dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.vaadin.Renderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-dialog&gt;</code> is a Web Component for creating customized modal dialogs. The content of the dialog can be populated in two ways: imperatively by using renderer callback function and declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the dialog uses the content provided by using the renderer callback function.
 *
 * The renderer function provides <code>root</code>, <code>dialog</code> arguments. Generate DOM content, append it to the <code>root</code> element and control the state of the host element by accessing <code>dialog</code>. Before generating new content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-dialog id="dialog"&gt;&lt;/vaadin-dialog&gt;
 * </code></pre>
 * <pre><code class="language-js">const dialog = document.querySelector('#dialog');
 * dialog.renderer = function(root, dialog) {
 *    root.textContent = "Sample dialog";
 * };
 * </code></pre>
 * Renderer is called on the opening of the dialog. DOM generated during the renderer call can be reused in the next renderer call and will be provided with the <code>root</code> argument. On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template. Dialog finds the first child template and uses that in case renderer callback function is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-dialog opened&gt;
 *    &lt;template&gt;
 *      Sample dialog
 *    &lt;/template&gt;
 * &lt;/vaadin-dialog&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a> for <code>&lt;vaadin-dialog-overlay&gt;</code> parts.
 *
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-dialog&gt;</code> is propagated to the internal <code>&lt;vaadin-dialog-overlay&gt;</code> component.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ThemePropertyMixin, ElementMixin, DialogDraggableMixin, DialogResizableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-dialog", version = "^2.5.0-alpha5")
@Import(module = "@vaadin/vaadin-dialog/vaadin-dialog.js")
public interface DialogElement extends HTMLElement {

    // !wca! get ariaLabel: string
    /**
     * Set the <code>aria-label</code> attribute for assistive technologies like
     * screen readers. An <code>undefined</code> value for this property (the
     * default) means that the <code>aria-label</code> attribute is not present at
     * all.
     */
    @JSProperty("ariaLabel")
    String getAriaLabel();

    // !wca! set ariaLabel: string
    /**
     * Set the <code>aria-label</code> attribute for assistive technologies like
     * screen readers. An <code>undefined</code> value for this property (the
     * default) means that the <code>aria-label</code> attribute is not present at
     * all.
     */
    @JSProperty("ariaLabel")
    void setAriaLabel(String value);

    // !wca! get draggable: boolean
    /**
     * Set to true to enable repositioning the dialog by clicking and dragging.
     *
     * By default, only the overlay area can be used to drag the element. But,
     * a child element can be marked as a draggable area by adding a
     * "<code>draggable</code>" class to it.
     */
    @JSProperty("draggable")
    boolean isDraggable();

    // !wca! set draggable: boolean
    /**
     * Set to true to enable repositioning the dialog by clicking and dragging.
     *
     * By default, only the overlay area can be used to drag the element. But,
     * a child element can be marked as a draggable area by adding a
     * "<code>draggable</code>" class to it.
     */
    @JSProperty("draggable")
    void setDraggable(boolean value);

    // !wca! get modeless: boolean
    /**
     * Set to true to remove backdrop and allow click events on background elements.
     */
    @JSProperty("modeless")
    boolean isModeless();

    // !wca! set modeless: boolean
    /**
     * Set to true to remove backdrop and allow click events on background elements.
     */
    @JSProperty("modeless")
    void setModeless(boolean value);

    // !wca! get noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    @JSProperty("noCloseOnEsc")
    boolean isNoCloseOnEsc();

    // !wca! set noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    @JSProperty("noCloseOnEsc")
    void setNoCloseOnEsc(boolean value);

    // !wca! get noCloseOnOutsideClick: boolean
    /**
     * Set to true to disable closing dialog on outside click
     */
    @JSProperty("noCloseOnOutsideClick")
    boolean isNoCloseOnOutsideClick();

    // !wca! set noCloseOnOutsideClick: boolean
    /**
     * Set to true to disable closing dialog on outside click
     */
    @JSProperty("noCloseOnOutsideClick")
    void setNoCloseOnOutsideClick(boolean value);

    // !wca! get opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get renderer: DialogRenderer | undefined

    // !wca! set renderer: DialogRenderer | undefined
    /**
     * Custom function for rendering the content of the dialog.
     * Receives two arguments:
     *
     * - <code>root</code> The root container DOM element. Append your content to it.
     * - <code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.
     */
    @JSProperty("renderer")
    void setRenderer(@Nullable Renderer<DialogElement> value);

    // !wca! get resizable: boolean
    /**
     * Set to true to enable resizing the dialog by dragging the corners and edges.
     */
    @JSProperty("resizable")
    boolean isResizable();

    // !wca! set resizable: boolean
    /**
     * Set to true to enable resizing the dialog by dragging the corners and edges.
     */
    @JSProperty("resizable")
    void setResizable(boolean value);

    // !wca! get theme: string | null | undefined
}
