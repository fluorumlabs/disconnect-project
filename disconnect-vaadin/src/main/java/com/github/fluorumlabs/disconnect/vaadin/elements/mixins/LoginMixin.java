package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.LoginI18n;
import js.web.dom.Element;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "LoginMixin",
		module = "@vaadin/vaadin-login/src/vaadin-login-mixin.js"
)
public interface LoginMixin extends Element {
	/**
	 * If set, a synchronous POST call will be fired to the path defined.
	 * The `login` event is also dispatched, so `event.preventDefault()` can be called to prevent the POST call.
	 */
	@Nullable
	@JSProperty
	String getAction();

	/**
	 * If set, a synchronous POST call will be fired to the path defined.
	 * The `login` event is also dispatched, so `event.preventDefault()` can be called to prevent the POST call.
	 */
	@JSProperty
	void setAction(String action);

	/**
	 * If set, disable the "Log in" button and prevent user from submitting login form.
	 * It is re-enabled automatically, when error is set to true, allowing form resubmission
	 * after user makes changes.
	 */
	@JSProperty
	boolean isDisabled();

	/**
	 * If set, disable the "Log in" button and prevent user from submitting login form.
	 * It is re-enabled automatically, when error is set to true, allowing form resubmission
	 * after user makes changes.
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * If set, the error message is shown. The message is hidden by default.
	 * When set, it changes the disabled state of the submit button.
	 */
	@JSProperty
	boolean isError();

	/**
	 * If set, the error message is shown. The message is hidden by default.
	 * When set, it changes the disabled state of the submit button.
	 */
	@JSProperty
	void setError(boolean error);

	/**
	 * Whether to hide the forgot password button. The button is visible by default.
	 */
	@JSProperty
	boolean isNoForgotPassword();

	/**
	 * Whether to hide the forgot password button. The button is visible by default.
	 */
	@JSProperty
	void setNoForgotPassword(boolean noForgotPassword);

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
	@JSProperty
	LoginI18n getI18n();

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
	@JSProperty
	void setI18n(LoginI18n i18n);
}
