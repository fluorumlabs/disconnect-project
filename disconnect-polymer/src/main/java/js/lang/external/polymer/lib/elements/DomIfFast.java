package js.lang.external.polymer.lib.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;

/**
 * The version of DomIf used when <code>fastDomIf</code> setting is in use, which is
 * optimized for first-render (but adds a tax to all subsequent property updates
 * on the host, whether they were used in a given <code>dom-if</code> or not).
 *
 * This implementation avoids use of <code>Templatizer</code>, which introduces a new scope
 * (a non-element PropertyEffects instance), which is not strictly necessary
 * since <code>dom-if</code> never introduces new properties to its scope (unlike
 * <code>dom-repeat</code>). Taking advantage of this fact, the <code>dom-if</code> reaches up to its
 * <code>__dataHost</code> and stamps the template directly from the host using the host's
 * runtime <code>_stampTemplate</code> API, which binds the property effects of the
 * template directly to the host. This both avoids the intermediary
 * <code>Templatizer</code> instance, but also avoids the need to bind host properties to
 * the <code>&lt;template&gt;</code> element and forward those into the template instance.
 *
 * In this version of <code>dom-if</code>, the <code>this.__instance</code> method is the
 * <code>DocumentFragment</code> returned from <code>_stampTemplate</code>, which also serves as the
 * handle for later removing it using the <code>_removeBoundDom</code> method.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/dom-if.js"
)
public interface DomIfFast extends DomIfBase {
}
