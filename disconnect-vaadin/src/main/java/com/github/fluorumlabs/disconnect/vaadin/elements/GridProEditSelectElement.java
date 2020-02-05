package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The cell editor select element.
 * <p>
 * ### Styling
 * <p>
 * See [`<vaadin-select>` documentation](https://github.com/vaadin/vaadin-select/blob/master/src/vaadin-select.html)
 * for `<vaadin-grid-pro-edit-select>` parts.
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "GridProEditSelectElement",
        module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro-edit-select.js"
)
public interface GridProEditSelectElement extends SelectElement {
    @Nullable
    @JSProperty
    String[] getOptions();

    @JSProperty
    void setOptions(@JSByRef String... options);
}
