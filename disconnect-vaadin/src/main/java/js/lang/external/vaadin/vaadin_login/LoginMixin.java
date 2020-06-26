package js.lang.external.vaadin.vaadin_login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-login",
    version = "^1.2.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-login/src/vaadin-login-mixin.js"
)
public interface LoginMixin extends Any {
  /**
   * If set, a synchronous POST call will be fired to the path defined.
   * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to prevent the POST call.
   *
   */
  @JSProperty("action")
  @Nullable
  String getAction();

  /**
   * If set, a synchronous POST call will be fired to the path defined.
   * The <code>login</code> event is also dispatched, so <code>event.preventDefault()</code> can be called to prevent the POST call.
   *
   */
  @JSProperty("action")
  void setAction(@Nullable String value);

  /**
   * If set, disable the &quot;Log in&quot; button and prevent user from submitting login form.
   * It is re-enabled automatically, when error is set to true, allowing form resubmission
   * after user makes changes.
   *
   */
  @JSProperty("disabled")
  boolean getDisabled();

  /**
   * If set, disable the &quot;Log in&quot; button and prevent user from submitting login form.
   * It is re-enabled automatically, when error is set to true, allowing form resubmission
   * after user makes changes.
   *
   */
  @JSProperty("disabled")
  void setDisabled(boolean value);

  /**
   * If set, the error message is shown. The message is hidden by default.
   * When set, it changes the disabled state of the submit button.
   *
   */
  @JSProperty("error")
  boolean getError();

  /**
   * If set, the error message is shown. The message is hidden by default.
   * When set, it changes the disabled state of the submit button.
   *
   */
  @JSProperty("error")
  void setError(boolean value);

  /**
   * Whether to hide the forgot password button. The button is visible by default.
   *
   */
  @JSProperty("noForgotPassword")
  boolean getNoForgotPassword();

  /**
   * Whether to hide the forgot password button. The button is visible by default.
   *
   */
  @JSProperty("noForgotPassword")
  void setNoForgotPassword(boolean value);

  /**
   * The object used to localize this component.
   * For changing the default localization, change the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure (by default it doesn't include <code>additionalInformation</code>
   * and <code>header</code> sections, <code>header</code> can be added to override <code>title</code> and <code>description</code> properties
   * in <code>vaadin-login-overlay</code>):
   *
   * <pre><code>     {
   *        header: {
   *          title: 'App name',
   *          description: 'Inspiring application description'
   *        },
   *        form: {
   *          title: 'Log in',
   *          username: 'Username',
   *          password: 'Password',
   *          submit: 'Log in',
   *          forgotPassword: 'Forgot password'
   *        },
   *        errorMessage: {
   *          title: 'Incorrect username or password',
   *          message: 'Check that you have entered the correct username and password and try again.'
   *        },
   *        additionalInformation: 'In case you need to provide some additional info for the user.'
   *      }
   * </code></pre>
   */
  @JSProperty("i18n")
  LoginI18n getI18n();

  /**
   * The object used to localize this component.
   * For changing the default localization, change the entire
   * <em>i18n</em> object or just the property you want to modify.
   *
   * The object has the following JSON structure (by default it doesn't include <code>additionalInformation</code>
   * and <code>header</code> sections, <code>header</code> can be added to override <code>title</code> and <code>description</code> properties
   * in <code>vaadin-login-overlay</code>):
   *
   * <pre><code>     {
   *        header: {
   *          title: 'App name',
   *          description: 'Inspiring application description'
   *        },
   *        form: {
   *          title: 'Log in',
   *          username: 'Username',
   *          password: 'Password',
   *          submit: 'Log in',
   *          forgotPassword: 'Forgot password'
   *        },
   *        errorMessage: {
   *          title: 'Incorrect username or password',
   *          message: 'Check that you have entered the correct username and password and try again.'
   *        },
   *        additionalInformation: 'In case you need to provide some additional info for the user.'
   *      }
   * </code></pre>
   */
  @JSProperty("i18n")
  void setI18n(LoginI18n value);
}
