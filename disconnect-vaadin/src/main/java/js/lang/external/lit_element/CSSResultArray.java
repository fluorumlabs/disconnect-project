package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.util.collections.Array;

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
@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lit-element.js"
)
public interface CSSResultArray extends Array<CSSResult> {
  class Builder {
    private final CSSResultArray object = Any.empty();

    public CSSResultArray build() {
      return object;
    }
  }
}
