package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-confirm-dialog>` is a Web Component for showing alerts and asking for user confirmation.
 * <p>
 * ```
 * <vaadin-confirm-dialog on-confirm="_doConfirm">
 * Sample confirmation question
 * </vaadin-confirm-dialog>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following Shadow DOM parts are available for styling the dialog parts:
 * <p>
 * Part name  | Description
 * -----------|---------------------------------------------------------|
 * `header`   | Header of the confirmation dialog
 * `message`  | Container for the message of the dialog
 * `footer`   | Container for the buttons
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * ### Custom content
 * <p>
 * The following parts are available for replacement:
 * <p>
 * Slot name         | Description
 * ------------------|---------------------------------------------------------|
 * `header`          | Header of the confirmation dialog
 * `message`         | Container for the message of the dialog
 * `cancel-button`   | Container for the Cancel button
 * `reject-button`   | Container for the Reject button
 * `confirm-button`  | Container for the Confirm button
 * <p>
 * See examples of setting custom buttons into slots in the live demos.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "ConfirmDialogElement",
		module = "@vaadin/vaadin-confirm-dialog/src/vaadin-confirm-dialog.js"
)
public interface ConfirmDialogElement extends HTMLElement, ElementMixin, ThemableMixin {
	/**
	 * True if the overlay is currently displayed.
	 */
	@JSProperty
	boolean isOpened();

	/**
	 * True if the overlay is currently displayed.
	 */
	@JSProperty
	void setOpened(boolean opened);

	/**
	 * Set the confirmation dialog title.
	 */
	@Nullable
	@JSProperty
	String getHeader();

	/**
	 * Set the confirmation dialog title.
	 */
	@JSProperty
	void setHeader(String header);

	/**
	 * Set the message or confirmation question.
	 */
	@Nullable
	@JSProperty
	String getMessage();

	/**
	 * Set the message or confirmation question.
	 */
	@JSProperty
	void setMessage(String message);

	/**
	 * Text displayed on confirm-button.
	 */
	@Nullable
	@JSProperty
	String getConfirmText();

	/**
	 * Text displayed on confirm-button.
	 */
	@JSProperty
	void setConfirmText(String confirmText);

	/**
	 * Theme for a confirm-button.
	 */
	@Nullable
	@JSProperty
	String getConfirmTheme();

	/**
	 * Theme for a confirm-button.
	 */
	@JSProperty
	void setConfirmTheme(String confirmTheme);

	/**
	 * Whether to show cancel button or not.
	 */
	@JSProperty
	boolean isReject();

	/**
	 * Whether to show cancel button or not.
	 */
	@JSProperty
	void setReject(boolean reject);

	/**
	 * Text displayed on reject-button.
	 */
	@Nullable
	@JSProperty
	String getRejectText();

	/**
	 * Text displayed on reject-button.
	 */
	@JSProperty
	void setRejectText(String rejectText);

	/**
	 * Theme for a reject-button.
	 */
	@Nullable
	@JSProperty
	String getRejectTheme();

	/**
	 * Theme for a reject-button.
	 */
	@JSProperty
	void setRejectTheme(String rejectTheme);

	/**
	 * Whether to show cancel button or not.
	 */
	@JSProperty
	boolean isCancel();

	/**
	 * Whether to show cancel button or not.
	 */
	@JSProperty
	void setCancel(boolean cancel);

	/**
	 * Text displayed on cancel-button.
	 */
	@Nullable
	@JSProperty
	String getCancelText();

	/**
	 * Text displayed on cancel-button.
	 */
	@JSProperty
	void setCancelText(String cancelText);

	/**
	 * Theme for a cancel-button.
	 */
	@Nullable
	@JSProperty
	String getCancelTheme();

	/**
	 * Theme for a cancel-button.
	 */
	@JSProperty
	void setCancelTheme(String cancelTheme);
}
