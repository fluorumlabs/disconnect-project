package js.lang.external.vaadin.login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-login-form&gt;</code> is a Web Component providing an easy way to require users to log in into an application. Note that component has no shadowRoot.
 *
 * <pre><code>&lt;vaadin-login-form&gt;&lt;/vaadin-login-form&gt;
 * </code></pre>
 * Component has to be accessible from the <code>document</code> layer in order to allow password managers to work properly with form values. Using <code>&lt;vaadin-login-overlay&gt;</code> allows to always attach the component to the document body.
 *
 * <h3>Styling</h3>
 * The component doesn't have a shadowRoot, so the html form and input fields can be styled in an upper layer. To style <code>vaadin-login-form-wrapper</code> check its documentation.
 *
 * See examples of setting the content into slots in the live demos.
 *
 * <strong>Mixins:</strong> LoginMixin, ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-login", version = "^1.2.0-alpha2")
@Import(module = "@vaadin/vaadin-login/vaadin-login-form.js")
public interface LoginFormElement extends HTMLElement {

    // !wca! submit: (): void

    // !wca! get action: string | null
    /**
     * If set, a synchronous POST call will be fired to the path defined.
     * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to prevent the POST call.
     */
    @JSProperty("action")
    @Nullable
    String getAction();

    // !wca! set action: string | null
    /**
     * If set, a synchronous POST call will be fired to the path defined.
     * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to prevent the POST call.
     */
    @JSProperty("action")
    void setAction(@Nullable String value);

    // !wca! get disabled: boolean
    /**
     * If set, disable the "Log in" button and prevent user from submitting login form.
     * It is re-enabled automatically, when error is set to true, allowing form resubmission
     * after user makes changes.
     */
    @JSProperty("disabled")
    boolean isDisabled();

    // !wca! set disabled: boolean
    /**
     * If set, disable the "Log in" button and prevent user from submitting login form.
     * It is re-enabled automatically, when error is set to true, allowing form resubmission
     * after user makes changes.
     */
    @JSProperty("disabled")
    void setDisabled(boolean value);

    // !wca! get error: boolean
    /**
     * If set, the error message is shown. The message is hidden by default.
     * When set, it changes the disabled state of the submit button.
     */
    @JSProperty("error")
    boolean isError();

    // !wca! set error: boolean
    /**
     * If set, the error message is shown. The message is hidden by default.
     * When set, it changes the disabled state of the submit button.
     */
    @JSProperty("error")
    void setError(boolean value);

    // !wca! get i18n: LoginI18n

    // !wca! set i18n: LoginI18n
    /**
     * The object used to localize this component.
     * For changing the default localization, change the entire
     * <em>i18n</em> object or just the property you want to modify.
     *
     * The object has the following JSON structure (by default it doesn't include <code>additionalInformation</code>
     * and <code>header</code> sections, <code>header</code> can be added to override <code>title</code> and <code>description</code> properties
     * in <code>vaadin-login-overlay</code>):
     *
     *  {
     *  header: {
     *  title: 'App name',
     *  description: 'Inspiring application description'
     *  },
     *  form: {
     *  title: 'Log in',
     *  username: 'Username',
     *  password: 'Password',
     *  submit: 'Log in',
     *  forgotPassword: 'Forgot password'
     *  },
     *  errorMessage: {
     *  title: 'Incorrect username or password',
     *  message: 'Check that you have entered the correct username and password and try again.'
     *  },
     *  additionalInformation: 'In case you need to provide some additional info for the user.'
     *  }
     */
    @JSProperty("i18n")
    void setI18n(LoginI18n value);

    // !wca! get noForgotPassword: boolean
    /**
     * Whether to hide the forgot password button. The button is visible by default.
     */
    @JSProperty("noForgotPassword")
    boolean isNoForgotPassword();

    // !wca! set noForgotPassword: boolean
    /**
     * Whether to hide the forgot password button. The button is visible by default.
     */
    @JSProperty("noForgotPassword")
    void setNoForgotPassword(boolean value);

    // !wca! get theme: string | null | undefined
}
