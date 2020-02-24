package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

/**
 * Mixin that provides a minimal starting point to using the PropertiesChanged mixin by providing a mechanism to declare
 * properties in a static getter (e.g. static get properties() { return { foo: String } }). Changes are reported via the
 * <code>_propertiesChanged</code> method.
 * <p>
 * This mixin provides no specific support for rendering. Users are expected to create a ShadowRoot and put content into
 * it and update it in whatever way makes sense. This can be done in reaction to properties changing by implementing
 * <code>_propertiesChanged</code>.
 */
public interface PropertiesMixin extends PropertiesChanged {
}
