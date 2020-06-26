package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"isPrimitive as Parts_isPrimitive", "isIterable as Parts_isIterable"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface Parts extends Any {
  /**
   * @license
   * Copyright (c) 2017 The Polymer Project Authors. All rights reserved.
   * This code may only be used under the BSD style license found at
   * <a href="http://polymer.github.io/LICENSE.txt">http://polymer.github.io/LICENSE.txt</a>
   * The complete set of authors may be found at
   * <a href="http://polymer.github.io/AUTHORS.txt">http://polymer.github.io/AUTHORS.txt</a>
   * The complete set of contributors may be found at
   * <a href="http://polymer.github.io/CONTRIBUTORS.txt">http://polymer.github.io/CONTRIBUTORS.txt</a>
   * Code distributed by Google as part of the polymer project is also
   * subject to an additional IP rights grant found at
   * <a href="http://polymer.github.io/PATENTS.txt">http://polymer.github.io/PATENTS.txt</a>
   *
   */
  @JSBody(
      params = {"value"},
      script = "return Parts_isPrimitive(value)"
  )
  static Unknown /* value is Primitive */ isPrimitive(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      params = {"value"},
      script = "return Parts_isIterable(value)"
  )
  static JsIterable /* value is Iterable */<Unknown /* unknown */> isIterable(
      Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
