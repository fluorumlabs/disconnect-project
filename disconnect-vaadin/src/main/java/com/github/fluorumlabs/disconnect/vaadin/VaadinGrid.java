package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.GridElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.*;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.lang.Any;
import js.web.dom.Element;

/**
 * `<vaadin-grid>` is a free, high quality data grid / data table Web Component. The content of the
 * the grid can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 * <p>
 * ### Quick Start
 * <p>
 * Start with an assigning an array to the [`items`](#/elements/vaadin-grid#property-items) property to visualize
 * your data.
 * <p>
 * Use the [`<vaadin-grid-column>`](#/elements/vaadin-grid-column) element to configure the grid columns. Set `path`
 * and `header`
 * shorthand properties for the columns to define what gets rendered in the cells of the column.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid>
 * <vaadin-grid-column path="name.first" header="First name"></vaadin-grid-column>
 * <vaadin-grid-column path="name.last" header="Last name"></vaadin-grid-column>
 * <vaadin-grid-column path="email"></vaadin-grid-column>
 * </vaadin-grid>
 * ```
 * <p>
 * For custom content `vaadin-grid-column` element provides you with three types of `renderer` callback functions:
 * `headerRenderer`,
 * `renderer` and `footerRenderer`.
 * <p>
 * Each of those renderer functions provides `root`, `column`, `rowData` arguments when applicable.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `column`. Before generating new content,
 * users are able to check if there is already content in `root` for reusing it.
 * <p>
 * Renderers are called on initialization of new column cells and each time the
 * related row data is updated. DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid>
 * <vaadin-grid-column></vaadin-grid-column>
 * <vaadin-grid-column></vaadin-grid-column>
 * <vaadin-grid-column></vaadin-grid-column>
 * </vaadin-grid>
 * ```
 * ```js
 * const grid = document.querySelector('vaadin-grid');
 * grid.items = [{'name': 'John', 'surname': 'Lennon', 'role': 'singer'},
 * {'name': 'Ringo', 'surname': 'Starr', 'role': 'drums'}];
 * <p>
 * const columns = grid.querySelectorAll('vaadin-grid-column');
 * <p>
 * columns[0].headerRenderer = function(root) {
 * root.textContent = 'Name';
 * };
 * columns[0].renderer = function(root, column, rowData) {
 * root.textContent = rowData.item.name;
 * };
 * <p>
 * columns[1].headerRenderer = function(root) {
 * root.textContent = 'Surname';
 * };
 * columns[1].renderer = function(root, column, rowData) {
 * root.textContent = rowData.item.surname;
 * };
 * <p>
 * columns[2].headerRenderer = function(root) {
 * root.textContent = 'Role';
 * };
 * columns[2].renderer = function(root, column, rowData) {
 * root.textContent = rowData.item.role;
 * };
 * ```
 * <p>
 * Alternatively, the content can be provided with Polymer's Templates:
 * <p>
 * #### Example:
 * ```html
 * <vaadin-grid items='[{"name": "John", "surname": "Lennon", "role": "singer"},
 * {"name": "Ringo", "surname": "Starr", "role": "drums"}]'>
 * <vaadin-grid-column>
 * <template class="header">Name</template>
 * <template>[[item.name]]</template>
 * </vaadin-grid-column>
 * <vaadin-grid-column>
 * <template class="header">Surname</template>
 * <template>[[item.surname]]</template>
 * </vaadin-grid-column>
 * <vaadin-grid-column>
 * <template class="header">Role</template>
 * <template>[[item.role]]</template>
 * </vaadin-grid-column>
 * </vaadin-grid>
 * ```
 * <p>
 * The following helper elements can be used for further customization:
 * - [`<vaadin-grid-column-group>`](#/elements/vaadin-grid-column-group)
 * - [`<vaadin-grid-filter>`](#/elements/vaadin-grid-filter)
 * - [`<vaadin-grid-sorter>`](#/elements/vaadin-grid-sorter)
 * - [`<vaadin-grid-selection-column>`](#/elements/vaadin-grid-selection-column)
 * - [`<vaadin-grid-tree-toggle>`](#/elements/vaadin-grid-tree-toggle)
 * <p>
 * __Note that the helper elements must be explicitly imported.__
 * If you want to import everything at once you can use the `all-imports.html` bundle.
 * <p>
 * A column template can be decorated with one the following class names to specify its purpose
 * - `header`: Marks a header template
 * - `footer`: Marks a footer template
 * - `row-details`: Marks a row details template
 * <p>
 * The following built-in template variables can be bound to inside the column templates:
 * - `[[index]]`: Number representing the row index
 * - `[[item]]` and it's sub-properties: Data object (provided by a data provider / items array)
 * - `{{selected}}`: True if the item is selected (can be two-way bound)
 * - `{{detailsOpened}}`: True if the item has row details opened (can be two-way bound)
 * - `{{expanded}}`: True if the item has tree sublevel expanded (can be two-way bound)
 * - `[[level]]`: Number of the tree sublevel of the item, first level-items have 0
 * <p>
 * ### Lazy Loading with Function Data Provider
 * <p>
 * In addition to assigning an array to the items property, you can alternatively
 * provide the `<vaadin-grid>` data through the
 * [`dataProvider`](#/elements/vaadin-grid#property-dataProvider) function property.
 * The `<vaadin-grid>` calls this function lazily, only when it needs more data
 * to be displayed.
 * <p>
 * See the [`dataProvider`](#/elements/vaadin-grid#property-dataProvider) in
 * the API reference below for the detailed data provider arguments description,
 * and the “Assigning Data” page in the demos.
 * <p>
 * __Note that expanding the tree grid's item will trigger a call to the `dataProvider`.__
 * <p>
 * __Also, note that when using function data providers, the total number of items
 * needs to be set manually. The total number of items can be returned
 * in the second argument of the data provider callback:__
 * <p>
 * ```javascript
 * grid.dataProvider = function(params, callback) {
 * var url = 'https://api.example/data' +
 * '?page=' + params.page +        // the requested page index
 * '&per_page=' + params.pageSize; // number of items on the page
 * var xhr = new XMLHttpRequest();
 * xhr.onload = function() {
 * var response = JSON.parse(xhr.responseText);
 * callback(
 * response.employees, // requested page of items
 * response.totalSize  // total number of items
 * );
 * };
 * xhr.open('GET', url, true);
 * xhr.send();
 * };
 * ```
 * <p>
 * __Alternatively, you can use the `size` property to set the total number of items:__
 * <p>
 * ```javascript
 * grid.size = 200; // The total number of items
 * grid.dataProvider = function(params, callback) {
 * var url = 'https://api.example/data' +
 * '?page=' + params.page +        // the requested page index
 * '&per_page=' + params.pageSize; // number of items on the page
 * var xhr = new XMLHttpRequest();
 * xhr.onload = function() {
 * var response = JSON.parse(xhr.responseText);
 * callback(response.employees);
 * };
 * xhr.open('GET', url, true);
 * xhr.send();
 * };
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ----------------|----------------
 * `row` | Row in the internal table
 * `cell` | Cell in the internal table
 * `header-cell` | Header cell in the internal table
 * `body-cell` | Body cell in the internal table
 * `footer-cell` | Footer cell in the internal table
 * `details-cell` | Row details cell in the internal table
 * `resize-handle` | Handle for resizing the columns
 * `reorder-ghost` | Ghost element of the header cell being dragged
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `loading` | Set when the grid is loading data from data provider | :host
 * `interacting` | Keyboard navigation in interaction mode | :host
 * `navigating` | Keyboard navigation in navigation mode | :host
 * `overflow` | Set when rows are overflowing the grid viewport. Possible values: `top`, `bottom`, `left`, `right` |
 * :host
 * `reordering` | Set when the grid's columns are being reordered | :host
 * `dragover` | Set when the grid (not a specific row) is dragged over | :host
 * `dragging-rows` : Set when grid rows are dragged  | :host
 * `reorder-status` | Reflects the status of a cell while columns are being reordered | cell
 * `frozen` | Frozen cell | cell
 * `last-frozen` | Last frozen cell | cell
 * * `first-column` | First visible cell on a row | cell
 * `last-column` | Last visible cell on a row | cell
 * `selected` | Selected row | row
 * `expanded` | Expanded row | row
 * `details-opened` | Row with details open | row
 * `loading` | Row that is waiting for data from data provider | row
 * `odd` | Odd row | row
 * `first` | The first body row | row
 * `dragstart` | Set for one frame when drag of a row is starting. The value is a number when multiple rows are
 * dragged | row
 * `dragover` | Set when the row is dragged over | row
 * `drag-disabled` | Set to a row that isn't available for dragging | row
 * `drop-disabled` | Set to a row that can't be dropped on top of | row
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinGrid<ITEM extends Any> extends AbstractComponent<GridElement<ITEM>>
        implements HasThemableMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasA11yMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasActiveItemMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasArrayDataProviderMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasColumnResizingMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasDataProviderMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasDynamicColumnsMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasFilterMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasRowDetailsMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasScrollMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasSelectionMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasSortMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasKeyboardNavigationMixin<GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasColumnReorderingMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasEventContextMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasStylingMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasDragAndDropMixin<ITEM, GridElement<ITEM>, VaadinGrid<ITEM>>,
        HasSlottedComponents<GridElement<ITEM>, VaadinGrid<ITEM>, Component<? extends Element>> {
    public VaadinGrid() {
        super("vaadin-grid");
    }

    /**
     * If true, the grid's height is defined by the number of its rows.
     */
    public boolean heightByRows() {
        return getNode().isHeightByRows();
    }

    /**
     * If true, the grid's height is defined by the number of its rows.
     */
    public VaadinGrid<ITEM> heightByRows(boolean heightByRows) {
        getNode().setHeightByRows(heightByRows);
        return this;
    }

    /**
     * Updates the `width` of all columns which have `autoWidth` set to `true`.
     */
    public void recalculateColumnWidths() {
        getNode().recalculateColumnWidths();
    }

    /**
     * Manually invoke existing renderers for all the columns
     * (header, footer and body cells) and opened row details.
     */
    public void render() {
        getNode().render();
    }

    /**
     * Updates the computed metrics and positioning of internal grid parts
     * (row/details cell positioning etc). Needs to be invoked whenever the sizing of grid
     * content changes asynchronously to ensure consistent appearance (e.g. when a
     * contained image whose bounds aren't known beforehand finishes loading).
     */
    public void notifyResize() {
        getNode().notifyResize();
    }

    public VaadinGrid<ITEM> setNodistribute(Component<? extends Element> component) {
        return replaceSlotted("nodistribute", component);
    }

    public VaadinGrid<ITEM> setNodistribute(Component<? extends Element>... components) {
        return replaceSlotted("nodistribute", components);
    }

    public VaadinGrid<ITEM> addToNodistribute(Component<? extends Element> component) {
        return addSlotted("nodistribute", component);
    }

    public VaadinGrid<ITEM> addToNodistribute(Component<? extends Element>... components) {
        return addSlotted("nodistribute", components);
    }

    public VaadinGrid<ITEM> insertToNodistribute(Component<? extends Element> component) {
        return insertSlotted("nodistribute", component);
    }

    public VaadinGrid<ITEM> insertToNodistribute(Component<? extends Element>... components) {
        return insertSlotted("nodistribute", components);
    }

    public VaadinGrid<ITEM> clearNodistribute() {
        return removeAllSlotted("nodistribute");
    }
}
