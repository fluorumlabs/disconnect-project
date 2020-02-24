package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

/**
 * Mixin that parses binding expressions and generates corresponding metadata. The implementation is different than in
 * <code>property-effects</code>, as it uses a state machine instead of a regex. As such, this implementation is able to
 * handle more cases, with the potential performance hit.
 */
public interface StrictBindingParser extends PropertyEffects {
}
