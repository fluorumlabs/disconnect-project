package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.SelectElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasControlStateMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.SelectRenderer;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.html.webcomponent.Template;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;
import js.web.dom.ParentNode;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <code>&lt;vaadin-select&gt;</code> is a Web Component for selecting idToValues from a list of itemToComponents.
 * The content of the
 * the select can be populated in two ways: imperatively by using renderer callback function and
 * declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the select uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides <code>root</code>, <code>select</code> arguments.
 * Generate DOM content, append it to the <code>root</code> element and control the state
 * of the host element by accessing <code>select</code>.
 *
 * <pre><code class="language-html">&lt;vaadin-select id=&quot;select&quot;&gt;&lt;/vaadin-select&gt;
 * </code></pre>
 * <pre><code class="language-js">const select = document.querySelector('#select');
 * select.renderer = function(root, select) {
 *   const listBox = document.createElement('vaadin-list-box');
 *   // append 3 &lt;vaadin-item&gt; elements
 *   ['Jose', 'Manolo', 'Pedro'].forEach(function(name) {
 *     const item = document.createElement('vaadin-item');
 *     item.textContent = name;
 *     listBox.appendChild(item);
 *   });
 *
 *   // update the content
 *   root.appendChild(listBox);
 * };
 * </code></pre>
 * Renderer is called on initialization of new select and on its opening.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the <code>root</code> argument.
 * On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template.
 * Select finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code>&lt;vaadin-select&gt;
 *   &lt;template&gt;
 *     &lt;vaadin-list-box&gt;
 *       &lt;vaadin-item label=&quot;foo&quot;&gt;Foo&lt;/vaadin-item&gt;
 *       &lt;vaadin-item&gt;Bar&lt;/vaadin-item&gt;
 *       &lt;vaadin-item&gt;Baz&lt;/vaadin-item&gt;
 *     &lt;/vaadin-list-box&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-select&gt;
 * </code></pre>
 * Hint: By setting the <code>label</code> property of inner vaadin-itemToComponents you will
 * be able to change the visual representation of the selected value in the input part.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>toggle-button</code></td><td>The toggle button</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>opened</code></td><td>Set when the select is open</td><td>:host</td></tr>
 * <tr><td><code>invalid</code></td><td>Set when the element is invalid</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>readonly</code></td><td>Set when the select is read only</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * <code>&lt;vaadin-select&gt;</code> element sets these custom CSS properties:
 *
 * <table>
 * <thead>
 * <tr><th>Property name</th><th>Description</th><th>Theme for element</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-select-text-field-width</code></td><td>Width of the select text
 * field</td><td><code>vaadin-select-overlay</code></td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 * <p>
 * In addition to <code>&lt;vaadin-select&gt;</code> itself, the following internal
 * components are themable:
 *
 * <ul>
 * <li><code>&lt;vaadin-select-text-field&gt;</code></li>
 * <li><code>&lt;vaadin-select-overlay&gt;</code></li>
 * </ul>
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-select&gt;</code> is
 * propagated to the internal themable components listed above.
 */
