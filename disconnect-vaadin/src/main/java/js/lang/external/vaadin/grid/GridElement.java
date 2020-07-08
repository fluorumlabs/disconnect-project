package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.vaadin.DataProvider;
import js.lang.external.vaadin.RendererWithContext;
import js.util.collections.Array;
import js.util.function.JsPredicate;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-grid&gt;</code> is a free, high quality data grid / data table Web Component. The content of the the grid can be populated in two ways: imperatively by using renderer callback function and declaratively by using Polymer's Templates.
 *
 * <h3>Quick Start</h3>
 * Start with an assigning an array to the <a href="#/elements/vaadin-grid#property-items"><code>items</code></a> property to visualize your data.
 *
 * Use the <a href="#/elements/vaadin-grid-column"><code>&lt;vaadin-grid-column&gt;</code></a> element to configure the grid columns. Set <code>path</code> and <code>header</code> shorthand properties for the columns to define what gets rendered in the cells of the column.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid&gt;
 *    &lt;vaadin-grid-column path="name.first" header="First name"&gt;&lt;/vaadin-grid-column&gt;
 *    &lt;vaadin-grid-column path="name.last" header="Last name"&gt;&lt;/vaadin-grid-column&gt;
 *    &lt;vaadin-grid-column path="email"&gt;&lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * For custom content <code>vaadin-grid-column</code> element provides you with three types of <code>renderer</code> callback functions: <code>headerRenderer</code>, <code>renderer</code> and <code>footerRenderer</code>.
 *
 * Each of those renderer functions provides <code>root</code>, <code>column</code>, <code>model</code> arguments when applicable. Generate DOM content, append it to the <code>root</code> element and control the state of the host element by accessing <code>column</code>. Before generating new content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * Renderers are called on initialization of new column cells and each time the related row model is updated. DOM generated during the renderer call can be reused in the next renderer call and will be provided with the <code>root</code> argument. On first call it will be empty.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid&gt;
 *    &lt;vaadin-grid-column&gt;&lt;/vaadin-grid-column&gt;
 *    &lt;vaadin-grid-column&gt;&lt;/vaadin-grid-column&gt;
 *    &lt;vaadin-grid-column&gt;&lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * <pre><code class="language-js">const grid = document.querySelector('vaadin-grid');
 * grid.items = [{'name': 'John', 'surname': 'Lennon', 'role': 'singer'},
 *                {'name': 'Ringo', 'surname': 'Starr', 'role': 'drums'}];
 *
 * const columns = grid.querySelectorAll('vaadin-grid-column');
 *
 * columns[0].headerRenderer = function(root) {
 *    root.textContent = 'Name';
 * };
 * columns[0].renderer = function(root, column, model) {
 *    root.textContent = model.item.name;
 * };
 *
 * columns[1].headerRenderer = function(root) {
 *    root.textContent = 'Surname';
 * };
 * columns[1].renderer = function(root, column, model) {
 *    root.textContent = model.item.surname;
 * };
 *
 * columns[2].headerRenderer = function(root) {
 *    root.textContent = 'Role';
 * };
 * columns[2].renderer = function(root, column, model) {
 *    root.textContent = model.item.role;
 * };
 * </code></pre>
 * Alternatively, the content can be provided with Polymer's Templates:
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items='[{"name": "John", "surname": "Lennon", "role": "singer"},
 * {"name": "Ringo", "surname": "Starr", "role": "drums"}]'&gt;
 *    &lt;vaadin-grid-column&gt;
 *      &lt;template class="header"&gt;Name&lt;/template&gt;
 *      &lt;template&gt;[[item.name]]&lt;/template&gt;
 *    &lt;/vaadin-grid-column&gt;
 *    &lt;vaadin-grid-column&gt;
 *      &lt;template class="header"&gt;Surname&lt;/template&gt;
 *      &lt;template&gt;[[item.surname]]&lt;/template&gt;
 *    &lt;/vaadin-grid-column&gt;
 *    &lt;vaadin-grid-column&gt;
 *      &lt;template class="header"&gt;Role&lt;/template&gt;
 *      &lt;template&gt;[[item.role]]&lt;/template&gt;
 *    &lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * The following helper elements can be used for further customization:
 *
 * <ul>
 *  <li><a href="#/elements/vaadin-grid-column-group"><code>&lt;vaadin-grid-column-group&gt;</code></a></li>
 *  <li><a href="#/elements/vaadin-grid-filter"><code>&lt;vaadin-grid-filter&gt;</code></a></li>
 *  <li><a href="#/elements/vaadin-grid-sorter"><code>&lt;vaadin-grid-sorter&gt;</code></a></li>
 *  <li><a href="#/elements/vaadin-grid-selection-column"><code>&lt;vaadin-grid-selection-column&gt;</code></a></li>
 *  <li><a href="#/elements/vaadin-grid-tree-toggle"><code>&lt;vaadin-grid-tree-toggle&gt;</code></a></li>
 * </ul>
 * <strong>Note that the helper elements must be explicitly imported.</strong> If you want to import everything at once you can use the <code>all-imports.html</code> bundle.
 *
 * A column template can be decorated with one the following class names to specify its purpose
 *
 * <ul>
 *  <li><code>header</code>: Marks a header template</li>
 *  <li><code>footer</code>: Marks a footer template</li>
 *  <li><code>row-details</code>: Marks a row details template</li>
 * </ul>
 * The following built-in template variables can be bound to inside the column templates:
 *
 * <ul>
 *  <li><code>[[index]]</code>: Number representing the row index</li>
 *  <li><code>[[item]]</code> and it's sub-properties: Data object (provided by a data provider / items array)</li>
 *  <li><code>{{selected}}</code>: True if the item is selected (can be two-way bound)</li>
 *  <li><code>{{detailsOpened}}</code>: True if the item has row details opened (can be two-way bound)</li>
 *  <li><code>{{expanded}}</code>: True if the item has tree sublevel expanded (can be two-way bound)</li>
 *  <li><code>[[level]]</code>: Number of the tree sublevel of the item, first level-items have 0</li>
 * </ul>
 * <h3>Lazy Loading with Function Data Provider</h3>
 * In addition to assigning an array to the items property, you can alternatively provide the <code>&lt;vaadin-grid&gt;</code> data through the <a href="#/elements/vaadin-grid#property-dataProvider"><code>dataProvider</code></a> function property. The <code>&lt;vaadin-grid&gt;</code> calls this function lazily, only when it needs more data to be displayed.
 *
 * See the <a href="#/elements/vaadin-grid#property-dataProvider"><code>dataProvider</code></a> in the API reference below for the detailed data provider arguments description, and the â€œAssigning Dataâ€� page in the demos.
 *
 * <strong>Note that expanding the tree grid's item will trigger a call to the <code>dataProvider</code>.</strong>
 *
 * <strong>Also, note that when using function data providers, the total number of items needs to be set manually. The total number of items can be returned in the second argument of the data provider callback:</strong>
 *
 * <pre><code class="language-javascript">grid.dataProvider = function(params, callback) {
 *    var url = 'https://api.example/data' +
 *        '?page=' + params.page +        // the requested page index
 *        '&amp;per_page=' + params.pageSize; // number of items on the page
 *    var xhr = new XMLHttpRequest();
 *    xhr.onload = function() {
 *      var response = JSON.parse(xhr.responseText);
 *      callback(
 *        response.employees, // requested page of items
 *        response.totalSize  // total number of items
 *      );
 *    };
 *    xhr.open('GET', url, true);
 *    xhr.send();
 * };
 * </code></pre>
 * <strong>Alternatively, you can use the <code>size</code> property to set the total number of items:</strong>
 *
 * <pre><code class="language-javascript">grid.size = 200; // The total number of items
 * grid.dataProvider = function(params, callback) {
 *    var url = 'https://api.example/data' +
 *        '?page=' + params.page +        // the requested page index
 *        '&amp;per_page=' + params.pageSize; // number of items on the page
 *    var xhr = new XMLHttpRequest();
 *    xhr.onload = function() {
 *      var response = JSON.parse(xhr.responseText);
 *      callback(response.employees);
 *    };
 *    xhr.open('GET', url, true);
 *    xhr.send();
 * };
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>row</code></td>
 *    <td>Row in the internal table</td>
 *   </tr>
 *   <tr>
 *    <td><code>cell</code></td>
 *    <td>Cell in the internal table</td>
 *   </tr>
 *   <tr>
 *    <td><code>header-cell</code></td>
 *    <td>Header cell in the internal table</td>
 *   </tr>
 *   <tr>
 *    <td><code>body-cell</code></td>
 *    <td>Body cell in the internal table</td>
 *   </tr>
 *   <tr>
 *    <td><code>footer-cell</code></td>
 *    <td>Footer cell in the internal table</td>
 *   </tr>
 *   <tr>
 *    <td><code>details-cell</code></td>
 *    <td>Row details cell in the internal table</td>
 *   </tr>
 *   <tr>
 *    <td><code>resize-handle</code></td>
 *    <td>Handle for resizing the columns</td>
 *   </tr>
 *   <tr>
 *    <td><code>reorder-ghost</code></td>
 *    <td>Ghost element of the header cell being dragged</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>loading</code></td>
 *    <td>Set when the grid is loading data from data provider</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>interacting</code></td>
 *    <td>Keyboard navigation in interaction mode</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>navigating</code></td>
 *    <td>Keyboard navigation in navigation mode</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>overflow</code></td>
 *    <td>Set when rows are overflowing the grid viewport. Possible values: <code>top</code>, <code>bottom</code>, <code>left</code>, <code>right</code></td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>reordering</code></td>
 *    <td>Set when the grid's columns are being reordered</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>dragover</code></td>
 *    <td>Set when the grid (not a specific row) is dragged over</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>dragging-rows</code> : Set when grid rows are dragged</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>reorder-status</code></td>
 *    <td>Reflects the status of a cell while columns are being reordered</td>
 *    <td>cell</td>
 *   </tr>
 *   <tr>
 *    <td><code>frozen</code></td>
 *    <td>Frozen cell</td>
 *    <td>cell</td>
 *   </tr>
 *   <tr>
 *    <td><code>last-frozen</code></td>
 *    <td>Last frozen cell</td>
 *    <td>cell</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <ul>
 *  <li><code>first-column</code> | First visible cell on a row | cell <code>last-column</code> | Last visible cell on a row | cell <code>selected</code> | Selected row | row <code>expanded</code> | Expanded row | row <code>details-opened</code> | Row with details open | row <code>loading</code> | Row that is waiting for data from data provider | row <code>odd</code> | Odd row | row <code>first</code> | The first body row | row <code>dragstart</code> | Set for one frame when drag of a row is starting. The value is a number when multiple rows are dragged | row <code>dragover</code> | Set when the row is dragged over | row <code>drag-disabled</code> | Set to a row that isn't available for dragging | row <code>drop-disabled</code> | Set to a row that can't be dropped on top of | row</li>
 * </ul>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, DataProviderMixin, ArrayDataProviderMixin, DynamicColumnsMixin, ActiveItemMixin, ScrollMixin, SelectionMixin, SortMixin, RowDetailsMixin, KeyboardNavigationMixin, A11yMixin, FilterMixin, ColumnReorderingMixin, ColumnResizingMixin, EventContextMixin, DragAndDropMixin, StylingMixin, LegacyElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/vaadin-grid.js")
