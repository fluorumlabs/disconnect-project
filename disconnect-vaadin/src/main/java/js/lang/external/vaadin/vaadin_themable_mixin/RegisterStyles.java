package js.lang.external.vaadin.vaadin_themable_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.lit_element.CSSResult;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-themable-mixin",
    version = "^1.6.1"
)
@Import(
    symbols = {"registerStyles as RegisterStyles_registerStyles"},
    module = "@vaadin/vaadin-themable-mixin/register-styles.js"
)
@Import(
    module = "@vaadin/vaadin-themable-mixin/register-styles.js"
)
public interface RegisterStyles extends Any {
  /**
   * Registers CSS styles for a component type. Make sure to register the styles before
   * the first instance of a component of the type is attached to DOM.
   *
   */
  @JSBody(
      params = {"themeFor", "styles", "options"},
      script = "RegisterStyles_registerStyles(themeFor, styles, options)"
  )
  static void registerStyles(@Nullable String themeFor, CSSResult[] styles, @Nullable Any options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers CSS styles for a component type. Make sure to register the styles before
   * the first instance of a component of the type is attached to DOM.
   *
   */
  @JSBody(
      params = {"themeFor", "styles", "options"},
      script = "RegisterStyles_registerStyles(themeFor, styles, options)"
  )
  static void registerStyles(@Nullable String themeFor, @Nullable CSSResult styles,
      @Nullable Any options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers CSS styles for a component type. Make sure to register the styles before
   * the first instance of a component of the type is attached to DOM.
   *
   */
  @JSBody(
      params = {"themeFor", "styles"},
      script = "RegisterStyles_registerStyles(themeFor, styles)"
  )
  static void registerStyles(@Nullable String themeFor, CSSResult[] styles) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers CSS styles for a component type. Make sure to register the styles before
   * the first instance of a component of the type is attached to DOM.
   *
   */
  @JSBody(
      params = {"themeFor", "styles"},
      script = "RegisterStyles_registerStyles(themeFor, styles)"
  )
  static void registerStyles(@Nullable String themeFor, @Nullable CSSResult styles) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers CSS styles for a component type. Make sure to register the styles before
   * the first instance of a component of the type is attached to DOM.
   *
   */
  @JSBody(
      params = {"themeFor"},
      script = "RegisterStyles_registerStyles(themeFor)"
  )
  static void registerStyles(@Nullable String themeFor) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers CSS styles for a component type. Make sure to register the styles before
   * the first instance of a component of the type is attached to DOM.
   *
   */
  @JSBody(
      params = {},
      script = "RegisterStyles_registerStyles()"
  )
  static void registerStyles() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
