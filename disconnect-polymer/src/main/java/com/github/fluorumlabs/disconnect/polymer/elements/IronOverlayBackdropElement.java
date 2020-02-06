package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * <code>iron-overlay-backdrop</code> is a backdrop used by <code>Polymer.IronOverlayBehavior</code>. It
 * should be a singleton.
 *
 * <h3>Styling</h3>
 * The following custom properties and mixins are available for styling.
 *
 * <table>
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
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronOverlayBackdrop",
		module = "@polymer/iron-overlay-behavior/iron-overlay-backdrop.js"
)
public interface IronOverlayBackdropElement extends HTMLElement {
	String TAGNAME = "iron-overlay-backdrop";

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