public interface GridElement<T extends Any> extends HTMLElement {

    // !wca! assignParentResizable: (parentResizable: any): void

    // !wca! clearCache: (): void
    /**
     * Clears the cached pages and reloads data from dataprovider when needed.
     */
    @JSMethod("clearCache")
    void clearCache();

    // !wca! closeItemDetails: (item: GridItem): void
    /**
     * Close the details row of a given item.
     */
    @JSMethod("closeItemDetails")
    void closeItemDetails(T item);

    // !wca! collapseItem: (item: GridItem): void
    /**
     * Collapses the given item tree.
     */
    @JSMethod("collapseItem")
    void collapseItem(T item);

    // !wca! deselectItem: (item: GridItem): void
    /**
     * Deselects the given item if it is already selected.
     *
     * <strong>item</strong>: The item object
     */
    @JSMethod("deselectItem")
    void deselectItem(T item);

    // !wca! expandItem: (item: GridItem): void
    /**
     * Expands the given item tree.
     */
    @JSMethod("expandItem")
    void expandItem(T item);

    // !wca! filterDragAndDrop: (): void
    /**
     * Runs the <code>dragFilter</code> and <code>dropFilter</code> hooks for the visible cells.
     * If the filter depends on varying conditions, you may need to
     * call this function manually in order to update the draggability when
     * the conditions change.
     */
    @JSMethod("filterDragAndDrop")
    void filterDragAndDrop();

