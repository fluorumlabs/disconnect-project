package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.ArraySelectorMixin;
import js.lang.Any;

/**
 * Element implementing the <code>ArraySelector</code> mixin, which records
 * dynamic associations between item paths in a master <code>items</code> array and a
 * <code>selected</code> array such that path changes to the master array (at the host)
 * element or elsewhere via data-binding) are correctly propagated to items
 * in the selected array and vice-versa.
 * <p>
 * The <code>items</code> property accepts an array of user data, and via the
 * <code>select(item)</code> and <code>deselect(item)</code> API, updates the <code>selected</code> property
 * which may be bound to other parts of the application, and any changes to
 * sub-fields of <code>selected</code> item(s) will be kept in sync with items in the
 * <code>items</code> array.  When <code>multi</code> is false, <code>selected</code> is a property
 * representing the last selected item.  When <code>multi</code> is true, <code>selected</code>
 * is an array of multiply selected items.
 * <p>
 * Example:
 *
 * <pre><code class="language-js">import {PolymerElement} from '@polymer/polymer';
 * import '@polymer/polymer/lib/elements/array-selector.js';
 *
 * class EmployeeList extends PolymerElement {
 *   static get _template() {
 *     return html`
 *         &lt;div&gt; Employee list: &lt;/div&gt;
 *         &lt;dom-repeat id=&quot;employeeList&quot; items=&quot;{{employees}}&quot;&gt;
 *           &lt;template&gt;
 *             &lt;div&gt;First name: &lt;span&gt;{{item.first}}&lt;/span&gt;&lt;/div&gt;
 *               &lt;div&gt;Last name: &lt;span&gt;{{item.last}}&lt;/span&gt;&lt;/div&gt;
 *               &lt;button on-click=&quot;toggleSelection&quot;&gt;Select&lt;/button&gt;
 *           &lt;/template&gt;
 *         &lt;/dom-repeat&gt;
 *
 *         &lt;array-selector id=&quot;selector&quot;
 *                         items=&quot;{{employees}}&quot;
 *                         selected=&quot;{{selected}}&quot;
 *                         multi toggle&gt;&lt;/array-selector&gt;
 *
 *         &lt;div&gt; Selected employees: &lt;/div&gt;
 *         &lt;dom-repeat items=&quot;{{selected}}&quot;&gt;
 *           &lt;template&gt;
 *             &lt;div&gt;First name: &lt;span&gt;{{item.first}}&lt;/span&gt;&lt;/div&gt;
 *             &lt;div&gt;Last name: &lt;span&gt;{{item.last}}&lt;/span&gt;&lt;/div&gt;
 *           &lt;/template&gt;
 *         &lt;/dom-repeat&gt;`;
 *   }
 *   static get is() { return 'employee-list'; }
 *   static get properties() {
 *     return {
 *       employees: {
 *         value() {
 *           return [
 *             {first: 'Bob', last: 'Smith'},
 *             {first: 'Sally', last: 'Johnson'},
 *             ...
 *           ];
 *         }
 *       }
 *     };
 *   }
 *   toggleSelection(e) {
 *     const item = this.$.employeeList.itemForElement(e.target);
 *     this.$.selector.select(item);
 *   }
 * }
 * </code></pre>
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "ArraySelector",
		module = "@polymer/polymer/lib/elements/array-selector.js"
)
public interface ArraySelectorElement<ITEM extends Any> extends PolymerElement, ArraySelectorMixin<ITEM> {
	String TAGNAME = "array-selector";
}
