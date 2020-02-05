package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.mixins.HasGestureEventListeners;
import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.elements.SplitLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-split-layout&gt;</code> is a Web Component implementing a split layout for two
 * content elements with a draggable splitter between them.
 *
 * <pre><code class="language-html">&lt;vaadin-split-layout&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;div&gt;Second content element&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3>Horizontal and Vertical Layouts</h3>
 * By default, the split's orientation is horizontal, meaning that the content elements are
 * positioned side by side in a flex container with a horizontal layout.
 * <p>
 * You can change the split mode to vertical by setting the <code>orientation</code> attribute to <code>&quot;
 * vertical&quot;</code>:
 *
 * <pre><code class="language-html">&lt;vaadin-split-layout orientation=&quot;vertical&quot;&gt;
 *   &lt;div&gt;Content on the top&lt;/div&gt;
 *   &lt;div&gt;Content on the bottom&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3>Layouts Combination</h3>
 * For the layout contents, we usually use <code>&lt;div&gt;</code> elements in the examples,
 * although you can use any other elements as well.
 * <p>
 * For instance, in order to have a nested vertical split layout inside a
 * horizontal one, you can include <code>&lt;vaadin-split-layout&gt;</code> as a content element
 * inside another split layout:
 *
 * <pre><code class="language-html">&lt;vaadin-split-layout&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;vaadin-split-layout orientation=&quot;vertical&quot;&gt;
 *     &lt;div&gt;Second content element&lt;/div&gt;
 *     &lt;div&gt;Third content element&lt;/div&gt;
 *   &lt;/vaadin-split-layout&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * You can also trigger the vertical mode in JavaScript by setting the property:
 * <code>splitLayout.orientation = &quot;vertical&quot;;</code>.
 *
 * <h3>Split Layout Element Height</h3>
 * <code>&lt;vaadin-split-layout&gt;</code> element itself is a flex container. It does not inherit
 * the parent height by default, but rather sets its height depending on the
 * content.
 * <p>
 * You can use CSS to set the fixed height for the split layout, as usual with any
 * block element:
 *
 * <pre><code class="language-html">&lt;vaadin-split-layout style=&quot;height: 200px;&quot;&gt;
 *   &lt;div&gt;First content element&lt;/div&gt;
 *   &lt;div&gt;Second content element&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * It is possible to define percentage height as well. Note that you have to set
 * the parent height in order to make percentages work correctly. In the following
 * example, the <code>&lt;body&gt;</code> is resized to fill the entire viewport, and the
 * <code>&lt;vaadin-split-layout&gt;</code> element is set to take 100% height of the <code>&lt;body&gt;</code>:
 *
 * <pre><code class="language-html">&lt;body style=&quot;height: 100vh; margin: 0;&quot;&gt;
 *   &lt;vaadin-split-layout style=&quot;height: 100%;&quot;&gt;
 *     &lt;div&gt;First&lt;/div&gt;
 *     &lt;div&gt;Second&lt;/div&gt;
 *   &lt;/vaadin-split-layout&gt;
 * &lt;/body&gt;
 * </code></pre>
 * Alternatively, you can use a flexbox layout to make <code>&lt;vaadin-split-layout&gt;</code>
 * fill up the parent:
 *
 * <pre><code class="language-html">&lt;body style=&quot;height: 100vh; margin: 0; display: flex;&quot;&gt;
 *   &lt;vaadin-split-layout style=&quot;flex: 1;&quot;&gt;
 *     &lt;div&gt;First&lt;/div&gt;
 *     &lt;div&gt;Second&lt;/div&gt;
 *   &lt;/vaadin-split-layout&gt;
 * &lt;/body&gt;
 * </code></pre>
 * <h3>Initial Splitter Position</h3>
 * The initial splitter position is determined from the sizes of the content elements
 * inside the split layout. Therefore, changing <code>width</code> on the content elements
 * affects the initial splitter position for the horizontal layouts, while <code>height</code>
 * affects the vertical ones.
 * <p>
 * Note that when the total size of the content elements does not fit the layout,
 * the content elements are scaled proportionally.
 * <p>
 * When setting initial sizes with relative units, such as percentages, it is
 * recommended to assign the size for both content elements:
 *
 * <pre><code class="language-html">&lt;vaadin-split-layout&gt;
 *   &lt;div style=&quot;width: 75%;&quot;&gt;Three fourths&lt;/div&gt;
 *   &lt;div style=&quot;width: 25%;&quot;&gt;One fourth&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3>Size Limits</h3>
 * The <code>min-width</code>/<code>min-height</code>, and <code>max-width</code>/<code>max-height</code> CSS size
 * values
 * for the content elements are respected and used to limit the splitter position
 * when it is dragged.
 * <p>
 * It is preferred to set the limits only for a single content element, in order
 * to avoid size conflicts:
 *
 * <pre><code class="language-html">&lt;vaadin-split-layout&gt;
 *   &lt;div style=&quot;min-width: 50px; max-width: 150px;&quot;&gt;First&lt;/div&gt;
 *   &lt;div&gt;Second&lt;/div&gt;
 * &lt;/vaadin-split-layout&gt;
 * </code></pre>
 * <h3>Resize Notification</h3>
 * This element implements <code>IronResizableBehavior</code> to notify the nested resizables
 * when the splitter is dragged. In order to define a resizable and receive that
 * notification in a nested element, include <code>IronResizableBehavior</code> and listen
 * for the <code>iron-resize</code> event.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th><th>Theme for Element</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>splitter</code></td><td>Split element</td><td>vaadin-split-layout</td></tr>
 * <tr><td><code>handle</code></td><td>The handle of the splitter</td><td>vaadin-split-layout</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinSplitLayout extends AbstractComponent<SplitLayoutElement>
		implements HasThemableMixin<SplitLayoutElement, VaadinSplitLayout>,
		HasGestureEventListeners<SplitLayoutElement, VaadinSplitLayout>,
		HasSlottedComponents<SplitLayoutElement, VaadinSplitLayout, Component<? extends Element>> {
	public VaadinSplitLayout() {
		super("vaadin-split-layout");
	}

	/**
	 * The split layout's orientation. Possible values are: <code>horizontal|vertical</code>.
	 */
	@Nullable
	public Orientation orientation() {
		return getNode().getOrientation();
	}

	/**
	 * The split layout's orientation. Possible values are: <code>horizontal|vertical</code>.
	 */
	public VaadinSplitLayout orientation(Orientation orientation) {
		getNode().setOrientation(orientation);
		return this;
	}

	/**
	 * Fired when the splitter is dragged. Non-bubbling. Fired for the splitter
	 * element and any nested elements with <code>IronResizableBehavior</code>.
	 */
	public ObservableEvent<Event> ironResizeEvent() {
		return createEvent("iron-resize");
	}

	/**
	 * Fired after dragging the splitter have ended.
	 */
	public ObservableEvent<Event> splitterDragendEvent() {
		return createEvent("splitter-dragend");
	}

	public VaadinSplitLayout setPrimary(Component<? extends Element> component) {
		return replaceSlotted("primary", component);
	}

	public VaadinSplitLayout setPrimary(Component<? extends Element>... components) {
		return replaceSlotted("primary", components);
	}

	public VaadinSplitLayout addToPrimary(Component<? extends Element> component) {
		return addSlotted("primary", component);
	}

	public VaadinSplitLayout addToPrimary(Component<? extends Element>... components) {
		return addSlotted("primary", components);
	}

	public VaadinSplitLayout insertToPrimary(Component<? extends Element> component) {
		return insertSlotted("primary", component);
	}

	public VaadinSplitLayout insertToPrimary(Component<? extends Element>... components) {
		return insertSlotted("primary", components);
	}

	public VaadinSplitLayout clearPrimary() {
		return removeAllSlotted("primary");
	}

	public VaadinSplitLayout setSecondary(Component<? extends Element> component) {
		return replaceSlotted("secondary", component);
	}

	public VaadinSplitLayout setSecondary(Component<? extends Element>... components) {
		return replaceSlotted("secondary", components);
	}

	public VaadinSplitLayout addToSecondary(Component<? extends Element> component) {
		return addSlotted("secondary", component);
	}

	public VaadinSplitLayout addToSecondary(Component<? extends Element>... components) {
		return addSlotted("secondary", components);
	}

	public VaadinSplitLayout insertToSecondary(Component<? extends Element> component) {
		return insertSlotted("secondary", component);
	}

	public VaadinSplitLayout insertToSecondary(Component<? extends Element>... components) {
		return insertSlotted("secondary", components);
	}

	public VaadinSplitLayout clearSecondary() {
		return removeAllSlotted("secondary");
	}
}
