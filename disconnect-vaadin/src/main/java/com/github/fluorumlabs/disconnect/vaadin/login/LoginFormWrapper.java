package com.github.fluorumlabs.disconnect.vaadin.login;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.external.vaadin.login.LoginFormWrapperElement;
import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;

/**
 * <code>&lt;vaadin-login-form-wrapper&gt;</code> is a helper component providing a wrapper for the login form.
 *
 * See the usage in <code>&lt;vaadin-login-form&gt;</code>.
 *
 * <h3>Styling</h3>
 * The following Shadow DOM parts of the <code>&lt;vaadin-login-form-wrapper&gt;</code> are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>form</code></td>
 *    <td>Container for the entire component's content</td>
 *   </tr>
 *   <tr>
 *    <td><code>form-title</code></td>
 *    <td>Title of the login form</td>
 *   </tr>
 *   <tr>
 *    <td><code>error-message</code></td>
 *    <td>Container for error message, contains error-message-title and error-message-description parts. Hidden by default.</td>
 *   </tr>
 *   <tr>
 *    <td><code>error-message-title</code></td>
 *    <td>Container for error message title</td>
 *   </tr>
 *   <tr>
 *    <td><code>error-message-description</code></td>
 *    <td>Container for error message description</td>
 *   </tr>
 *   <tr>
 *    <td><code>error-message-description</code></td>
 *    <td>Container for error message description</td>
 *   </tr>
 *   <tr>
 *    <td><code>footer</code></td>
 *    <td>Container additional information text from <code>i18n</code> object</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <h3>Component's slots</h3>
 * The following slots are available for being set
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Slot name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>form</code></td>
 *    <td>Html form placeholder. See the usage in <code>&lt;vaadin-login-form&gt;</code>.</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See examples of setting the content into slots in the live demos.
 *
 * <strong>Mixins:</strong> LoginMixin, ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
class LoginFormWrapper extends HtmlComponent<LoginFormWrapperElement> {

    // !wca! get action: string | null

    // !wca! set action: string | null

    // !wca! observe action: string | null

    // !wca! get disabled: boolean

    // !wca! set disabled: boolean

    // !wca! observe disabled: boolean

    // !wca! get error: boolean

    // !wca! set error: boolean

    // !wca! observe error: boolean

    // !wca! get i18n: LoginI18n

    // !wca! set i18n: LoginI18n

    // !wca! observe i18n: LoginI18n

    // !wca! get noForgotPassword: boolean

    // !wca! set noForgotPassword: boolean

    // !wca! observe noForgotPassword: boolean

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

}
