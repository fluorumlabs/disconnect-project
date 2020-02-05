package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-crud-edit&gt;</code> is a helper element for <code>&lt;vaadin-grid-column&gt;</code> that provides
 * an easily themable button that fires an <code>edit</code> event with the row item as detail
 * when clicked.
 * <p>
 * Typical usage is in a <code>&lt;vaadin-grid-column&gt;</code> of a custom <code>&lt;vaadin-grid&gt;</code> inside
 * a <code>&lt;vaadin-crud&gt;</code> to enable editing.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "CrudEditElement",
		module = "@vaadin/vaadin-crud/src/vaadin-crud-edit-column.js"
)
public interface CrudEditElement extends HTMLElement {
}