    // !wca! generateCellClassNames: (): void
    /**
     * Runs the <code>cellClassNameGenerator</code> for the visible cells.
     * If the generator depends on varying conditions, you need to
     * call this function manually in order to update the styles when
     * the conditions change.
     */
    @JSMethod("generateCellClassNames")
    void generateCellClassNames();

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
    @JSMethod("getEventContext")
    @Nullable
    GridEventContext<T> getEventContext(Event event);

    // !wca! getItemId: (item: GridItem): unknown
    /**
     * Returns a value that identifies the item. Uses <code>itemIdPath</code> if available.
     * Can be customized by overriding.
     */
    @JSMethod("getItemId")
    Unknown getItemId(T item);

    @JSProperty("getItemId")
    void setItemIdExtractor(ItemIdExtractor<T> extractor);

    // !wca! notifyResize: (): void

    // !wca! openItemDetails: (item: GridItem): void
    /**
     * Open the details row of a given item.
     */
    @JSMethod("openItemDetails")
    void openItemDetails(T item);

    // !wca! recalculateColumnWidths: (): void
    /**
     * Updates the <code>width</code> of all columns which have <code>autoWidth</code> set to <code>true</code>.
     */
    @JSMethod("recalculateColumnWidths")
    void recalculateColumnWidths();

