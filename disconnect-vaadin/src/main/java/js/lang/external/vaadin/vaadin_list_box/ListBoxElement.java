package js.lang.external.vaadin.vaadin_list_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_list_mixin.MultiSelectListMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-list-box&gt;</code> is a Web Component for creating menus.
 *
 * <pre><code>  &lt;vaadin-list-box selected=&quot;2&quot;&gt;
 *     &lt;vaadin-item&gt;Item 1&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 2&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 3&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 4&lt;/vaadin-item&gt;
 *   &lt;/vaadin-list-box&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>items</code></td><td>The items container</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-list-box",
    version = "^1.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-list-box/src/vaadin-list-box.js"
)
public interface ListBoxElement extends PolymerElement, ThemableMixin, MultiSelectListMixin, ElementMixin {
  @JSProperty("focused")
  @Nullable
  Element getFocused();

  @JSProperty("focused")
  void setFocused(@Nullable Element value);

  void ready();
}
