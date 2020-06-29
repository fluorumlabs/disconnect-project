package js.lang.external.vaadin.vaadin_cookie_consent;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-cookie-consent&gt;</code> is used to show a cookie consent banner the first
 * time a user visits the application.
 *
 * By default, the banner is shown attached to the top of the screen and with a
 * predefined text, a link to <a href="https://cookiesandyou.com/">https://cookiesandyou.com/</a> describing cookies and a consent button.
 *
 * The texts, link and position can be configured using attributes/properties, e.g.
 *
 * <pre><code>&lt;vaadin-cookie-consent learn-more-link=&quot;https://mysite.com/cookies.html&quot;&gt;&lt;/vaadin-cookie-consent&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * To change the look of the cookie consent banner, a <code>style</code> node should be attached
 * to the document's head with the following style names overridden:
 *
 * <table>
 * <thead>
 * <tr><th>Style name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>cc-window</code></td><td>Banner container</td></tr>
 * <tr><td><code>cc-message</code></td><td>Message container</td></tr>
 * <tr><td><code>cc-compliance</code></td><td>Dismiss cookie button container</td></tr>
 * <tr><td><code>cc-dismiss</code></td><td>Dismiss cookie button</td></tr>
 * <tr><td><code>cc-btn</code></td><td>Dismiss cookie button</td></tr>
 * <tr><td><code>cc-link</code></td><td>Learn more link element</td></tr>
 * </tbody>
 * </table>
 */
@NpmPackage(
    name = "@vaadin/vaadin-cookie-consent",
    version = "^1.2.0-alpha1"
)
@Import(
    symbols = {"CookieConsentElement as CookieConsentElement_CookieConsentElement"},
    module = "@vaadin/vaadin-cookie-consent/src/vaadin-cookie-consent.js"
)
@Import(
    module = "@vaadin/vaadin-cookie-consent/src/vaadin-cookie-consent.js"
)
public interface CookieConsentElement extends PolymerElement, ThemableMixin, ElementMixin {
  /**
   * The message to show in the popup.
   *
   */
  @JSProperty("message")
  String getMessage();

  /**
   * The message to show in the popup.
   *
   */
  @JSProperty("message")
  void setMessage(String value);

  /**
   * The text to show on the dismiss/consent button.
   *
   */
  @JSProperty("dismiss")
  String getDismiss();

  /**
   * The text to show on the dismiss/consent button.
   *
   */
  @JSProperty("dismiss")
  void setDismiss(String value);

  /**
   * The text to show on the 'learn more' link.
   *
   */
  @JSProperty("learnMore")
  String getLearnMore();

  /**
   * The text to show on the 'learn more' link.
   *
   */
  @JSProperty("learnMore")
  void setLearnMore(String value);

  /**
   * The URL the 'learn more' link should open.
   *
   */
  @JSProperty("learnMoreLink")
  String getLearnMoreLink();

  /**
   * The URL the 'learn more' link should open.
   *
   */
  @JSProperty("learnMoreLink")
  void setLearnMoreLink(String value);

  /**
   * Determines the position of the banner.
   *
   * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>, <code>bottom-left</code>, <code>bottom-right</code>
   * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
   * it is shown as a smaller popup.
   *
   */
  @JSProperty("position")
  CookieConsentPosition getPosition();

  /**
   * Determines the position of the banner.
   *
   * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>, <code>bottom-left</code>, <code>bottom-right</code>
   * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
   * it is shown as a smaller popup.
   *
   */
  @JSProperty("position")
  void setPosition(CookieConsentPosition value);

  /**
   * The name of the cookie to set to remember that the user has consented.
   *
   * This rarely needs to be changed.
   *
   */
  @JSProperty("cookieName")
  String getCookieName();

  /**
   * The name of the cookie to set to remember that the user has consented.
   *
   * This rarely needs to be changed.
   *
   */
  @JSProperty("cookieName")
  void setCookieName(String value);
}
