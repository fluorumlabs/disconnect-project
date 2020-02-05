package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;

/**
 * Element class mixin that provides basic meta-programming for creating one
 * or more property accessors (getter/setter pair) that enqueue an async
 * (batched) <code>_propertiesChanged</code> callback.
 * <p>
 * For basic usage of this mixin, call <code>MyClass.createProperties(props)</code>
 * once at class definition time to create property accessors for properties
 * named in props, implement <code>_propertiesChanged</code> to react as desired to
 * property changes, and implement <code>static get observedAttributes()</code> and
 * include lowercase versions of any property names that should be set from
 * attributes. Last, call <code>this._enableProperties()</code> in the element's
 * <code>connectedCallback</code> to enable the accessors.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "PropertiesChanged",
		module = "@polymer/polymer/lib/mixins/properties-changed.js"
)
public interface PropertiesChanged extends Element {
}
