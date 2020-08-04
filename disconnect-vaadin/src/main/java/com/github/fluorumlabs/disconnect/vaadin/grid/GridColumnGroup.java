package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import js.lang.external.vaadin.grid.GridColumnGroupElement;

import javax.annotation.Nullable;
import java.io.Serializable;

/**
 * A <code>&lt;vaadin-grid-column-group&gt;</code> is used to make groups of columns in <code>&lt;vaadin-grid&gt;</code> and to configure additional headers and footers.
 *
 * Groups can be nested to create complex header and footer configurations.
 *
 * The <code>class</code> attribute is used to differentiate header and footer templates.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column-group resizable&gt;
 *   &lt;template class="header"&gt;Name&lt;/template&gt;
 *
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class="header"&gt;First&lt;/template&gt;
 *     &lt;template&gt;[[item.name.first]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class="header"&gt;Last&lt;/template&gt;
 *     &lt;template&gt;[[item.name.last]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid-column-group&gt;
 * </code></pre>
 * <strong>Mixins:</strong> ColumnBaseMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-grid-column-group", external = true)
public class GridColumnGroup<T extends Serializable> extends HtmlComponentWithItem<T, GridColumnGroupElement<Mirrored<T>>> {

    public GridColumnGroup() {
    }

    public GridColumnGroup(String textContent) {
        super(textContent);
    }

    public GridColumnGroup(Component<?>... components) {
        super(components);
    }

    public GridColumnGroup(Class<T> tClass) {
        super(tClass);
    }

    public GridColumnGroup(Class<T> tClass, String textContent) {
        super(tClass, textContent);
    }

    public GridColumnGroup(Class<T> tClass, Component<?>... components) {
        super(tClass, components);
    }

    // !wca! get flexGrow: number
    /**
     * Flex grow ratio for the column group as the sum of the ratios of its child columns.
     */
    public double getFlexGrow() {
        return getElement().getFlexGrow();
    }

    // !wca! set flexGrow: number
    /**
     * Flex grow ratio for the column group as the sum of the ratios of its child columns.
     */
    public void setFlexGrow(double value) {
        getElement().setFlexGrow(value);
    }

    // !wca! observe flexGrow: number

    // !wca! get footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set footerRenderer: GridHeaderFooterRenderer | null | undefined
    /**
     * Custom function for rendering the footer content.
     * Receives two arguments:
     *
     * - <code>root</code> The footer cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     * @param value
     */
    public void setFooterRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setFooterRenderer(null);
            return;
        }
        getElement().setFooterRenderer(((root, element) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe footerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get frozen: boolean
    /**
     * When true, the column is frozen. When a column inside of a column group is frozen,
     * all of the sibling columns inside the group will get frozen also.
     */
    public boolean isFrozen() {
        return getElement().isFrozen();
    }

    // !wca! set frozen: boolean
    /**
     * When true, the column is frozen. When a column inside of a column group is frozen,
     * all of the sibling columns inside the group will get frozen also.
     */
    public void setFrozen(boolean value) {
        getElement().setFrozen(value);
    }

    // !wca! observe frozen: boolean

    // !wca! get header: string | null | undefined
    /**
     * Text content to display in the header cell of the column.
     */
    @Nullable
    public String getHeader() {
        return getElement().getHeader();
    }

    // !wca! set header: string | null | undefined
    /**
     * Text content to display in the header cell of the column.
     */
    public void setHeader(@Nullable String value) {
        getElement().setHeader(value);
    }

    // !wca! observe header: string | null | undefined

    // !wca! get headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! set headerRenderer: GridHeaderFooterRenderer | null | undefined
    /**
     * Custom function for rendering the header content.
     * Receives two arguments:
     *
     * - <code>root</code> The header cell content DOM element. Append your content to it.
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.
     * @param value
     */
    public void setHeaderRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setHeaderRenderer(null);
            return;
        }
        getElement().setHeaderRenderer(((root, element) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe headerRenderer: GridHeaderFooterRenderer | null | undefined

    // !wca! get hidden: boolean | null | undefined
    /**
     * When set to true, the cells for this column are hidden.
     */
    public boolean isHidden() {
        return getElement().isHidden();
    }

    // !wca! set hidden: boolean | null | undefined
    /**
     * When set to true, the cells for this column are hidden.
     */
    public void setHidden(boolean value) {
        getElement().setHidden(value);
    }

    // !wca! observe hidden: boolean | null | undefined

    // !wca! get resizable: boolean | null | undefined
    /**
     * When set to true, the column is user-resizable.
     */
    public boolean isResizable() {
        return getElement().isResizable();
    }

    // !wca! set resizable: boolean | null | undefined
    /**
     * When set to true, the column is user-resizable.
     */
    public void setResizable(boolean value) {
        getElement().setResizable(value);
    }

    // !wca! observe resizable: boolean | null | undefined

    // !wca! get textAlign: "start" | "center" | "end" | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    @Nullable
    public TextAlign getTextAlign() {
        return LowerCase.parse(TextAlign.class, getElement().getTextAlign());
    }

    // !wca! set textAlign: "start" | "center" | "end" | null | undefined
    /**
     * Aligns the columns cell content horizontally.
     * Supported values: "start", "center" and "end".
     */
    public void setTextAlign(@Nullable TextAlign value) {
        getElement().setTextAlign(LowerCase.of(value));
    }

    // !wca! observe textAlign: "start" | "center" | "end" | null | undefined

    // !wca! get width: string
    /**
     * Width of the column group as the sum of the widths of its child columns.
     */
    public String getWidth() {
        return getElement().getWidth();
    }

    // !wca! set width: string
    /**
     * Width of the column group as the sum of the widths of its child columns.
     */
    public void setWidth(String value) {
        getElement().setWidth(value);
    }

    // !wca! observe width: string
}
