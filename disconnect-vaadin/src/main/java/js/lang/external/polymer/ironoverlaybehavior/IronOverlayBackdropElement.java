package js.lang.external.polymer.ironoverlaybehavior;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * <code>iron-overlay-backdrop</code> is a backdrop used by <code>Polymer.IronOverlayBehavior</code>. It should be a singleton.
 *
 * <h3>Styling</h3>
 * The following custom properties and mixins are available for styling.
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--iron-overlay-backdrop-background-color</code></td>
 *    <td>Backdrop background color</td>
 *    <td>#000</td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-overlay-backdrop-opacity</code></td>
 *    <td>Backdrop opacity</td>
 *    <td>0.6</td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-overlay-backdrop</code></td>
 *    <td>Mixin applied to <code>iron-overlay-backdrop</code>.</td>
 *    <td>{}</td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-overlay-backdrop-opened</code></td>
 *    <td>Mixin applied to <code>iron-overlay-backdrop</code> when it is displayed</td>
 *    <td>{}</td>
 *   </tr>
 *  </tbody>
 * </table>
 */
@NpmPackage(name = "@polymer/iron-overlay-behavior", version = "^3.0.3")
@Import(module = "@polymer/iron-overlay-behavior/iron-overlay-backdrop.js")
public interface IronOverlayBackdropElement extends HTMLElement {

    // !wca! close: (): void
    /**
     * Hides the backdrop.
     */
    @JSMethod("close")
    void close();

    // !wca! complete: (): void
    /**
     * Removes the backdrop from document body if needed.
     */
    @JSMethod("complete")
    void complete();

    // !wca! open: (): void
    /**
     * Shows the backdrop.
     */
    @JSMethod("open")
    void open();

    // !wca! prepare: (): void
    /**
     * Appends the backdrop to document body if needed.
     */
    @JSMethod("prepare")
    void prepare();

    // !wca! get opened: boolean | null | undefined
    /**
     * Returns true if the backdrop is opened.
     */
    @JSProperty("opened")
    boolean isOpened();

    // !wca! set opened: boolean | null | undefined
    /**
     * Returns true if the backdrop is opened.
     */
    @JSProperty("opened")
    void setOpened(boolean value);
}
