package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PropertyAccessors as PropertyAccessors_PropertyAccessors"},
    module = "@polymer/polymer/lib/mixins/property-accessors.js"
)
@Import(
    module = "@polymer/polymer/lib/mixins/property-accessors.js"
)
public interface PropertyAccessors extends PropertiesChanged {
  /**
   * Element class mixin that provides basic meta-programming for creating one
   * or more property accessors (getter/setter pair) that enqueue an async
   * (batched) <code>_propertiesChanged</code> callback.
   *
   * For basic usage of this mixin:
   *
   * <ul>
   * <li>Declare attributes to observe via the standard <code>static get observedAttributes()</code>. Use <code>dash-case</code> attribute names to represent
   * <code>camelCase</code> property names.</li>
   * <li>Implement the <code>_propertiesChanged</code> callback on the class.</li>
   * <li>Call <code>MyClass.createPropertiesForAttributes()</code> <strong>once</strong> on the class to
   * generate property accessors for each observed attribute. This must be
   * called before the first instance is created, for example, by calling it
   * before calling <code>customElements.define</code>. It can also be called lazily from
   * the element's <code>constructor</code>, as long as it's guarded so that the call is
   * only made once, when the first instance is created.</li>
   * <li>Call <code>this._enableProperties()</code> in the element's <code>connectedCallback</code> to
   * enable the accessors.</li>
   * </ul>
   * Any <code>observedAttributes</code> will automatically be
   * deserialized via <code>attributeChangedCallback</code> and set to the associated
   * property using <code>dash-case</code>-to-<code>camelCase</code> convention.
   *
   */
  @JSBody(
      params = {"base"},
      script = "return PropertyAccessors_PropertyAccessors(base)"
  )
  static <T extends JsFunction> Any PropertyAccessors(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
