package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.StrictBindingParser;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;

/**
 * Mixin that parses binding expressions and generates corresponding metadata. The implementation is different than in
 * <code>property-effects</code>, as it uses a state machine instead of a regex. As such, this implementation is able to
 * handle more cases, with the potential performance hit.
 *
 * @param <E> the type parameter
 * @param <T> the type parameter
 */
public interface HasStrictBindingParser<E extends StrictBindingParser, T extends HasElement<E>>
		extends HasPropertyEffects<E, T> {
}
