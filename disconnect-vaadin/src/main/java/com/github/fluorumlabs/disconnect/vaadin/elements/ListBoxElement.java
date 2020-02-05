package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.MultiSelectListMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

/**
 * `<vaadin-list-box>` is a Web Component for creating menus.
 * <p>
 * ```
 * <vaadin-list-box selected="2">
 * <vaadin-item>Item 1</vaadin-item>
 * <vaadin-item>Item 2</vaadin-item>
 * <vaadin-item>Item 3</vaadin-item>
 * <vaadin-item>Item 4</vaadin-item>
 * </vaadin-list-box>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name         | Description
 * ------------------|------------------------
 * `items`           | The items container
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ListBoxElement",
		module = "@vaadin/vaadin-list-box/src/vaadin-list-box.js"
)
public interface ListBoxElement extends HTMLElement, MultiSelectListMixin, ThemableMixin {
}
