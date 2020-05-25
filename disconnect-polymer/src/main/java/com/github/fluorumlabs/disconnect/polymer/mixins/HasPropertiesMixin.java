package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertiesMixin;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;

/**
 * Mixin that provides a minimal starting point to using the PropertiesChanged mixin by providing a mechanism to declare
 * properties in a static getter (e.g. static get properties() { return { foo: String } }). Changes are reported via the
 * <code>_propertiesChanged</code> method.
 * <p>
 * This mixin provides no specific support for rendering. Users are expected to create a ShadowRoot and put content into
 * it and update it in whatever way makes sense. This can be done in reaction to properties changing by implementing
 * <code>_propertiesChanged</code>.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasPropertiesMixin<E extends PropertiesMixin, T extends HasElement<E>>
		extends HasPropertiesChanged<E, T> {
}
