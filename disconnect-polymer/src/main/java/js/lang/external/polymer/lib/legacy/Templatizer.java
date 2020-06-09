package js.lang.external.polymer.lib.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.polymer.lib.utils.TemplateInstanceBase;
import js.web.dom.HTMLElement;
import js.web.webcomponents.HTMLTemplateElement;

/**
 * The <code>Templatizer</code> behavior adds methods to generate instances of
 * templates that are each managed by an anonymous <code>PropertyEffects</code>
 * instance where data-bindings in the stamped template content are bound to
 * accessors on itself.
 *
 * This behavior is provided in Polymer 2.x-3.x as a hybrid-element convenience
 * only.  For non-hybrid usage, the <code>Templatize</code> library
 * should be used instead.
 *
 * Example:
 *
 * <pre><code> import {dom} from '@polymer/polymer/lib/legacy/polymer.dom.js';
 *   *     let template = this.querySelector('template');
 *   *     this.templatize(template);
 *   *     let instance = this.stamp({myProp: 'initial'});
 *   *     dom(this).appendChild(instance.root);
 *   *      *     instance.myProp = 'new value';
 * </code></pre>
 * Users of <code>Templatizer</code> may need to implement the following abstract
 * API's to determine how properties and paths from the host should be
 * forwarded into to instances:
 *
 * <pre><code> _forwardHostPropV2: function(prop, value)
 * </code></pre>
 * Likewise, users may implement these additional abstract API's to determine
 * how instance-specific properties that change on the instance should be
 * forwarded out to the host, if necessary.
 *
 * <pre><code> _notifyInstancePropV2: function(inst, prop, value)
 * </code></pre>
 * In order to determine which properties are instance-specific and require
 * custom notification via <code>_notifyInstanceProp</code>, define an <code>_instanceProps</code>
 * object containing keys for each instance prop, for example:
 *
 * <pre><code> _instanceProps: {
 *    item: true,
 *    index: true
 *  }
 * </code></pre>
 * Any properties used in the template that are not defined in _instanceProp
 * will be forwarded out to the Templatize <code>owner</code> automatically.
 *
 * Users may also implement the following abstract function to show or
 * hide any DOM generated using <code>stamp</code>:
 *
 * <pre><code> _showHideChildren: function(shouldHide)
 * </code></pre>
 * Note that some callbacks are suffixed with <code>V2</code> in the Polymer 2.x behavior
 * as the implementations will need to differ from the callbacks required
 * by the 1.x Templatizer API due to changes in the <code>TemplateInstance</code> API
 * between versions 1.x and 2.x.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/legacy/templatizer-behavior.js"
)
public interface Templatizer extends Any {
  /**
   * Generates an anonymous <code>TemplateInstance</code> class (stored as <code>this.ctor</code>)
   * for the provided template.  This method should be called once per
   * template to prepare an element for stamping the template, followed
   * by <code>stamp</code> to create new instances of the template.
   *
   * @param template Template to prepare
   * @param mutableData When <code>true</code>, the generated class will skip
   * strict dirty-checking for objects and arrays (always consider them to
   * be &quot;dirty&quot;). Defaults to false.
   *
   */
  void templatize(HTMLTemplateElement template, boolean mutableData);

  /**
   * Generates an anonymous <code>TemplateInstance</code> class (stored as <code>this.ctor</code>)
   * for the provided template.  This method should be called once per
   * template to prepare an element for stamping the template, followed
   * by <code>stamp</code> to create new instances of the template.
   *
   * @param template Template to prepare
   */
  void templatize(HTMLTemplateElement template);

  /**
   * Creates an instance of the template prepared by <code>templatize</code>.  The object
   * returned is an instance of the anonymous class generated by <code>templatize</code>
   * whose <code>root</code> property is a document fragment containing newly cloned
   * template content, and which has property accessors corresponding to
   * properties referenced in template bindings.
   *
   * @param model Object containing initial property values to
   * populate into the template bindings.
   * @return Returns the created instance of
   * the template prepared by <code>templatize</code>.
   *
   */
  @Nullable
  TemplateInstanceBase stamp(@Nullable Any model);

  /**
   * Creates an instance of the template prepared by <code>templatize</code>.  The object
   * returned is an instance of the anonymous class generated by <code>templatize</code>
   * whose <code>root</code> property is a document fragment containing newly cloned
   * template content, and which has property accessors corresponding to
   * properties referenced in template bindings.
   *
   * @return Returns the created instance of
   * the template prepared by <code>templatize</code>.
   *
   */
  @Nullable
  TemplateInstanceBase stamp();

  /**
   * Returns the template &quot;model&quot; (<code>TemplateInstance</code>) associated with
   * a given element, which serves as the binding scope for the template
   * instance the element is contained in.  A template model should be used
   * to manipulate data associated with this template instance.
   *
   * @param el Element for which to return a template model.
   * @return Model representing the binding scope for
   * the element.
   *
   */
  @Nullable
  TemplateInstanceBase modelForElement(@Nullable HTMLElement el);

  /**
   * Returns the template &quot;model&quot; (<code>TemplateInstance</code>) associated with
   * a given element, which serves as the binding scope for the template
   * instance the element is contained in.  A template model should be used
   * to manipulate data associated with this template instance.
   *
   * @return Model representing the binding scope for
   * the element.
   *
   */
  @Nullable
  TemplateInstanceBase modelForElement();
}
