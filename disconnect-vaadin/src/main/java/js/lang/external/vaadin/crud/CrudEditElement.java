package js.lang.external.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-crud-edit&gt;</code> is a helper element for <code>&lt;vaadin-grid-column&gt;</code> that provides an easily themable button that fires an <code>edit</code> event with the row item as detail when clicked.
 *
 * Typical usage is in a <code>&lt;vaadin-grid-column&gt;</code> of a custom <code>&lt;vaadin-grid&gt;</code> inside a <code>&lt;vaadin-crud&gt;</code> to enable editing.
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-crud", version = "^1.3.0-alpha2")
@Import(module = "@vaadin/vaadin-crud/src/vaadin-crud-edit.js")
public interface CrudEditElement extends HTMLElement {

    // !wca! get theme: string | null | undefined
}
