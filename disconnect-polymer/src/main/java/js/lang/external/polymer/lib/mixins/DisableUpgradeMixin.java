package js.lang.external.polymer.lib.mixins;

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
    symbols = {"findObservedAttributesGetter as DisableUpgradeMixin_findObservedAttributesGetter", "DisableUpgradeMixin as DisableUpgradeMixin_DisableUpgradeMixin"},
    module = "@polymer/polymer/lib/mixins/disable-upgrade-mixin.js"
)
public interface DisableUpgradeMixin extends TemplateStamp, PropertiesMixin, PropertyEffects, ElementMixin, PropertyAccessors, PropertiesChanged {
  @JSBody(
      script = "return DisableUpgradeMixin_findObservedAttributesGetter()"
  )
  static Any findObservedAttributesGetter() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Element class mixin that allows the element to boot up in a non-enabled
   * state when the <code>disable-upgrade</code> attribute is present. This mixin is
   * designed to be used with element classes like PolymerElement that perform
   * initial startup work when they are first connected. When the
   * <code>disable-upgrade</code> attribute is removed, if the element is connected, it
   * boots up and &quot;enables&quot; as it otherwise would; if it is not connected, the
   * element boots up when it is next connected.
   *
   * Using <code>disable-upgrade</code> with PolymerElement prevents any data propagation
   * to the element, any element DOM from stamping, or any work done in
   * connected/disconnctedCallback from occuring, but it does not prevent work
   * done in the element constructor.
   *
   * Note, this mixin must be applied on top of any element class that
   * itself implements a <code>connectedCallback</code> so that it can control the work
   * done in <code>connectedCallback</code>. For example,
   *
   * <pre><code> MyClass = DisableUpgradeMixin(class extends BaseClass {...});
   * </code></pre>
   */
  @JSBody(
      params = {"base"},
      script = "return DisableUpgradeMixin_DisableUpgradeMixin(base)"
  )
  static <T extends JsFunction> Any DisableUpgradeMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * @param name Attribute name.
   * @param old The previous value for the attribute.
   * @param value The new value for the attribute.
   * @param namespace The XML namespace for the attribute.
   *
   */
  void attributeChangedCallback(String name, @Nullable String old, @Nullable String value,
      @Nullable String namespace);

  /**
   * @param name Attribute name.
   * @param old The previous value for the attribute.
   * @param value The new value for the attribute.
   */
  void attributeChangedCallback(String name, @Nullable String old, @Nullable String value);

  /**
   * @param name Attribute name.
   * @param old The previous value for the attribute.
   */
  void attributeChangedCallback(String name, @Nullable String old);

  /**
   * @param name Attribute name.
   */
  void attributeChangedCallback(String name);

  void connectedCallback();

  void disconnectedCallback();
}
