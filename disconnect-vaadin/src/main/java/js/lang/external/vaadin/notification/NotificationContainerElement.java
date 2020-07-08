package js.lang.external.vaadin.notification;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * The container element for all notifications.
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-notification", version = "^1.6.0-alpha2")
@Import(module = "@vaadin/vaadin-notification/vaadin-notification.js")
public interface NotificationContainerElement extends HTMLElement {

    // !wca! get opened: boolean
    /**
     * True when the container is opened
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean
    /**
     * True when the container is opened
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get theme: string | null | undefined
}
