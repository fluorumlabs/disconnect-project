package js.lang.external.vaadin.vaadin_text_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;

/**
 * <code>&lt;vaadin-email-field&gt;</code> is a Web Component for email field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-email-field label=&quot;Email&quot;&gt;
 * &lt;/vaadin-email-field&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * See vaadin-text-field.html for the styling documentation
 *
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-text-field",
    version = "^2.7.0-alpha5"
)
@Import(
    module = "@vaadin/vaadin-text-field/vaadin-email-field.js"
)
public interface EmailFieldElement extends TextFieldElement {
}
