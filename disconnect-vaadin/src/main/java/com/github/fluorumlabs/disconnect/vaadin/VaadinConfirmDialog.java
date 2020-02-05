package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.ConfirmDialogElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Element;
import js.web.dom.Event;

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
public class VaadinConfirmDialog extends AbstractComponent<ConfirmDialogElement>
		implements HasElementMixin<ConfirmDialogElement, VaadinConfirmDialog>,
		HasThemableMixin<ConfirmDialogElement, VaadinConfirmDialog>,
		HasSlottedComponents<ConfirmDialogElement, VaadinConfirmDialog, Component<? extends Element>> {
	public VaadinConfirmDialog() {
		super("vaadin-confirm-dialog");
	}

	/**
	 * True if the overlay is currently displayed.
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * True if the overlay is currently displayed.
	 */
	public VaadinConfirmDialog opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Set the confirmation dialog title.
	 */
	@Nullable
	public String header() {
		return getNode().getHeader();
	}

	/**
	 * Set the confirmation dialog title.
	 */
	public VaadinConfirmDialog header(String header) {
		getNode().setHeader(header);
		return this;
	}

	/**
	 * Set the message or confirmation question.
	 */
	@Nullable
	public String message() {
		return getNode().getMessage();
	}

	/**
	 * Set the message or confirmation question.
	 */
	public VaadinConfirmDialog message(String message) {
		getNode().setMessage(message);
		return this;
	}

	/**
	 * Text displayed on confirm-button.
	 */
	@Nullable
	public String confirmText() {
		return getNode().getConfirmText();
	}

	/**
	 * Text displayed on confirm-button.
	 */
	public VaadinConfirmDialog confirmText(String confirmText) {
		getNode().setConfirmText(confirmText);
		return this;
	}

	/**
	 * Theme for a confirm-button.
	 */
	@Nullable
	public String confirmTheme() {
		return getNode().getConfirmTheme();
	}

	/**
	 * Theme for a confirm-button.
	 */
	public VaadinConfirmDialog confirmTheme(String confirmTheme) {
		getNode().setConfirmTheme(confirmTheme);
		return this;
	}

	/**
	 * Whether to show cancel button or not.
	 */
	public boolean reject() {
		return getNode().isReject();
	}

	/**
	 * Whether to show cancel button or not.
	 */
	public VaadinConfirmDialog reject(boolean reject) {
		getNode().setReject(reject);
		return this;
	}

	/**
	 * Text displayed on reject-button.
	 */
	@Nullable
	public String rejectText() {
		return getNode().getRejectText();
	}

	/**
	 * Text displayed on reject-button.
	 */
	public VaadinConfirmDialog rejectText(String rejectText) {
		getNode().setRejectText(rejectText);
		return this;
	}

	/**
	 * Theme for a reject-button.
	 */
	@Nullable
	public String rejectTheme() {
		return getNode().getRejectTheme();
	}

	/**
	 * Theme for a reject-button.
	 */
	public VaadinConfirmDialog rejectTheme(String rejectTheme) {
		getNode().setRejectTheme(rejectTheme);
		return this;
	}

	/**
	 * Whether to show cancel button or not.
	 */
	public boolean cancel() {
		return getNode().isCancel();
	}

	/**
	 * Whether to show cancel button or not.
	 */
	public VaadinConfirmDialog cancel(boolean cancel) {
		getNode().setCancel(cancel);
		return this;
	}

	/**
	 * Text displayed on cancel-button.
	 */
	@Nullable
	public String cancelText() {
		return getNode().getCancelText();
	}

	/**
	 * Text displayed on cancel-button.
	 */
	public VaadinConfirmDialog cancelText(String cancelText) {
		getNode().setCancelText(cancelText);
		return this;
	}

	/**
	 * Theme for a cancel-button.
	 */
	@Nullable
	public String cancelTheme() {
		return getNode().getCancelTheme();
	}

	/**
	 * Theme for a cancel-button.
	 */
	public VaadinConfirmDialog cancelTheme(String cancelTheme) {
		getNode().setCancelTheme(cancelTheme);
		return this;
	}

	/**
	 * cancel
	 * fired when Cancel button or Escape key was pressed.
	 */
	public ObservableEvent<Event> cancelEvent() {
		return createEvent("cancel");
	}

	/**
	 * confirm
	 * fired when Confirm button was pressed.
	 */
	public ObservableEvent<Event> confirmEvent() {
		return createEvent("confirm");
	}

	/**
	 * reject
	 * fired when Reject button was pressed.
	 */
	public ObservableEvent<Event> rejectEvent() {
		return createEvent("reject");
	}

	/**
	 * Fired when the <code>opened</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> openedChangedEvent() {
		return createEvent("opened-changed");
	}

	/**
	 * Fired when the <code>reject</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> rejectChangedEvent() {
		return createEvent("reject-changed");
	}

	/**
	 * Fired when the <code>cancel</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> cancelChangedEvent() {
		return createEvent("cancel-changed");
	}

	public VaadinConfirmDialog setHeader(Component<? extends Element> component) {
		return replaceSlotted("header", component);
	}

	public VaadinConfirmDialog setHeader(Component<? extends Element>... components) {
		return replaceSlotted("header", components);
	}

	public VaadinConfirmDialog addToHeader(Component<? extends Element> component) {
		return addSlotted("header", component);
	}

	public VaadinConfirmDialog addToHeader(Component<? extends Element>... components) {
		return addSlotted("header", components);
	}

	public VaadinConfirmDialog insertToHeader(Component<? extends Element> component) {
		return insertSlotted("header", component);
	}

	public VaadinConfirmDialog insertToHeader(Component<? extends Element>... components) {
		return insertSlotted("header", components);
	}

	public VaadinConfirmDialog clearHeader() {
		return removeAllSlotted("header");
	}

	public VaadinConfirmDialog setCancelButton(Component<? extends Element> component) {
		return replaceSlotted("cancel-button", component);
	}

	public VaadinConfirmDialog setCancelButton(Component<? extends Element>... components) {
		return replaceSlotted("cancel-button", components);
	}

	public VaadinConfirmDialog addToCancelButton(Component<? extends Element> component) {
		return addSlotted("cancel-button", component);
	}

	public VaadinConfirmDialog addToCancelButton(Component<? extends Element>... components) {
		return addSlotted("cancel-button", components);
	}

	public VaadinConfirmDialog insertToCancelButton(Component<? extends Element> component) {
		return insertSlotted("cancel-button", component);
	}

	public VaadinConfirmDialog insertToCancelButton(Component<? extends Element>... components) {
		return insertSlotted("cancel-button", components);
	}

	public VaadinConfirmDialog clearCancelButton() {
		return removeAllSlotted("cancel-button");
	}

	public VaadinConfirmDialog setRejectButton(Component<? extends Element> component) {
		return replaceSlotted("reject-button", component);
	}

	public VaadinConfirmDialog setRejectButton(Component<? extends Element>... components) {
		return replaceSlotted("reject-button", components);
	}

	public VaadinConfirmDialog addToRejectButton(Component<? extends Element> component) {
		return addSlotted("reject-button", component);
	}

	public VaadinConfirmDialog addToRejectButton(Component<? extends Element>... components) {
		return addSlotted("reject-button", components);
	}

	public VaadinConfirmDialog insertToRejectButton(Component<? extends Element> component) {
		return insertSlotted("reject-button", component);
	}

	public VaadinConfirmDialog insertToRejectButton(Component<? extends Element>... components) {
		return insertSlotted("reject-button", components);
	}

	public VaadinConfirmDialog clearRejectButton() {
		return removeAllSlotted("reject-button");
	}

	public VaadinConfirmDialog setConfirmButton(Component<? extends Element> component) {
		return replaceSlotted("confirm-button", component);
	}

	public VaadinConfirmDialog setConfirmButton(Component<? extends Element>... components) {
		return replaceSlotted("confirm-button", components);
	}

	public VaadinConfirmDialog addToConfirmButton(Component<? extends Element> component) {
		return addSlotted("confirm-button", component);
	}

	public VaadinConfirmDialog addToConfirmButton(Component<? extends Element>... components) {
		return addSlotted("confirm-button", components);
	}

	public VaadinConfirmDialog insertToConfirmButton(Component<? extends Element> component) {
		return insertSlotted("confirm-button", component);
	}

	public VaadinConfirmDialog insertToConfirmButton(Component<? extends Element>... components) {
		return insertSlotted("confirm-button", components);
	}

	public VaadinConfirmDialog clearConfirmButton() {
		return removeAllSlotted("confirm-button");
	}
}
