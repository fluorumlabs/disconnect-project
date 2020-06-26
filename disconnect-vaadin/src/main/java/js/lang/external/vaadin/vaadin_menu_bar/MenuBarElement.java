package js.lang.external.vaadin.vaadin_menu_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-menu-bar&gt;</code> is a Web Component providing a set of horizontally stacked buttons offering
 * the user quick access to a consistent set of commands. Each button can toggle a submenu with
 * support for additional levels of nested menus.
 *
 * To create the menu bar, first add the component to the page:
 *
 * <pre><code>&lt;vaadin-menu-bar&gt;&lt;/vaadin-menu-bar&gt;
 * </code></pre>
 * And then use <a href="#/elements/vaadin-menu-bar#property-items"><code>items</code></a> property to initialize the structure:
 *
 * <pre><code>document.querySelector('vaadin-menu-bar').items = [{text: 'File'}, {text: 'Edit'}];
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are exposed for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>container</code></td><td>The container wrapping menu bar buttons.</td></tr>
 * <tr><td><code>menu-bar-button</code></td><td>The menu bar button.</td></tr>
 * <tr><td><code>overflow-button</code></td><td>The &quot;overflow&quot; button appearing when menu bar width is not enough to fit all the buttons.</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-menu-bar",
    version = "^1.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-menu-bar/vaadin-menu-bar.js"
)
public interface MenuBarElement extends PolymerElement, InteractionsMixin, ThemableMixin, ElementMixin, ButtonsMixin {
  /**
   * Defines a hierarchical structure, where root level items represent menu bar buttons,
   * and <code>children</code> property configures a submenu with items to be opened below
   * the button on click, Enter, Space, Up and Down arrow keys.
   *
   * <h4>Example</h4>
   * <pre><code class="language-js">menubar.items = [
   *   {
   *     text: 'File',
   *     children: [
   *       {text: 'Open'}
   *       {text: 'Auto Save', checked: true},
   *     ]
   *   },
   *   {component: 'hr'},
   *   {
   *     text: 'Edit',
   *     children: [
   *       {text: 'Undo', disabled: true},
   *       {text: 'Redo'}
   *     ]
   *   },
   *   {text: 'Help'}
   * ];
   * </code></pre>
   */
  @JSProperty("items")
  MenuBarItem[] getItems();

  /**
   * Defines a hierarchical structure, where root level items represent menu bar buttons,
   * and <code>children</code> property configures a submenu with items to be opened below
   * the button on click, Enter, Space, Up and Down arrow keys.
   *
   * <h4>Example</h4>
   * <pre><code class="language-js">menubar.items = [
   *   {
   *     text: 'File',
   *     children: [
   *       {text: 'Open'}
   *       {text: 'Auto Save', checked: true},
   *     ]
   *   },
   *   {component: 'hr'},
   *   {
   *     text: 'Edit',
   *     children: [
   *       {text: 'Undo', disabled: true},
   *       {text: 'Redo'}
   *     ]
   *   },
   *   {text: 'Help'}
   * ];
   * </code></pre>
   */
  @JSProperty("items")
  void setItems(MenuBarItem[] value);

  class Builder {
    private final MenuBarElement object = Any.empty();

    public MenuBarElement build() {
      return object;
    }

    /**
     * Defines a hierarchical structure, where root level items represent menu bar buttons,
     * and <code>children</code> property configures a submenu with items to be opened below
     * the button on click, Enter, Space, Up and Down arrow keys.
     *
     * <h4>Example</h4>
     * <pre><code class="language-js">menubar.items = [
     *   {
     *     text: 'File',
     *     children: [
     *       {text: 'Open'}
     *       {text: 'Auto Save', checked: true},
     *     ]
     *   },
     *   {component: 'hr'},
     *   {
     *     text: 'Edit',
     *     children: [
     *       {text: 'Undo', disabled: true},
     *       {text: 'Redo'}
     *     ]
     *   },
     *   {text: 'Help'}
     * ];
     * </code></pre>
     */
    public Builder items(MenuBarItem[] value) {
      object.setItems(value);
      return this;
    }
  }
}
