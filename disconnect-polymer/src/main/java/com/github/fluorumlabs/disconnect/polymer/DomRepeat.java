package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.DomRepeatElement;
import com.github.fluorumlabs.disconnect.polymer.elements.TemplateInstanceBase;
import com.github.fluorumlabs.disconnect.polymer.mixins.HasOptionalMutableData;
import com.github.fluorumlabs.disconnect.polymer.types.IntPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponent;
import com.github.fluorumlabs.disconnect.zero.component.Template;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Any;
import js.util.collections.Array;
import js.util.function.IntKeyPredicate;
import js.util.function.JsComparator;
import js.web.dom.Event;
import js.web.dom.HTMLElement;

import javax.annotation.Nullable;

/**
 * The `<dom-repeat>` element will automatically stamp and binds one instance
 * of template content to each object in a user-provided array.
 * `dom-repeat` accepts an `items` property, and one instance of the template
 * is stamped for each item into the DOM at the location of the `dom-repeat`
 * element.  The `item` property will be set on each instance's binding
 * scope, thus templates should bind to sub-properties of `item`.
 * <p>
 * Example:
 * <p>
 * ```html
 * <dom-module id="employee-list">
 *
 * <template>
 *
 * <div> Employee list: </div>
 * <dom-repeat items="{{employees}}">
 * <template>
 * <div>First name: <span>{{item.first}}</span></div>
 * <div>Last name: <span>{{item.last}}</span></div>
 * </template>
 * </dom-repeat>
 *
 * </template>
 * <p>
 * </dom-module>
 * ```
 * <p>
 * With the following custom element definition:
 * <p>
 * ```js
 * class EmployeeList extends PolymerElement {
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
 * }
 * ```
 * <p>
 * Notifications for changes to items sub-properties will be forwarded to template
 * instances, which will update via the normal structured data notification system.
 * <p>
 * Mutations to the `items` array itself should be made using the Array
 * mutation API's on the PropertyEffects mixin (`push`, `pop`, `splice`,
 * `shift`, `unshift`), and template instances will be kept in sync with the
 * data in the array.
 * <p>
 * Events caught by event handlers within the `dom-repeat` template will be
 * decorated with a `model` property, which represents the binding scope for
 * each template instance.  The model should be used to manipulate data on the
 * instance, for example `event.model.set('item.checked', true);`.
 * <p>
 * Alternatively, the model for a template instance for an element stamped by
 * a `dom-repeat` can be obtained using the `modelForElement` API on the
 * `dom-repeat` that stamped it, for example
 * `this.$.domRepeat.modelForElement(event.target).set('item.checked', true);`.
 * This may be useful for manipulating instance data of event targets obtained
 * by event handlers on parents of the `dom-repeat` (event delegation).
 * <p>
 * A view-specific filter/sort may be applied to each `dom-repeat` by supplying a
 * `filter` and/or `sort` property.  This may be a string that names a function on
 * the host, or a function may be assigned to the property directly.  The functions
 * should implemented following the standard `Array` filter/sort API.
 * <p>
 * In order to re-run the filter or sort functions based on changes to sub-fields
 * of `items`, the `observe` property may be set as a space-separated list of
 * `item` sub-fields that should cause a re-filter/sort when modified.  If
 * the filter or sort function depends on properties not contained in `items`,
 * the user should observe changes to those properties and call `render` to update
 * the view based on the dependency change.
 * <p>
 * For example, for an `dom-repeat` with a filter of the following:
 * <p>
 * ```js
 * isEngineer(item) {
 * return item.type == 'engineer' || item.manager.type == 'engineer';
 * }
 * ```
 * <p>
 * Then the `observe` property should be configured as follows:
 * <p>
 * ```html
 * <dom-repeat items="{{employees}}" filter="isEngineer" observe="type manager.type">
 * ```
 */
