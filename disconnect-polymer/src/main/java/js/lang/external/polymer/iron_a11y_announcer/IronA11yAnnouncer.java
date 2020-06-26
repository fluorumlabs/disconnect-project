package js.lang.external.polymer.iron_a11y_announcer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * DO NOT EDIT
 *
 * This file was automatically generated by
 * <a href="https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations">https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations</a>
 *
 * To modify these typings, edit the source file(s):
 * iron-a11y-announcer.js
 *
 */
@NpmPackage(
    name = "@polymer/iron-a11y-announcer",
    version = "^3.1.0"
)
@Import(
    module = "@polymer/iron-a11y-announcer/iron-a11y-announcer.js"
)
public interface IronA11yAnnouncer extends HTMLElement, LegacyElementMixin {
  /**
   * The value of mode is used to set the <code>aria-live</code> attribute
   * for the element that will be announced. Valid values are: <code>off</code>,
   * <code>polite</code> and <code>assertive</code>.
   *
   */
  @JSProperty("mode")
  @Nullable
  String getMode();

  /**
   * The value of mode is used to set the <code>aria-live</code> attribute
   * for the element that will be announced. Valid values are: <code>off</code>,
   * <code>polite</code> and <code>assertive</code>.
   *
   */
  @JSProperty("mode")
  void setMode(@Nullable String value);

  /**
   * The timeout on refreshing the announcement text. Larger timeouts are
   * needed for certain screen readers to re-announce the same message.
   *
   */
  @JSProperty("timeout")
  double getTimeout();

  /**
   * The timeout on refreshing the announcement text. Larger timeouts are
   * needed for certain screen readers to re-announce the same message.
   *
   */
  @JSProperty("timeout")
  void setTimeout(double value);

  void created();

  /**
   * Cause a text string to be announced by screen readers.
   *
   * @param text The text that should be announced.
   *
   */
  void announce(String text);
}
