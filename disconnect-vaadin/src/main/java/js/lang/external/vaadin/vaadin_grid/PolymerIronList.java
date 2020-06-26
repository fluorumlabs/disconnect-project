package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.iron_list.IronListElement;
import js.lang.external.polymer.iron_resizable_behavior.IronResizableBehavior;
import js.lang.external.polymer.iron_scroll_target_behavior.IronScrollTargetBehavior;
import js.lang.external.polymer.legacy.LegacyElementMixin;
import js.web.dom.HTMLElement;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/iron-list.js"
)
public interface PolymerIronList extends IronListElement, HTMLElement, LegacyElementMixin, IronScrollTargetBehavior, IronResizableBehavior {
  /**
   * Scroll to a specific index in the virtual list regardless
   * of the physical items in the DOM tree.
   *
   * @param idx - The index of the item
   *
   */
  void scrollToIndex(double idx);
}
