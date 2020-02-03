package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.ArraySelectorElement;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasArraySelectorMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import js.lang.Any;

/**
 * Element implementing the `ArraySelector` mixin, which records
 * dynamic associations between item paths in a master `items` array and a
 * `selected` array such that path changes to the master array (at the host)
 * element or elsewhere via data-binding) are correctly propagated to items
 * in the selected array and vice-versa.
 * <p>
 * The `items` property accepts an array of user data, and via the
 * `select(item)` and `deselect(item)` API, updates the `selected` property
 * which may be bound to other parts of the application, and any changes to
 * sub-fields of `selected` item(s) will be kept in sync with items in the
 * `items` array.  When `multi` is false, `selected` is a property
 * representing the last selected item.  When `multi` is true, `selected`
 * is an array of multiply selected items.
 * <p>
 * Example:
 * <p>
 * ```js
 * import {PolymerElement} from '@polymer/polymer';
 * import '@polymer/polymer/lib/elements/array-selector.js';
 * <p>
 * class EmployeeList extends PolymerElement {
 * static get _template() {
 * return html`
 * <div> Employee list: </div>
 * <dom-repeat id="employeeList" items="{{employees}}">
 * <template>
 * <div>First name: <span>{{item.first}}</span></div>
 * <div>Last name: <span>{{item.last}}</span></div>
 * <button on-click="toggleSelection">Select</button>
 * </template>
 * </dom-repeat>
 * <p>
 * <array-selector id="selector"
 * items="{{employees}}"
 * selected="{{selected}}"
 * multi toggle></array-selector>
 *
 * <div> Selected employees: </div>
 * <dom-repeat items="{{selected}}">
 * <template>
 * <div>First name: <span>{{item.first}}</span></div>
 * <div>Last name: <span>{{item.last}}</span></div>
 * </template>
 * </dom-repeat>`;
 * }
 * static get is() { return 'employee-list'; }
 * static get properties() {
 * return {
 * employees: {
 * value() {
 * return [
 * {first: 'Bob', last: 'Smith'},
 * {first: 'Sally', last: 'Johnson'},
 * ...
 * ];
 * }
 * }
 * };
 * }
 * toggleSelection(e) {
 * const item = this.$.employeeList.itemForElement(e.target);
 * this.$.selector.select(item);
 * }
 * }
 * ```
 */
public class ArraySelector<ITEM extends Any>
        extends AbstractComponent<ArraySelectorElement<ITEM>>
        implements HasArraySelectorMixin<ITEM, ArraySelectorElement<ITEM>, ArraySelector<ITEM>> {
    public ArraySelector() {
        super("array-selector");
    }
}
