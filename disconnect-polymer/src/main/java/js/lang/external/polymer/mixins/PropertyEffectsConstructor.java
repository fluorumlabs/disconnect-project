package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.polymer.TemplateInfo;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PropertyEffectsConstructor as PropertyEffectsConstructor_PropertyEffectsConstructor"},
    module = "@polymer/polymer/lib/mixins/property-effects.js"
)
public interface PropertyEffectsConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return PropertyEffectsConstructor_PropertyEffectsConstructor.apply(null, args)"
  )
  static PropertyEffects create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Ensures an accessor exists for the specified property, and adds
   * to a list of &quot;property effects&quot; that will run when the accessor for
   * the specified property is set.  Effects are grouped by &quot;type&quot;, which
   * roughly corresponds to a phase in effect processing.  The effect
   * metadata should be in the following form:
   *
   * <pre><code> {
   *    fn: effectFunction,    *       info: { ... }          *       trigger: {             *         name: string         *         structured: boolean
   *      wildcard: boolean
   *    }
   *  }
   * </code></pre>
   * Effects are called from <code>_propertiesChanged</code> in the following order by
   * type:
   *
   * <ol>
   * <li>COMPUTE</li>
   * <li>PROPAGATE</li>
   * <li>REFLECT</li>
   * <li>OBSERVE</li>
   * <li>NOTIFY</li>
   * </ol>
   * Effect functions are called with the following signature:
   *
   * <pre><code> effectFunction(inst, path, props, oldProps, info, hasPaths)
   * </code></pre>
   * @param property Property that should trigger the effect
   * @param type Effect type, from this.PROPERTY_EFFECT_TYPES
   * @param effect Effect metadata object
   *
   */
  void addPropertyEffect(String property, String type, @Nullable Any effect);

  /**
   * Ensures an accessor exists for the specified property, and adds
   * to a list of &quot;property effects&quot; that will run when the accessor for
   * the specified property is set.  Effects are grouped by &quot;type&quot;, which
   * roughly corresponds to a phase in effect processing.  The effect
   * metadata should be in the following form:
   *
   * <pre><code> {
   *    fn: effectFunction,    *       info: { ... }          *       trigger: {             *         name: string         *         structured: boolean
   *      wildcard: boolean
   *    }
   *  }
   * </code></pre>
   * Effects are called from <code>_propertiesChanged</code> in the following order by
   * type:
   *
   * <ol>
   * <li>COMPUTE</li>
   * <li>PROPAGATE</li>
   * <li>REFLECT</li>
   * <li>OBSERVE</li>
   * <li>NOTIFY</li>
   * </ol>
   * Effect functions are called with the following signature:
   *
   * <pre><code> effectFunction(inst, path, props, oldProps, info, hasPaths)
   * </code></pre>
   * @param property Property that should trigger the effect
   * @param type Effect type, from this.PROPERTY_EFFECT_TYPES
   */
  void addPropertyEffect(String property, String type);

  /**
   * Creates a single-property observer for the given property.
   *
   * @param property Property name
   * @param method Function or name of observer method to call
   * @param dynamicFn Whether the method name should be included as
   * a dependency to the effect.
   *
   */
  void createPropertyObserver(String property, CreatePropertyObserverMethodFn method,
      boolean dynamicFn);

  /**
   * Creates a single-property observer for the given property.
   *
   * @param property Property name
   * @param method Function or name of observer method to call
   * @param dynamicFn Whether the method name should be included as
   * a dependency to the effect.
   *
   */
  void createPropertyObserver(String property, String method, boolean dynamicFn);

  /**
   * Creates a single-property observer for the given property.
   *
   * @param property Property name
   * @param method Function or name of observer method to call
   */
  void createPropertyObserver(String property, CreatePropertyObserverMethodFn method);

  /**
   * Creates a single-property observer for the given property.
   *
   * @param property Property name
   * @param method Function or name of observer method to call
   */
  void createPropertyObserver(String property, String method);

  /**
   * Creates a multi-property &quot;method observer&quot; based on the provided
   * expression, which should be a string in the form of a normal JavaScript
   * function signature: <code>'methodName(arg1, [..., argn])'</code>.  Each argument
   * should correspond to a property or path in the context of this
   * prototype (or instance), or may be a literal string or number.
   *
   * @param expression Method expression
   * @param dynamicFn Boolean or object map indicating
   * @return whether method names should be included as a dependency to the effect.
   *
   */
  void createMethodObserver(String expression, @Nullable Any dynamicFn);

  /**
   * Creates a multi-property &quot;method observer&quot; based on the provided
   * expression, which should be a string in the form of a normal JavaScript
   * function signature: <code>'methodName(arg1, [..., argn])'</code>.  Each argument
   * should correspond to a property or path in the context of this
   * prototype (or instance), or may be a literal string or number.
   *
   * @param expression Method expression
   * @param dynamicFn Boolean or object map indicating
   * @return whether method names should be included as a dependency to the effect.
   *
   */
  void createMethodObserver(String expression, boolean dynamicFn);

  /**
   * Creates a multi-property &quot;method observer&quot; based on the provided
   * expression, which should be a string in the form of a normal JavaScript
   * function signature: <code>'methodName(arg1, [..., argn])'</code>.  Each argument
   * should correspond to a property or path in the context of this
   * prototype (or instance), or may be a literal string or number.
   *
   * @param expression Method expression
   * @return whether method names should be included as a dependency to the effect.
   *
   */
  void createMethodObserver(String expression);

  /**
   * Causes the setter for the given property to dispatch <code>&lt;property&gt;-changed</code>
   * events to notify of changes to the property.
   *
   * @param property Property name
   *
   */
  void createNotifyingProperty(String property);

  /**
   * Creates a read-only accessor for the given property.
   *
   * To set the property, use the protected <code>_setProperty</code> API.
   * To create a custom protected setter (e.g. <code>_setMyProp()</code> for
   * property <code>myProp</code>), pass <code>true</code> for <code>protectedSetter</code>.
   *
   * Note, if the property will have other property effects, this method
   * should be called first, before adding other effects.
   *
   * @param property Property name
   * @param protectedSetter Creates a custom protected setter
   * when <code>true</code>.
   *
   */
  void createReadOnlyProperty(String property, boolean protectedSetter);

  /**
   * Creates a read-only accessor for the given property.
   *
   * To set the property, use the protected <code>_setProperty</code> API.
   * To create a custom protected setter (e.g. <code>_setMyProp()</code> for
   * property <code>myProp</code>), pass <code>true</code> for <code>protectedSetter</code>.
   *
   * Note, if the property will have other property effects, this method
   * should be called first, before adding other effects.
   *
   * @param property Property name
   */
  void createReadOnlyProperty(String property);

  /**
   * Causes the setter for the given property to reflect the property value
   * to a (dash-cased) attribute of the same name.
   *
   * @param property Property name
   *
   */
  void createReflectedProperty(String property);

  /**
   * Creates a computed property whose value is set to the result of the
   * method described by the given <code>expression</code> each time one or more
   * arguments to the method changes.  The expression should be a string
   * in the form of a normal JavaScript function signature:
   * <code>'methodName(arg1, [..., argn])'</code>
   *
   * @param property Name of computed property to set
   * @param expression Method expression
   * @param dynamicFn Boolean or object map indicating whether
   * method names should be included as a dependency to the effect.
   *
   */
  void createComputedProperty(String property, String expression, @Nullable Any dynamicFn);

  /**
   * Creates a computed property whose value is set to the result of the
   * method described by the given <code>expression</code> each time one or more
   * arguments to the method changes.  The expression should be a string
   * in the form of a normal JavaScript function signature:
   * <code>'methodName(arg1, [..., argn])'</code>
   *
   * @param property Name of computed property to set
   * @param expression Method expression
   * @param dynamicFn Boolean or object map indicating whether
   * method names should be included as a dependency to the effect.
   *
   */
  void createComputedProperty(String property, String expression, boolean dynamicFn);

  /**
   * Creates a computed property whose value is set to the result of the
   * method described by the given <code>expression</code> each time one or more
   * arguments to the method changes.  The expression should be a string
   * in the form of a normal JavaScript function signature:
   * <code>'methodName(arg1, [..., argn])'</code>
   *
   * @param property Name of computed property to set
   * @param expression Method expression
   */
  void createComputedProperty(String property, String expression);

  /**
   * Parses the provided template to ensure binding effects are created
   * for them, and then ensures property accessors are created for any
   * dependent properties in the template.  Binding effects for bound
   * templates are stored in a linked list on the instance so that
   * templates can be efficiently stamped and unstamped.
   *
   * @param template Template containing binding
   * bindings
   * @return Template metadata object
   *
   */
  TemplateInfo bindTemplate(HTMLTemplateElement template);

  @FunctionalInterface
  @JSFunctor
  interface CreatePropertyObserverMethodFn extends Any {
    Any apply(Any p0, Any p1);
  }

  @FunctionalInterface
  @JSFunctor
  interface CreatePropertyObserverMethodFn extends Any {
    Any apply(Any p0, Any p1);
  }
}
