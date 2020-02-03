package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@polymer/polymer",
        version = "3.3.1"
)
public interface Polymer {
    /**
     * Cross-platform `element.matches` shim.
     *
     * @param node     Node to check selector against
     * @param selector Selector to match
     *
     * @return True if node matched selector
     */
    @JSBody(
            params = {"node", "selector"},
            script = "return matchesSelector(node, selector)"
    )
    static boolean matchesSelector(Node node, String selector) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
