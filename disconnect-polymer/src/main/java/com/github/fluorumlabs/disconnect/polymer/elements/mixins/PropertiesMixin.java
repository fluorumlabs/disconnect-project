package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * Mixin that provides a minimal starting point to using the PropertiesChanged
 * mixin by providing a mechanism to declare properties in a static
 * getter (e.g. static get properties() { return { foo: String } }). Changes
 * are reported via the `_propertiesChanged` method.
 * <p>
 * This mixin provides no specific support for rendering. Users are expected
 * to create a ShadowRoot and put content into it and update it in whatever
 * way makes sense. This can be done in reaction to properties changing by
 * implementing `_propertiesChanged`.
 */
@Import(
        symbols = "PropertiesMixin",
        module = "@polymer/polymer/lib/mixins/properties-mixin.js"
)
public interface PropertiesMixin extends PropertiesChanged {
}
