package js.lang.external.vaadin.vaadin_context_menu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
public interface ItemsMixin extends Any {
  /**
   * Defines a (hierarchical) menu structure for the component.
   * If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened
   * next to the parent menu on mouseover, tap or a right arrow keypress.
   *
   * The items API can't be used together with a renderer or a template!
   *
   * <h4>Example</h4>
   * <pre><code class="language-javascript">contextMenu.items = [
   *   {text: 'Menu Item 1', children:
   *     [
   *       {text: 'Menu Item 1-1', checked: true},
   *       {text: 'Menu Item 1-2'}
   *     ]
   *   },
   *   {component: 'hr'},
   *   {text: 'Menu Item 2', children:
   *     [
   *       {text: 'Menu Item 2-1'},
   *       {text: 'Menu Item 2-2', disabled: true}
   *     ]
   *   },
   *   {text: 'Menu Item 3', disabled: true}
   * ];
   * </code></pre>
   */
  @JSProperty("items")
  @Nullable
  ContextMenuItem[] getItems();

  /**
   * Defines a (hierarchical) menu structure for the component.
   * If a menu item has a non-empty <code>children</code> set, a sub-menu with the child items is opened
   * next to the parent menu on mouseover, tap or a right arrow keypress.
   *
   * The items API can't be used together with a renderer or a template!
   *
   * <h4>Example</h4>
   * <pre><code class="language-javascript">contextMenu.items = [
   *   {text: 'Menu Item 1', children:
   *     [
   *       {text: 'Menu Item 1-1', checked: true},
   *       {text: 'Menu Item 1-2'}
   *     ]
   *   },
   *   {component: 'hr'},
   *   {text: 'Menu Item 2', children:
   *     [
   *       {text: 'Menu Item 2-1'},
   *       {text: 'Menu Item 2-2', disabled: true}
   *     ]
   *   },
   *   {text: 'Menu Item 3', disabled: true}
   * ];
   * </code></pre>
   */
  @JSProperty("items")
  void setItems(ContextMenuItem... value);

  void ready();
}
