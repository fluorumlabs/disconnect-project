package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.WeakMap;
import js.web.dom.DocumentFragment;
import js.web.dom.Element;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"parts as Render_parts", "render as Render_render"},
    module = "lit-html/lib/render.js"
)
@Import(
    module = "lit-html/lib/render.js"
)
public interface Render extends Any {
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
      script = "return Render_parts"
  )
  static WeakMap<Node, NodePart> parts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Renders a template result or other value to a container.
   *
   * To update a container with new values, reevaluate the template literal and
   * call <code>render</code> with the new result.
   *
   * @param result Any value renderable by NodePart - typically a TemplateResult
   * created by evaluating a template tag like <code>html</code> or <code>svg</code>.
   * @param container A DOM parent to render to. The entire contents are either
   * replaced, or efficiently updated if the same result type was previous
   * rendered there.
   * @param options RenderOptions for the entire render tree rendered to this
   * container. Render options must <em>not</em> change between renders to the same
   * container, as those changes will not effect previously rendered DOM.
   *
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "Render_render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, DocumentFragment container,
      @Nullable RenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Renders a template result or other value to a container.
   *
   * To update a container with new values, reevaluate the template literal and
   * call <code>render</code> with the new result.
   *
   * @param result Any value renderable by NodePart - typically a TemplateResult
   * created by evaluating a template tag like <code>html</code> or <code>svg</code>.
   * @param container A DOM parent to render to. The entire contents are either
   * replaced, or efficiently updated if the same result type was previous
   * rendered there.
   * @param options RenderOptions for the entire render tree rendered to this
   * container. Render options must <em>not</em> change between renders to the same
   * container, as those changes will not effect previously rendered DOM.
   *
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "Render_render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, Element container,
      @Nullable RenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Renders a template result or other value to a container.
   *
   * To update a container with new values, reevaluate the template literal and
   * call <code>render</code> with the new result.
   *
   * @param result Any value renderable by NodePart - typically a TemplateResult
   * created by evaluating a template tag like <code>html</code> or <code>svg</code>.
   * @param container A DOM parent to render to. The entire contents are either
   * replaced, or efficiently updated if the same result type was previous
   * rendered there.
   */
  @JSBody(
      params = {"result", "container"},
      script = "Render_render(result, container)"
  )
  static void render(Unknown /* unknown */ result, DocumentFragment container) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Renders a template result or other value to a container.
   *
   * To update a container with new values, reevaluate the template literal and
   * call <code>render</code> with the new result.
   *
   * @param result Any value renderable by NodePart - typically a TemplateResult
   * created by evaluating a template tag like <code>html</code> or <code>svg</code>.
   * @param container A DOM parent to render to. The entire contents are either
   * replaced, or efficiently updated if the same result type was previous
   * rendered there.
   */
  @JSBody(
      params = {"result", "container"},
      script = "Render_render(result, container)"
  )
  static void render(Unknown /* unknown */ result, Element container) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
