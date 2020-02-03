package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.StrictBindingParser;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Mixin that parses binding expressions and generates corresponding metadata.
 * The implementation is different than in `property-effects`, as it uses a
 * state machine instead of a regex. As such, this implementation is able to
 * handle more cases, with the potential performance hit.
 */
public interface HasStrictBindingParser<E extends StrictBindingParser, T extends Component<E>> extends HasPropertyEffects<E, T> {
}
