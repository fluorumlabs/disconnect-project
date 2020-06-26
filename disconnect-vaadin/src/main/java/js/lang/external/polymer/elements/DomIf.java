package js.lang.external.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

/**
 * The <code>&lt;dom-if&gt;</code> element will stamp a light-dom <code>&lt;template&gt;</code> child when
 * the <code>if</code> property becomes truthy, and the template can use Polymer
 * data-binding and declarative event features when used in the context of
 * a Polymer element's template.
 *
 * When <code>if</code> becomes falsy, the stamped content is hidden but not
 * removed from dom. When <code>if</code> subsequently becomes truthy again, the content
 * is simply re-shown. This approach is used due to its favorable performance
 * characteristics: the expense of creating template content is paid only
 * once and lazily.
 *
 * Set the <code>restamp</code> property to true to force the stamped content to be
 * created / destroyed when the <code>if</code> condition changes.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/dom-if.js"
)
public interface DomIf extends DomIfBase {
  class Builder {
    private final DomIf object = Any.empty();

    public DomIf build() {
      return object;
    }
  }
}
