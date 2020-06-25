package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PropertiesChanged as PropertiesChanged_PropertiesChanged"},
    module = "@polymer/polymer/lib/mixins/properties-changed.js"
)
public interface PropertiesChanged extends Any {
  /**
   * Element class mixin that provides basic meta-programming for creating one
   * or more property accessors (getter/setter pair) that enqueue an async
   * (batched) <code>_propertiesChanged</code> callback.
   *
   * For basic usage of this mixin, call <code>MyClass.createProperties(props)</code>
   * once at class definition time to create property accessors for properties
   * named in props, implement <code>_propertiesChanged</code> to react as desired to
   * property changes, and implement <code>static get observedAttributes()</code> and
   * include lowercase versions of any property names that should be set from
   * attributes. Last, call <code>this._enableProperties()</code> in the element's
   * <code>connectedCallback</code> to enable the accessors.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return PropertiesChanged_PropertiesChanged(base)"
  )
  static <T extends JsFunction> Any PropertiesChanged(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Lifecycle callback called when properties are enabled via
   * <code>_enableProperties</code>.
   *
   * Users may override this function to implement behavior that is
   * dependent on the element having its property data initialized, e.g.
   * from defaults (initialized from <code>constructor</code>, <code>_initializeProperties</code>),
   * <code>attributeChangedCallback</code>, or values propagated from host e.g. via
   * bindings.  <code>super.ready()</code> must be called to ensure the data system
   * becomes enabled.
   *
   */
  void ready();

  /**
   * Implements native Custom Elements <code>attributeChangedCallback</code> to
   * set an attribute value to a property via <code>_attributeToProperty</code>.
   *
   * @param name Name of attribute that changed
   * @param old Old attribute value
   * @param value New attribute value
   * @param namespace Attribute namespace.
   *
   */
  void attributeChangedCallback(String name, @Nullable String old, @Nullable String value,
      @Nullable String namespace);

  /**
   * Implements native Custom Elements <code>attributeChangedCallback</code> to
   * set an attribute value to a property via <code>_attributeToProperty</code>.
   *
   * @param name Name of attribute that changed
   * @param old Old attribute value
   * @param value New attribute value
   */
  void attributeChangedCallback(String name, @Nullable String old, @Nullable String value);

  /**
   * Implements native Custom Elements <code>attributeChangedCallback</code> to
   * set an attribute value to a property via <code>_attributeToProperty</code>.
   *
   * @param name Name of attribute that changed
   * @param old Old attribute value
   */
  void attributeChangedCallback(String name, @Nullable String old);

  /**
   * Implements native Custom Elements <code>attributeChangedCallback</code> to
   * set an attribute value to a property via <code>_attributeToProperty</code>.
   *
   * @param name Name of attribute that changed
   */
  void attributeChangedCallback(String name);
}
