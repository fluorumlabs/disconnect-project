package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * Custom element to allow using Polymer's template features (data binding, declarative event listeners, etc.) in the main document without defining a new custom element.
 *
 * <code>&lt;template&gt;</code> tags utilizing bindings may be wrapped with the <code>&lt;dom-bind&gt;</code> element, which will immediately stamp the wrapped template into the main document and bind elements to the <code>dom-bind</code> element itself as the binding scope.
 *
 * <strong>Mixins:</strong> GestureEventListeners, OptionalMutableData, PropertyEffects
 */
@NpmPackage(name = "@polymer/polymer", version = "^3.4.1")
@Import(module = "@polymer/polymer/lib/elements/dom-bind.js")
public interface DomBindElement extends HTMLElement {

    // !wca! get mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    @JSProperty("mutableData")
    boolean isMutableData();

    // !wca! set mutableData: boolean | null | undefined
    /**
     * Instance-level flag for configuring the dirty-checking strategy
     * for this element. When true, Objects and Arrays will skip dirty
     * checking, otherwise strict equality checking will be used.
     */
    @JSProperty("mutableData")
    void setMutableData(boolean value);
}
