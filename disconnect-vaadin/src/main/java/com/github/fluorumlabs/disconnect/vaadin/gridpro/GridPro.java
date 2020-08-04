package com.github.fluorumlabs.disconnect.vaadin.gridpro;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponentWithItem;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRendererWithContext;
import com.github.fluorumlabs.disconnect.vaadin.grid.ClassNameGenerator;
import com.github.fluorumlabs.disconnect.vaadin.grid.Grid;
import com.github.fluorumlabs.disconnect.vaadin.grid.ItemModel;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.Unknown;
import js.lang.external.vaadin.DataProvider;
import js.lang.external.vaadin.grid.GridDataProviderParams;
import js.lang.external.vaadin.grid.GridEventContext;
import js.lang.external.vaadin.grid.GridItemModel;
import js.lang.external.vaadin.gridpro.GridProElement;
import js.util.function.JsPredicate;
import js.web.dom.Event;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;

import static com.github.fluorumlabs.disconnect.core.utils.SerDes.*;

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
@CustomElement(tagName = "vaadin-grid-pro", external = true)
public class GridPro<T extends Serializable> extends HtmlComponentWithItem<T, GridProElement<Mirrored<T>>> implements Themable<GridProElement<Mirrored<T>>> {

    public GridPro() {
    }

    public GridPro(String textContent) {
        super(textContent);
    }

    public GridPro(Component<?>... components) {
        super(components);
    }

    public GridPro(Class<T> tClass) {
        super(tClass);
    }

    public GridPro(Class<T> tClass, String textContent) {
        super(tClass, textContent);
    }

    public GridPro(Class<T> tClass, Component<?>... components) {
        super(tClass, components);
    }

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! clearCache: (): void
    /**
     * Clears the cached pages and reloads data from dataprovider when needed.
     */
    public void clearCache() {
        getElement().clearCache();
    }

    // !wca! closeItemDetails: (item: GridItem): void
    /**
     * Close the details row of a given item.
     */
    public void closeItemDetails(T item) {
        getElement().closeItemDetails(mirror(item));
    }

    // !wca! collapseItem: (item: GridItem): void
    /**
     * Collapses the given item tree.
     */
    public void collapseItem(T item) {
        getElement().collapseItem(mirror(item));
    }

    // !wca! deselectItem: (item: GridItem): void
    /**
     * Deselects the given item if it is already selected.
     *
     * <strong>item</strong>: The item object
     */
    public void deselectItem(T item) {
        getElement().deselectItem(mirror(item));
    }

    // !wca! expandItem: (item: GridItem): void
    /**
     * Expands the given item tree.
     */
    public void expandItem(T item) {
        getElement().expandItem(mirror(item));
    }

    // !wca! filterDragAndDrop: (): void
    /**
     * Runs the <code>dragFilter</code> and <code>dropFilter</code> hooks for the visible cells.
     * If the filter depends on varying conditions, you may need to
     * call this function manually in order to update the draggability when
     * the conditions change.
     */
    public void filterDragAndDrop() {
        getElement().filterDragAndDrop();
    }

    // !wca! generateCellClassNames: (): void
    /**
     * Runs the <code>cellClassNameGenerator</code> for the visible cells.
     * If the generator depends on varying conditions, you need to
     * call this function manually in order to update the styles when
     * the conditions change.
     */
    public void generateCellClassNames() {
        getElement().generateCellClassNames();
    }

    // !wca! getEventContext: (event: Event): object | GridEventContext | null
    /**
     * Returns an object with context information about the event target:
     * - <code>item</code>: the data object corresponding to the targeted row (not specified when targeting header or footer)
     * - <code>column</code>: the column element corresponding to the targeted cell (not specified when targeting row details)
     * - <code>section</code>: whether the event targeted the body, header, footer or details of the grid
     *
     * These additional properties are included when <code>item</code> is specified:
     * - <code>index</code>: the index of the item
     * - <code>selected</code>: the selected state of the item
     * - <code>detailsOpened</code>: whether the row details are open for the item
     * - <code>expanded</code>: the expanded state of the tree toggle
     * - <code>level</code>: the tree hierarchy level
     *
     * The returned object is populated only when a grid cell, header, footer or row details is found in <code>event.composedPath()</code>.
     * This means mostly mouse and keyboard events. If such a grid part is not found in the path, an empty object is returned.
     * This may be the case eg. if the event is fired on the <code>&lt;vaadin-grid&gt;</code> element and not any deeper in the DOM, or if
     * the event targets the empty part of the grid body.
     */
    public @Nullable
    GridEventContext<Mirrored<T>> getEventContext(Event event) {
        return getElement().getEventContext(event);
    }

