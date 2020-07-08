package com.github.fluorumlabs.disconnect.polymer.ironoverlaybehavior;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import javax.annotation.Nullable;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import js.web.dom.Event;
import js.lang.external.polymer.ironoverlaybehavior.IronOverlayBackdropElement;
import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;

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
@CustomElement(tagName = "iron-overlay-backdrop", external = true)
public class IronOverlayBackdrop extends HtmlComponent<IronOverlayBackdropElement> {

    public IronOverlayBackdrop() {
    }

    public IronOverlayBackdrop(String textContent) {
        super(textContent);
    }

    public IronOverlayBackdrop(Component<?>... components) {
        super(components);
    }

    // !wca! close: (): void
    /**
     * Hides the backdrop.
     */
    public void close() {
        getElement().close();
    }

    // !wca! complete: (): void
    /**
     * Removes the backdrop from document body if needed.
     */
    public void complete() {
        getElement().complete();
    }

    // !wca! open: (): void
    /**
     * Shows the backdrop.
     */
    public void open() {
        getElement().open();
    }

    // !wca! prepare: (): void
    /**
     * Appends the backdrop to document body if needed.
     */
    public void prepare() {
        getElement().prepare();
    }

    // !wca! get opened: boolean | null | undefined
    /**
     * Returns true if the backdrop is opened.
     */
    public boolean isOpened() {
        return getElement().isOpened();
    }

    // !wca! set opened: boolean | null | undefined
    /**
     * Returns true if the backdrop is opened.
     */
    public void setOpened(boolean value) {
        getElement().setOpened(value);
    }

    // !wca! observe opened: boolean | null | undefined
    /**
     * Returns true if the backdrop is opened.
     */
    public ObservableValue<Boolean> opened() {
        return createObservableValue(this::isOpened, this::setOpened, "opened-changed");
    }
}
