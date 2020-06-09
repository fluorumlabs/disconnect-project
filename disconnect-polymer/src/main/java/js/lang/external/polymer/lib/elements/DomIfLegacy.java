package js.lang.external.polymer.lib.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;

/**
 * The &quot;legacy&quot; implementation of <code>dom-if</code>, implemented using <code>Templatizer</code>.
 *
 * In this version, <code>this.__instance</code> is the <code>TemplateInstance</code> returned
 * from the templatized constructor.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/dom-if.js"
)
public interface DomIfLegacy extends DomIfBase {
}
