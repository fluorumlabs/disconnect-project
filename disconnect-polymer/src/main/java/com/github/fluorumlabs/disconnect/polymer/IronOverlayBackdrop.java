package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.polymer.elements.IronOverlayBackdropElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * <code>iron-overlay-backdrop</code> is a backdrop used by <code>Polymer.IronOverlayBehavior</code>. It
 * should be a singleton.
 *
 * <h1>Styling</h1>
 * The following custom properties and mixins are available for styling.
 *
 * <table>
 *     <caption>custom properties and mixins are available for styling</caption>
 * <thead>
 * <tr><th>Custom property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--iron-overlay-backdrop-background-color</code></td><td>Backdrop background
 * color</td><td>#000</td></tr>
 * <tr><td><code>--iron-overlay-backdrop-opacity</code></td><td>Backdrop opacity</td><td>0.6</td></tr>
 * <tr><td><code>--iron-overlay-backdrop</code></td><td>Mixin applied to <code>iron-overlay-backdrop</code>.</td><td>
 * {}
 * </td></tr>
 * <tr><td><code>--iron-overlay-backdrop-opened</code></td><td>Mixin applied to <code>iron-overlay-backdrop</code>
 * when it is displayed</td><td>{}</td></tr>
 * </tbody>
 * </table>
 */
@WebComponent
public class IronOverlayBackdrop
		extends AbstractComponent<IronOverlayBackdropElement>
		implements HasComponents<IronOverlayBackdropElement, IronOverlayBackdrop, HasElement<?>> {
	/**
	 * Instantiates a new Iron overlay backdrop.
	 */
	public IronOverlayBackdrop() {
		super(IronOverlayBackdropElement.TAGNAME());
	}

	/**
	 * Returns true if the backdrop is opened.
	 *
	 * @return the boolean
	 */
	public boolean opened() {
		return getNode().isOpened();
	}

	/**
	 * Returns true if the backdrop is opened.
	 *
	 * @param opened the opened
	 *
	 * @return the iron overlay backdrop
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
