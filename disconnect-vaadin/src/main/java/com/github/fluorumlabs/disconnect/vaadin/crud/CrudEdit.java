package com.github.fluorumlabs.disconnect.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.external.vaadin.crud.CrudEditElement;

/**
 * <code>&lt;vaadin-crud-edit&gt;</code> is a helper element for <code>&lt;vaadin-grid-column&gt;</code> that provides an easily themable button that fires an <code>edit</code> event with the row item as detail when clicked.
 *
 * Typical usage is in a <code>&lt;vaadin-grid-column&gt;</code> of a custom <code>&lt;vaadin-grid&gt;</code> inside a <code>&lt;vaadin-crud&gt;</code> to enable editing.
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin
 */
class CrudEdit extends HtmlComponent<CrudEditElement> {

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

}
