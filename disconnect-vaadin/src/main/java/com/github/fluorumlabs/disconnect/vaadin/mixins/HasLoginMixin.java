package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.LoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.LoginI18n;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.CustomEvent;

import javax.annotation.Nullable;

public interface HasLoginMixin<E extends LoginMixin, T extends Component<E>> extends Component<E> {
    /**
     * If set, a synchronous POST call will be fired to the path defined.
     * The `login` event is also dispatched, so `event.preventDefault()` can be called to prevent the POST call.
     */
    @Nullable
    default String action() {
        return getNode().getAction();
    }

    /**
     * If set, a synchronous POST call will be fired to the path defined.
     * The `login` event is also dispatched, so `event.preventDefault()` can be called to prevent the POST call.
     */
    default T action(String action) {
        getNode().setAction(action);
        return (T) this;
    }

    /**
     * If set, disable the "Log in" button and prevent user from submitting login form.
     * It is re-enabled automatically, when error is set to true, allowing form resubmission
     * after user makes changes.
     */
    default boolean disabled() {
        return getNode().isDisabled();
    }

    /**
     * If set, disable the "Log in" button and prevent user from submitting login form.
     * It is re-enabled automatically, when error is set to true, allowing form resubmission
     * after user makes changes.
     */
    default T disabled(boolean disabled) {
        getNode().setDisabled(disabled);
        return (T) this;
    }

    /**
     * If set, the error message is shown. The message is hidden by default.
     * When set, it changes the disabled state of the submit button.
     */
    default boolean error() {
        return getNode().isError();
    }

    /**
     * If set, the error message is shown. The message is hidden by default.
     * When set, it changes the disabled state of the submit button.
     */
    default T error(boolean error) {
        getNode().setError(error);
        return (T) this;
    }

    /**
     * Whether to hide the forgot password button. The button is visible by default.
     */
    default boolean noForgotPassword() {
        return getNode().isNoForgotPassword();
    }

    /**
     * Whether to hide the forgot password button. The button is visible by default.
     */
    default T noForgotPassword(boolean noForgotPassword) {
        getNode().setNoForgotPassword(noForgotPassword);
        return (T) this;
    }

    /**
     * The object used to localize this component.
     * For changing the default localization, change the entire
     * _i18n_ object or just the property you want to modify.
     * <p>
     * The object has the following JSON structure (by default it doesn't include `additionalInformation`
     * and `header` sections, `header` can be added to override `title` and `description` properties
     * in `vaadin-login-overlay`):
     * <p>
     * {
     * header: {
     * title: 'App name',
     * description: 'Inspiring application description'
     * },
     * form: {
     * title: 'Log in',
     * username: 'Username',
     * password: 'Password',
     * submit: 'Log in',
     * forgotPassword: 'Forgot password'
     * },
     * errorMessage: {
     * title: 'Incorrect username or password',
     * message: 'Check that you have entered the correct username and password and try again.'
     * },
     * additionalInformation: 'In case you need to provide some additional info for the user.'
     * }
     */
    @Nullable
    default LoginI18n i18n() {
        return getNode().getI18n();
    }

    /**
     * The object used to localize this component.
     * For changing the default localization, change the entire
     * _i18n_ object or just the property you want to modify.
     * <p>
     * The object has the following JSON structure (by default it doesn't include `additionalInformation`
     * and `header` sections, `header` can be added to override `title` and `description` properties
     * in `vaadin-login-overlay`):
     * <p>
     * {
     * header: {
     * title: 'App name',
     * description: 'Inspiring application description'
     * },
     * form: {
     * title: 'Log in',
     * username: 'Username',
     * password: 'Password',
     * submit: 'Log in',
     * forgotPassword: 'Forgot password'
     * },
     * errorMessage: {
     * title: 'Incorrect username or password',
     * message: 'Check that you have entered the correct username and password and try again.'
     * },
     * additionalInformation: 'In case you need to provide some additional info for the user.'
     * }
     */
    default T i18n(LoginI18n i18n) {
        getNode().setI18n(i18n);
        return (T) this;
    }

    /**
     * Fired when user clicks on the "Forgot password" button.
     */
    default ObservableEvent<CustomEvent> ForgotPasswordEvent() {
        return createEvent("forgot-password");
    }

    /**
     * Fired when an user submits the login.
     * The event contains `username` and `password` values in the `detail` property.
     */
    default ObservableEvent<CustomEvent> LoginEvent() {
        return createEvent("login");
    }
}
