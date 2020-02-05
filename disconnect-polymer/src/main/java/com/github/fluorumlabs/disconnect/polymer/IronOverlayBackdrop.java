package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.IronOverlayBackdropElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

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
public class IronOverlayBackdrop
		extends AbstractComponent<IronOverlayBackdropElement>
		implements HasComponents<IronOverlayBackdropElement, IronOverlayBackdrop, Component<?>> {
	public IronOverlayBackdrop() {
		super("iron-overlay-backdrop");
	}

	/**
	 * Returns true if the backdrop is opened.
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * Returns true if the backdrop is opened.
	 */
	public IronOverlayBackdrop opened(boolean opened) {
		getNode().setOpened(opened);
		return this;
	}

	/**
	 * Appends the backdrop to document body if needed.
	 */
	public void prepare() {
		getNode().prepare();
	}

	/**
	 * Shows the backdrop.
	 */
	public void open() {
		getNode().open();
	}

	/**
	 * Hides the backdrop.
	 */
	public void close() {
		getNode().close();
	}

	/**
	 * Removes the backdrop from document body if needed.
	 */
	public void complete() {
		getNode().complete();
	}
}
