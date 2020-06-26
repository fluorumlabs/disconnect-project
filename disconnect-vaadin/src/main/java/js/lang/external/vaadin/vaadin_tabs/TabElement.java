package js.lang.external.vaadin.vaadin_tabs;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_item.ItemMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;

/**
 * <code>&lt;vaadin-tab&gt;</code> is a Web Component providing an accessible and customizable tab.
 *
 * <pre><code>  &lt;vaadin-tab&gt;
 *     Tab 1
 *   &lt;/vaadin-tab&gt;
 * </code></pre>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled tab</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>selected</code></td><td>Set when the tab is selected</td><td>:host</td></tr>
 * <tr><td><code>active</code></td><td>Set when mousedown or enter/spacebar pressed</td><td>:host</td></tr>
 * <tr><td><code>orientation</code></td><td>Set to <code>horizontal</code> or <code>vertical</code> depending on the direction of items</td><td>:host</td></tr>
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
    module = "@vaadin/vaadin-tabs/vaadin-tab.js"
)
public interface TabElement extends PolymerElement, ThemableMixin, ElementMixin, ItemMixin {
  void ready();
}
