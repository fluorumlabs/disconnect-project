package js.lang.external.vaadin.vaadin_cookie_consent;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "@vaadin/vaadin-cookie-consent",
    version = "^1.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-cookie-consent/vaadin-cookie-consent.js"
)
public abstract class CookieConsentPosition extends JsEnum {
  public static final CookieConsentPosition TOP = JsEnum.of("top");

  public static final CookieConsentPosition BOTTOM = JsEnum.of("bottom");

  public static final CookieConsentPosition TOP_LEFT = JsEnum.of("top-left");

  public static final CookieConsentPosition TOP_RIGHT = JsEnum.of("top-right");

  public static final CookieConsentPosition BOTTOM_LEFT = JsEnum.of("bottom-left");

  public static final CookieConsentPosition BOTTOM_RIGHT = JsEnum.of("bottom-right");
}
