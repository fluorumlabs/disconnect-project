package com.github.fluorumlabs.disconnect.vaadin.crud;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.external.vaadin.crud.CrudGridElement;

/**
 * <code>&lt;vaadin-crud-grid&gt;</code> is a <code>&lt;vaadin-grid&gt;</code> which automatically configures all its columns based on the JSON structure of the first item received.
 *
 * You cannot manually configure columns but you can still style the grid as it's described in <code>&lt;vaadin-grid&gt;</code> <a href="https://vaadin.com/components/vaadin-grid/html-api/elements/Vaadin.GridElement">Documentation</a>
 *
 * <strong>Mixins:</strong> IncludedMixin, ThemableMixin, A11yMixin, ActiveItemMixin, ArrayDataProviderMixin, ColumnResizingMixin, DataProviderMixin, DynamicColumnsMixin, FilterMixin, RowDetailsMixin, ScrollMixin, SelectionMixin, SortMixin, KeyboardNavigationMixin, ColumnReorderingMixin, EventContextMixin, StylingMixin, DragAndDropMixin, LegacyElementMixin
 */
class CrudGrid extends HtmlComponent<CrudGridElement> {

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

    // !wca! observe activeItem: string | { [key: string]: unknown; } | null

    // !wca! get cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! set cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! observe cellClassNameGenerator: GridCellClassNameGenerator | null | undefined

    // !wca! get columnReorderingAllowed: boolean

    // !wca! set columnReorderingAllowed: boolean

    // !wca! observe columnReorderingAllowed: boolean

    // !wca! get dataProvider: GridDataProvider | null | undefined

    // !wca! set dataProvider: GridDataProvider | null | undefined

    // !wca! observe dataProvider: GridDataProvider | null | undefined

    // !wca! get detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined

    // !wca! set detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined

    // !wca! observe detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined

    // !wca! get dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! set dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! observe dragFilter: GridDragAndDropFilter | null | undefined

    // !wca! get dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! set dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! observe dropFilter: GridDragAndDropFilter | null | undefined

    // !wca! get dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined

    // !wca! set dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined

    // !wca! observe dropMode: "between" | "on-top" | "on-top-or-between" | "on-grid" | null | undefined

    // !wca! get exclude: string | RegExp | null

    // !wca! set exclude: string | RegExp | null

    // !wca! observe exclude: string | RegExp | null

    // !wca! get expandedItems: GridItem[]

    // !wca! set expandedItems: GridItem[]

    // !wca! observe expandedItems: GridItem[]

    // !wca! get heightByRows: boolean

    // !wca! set heightByRows: boolean

    // !wca! observe heightByRows: boolean

    // !wca! get include: string | string[] | undefined

    // !wca! set include: string | string[] | undefined

    // !wca! observe include: string | string[] | undefined

    // !wca! get itemIdPath: string | null | undefined

    // !wca! set itemIdPath: string | null | undefined

    // !wca! observe itemIdPath: string | null | undefined

    // !wca! get items: GridItem[] | null | undefined

    // !wca! set items: GridItem[] | null | undefined

    // !wca! observe items: GridItem[] | null | undefined

    // !wca! get loading: boolean | null | undefined

    // !wca! observe loading: boolean | null | undefined

    // !wca! get multiSort: boolean

    // !wca! set multiSort: boolean

    // !wca! observe multiSort: boolean

    // !wca! get noFilter: ?

    // !wca! set noFilter: ?

    // !wca! observe noFilter: ?

    // !wca! get noHead: ?

    // !wca! set noHead: ?

    // !wca! observe noHead: ?

    // !wca! get noSort: ?

    // !wca! set noSort: ?

    // !wca! observe noSort: ?

    // !wca! get pageSize: number

    // !wca! set pageSize: number

    // !wca! observe pageSize: number

    // !wca! get rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! set rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! observe rowDetailsRenderer: GridRowDetailsRenderer | null | undefined

    // !wca! get rowsDraggable: boolean | null | undefined

    // !wca! set rowsDraggable: boolean | null | undefined

    // !wca! observe rowsDraggable: boolean | null | undefined

    // !wca! get scrollTarget: HTMLElement | null

    // !wca! set scrollTarget: HTMLElement | null

    // !wca! observe scrollTarget: HTMLElement | null

    // !wca! get selectedItems: (string | { [key: string]: unknown; } | null)[] | null

    // !wca! set selectedItems: (string | { [key: string]: unknown; } | null)[] | null

    // !wca! observe selectedItems: (string | { [key: string]: unknown; } | null)[] | null

    // !wca! get size: number | null | undefined

    // !wca! set size: number | null | undefined

    // !wca! observe size: number | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