    // !wca! getItemId: (item: GridItem): unknown
    /**
     * Returns a value that identifies the item. Uses <code>itemIdPath</code> if available.
     * Can be customized by overriding.
     */
    public Unknown getItemId(T item) {
        return getElement().getItemId(mirror(item));
    }

    // !wca! notifyResize: (): void

    // !wca! openItemDetails: (item: GridItem): void
    /**
     * Open the details row of a given item.
     */
    public void openItemDetails(T item) {
        getElement().openItemDetails(mirror(item));
    }

    // !wca! recalculateColumnWidths: (): void
    /**
     * Updates the <code>width</code> of all columns which have <code>autoWidth</code> set to <code>true</code>.
     */
    public void recalculateColumnWidths() {
        getElement().recalculateColumnWidths();
    }

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! scrollToIndex: (index: number): void
    /**
     * Scroll to a specific row index in the virtual list. Note that the row index is
     * not always the same for any particular item. For example, sorting/filtering/expanding
     * or collapsing hierarchical items can affect the row index related to an item.
     *
     * <strong>index</strong>: Row index to scroll to
     */
    public void scrollToIndex(int index) {
        getElement().scrollToIndex(index);
    }

    // !wca! selectItem: (item: GridItem): void
    /**
     * Selects the given item.
     *
     * <strong>item</strong>: The item object
     */
    public void selectItem(T item) {
        getElement().selectItem(mirror(item));
    }

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! toggleScrollListener: (yes: boolean): void

    // !wca! get activeItem: string | { [key: string]: unknown; } | null
    /**
     * The item user has last interacted with. Turns to <code>null</code> after user deactivates
     * the item by re-interacting with the currently active item.
     */
    public @Nullable T getActiveItem() {
        return unmirror(getElement().getActiveItem(), getItemClass());
    }

    // !wca! set activeItem: string | { [key: string]: unknown; } | null
    /**
     * The item user has last interacted with. Turns to <code>null</code> after user deactivates
     * the item by re-interacting with the currently active item.
     */
    public void setActiveItem(@Nullable T value) {
        getElement().setActiveItem(mirror(value));
    }

    // !wca! observe activeItem: string | { [key: string]: unknown; } | null
    /**
     * The item user has last interacted with. Turns to <code>null</code> after user deactivates
     * the item by re-interacting with the currently active item.
     */
    public ObservableValue<T> activeItem() {
        return createObservableValue(this::getActiveItem, this::setActiveItem, "active-item-changed");
    }

    // !wca! get cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! set cellClassNameGenerator: GridCellClassNameGenerator | null | undefined
    /**
     * A function that allows generating CSS class names for grid cells
     * based on their row and column. The return value should be the generated
     * class name as a string, or multiple class names separated by whitespace
     * characters.
     *
     * Receives two arguments:
     * - <code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element (<code>undefined</code> for details-cell).
     * - <code>model</code> The object with the properties related with
     *  the rendered item, contains:
     *  - <code>model.index</code> The index of the item.
     *  - <code>model.item</code> The item.
     *  - <code>model.expanded</code> Sublevel toggle state.
     *  - <code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.
     *  - <code>model.selected</code> Selected state.
     * @param value
     */
    public void setCellClassNameGenerator(@Nullable ClassNameGenerator<T> value) {
        if (value == null) {
            getElement().setCellClassNameGenerator(null);
        } else {
            getElement().setCellClassNameGenerator(((column, model) -> {
                return value.generateClassNames(TagRegistry.recover(column), new ItemModel<>(model, getItemClass()));
            }));
        }
    }

    // !wca! observe cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! get columnReorderingAllowed: boolean
    /**
     * Set to true to allow column reordering.
     */
    public boolean isColumnReorderingAllowed() {
        return getElement().isColumnReorderingAllowed();
    }

