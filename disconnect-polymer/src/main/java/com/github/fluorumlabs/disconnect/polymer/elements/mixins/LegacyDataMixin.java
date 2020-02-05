package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;

/**
 * Mixin to selectively add back Polymer 1.x's `undefined` rules
 * governing when observers & computing functions run based
 * on all arguments being defined (reference https://www.polymer-project.org/1
 * .0/docs/devguide/observers#multi-property-observers).
 * <p>
 * When loaded, all legacy elements (defined with `Polymer({...})`)
 * will have the mixin applied. The mixin only restores legacy data handling
 * if `_legacyUndefinedCheck: true` is set on the element's prototype.
 * <p>
 * This mixin is intended for use to help migration from Polymer 1.x to
 * 2.x+ by allowing legacy code to work while identifying observers and
 * computing functions that need undefined checks to work without
 * the mixin in Polymer 2.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "LegacyDataMixin",
		module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
@Deprecated
public interface LegacyDataMixin extends Element {
}
