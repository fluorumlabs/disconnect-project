package js.lang.external.vaadin.vaadin_dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemePropertyMixin;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-dialog&gt;</code> is a Web Component for creating customized modal dialogs. The content of the
 * dialog can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the dialog uses the content provided by using the renderer callback function.
 *
 * The renderer function provides <code>root</code>, <code>dialog</code> arguments.
 * Generate DOM content, append it to the <code>root</code> element and control the state
 * of the host element by accessing <code>dialog</code>. Before generating new content,
 * users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-dialog id=&quot;dialog&quot;&gt;&lt;/vaadin-dialog&gt;
 * </code></pre>
 * <pre><code class="language-js">const dialog = document.querySelector('#dialog');
 * dialog.renderer = function(root, dialog) {
 *   root.textContent = &quot;Sample dialog&quot;;
 * };
 * </code></pre>
 * Renderer is called on the opening of the dialog.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template.
 * Dialog finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code class="language-html">&lt;vaadin-dialog opened&gt;
 *   &lt;template&gt;
 *     Sample dialog
 *   &lt;/template&gt;
 * &lt;/vaadin-dialog&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See <a href="https://github.com/vaadin/vaadin-overlay/blob/master/src/vaadin-overlay.html"><code>&lt;vaadin-overlay&gt;</code> documentation</a>
 * for <code>&lt;vaadin-dialog-overlay&gt;</code> parts.
 *
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-dialog&gt;</code> is
 * propagated to the internal <code>&lt;vaadin-dialog-overlay&gt;</code> component.
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-dialog",
    version = "^2.5.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-dialog/vaadin-dialog.js"
)
public interface DialogElement extends PolymerElement, DialogDraggableMixin, ThemePropertyMixin, DialogResizableMixin, ElementMixin {
  /**
   * True if the overlay is currently displayed.
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * True if the overlay is currently displayed.
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

  /**
   * Set to true to disable closing dialog on outside click
   *
   */
  @JSProperty("noCloseOnOutsideClick")
  boolean getNoCloseOnOutsideClick();

  /**
   * Set to true to disable closing dialog on outside click
   *
   */
  @JSProperty("noCloseOnOutsideClick")
  void setNoCloseOnOutsideClick(boolean value);

  /**
   * Set to true to disable closing dialog on Escape press
   *
   */
  @JSProperty("noCloseOnEsc")
  boolean getNoCloseOnEsc();

  /**
   * Set to true to disable closing dialog on Escape press
   *
   */
  @JSProperty("noCloseOnEsc")
  void setNoCloseOnEsc(boolean value);

  /**
   * Set the <code>aria-label</code> attribute for assistive technologies like
   * screen readers. An <code>undefined</code> value for this property (the
   * default) means that the <code>aria-label</code> attribute is not present at
   * all.
   *
   */
  @JSProperty("ariaLabel")
  @Nullable
  String getAriaLabel();

  /**
   * Set the <code>aria-label</code> attribute for assistive technologies like
   * screen readers. An <code>undefined</code> value for this property (the
   * default) means that the <code>aria-label</code> attribute is not present at
   * all.
   *
   */
  @JSProperty("ariaLabel")
  void setAriaLabel(@Nullable String value);

  /**
   * Custom function for rendering the content of the dialog.
   * Receives two arguments:
   *
   * <ul>
   * <li><code>root</code> The root container DOM element. Append your content to it.</li>
   * <li><code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.</li>
   * </ul>
   */
  @JSProperty("renderer")
  @Nullable
  DialogRenderer getRenderer();

  /**
   * Custom function for rendering the content of the dialog.
   * Receives two arguments:
   *
   * <ul>
   * <li><code>root</code> The root container DOM element. Append your content to it.</li>
   * <li><code>dialog</code> The reference to the <code>&lt;vaadin-dialog&gt;</code> element.</li>
   * </ul>
   */
  @JSProperty("renderer")
  void setRenderer(@Nullable DialogRenderer value);

  /**
   * Set to true to remove backdrop and allow click events on background elements.
   *
   */
  @JSProperty("modeless")
  boolean getModeless();

  /**
   * Set to true to remove backdrop and allow click events on background elements.
   *
   */
  @JSProperty("modeless")
  void setModeless(boolean value);

  /**
   * Set to true to enable repositioning the dialog by clicking and dragging.
   *
   * By default, only the overlay area can be used to drag the element. But,
   * a child element can be marked as a draggable area by adding a
   * &quot;<code>draggable</code>&quot; class to it.
   *
   */
  @JSProperty("draggable")
  boolean getDraggable();

  /**
   * Set to true to enable repositioning the dialog by clicking and dragging.
   *
   * By default, only the overlay area can be used to drag the element. But,
   * a child element can be marked as a draggable area by adding a
   * &quot;<code>draggable</code>&quot; class to it.
   *
   */
  @JSProperty("draggable")
  void setDraggable(boolean draggable);

  /**
   * Set to true to enable resizing the dialog by dragging the corners and edges.
   *
   */
  @JSProperty("resizable")
  boolean getResizable();

  /**
   * Set to true to enable resizing the dialog by dragging the corners and edges.
   *
   */
  @JSProperty("resizable")
  void setResizable(boolean value);

  /**
   * Manually invoke existing renderer.
   *
   */
  void render();
}
