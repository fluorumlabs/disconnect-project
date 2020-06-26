package js.lang.external.vaadin.vaadin_text_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;

/**
 * <code>&lt;vaadin-integer-field&gt;</code> is a Web Component for integer field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-integer-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-integer-field&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-text-field",
    version = "^2.7.0-alpha5"
)
@Import(
    module = "@vaadin/vaadin-text-field/vaadin-integer-field.js"
)
public interface IntegerFieldElement extends NumberFieldElement {
}
