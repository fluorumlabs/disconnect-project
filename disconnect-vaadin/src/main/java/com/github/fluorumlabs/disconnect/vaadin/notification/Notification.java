package com.github.fluorumlabs.disconnect.vaadin.notification;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.polymer.HasTemplate;
import com.github.fluorumlabs.disconnect.vaadin.ComponentRenderer;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.notification.NotificationElement;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-notification&gt;</code> is a Web Component providing accessible and customizable notifications (toasts). The content of the notification can be populated in two ways: imperatively by using renderer callback function and declaratively by using Polymer's Templates.
 *
 * <h3>Rendering</h3>
 * By default, the notification uses the content provided by using the renderer callback function.
 *
 * The renderer function provides <code>root</code>, <code>notification</code> arguments. Generate DOM content, append it to the <code>root</code> element and control the state of the host element by accessing <code>notification</code>. Before generating new content, users are able to check if there is already content in <code>root</code> for reusing it.
 *
 * <pre><code class="language-html">&lt;vaadin-notification id="notification"&gt;&lt;/vaadin-notification&gt;
 * </code></pre>
 * <pre><code class="language-js">const notification = document.querySelector('#notification');
 * notification.renderer = function(root) {
 *    root.textContent = "Your work has been saved";
 * };
 * </code></pre>
 * Renderer is called on the opening of the notification. DOM generated during the renderer call can be reused in the next renderer call and will be provided with the <code>root</code> argument. On first call it will be empty.
 *
 * <h3>Polymer Templates</h3>
 * Alternatively, the content can be provided with Polymer's Template. Notification finds the first child template and uses that in case renderer callback function is not provided. You can also set a custom template using the <code>template</code> property.
 *
 * <pre><code>&lt;vaadin-notification&gt;
 *    &lt;template&gt;
 *      Your work has been saved
 *    &lt;/template&gt;
 * &lt;/vaadin-notification&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * <code>&lt;vaadin-notification&gt;</code> uses <code>&lt;vaadin-notification-card&gt;</code> internal themable component as the actual visible notification cards. See the stylable parts the <a href="https://vaadin.com/components/vaadin-notification/html-api/elements/Vaadin.NotificationCard"><code>&lt;vaadin-notification-card&gt;</code> API</a>.
 *
 * Note: the <code>theme</code> attribute value set on <code>&lt;vaadin-notification&gt;</code> is propagated to the internal <code>&lt;vaadin-notification-card&gt;</code>.
 *
 * <strong>Mixins:</strong> ThemePropertyMixin, ElementMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-notification", external = true)
public class Notification extends HtmlComponent<NotificationElement> implements HasTemplate, Themable<NotificationElement> {

    public Notification() {
    }

    public Notification(String textContent) {
        makeTemplate(textContent);
    }

    public Notification(Component<?>... components) {
        makeTemplate(components);
    }

    // !wca! close: (): void
    /**
     * Closes the notification.
     */
    public void close() {
        getElement().close();
    }

    // !wca! open: (): void
    /**
     * Opens the notification.
     */
    public void open() {
        getElement().open();
    }

    // !wca! get duration: number
    /**
     * The duration in milliseconds to show the notification.
     * Set to <code>0</code> or a negative number to disable the notification auto-closing.
     */
    public int getDuration() {
        return getElement().getDuration();
    }

    // !wca! set duration: number
    /**
     * The duration in milliseconds to show the notification.
     * Set to <code>0</code> or a negative number to disable the notification auto-closing.
     */
    public void setDuration(int value) {
        getElement().setDuration(value);
    }

    // !wca! observe duration: number

    // !wca! get opened: boolean
    /**
     * True if the notification is currently displayed.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True if the notification is currently displayed.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True if the notification is currently displayed.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get position: !NotificationPosition
    /**
     * Alignment of the notification in the viewport
     * Valid values are <code>top-stretch\|top-start\|top-center\|top-end\|middle\|bottom-start\|bottom-center\|bottom-end\|bottom-stretch</code>
     */
    public Position getPosition() {
        return LowerCase.parse(Position.class, getElement().getPosition());
    }

    // !wca! set position: !NotificationPosition
    /**
     * Alignment of the notification in the viewport
     * Valid values are <code>top-stretch\|top-start\|top-center\|top-end\|middle\|bottom-start\|bottom-center\|bottom-end\|bottom-stretch</code>
     */
    public void setPosition(Position value) {
        getElement().setPosition(LowerCase.of(value));
    }

    // !wca! observe position: !NotificationPosition

    // !wca! get renderer: !NotificationRenderer | undefined

    // !wca! set renderer: !NotificationRenderer | undefined
    /**
     * Custom function for rendering the content of the notification.
     * Receives two arguments:
     *
     * - <code>root</code> The <code>&lt;vaadin-notification-card&gt;</code> DOM element. Append
     *  your content to it.
     * - <code>notification</code> The reference to the <code>&lt;vaadin-notification&gt;</code> element.
     * @param value
     */
    public void setRenderer(@Nullable ComponentRenderer value) {
        if (value == null) {
            getElement().setRenderer(null);
            return;
        }
        getElement().setRenderer(((root, element) -> value.renderTo(new ParentNodeBackedComponentList<>(root))));
    }

    // !wca! observe renderer: !NotificationRenderer | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    public enum Position {
        TOP_STRETCH, TOP_START, TOP_CENTER, TOP_END,
        MIDDLE,
        BOTTOM_START, BOTTOM_CENTER, BOTTOM_END, BOTTOM_STRETCH
    }
}
