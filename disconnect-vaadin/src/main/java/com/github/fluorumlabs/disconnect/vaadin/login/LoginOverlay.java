package com.github.fluorumlabs.disconnect.vaadin.login;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.login.LoginI18n;
import js.lang.external.vaadin.login.LoginOverlayElement;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-login-overlay&gt;</code> is a wrapper of the <code>&lt;vaadin-login-form&gt;</code> which opens a login form in an overlay and having an additional <code>brand</code> part for application title and description. Using <code>&lt;vaadin-login-overlay&gt;</code> allows password managers to work with login form.
 *
 * <pre><code>&lt;vaadin-login-overlay opened&gt;&lt;/vaadin-login-overlay&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * To style the element check: <a href="#/elements/vaadin-login-overlay-wrapper"><code>&lt;vaadin-login-overlay-wrapper&gt;</code></a>, <a href="#/elements/vaadin-login-form-wrapper"><code>&lt;vaadin-login-form-wrapper&gt;</code></a>, <a href="#/elements/vaadin-login-form"><code>&lt;vaadin-login-form&gt;</code></a> and <code>&lt;vaadin-overlay&gt;</code> elements
 *
 * <strong>Mixins:</strong> LoginMixin, ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-login-overlay", external = true)
public class LoginOverlay extends HtmlComponent<LoginOverlayElement> implements Themable<LoginOverlayElement> {

    public LoginOverlay() {
    }

    public LoginOverlay(String textContent) {
        super(textContent);
    }

    public LoginOverlay(Component<?>... components) {
        super(components);
    }

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

    // !wca! get description: string
    /**
     * Defines the application description
     */
    public String getDescription() {
        return getElement().getDescription();
    }

    // !wca! set description: string
    /**
     * Defines the application description
     */
    public void setDescription(String value) {
        getElement().setDescription(value);
    }

    // !wca! observe description: string

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

    // !wca! get opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get title: string
    /**
     * Defines the application title
     */
    public String getTitle() {
        return getElement().getTitle();
    }

    // !wca! set title: string
    /**
     * Defines the application title
     */
    public void setTitle(String value) {
        getElement().setTitle(value);
    }

    // !wca! observe title: string
}
