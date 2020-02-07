package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.elements.TabsElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasListMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.extras.JsEnum;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-tabs&gt;</code> is a Web Component for easy switching between different views.
 *
 * <pre><code>  &lt;vaadin-tabs selected=&quot;4&quot;&gt;
 *     &lt;vaadin-tab&gt;Page 1&lt;/vaadin-tab&gt;
 *     &lt;vaadin-tab&gt;Page 2&lt;/vaadin-tab&gt;
 *     &lt;vaadin-tab&gt;Page 3&lt;/vaadin-tab&gt;
 *     &lt;vaadin-tab&gt;Page 4&lt;/vaadin-tab&gt;
 *   &lt;/vaadin-tabs&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>back-button</code></td><td>Button for moving the scroll back</td></tr>
 * <tr><td><code>tabs</code></td><td>The tabs container</td></tr>
 * <tr><td><code>forward-button</code></td><td>Button for moving the scroll forward</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>orientation</code></td><td>Tabs disposition, valid values are <code>horizontal</code> and
 * <code>vertical</code>.</td><td>:host</td></tr>
 * <tr><td><code>overflow</code></td><td>It's set to <code>start</code>, <code>end</code>, none or both
 * .</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinTabs extends AbstractComponent<TabsElement> implements HasElementMixin<TabsElement, VaadinTabs>,
		HasListMixin<TabsElement, VaadinTabs>,
		HasThemableMixin<VaadinTabs.Variant, TabsElement, VaadinTabs>,
		HasComponents<TabsElement, VaadinTabs, Component<?>> {
	public VaadinTabs() {
		super(TabsElement.TAGNAME());
	}

	/**
	 * Set tabs disposition. Possible values are <code>horizontal|vertical</code>
	 */
	@Nullable
	public Orientation orientation() {
		return getNode().getOrientation();
	}

	/**
	 * Set tabs disposition. Possible values are <code>horizontal|vertical</code>
	 */
	public VaadinTabs orientation(Orientation orientation) {
		getNode().setOrientation(orientation);
		return this;
	}

	/**
	 * The index of the selected tab.
	 */
	public int selected() {
		return getNode().getSelected();
	}

	/**
	 * The index of the selected tab.
	 */
	public VaadinTabs selected(int selected) {
		getNode().setSelected(selected);
		return this;
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant CENTERED = JsEnum.of("centered");
		public static final Variant SMALL = JsEnum.of("small");
		public static final Variant MINIMAL = JsEnum.of("minimal");
		public static final Variant HIDE_SCROLL_BUTTONS = JsEnum.of("hide-scroll-buttons");
		public static final Variant EQUAL_WIDTH_TABS = JsEnum.of("equal-width-tabs");
	}

}
