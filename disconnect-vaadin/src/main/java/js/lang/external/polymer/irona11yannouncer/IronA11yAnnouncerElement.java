package js.lang.external.polymer.irona11yannouncer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 */
@NpmPackage(name = "@polymer/iron-a11y-announcer", version = "^3.1.0")
@Import(module = "@polymer/iron-a11y-announcer/iron-a11y-announcer.js")
public interface IronA11yAnnouncerElement extends HTMLElement {

    // !wca! announce: (text: string): void
    /**
     * Cause a text string to be announced by screen readers.
     *
     * <strong>text</strong>: The text that should be announced.
     */
    @JSMethod("announce")
    void announce(String text);

    // !wca! get mode: string | null | undefined
    /**
     * The value of mode is used to set the <code>aria-live</code> attribute
     * for the element that will be announced. Valid values are: <code>off</code>,
     * <code>polite</code> and <code>assertive</code>.
     */
    @JSProperty("mode")
    @Nullable
    String getMode();

    // !wca! set mode: string | null | undefined
    /**
     * The value of mode is used to set the <code>aria-live</code> attribute
     * for the element that will be announced. Valid values are: <code>off</code>,
     * <code>polite</code> and <code>assertive</code>.
     */
    @JSProperty("mode")
    void setMode(@Nullable String value);

    // !wca! get timeout: number | null | undefined
    /**
     * The timeout on refreshing the announcement text. Larger timeouts are
     * needed for certain screen readers to re-announce the same message.
     */
    @JSProperty("timeout")
    int getTimeout();

    // !wca! set timeout: number | null | undefined
    /**
     * The timeout on refreshing the announcement text. Larger timeouts are
     * needed for certain screen readers to re-announce the same message.
     */
    @JSProperty("timeout")
    void setTimeout(int value);
}
