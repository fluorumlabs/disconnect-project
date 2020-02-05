package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.CookieConsentPosition;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-cookie-consent&gt;</code> is used to show a cookie consent banner the first
 * time a user visits the application.
 * <p>
 * By default, the banner is shown attached to the top of the screen and with a
 * predefined text, a link to <a href="https://cookiesandyou.com/">https://cookiesandyou.com/</a>
 * describing cookies and a consent button.
 * <p>
 * The texts, link and position can be configured using attributes/properties, e.g.
 *
 * <pre><code>&lt;vaadin-cookie-consent learn-more-link=&quot;https://mysite.com/cookies.html&quot;&gt;&lt;
 * /vaadin-cookie-consent&gt;
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
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "CookieConsentElement",
		module = "@vaadin/vaadin-cookie-consent/src/vaadin-cookie-consent.js"
)
public interface CookieConsentElement extends HTMLElement, ElementMixin, ThemableMixin {
	/**
	 * The message to show in the popup.
	 */
	@Nullable
	@JSProperty
	String getMessage();

	/**
	 * The message to show in the popup.
	 */
	@JSProperty
	void setMessage(String message);

	/**
	 * The text to show on the dismiss/consent button.
	 */
	@Nullable
	@JSProperty
	String getDismiss();

	/**
	 * The text to show on the dismiss/consent button.
	 */
	@JSProperty
	void setDismiss(String dismiss);

	/**
	 * The text to show on the 'learn more' link.
	 */
	@Nullable
	@JSProperty
	String getLearnMore();

	/**
	 * The text to show on the 'learn more' link.
	 */
	@JSProperty
	void setLearnMore(String learnMore);

	/**
	 * The URL the 'learn more' link should open.
	 */
	@Nullable
	@JSProperty
	String getLearnMoreLink();

	/**
	 * The URL the 'learn more' link should open.
	 */
	@JSProperty
	void setLearnMoreLink(String learnMoreLink);

	/**
	 * Determines the position of the banner.
	 * <p>
	 * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>,
	 * <code>bottom-left</code>, <code>bottom-right</code>
	 * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
	 * it is shown as a smaller popup.
	 */
	@Nullable
	@JSProperty
	CookieConsentPosition getPosition();

	/**
	 * Determines the position of the banner.
	 * <p>
	 * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>,
	 * <code>bottom-left</code>, <code>bottom-right</code>
	 * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
	 * it is shown as a smaller popup.
	 */
	@JSProperty
	void setPosition(CookieConsentPosition position);

	/**
	 * The name of the cookie to set to remember that the user has consented.
	 * <p>
	 * This rarely needs to be changed.
	 */
	@Nullable
	@JSProperty
	String getCookieName();

	/**
	 * The name of the cookie to set to remember that the user has consented.
	 * <p>
	 * This rarely needs to be changed.
	 */
	@JSProperty
	void setCookieName(String cookieName);
}
