package com.github.fluorumlabs.disconnect.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import js.lang.external.vaadin.crud.CrudEditColumnElement;

/**
 * <code>&lt;vaadin-crud-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code> that provides a clickable and themable edit icon.
 *
 * Typical usage is in a custom <code>&lt;vaadin-grid&gt;</code> inside a <code>&lt;vaadin-crud&gt;</code>.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items="[[items]]"&gt;
 *   &lt;vaadin-crud-edit-column&gt;&lt;/vaadin-crud-edit-column&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     ...
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
class CrudEditColumn<T> extends HtmlComponent<CrudEditColumnElement<Mirrored<T>>> {

    // !wca! get ariaLabel: ?

    // !wca! set ariaLabel: ?

    // !wca! observe ariaLabel: ?

    // !wca! get autoWidth: boolean

    // !wca! set autoWidth: boolean

    // !wca! observe autoWidth: boolean

    // !wca! get footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! observe footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get frozen: boolean

    // !wca! set frozen: boolean

    // !wca! observe frozen: boolean

    // !wca! get header: string | null | undefined

    // !wca! set header: string | null | undefined

    // !wca! observe header: string | null | undefined

    // !wca! get headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! observe headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get hidden: boolean | null | undefined

    // !wca! set hidden: boolean | null | undefined

    // !wca! observe hidden: boolean | null | undefined

    // !wca! get path: string | null | undefined

    // !wca! set path: string | null | undefined

    // !wca! observe path: string | null | undefined

    // !wca! get renderer: GridBodyRenderer | null | undefined

    // !wca! set renderer: GridBodyRenderer | null | undefined

    // !wca! observe renderer: GridBodyRenderer | null | undefined

    // !wca! get resizable: boolean | null | undefined

    // !wca! set resizable: boolean | null | undefined

    // !wca! observe resizable: boolean | null | undefined

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined

    // !wca! observe textAlign: "start" | "center" | "end" | null | undefined
}
