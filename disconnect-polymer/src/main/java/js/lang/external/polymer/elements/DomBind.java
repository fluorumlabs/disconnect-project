package js.lang.external.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.external.polymer.mixins.GestureEventListeners;
import js.lang.external.polymer.mixins.OptionalMutableData;
import js.lang.external.polymer.mixins.PropertyEffects;

/**
 * Custom element to allow using Polymer's template features (data binding,
 * declarative event listeners, etc.) in the main document without defining
 * a new custom element.
 *
 * <code>&lt;template&gt;</code> tags utilizing bindings may be wrapped with the <code>&lt;dom-bind&gt;</code>
 * element, which will immediately stamp the wrapped template into the main
 * document and bind elements to the <code>dom-bind</code> element itself as the
 * binding scope.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/dom-bind.js"
)
public interface DomBind extends GestureEventListeners, HTMLElement, OptionalMutableData, PropertyEffects {
  /**
   * @param name Name of attribute that changed
   * @param old Old attribute value
   * @param value New attribute value
   * @param namespace Attribute namespace.
   *
   */
  void attributeChangedCallback(String name, @Nullable String old, @Nullable String value,
      @Nullable String namespace);

  /**
   * @param name Name of attribute that changed
   * @param old Old attribute value
   * @param value New attribute value
   */
  void attributeChangedCallback(String name, @Nullable String old, @Nullable String value);

  /**
   * @param name Name of attribute that changed
   * @param old Old attribute value
   */
  void attributeChangedCallback(String name, @Nullable String old);

  /**
   * @param name Name of attribute that changed
   */
  void attributeChangedCallback(String name);

  void connectedCallback();

  void disconnectedCallback();

  /**
   * Forces the element to render its content. This is typically only
   * necessary to call if HTMLImports with the async attribute are used.
   *
   */
  void render();
}
