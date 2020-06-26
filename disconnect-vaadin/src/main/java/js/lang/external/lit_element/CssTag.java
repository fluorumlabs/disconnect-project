package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.TemplateStringsArray;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    symbols = {"css as CssTag_css", "supportsAdoptingStyleSheets as CssTag_supportsAdoptingStyleSheets", "unsafeCSS as CssTag_unsafeCSS"},
    module = "lit-element/lib/css-tag.js"
)
@Import(
    module = "lit-element/lib/css-tag.js"
)
public interface CssTag extends Any {
  /**
   * @license
   * Copyright (c) 2019 The Polymer Project Authors. All rights reserved.
   * This code may only be used under the BSD style license found at
   * <a href="http://polymer.github.io/LICENSE.txt">http://polymer.github.io/LICENSE.txt</a> The complete set of authors may be found at
   * <a href="http://polymer.github.io/AUTHORS.txt">http://polymer.github.io/AUTHORS.txt</a> The complete set of contributors may be
   * found at <a href="http://polymer.github.io/CONTRIBUTORS.txt">http://polymer.github.io/CONTRIBUTORS.txt</a> Code distributed by Google as
   * part of the polymer project is also subject to an additional IP rights grant
   * found at <a href="http://polymer.github.io/PATENTS.txt">http://polymer.github.io/PATENTS.txt</a>
   *
   */
  @JSBody(
      script = "return CssTag_supportsAdoptingStyleSheets"
  )
  static boolean supportsAdoptingStyleSheets() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Wrap a value for interpolation in a css tagged template literal.
   *
   * This is unsafe because untrusted CSS text can be used to phone home
   * or exfiltrate data to an attacker controlled site. Take care to only use
   * this with trusted input.
   *
   */
  @JSBody(
      params = {"value"},
      script = "return CssTag_unsafeCSS(value)"
  )
  static CSSResult unsafeCSS(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Template tag which which can be used with LitElement's <code>style</code> property to
   * set element styles. For security reasons, only literal string values may be
   * used. To incorporate non-literal values <code>unsafeCSS</code> may be used inside a
   * template string part.
   *
   */
  @JSBody(
      params = {"strings", "values"},
      script = "return CssTag_css.apply(null, [strings].concat(values))"
  )
  static CSSResult css(TemplateStringsArray strings, CSSResult... values) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Template tag which which can be used with LitElement's <code>style</code> property to
   * set element styles. For security reasons, only literal string values may be
   * used. To incorporate non-literal values <code>unsafeCSS</code> may be used inside a
   * template string part.
   *
   */
  @JSBody(
      params = {"strings", "values"},
      script = "return CssTag_css.apply(null, [strings].concat(values))"
  )
  static CSSResult css(TemplateStringsArray strings, double... values) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
