package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;

/**
 * <code>&lt;vaadin-crud-edit&gt;</code> is a helper element for <code>&lt;vaadin-grid-column&gt;</code> that provides
 * an easily themable button that fires an <code>edit</code> event with the row item as detail
 * when clicked.
 *
 * Typical usage is in a <code>&lt;vaadin-grid-column&gt;</code> of a custom <code>&lt;vaadin-grid&gt;</code> inside
 * a <code>&lt;vaadin-crud&gt;</code> to enable editing.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/vaadin-crud-edit.js"
)
public interface CrudEditElement extends PolymerElement, ThemableMixin {
  void ready();
}
