package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.types.DOMSanitizer;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(
        symbols = {"setAllowTemplateFromDomModule", "setCancelSyntheticClickEvents", "setLegacyOptimizations", "setStrictTemplatePolicy", "setRootPath", "setSanitizeDOMValue", "setPassiveTouchGestures", "setSyncInitialRender"},
        module = "@polymer/polymer/lib/utils/settings.js"
)
public interface Settings extends Any {
    /**
     * Sets the global rootPath property used by `ElementMixin` and
     * available via `rootPath`.
     *
     * @param path The new root path
     */
    @JSBody(params = "path", script = "setRootPath(path)")
    static void setRootPath(String path) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets the global sanitizeDOMValue available via this module's exported
     * `sanitizeDOMValue` variable.
     *
     * @param newSanitizeDOMValue the global sanitizeDOMValue callback
     */
    @JSBody(params = "newSanitizeDOMValue", script = "setSanitizeDOMValue(newSanitizeDOMValue)")
    static void setSanitizeDOMValue(DOMSanitizer newSanitizeDOMValue) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets `passiveTouchGestures` globally for all elements using Polymer Gestures.
     *
     * @param usePassive enable or disable passive touch gestures globally
     */
    @JSBody(params = "usePassive", script = "setPassiveTouchGestures(usePassive)")
    static void setPassiveTouchGestures(boolean usePassive) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets `strictTemplatePolicy` globally for all elements
     *
     * @param useStrictPolicy enable or disable strict template policy
     *                        globally
     */
    @JSBody(params = "useStrictPolicy", script = "setStrictTemplatePolicy(useStrictPolicy)")
    static void setStrictTemplatePolicy(boolean useStrictPolicy) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets `lookupTemplateFromDomModule` globally for all elements
     *
     * @param allowDomModule enable or disable template lookup
     *                       globally
     */
    @JSBody(params = "allowDomModule", script = "setAllowTemplateFromDomModule(allowDomModule)")
    static void setAllowTemplateFromDomModule(boolean allowDomModule) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets `legacyOptimizations` globally for all elements to enable optimizations
     * when only legacy based elements are used.
     *
     * @param useLegacyOptimizations enable or disable legacy optimizations
     *                               includes and url rewriting
     */
    @JSBody(params = "useLegacyOptimizations", script = "setLegacyOptimizations(useLegacyOptimizations)")
    static void setLegacyOptimizations(boolean useLegacyOptimizations) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets `syncInitialRender` globally for all elements to enable synchronous
     * initial rendering.
     *
     * @param useSyncInitialRender enable or disable synchronous initial
     *                             rendering globally.
     */
    @JSBody(params = "useSyncInitialRender", script = "setSyncInitialRender(useSyncInitialRender)")
    static void setSyncInitialRender(boolean useSyncInitialRender) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets `setCancelSyntheticEvents` globally for all elements to cancel synthetic click events.
     *
     * @param useCancelSyntheticClickEvents enable or disable cancelling synthetic
     *                                      events
     */
    @JSBody(params = "useCancelSyntheticClickEvents", script = "setCancelSyntheticClickEvents(useCancelSyntheticClickEvents)")
    static void setCancelSyntheticClickEvents(boolean useCancelSyntheticClickEvents) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
