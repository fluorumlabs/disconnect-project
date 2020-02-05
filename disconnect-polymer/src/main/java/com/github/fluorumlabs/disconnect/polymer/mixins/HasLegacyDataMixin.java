package com.github.fluorumlabs.disconnect.polymer.mixins;

import com.github.fluorumlabs.disconnect.polymer.elements.mixins.LegacyDataMixin;
import com.github.fluorumlabs.disconnect.zero.component.Component;

/**
 * Mixin to selectively add back Polymer 1.x's `undefined` rules
 * governing when observers & computing functions run based
 * on all arguments being defined (reference https://www.polymer-project.org/1.0/docs/devguide/observers#multi-property-observers).
 *
 * When loaded, all legacy elements (defined with `Polymer({...})`)
 * will have the mixin applied. The mixin only restores legacy data handling
 * if `_legacyUndefinedCheck: true` is set on the element's prototype.
 *
 * This mixin is intended for use to help migration from Polymer 1.x to
 * 2.x+ by allowing legacy code to work while identifying observers and
 * computing functions that need undefined checks to work without
 * the mixin in Polymer 2. */
@Deprecated
public interface HasLegacyDataMixin<E extends LegacyDataMixin, T extends Component<E>> extends Component<E> {
}