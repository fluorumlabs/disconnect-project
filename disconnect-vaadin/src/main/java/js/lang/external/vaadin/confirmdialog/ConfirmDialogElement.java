package js.lang.external.vaadin.confirmdialog;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-confirm-dialog", version = "^1.3.0-alpha1")
@Import(module = "@vaadin/vaadin-confirm-dialog/vaadin-confirm-dialog.js")
public interface ConfirmDialogElement extends HTMLElement {

    // !wca! get cancel: boolean
    /**
     * Whether to show cancel button or not.
     */
    @JSProperty("cancel")
    boolean isCancel();

    // !wca! set cancel: boolean
    /**
     * Whether to show cancel button or not.
     */
    @JSProperty("cancel")
    void setCancel(boolean value);

    // !wca! get cancelText: string
    /**
     * Text displayed on cancel-button.
     */
    @JSProperty("cancelText")
    String getCancelText();

    // !wca! set cancelText: string
    /**
     * Text displayed on cancel-button.
     */
    @JSProperty("cancelText")
    void setCancelText(String value);

    // !wca! get cancelTheme: string
    /**
     * Theme for a cancel-button.
     */
    @JSProperty("cancelTheme")
    String getCancelTheme();

    // !wca! set cancelTheme: string
    /**
     * Theme for a cancel-button.
     */
    @JSProperty("cancelTheme")
    void setCancelTheme(String value);

    // !wca! get confirmText: string
    /**
     * Text displayed on confirm-button.
     */
    @JSProperty("confirmText")
    String getConfirmText();

    // !wca! set confirmText: string
    /**
     * Text displayed on confirm-button.
     */
    @JSProperty("confirmText")
    void setConfirmText(String value);

    // !wca! get confirmTheme: string
    /**
     * Theme for a confirm-button.
     */
    @JSProperty("confirmTheme")
    String getConfirmTheme();

    // !wca! set confirmTheme: string
    /**
     * Theme for a confirm-button.
     */
    @JSProperty("confirmTheme")
    void setConfirmTheme(String value);

    // !wca! get header: string
    /**
     * Set the confirmation dialog title.
     */
    @JSProperty("header")
    String getHeader();

    // !wca! set header: string
    /**
     * Set the confirmation dialog title.
     */
    @JSProperty("header")
    void setHeader(String value);

    // !wca! get message: string
    /**
     * Set the message or confirmation question.
     */
    @JSProperty("message")
    String getMessage();

    // !wca! set message: string
    /**
     * Set the message or confirmation question.
     */
    @JSProperty("message")
    void setMessage(String value);

    // !wca! get noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    @JSProperty("noCloseOnEsc")
    boolean isNoCloseOnEsc();

    // !wca! set noCloseOnEsc: boolean
    /**
     * Set to true to disable closing dialog on Escape press
     */
    @JSProperty("noCloseOnEsc")
    void setNoCloseOnEsc(boolean value);

    // !wca! get opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean
    /**
     * True if the overlay is currently displayed.
     */
    @JSProperty("opened")
    void setOpened(boolean value);

    // !wca! get reject: boolean
    /**
     * Whether to show cancel button or not.
     */
    @JSProperty("reject")
    boolean isReject();

    // !wca! set reject: boolean
    /**
     * Whether to show cancel button or not.
     */
    @JSProperty("reject")
    void setReject(boolean value);

    // !wca! get rejectText: string
    /**
     * Text displayed on reject-button.
     */
    @JSProperty("rejectText")
    String getRejectText();

    // !wca! set rejectText: string
    /**
     * Text displayed on reject-button.
     */
    @JSProperty("rejectText")
    void setRejectText(String value);

    // !wca! get rejectTheme: string
    /**
     * Theme for a reject-button.
     */
    @JSProperty("rejectTheme")
    String getRejectTheme();

    // !wca! set rejectTheme: string
    /**
     * Theme for a reject-button.
     */
    @JSProperty("rejectTheme")
    void setRejectTheme(String value);

    // !wca! get theme: string | null | undefined
}
