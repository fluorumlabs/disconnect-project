package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.VerticalLayoutElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * <code>&lt;vaadin-vertical-layout&gt;</code> provides a simple way to vertically align your HTML elements.
 *
 * <pre><code>&lt;vaadin-vertical-layout&gt;
 *   &lt;div&gt;Item 1&lt;/div&gt;
 *   &lt;div&gt;Item 2&lt;/div&gt;
 * &lt;/vaadin-vertical-layout&gt;
 * </code></pre>
 * <h3>Built-in Theme Variations</h3>
 * <code>&lt;vaadin-vertical-layout&gt;</code> supports the following theme variations:
 *
 * <table>
 * <thead>
 * <tr><th>Theme variation</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>theme=&quot;margin&quot;</code></td><td>Applies the default amount of CSS margin for the host
 * element (specified by the theme)</td></tr>
 * <tr><td><code>theme=&quot;padding&quot;</code></td><td>Applies the default amount of CSS padding for the host
 * element (specified by the theme)</td></tr>
 * <tr><td><code>theme=&quot;spacing&quot;</code></td><td>Applies the default amount of CSS margin between items
 * (specified by the theme)</td></tr>
 * </tbody>
 * </table>
 */
public class VaadinVerticalLayout extends AbstractComponent<VerticalLayoutElement>
		implements HasThemableMixin<VerticalLayoutElement, VaadinVerticalLayout>,
		HasComponents<VerticalLayoutElement, VaadinVerticalLayout, Component<?>> {
	public VaadinVerticalLayout() {
		super(VerticalLayoutElement.TAGNAME());
	}
}
