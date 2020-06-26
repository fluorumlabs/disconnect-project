package js.lang.external.vaadin.vaadin_menu_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-menu-bar",
    version = "^1.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-menu-bar/src/vaadin-menu-bar-interactions-mixin.js"
)
public interface InteractionsMixin extends Any {
  /**
   * If true, the submenu will open on hover (mouseover) instead of click.
   *
   */
  @JSProperty("openOnHover")
  boolean getOpenOnHover();

  /**
   * If true, the submenu will open on hover (mouseover) instead of click.
   *
   */
  @JSProperty("openOnHover")
  void setOpenOnHover(boolean value);

  void ready();

  /**
   * Can be called to manually notify a resizable and its descendant
   * resizables of a resize change.
   *
   */
  void notifyResize();
}
