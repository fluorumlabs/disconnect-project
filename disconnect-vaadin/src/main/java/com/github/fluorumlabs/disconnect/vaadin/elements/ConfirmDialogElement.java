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
 * <code>&lt;vaadin-confirm-dialog&gt;</code> is a Web Component for showing alerts and asking for user confirmation.
 *
 * <pre><code>&lt;vaadin-confirm-dialog on-confirm=&quot;_doConfirm&quot;&gt;
 *  Sample confirmation question
 * &lt;/vaadin-confirm-dialog&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following Shadow DOM parts are available for styling the dialog parts:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>header</code></td><td>Header of the confirmation dialog</td></tr>
 * <tr><td><code>message</code></td><td>Container for the message of the dialog</td></tr>
 * <tr><td><code>footer</code></td><td>Container for the buttons</td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 * <h3>Custom content</h3>
 * The following parts are available for replacement:
 *
 * <table>
 * <thead>
 * <tr><th>Slot name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>header</code></td><td>Header of the confirmation dialog</td></tr>
 * <tr><td><code>message</code></td><td>Container for the message of the dialog</td></tr>
 * <tr><td><code>cancel-button</code></td><td>Container for the Cancel button</td></tr>
 * <tr><td><code>reject-button</code></td><td>Container for the Reject button</td></tr>
 * <tr><td><code>confirm-button</code></td><td>Container for the Confirm button</td></tr>
 * </tbody>
 * </table>
 * See examples of setting custom buttons into slots in the live demos.
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-confirm-dialog/theme/lumo/vaadin-confirm-dialog.js"
)
public interface ConfirmDialogElement extends HTMLElement, ElementMixin, ThemableMixin {
	static String TAGNAME() {
		return "vaadin-confirm-dialog";
	}

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
