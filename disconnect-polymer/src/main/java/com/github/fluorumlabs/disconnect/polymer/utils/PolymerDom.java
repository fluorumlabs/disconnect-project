package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(symbols = "matchesSelector", module = "@polymer/polymer/lib/legacy/polymer.dom.js")
@Deprecated
public interface PolymerDom {

    /**
     * Cross-platform `element.matches` shim.
     *
     * @param node     Node to check selector against
     * @param selector Selector to match
     *
     * @return True if node matched selector
     */
    @Deprecated
    @JSBody(
            params = {"node", "selector"},
            script = "return matchesSelector(node, selector)"
    )
    static boolean matchesSelector(Node node, String selector) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
