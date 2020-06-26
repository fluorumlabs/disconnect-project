package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.Unknown /* string | boolean | number */;
import org.teavm.jso.JSIndexer;

/**
 * @license
 * Copyright (c) 2018 The Polymer Project Authors. All rights reserved.
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
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/directives/class-map.js"
)
public interface ClassInfo extends Any {
  @JSIndexer
  Unknown /* string | boolean | number */ get(String name);

  class Builder {
    private final ClassInfo object = Any.empty();

    public ClassInfo build() {
      return object;
    }
  }
}
