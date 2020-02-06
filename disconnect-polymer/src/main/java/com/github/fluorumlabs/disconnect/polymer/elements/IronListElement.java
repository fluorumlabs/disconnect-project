package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>iron-list</code> displays a virtual, 'infinite' list. The template inside
 * the iron-list element represents the DOM to create for each list item.
 * The <code>items</code> property specifies an array of list item data.
 * <p>
 * For performance reasons, not every item in the list is rendered at once;
 * instead a small subset of actual template elements <em>(enough to fill the
 * viewport)</em> are rendered and reused as the user scrolls. As such, it is important
 * that all state of the list template is bound to the model driving it, since the
 * view may be reused with a new model at any time. Particularly, any state that
 * may change as the result of a user interaction with the list item must be bound
 * to the model to avoid view state inconsistency.
 *
 * <h3>Sizing iron-list</h3>
 * <code>iron-list</code> must either be explicitly sized, or delegate scrolling to an
 * explicitly sized parent. By &quot;explicitly sized&quot;, we mean it either has an
 * explicit CSS <code>height</code> property set via a class or inline style, or else is sized
 * by other layout means (e.g. the <code>flex</code> or <code>fit</code> classes).
 *
 * <h4>Flexbox - <a href="https://jsbin.com/vejoni/edit?html,output">jsbin</a></h4>
 * <pre><code class="language-html">&lt;template is=&quot;x-list&quot;&gt;
 *   &lt;style&gt;
 *     :host {
 *       display: block;
 *       height: 100vh;
 *       display: flex;
 *       flex-direction: column;
 *     }
 *
 *     iron-list {
 *       flex: 1 1 auto;
 *     }
 *   &lt;/style&gt;
 *   &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 *   &lt;iron-list items=&quot;[[items]]&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         ...
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h4>Explicit size - <a href="https://jsbin.com/vopucus/edit?html,output">jsbin</a></h4>
 * <pre><code class="language-html">&lt;template is=&quot;x-list&quot;&gt;
 *   &lt;style&gt;
 *     :host {
 *       display: block;
 *     }
 *
 *     iron-list {
 *       height: 100vh; /* don't use % values unless the parent element is sized.
 * \/
 *     }
 *   &lt;/style&gt;
 *   &lt;iron-list items=&quot;[[items]]&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         ...
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/template&gt;
 * </code></pre>
 * <h4>Main document scrolling -</h4>
 * <a href="https://jsbin.com/wevirow/edit?html,output">jsbin</a>
 *
 * <pre><code class="language-html">&lt;head&gt;
 *   &lt;style&gt;
 *     body {
 *       height: 100vh;
 *       margin: 0;
 *       display: flex;
 *       flex-direction: column;
 *     }
 *
 *     app-toolbar {
 *       position: fixed;
 *       top: 0;
 *       left: 0;
 *       right: 0;
 *     }
 *
 *     iron-list {
 *       /* add padding since the app-toolbar is fixed at the top *\/
 *       padding-top: 64px;
 *     }
 *   &lt;/style&gt;
 * &lt;/head&gt;
 * &lt;body&gt;
 *   &lt;app-toolbar&gt;App name&lt;/app-toolbar&gt;
 *   &lt;iron-list scroll-target=&quot;document&quot;&gt;
 *     &lt;template&gt;
 *       &lt;div&gt;
 *         ...
 *       &lt;/div&gt;
 *     &lt;/template&gt;
 *   &lt;/iron-list&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <code>iron-list</code> must be given a <code>&lt;template&gt;</code> which contains exactly one element. In
 * the examples above we used a <code>&lt;div&gt;</code>, but you can provide any element (including
 * custom elements).
 *
 * <h3>Template model</h3>
 * List item templates should bind to template models of the following structure:
 *
 * <pre><code class="language-js">{
 *   index: 0,        // index in the item array
 *   selected: false, // true if the current item is selected
 *   tabIndex: -1,    // a dynamically generated tabIndex for focus management
 *   item: {}         // user data corresponding to items[index]
 * }
 * </code></pre>
 * Alternatively, you can change the property name used as data index by changing
 * the <code>indexAs</code> property. The <code>as</code> property defines the name of the variable to
 * add to the binding scope for the array.
 * <p>
 * For example, given the following <code>data</code> array:
 *
 * <h5>data.json</h5>
 * <pre><code class="language-js">[
 *   {&quot;name&quot;: &quot;Bob&quot;},
 *   {&quot;name&quot;: &quot;Tim&quot;},
 *   {&quot;name&quot;: &quot;Mike&quot;}
 * ]
 * </code></pre>
 * The following code would render the list (note the name property is bound from
 * the model object provided to the template scope):
 *
 * <pre><code class="language-html">&lt;iron-ajax url=&quot;data.json&quot; last-response=&quot;{{data}}&quot;
 * auto&gt;&lt;/iron-ajax&gt;
 * &lt;iron-list items=&quot;[[data]]&quot; as=&quot;item&quot;&gt;
 *   &lt;template&gt;
 *     &lt;div&gt;
 *       Name: [[item.name]]
 *     &lt;/div&gt;
 *   &lt;/template&gt;
 * &lt;/iron-list&gt;
 * </code></pre>
 * <h3>Grid layout</h3>
 * <code>iron-list</code> supports a grid layout in addition to linear layout by setting
 * the <code>grid</code> attribute.  In this case, the list template item must have both fixed
 * width and height (e.g. via CSS). Based on this, the number of items
 * per row are determined automatically based on the size of the list viewport.
 *
 * <h3>Accessibility</h3>
 * <code>iron-list</code> automatically manages the focus state for the items. It also
 * provides a <code>tabIndex</code> property within the template scope that can be used for
 * keyboard navigation. For example, users can press the up and down keys to move
 * to previous and next items in the list:
 *
 * <pre><code class="language-html">&lt;iron-list items=&quot;[[data]]&quot; as=&quot;item&quot;&gt;
 *   &lt;template&gt;
 *     &lt;div tabindex$=&quot;[[tabIndex]]&quot;&gt;
 *       Name: [[item.name]]
 *     &lt;/div&gt;
 *   &lt;/template&gt;
 * &lt;/iron-list&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * You can use the <code>--iron-list-items-container</code> mixin to style the container of
 * items:
 *
 * <pre><code class="language-css">iron-list {
 *  --iron-list-items-container: {
 *     margin: auto;
 *   };
 * }
 * </code></pre>
 * <h3>Resizing</h3>
 * <code>iron-list</code> lays out the items when it receives a notification via the
 * <code>iron-resize</code> event. This event is fired by any element that implements
 * <code>IronResizableBehavior</code>.
 * <p>
 * By default, elements such as <code>iron-pages</code>, <code>paper-tabs</code> or <code>paper-dialog</code> will
 * trigger this event automatically. If you hide the list manually (e.g. you use
 * <code>display: none</code>) you might want to implement <code>IronResizableBehavior</code> or fire
 * this event manually right after the list became visible again. For example:
 *
 * <pre><code class="language-js">document.querySelector('iron-list').fire('iron-resize');
 * </code></pre>
 * <h3>When should <code>&lt;iron-list&gt;</code> be used?</h3>
 * <code>iron-list</code> should be used when a page has significantly more DOM nodes than the
 * ones visible on the screen. e.g. the page has 500 nodes, but only 20 are visible
 * at a time. This is why we refer to it as a <code>virtual</code> list. In this case, a
 * <code>dom-repeat</code> will still create 500 nodes which could slow down the web app, but
 * <code>iron-list</code> will only create 20.
 * <p>
 * However, having an <code>iron-list</code> does not mean that you can load all the data at
 * once. Say you have a million records in the database, you want to split the data
 * into pages so you can bring in a page at the time. The page could contain 500
 * items, and iron-list will only render 20.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronList",
		module = "@polymer/iron-list/iron-list.js"
)
public interface IronListElement<ITEM extends Any> extends HTMLElement {
	String TAGNAME = "iron-list";

	/**
	 * An array containing items determining how many instances of the template
	 * to stamp and that that each template instance should bind to.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getItems();

	/**
	 * An array containing items determining how many instances of the template
	 * to stamp and that that each template instance should bind to.
	 */
	@JSProperty
	void setItems(@JSByRef ITEM... items);

	@JSProperty
	void setItems(Array<ITEM> items);

	/**
	 * The name of the variable to add to the binding scope for the array
	 * element associated with a given template instance.
	 */
	@Nullable
	@JSProperty
	String getAs();

	/**
	 * The name of the variable to add to the binding scope for the array
	 * element associated with a given template instance.
	 */
	@JSProperty
	void setAs(String as);

	/**
	 * The name of the variable to add to the binding scope with the index
	 * for the row.
	 */
	@Nullable
	@JSProperty
	String getIndexAs();

	/**
	 * The name of the variable to add to the binding scope with the index
	 * for the row.
	 */
	@JSProperty
	void setIndexAs(String indexAs);

	/**
	 * The name of the variable to add to the binding scope to indicate
	 * if the row is selected.
	 */
	@Nullable
	@JSProperty
	String getSelectedAs();

	/**
	 * The name of the variable to add to the binding scope to indicate
	 * if the row is selected.
	 */
	@JSProperty
	void setSelectedAs(String selectedAs);

	/**
	 * When true, the list is rendered as a grid. Grid items must have
	 * fixed width and height set via CSS. e.g.
	 *
	 * <pre><code class="language-html">&lt;iron-list grid&gt;
	 *   &lt;template&gt;
	 *      &lt;div style=&quot;width: 100px; height: 100px;&quot;&gt; 100x100 &lt;/div&gt;
	 *   &lt;/template&gt;
	 * &lt;/iron-list&gt;
	 * </code></pre>
	 */
	@JSProperty
	boolean isGrid();

	/**
	 * When true, the list is rendered as a grid. Grid items must have
	 * fixed width and height set via CSS. e.g.
	 *
	 * <pre><code class="language-html">&lt;iron-list grid&gt;
	 *   &lt;template&gt;
	 *      &lt;div style=&quot;width: 100px; height: 100px;&quot;&gt; 100x100 &lt;/div&gt;
	 *   &lt;/template&gt;
	 * &lt;/iron-list&gt;
	 * </code></pre>
	 */
	@JSProperty
	void setGrid(boolean grid);

	/**
	 * When true, tapping a row will select the item, placing its data model
	 * in the set of selected items retrievable via the selection property.
	 * <p>
	 * Note that tapping focusable elements within the list item will not
	 * result in selection, since they are presumed to have their * own action.
	 */
	@JSProperty
	boolean isSelectionEnabled();

	/**
	 * When true, tapping a row will select the item, placing its data model
	 * in the set of selected items retrievable via the selection property.
	 * <p>
	 * Note that tapping focusable elements within the list item will not
	 * result in selection, since they are presumed to have their * own action.
	 */
	@JSProperty
	void setSelectionEnabled(boolean selectionEnabled);

	/**
	 * When <code>multiSelection</code> is false, this is the currently selected item, or
	 * <code>null</code> if no item is selected.
	 */
	@Nullable
	@JSProperty
	ITEM getSelectedItem();

	/**
	 * When <code>multiSelection</code> is false, this is the currently selected item, or
	 * <code>null</code> if no item is selected.
	 */
	@JSProperty
	void setSelectedItem(ITEM selectedItem);

	/**
	 * When <code>multiSelection</code> is true, this is an array that contains the
	 * selected items.
	 */
	@Nullable
	@JSProperty
	Array<ITEM> getSelectedItems();

	/**
	 * When <code>multiSelection</code> is true, this is an array that contains the
	 * selected items.
	 */
	@JSProperty
	void setSelectedItems(@JSByRef ITEM... selectedItems);

	@JSProperty
	void setSelectedItems(@JSByRef Array<ITEM> selectedItems);

	/**
	 * When <code>true</code>, multiple items may be selected at once (in this case,
	 * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
	 * only one item may be selected at a time.
	 */
	@JSProperty
	boolean isMultiSelection();

	/**
	 * When <code>true</code>, multiple items may be selected at once (in this case,
	 * <code>selected</code> is an array of currently selected items).  When <code>false</code>,
	 * only one item may be selected at a time.
	 */
	@JSProperty
	void setMultiSelection(boolean multiSelection);

	/**
	 * The offset top from the scrolling element to the iron-list element.
	 * This value can be computed using the position returned by
	 * <code>getBoundingClientRect()</code> although it's preferred to use a constant value
	 * when possible.
	 * <p>
	 * This property is useful when an external scrolling element is used and
	 * there's some offset between the scrolling element and the list. For
	 * example: a header is placed above the list.
	 */
	@JSProperty
	double getScrollOffset();

	/**
	 * The offset top from the scrolling element to the iron-list element.
	 * This value can be computed using the position returned by
	 * <code>getBoundingClientRect()</code> although it's preferred to use a constant value
	 * when possible.
	 * <p>
	 * This property is useful when an external scrolling element is used and
	 * there's some offset between the scrolling element and the list. For
	 * example: a header is placed above the list.
	 */
	@JSProperty
	void setScrollOffset(double scrollOffset);

	/**
	 * Gets the index of the first visible item in the viewport.
	 */
	@JSProperty
	int getFirstVisibleIndex();

	/**
	 * Gets the index of the last visible item in the viewport.
	 */
	@JSProperty
	int getLastVisibleIndex();

	/**
	 * Invoke this method if you dynamically update the viewport's
	 * size or CSS padding.
	 */
	void updateViewportBoundaries();

	/**
	 * Scroll to a specific item in the virtual list regardless
	 * of the physical items in the DOM tree.
	 *
	 * @param item The item to be scrolled to
	 */
	void scrollToItem(ITEM item);

	/**
	 * Scroll to a specific index in the virtual list regardless
	 * of the physical items in the DOM tree.
	 *
	 * @param idx The index of the item
	 */
	void scrollToIndex(int idx);

	/**
	 * Selects the given item.
	 *
	 * @param item The item instance.
	 */
	void selectItem(ITEM item);

	/**
	 * Selects the item at the given index in the items array.
	 *
	 * @param index The index of the item in the items array.
	 */
	void selectIndex(int index);

	/**
	 * Deselects the given item.
	 *
	 * @param item The item instance.
	 */
	void deselectItem(ITEM item);

	/**
	 * Deselects the item at the given index in the items array.
	 *
	 * @param index The index of the item in the items array.
	 */
	void deselectIndex(int index);

	/**
	 * Selects or deselects a given item depending on whether the item
	 * has already been selected.
	 *
	 * @param item The item object.
	 */
	void toggleSelectionForItem(ITEM item);

	/**
	 * Selects or deselects the item at the given index in the items array
	 * depending on whether the item has already been selected.
	 *
	 * @param index The index of the item in the items array.
	 */
	void toggleSelectionForIndex(int index);

	/**
	 * Clears the current selection in the list.
	 */
	void clearSelection();

	/**
	 * Updates the size of a given list item.
	 *
	 * @param item The item instance.
	 */
	void updateSizeForItem(ITEM item);

	/**
	 * Updates the size of the item at the given index in the items array.
	 *
	 * @param index The index of the item in the items array.
	 */
	void updateSizeForIndex(int index);

	/**
	 *
	 */
	void focusItem(int idx);
}
