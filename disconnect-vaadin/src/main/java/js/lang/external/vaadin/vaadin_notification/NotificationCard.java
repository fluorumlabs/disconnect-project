package js.lang.external.vaadin.vaadin_notification;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;

/**
 * The container element for the notification
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>overlay</code></td><td>The notification container</td></tr>
 * <tr><td><code>content</code></td><td>The content of the notification</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-notification",
    version = "^1.6.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-notification/src/vaadin-notification.js"
)
public interface NotificationCard extends PolymerElement, ThemableMixin {
  void ready();
}
