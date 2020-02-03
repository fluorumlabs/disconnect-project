package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;

/**
 * Mixin that parses binding expressions and generates corresponding metadata.
 * The implementation is different than in `property-effects`, as it uses a
 * state machine instead of a regex. As such, this implementation is able to
 * handle more cases, with the potential performance hit.
 */
@Import(
        symbols = "StrictBindingParser",
        module = "@polymer/polymer/lib/mixins/strict-binding-parser.js"
)
public interface StrictBindingParser extends PropertyEffects {
}
