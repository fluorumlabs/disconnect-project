package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;

/**
 * `<vaadin-horizontal-layout>` provides a simple way to horizontally align your HTML elements.
 * <p>
 * ```
 * <vaadin-horizontal-layout>
 * <div>Item 1</div>
 * <div>Item 2</div>
 * </vaadin-horizontal-layout>
 * ```
 * <p>
 * ### Built-in Theme Variations
 * <p>
 * `<vaadin-horizontal-layout>` supports the following theme variations:
 * <p>
 * Theme variation | Description
 * ---|---
 * `theme="margin"` | Applies the default amount of CSS margin for the host element (specified by the theme)
 * `theme="padding"` | Applies the default amount of CSS padding for the host element (specified by the theme)
 * `theme="spacing"` | Applies the default amount of CSS margin between items (specified by the theme)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "HorizontalLayoutElement",
        module = "@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js"
)
public interface HorizontalLayoutElement extends HTMLElement, ThemableMixin {
}
