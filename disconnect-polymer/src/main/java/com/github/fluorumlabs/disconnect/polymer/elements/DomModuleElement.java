package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The `dom-module` element registers the dom it contains to the name given
 * by the module's id attribute. It provides a unified database of dom
 * accessible via its static `import` API.
 * <p>
 * A key use case of `dom-module` is for providing custom element `<template>`s
 * via HTML imports that are parsed by the native HTML parser, that can be
 * relocated during a bundling pass and still looked up by `id`.
 * <p>
 * Example:
 * <p>
 * <dom-module id="foo">
 * <img src="stuff.png">
 * </dom-module>
 * <p>
 * Then in code in some other location that cannot access the dom-module above
 * <p>
 * let img = customElements.get('dom-module').import('foo', 'img');
 */
@NpmPackage(
        name = "@polymer/polymer",
        version = Polymer.VERSION
)
@Import(
        symbols = "DomModule",
        module = "@polymer/polymer/lib/elements/dom-module.js"
)
public interface DomModuleElement extends HTMLElement {
    /**
     * Retrieves the element specified by the css `selector` in the module
     * registered by `id`. For example, this.import('foo', 'img');
     *
     * @param id       The id of the dom-module in which to search.
     * @param selector The css selector by which to find the element.
     *
     * @return Returns the element which matches `selector` in the
     *         module registered at the specified `id`.
     */
    @JSBody(
            params = {"id", "selector"},
            script = "return DomModule.import(id, selector)"
    )
    static Element doImport(String id, String selector) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * The absolute URL of the original location of this `dom-module`.
     * <p>
     * This value will differ from this element's `ownerDocument` in the
     * following ways:
     * - Takes into account any `assetpath` attribute added during bundling
     * to indicate the original location relative to the bundled location
     * - Uses the HTMLImports polyfill's `importForElement` API to ensure
     * the path is relative to the import document's location since
     * `ownerDocument` is not currently polyfilled
     */
    @JSProperty
    String getAssetpath();

    /**
     * Registers the dom-module at a given id. This method should only be called
     * when a dom-module is imperatively created. For
     * example, `document.createElement('dom-module').register('foo')`.
     *
     * @param id The id at which to register the dom-module.
     */
    void register(String id);
}
