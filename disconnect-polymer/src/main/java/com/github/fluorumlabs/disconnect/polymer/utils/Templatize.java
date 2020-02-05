package com.github.fluorumlabs.disconnect.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import com.github.fluorumlabs.disconnect.polymer.elements.TemplateInstanceBase;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import com.github.fluorumlabs.disconnect.polymer.types.TemplatizeOptions;
import js.lang.Any;
import js.util.function.JsSupplier;
import js.web.dom.Node;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;

@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = {"templatize", "modelForElement"},
		module = "@polymer/polymer/lib/utils/templatize.js"
)
public interface Templatize extends Any {
	/**
	 * Returns an anonymous `PropertyEffects` class bound to the
	 * `<template>` provided.  Instancing the class will result in the
	 * template being stamped into a document fragment stored as the instance's
	 * `root` property, after which it can be appended to the DOM.
	 * <p>
	 * Templates may utilize all Polymer data-binding features as well as
	 * declarative event listeners.  Event listeners and inline computing
	 * functions in the template will be called on the host of the template.
	 * <p>
	 * The constructor returned takes a single argument dictionary of initial
	 * property values to propagate into template bindings.  Additionally
	 * host properties can be forwarded in, and instance properties can be
	 * notified out by providing optional callbacks in the `options` dictionary.
	 * <p>
	 * Valid configuration in `options` are as follows:
	 * <p>
	 * - `forwardHostProp(property, value)`: Called when a property referenced
	 * in the template changed on the template's host. As this library does
	 * not retain references to templates instanced by the user, it is the
	 * templatize owner's responsibility to forward host property changes into
	 * user-stamped instances.  The `instance.forwardHostProp(property, value)`
	 * method on the generated class should be called to forward host
	 * properties into the template to prevent unnecessary property-changed
	 * notifications. Any properties referenced in the template that are not
	 * defined in `instanceProps` will be notified up to the template's host
	 * automatically.
	 * - `instanceProps`: Dictionary of property names that will be added
	 * to the instance by the templatize owner.  These properties shadow any
	 * host properties, and changes within the template to these properties
	 * will result in `notifyInstanceProp` being called.
	 * - `mutableData`: When `true`, the generated class will skip strict
	 * dirty-checking for objects and arrays (always consider them to be
	 * "dirty").
	 * - `notifyInstanceProp(instance, property, value)`: Called when
	 * an instance property changes.  Users may choose to call `notifyPath`
	 * on e.g. the owner to notify the change.
	 * - `parentModel`: When `true`, events handled by declarative event listeners
	 * (`on-event="handler"`) will be decorated with a `model` property pointing
	 * to the template instance that stamped it.  It will also be returned
	 * from `instance.parentModel` in cases where template instance nesting
	 * causes an inner model to shadow an outer model.
	 * <p>
	 * All callbacks are called bound to the `owner`. Any context
	 * needed for the callbacks (such as references to `instances` stamped)
	 * should be stored on the `owner` such that they can be retrieved via
	 * `this`.
	 * <p>
	 * When `options.forwardHostProp` is declared as an option, any properties
	 * referenced in the template will be automatically forwarded from the host of
	 * the `<template>` to instances, with the exception of any properties listed in
	 * the `options.instanceProps` object.  `instanceProps` are assumed to be
	 * managed by the owner of the instances, either passed into the constructor
	 * or set after the fact.  Note, any properties passed into the constructor will
	 * always be set to the instance (regardless of whether they would normally
	 * be forwarded from the host).
	 * <p>
	 * Note that `templatize()` can be run only once for a given `<template>`.
	 * Further calls will result in an error. Also, there is a special
	 * behavior if the template was duplicated through a mechanism such as
	 * `<dom-repeat>` or `<test-fixture>`. In this case, all calls to
	 * `templatize()` return the same class for all duplicates of a template.
	 * The class returned from `templatize()` is generated only once using
	 * the `options` from the first call. This means that any `options`
	 * provided to subsequent calls will be ignored. Therefore, it is very
	 * important not to close over any variables inside the callbacks. Also,
	 * arrow functions must be avoided because they bind the outer `this`.
	 * Inside the callbacks, any contextual information can be accessed
	 * through `this`, which points to the `owner`.
	 *
	 * @param template Template to templatize
	 * @param owner    Owner of the template instances;
	 *                 any optional callbacks will be bound to this owner.
	 * @param options  Options dictionary (see summary for details)
	 *
	 * @return Generated class bound
	 * 		to the template provided
	 */
	@JSBody(
			params = {"template", "owner", "options"},
			script = "return templatize(template, owner, options)"
	)
	static JsSupplier<TemplateInstanceBase> templatize(HTMLTemplateElement template, PropertyEffects owner,
													   TemplatizeOptions options) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(
			params = {"template", "owner"},
			script = "return templatize(template, owner)"
	)
	static JsSupplier<TemplateInstanceBase> templatize(HTMLTemplateElement template, PropertyEffects owner) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	/**
	 * Returns the template "model" associated with a given element, which
	 * serves as the binding scope for the template instance the element is
	 * contained in. A template model is an instance of
	 * `TemplateInstanceBase`, and should be used to manipulate data
	 * associated with this template instance.
	 * <p>
	 * Example:
	 * <p>
	 * let model = modelForElement(el);
	 * if (model.index < 10) {
	 * model.set('item.checked', true);
	 * }
	 *
	 * @param template The model will be returned for
	 *                 elements stamped from this template
	 * @param node     Node for which to return a template model.
	 *
	 * @return Template instance representing the
	 * 		binding scope for the element
	 */
	@JSBody(
			params = {"template", "node"},
			script = "return modelForElement(template, node)"
	)
	static <T extends TemplateInstanceBase> T modelForElement(HTMLTemplateElement template, Node node) {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
