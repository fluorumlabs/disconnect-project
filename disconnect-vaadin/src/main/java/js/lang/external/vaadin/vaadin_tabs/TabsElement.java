package js.lang.external.vaadin.vaadin_tabs;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_list_mixin.ListMixin;
import js.lang.external.vaadin.vaadin_list_mixin.ListOrientation;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-tabs&gt;</code> is a Web Component for easy switching between different views.
 *
 * <pre><code>  &lt;vaadin-tabs selected=&quot;4&quot;&gt;
 *     &lt;vaadin-tab&gt;Page 1&lt;/vaadin-tab&gt;
 *     &lt;vaadin-tab&gt;Page 2&lt;/vaadin-tab&gt;
 *     &lt;vaadin-tab&gt;Page 3&lt;/vaadin-tab&gt;
 *     &lt;vaadin-tab&gt;Page 4&lt;/vaadin-tab&gt;
 *   &lt;/vaadin-tabs&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>back-button</code></td><td>Button for moving the scroll back</td></tr>
 * <tr><td><code>tabs</code></td><td>The tabs container</td></tr>
 * <tr><td><code>forward-button</code></td><td>Button for moving the scroll forward</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>orientation</code></td><td>Tabs disposition, valid values are <code>horizontal</code> and <code>vertical</code>.</td><td>:host</td></tr>
 * <tr><td><code>overflow</code></td><td>It's set to <code>start</code>, <code>end</code>, none or both.</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-tabs",
    version = "^3.2.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-tabs/vaadin-tabs.js"
)
public interface TabsElement extends PolymerElement, ThemableMixin, ListMixin, ElementMixin {
  /**
   * The index of the selected tab.
   *
   */
  @JSProperty("selected")
  int getSelected();

  /**
   * The index of the selected tab.
   *
   */
  @JSProperty("selected")
  void setSelected(int value);

  /**
   * Set tabs disposition. Possible values are <code>horizontal|vertical</code>
   *
   */
  @JSProperty("orientation")
  ListOrientation getOrientation();

  /**
   * Set tabs disposition. Possible values are <code>horizontal|vertical</code>
   *
   */
  @JSProperty("orientation")
  void setOrientation(ListOrientation value);

  void ready();
}
