package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.DomModuleElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.Element;

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
public class DomModule
		extends AbstractComponent<DomModuleElement>
		implements HasComponents<DomModuleElement, DomModule, Component<?>> {
	public DomModule() {
		super("dom-module");
	}

	/**
	 * Retrieves the element specified by the css `selector` in the module
	 * registered by `id`. For example, this.import('foo', 'img');
	 *
	 * @param id       The id of the dom-module in which to search.
	 * @param selector The css selector by which to find the element.
	 *
	 * @return Returns the element which matches `selector` in the
	 * 		module registered at the specified `id`.
	 */
	public static Element doImport(String id, String selector) {
		return DomModuleElement.doImport(id, selector);
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
	public String assetpath() {
		return getNode().getAssetpath();
	}

	/**
	 * Registers the dom-module at a given id. This method should only be called
	 * when a dom-module is imperatively created. For
	 * example, `document.createElement('dom-module').register('foo')`.
	 *
	 * @param id The id at which to register the dom-module.
	 */
	public void register(String id) {
		getNode().register(id);
	}
}
