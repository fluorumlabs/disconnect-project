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
@Import(symbols = "hideElementsGlobally", module = "@polymer/polymer/lib/utils/hide-template-controls.js")
public interface HideTemplateControls extends Any {
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
