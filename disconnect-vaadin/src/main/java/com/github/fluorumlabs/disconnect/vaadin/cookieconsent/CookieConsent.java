package com.github.fluorumlabs.disconnect.vaadin.cookieconsent;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.cookieconsent.CookieConsentElement;

/**
 * <code>&lt;vaadin-cookie-consent&gt;</code> is used to show a cookie consent banner the first time a user visits the application.
 *
 * By default, the banner is shown attached to the top of the screen and with a predefined text, a link to <a href="https://cookiesandyou.com/">https://cookiesandyou.com/</a> describing cookies and a consent button.
 *
 * The texts, link and position can be configured using attributes/properties, e.g.
 *
 * <pre><code>&lt;vaadin-cookie-consent learn-more-link="https://mysite.com/cookies.html"&gt;&lt;/vaadin-cookie-consent&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * To change the look of the cookie consent banner, a <code>style</code> node should be attached to the document's head with the following style names overridden:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Style name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>cc-window</code></td>
 *    <td>Banner container</td>
 *   </tr>
 *   <tr>
 *    <td><code>cc-message</code></td>
 *    <td>Message container</td>
 *   </tr>
 *   <tr>
 *    <td><code>cc-compliance</code></td>
 *    <td>Dismiss cookie button container</td>
 *   </tr>
 *   <tr>
 *    <td><code>cc-dismiss</code></td>
 *    <td>Dismiss cookie button</td>
 *   </tr>
 *   <tr>
 *    <td><code>cc-btn</code></td>
 *    <td>Dismiss cookie button</td>
 *   </tr>
 *   <tr>
 *    <td><code>cc-link</code></td>
 *    <td>Learn more link element</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-cookie-consent", external = true)
public class CookieConsent extends HtmlComponent<CookieConsentElement> implements Themable<CookieConsentElement> {

    public CookieConsent() {
    }

    // !wca! get cookieName: string
    /**
     * The name of the cookie to set to remember that the user has consented.
     *
     * This rarely needs to be changed.
     */
    public String getCookieName() {
        return getElement().getCookieName();
    }

    // !wca! set cookieName: string
    /**
     * The name of the cookie to set to remember that the user has consented.
     *
     * This rarely needs to be changed.
     */
    public void setCookieName(String value) {
        getElement().setCookieName(value);
    }

    // !wca! observe cookieName: string

    // !wca! get dismiss: string
    /**
     * The text to show on the dismiss/consent button.
     */
    public String getDismiss() {
        return getElement().getDismiss();
    }

    // !wca! set dismiss: string
    /**
     * The text to show on the dismiss/consent button.
     */
    public void setDismiss(String value) {
        getElement().setDismiss(value);
    }

    // !wca! observe dismiss: string

    // !wca! get learnMore: string
    /**
     * The text to show on the 'learn more' link.
     */
    public String getLearnMore() {
        return getElement().getLearnMore();
    }

    // !wca! set learnMore: string
    /**
     * The text to show on the 'learn more' link.
     */
    public void setLearnMore(String value) {
        getElement().setLearnMore(value);
    }

    // !wca! observe learnMore: string

    // !wca! get learnMoreLink: string
    /**
     * The URL the 'learn more' link should open.
     */
    public String getLearnMoreLink() {
        return getElement().getLearnMoreLink();
    }

    // !wca! set learnMoreLink: string
    /**
     * The URL the 'learn more' link should open.
     */
    public void setLearnMoreLink(String value) {
        getElement().setLearnMoreLink(value);
    }

    // !wca! observe learnMoreLink: string

    // !wca! get message: string
    /**
     * The message to show in the popup.
     */
    public String getMessage() {
        return getElement().getMessage();
    }

    // !wca! set message: string
    /**
     * The message to show in the popup.
     */
    public void setMessage(String value) {
        getElement().setMessage(value);
    }

    // !wca! observe message: string

    // !wca! get position: !CookieConsentPosition
    /**
     * Determines the position of the banner.
     *
     * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>, <code>bottom-left</code>, <code>bottom-right</code>
     * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
     * it is shown as a smaller popup.
     */
    public Position getPosition() {
        return LowerCase.parse(Position.class, getElement().getPosition());
    }

    // !wca! set position: !CookieConsentPosition
    /**
     * Determines the position of the banner.
     *
     * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>, <code>bottom-left</code>, <code>bottom-right</code>
     * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
     * it is shown as a smaller popup.
     */
    public void setPosition(Position value) {
        getElement().setPosition(LowerCase.of(value));
    }

    // !wca! observe position: !CookieConsentPosition

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Position {
        TOP, BOTTOM, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT
    }
}
