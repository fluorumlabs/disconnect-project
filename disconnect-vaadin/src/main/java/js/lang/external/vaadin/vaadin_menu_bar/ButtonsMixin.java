package js.lang.external.vaadin.vaadin_menu_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@vaadin/vaadin-menu-bar",
    version = "^1.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-buttons-mixin.js"
)
public interface ButtonsMixin extends Any {
  void ready();

  /**
   * Call this method after updating menu bar <code>items</code> dynamically, including changing
   * any property on the item object corresponding to one of the menu bar buttons.
   *
   */
  void render();
}
