package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronA11yAnnouncer",
		module = "@polymer/iron-a11y-announcer/iron-a11y-announcer.js"
)
public interface IronA11yAnnouncerElement extends HTMLElement {
	/**
	 * The value of mode is used to set the `aria-live` attribute
	 * for the element that will be announced. Valid values are: `off`,
	 * `polite` and `assertive`.
	 */
	@Nullable
	@JSProperty
	String getMode();

	/**
	 * The value of mode is used to set the `aria-live` attribute
	 * for the element that will be announced. Valid values are: `off`,
	 * `polite` and `assertive`.
	 */
	@JSProperty
	void setMode(String mode);

	/**
	 * Cause a text string to be announced by screen readers.
	 *
	 * @param text The text that should be announced.
	 */
	void announce(String text);
}
