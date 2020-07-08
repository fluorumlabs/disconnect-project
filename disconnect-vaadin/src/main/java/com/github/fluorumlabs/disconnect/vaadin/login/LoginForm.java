package com.github.fluorumlabs.disconnect.vaadin.login;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.login.LoginFormElement;
import js.lang.external.vaadin.login.LoginI18n;
import js.web.dom.Event;

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
@CustomElement(tagName = "vaadin-login-form", external = true)
public class LoginForm extends HtmlComponent<LoginFormElement> implements Themable<LoginFormElement> {

    public LoginForm() {
    }

    public LoginForm(String textContent) {
        super(textContent);
    }

    public LoginForm(Component<?>... components) {
        super(components);
    }

    // !wca! submit: (): void

    // !wca! get action: string | null
    /**
     * If set, a synchronous POST call will be fired to the path defined.
     * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to prevent the POST call.
     */
    public @Nullable String getAction() {
        return getElement().getAction();
    }

    // !wca! set action: string | null
    /**
     * If set, a synchronous POST call will be fired to the path defined.
     * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to prevent the POST call.
     */
    public void setAction(@Nullable String value) {
        getElement().setAction(value);
    }

    // !wca! observe action: string | null

    // !wca! get disabled: boolean
    /**
     * If set, disable the "Log in" button and prevent user from submitting login form.
     * It is re-enabled automatically, when error is set to true, allowing form resubmission
     * after user makes changes.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * If set, disable the "Log in" button and prevent user from submitting login form.
     * It is re-enabled automatically, when error is set to true, allowing form resubmission
     * after user makes changes.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

    // !wca! get error: boolean
    /**
     * If set, the error message is shown. The message is hidden by default.
     * When set, it changes the disabled state of the submit button.
     */
    public boolean isError() {
        return getElement().isError();
    }

    // !wca! set error: boolean
    /**
     * If set, the error message is shown. The message is hidden by default.
     * When set, it changes the disabled state of the submit button.
     */
    public void setError(boolean value) {
        getElement().setError(value);
    }

    // !wca! observe error: boolean

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
     * @param value
     */
    public void setI18n(LoginI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: LoginI18n

    // !wca! get noForgotPassword: boolean
    /**
     * Whether to hide the forgot password button. The button is visible by default.
     */
    public boolean isNoForgotPassword() {
        return getElement().isNoForgotPassword();
    }

    // !wca! set noForgotPassword: boolean
    /**
     * Whether to hide the forgot password button. The button is visible by default.
     */
    public void setNoForgotPassword(boolean value) {
        getElement().setNoForgotPassword(value);
    }

    // !wca! observe noForgotPassword: boolean

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! event login: ?
    public ObservableEvent<Event> loginEvent() {
        return createEvent("login");
    }
}
