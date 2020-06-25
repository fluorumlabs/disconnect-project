package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.polymer.PolymerInit;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"mixinBehaviors as Class_mixinBehaviors", "Class as Class_Class"},
    module = "@polymer/polymer/lib/legacy/class.js"
)
public interface Class extends Any {
  /**
   * Applies a &quot;legacy&quot; behavior or array of behaviors to the provided class.
   *
   * Note: this method will automatically also apply the <code>LegacyElementMixin</code>
   * to ensure that any legacy behaviors can rely on legacy Polymer API on
   * the underlying element.
   *
   * @return Returns a new Element class extended by the
   * passed in <code>behaviors</code> and also by <code>LegacyElementMixin</code>.
   *
   */
  @JSBody(
      params = {"behaviors", "klass"},
      script = "return Class_mixinBehaviors(behaviors, klass)"
  )
  static <T extends Any> Any mixinBehaviors(Any[] behaviors, MixinBehaviorsKlass klass) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Applies a &quot;legacy&quot; behavior or array of behaviors to the provided class.
   *
   * Note: this method will automatically also apply the <code>LegacyElementMixin</code>
   * to ensure that any legacy behaviors can rely on legacy Polymer API on
   * the underlying element.
   *
   * @return Returns a new Element class extended by the
   * passed in <code>behaviors</code> and also by <code>LegacyElementMixin</code>.
   *
   */
  @JSBody(
      params = {"behaviors", "klass"},
      script = "return Class_mixinBehaviors(behaviors, klass)"
  )
  static <T extends Any> Any mixinBehaviors(Any behaviors, MixinBehaviorsKlass klass) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Generates a class that extends <code>LegacyElement</code> based on the
   * provided info object.  Metadata objects on the <code>info</code> object
   * (<code>properties</code>, <code>observers</code>, <code>listeners</code>, <code>behaviors</code>, <code>is</code>) are used
   * for Polymer's meta-programming systems, and any functions are copied
   * to the generated class.
   *
   * Valid &quot;metadata&quot; values are as follows:
   *
   * <code>is</code>: String providing the tag name to register the element under. In
   * addition, if a <code>dom-module</code> with the same id exists, the first template
   * in that <code>dom-module</code> will be stamped into the shadow root of this element,
   * with support for declarative event listeners (<code>on-...</code>), Polymer data
   * bindings (<code>[[...]]</code> and <code>{{...}}</code>), and id-based node finding into
   * <code>this.$</code>.
   *
   * <code>properties</code>: Object describing property-related metadata used by Polymer
   * features (key: property names, value: object containing property metadata).
   * Valid keys in per-property metadata include:
   *
   * <ul>
   * <li><code>type</code> (String|Number|Object|Array|...): Used by
   * <code>attributeChangedCallback</code> to determine how string-based attributes
   * are deserialized to JavaScript property values.</li>
   * <li><code>notify</code> (boolean): Causes a change in the property to fire a
   * non-bubbling event called <code>&lt;property&gt;-changed</code>. Elements that have
   * enabled two-way binding to the property use this event to observe changes.</li>
   * <li><code>readOnly</code> (boolean): Creates a getter for the property, but no setter.
   * To set a read-only property, use the private setter method
   * <code>_setProperty(property, value)</code>.</li>
   * <li><code>observer</code> (string): Observer method name that will be called when
   * the property changes. The arguments of the method are
   * <code>(value, previousValue)</code>.</li>
   * <li><code>computed</code> (string): String describing method and dependent properties
   * for computing the value of this property (e.g. <code>'computeFoo(bar, zot)'</code>).
   * Computed properties are read-only by default and can only be changed
   * via the return value of the computing method.</li>
   * </ul>
   * <code>observers</code>: Array of strings describing multi-property observer methods
   * and their dependent properties (e.g. <code>'observeABC(a, b, c)'</code>).
   *
   * <code>listeners</code>: Object describing event listeners to be added to each
   * instance of this element (key: event name, value: method name).
   *
   * <code>behaviors</code>: Array of additional <code>info</code> objects containing metadata
   * and callbacks in the same format as the <code>info</code> object here which are
   * merged into this element.
   *
   * <code>hostAttributes</code>: Object listing attributes to be applied to the host
   * once created (key: attribute name, value: attribute value).  Values
   * are serialized based on the type of the value.  Host attributes should
   * generally be limited to attributes such as <code>tabIndex</code> and <code>aria-...</code>.
   * Attributes in <code>hostAttributes</code> are only applied if a user-supplied
   * attribute is not already present (attributes in markup override
   * <code>hostAttributes</code>).
   *
   * In addition, the following Polymer-specific callbacks may be provided:
   *
   * <ul>
   * <li><code>registered</code>: called after first instance of this element,</li>
   * <li><code>created</code>: called during <code>constructor</code></li>
   * <li><code>attached</code>: called during <code>connectedCallback</code></li>
   * <li><code>detached</code>: called during <code>disconnectedCallback</code></li>
   * <li><code>ready</code>: called before first <code>attached</code>, after all properties of
   * this element have been propagated to its template and all observers
   * have run</li>
   * </ul>
   * @return Generated class
   *
   */
  @JSBody(
      params = {"info", "mixin"},
      script = "return Class_Class(info, mixin)"
  )
  static <T extends Any> ClassResult Class(PolymerInit info, ClassMixinFn mixin) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  interface MixinBehaviorsKlass extends Any {
  }

  interface MixinBehaviorsKlass extends Any {
  }

  interface ClassResult extends Any {
  }

  @FunctionalInterface
  @JSFunctor
  interface ClassMixinFn extends Any {
    T apply(T p0);
  }
}
