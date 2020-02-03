package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import org.teavm.jso.JSBody;

@Import(symbols = "hideElementsGlobally", module = "@polymer/polymer/lib/utils/hide-template-controls.js")
public interface HideTemplateControls extends Polymer {
    /**
     * @return True if elements will be hidden globally
     */
    @JSBody(
            script = "return hideElementsGlobally()"
    )
    static boolean hideElementsGlobally() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
