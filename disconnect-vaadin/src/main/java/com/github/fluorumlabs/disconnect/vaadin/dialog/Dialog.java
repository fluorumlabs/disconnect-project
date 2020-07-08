package com.github.fluorumlabs.disconnect.vaadin.dialog;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.polymer.HasTemplate;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.dialog.DialogElement;

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
@CustomElement(tagName = "vaadin-dialog", external = true)
public class Dialog extends HtmlComponent<DialogElement> implements HasTemplate, Themable<DialogElement> {

    public Dialog() {
    }

    public Dialog(String textContent) {
        makeTemplate(textContent);
    }

    public Dialog(Component<?>... components) {
        makeTemplate(components);
    }

    // !wca! get ariaLabel: string
    /**
     * Set the <code>aria-label</code> attribute for assistive technologies like
     * screen readers. An <code>undefined</code> value for this property (the
     * default) means that the <code>aria-label</code> attribute is not present at
     * all.
     */
    public String getAriaLabel() {
        return getElement().getAriaLabel();
    }

    // !wca! set ariaLabel: string
    /**
     * Set the <code>aria-label</code> attribute for assistive technologies like
     * screen readers. An <code>undefined</code> value for this property (the
     * default) means that the <code>aria-label</code> attribute is not present at
     * all.
     */
    public void setAriaLabel(String value) {
        getElement().setAriaLabel(value);
    }

    // !wca! observe ariaLabel: string

    // !wca! get draggable: boolean
    /**
     * Set to true to enable repositioning the dialog by clicking and dragging.
     *
     * By default, only the overlay area can be used to drag the element. But,
     * a child element can be marked as a draggable area by adding a
     * "<code>draggable</code>" class to it.
     */
    public boolean isDraggable() {
        return getElement().isDraggable();
    }

    // !wca! set draggable: boolean
    /**
     * Set to true to enable repositioning the dialog by clicking and dragging.
     *
     * By default, only the overlay area can be used to drag the element. But,
     * a child element can be marked as a draggable area by adding a
     * "<code>draggable</code>" class to it.
     */
    public void setDraggable(boolean value) {
        getElement().setDraggable(value);
    }

    // !wca! observe draggable: boolean

    // !wca! get modeless: boolean
    /**
     * Set to true to remove backdrop and allow click events on background elements.
     */
    public boolean isModeless() {
        return getElement().isModeless();
    }

    // !wca! set modeless: boolean
    /**
     * Set to true to remove backdrop and allow click events on background elements.
     */
    public void setModeless(boolean value) {
        getElement().setModeless(value);
    }

    // !wca! observe modeless: boolean

    // !wca! get noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    public boolean isNoCloseOnEsc() {
        return getElement().isNoCloseOnEsc();
    }

    // !wca! set noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    public void setNoCloseOnEsc(boolean value) {
        getElement().setNoCloseOnEsc(value);
    }

    // !wca! observe noCloseOnEsc: boolean

    // !wca! get noCloseOnOutsideClick: boolean
    /**
     * Set to true to disable closing dialog on outside click
     */
    public boolean isNoCloseOnOutsideClick() {
        return getElement().isNoCloseOnOutsideClick();
    }

    // !wca! set noCloseOnOutsideClick: boolean
    /**
     * Set to true to disable closing dialog on outside click
     */
    public void setNoCloseOnOutsideClick(boolean value) {
        getElement().setNoCloseOnOutsideClick(value);
    }

    // !wca! observe noCloseOnOutsideClick: boolean

    // !wca! get opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get renderer: DialogRenderer | undefined

    // !wca! set renderer: DialogRenderer | undefined
    /**
     * Custom function for rendering the content of the dialog.
     * Receives two arguments:
     *
     * - <code>root</code> The root container DOM element. Append your content to it.
     * - <code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.
     * @param value
     */
    public void setRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setRenderer(null);
            return;
        }
        getElement().setRenderer(((root, element) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe renderer: DialogRenderer | undefined

    // !wca! get resizable: boolean
    /**
     * Set to true to enable resizing the dialog by dragging the corners and edges.
     */
    public boolean isResizable() {
        return getElement().isResizable();
    }

    // !wca! set resizable: boolean
    /**
     * Set to true to enable resizing the dialog by dragging the corners and edges.
     */
    public void setResizable(boolean value) {
        getElement().setResizable(value);
    }

    // !wca! observe resizable: boolean

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