    // !wca! resizerShouldNotify: (element: HTMLElement | null): boolean

    // !wca! scrollToIndex: (index: number): void
    /**
     * Scroll to a specific row index in the virtual list. Note that the row index is
     * not always the same for any particular item. For example, sorting/filtering/expanding
     * or collapsing hierarchical items can affect the row index related to an item.
     *
     * <strong>index</strong>: Row index to scroll to
     */
    @JSMethod("scrollToIndex")
    void scrollToIndex(int index);

    // !wca! selectItem: (item: GridItem): void
    /**
     * Selects the given item.
     *
     * <strong>item</strong>: The item object
     */
    @JSMethod("selectItem")
    void selectItem(T item);

    // !wca! stopResizeNotificationsFor: (target: any): void

    // !wca! toggleScrollListener: (yes: boolean): void

    // !wca! get activeItem: string | { [key: string]: unknown; } | null
    /**
     * The item user has last interacted with. Turns to <code>null</code> after user deactivates
     * the item by re-interacting with the currently active item.
     */
    @JSProperty("activeItem")
    @Nullable
    T getActiveItem();

    // !wca! set activeItem: string | { [key: string]: unknown; } | null
    /**
     * The item user has last interacted with. Turns to <code>null</code> after user deactivates
     * the item by re-interacting with the currently active item.
     */
    @JSProperty("activeItem")
    void setActiveItem(@Nullable T value);

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
     */
    @JSProperty("cellClassNameGenerator")
    void setCellClassNameGenerator(@Nullable GridCellClassNameGenerator<T> value);

    // !wca! get columnReorderingAllowed: boolean
    /**
     * Set to true to allow column reordering.
     */
    @JSProperty("columnReorderingAllowed")
    boolean isColumnReorderingAllowed();

    // !wca! set columnReorderingAllowed: boolean
    /**
     * Set to true to allow column reordering.
     */
    @JSProperty("columnReorderingAllowed")
    void setColumnReorderingAllowed(boolean value);

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
     */
    @JSProperty("dataProvider")
    void setDataProvider(@Nullable DataProvider<GridDataProviderParams<T>,T> value);

    // !wca! get detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined
    /**
     * An array containing references to items with open row details.
     */
    @JSProperty("detailsOpenedItems")
    @Nullable
    Array<T> getDetailsOpenedItems();

    // !wca! set detailsOpenedItems: (string | { [key: string]: unknown; } | null)[] | null | undefined
    /**
     * An array containing references to items with open row details.
     */
    @JSProperty("detailsOpenedItems")
    void setDetailsOpenedItems(@Nullable Array<T> value);

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
     */
    @JSProperty("dragFilter")
    void setDragFilter(@Nullable JsPredicate<GridItemModel<T>> value);

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
     */
    @JSProperty("dropFilter")
    void setDropFilter(@Nullable JsPredicate<GridItemModel<T>> value);

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
    @JSProperty("dropMode")
    @Nullable
    String getDropMode();

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
    @JSProperty("dropMode")
    void setDropMode(@Nullable String value);

