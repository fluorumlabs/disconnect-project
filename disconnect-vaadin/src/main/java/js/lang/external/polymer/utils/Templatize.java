package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.polymer.mixins.PropertyEffects;
import js.web.dom.HTMLElement;
import js.web.dom.Node;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"templatize as Templatize_templatize", "modelForElement as Templatize_modelForElement", "showHideChildren as Templatize_showHideChildren"},
    module = "@polymer/polymer/lib/utils/templatize.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/templatize.js"
)
public interface Templatize extends Any {
  @JSBody(
      script = "Templatize_showHideChildren()"
  )
  static void showHideChildren() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns an anonymous <code>PropertyEffects</code> class bound to the
   * <code>&lt;template&gt;</code> provided.  Instancing the class will result in the
   * template being stamped into a document fragment stored as the instance's
   * <code>root</code> property, after which it can be appended to the DOM.
   *
   * Templates may utilize all Polymer data-binding features as well as
   * declarative event listeners.  Event listeners and inline computing
   * functions in the template will be called on the host of the template.
   *
   * The constructor returned takes a single argument dictionary of initial
   * property values to propagate into template bindings.  Additionally
   * host properties can be forwarded in, and instance properties can be
   * notified out by providing optional callbacks in the <code>options</code> dictionary.
   *
   * Valid configuration in <code>options</code> are as follows:
   *
   * <ul>
   * <li><code>forwardHostProp(property, value)</code>: Called when a property referenced
   * in the template changed on the template's host. As this library does
   * not retain references to templates instanced by the user, it is the
   * templatize owner's responsibility to forward host property changes into
   * user-stamped instances.  The <code>instance.forwardHostProp(property, value)</code>
   * method on the generated class should be called to forward host
   * properties into the template to prevent unnecessary property-changed
   * notifications. Any properties referenced in the template that are not
   * defined in <code>instanceProps</code> will be notified up to the template's host
   * automatically.</li>
   * <li><code>instanceProps</code>: Dictionary of property names that will be added
   * to the instance by the templatize owner.  These properties shadow any
   * host properties, and changes within the template to these properties
   * will result in <code>notifyInstanceProp</code> being called.</li>
   * <li><code>mutableData</code>: When <code>true</code>, the generated class will skip strict
   * dirty-checking for objects and arrays (always consider them to be
   * &quot;dirty&quot;).</li>
   * <li><code>notifyInstanceProp(instance, property, value)</code>: Called when
   * an instance property changes.  Users may choose to call <code>notifyPath</code>
   * on e.g. the owner to notify the change.</li>
   * <li><code>parentModel</code>: When <code>true</code>, events handled by declarative event listeners
   * (<code>on-event=&quot;handler&quot;</code>) will be decorated with a <code>model</code> property pointing
   * to the template instance that stamped it.  It will also be returned
   * from <code>instance.parentModel</code> in cases where template instance nesting
   * causes an inner model to shadow an outer model.</li>
   * </ul>
   * All callbacks are called bound to the <code>owner</code>. Any context
   * needed for the callbacks (such as references to <code>instances</code> stamped)
   * should be stored on the <code>owner</code> such that they can be retrieved via
   * <code>this</code>.
   *
   * When <code>options.forwardHostProp</code> is declared as an option, any properties
   * referenced in the template will be automatically forwarded from the host of
   * the <code>&lt;template&gt;</code> to instances, with the exception of any properties listed in
   * the <code>options.instanceProps</code> object.  <code>instanceProps</code> are assumed to be
   * managed by the owner of the instances, either passed into the constructor
   * or set after the fact.  Note, any properties passed into the constructor will
   * always be set to the instance (regardless of whether they would normally
   * be forwarded from the host).
   *
   * Note that <code>templatize()</code> can be run only once for a given <code>&lt;template&gt;</code>.
   * Further calls will result in an error. Also, there is a special
   * behavior if the template was duplicated through a mechanism such as
   * <code>&lt;dom-repeat&gt;</code> or <code>&lt;test-fixture&gt;</code>. In this case, all calls to
   * <code>templatize()</code> return the same class for all duplicates of a template.
   * The class returned from <code>templatize()</code> is generated only once using
   * the <code>options</code> from the first call. This means that any <code>options</code>
   * provided to subsequent calls will be ignored. Therefore, it is very
   * important not to close over any variables inside the callbacks. Also,
   * arrow functions must be avoided because they bind the outer <code>this</code>.
   * Inside the callbacks, any contextual information can be accessed
   * through <code>this</code>, which points to the <code>owner</code>.
   *
   * @return Generated class bound
   * to the template provided
   *
   */
  @JSBody(
      params = {"template", "owner", "options"},
      script = "return Templatize_templatize(template, owner, options)"
  )
  static TemplatizeResult templatize(HTMLTemplateElement template, @Nullable PropertyEffects owner,
      @Nullable Any options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns an anonymous <code>PropertyEffects</code> class bound to the
   * <code>&lt;template&gt;</code> provided.  Instancing the class will result in the
   * template being stamped into a document fragment stored as the instance's
   * <code>root</code> property, after which it can be appended to the DOM.
   *
   * Templates may utilize all Polymer data-binding features as well as
   * declarative event listeners.  Event listeners and inline computing
   * functions in the template will be called on the host of the template.
   *
   * The constructor returned takes a single argument dictionary of initial
   * property values to propagate into template bindings.  Additionally
   * host properties can be forwarded in, and instance properties can be
   * notified out by providing optional callbacks in the <code>options</code> dictionary.
   *
   * Valid configuration in <code>options</code> are as follows:
   *
   * <ul>
   * <li><code>forwardHostProp(property, value)</code>: Called when a property referenced
   * in the template changed on the template's host. As this library does
   * not retain references to templates instanced by the user, it is the
   * templatize owner's responsibility to forward host property changes into
   * user-stamped instances.  The <code>instance.forwardHostProp(property, value)</code>
   * method on the generated class should be called to forward host
   * properties into the template to prevent unnecessary property-changed
   * notifications. Any properties referenced in the template that are not
   * defined in <code>instanceProps</code> will be notified up to the template's host
   * automatically.</li>
   * <li><code>instanceProps</code>: Dictionary of property names that will be added
   * to the instance by the templatize owner.  These properties shadow any
   * host properties, and changes within the template to these properties
   * will result in <code>notifyInstanceProp</code> being called.</li>
   * <li><code>mutableData</code>: When <code>true</code>, the generated class will skip strict
   * dirty-checking for objects and arrays (always consider them to be
   * &quot;dirty&quot;).</li>
   * <li><code>notifyInstanceProp(instance, property, value)</code>: Called when
   * an instance property changes.  Users may choose to call <code>notifyPath</code>
   * on e.g. the owner to notify the change.</li>
   * <li><code>parentModel</code>: When <code>true</code>, events handled by declarative event listeners
   * (<code>on-event=&quot;handler&quot;</code>) will be decorated with a <code>model</code> property pointing
   * to the template instance that stamped it.  It will also be returned
   * from <code>instance.parentModel</code> in cases where template instance nesting
   * causes an inner model to shadow an outer model.</li>
   * </ul>
   * All callbacks are called bound to the <code>owner</code>. Any context
   * needed for the callbacks (such as references to <code>instances</code> stamped)
   * should be stored on the <code>owner</code> such that they can be retrieved via
   * <code>this</code>.
   *
   * When <code>options.forwardHostProp</code> is declared as an option, any properties
   * referenced in the template will be automatically forwarded from the host of
   * the <code>&lt;template&gt;</code> to instances, with the exception of any properties listed in
   * the <code>options.instanceProps</code> object.  <code>instanceProps</code> are assumed to be
   * managed by the owner of the instances, either passed into the constructor
   * or set after the fact.  Note, any properties passed into the constructor will
   * always be set to the instance (regardless of whether they would normally
   * be forwarded from the host).
   *
   * Note that <code>templatize()</code> can be run only once for a given <code>&lt;template&gt;</code>.
   * Further calls will result in an error. Also, there is a special
   * behavior if the template was duplicated through a mechanism such as
   * <code>&lt;dom-repeat&gt;</code> or <code>&lt;test-fixture&gt;</code>. In this case, all calls to
   * <code>templatize()</code> return the same class for all duplicates of a template.
   * The class returned from <code>templatize()</code> is generated only once using
   * the <code>options</code> from the first call. This means that any <code>options</code>
   * provided to subsequent calls will be ignored. Therefore, it is very
   * important not to close over any variables inside the callbacks. Also,
   * arrow functions must be avoided because they bind the outer <code>this</code>.
   * Inside the callbacks, any contextual information can be accessed
   * through <code>this</code>, which points to the <code>owner</code>.
   *
   * @return Generated class bound
   * to the template provided
   *
   */
  @JSBody(
      params = {"template", "owner"},
      script = "return Templatize_templatize(template, owner)"
  )
  static TemplatizeResult templatize(HTMLTemplateElement template,
      @Nullable PropertyEffects owner) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns an anonymous <code>PropertyEffects</code> class bound to the
   * <code>&lt;template&gt;</code> provided.  Instancing the class will result in the
   * template being stamped into a document fragment stored as the instance's
   * <code>root</code> property, after which it can be appended to the DOM.
   *
   * Templates may utilize all Polymer data-binding features as well as
   * declarative event listeners.  Event listeners and inline computing
   * functions in the template will be called on the host of the template.
   *
   * The constructor returned takes a single argument dictionary of initial
   * property values to propagate into template bindings.  Additionally
   * host properties can be forwarded in, and instance properties can be
   * notified out by providing optional callbacks in the <code>options</code> dictionary.
   *
   * Valid configuration in <code>options</code> are as follows:
   *
   * <ul>
   * <li><code>forwardHostProp(property, value)</code>: Called when a property referenced
   * in the template changed on the template's host. As this library does
   * not retain references to templates instanced by the user, it is the
   * templatize owner's responsibility to forward host property changes into
   * user-stamped instances.  The <code>instance.forwardHostProp(property, value)</code>
   * method on the generated class should be called to forward host
   * properties into the template to prevent unnecessary property-changed
   * notifications. Any properties referenced in the template that are not
   * defined in <code>instanceProps</code> will be notified up to the template's host
   * automatically.</li>
   * <li><code>instanceProps</code>: Dictionary of property names that will be added
   * to the instance by the templatize owner.  These properties shadow any
   * host properties, and changes within the template to these properties
   * will result in <code>notifyInstanceProp</code> being called.</li>
   * <li><code>mutableData</code>: When <code>true</code>, the generated class will skip strict
   * dirty-checking for objects and arrays (always consider them to be
   * &quot;dirty&quot;).</li>
   * <li><code>notifyInstanceProp(instance, property, value)</code>: Called when
   * an instance property changes.  Users may choose to call <code>notifyPath</code>
   * on e.g. the owner to notify the change.</li>
   * <li><code>parentModel</code>: When <code>true</code>, events handled by declarative event listeners
   * (<code>on-event=&quot;handler&quot;</code>) will be decorated with a <code>model</code> property pointing
   * to the template instance that stamped it.  It will also be returned
   * from <code>instance.parentModel</code> in cases where template instance nesting
   * causes an inner model to shadow an outer model.</li>
   * </ul>
   * All callbacks are called bound to the <code>owner</code>. Any context
   * needed for the callbacks (such as references to <code>instances</code> stamped)
   * should be stored on the <code>owner</code> such that they can be retrieved via
   * <code>this</code>.
   *
   * When <code>options.forwardHostProp</code> is declared as an option, any properties
   * referenced in the template will be automatically forwarded from the host of
   * the <code>&lt;template&gt;</code> to instances, with the exception of any properties listed in
   * the <code>options.instanceProps</code> object.  <code>instanceProps</code> are assumed to be
   * managed by the owner of the instances, either passed into the constructor
   * or set after the fact.  Note, any properties passed into the constructor will
   * always be set to the instance (regardless of whether they would normally
   * be forwarded from the host).
   *
   * Note that <code>templatize()</code> can be run only once for a given <code>&lt;template&gt;</code>.
   * Further calls will result in an error. Also, there is a special
   * behavior if the template was duplicated through a mechanism such as
   * <code>&lt;dom-repeat&gt;</code> or <code>&lt;test-fixture&gt;</code>. In this case, all calls to
   * <code>templatize()</code> return the same class for all duplicates of a template.
   * The class returned from <code>templatize()</code> is generated only once using
   * the <code>options</code> from the first call. This means that any <code>options</code>
   * provided to subsequent calls will be ignored. Therefore, it is very
   * important not to close over any variables inside the callbacks. Also,
   * arrow functions must be avoided because they bind the outer <code>this</code>.
   * Inside the callbacks, any contextual information can be accessed
   * through <code>this</code>, which points to the <code>owner</code>.
   *
   * @return Generated class bound
   * to the template provided
   *
   */
  @JSBody(
      params = {"template"},
      script = "return Templatize_templatize(template)"
  )
  static TemplatizeResult templatize(HTMLTemplateElement template) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the template &quot;model&quot; associated with a given element, which
   * serves as the binding scope for the template instance the element is
   * contained in. A template model is an instance of
   * <code>TemplateInstanceBase</code>, and should be used to manipulate data
   * associated with this template instance.
   *
   * Example:
   *
   * let model = modelForElement(el);
   * if (model.index &lt; 10) {
   * model.set('item.checked', true);
   * }
   *
   * @return Template instance representing the
   * binding scope for the element
   *
   */
  @JSBody(
      params = {"template", "node"},
      script = "return Templatize_modelForElement(template, node)"
  )
  @Nullable
  static TemplateInstanceBase modelForElement(@Nullable HTMLElement template, @Nullable Node node) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the template &quot;model&quot; associated with a given element, which
   * serves as the binding scope for the template instance the element is
   * contained in. A template model is an instance of
   * <code>TemplateInstanceBase</code>, and should be used to manipulate data
   * associated with this template instance.
   *
   * Example:
   *
   * let model = modelForElement(el);
   * if (model.index &lt; 10) {
   * model.set('item.checked', true);
   * }
   *
   * @return Template instance representing the
   * binding scope for the element
   *
   */
  @JSBody(
      params = {"template"},
      script = "return Templatize_modelForElement(template)"
  )
  @Nullable
  static TemplateInstanceBase modelForElement(@Nullable HTMLElement template) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the template &quot;model&quot; associated with a given element, which
   * serves as the binding scope for the template instance the element is
   * contained in. A template model is an instance of
   * <code>TemplateInstanceBase</code>, and should be used to manipulate data
   * associated with this template instance.
   *
   * Example:
   *
   * let model = modelForElement(el);
   * if (model.index &lt; 10) {
   * model.set('item.checked', true);
   * }
   *
   * @return Template instance representing the
   * binding scope for the element
   *
   */
  @JSBody(
      params = {},
      script = "return Templatize_modelForElement()"
  )
  @Nullable
  static TemplateInstanceBase modelForElement() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  interface TemplatizeResult extends Any {
  }
}
