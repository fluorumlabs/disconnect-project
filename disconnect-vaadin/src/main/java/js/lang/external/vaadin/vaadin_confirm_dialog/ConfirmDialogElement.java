package js.lang.external.vaadin.vaadin_confirm_dialog;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
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
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
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
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-confirm-dialog",
    version = "^1.3.0-alpha1"
)
@Import(
    symbols = {"ConfirmDialogElement as ConfirmDialogElement_ConfirmDialogElement"},
    module = "@vaadin/vaadin-confirm-dialog/src/vaadin-confirm-dialog.js"
)
@Import(
    module = "@vaadin/vaadin-confirm-dialog/src/vaadin-confirm-dialog.js"
)
public interface ConfirmDialogElement extends PolymerElement, ThemableMixin, ElementMixin {
  /**
   * True if the overlay is currently displayed.
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * True if the overlay is currently displayed.
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

  /**
   * Set the confirmation dialog title.
   *
   */
  @JSProperty("header")
  String getHeader();

  /**
   * Set the confirmation dialog title.
   *
   */
  @JSProperty("header")
  void setHeader(String value);

  /**
   * Set the message or confirmation question.
   *
   */
  @JSProperty("message")
  @Nullable
  String getMessage();

  /**
   * Set the message or confirmation question.
   *
   */
  @JSProperty("message")
  void setMessage(@Nullable String value);

  /**
   * Text displayed on confirm-button.
   *
   */
  @JSProperty("confirmText")
  String getConfirmText();

  /**
   * Text displayed on confirm-button.
   *
   */
  @JSProperty("confirmText")
  void setConfirmText(String value);

  /**
   * Theme for a confirm-button.
   *
   */
  @JSProperty("confirmTheme")
  String getConfirmTheme();

  /**
   * Theme for a confirm-button.
   *
   */
  @JSProperty("confirmTheme")
  void setConfirmTheme(String value);

  /**
   * Set to true to disable closing dialog on Escape press
   *
   */
  @JSProperty("noCloseOnEsc")
  boolean getNoCloseOnEsc();

  /**
   * Set to true to disable closing dialog on Escape press
   *
   */
  @JSProperty("noCloseOnEsc")
  void setNoCloseOnEsc(boolean value);

  /**
   * Whether to show cancel button or not.
   *
   */
  @JSProperty("reject")
  boolean getReject();

  /**
   * Whether to show cancel button or not.
   *
   */
  @JSProperty("reject")
  void setReject(boolean value);

  /**
   * Text displayed on reject-button.
   *
   */
  @JSProperty("rejectText")
  String getRejectText();

  /**
   * Text displayed on reject-button.
   *
   */
  @JSProperty("rejectText")
  void setRejectText(String value);

  /**
   * Theme for a reject-button.
   *
   */
  @JSProperty("rejectTheme")
  String getRejectTheme();

  /**
   * Theme for a reject-button.
   *
   */
  @JSProperty("rejectTheme")
  void setRejectTheme(String value);

  /**
   * Whether to show cancel button or not.
   *
   */
  @JSProperty("cancel")
  boolean getCancel();

  /**
   * Whether to show cancel button or not.
   *
   */
  @JSProperty("cancel")
  void setCancel(boolean value);

  /**
   * Text displayed on cancel-button.
   *
   */
  @JSProperty("cancelText")
  String getCancelText();

  /**
   * Text displayed on cancel-button.
   *
   */
  @JSProperty("cancelText")
  void setCancelText(String value);

  /**
   * Theme for a cancel-button.
   *
   */
  @JSProperty("cancelTheme")
  String getCancelTheme();

  /**
   * Theme for a cancel-button.
   *
   */
  @JSProperty("cancelTheme")
  void setCancelTheme(String value);

  void ready();
}