    // !wca! set columnReorderingAllowed: boolean
    /**
     * Set to true to allow column reordering.
     */
    public void setColumnReorderingAllowed(boolean value) {
        getElement().setColumnReorderingAllowed(value);
    }

    // !wca! observe columnReorderingAllowed: boolean

    // !wca! get dataProvider: GridDataProvider | null | undefined

    // !wca! set dataProvider: GridDataProvider | null | undefined
    /**
     * Function that provides items lazily. Receives arguments <code>params</code>, <code>callback</code>
     *
     * <code>params.page</code> Requested page index
     *
     * <code>params.pageSize</code> Current page size
     *
     * <code>params.filters</code> Currently applied filters
     *
     * <code>params.sortOrders</code> Currently applied sorting orders
     *
     * <code>params.parentItem</code> When tree is used, and sublevel items
     * are requested, reference to parent item of the requested sublevel.
     * Otherwise <code>undefined</code>.
     *
     * <code>callback(items, size)</code> Callback function with arguments:
     *  - <code>items</code> Current page of items
     *  - <code>size</code> Total number of items. When tree sublevel items
     *  are requested, total number of items in the requested sublevel.
     *  Optional when tree is not used, required for tree.
     * @param value
     */
    public void setDataProvider(@Nullable DataProvider<GridDataProviderParams<Mirrored<T>>, Mirrored<T>> value) {
        getElement().setDataProvider(value);
    }

    // !wca! observe dataProvider: GridDataProvider | null | undefined

    // !wca! get detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined
    /**
     * An array containing references to items with open row details.
     */
    public @Nullable
    List<T> getDetailsOpenedItems() {
        return unmirrorList(getElement().getDetailsOpenedItems(), getItemClass());
    }

    // !wca! set detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined
    /**
     * An array containing references to items with open row details.
     */
    public void setDetailsOpenedItems(@Nullable List<T> value) {
        getElement().setDetailsOpenedItems(mirror(value).cast());
    }

    // !wca! observe detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined
    /**
     * An array containing references to items with open row details.
     */
    public ObservableValue<List<T>> detailsOpenedItems() {
        return createObservableValue(this::getDetailsOpenedItems, this::setDetailsOpenedItems, "details-opened-items-changed");
    }

    // !wca! get dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! set dragFilter: GridDragAndDropFilter | null | undefined
    /**
     * A function that filters dragging of specific grid rows. The return value should be false
     * if dragging of the row should be disabled.
     *
     * Receives one argument:
     * - <code>model</code> The object with the properties related with
     *  the rendered item, contains:
     *  - <code>model.index</code> The index of the item.
     *  - <code>model.item</code> The item.
     *  - <code>model.expanded</code> Sublevel toggle state.
     *  - <code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.
     *  - <code>model.selected</code> Selected state.
     * @param value
     */
    public void setDragFilter(@Nullable JsPredicate<GridItemModel<Mirrored<T>>> value) {
        getElement().setDragFilter(value);
    }

    // !wca! observe dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! get dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! set dropFilter: GridDragAndDropFilter | null | undefined
    /**
     * A function that filters dropping on specific grid rows. The return value should be false
     * if dropping on the row should be disabled.
     *
     * Receives one argument:
     * - <code>model</code> The object with the properties related with
     *  the rendered item, contains:
     *  - <code>model.index</code> The index of the item.
     *  - <code>model.item</code> The item.
     *  - <code>model.expanded</code> Sublevel toggle state.
     *  - <code>model.level</code> Level of the tree represented with a horizontal offset of the toggle button.
     *  - <code>model.selected</code> Selected state.
     * @param value
     */
    public void setDropFilter(@Nullable JsPredicate<GridItemModel<Mirrored<T>>> value) {
        getElement().setDropFilter(value);
    }

    // !wca! observe dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! get dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined
    /**
     * Defines the locations within the Grid row where an element can be dropped.
     *
     * Possible values are:
     * - <code>between</code>: The drop event can happen between Grid rows.
     * - <code>on-top</code>: The drop event can happen on top of Grid rows.
     * - <code>on-top-or-between</code>: The drop event can happen either on top of or between Grid rows.
     * - <code>on-grid</code>: The drop event will not happen on any specific row, it will show the drop target outline around the whole grid.
     */
    public @Nullable
    Grid.DropMode getDropMode() {
        return LowerCase.parse(Grid.DropMode.class, getElement().getDropMode());
    }

