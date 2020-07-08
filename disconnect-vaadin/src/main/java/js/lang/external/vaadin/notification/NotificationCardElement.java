package js.lang.external.vaadin.notification;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-notification", version = "^1.6.0-alpha2")
@Import(module = "@vaadin/vaadin-notification/vaadin-notification.js")
public interface NotificationCardElement extends HTMLElement {

    // !wca! get theme: string | null | undefined
}
