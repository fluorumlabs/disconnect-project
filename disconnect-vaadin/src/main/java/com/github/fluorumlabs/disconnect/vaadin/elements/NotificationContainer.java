package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * The container element for all notifications.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "NotificationContainer",
		module = "@vaadin/vaadin-notification/vaadin-notification.js"
)
public interface NotificationContainer extends HTMLElement {
	/**
	 * True when the container is opened
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True when the container is opened
	 */
	@JSProperty
	void setOpened(boolean opened);
}