    // !wca! set dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined
    /**
     * Defines the locations within the Grid row where an element can be dropped.
     *
     * Possible values are:
     * - <code>between</code>: The drop event can happen between Grid rows.
     * - <code>on-top</code>: The drop event can happen on top of Grid rows.
     * - <code>on-top-or-between</code>: The drop event can happen either on top of or between Grid rows.
     * - <code>on-grid</code>: The drop event will not happen on any specific row, it will show the drop target outline around the whole grid.
     */
    public void setDropMode(@Nullable Grid.DropMode value) {
        getElement().setDropMode(LowerCase.of(value));
    }

    // !wca! observe dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined

    // !wca! get enterNextRow: boolean | null | undefined
    /**
     * When true, pressing Enter while in cell edit mode
     * will move focus to the editable cell in the next row
     * (Shift + Enter - same, but for previous row).
     */
    public boolean isEnterNextRow() {
        return getElement().isEnterNextRow();
    }

    // !wca! set enterNextRow: boolean | null | undefined
    /**
     * When true, pressing Enter while in cell edit mode
     * will move focus to the editable cell in the next row
     * (Shift + Enter - same, but for previous row).
     */
    public void setEnterNextRow(boolean value) {
        getElement().setEnterNextRow(value);
    }

    // !wca! observe enterNextRow: boolean | null | undefined

    // !wca! get expandedItems: GridItem[]
    /**
     * An array that contains the expanded items.
     */
    public List<T> getExpandedItems() {
        return unmirrorList(getElement().getExpandedItems(), getItemClass());
    }

    // !wca! set expandedItems: GridItem[]
    /**
     * An array that contains the expanded items.
     */
    public void setExpandedItems(List<T> value) {
        getElement().setExpandedItems(mirror(value).cast());
    }

    // !wca! observe expandedItems: GridItem[]
    /**
     * An array that contains the expanded items.
     */
    public ObservableValue<List<T>> expandedItems() {
        return createObservableValue(this::getExpandedItems, this::setExpandedItems, "expanded-items-changed");
    }

    // !wca! get heightByRows: boolean
    /**
     * If true, the grid's height is defined by its rows.
     *
     * Effectively, this disables the grid's virtual scrolling so that all the rows are rendered in the DOM at once.
     * If the grid has a large number of items, using the feature is discouraged to avoid performance issues.
     */
    public boolean isHeightByRows() {
        return getElement().isHeightByRows();
    }

    // !wca! set heightByRows: boolean
    /**
     * If true, the grid's height is defined by its rows.
     *
     * Effectively, this disables the grid's virtual scrolling so that all the rows are rendered in the DOM at once.
     * If the grid has a large number of items, using the feature is discouraged to avoid performance issues.
     */
    public void setHeightByRows(boolean value) {
        getElement().setHeightByRows(value);
    }

    // !wca! observe heightByRows: boolean

    // !wca! get itemIdPath: string | null | undefined
    /**
     * Path to an item sub-property that identifies the item.
     */
    public @Nullable String getItemIdPath() {
        return getElement().getItemIdPath();
    }

    // !wca! set itemIdPath: string | null | undefined
    /**
     * Path to an item sub-property that identifies the item.
     */
    public void setItemIdPath(@Nullable String value) {
        getElement().setItemIdPath(value);
    }

    // !wca! observe itemIdPath: string | null | undefined

    // !wca! get items: GridItem[] | null | undefined
    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    public @Nullable List<T> getItems() {
        return unmirrorList(getElement().getItems(), getItemClass());
    }

    // !wca! set items: GridItem[] | null | undefined
    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    public void setItems(@Nullable List<T> value) {
        getElement().setItems(mirror(value).cast());
    }

    // !wca! observe items: GridItem[] | null | undefined
    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    public ObservableValue<List<T>> items() {
        return createObservableValue(this::getItems, this::setItems, "items-changed");
    }

    // !wca! get loading: boolean | null | undefined
    /**
     * <code>true</code> while data is being requested from the data provider.
     */
    public boolean isLoading() {
        return getElement().isLoading();
    }

