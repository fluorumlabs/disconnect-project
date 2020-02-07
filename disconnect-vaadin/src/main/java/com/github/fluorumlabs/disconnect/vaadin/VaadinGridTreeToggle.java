package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.GridTreeToggleElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.extras.JsEnum;

/**
 * <code>&lt;vaadin-grid-tree-toggle&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides toggle and level display functionality for the item tree.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid-column&gt;
 *   &lt;template class=&quot;header&quot;&gt;Package name&lt;/template&gt;
 *   &lt;template&gt;
 *     &lt;vaadin-grid-tree-toggle
 *         leaf=&quot;[[!item.hasChildren]]&quot;
 *         expanded=&quot;{{expanded}}&quot;
 *         level=&quot;[[level]]&quot;&gt;
 *       [[item.name]]
 *     &lt;/vaadin-grid-tree-toggle&gt;
 *   &lt;/template&gt;
 * &lt;/vaadin-grid-column&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>toggle</code></td><td>The tree toggle icon</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>expanded</code></td><td>When present, the toggle is expanded</td><td>:host</td></tr>
 * <tr><td><code>leaf</code></td><td>When present, the toggle is not expandable, i. e., the current item is a
 * leaf</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * The following custom CSS properties are available on
 * the <code>&lt;vaadin-grid-tree-toggle&gt;</code> element:
 *
 * <table>
 * <thead>
 * <tr><th>Custom CSS property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-grid-tree-toggle-level-offset</code></td><td>Visual offset step for each tree
 * sublevel</td><td><code>1em</code></td></tr>
 * </tbody>
 * </table>
 */
public class VaadinGridTreeToggle extends AbstractComponent<GridTreeToggleElement>
		implements HasThemableMixin<VaadinGridTreeToggle.Variant, GridTreeToggleElement, VaadinGridTreeToggle>,
		HasComponents<GridTreeToggleElement, VaadinGridTreeToggle, Component<?>> {
	public VaadinGridTreeToggle() {
		super(GridTreeToggleElement.TAGNAME());
	}

	/**
	 * Current level of the tree represented with a horizontal offset
	 * of the toggle button.
	 */
	public double level() {
		return getNode().getLevel();
	}

	/**
	 * Current level of the tree represented with a horizontal offset
	 * of the toggle button.
	 */
	public VaadinGridTreeToggle level(double level) {
		getNode().setLevel(level);
		return this;
	}

	/**
	 * Hides the toggle icon and disables toggling a tree sublevel.
	 */
	public boolean leaf() {
		return getNode().isLeaf();
	}

	/**
	 * Hides the toggle icon and disables toggling a tree sublevel.
	 */
	public VaadinGridTreeToggle leaf(boolean leaf) {
		getNode().setLeaf(leaf);
		return this;
	}

	/**
	 * Sublevel toggle state.
	 */
	public boolean expanded() {
		return getNode().isExpanded();
	}

	/**
	 * Sublevel toggle state.
	 */
	public VaadinGridTreeToggle expanded(boolean expanded) {
		getNode().setExpanded(expanded);
		return this;
	}

	/**
	 * Fired when the <code>expanded</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> expandedChangedEvent() {
		return createEvent("expanded-changed");
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant CONNECTORS = JsEnum.of("connectors");

	}

}