public class DomRepeat<ITEM extends Any>
        extends AbstractComponent<DomRepeatElement<ITEM>>
        implements HasOptionalMutableData<DomRepeatElement<ITEM>, DomRepeat<ITEM>>,
        HasComponent<DomRepeatElement<ITEM>, DomRepeat<ITEM>, Template> {
    public DomRepeat() {
        super("dom-repeat");
    }

    public DomRepeat(Component<?>... components) {
        this();
        Template template = new Template();
        template.add(components);
        setContent(template);
    }

    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    @Nullable
    public Array<ITEM> items() {
        return getNode().getItems();
    }

    /**
     * An array containing items determining how many instances of the template
     * to stamp and that that each template instance should bind to.
     */
    public DomRepeat<ITEM> items(ITEM... items) {
        getNode().setItems(items);
        return this;
    }

    public DomRepeat<ITEM> items(Array<ITEM> items) {
        getNode().setItems(items);
        return this;
    }

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    @Nullable
    public String as() {
        return getNode().getAs();
    }

    /**
     * The name of the variable to add to the binding scope for the array
     * element associated with a given template instance.
     */
    public DomRepeat<ITEM> as(String as) {
        getNode().setAs(as);
        return this;
    }

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the sorted and filtered list of rendered items.
     * Note, for the index in the `this.items` array, use the value of the
     * `itemsIndexAs` property.
     */
    @Nullable
    public String indexAs() {
        return getNode().getIndexAs();
    }

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the sorted and filtered list of rendered items.
     * Note, for the index in the `this.items` array, use the value of the
     * `itemsIndexAs` property.
     */
    public DomRepeat<ITEM> indexAs(String indexAs) {
        getNode().setIndexAs(indexAs);
        return this;
    }

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the `this.items` array. Note, for the index of
     * this instance in the sorted and filtered list of rendered items,
     * use the value of the `indexAs` property.
     */
    @Nullable
    public String itemsIndexAs() {
        return getNode().getItemsIndexAs();
    }

    /**
     * The name of the variable to add to the binding scope with the index
     * of the instance in the `this.items` array. Note, for the index of
     * this instance in the sorted and filtered list of rendered items,
     * use the value of the `indexAs` property.
     */
    public DomRepeat<ITEM> itemsIndexAs(String itemsIndexAs) {
        getNode().setItemsIndexAs(itemsIndexAs);
        return this;
    }

    /**
     * A function that should determine the sort order of the items.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.sort`.
     * Using a sort function has no effect on the underlying `items` array.
     */
    @Nullable
    public JsComparator<ITEM> sort() {
        return getNode().getSort();
    }

    /**
     * A function that should determine the sort order of the items.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.sort`.
     * Using a sort function has no effect on the underlying `items` array.
     */
    public DomRepeat<ITEM> sort(JsComparator<ITEM> sort) {
        getNode().setSort(sort);
        return this;
    }

    /**
     * A function that can be used to filter items out of the view.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.filter`.
     * Using a filter function has no effect on the underlying `items` array.
     */
    @Nullable
    public IntKeyPredicate<ITEM, Array<ITEM>> filter() {
        return getNode().getFilter();
    }

    /**
     * A function that can be used to filter items out of the view.  This
     * property should either be provided as a string, indicating a method
     * name on the element's host, or else be an actual function.  The
     * function should match the sort function passed to `Array.filter`.
     * Using a filter function has no effect on the underlying `items` array.
     */
    public DomRepeat<ITEM> filter(IntKeyPredicate<ITEM, Array<ITEM>> filter) {
        getNode().setFilter(filter);
        return this;
    }

    /**
     * When using a `filter` or `sort` function, the `observe` property
     * should be set to a space-separated list of the names of item
     * sub-fields that should trigger a re-sort or re-filter when changed.
     * These should generally be fields of `item` that the sort or filter
     * function depends on.
     */
    @Nullable
    public String observe() {
        return getNode().getObserve();
    }

    /**
     * When using a `filter` or `sort` function, the `observe` property
     * should be set to a space-separated list of the names of item
     * sub-fields that should trigger a re-sort or re-filter when changed.
     * These should generally be fields of `item` that the sort or filter
     * function depends on.
     */
    public DomRepeat<ITEM> observe(String observe) {
        getNode().setObserve(observe);
        return this;
    }

    /**
     * When using a `filter` or `sort` function, the `delay` property
     * determines a debounce time in ms after a change to observed item
     * properties that must pass before the filter or sort is re-run.
     * This is useful in rate-limiting shuffling of the view when
     * item changes may be frequent.
     */
    public double delay() {
        return getNode().getDelay();
    }

    /**
     * When using a `filter` or `sort` function, the `delay` property
     * determines a debounce time in ms after a change to observed item
     * properties that must pass before the filter or sort is re-run.
     * This is useful in rate-limiting shuffling of the view when
     * item changes may be frequent.
     */
    public DomRepeat<ITEM> delay(double delay) {
        getNode().setDelay(delay);
        return this;
    }

    /**
     * Count of currently rendered items after `filter` (if any) has been applied.
     * If "chunking mode" is enabled, `renderedItemCount` is updated each time a
     * set of template instances is rendered.
     */
    public int renderedItemCount() {
        return getNode().getRenderedItemCount();
    }

    /**
     * Defines an initial count of template instances to render after setting
     * the `items` array, before the next paint, and puts the `dom-repeat`
     * into "chunking mode".  The remaining items will be created and rendered
     * incrementally at each animation frame therof until all instances have
     * been rendered.
     */
    public int initialCount() {
        return getNode().getInitialCount();
    }

    /**
     * Defines an initial count of template instances to render after setting
     * the `items` array, before the next paint, and puts the `dom-repeat`
     * into "chunking mode".  The remaining items will be created and rendered
     * incrementally at each animation frame therof until all instances have
     * been rendered.
     */
    public DomRepeat<ITEM> initialCount(int initialCount) {
        getNode().setInitialCount(initialCount);
        return this;
    }

    /**
     * When `initialCount` is used, this property defines a frame rate (in
     * fps) to target by throttling the number of instances rendered each
     * frame to not exceed the budget for the target frame rate.  The
     * framerate is effectively the number of `requestAnimationFrame`s that
     * it tries to allow to actually fire in a given second. It does this
     * by measuring the time between `rAF`s and continuously adjusting the
     * number of items created each `rAF` to maintain the target framerate.
     * Setting this to a higher number allows lower latency and higher
     * throughput for event handlers and other tasks, but results in a
     * longer time for the remaining items to complete rendering.
     */
    public double targetFramerate() {
        return getNode().getTargetFramerate();
    }

    /**
     * When `initialCount` is used, this property defines a frame rate (in
     * fps) to target by throttling the number of instances rendered each
     * frame to not exceed the budget for the target frame rate.  The
     * framerate is effectively the number of `requestAnimationFrame`s that
     * it tries to allow to actually fire in a given second. It does this
     * by measuring the time between `rAF`s and continuously adjusting the
     * number of items created each `rAF` to maintain the target framerate.
     * Setting this to a higher number allows lower latency and higher
     * throughput for event handlers and other tasks, but results in a
     * longer time for the remaining items to complete rendering.
     */
    public DomRepeat<ITEM> targetFramerate(double targetFramerate) {
        getNode().setTargetFramerate(targetFramerate);
        return this;
    }

    /**
     * Forces the element to render its content. Normally rendering is
     * asynchronous to a provoking change. This is done for efficiency so
     * that multiple changes trigger only a single render. The render method
     * should be called if, for example, template rendering is required to
     * validate application state.
     */
    public void render() {
        getNode().render();
    }

    /**
     * Returns the item associated with a given element stamped by
     * this `dom-repeat`.
     * <p>
     * Note, to modify sub-properties of the item,
     * `modelForElement(el).set('item.<sub-prop>', value)`
     * should be used.
     *
     * @param el Element for which to return the item.
     *
     * @return Item associated with the element.
     */
    public ITEM itemForElement(HTMLElement el) {
        return getNode().itemForElement(el);
    }

    /**
     * Returns the inst index for a given element stamped by this `dom-repeat`.
     * If `sort` is provided, the index will reflect the sorted order (rather
     * than the original array order).
     *
     * @param el Element for which to return the index.
     *
     * @return Row index associated with the element (note this may
     *         not correspond to the array index if a user `sort` is applied).
     */
    public int indexForElement(HTMLElement el) {
        return getNode().indexForElement(el);
    }

    /**
     * Returns the template "model" associated with a given element, which
     * serves as the binding scope for the template instance the element is
     * contained in. A template model
     * should be used to manipulate data associated with this template instance.
     * <p>
     * Example:
     * <p>
     * let model = modelForElement(el);
     * if (model.index < 10) {
     * model.set('item.checked', true);
     * }
     *
     * @param el Element for which to return a template model.
     *
     * @return Model representing the binding scope for
     *         the element.
     */
    public TemplateInstanceBase modelForElement(HTMLElement el) {
        return getNode().modelForElement(el);
    }

    /**
     * Fired whenever DOM is added or removed by this template (by
     * default, rendering occurs lazily).  To force immediate rendering, call
     * `render`.
     */
    public ObservableEvent<Event> domChangeEvent() {
        return createEvent("dom-change");
    }

    /**
     * Fired when the `renderedItemCount` property changes.
     */
    public ObservableEvent<IntPropertyChangeEvent> renderedItemCountChangedEvent() {
        return createEvent("rendered-item-count-changed");
    }
}
