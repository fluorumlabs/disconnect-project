package com.github.fluorumlabs.disconnect.vaadin.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(symbols = "registerStyles", module = "@vaadin/vaadin-themable-mixin/register-styles.js")
public interface RegisterStyles extends Any {
    /**
     * Registers CSS styles for a component type. Make sure to register the styles before
     * the first instance of a component of the type is attached to DOM.
     *
     * @param themeFor The local/tag name of the component type to register the styles for
     *                 FIXME param styles: (CSSResult | Array.<CSSResult>)
     * @param styles   The CSS style rules to be registered for the component type
     *                 matching themeFor and included in the local scope of each component instance
     */
    @JSBody(
            params = {"themeFor", "styles"},
            script = "registerStyles(themeFor, styles)"
    )
    static void registerStyles(String themeFor, Unknown styles) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
