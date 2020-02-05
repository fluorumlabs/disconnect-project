package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;

/**
 * The cell editor checkbox element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-checkbox>` documentation](https://github.com/vaadin/vaadin-checkbox/blob/master/src/vaadin-checkbox
 * .html)
 * for `<vaadin-checkbox>` parts.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "GridProEditCheckboxElement",
        module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-edit-checkbox.js"
)
public interface GridProEditCheckboxElement extends CheckboxElement {
}
