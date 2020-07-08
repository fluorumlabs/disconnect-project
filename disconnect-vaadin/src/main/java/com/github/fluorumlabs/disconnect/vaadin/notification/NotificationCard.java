package com.github.fluorumlabs.disconnect.vaadin.notification;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.notification.NotificationCardElement;

/**
 * The container element for the notification
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
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
 *    <td><code>overlay</code></td>
 *    <td>The notification container</td>
 *   </tr>
 *   <tr>
 *    <td><code>content</code></td>
 *    <td>The content of the notification</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-notification-card", external = true)
public class NotificationCard extends HtmlComponent<NotificationCardElement> implements Themable<NotificationCardElement> {

    public NotificationCard() {
    }

    public NotificationCard(String textContent) {
        super(textContent);
    }

    public NotificationCard(Component<?>... components) {
        super(components);
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
