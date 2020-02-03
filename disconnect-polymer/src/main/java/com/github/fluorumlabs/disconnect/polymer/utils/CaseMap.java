package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(
        symbols = {"camelToDashCase", "dashToCamelCase"},
        module = "@polymer/polymer/lib/utils/case-map.js"
)
public interface CaseMap extends Any {
    /**
     * Converts "dash-case" identifier (e.g. `foo-bar-baz`) to "camelCase"
     * (e.g. `fooBarBaz`).
     *
     * @param dash Dash-case identifier
     *
     * @return Camel-case representation of the identifier
     */
    @JSBody(params = "dash", script = "return dashToCamelCase(dash)")
    static String dashToCamelCase(String dash) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Converts "camelCase" identifier (e.g. `fooBarBaz`) to "dash-case"
     * (e.g. `foo-bar-baz`).
     *
     * @param camel Camel-case identifier
     *
     * @return Dash-case representation of the identifier
     */
    @JSBody(params = "camel", script = "return camelToDashCase(camel)")
    static String camelToDashCase(String camel) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
