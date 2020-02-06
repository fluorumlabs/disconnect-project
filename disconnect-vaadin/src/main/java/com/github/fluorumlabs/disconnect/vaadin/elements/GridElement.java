package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.*;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-grid&gt;</code> is a free, high quality data grid / data table Web Component. The content of the
 * the grid can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 *
 * <h3>Quick Start</h3>
 * Start with an assigning an array to the <a href="#/elements/vaadin-grid#property-items"><code>items</code></a>
 * property to visualize your data.
 * <p>
 * Use the <a href="#/elements/vaadin-grid-column"><code>&lt;vaadin-grid-column&gt;</code></a>
 * element to configure the grid columns. Set <code>path</code> and <code>header</code>
 * shorthand properties for the columns to define what gets rendered in the cells of the column.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid&gt;
 *   &lt;vaadin-grid-column path=&quot;name.first&quot; header=&quot;First name&quot;&gt;&lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column path=&quot;name.last&quot; header=&quot;Last name&quot;&gt;&lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column path=&quot;email&quot;&gt;&lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * For custom content <code>vaadin-grid-column</code> element provides you with three types of <code>renderer</code>
 * callback functions: <code>headerRenderer</code>,
 * <code>renderer</code> and <code>footerRenderer</code>.
 * <p>
 * Each of those renderer functions provides <code>root</code>, <code>column</code>, <code>rowData</code> arguments
 * when applicable.
 * Generate DOM content, append it to the <code>root</code> element and control the state
 * of the host element by accessing <code>column</code>. Before generating new content,
 * users are able to check if there is already content in <code>root</code> for reusing it.
 * <p>
 * Renderers are called on initialization of new column cells and each time the
 * related row data is updated. DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid&gt;
 *   &lt;vaadin-grid-column&gt;&lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;&lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;&lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * <pre><code class="language-js">const grid = document.querySelector('vaadin-grid');
 * grid.items = [{'name': 'John', 'surname': 'Lennon', 'role': 'singer'},
 *               {'name': 'Ringo', 'surname': 'Starr', 'role': 'drums'}];
 *
 * const columns = grid.querySelectorAll('vaadin-grid-column');
 *
 * columns[0].headerRenderer = function(root) {
 *   root.textContent = 'Name';
 * };
 * columns[0].renderer = function(root, column, rowData) {
 *   root.textContent = rowData.item.name;
 * };
 *
 * columns[1].headerRenderer = function(root) {
 *   root.textContent = 'Surname';
 * };
 * columns[1].renderer = function(root, column, rowData) {
 *   root.textContent = rowData.item.surname;
 * };
 *
 * columns[2].headerRenderer = function(root) {
 *   root.textContent = 'Role';
 * };
 * columns[2].renderer = function(root, column, rowData) {
 *   root.textContent = rowData.item.role;
 * };
 * </code></pre>
 * Alternatively, the content can be provided with Polymer's Templates:
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items='[{&quot;name&quot;: &quot;John&quot;, &quot;surname&quot;:
 * &quot;Lennon&quot;, &quot;role&quot;: &quot;singer&quot;},
 * {&quot;name&quot;: &quot;Ringo&quot;, &quot;surname&quot;: &quot;Starr&quot;, &quot;role&quot;: &quot;drums&quot;}
 * ]'&gt;
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class=&quot;header&quot;&gt;Name&lt;/template&gt;
 *     &lt;template&gt;[[item.name]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class=&quot;header&quot;&gt;Surname&lt;/template&gt;
 *     &lt;template&gt;[[item.surname]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 *   &lt;vaadin-grid-column&gt;
 *     &lt;template class=&quot;header&quot;&gt;Role&lt;/template&gt;
 *     &lt;template&gt;[[item.role]]&lt;/template&gt;
 *   &lt;/vaadin-grid-column&gt;
 * &lt;/vaadin-grid&gt;
 * </code></pre>
 * The following helper elements can be used for further customization:
 *
 * <ul>
 * <li><a href="#/elements/vaadin-grid-column-group"><code>&lt;vaadin-grid-column-group&gt;</code></a></li>
 * <li><a href="#/elements/vaadin-grid-filter"><code>&lt;vaadin-grid-filter&gt;</code></a></li>
 * <li><a href="#/elements/vaadin-grid-sorter"><code>&lt;vaadin-grid-sorter&gt;</code></a></li>
 * <li><a href="#/elements/vaadin-grid-selection-column"><code>&lt;vaadin-grid-selection-column&gt;</code></a></li>
 * <li><a href="#/elements/vaadin-grid-tree-toggle"><code>&lt;vaadin-grid-tree-toggle&gt;</code></a></li>
 * </ul>
 * <strong>Note that the helper elements must be explicitly imported.</strong>
 * If you want to import everything at once you can use the <code>all-imports.html</code> bundle.
 * <p>
 * A column template can be decorated with one the following class names to specify its purpose
 *
 * <ul>
 * <li><code>header</code>: Marks a header template</li>
 * <li><code>footer</code>: Marks a footer template</li>
 * <li><code>row-details</code>: Marks a row details template</li>
 * </ul>
 * The following built-in template variables can be bound to inside the column templates:
 *
 * <ul>
 * <li><code>[[index]]</code>: Number representing the row index</li>
 * <li><code>[[item]]</code> and it's sub-properties: Data object (provided by a data provider / items array)</li>
 * <li><code>{{selected}}</code>: True if the item is selected (can be two-way bound)</li>
 * <li><code>{{detailsOpened}}</code>: True if the item has row details opened (can be two-way bound)</li>
 * <li><code>{{expanded}}</code>: True if the item has tree sublevel expanded (can be two-way bound)</li>
 * <li><code>[[level]]</code>: Number of the tree sublevel of the item, first level-items have 0</li>
 * </ul>
 * <h3>Lazy Loading with Function Data Provider</h3>
 * In addition to assigning an array to the items property, you can alternatively
 * provide the <code>&lt;vaadin-grid&gt;</code> data through the
 * <a href="#/elements/vaadin-grid#property-dataProvider"><code>dataProvider</code></a> function property.
 * The <code>&lt;vaadin-grid&gt;</code> calls this function lazily, only when it needs more data
 * to be displayed.
 * <p>
 * See the <a href="#/elements/vaadin-grid#property-dataProvider"><code>dataProvider</code></a> in
 * the API reference below for the detailed data provider arguments description,
 * and the “Assigning Data” page in the demos.
 *
 * <strong>Note that expanding the tree grid's item will trigger a call to the <code>dataProvider</code>.</strong>
 *
 * <strong>Also, note that when using function data providers, the total number of items
 * needs to be set manually. The total number of items can be returned
 * in the second argument of the data provider callback:</strong>
 *
 * <pre><code class="language-javascript">grid.dataProvider = function(params, callback) {
 *   var url = 'https://api.example/data' +
 *       '?page=' + params.page +        // the requested page index
 *       '&amp;per_page=' + params.pageSize; // number of items on the page
 *   var xhr = new XMLHttpRequest();
 *   xhr.onload = function() {
 *     var response = JSON.parse(xhr.responseText);
 *     callback(
 *       response.employees, // requested page of items
 *       response.totalSize  // total number of items
 *     );
 *   };
 *   xhr.open('GET', url, true);
 *   xhr.send();
 * };
 * </code></pre>
 * <strong>Alternatively, you can use the <code>size</code> property to set the total number of items:</strong>
 *
 * <pre><code class="language-javascript">grid.size = 200; // The total number of items
 * grid.dataProvider = function(params, callback) {
 *   var url = 'https://api.example/data' +
 *       '?page=' + params.page +        // the requested page index
 *       '&amp;per_page=' + params.pageSize; // number of items on the page
 *   var xhr = new XMLHttpRequest();
 *   xhr.onload = function() {
 *     var response = JSON.parse(xhr.responseText);
 *     callback(response.employees);
 *   };
 *   xhr.open('GET', url, true);
 *   xhr.send();
 * };
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>row</code></td><td>Row in the internal table</td></tr>
 * <tr><td><code>cell</code></td><td>Cell in the internal table</td></tr>
 * <tr><td><code>header-cell</code></td><td>Header cell in the internal table</td></tr>
 * <tr><td><code>body-cell</code></td><td>Body cell in the internal table</td></tr>
 * <tr><td><code>footer-cell</code></td><td>Footer cell in the internal table</td></tr>
 * <tr><td><code>details-cell</code></td><td>Row details cell in the internal table</td></tr>
 * <tr><td><code>resize-handle</code></td><td>Handle for resizing the columns</td></tr>
 * <tr><td><code>reorder-ghost</code></td><td>Ghost element of the header cell being dragged</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>loading</code></td><td>Set when the grid is loading data from data provider</td><td>:host</td></tr>
 * <tr><td><code>interacting</code></td><td>Keyboard navigation in interaction mode</td><td>:host</td></tr>
 * <tr><td><code>navigating</code></td><td>Keyboard navigation in navigation mode</td><td>:host</td></tr>
 * <tr><td><code>overflow</code></td><td>Set when rows are overflowing the grid viewport. Possible values:
 * <code>top</code>, <code>bottom</code>, <code>left</code>, <code>right</code></td><td>:host</td></tr>
 * <tr><td><code>reordering</code></td><td>Set when the grid's columns are being reordered</td><td>:host</td></tr>
 * <tr><td><code>dragover</code></td><td>Set when the grid (not a specific row) is dragged over</td><td>:host</td></tr>
 * <tr><td><code>dragging-rows</code> : Set when grid rows are dragged</td><td>:host</td></tr>
 * <tr><td><code>reorder-status</code></td><td>Reflects the status of a cell while columns are being
 * reordered</td><td>cell</td></tr>
 * <tr><td><code>frozen</code></td><td>Frozen cell</td><td>cell</td></tr>
 * <tr><td><code>last-frozen</code></td><td>Last frozen cell</td><td>cell</td></tr>
 * </tbody>
 * </table>
 * <ul>
 * <li><code>first-column</code> | First visible cell on a row | cell
 * <code>last-column</code> | Last visible cell on a row | cell
 * <code>selected</code> | Selected row | row
 * <code>expanded</code> | Expanded row | row
 * <code>details-opened</code> | Row with details open | row
 * <code>loading</code> | Row that is waiting for data from data provider | row
 * <code>odd</code> | Odd row | row
 * <code>first</code> | The first body row | row
 * <code>dragstart</code> | Set for one frame when drag of a row is starting. The value is a number when multiple
 * rows are dragged | row
 * <code>dragover</code> | Set when the row is dragged over | row
 * <code>drag-disabled</code> | Set to a row that isn't available for dragging | row
 * <code>drop-disabled</code> | Set to a row that can't be dropped on top of | row</li>
 * </ul>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "GridElement",
		module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public interface GridElement<ITEM extends Any> extends HTMLElement,
		ThemableMixin,
		A11yMixin,
		ActiveItemMixin<ITEM>,
		ArrayDataProviderMixin<ITEM>,
		ColumnResizingMixin,
		DataProviderMixin<ITEM>,
		DynamicColumnsMixin,
		FilterMixin,
		RowDetailsMixin<ITEM>,
		ScrollMixin,
		SelectionMixin<ITEM>,
		SortMixin,
		KeyboardNavigationMixin,
		ColumnReorderingMixin,
		EventContextMixin<ITEM>,
		StylingMixin<ITEM>,
		DragAndDropMixin<ITEM> {
	String TAGNAME = "vaadin-grid";
	/**
	 * If true, the grid's height is defined by the number of its rows.
	 */
	@JSProperty
	boolean isHeightByRows();

	/**
	 * If true, the grid's height is defined by the number of its rows.
	 */
	@JSProperty
	void setHeightByRows(boolean heightByRows);

	/**
	 * Updates the <code>width</code> of all columns which have <code>autoWidth</code> set to <code>true</code>.
	 */
	void recalculateColumnWidths();

	/**
	 * Manually invoke existing renderers for all the columns
	 * (header, footer and body cells) and opened row details.
	 */
	void render();

	/**
	 * Updates the computed metrics and positioning of internal grid parts
	 * (row/details cell positioning etc). Needs to be invoked whenever the sizing of grid
	 * content changes asynchronously to ensure consistent appearance (e.g. when a
	 * contained image whose bounds aren't known beforehand finishes loading).
	 */
	void notifyResize();
}