    // !wca! get expandedItems: GridItem[]
    /**
     * An array that contains the expanded items.
     */
    @JSProperty("expandedItems")
    Array<T> getExpandedItems();

    // !wca! set expandedItems: GridItem[]
    /**
     * An array that contains the expanded items.
     */
    @JSProperty("expandedItems")
    void setExpandedItems(Array<T> value);

    // !wca! get heightByRows: boolean
    /**
     * If true, the grid's height is defined by its rows.
     *
     * Effectively, this disables the grid's virtual scrolling so that all the rows are rendered in the DOM at once.
     * If the grid has a large number of items, using the feature is discouraged to avoid performance issues.
     */
    @JSProperty("heightByRows")
    boolean isHeightByRows();

    // !wca! set heightByRows: boolean
    /**
     * If true, the grid's height is defined by its rows.
     *
     * Effectively, this disables the grid's virtual scrolling so that all the rows are rendered in the DOM at once.
     * If the grid has a large number of items, using the feature is discouraged to avoid performance issues.
     */
    @JSProperty("heightByRows")
    void setHeightByRows(boolean value);

    // !wca! get itemIdPath: string | null | undefined
    /**
     * Path to an item sub-property that identifies the item.
     */
    @JSProperty("itemIdPath")
    @Nullable
    String getItemIdPath();

    // !wca! set itemIdPath: string | null | undefined
    /**
     * Path to an item sub-property that identifies the item.
     */
    @JSProperty("itemIdPath")
    void setItemIdPath(@Nullable String value);

    // !wca! get items: GridItem[] | null | undefined
    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    @JSProperty("items")
    @Nullable
    Array<T> getItems();

    // !wca! set items: GridItem[] | null | undefined
    /**
     * An array containing the items which will be stamped to the column template
     * instances.
     */
    @JSProperty("items")
    void setItems(@Nullable Array<T> value);

    // !wca! get loading: boolean | null | undefined
    /**
     * <code>true</code> while data is being requested from the data provider.
     */
    @JSProperty("loading")
    boolean isLoading();

    // !wca! get multiSort: boolean
    /**
     * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
     */
    @JSProperty("multiSort")
    boolean isMultiSort();

    // !wca! set multiSort: boolean
    /**
     * When <code>true</code>, all <code>&lt;vaadin-grid-sorter&gt;</code> are applied for sorting.
     */
    @JSProperty("multiSort")
    void setMultiSort(boolean value);

    // !wca! get pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    @JSProperty("pageSize")
    int getPageSize();

    // !wca! set pageSize: number
    /**
     * Number of items fetched at a time from the dataprovider.
     */
    @JSProperty("pageSize")
    void setPageSize(int value);

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
     */
    @JSProperty("rowDetailsRenderer")
    void setRowDetailsRenderer(@Nullable RendererWithContext<GridElement<T>,GridItemModel<T>> value);

    // !wca! get rowsDraggable: boolean | null | undefined
    /**
     * Marks the grid's rows to be available for dragging.
     */
    @JSProperty("rowsDraggable")
    boolean isRowsDraggable();

    // !wca! set rowsDraggable: boolean | null | undefined
    /**
     * Marks the grid's rows to be available for dragging.
     */
    @JSProperty("rowsDraggable")
    void setRowsDraggable(boolean value);

    // !wca! get scrollTarget: HTMLElement | null

    // !wca! set scrollTarget: HTMLElement | null

    // !wca! get selectedItems: (string | { [key: string]: unknown; } | null)[] | null
    /**
     * An array that contains the selected items.
     */
    @JSProperty("selectedItems")
    @Nullable
    Array<T> getSelectedItems();

    // !wca! set selectedItems: (string | { [key: string]: unknown; } | null)[] | null
    /**
     * An array that contains the selected items.
     */
    @JSProperty("selectedItems")
    void setSelectedItems(@Nullable Array<T> value);

    // !wca! get size: number | null | undefined
    /**
     */
    @JSProperty("size")
    int getSize();

    // !wca! set size: number | null | undefined
    /**
     */
    @JSProperty("size")
    void setSize(int value);

    // !wca! get theme: string | null | undefined
}
