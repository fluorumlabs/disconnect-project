package js.lang.external.vaadin.vaadin_context_menu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.vaadin_list_box.ListBoxElement;

/**
 * The vaadin-context-menu-list-box element.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-context-menu/src/vaadin-contextmenu-items-mixin.js"
)
public interface ContextMenuListBoxElement extends ListBoxElement {
  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ContextMenuListBoxElement object = Any.empty();

    private Builder() {
    }

    public ContextMenuListBoxElement build() {
      return object;
    }
  }
}
