package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.NotificationPosition;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemePropertyMixin;
import com.github.fluorumlabs.disconnect.vaadin.renderers.NotificationRenderer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-notification>` is a Web Component providing accessible and customizable notifications (toasts).
 * The content of the notification can be populated in two ways: imperatively by using renderer callback function
 * and declaratively by using Polymer's Templates.
 * <p>
 * ### Rendering
 * <p>
 * By default, the notification uses the content provided by using the renderer callback function.
 * <p>
 * The renderer function provides `root`, `notification` arguments.
 * Generate DOM content, append it to the `root` element and control the state
 * of the host element by accessing `notification`. Before generating new content,
 * users are able to check if there is already content in `root` for reusing it.
 * <p>
 * ```html
 * <vaadin-notification id="notification"></vaadin-notification>
 * ```
 * ```js
 * const notification = document.querySelector('#notification');
 * notification.renderer = function(root) {
 * root.textContent = "Your work has been saved";
 * };
 * ```
 * <p>
 * Renderer is called on the opening of the notification.
 * DOM generated during the renderer call can be reused
 * in the next renderer call and will be provided with the `root` argument.
 * On first call it will be empty.
 * <p>
 * ### Polymer Templates
 * <p>
 * Alternatively, the content can be provided with Polymer's Template.
 * Notification finds the first child template and uses that in case renderer callback function
 * is not provided. You can also set a custom template using the `template` property.
 * <p>
 * ```
 * <vaadin-notification>
 * <template>
 * Your work has been saved
 * </template>
 * </vaadin-notification>
 * ```
 * <p>
 * ### Styling
 * <p>
 * `<vaadin-notification>` uses `<vaadin-notification-card>` internal
 * themable component as the actual visible notification cards. See
 * the stylable parts the
 * [`<vaadin-notification-card>` API](https://vaadin.com/components/vaadin-notification/html-api/elements/Vaadin
 * .NotificationCard).
 * <p>
 * Note: the `theme` attribute value set on `<vaadin-notification>` is
 * propagated to the internal `<vaadin-notification-card>`.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "NotificationElement",
		module = "@vaadin/vaadin-notification/src/vaadin-notification.js"
)
public interface NotificationElement extends HTMLElement, ThemePropertyMixin {
	/**
	 * The duration in milliseconds to show the notification.
	 * Set to `0` or a negative number to disable the notification auto-closing.
	 */
	@JSProperty
	double getDuration();

	/**
	 * The duration in milliseconds to show the notification.
	 * Set to `0` or a negative number to disable the notification auto-closing.
	 */
	@JSProperty
	void setDuration(double duration);

	/**
	 * True if the notification is currently displayed.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True if the notification is currently displayed.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Alignment of the notification in the viewport
	 * Valid values are `top-stretch|top-start|top-center|top-end|middle|bottom-start|bottom-center|bottom-end|bottom
	 * -stretch`
	 */
	@Nullable
	@JSProperty
	NotificationPosition getPosition();

	/**
	 * Alignment of the notification in the viewport
	 * Valid values are `top-stretch|top-start|top-center|top-end|middle|bottom-start|bottom-center|bottom-end|bottom
	 * -stretch`
	 */
	@JSProperty
	void setPosition(NotificationPosition position);

	/**
	 * Custom function for rendering the content of the notification.
	 * Receives two arguments:
	 * <p>
	 * - `root` The `<vaadin-notification-card>` DOM element. Append
	 * your content to it.
	 * - `notification` The reference to the `<vaadin-notification>` element.
	 */
	@Nullable
	@JSProperty
	NotificationRenderer getRenderer();

	/**
	 * Custom function for rendering the content of the notification.
	 * Receives two arguments:
	 * <p>
	 * - `root` The `<vaadin-notification-card>` DOM element. Append
	 * your content to it.
	 * - `notification` The reference to the `<vaadin-notification>` element.
	 */
	@JSProperty
	void setRenderer(NotificationRenderer renderer);

	/**
	 * Manually invoke existing renderer.
	 */
	void render();

	/**
	 * Opens the notification.
	 */
	void open();

	/**
	 * Closes the notification.
	 */
	void close();
}
