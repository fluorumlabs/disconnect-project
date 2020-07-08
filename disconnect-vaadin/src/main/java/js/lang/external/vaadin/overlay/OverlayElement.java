package js.lang.external.vaadin.overlay;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.RendererWithContext;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-overlay&gt;</code> is a Web Component for creating overlays. The content of the overlay can be populated in two ways: imperatively by using renderer callback function and declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the overlay uses the content provided by using the renderer callback function.
 *
 * The renderer function provides <code>root</code>, <code>owner</code>, <code>model</code> arguments when applicable. Generate DOM content by using <code>model</code> object properties if needed, append it to the <code>root</code> element and control the state of the host element by accessing <code>owner</code>. Before generating new content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-overlay id="overlay"&gt;&lt;/vaadin-overlay&gt;
 * </code></pre>
 * <pre><code class="language-js">const overlay = document.querySelector('#overlay');
 * overlay.renderer = function(root) {
 *   root.textContent = "Overlay content";
 * };
 * </code></pre>
 * Renderer is called on the opening of the overlay and each time the related model is updated. DOM generated during the renderer call can be reused in the next renderer call and will be provided with the <code>root</code> argument. On first call it will be empty.
 *
 * <strong>NOTE:</strong> when the renderer property is defined, the <code>&lt;template&gt;</code> content is not used.
 *
 * <h3>Templating</h3>
 * Alternatively, the content can be provided with Polymer Template. Overlay finds the first child template and uses that in case renderer callback function is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * After the content from the template is stamped, the <code>content</code> property points to the content container.
 *
 * The overlay provides <code>forwardHostProp</code> when calling <code>Polymer.Templatize.templatize</code> for the template, so that the bindings from the parent scope propagate to the content. You can also pass custom <code>instanceProps</code> object using the <code>instanceProps</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-overlay&gt;
 *    &lt;template&gt;Overlay content&lt;/template&gt;
 * &lt;/vaadin-overlay&gt;
 * </code></pre>
 * <strong>NOTE:</strong> when using <code>instanceProps</code>: because of the Polymer limitation, every template can only be templatized once, so it is important to set <code>instanceProps</code> before the <code>template</code> is assigned to the overlay.
 *
 * <h3>Styling</h3>
 * To style the overlay content, use styles in the parent scope:
 *
 * <ul>
 *  <li>If the overlay is used in a component, then the component styles apply the overlay content.</li>
 *  <li>If the overlay is used in the global DOM scope, then global styles apply to the overlay content.</li>
 * </ul>
 * See examples for styling the overlay content in the live demos.
 *
 * The following Shadow DOM parts are available for styling the overlay component itself:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>backdrop</code></td>
 *    <td>Backdrop of the overlay</td>
 *   </tr>
 *   <tr>
 *    <td><code>overlay</code></td>
 *    <td>Container for position/sizing/alignment of the content</td>
 *   </tr>
 *   <tr>
 *    <td><code>content</code></td>
 *    <td>Content of the overlay</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>opening</code></td>
 *    <td>Applied just after the overlay is attached to the DOM. You can apply a CSS @keyframe animation for this state.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>closing</code></td>
 *    <td>Applied just before the overlay is detached from the DOM. You can apply a CSS @keyframe animation for this state.</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following custom CSS properties are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom CSS property</th>
 *    <th>Description</th>
 *    <th>Default value</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-overlay-viewport-bottom</code></td>
 *    <td>Bottom offset of the visible viewport area</td>
 *    <td><code>0</code> or detected offset</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ThemableMixin, DirMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-overlay", version = "^3.5.1")
@Import(module = "@vaadin/vaadin-overlay/vaadin-overlay.js")
public interface OverlayElement<T extends Any> extends HTMLElement {

    // !wca! bringToFront: (): void
    /**
     * Brings the overlay as visually the frontmost one
     */
    @JSMethod("bringToFront")
    void bringToFront();

    // !wca! close: (sourceEvent?: Event | undefined): void
    /**
     */
    @JSMethod("close")
    void close(@Nullable Event sourceEvent);

    // !wca! get content: !HTMLElement | undefined
    /**
     * References the content container after the template is stamped.
     */
    @JSProperty("content")
    @Nullable
    HTMLElement getContent();

    // !wca! set content: !HTMLElement | undefined

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

    // !wca! get instanceProps: object

    // !wca! set instanceProps: object

    // !wca! get model: object
    /**
     * Object with properties that is passed to <code>renderer</code> function
     */
    @JSProperty("model")
    T getModel();

    // !wca! set model: object
    /**
     * Object with properties that is passed to <code>renderer</code> function
     */
    @JSProperty("model")
    void setModel(T value);

    // !wca! get modeless: boolean
    /**
     * When true the overlay won't disable the main content, showing
     * it doesnâ€™t change the functionality of the user interface.
     */
    @JSProperty("modeless")
    boolean isModeless();

    // !wca! set modeless: boolean
    /**
     * When true the overlay won't disable the main content, showing
     * it doesnâ€™t change the functionality of the user interface.
     */
    @JSProperty("modeless")
    void setModeless(boolean value);

    // !wca! get opened: boolean
    /**
     * When true, the overlay is visible and attached to body.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean
    /**
     * When true, the overlay is visible and attached to body.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get owner: HTMLElement
    /**
     * Owner element passed with renderer function
     */
    @JSProperty("owner")
    HTMLElement getOwner();

    // !wca! set owner: HTMLElement
    /**
     * Owner element passed with renderer function
     */
    @JSProperty("owner")
    void setOwner(HTMLElement value);

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

    // !wca! get withBackdrop: boolean
    /**
     * When true the overlay has backdrop on top of content when opened.
     */
    @JSProperty("withBackdrop")
    boolean isWithBackdrop();

    // !wca! set withBackdrop: boolean
    /**
     * When true the overlay has backdrop on top of content when opened.
     */
    @JSProperty("withBackdrop")
    void setWithBackdrop(boolean value);
}
