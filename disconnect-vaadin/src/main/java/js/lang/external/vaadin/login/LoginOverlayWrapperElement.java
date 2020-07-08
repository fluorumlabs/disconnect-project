package js.lang.external.vaadin.login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-login-overlay-wrapper&gt;</code> is a helper element for <code>&lt;vaadin-login-overlay&gt;</code> that provides responsive template for the login form.
 *
 * <h3>Styling</h3>
 * The following Shadow DOM parts of the <code>&lt;vaadin-login-overlay-wrapper&gt;</code> are available for styling:
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
 *    <td><code>card</code></td>
 *    <td>Container for the entire component's content</td>
 *   </tr>
 *   <tr>
 *    <td><code>brand</code></td>
 *    <td>Container for application title and description</td>
 *   </tr>
 *   <tr>
 *    <td><code>form</code></td>
 *    <td>Container for the <code>&lt;vaadin-login-form&gt;</code> component</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <h3>Component's slots</h3>
 * The following slots are available for being set
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
 *    <td>no name</td>
 *    <td>Default placeholder for the <code>&lt;vaadin-login-form&gt;</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>title</code></td>
 *    <td>Placeholder for customizing the title</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See the usage example in <code>&lt;vaadin-login-overlay&gt;</code>.
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin
 */
@NpmPackage(name = "@vaadin/vaadin-login", version = "^1.2.0-alpha2")
@Import(module = "@vaadin/vaadin-login/src/vaadin-login-overlay-wrapper.js")
public interface LoginOverlayWrapperElement extends HTMLElement {

    // !wca! bringToFront: (): void

    // !wca! close: (sourceEvent?: Event | null | undefined): void

    // !wca! get content: HTMLElement | undefined

    // !wca! set content: HTMLElement | undefined

    // !wca! get description: string

    // !wca! set description: string

    // !wca! get focusTrap: boolean

    // !wca! set focusTrap: boolean

    // !wca! get hidden: boolean

    // !wca! set hidden: boolean

    // !wca! get instanceProps: object | null | undefined

    // !wca! set instanceProps: object | null | undefined

    // !wca! get model: object | null | undefined

    // !wca! set model: object | null | undefined

    // !wca! get modeless: boolean

    // !wca! set modeless: boolean

    // !wca! get opened: boolean | null | undefined

    // !wca! set opened: boolean | null | undefined

    // !wca! get owner: HTMLElement | null

    // !wca! set owner: HTMLElement | null

    // !wca! get renderer: OverlayRenderer | null | undefined

    // !wca! set renderer: OverlayRenderer | null | undefined

    // !wca! get restoreFocusOnClose: boolean

    // !wca! set restoreFocusOnClose: boolean

    // !wca! get template: HTMLTemplateElement | null | undefined

    // !wca! set template: HTMLTemplateElement | null | undefined

    // !wca! get theme: string | null | undefined

    // !wca! get title: string

    // !wca! set title: string

    // !wca! get withBackdrop: boolean

    // !wca! set withBackdrop: boolean
}
