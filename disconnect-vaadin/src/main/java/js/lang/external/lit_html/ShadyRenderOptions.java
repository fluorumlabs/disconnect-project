package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

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
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/shady-render.js"
)
public interface ShadyRenderOptions extends RenderOptions {
  @JSProperty("scopeName")
  String getScopeName();

  @JSProperty("scopeName")
  void setScopeName(String value);

  class Builder {
    private final ShadyRenderOptions object = Any.empty();

    public ShadyRenderOptions build() {
      return object;
    }

    public Builder scopeName(String value) {
      object.setScopeName(value);
      return this;
    }
  }
}
