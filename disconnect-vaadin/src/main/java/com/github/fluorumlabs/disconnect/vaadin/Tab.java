package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.TabElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasItemMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.ThemeVariant;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.extras.JsEnum;

/**
 * <code>&lt;vaadin-tab&gt;</code> is a Web Component providing an accessible and customizable tab.
 *
 * <pre><code>  &lt;vaadin-tab&gt;
 *     Tab 1
 *   &lt;/vaadin-tab&gt;
 * </code></pre>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>disabled</code></td><td>Set to a disabled tab</td><td>:host</td></tr>
 * <tr><td><code>focused</code></td><td>Set when the element is focused</td><td>:host</td></tr>
 * <tr><td><code>focus-ring</code></td><td>Set when the element is keyboard focused</td><td>:host</td></tr>
 * <tr><td><code>selected</code></td><td>Set when the tab is selected</td><td>:host</td></tr>
 * <tr><td><code>active</code></td><td>Set when mousedown or enter/spacebar pressed</td><td>:host</td></tr>
 * <tr><td><code>orientation</code></td><td>Set to <code>horizontal</code> or <code>vertical</code> depending on the
 * direction of items</td><td>:host</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
@WebComponent
public class Tab extends AbstractComponent<TabElement> implements HasElementMixin<TabElement, Tab>,
		HasThemableMixin<Tab.Variant, TabElement, Tab>,
		HasItemMixin<TabElement, Tab>,
		HasStyle<TabElement, Tab>, HasComponents<TabElement, Tab, HasElement<?>> {
	public Tab() {
		super(TabElement.TAGNAME());
	}

	public abstract static class Variant extends ThemeVariant {
		public static final Variant ICON_ON_TOP = JsEnum.of("icon-on-top");

	}

}
