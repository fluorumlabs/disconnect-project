package js.lang.external.vaadin.vaadin_login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;

/**
 * <code>&lt;vaadin-login-form&gt;</code> is a Web Component providing an easy way to require users
 * to log in into an application. Note that component has no shadowRoot.
 *
 * <pre><code>&lt;vaadin-login-form&gt;&lt;/vaadin-login-form&gt;
 * </code></pre>
 * Component has to be accessible from the <code>document</code> layer in order to allow password managers to work properly with form values.
 * Using <code>&lt;vaadin-login-overlay&gt;</code> allows to always attach the component to the document body.
 *
 * <h3>Styling</h3>
 * The component doesn't have a shadowRoot, so the html form and input fields can be styled in an upper layer. To style
 * <code>vaadin-login-form-wrapper</code> check its documentation.
 *
 * See examples of setting the content into slots in the live demos.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-login",
    version = "^1.2.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-login/vaadin-login-form.js"
)
public interface LoginFormElement extends PolymerElement, ThemableMixin, ElementMixin, LoginMixin {
  void submit();
}
