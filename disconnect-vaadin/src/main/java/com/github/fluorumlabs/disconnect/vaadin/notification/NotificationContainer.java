package com.github.fluorumlabs.disconnect.vaadin.notification;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.notification.NotificationContainerElement;

/**
 * The container element for all notifications.
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin, ElementMixin
 */
@CustomElement(tagName = "vaadin-notification-container", external = true)
public class NotificationContainer extends HtmlComponent<NotificationContainerElement> implements Themable<NotificationContainerElement> {

    public NotificationContainer() {
    }

    public NotificationContainer(String textContent) {
        super(textContent);
    }

    public NotificationContainer(Component<?>... components) {
        super(components);
    }

    // !wca! get opened: boolean
    /**
     * True when the container is opened
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True when the container is opened
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True when the container is opened
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
