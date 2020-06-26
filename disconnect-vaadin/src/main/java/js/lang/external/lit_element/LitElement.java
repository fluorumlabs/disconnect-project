package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.lang.external.lit_html.ShadyRenderOptions;
import js.web.dom.DocumentFragment;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    symbols = {"LitElement as LitElement_LitElement"},
    module = "lit-element/lit-element.js"
)
@Import(
    module = "lit-element/lit-element.js"
)
public interface LitElement extends UpdatingElement {
  /**
   * Render method used to render the value to the element's DOM.
   * @param result The value to render.
   * @param container Node into which to render.
   * @param options Element name.
   * @nocollapse
   *
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, DocumentFragment container,
      ShadyRenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Render method used to render the value to the element's DOM.
   * @param result The value to render.
   * @param container Node into which to render.
   * @param options Element name.
   * @nocollapse
   *
   */
  @JSBody(
      params = {"result", "container", "options"},
      script = "render(result, container, options)"
  )
  static void render(Unknown /* unknown */ result, Element container, ShadyRenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Array of styles to apply to the element. The styles should be defined
   * using the <code>css</code> tag function.
   *
   */
  @JSBody(
      script = "return LitElement.styles"
  )
  @Nullable
  static Unknown /* CSSResult | CSSResultArray */ getStyles() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Node or ShadowRoot into which element DOM should be rendered. Defaults
   * to an open shadowRoot.
   *
   */
  @JSProperty("renderRoot")
  Unknown /* Element | DocumentFragment */ getRenderRoot();
}
