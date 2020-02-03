package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * `iron-overlay-backdrop` is a backdrop used by `Polymer.IronOverlayBehavior`. It
 * should be a singleton.
 * <p>
 * ### Styling
 * <p>
 * The following custom properties and mixins are available for styling.
 * <p>
 * Custom property | Description | Default
 * -------------------------------------------|------------------------|---------
 * `--iron-overlay-backdrop-background-color` | Backdrop background color | #000
 * `--iron-overlay-backdrop-opacity`          | Backdrop opacity | 0.6
 * `--iron-overlay-backdrop`                  | Mixin applied to `iron-overlay-backdrop`.                      | {}
 * `--iron-overlay-backdrop-opened`           | Mixin applied to `iron-overlay-backdrop` when it is displayed | {}
 */
@Import(
        symbols = "IronOverlayBackdrop",
        module = "@polymer/iron-overlay-behavior/iron-overlay-backdrop.js"
)
public interface IronOverlayBackdropElement extends Polymer, HTMLElement {
    /**
     * Returns true if the backdrop is opened.
     */
    @JSProperty
    boolean isOpened();

    /**
     * Returns true if the backdrop is opened.
     */
    @JSProperty
    void setOpened(boolean opened);

    /**
     * Appends the backdrop to document body if needed.
     */
    void prepare();

    /**
     * Shows the backdrop.
     */
    void open();

    /**
     * Hides the backdrop.
     */
    void close();

    /**
     * Removes the backdrop from document body if needed.
     */
    void complete();
}
