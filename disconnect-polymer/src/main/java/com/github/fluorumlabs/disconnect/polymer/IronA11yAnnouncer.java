package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.IronA11yAnnouncerElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;

import javax.annotation.Nullable;

public class IronA11yAnnouncer
		extends AbstractComponent<IronA11yAnnouncerElement> {
	public IronA11yAnnouncer() {
		super("iron-a11y-announcer");
	}

	/**
	 * The value of mode is used to set the <code>aria-live</code> attribute
	 * for the element that will be announced. Valid values are: <code>off</code>,
	 * <code>polite</code> and <code>assertive</code>.
	 */
	@Nullable
	public String mode() {
		return getNode().getMode();
	}

	/**
	 * The value of mode is used to set the <code>aria-live</code> attribute
	 * for the element that will be announced. Valid values are: <code>off</code>,
	 * <code>polite</code> and <code>assertive</code>.
	 */
	public IronA11yAnnouncer mode(String mode) {
		getNode().setMode(mode);
		return this;
	}

	/**
	 * Cause a text string to be announced by screen readers.
	 *
	 * @param text The text that should be announced.
	 */
	public void announce(String text) {
		getNode().announce(text);
	}
}