    // !wca! observe loading: boolean | null | undefined
    /**
     * <code>true</code> while data is being requested from the data provider.
     */
    public Observable<Boolean> loading() {
        return createObservable(this::isLoading, "loading-changed");
    }

    // !wca! get multiSort: boolean
    /**
     * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
     */
    public boolean isMultiSort() {
        return getElement().isMultiSort();
    }

    // !wca! set multiSort: boolean
    /**
     * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
     */
    public void setMultiSort(boolean value) {
        getElement().setMultiSort(value);
    }

    // !wca! observe multiSort: boolean

    // !wca! get pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    public int getPageSize() {
        return getElement().getPageSize();
    }

    // !wca! set pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    public void setPageSize(int value) {
        getElement().setPageSize(value);
    }

    // !wca! observe pageSize: number

    // !wca! get rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! set rowDetailsRenderer: GridRowDetailsRenderer | null | undefined
    /**
     * Custom function for rendering the content of the row details.
     * Receives three arguments:
     *
     * - <code>root</code> The row details content DOM element. Append your content to it.
     * - <code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.
     * - <code>model</code> The object with the properties related with
     *  the rendered item, contains:
     *  - <code>model.index</code> The index of the item.
     *  - <code>model.item</code> The item.
     * @param value
     */
    public void setRowDetailsRenderer(@Nullable ComponentRendererWithContext<ItemModel<T>> value) {
        if (value == null) {
            getElement().setRowDetailsRenderer(null);
            return;
        }
        getElement().setRowDetailsRenderer(((root, element, context) -> value.renderTo(new ParentNodeBackedComponentList<>(root), new ItemModel<>(context, getItemClass()))));
    }

    // !wca! observe rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! get rowsDraggable: boolean | null | undefined
    /**
     * Marks the grid's rows to be available for dragging.
     */
    public boolean isRowsDraggable() {
        return getElement().isRowsDraggable();
    }

    // !wca! set rowsDraggable: boolean | null | undefined
    /**
     * Marks the grid's rows to be available for dragging.
     */
    public void setRowsDraggable(boolean value) {
        getElement().setRowsDraggable(value);
    }

    // !wca! observe rowsDraggable: boolean | null | undefined

    // !wca! get scrollTarget: HTMLElement | null

    // !wca! set scrollTarget: HTMLElement | null

    // !wca! observe scrollTarget: HTMLElement | null

    // !wca! get selectedItems: (string | { [key: string]: unknown; } | null)[] | null
    /**
     * An array that contains the selected items.
     */
    public @Nullable List<T> getSelectedItems() {
        return unmirrorList(getElement().getSelectedItems(), getItemClass());
    }

    // !wca! set selectedItems: (string | { [key: string]: unknown; } | null)[] | null
    /**
     * An array that contains the selected items.
     */
    public void setSelectedItems(@Nullable List<T> value) {
        getElement().setSelectedItems(mirror(value).cast());
    }

    // !wca! observe selectedItems: (string | { [key: string]: unknown; } | null)[] | null
    /**
     * An array that contains the selected items.
     */
    public ObservableValue<List<T>> selectedItems() {
        return createObservableValue(this::getSelectedItems, this::setSelectedItems, "selected-items-changed");
    }

    // !wca! get singleCellEdit: boolean | null | undefined
    /**
     * When true, after moving to next or previous editable cell using
     * Tab / Shift+Tab, it will be focused without edit mode.
     *
     * When <code>enterNextRow</code> is true, pressing Enter will also
     * preserve edit mode, otherwise, it will have no effect.
     */
    public boolean isSingleCellEdit() {
        return getElement().isSingleCellEdit();
    }

    // !wca! set singleCellEdit: boolean | null | undefined
    /**
     * When true, after moving to next or previous editable cell using
     * Tab / Shift+Tab, it will be focused without edit mode.
     *
     * When <code>enterNextRow</code> is true, pressing Enter will also
     * preserve edit mode, otherwise, it will have no effect.
     */
    public void setSingleCellEdit(boolean value) {
        getElement().setSingleCellEdit(value);
    }

    // !wca! observe singleCellEdit: boolean | null | undefined

    // !wca! get size: number | null | undefined

    // !wca! set size: number | null | undefined

    // !wca! observe size: number | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
