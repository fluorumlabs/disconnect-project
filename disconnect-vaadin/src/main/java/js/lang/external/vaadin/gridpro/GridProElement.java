package js.lang.external.vaadin.gridpro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.grid.GridElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid-pro&gt;</code> is a high quality data grid / data table Web Component with extended functionality. It extends <code>&lt;vaadin-grid&gt;</code> and adds extra features on top of the basic ones.
 *
 * See <a href="https://github.com/vaadin/vaadin-grid/blob/master/src/vaadin-grid.html"><code>&lt;vaadin-grid&gt;</code> documentation</a> for details.
 *
 * <pre><code>&lt;vaadin-grid-pro&gt;&lt;/vaadin-grid-pro&gt;
 * </code></pre>
 * <strong>Mixins:</strong> InlineEditingMixin, ThemableMixin, A11yMixin, ActiveItemMixin, ArrayDataProviderMixin, ColumnResizingMixin, DataProviderMixin, DynamicColumnsMixin, FilterMixin, RowDetailsMixin, ScrollMixin, SelectionMixin, SortMixin, KeyboardNavigationMixin, ColumnReorderingMixin, EventContextMixin, StylingMixin, DragAndDropMixin, LegacyElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-grid-pro", version = "^2.2.0-alpha3")
@Import(module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro.js")
public interface GridProElement<T extends Any> extends GridElement<T> {

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! clearCache: (): void

    // !wca! closeItemDetails: (item: GridItem): void

    // !wca! collapseItem: (item: GridItem): void

    // !wca! deselectItem: (item: GridItem): void

    // !wca! expandItem: (item: GridItem): void

    // !wca! filterDragAndDrop: (): void

    // !wca! generateCellClassNames: (): void

    // !wca! getEventContext: (event: Event): object | GridEventContext | null

    // !wca! getItemId: (item: GridItem): unknown

    // !wca! notifyResize: (): void

    // !wca! openItemDetails: (item: GridItem): void

    // !wca! recalculateColumnWidths: (): void

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! scrollToIndex: (index: number): void

    // !wca! selectItem: (item: GridItem): void

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! toggleScrollListener: (yes: boolean): void

    // !wca! get activeItem: string | { [key: string]: unknown; } | null

    // !wca! set activeItem: string | { [key: string]: unknown; } | null

    // !wca! get cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! set cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! get columnReorderingAllowed: boolean

    // !wca! set columnReorderingAllowed: boolean

    // !wca! get dataProvider: GridDataProvider | null | undefined

    // !wca! set dataProvider: GridDataProvider | null | undefined

    // !wca! get detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined

    // !wca! set detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined

    // !wca! get dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! set dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! get dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! set dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! get dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined

    // !wca! set dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined

    // !wca! get enterNextRow: boolean | null | undefined
    /**
     * When true, pressing Enter while in cell edit mode
     * will move focus to the editable cell in the next row
     * (Shift + Enter - same, but for previous row).
     */
    @JSProperty("enterNextRow")
    boolean isEnterNextRow();

    // !wca! set enterNextRow: boolean | null | undefined
    /**
     * When true, pressing Enter while in cell edit mode
     * will move focus to the editable cell in the next row
     * (Shift + Enter - same, but for previous row).
     */
    @JSProperty("enterNextRow")
    void setEnterNextRow(boolean value);

    // !wca! get expandedItems: GridItem[]

    // !wca! set expandedItems: GridItem[]

    // !wca! get heightByRows: boolean

    // !wca! set heightByRows: boolean

    // !wca! get itemIdPath: string | null | undefined

    // !wca! set itemIdPath: string | null | undefined

    // !wca! get items: GridItem[] | null | undefined

    // !wca! set items: GridItem[] | null | undefined

    // !wca! get loading: boolean | null | undefined

    // !wca! get multiSort: boolean

    // !wca! set multiSort: boolean

    // !wca! get pageSize: number

    // !wca! set pageSize: number

    // !wca! get rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! set rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! get rowsDraggable: boolean | null | undefined

    // !wca! set rowsDraggable: boolean | null | undefined

    // !wca! get scrollTarget: HTMLElement | null

    // !wca! set scrollTarget: HTMLElement | null

    // !wca! get selectedItems: (string | { [key: string]: unknown; } | null)[] | null

    // !wca! set selectedItems: (string | { [key: string]: unknown; } | null)[] | null

    // !wca! get singleCellEdit: boolean | null | undefined
    /**
     * When true, after moving to next or previous editable cell using
     * Tab / Shift+Tab, it will be focused without edit mode.
     *
     * When <code>enterNextRow</code> is true, pressing Enter will also
     * preserve edit mode, otherwise, it will have no effect.
     */
    @JSProperty("singleCellEdit")
    boolean isSingleCellEdit();

    // !wca! set singleCellEdit: boolean | null | undefined
    /**
     * When true, after moving to next or previous editable cell using
     * Tab / Shift+Tab, it will be focused without edit mode.
     *
     * When <code>enterNextRow</code> is true, pressing Enter will also
     * preserve edit mode, otherwise, it will have no effect.
     */
    @JSProperty("singleCellEdit")
    void setSingleCellEdit(boolean value);

    // !wca! get size: number | null | undefined

    // !wca! set size: number | null | undefined

    // !wca! get theme: string | null | undefined
}
