package com.github.fluorumlabs.disconnect.vaadin.confirmdialog;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.confirmdialog.ConfirmDialogElement;
import js.web.dom.Event;
import org.checkerframework.checker.units.qual.C;

/**
 * <code>&lt;vaadin-confirm-dialog&gt;</code> is a Web Component for showing alerts and asking for user confirmation.
 *
 * <pre><code>&lt;vaadin-confirm-dialog on-confirm="_doConfirm"&gt;
 *   Sample confirmation question
 * &lt;/vaadin-confirm-dialog&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following Shadow DOM parts are available for styling the dialog parts:
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
 *    <td><code>header</code></td>
 *    <td>Header of the confirmation dialog</td>
 *   </tr>
 *   <tr>
 *    <td><code>message</code></td>
 *    <td>Container for the message of the dialog</td>
 *   </tr>
 *   <tr>
 *    <td><code>footer</code></td>
 *    <td>Container for the buttons</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <h3>Custom content</h3>
 * The following parts are available for replacement:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Slot name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>header</code></td>
 *    <td>Header of the confirmation dialog</td>
 *   </tr>
 *   <tr>
 *    <td><code>message</code></td>
 *    <td>Container for the message of the dialog</td>
 *   </tr>
 *   <tr>
 *    <td><code>cancel-button</code></td>
 *    <td>Container for the Cancel button</td>
 *   </tr>
 *   <tr>
 *    <td><code>reject-button</code></td>
 *    <td>Container for the Reject button</td>
 *   </tr>
 *   <tr>
 *    <td><code>confirm-button</code></td>
 *    <td>Container for the Confirm button</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See examples of setting custom buttons into slots in the live demos.
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-confirm-dialog", external = true)
public class ConfirmDialog extends HtmlComponent<ConfirmDialogElement> implements Themable<ConfirmDialogElement> {

    public ConfirmDialog() {
    }

    public ConfirmDialog(String textContent) {
        super(textContent);
    }

    public ConfirmDialog(Component<?>... components) {
        super(components);
    }

    // !wca! get cancel: boolean
    /**
     * Whether to show cancel button or not.
     */
    public boolean isCancel() {
        return getElement().isCancel();
    }

    // !wca! set cancel: boolean
    /**
     * Whether to show cancel button or not.
     */
    public void setCancel(boolean value) {
        getElement().setCancel(value);
    }

    // !wca! observe cancel: boolean

    // !wca! get cancelText: string
    /**
     * Text displayed on cancel-button.
     */
    public String getCancelText() {
        return getElement().getCancelText();
    }

    // !wca! set cancelText: string
    /**
     * Text displayed on cancel-button.
     */
    public void setCancelText(String value) {
        getElement().setCancelText(value);
    }

    // !wca! observe cancelText: string

    // !wca! get cancelTheme: string
    /**
     * Theme for a cancel-button.
     */
    public String getCancelTheme() {
        return getElement().getCancelTheme();
    }

    // !wca! set cancelTheme: string
    /**
     * Theme for a cancel-button.
     */
    public void setCancelTheme(String value) {
        getElement().setCancelTheme(value);
    }

    // !wca! observe cancelTheme: string

    // !wca! get confirmText: string
    /**
     * Text displayed on confirm-button.
     */
    public String getConfirmText() {
        return getElement().getConfirmText();
    }

    // !wca! set confirmText: string
    /**
     * Text displayed on confirm-button.
     */
    public void setConfirmText(String value) {
        getElement().setConfirmText(value);
    }

    // !wca! observe confirmText: string

    // !wca! get confirmTheme: string
    /**
     * Theme for a confirm-button.
     */
    public String getConfirmTheme() {
        return getElement().getConfirmTheme();
    }

    // !wca! set confirmTheme: string
    /**
     * Theme for a confirm-button.
     */
    public void setConfirmTheme(String value) {
        getElement().setConfirmTheme(value);
    }

    // !wca! observe confirmTheme: string

    // !wca! get header: string
    /**
     * Set the confirmation dialog title.
     */
    public String getHeader() {
        return getElement().getHeader();
    }

    // !wca! set header: string
    /**
     * Set the confirmation dialog title.
     */
    public void setHeader(String value) {
        getElement().setHeader(value);
    }

    // !wca! observe header: string

    // !wca! get message: string
    /**
     * Set the message or confirmation question.
     */
    public String getMessage() {
        return getElement().getMessage();
    }

    // !wca! set message: string
    /**
     * Set the message or confirmation question.
     */
    public void setMessage(String value) {
        getElement().setMessage(value);
    }

    // !wca! observe message: string

    // !wca! get noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    public boolean isNoCloseOnEsc() {
        return getElement().isNoCloseOnEsc();
    }

    // !wca! set noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    public void setNoCloseOnEsc(boolean value) {
        getElement().setNoCloseOnEsc(value);
    }

    // !wca! observe noCloseOnEsc: boolean

    // !wca! get opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }

    // !wca! get reject: boolean
    /**
     * Whether to show cancel button or not.
     */
    public boolean isReject() {
        return getElement().isReject();
    }

    // !wca! set reject: boolean
    /**
     * Whether to show cancel button or not.
     */
    public void setReject(boolean value) {
        getElement().setReject(value);
    }

    // !wca! observe reject: boolean

    // !wca! get rejectText: string
    /**
     * Text displayed on reject-button.
     */
    public String getRejectText() {
        return getElement().getRejectText();
    }

    // !wca! set rejectText: string
    /**
     * Text displayed on reject-button.
     */
    public void setRejectText(String value) {
        getElement().setRejectText(value);
    }

    // !wca! observe rejectText: string

    // !wca! get rejectTheme: string
    /**
     * Theme for a reject-button.
     */
    public String getRejectTheme() {
        return getElement().getRejectTheme();
    }

    // !wca! set rejectTheme: string
    /**
     * Theme for a reject-button.
     */
    public void setRejectTheme(String value) {
        getElement().setRejectTheme(value);
    }

    // !wca! observe rejectTheme: string

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! event cancel: ?
    public ObservableEvent<Event> cancelEvent() {
        return createEvent("cancel");
    }

    // !wca! event confirm: ?
    public ObservableEvent<Event> confirmEvent() {
        return createEvent("confirm");
    }

    // !wca! event reject: ?
    public ObservableEvent<Event> rejectEvent() {
        return createEvent("reject");
    }
}
