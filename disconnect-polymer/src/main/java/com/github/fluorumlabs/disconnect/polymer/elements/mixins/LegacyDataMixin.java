package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import js.web.dom.Element;

/**
 * Mixin to selectively add back Polymer 1.x's <code>undefined</code> rules governing when observers &amp; computing
 * functions run based on all arguments being defined (reference
 * <a href="https://www.polymer-project.org/1.0/docs/devguide/observers#multi-property-observers">https://www.polymer-project.org/1.0/docs/devguide/observers#multi-property-observers</a>).
 * <p>
 * When loaded, all legacy elements (defined with <code>Polymer({...})</code>) will have the mixin applied. The mixin
 * only restores legacy data handling if <code>_legacyUndefinedCheck: true</code> is set on the element's prototype.
 * <p>
 * This mixin is intended for use to help migration from Polymer 1.x to 2.x+ by allowing legacy code to work while
 * identifying observers and computing functions that need undefined checks to work without the mixin in Polymer 2.
 */
@Deprecated
public interface LegacyDataMixin extends Element {
}
