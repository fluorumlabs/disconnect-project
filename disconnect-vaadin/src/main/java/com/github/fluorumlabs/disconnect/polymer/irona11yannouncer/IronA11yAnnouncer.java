package com.github.fluorumlabs.disconnect.polymer.irona11yannouncer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import js.lang.external.polymer.irona11yannouncer.IronA11yAnnouncerElement;

import javax.annotation.Nullable;

/**
 */
@CustomElement(tagName = "iron-a11y-announcer", external = true)
public class IronA11yAnnouncer extends HtmlComponent<IronA11yAnnouncerElement> {

    // !wca! announce: (text: string): void
    /**
     * Cause a text string to be announced by screen readers.
     *
     * <strong>text</strong>: The text that should be announced.
     */
    public void announce(String text) {
        getElement().announce(text);
    }

    // !wca! get mode: string | null | undefined
    /**
     * The value of mode is used to set the <code>aria-live</code> attribute
     * for the element that will be announced. Valid values are: <code>off</code>,
     * <code>polite</code> and <code>assertive</code>.
     */
    @Nullable
    public Mode getMode() {
        return LowerCase.parse(Mode.class, getElement().getMode());
    }

    // !wca! set mode: string | null | undefined
    /**
     * The value of mode is used to set the <code>aria-live</code> attribute
     * for the element that will be announced. Valid values are: <code>off</code>,
     * <code>polite</code> and <code>assertive</code>.
     */
    public void setMode(@Nullable Mode value) {
        getElement().setMode(LowerCase.of(value));
    }

    // !wca! observe mode: string | null | undefined

    // !wca! get timeout: number | null | undefined
    /**
     * The timeout on refreshing the announcement text. Larger timeouts are
     * needed for certain screen readers to re-announce the same message.
     */
    public int getTimeout() {
        return getElement().getTimeout();
    }

    // !wca! set timeout: number | null | undefined
    /**
     * The timeout on refreshing the announcement text. Larger timeouts are
     * needed for certain screen readers to re-announce the same message.
     */
    public void setTimeout(int value) {
        getElement().setTimeout(value);
    }

    // !wca! observe timeout: number | null | undefined

    public enum Mode {
        OFF, POLITE, ASSERTIVE
    }
}
