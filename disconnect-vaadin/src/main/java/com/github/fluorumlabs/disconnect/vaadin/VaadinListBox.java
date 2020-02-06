package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.ListBoxElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasMultiSelectListMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * <code>&lt;vaadin-list-box&gt;</code> is a Web Component for creating menus.
 *
 * <pre><code>  &lt;vaadin-list-box selected=&quot;2&quot;&gt;
 *     &lt;vaadin-item&gt;Item 1&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 2&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 3&lt;/vaadin-item&gt;
 *     &lt;vaadin-item&gt;Item 4&lt;/vaadin-item&gt;
 *   &lt;/vaadin-list-box&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>items</code></td><td>The items container</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinListBox extends AbstractComponent<ListBoxElement>
		implements HasMultiSelectListMixin<ListBoxElement, VaadinListBox>,
		HasThemableMixin<ListBoxElement, VaadinListBox>,
		HasComponents<ListBoxElement, VaadinListBox, Component<?>> {
	public VaadinListBox() {
		super(ListBoxElement.TAGNAME());
	}
}