@WebComponent
public class Select<T> extends AbstractComponent<SelectElement>
		implements HasElementMixin<SelectElement, Select<T>>,
		HasControlStateMixin<SelectElement, Select<T>>,
		HasThemableMixin<TextField.Variant, SelectElement, Select<T>>,
		HasSlots<SelectElement>,
		HasStyle<SelectElement, Select<T>>, HasComponents<SelectElement, Select<T>, HasElement<?>> {
	/**
	 * Backing ListBox
	 */
	private ListBox backingListBox = new ListBox();

	private Map<String, T> idToValues = new HashMap<>();

	private Map<T, HasElement<?>> itemToComponents = new HashMap<>();

	private Function<T, String> idExtractor = Object::toString;

	private Function<T, HasElement<?>> itemRenderer =
			item -> {
				String id = idExtractor.apply(item);
				return new Item().value(id).text(id);
			};

	public Select() {
		super(SelectElement.TAGNAME());
		renderer(() -> backingListBox);
	}

	public Select(String label) {
		this();
		label(label);
	}

	public Select<T> setItems(Iterable<T> items, Function<T, String> idExtractor) {
		removeAll();
		this.idExtractor = idExtractor;
		items.forEach(this::add);
		return this;
	}

	public Select<T> setItems(Iterable<T> items) {
		removeAll();
		items.forEach(this::add);
		return this;
	}

	public Select<T> setItems(T[] items, Function<T, String> idExtractor) {
		removeAll();
		this.idExtractor = idExtractor;
		add(items);
		return this;
	}

	public Select<T> setItems(T... items) {
		removeAll();
		add(items);
		return this;
	}

	public Select<T> setItemRenderer(Function<T, HasElement<?>> itemRenderer) {
		this.itemRenderer = itemRenderer;
		for (Map.Entry<T, HasElement<?>> renderedItem : itemToComponents.entrySet()) {
			HasElement<?> newItem = this.itemRenderer.apply(renderedItem.getKey());
			ParentNode parentNode = renderedItem.getValue().getRenderedNode().getParentNode();
			if (parentNode != null) {
				parentNode.replaceChild(newItem.getRenderedNode(), renderedItem.getValue().getRenderedNode());
			}
		}
		return this;
	}

	/**
	 * It stores the the <code>value</code> property of the selected item, providing the
	 * value for iron-form.
	 * When there’s an item selected, it's the value of that item, otherwise
	 * it's an empty string.
	 * On change or initialization, the component finds the item which matches the
	 * value and displays it.
	 * If no value is provided to the component, it selects the first item without
	 * value or empty value.
	 * Hint: If you do not want to select any item by default, you can either set all
	 * the idToValues of inner vaadin-itemToComponents, or set the vaadin-select value to
	 * an inexistent value in the itemToComponents list.
	 */
	public ObservableValue<T> value() {
		return createObservableValue(
				() -> idToValues.get(getNode().getValue()),
				(item) -> getNode().setValue(item == null ? null : idExtractor.apply(item)),
				valueChangedEvent());
	}

	/**
	 * Set to true if the value is invalid.
	 */
	public ObservableValue<Boolean> invalid() {
		return createObservableValue(getNode()::isInvalid, getNode()::setInvalid, invalidChangedEvent());
	}

	/**
	 * Set when the select is open
	 */
	public ObservableValue<Boolean> opened() {
		return createObservableValue(getNode()::isOpened, getNode()::setOpened, openedChangedEvent());
	}

	/**
	 * Custom function for rendering the content of the <code>&lt;vaadin-select&gt;</code>.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The <code>&lt;vaadin-select-overlay&gt;</code> internal container
	 * DOM element. Append your content to it.</li>
	 * <li><code>select</code> The reference to the <code>&lt;vaadin-select&gt;</code> element.</li>
	 * </ul>
	 */
	@Nullable
	public SelectRenderer renderer() {
		return getNode().getRenderer();
	}

	/**
	 * Custom function for rendering the content of the <code>&lt;vaadin-select&gt;</code>.
	 * Receives two arguments:
	 *
	 * <ul>
	 * <li><code>root</code> The <code>&lt;vaadin-select-overlay&gt;</code> internal container
	 * DOM element. Append your content to it.</li>
	 * <li><code>select</code> The reference to the <code>&lt;vaadin-select&gt;</code> element.</li>
	 * </ul>
	 */
	public Select<T> renderer(Supplier<HasElement<?>> renderer) {
		getNode().setRenderer(((root, select) -> root.appendChild(renderer.get().getRenderedNode())));
		return this;
	}

	/**
	 * The error message to display when the select value is invalid
	 */
	@Nullable
	public String errorMessage() {
		return getNode().getErrorMessage();
	}

	/**
	 * The error message to display when the select value is invalid
	 */
	public Select<T> errorMessage(String errorMessage) {
		getNode().setErrorMessage(errorMessage);
		return this;
	}

	/**
	 * String used for the label element.
	 */
	@Nullable
	public String label() {
		return getNode().getLabel();
	}

	/**
	 * String used for the label element.
	 */
	public Select<T> label(String label) {
		getNode().setLabel(label);
		return this;
	}

	/**
	 * The current required state of the select. True if required.
	 */
	public boolean required() {
		return getNode().isRequired();
	}

	/**
	 * The current required state of the select. True if required.
	 */
	public Select<T> required(boolean required) {
		getNode().setRequired(required);
		return this;
	}

	/**
	 * The name of this element.
	 */
	@Nullable
	public String name() {
		return getNode().getName();
	}

	/**
	 * The name of this element.
	 */
	public Select<T> name(String name) {
		getNode().setName(name);
		return this;
	}

	/**
	 * A hint to the user of what can be entered in the control.
	 * The placeholder will be displayed in the case that there
	 * is no item selected, or the selected item has an empty
	 * string label, or the selected item has no label and it's
	 * DOM content is empty.
	 */
	@Nullable
	public String placeholder() {
		return getNode().getPlaceholder();
	}

	/**
	 * A hint to the user of what can be entered in the control.
	 * The placeholder will be displayed in the case that there
	 * is no item selected, or the selected item has an empty
	 * string label, or the selected item has no label and it's
	 * DOM content is empty.
	 */
	public Select<T> placeholder(String placeholder) {
		getNode().setPlaceholder(placeholder);
		return this;
	}

	/**
	 * When present, it specifies that the element is read-only.
	 */
	public boolean readonly() {
		return getNode().isReadonly();
	}

	/**
	 * When present, it specifies that the element is read-only.
	 */
	public Select<T> readonly(boolean readonly) {
		getNode().setReadonly(readonly);
		return this;
	}

	/**
	 * Manually invoke existing renderer.
	 */
	public void render() {
		getNode().render();
	}

	/**
	 * Returns true if <code>value</code> is valid, and sets the <code>invalid</code> flag appropriately.
	 *
	 * @return True if the value is valid and sets the <code>invalid</code> flag appropriately
	 */
	public boolean validate() {
		return getNode().validate();
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	/**
	 * Fired when the <code>value</code> property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}

	/**
	 * Fired when the <code>invalid</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> invalidChangedEvent() {
		return createEvent("invalid-changed");
	}

	public HasSlots.Container prefixSlot() {
		return slotted("prefix");
	}

	@Override
	public Select<T> add(HasElement<?> component) {
		backingListBox.add(component);
		return this;
	}

	public Select<T> add(T item) {
		idToValues.put(idExtractor.apply(item), item);
		return add(itemToComponents.computeIfAbsent(item, itemRenderer));
	}

	@Override
	public Select<T> add(HasElement<?>... components) {
		backingListBox.add(components);
		return this;
	}

	public Select<T> add(T... items) {
		for (T item : items) {
			add(item);
		}
		return this;
	}

	@Override
	public Select<T> insert(HasElement<?>... components) {
		backingListBox.insert(components);
		return this;
	}

	public Select<T> insert(T... items) {
		for (int i = items.length - 1; i >= 0; i--) {
			idToValues.put(idExtractor.apply(items[i]), items[i]);
			insert(itemToComponents.computeIfAbsent(items[i], itemRenderer));
		}
		return this;
	}

	@Override
	public Select<T> insert(HasElement<?> component) {
		backingListBox.insert(component);
		return this;
	}

	public Select<T> insert(T item) {
		idToValues.put(idExtractor.apply(item), item);
		insert(itemToComponents.computeIfAbsent(item, itemRenderer));
		return this;
	}

	@Override
	public Select<T> replaceContent(HasElement<?> component) {
		backingListBox.replaceContent(component);
		return this;
	}

	public Select<T> replaceContent(T item) {
		return removeAll().add(item);
	}

	@Override
	public Select<T> replaceContent(HasElement<?>... components) {
		backingListBox.replaceContent(components);
		return this;
	}

	public Select<T> replaceContent(T... items) {
		return removeAll().add(items);
	}


	@Override
	public Select<T> remove(HasElement<?> component) {
		backingListBox.remove(component);
		return this;
	}

	public Select<T> remove(T item) {
		idToValues.remove(idExtractor.apply(item));
		HasElement<?> component = itemToComponents.get(item);
		if (component != null) {
			itemToComponents.remove(item);
			remove(component);
		}
		return this;
	}

	@Override
	public Select<T> remove(HasElement<?>... components) {
		backingListBox.remove(components);
		return this;
	}

	public Select<T> remove(T... items) {
		for (T item : items) {
			remove(item);
		}
		return this;
	}

	@Override
	public Select<T> removeAll() {
		backingListBox.removeAll();
		idToValues.clear();
		itemToComponents.clear();
		return this;
	}

	@Override
	public Select<T> stamp(Template template) {
		backingListBox.stamp(template);
		return this;
	}

	@Override
	public Select<T> stamp(Template template, boolean deepClone) {
		backingListBox.stamp(template, deepClone);
		return this;
	}

	@Override
	public Select<T> stampReplace(Template template) {
		backingListBox.stampReplace(template);
		return this;
	}

	@Override
	public Select<T> stampReplace(Template template, boolean deepClone) {
		backingListBox.stampReplace(template, deepClone);
		return this;
	}

	@Override
	public Select<T> stampInsert(Template template) {
		backingListBox.stampInsert(template);
		return this;
	}

	@Override
	public Select<T> stampInsert(Template template, boolean deepClone) {
		backingListBox.stampInsert(template, deepClone);
		return this;
	}

	@Override
	public Select<T> text(String text) {
		backingListBox.text(text);
		return this;
	}

	@Override
	public String text() {
		return backingListBox.text();
	}
}
