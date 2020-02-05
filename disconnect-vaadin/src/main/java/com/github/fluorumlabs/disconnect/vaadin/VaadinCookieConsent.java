package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.constants.CookieConsentPosition;
import com.github.fluorumlabs.disconnect.vaadin.elements.CookieConsentElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

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
public class VaadinCookieConsent extends AbstractComponent<CookieConsentElement>
		implements HasElementMixin<CookieConsentElement, VaadinCookieConsent>,
		HasThemableMixin<CookieConsentElement, VaadinCookieConsent>,
		HasComponents<CookieConsentElement, VaadinCookieConsent, Component<?>> {
	public VaadinCookieConsent() {
		super("vaadin-cookie-consent");
	}

	/**
	 * The message to show in the popup.
	 */
	@Nullable
	public String message() {
		return getNode().getMessage();
	}

	/**
	 * The message to show in the popup.
	 */
	public VaadinCookieConsent message(String message) {
		getNode().setMessage(message);
		return this;
	}

	/**
	 * The text to show on the dismiss/consent button.
	 */
	@Nullable
	public String dismiss() {
		return getNode().getDismiss();
	}

	/**
	 * The text to show on the dismiss/consent button.
	 */
	public VaadinCookieConsent dismiss(String dismiss) {
		getNode().setDismiss(dismiss);
		return this;
	}

	/**
	 * The text to show on the 'learn more' link.
	 */
	@Nullable
	public String learnMore() {
		return getNode().getLearnMore();
	}

	/**
	 * The text to show on the 'learn more' link.
	 */
	public VaadinCookieConsent learnMore(String learnMore) {
		getNode().setLearnMore(learnMore);
		return this;
	}

	/**
	 * The URL the 'learn more' link should open.
	 */
	@Nullable
	public String learnMoreLink() {
		return getNode().getLearnMoreLink();
	}

	/**
	 * The URL the 'learn more' link should open.
	 */
	public VaadinCookieConsent learnMoreLink(String learnMoreLink) {
		getNode().setLearnMoreLink(learnMoreLink);
		return this;
	}

	/**
	 * Determines the position of the banner.
	 * <p>
	 * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>,
	 * <code>bottom-left</code>, <code>bottom-right</code>
	 * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
	 * it is shown as a smaller popup.
	 */
	@Nullable
	public CookieConsentPosition position() {
		return getNode().getPosition();
	}

	/**
	 * Determines the position of the banner.
	 * <p>
	 * Possible values are: <code>top</code>, <code>bottom</code>, <code>top-left</code>, <code>top-right</code>,
	 * <code>bottom-left</code>, <code>bottom-right</code>
	 * For <code>top</code> and <code>bottom</code>, the banner is shown with full width. For the corner positions,
	 * it is shown as a smaller popup.
	 */
	public VaadinCookieConsent position(CookieConsentPosition position) {
		getNode().setPosition(position);
		return this;
	}

	/**
	 * The name of the cookie to set to remember that the user has consented.
	 * <p>
	 * This rarely needs to be changed.
	 */
	@Nullable
	public String cookieName() {
		return getNode().getCookieName();
	}

	/**
	 * The name of the cookie to set to remember that the user has consented.
	 * <p>
	 * This rarely needs to be changed.
	 */
	public VaadinCookieConsent cookieName(String cookieName) {
		getNode().setCookieName(cookieName);
		return this;
	}
}
