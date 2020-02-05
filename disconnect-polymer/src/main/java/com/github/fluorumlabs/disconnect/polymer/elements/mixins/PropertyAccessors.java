package com.github.fluorumlabs.disconnect.polymer.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import org.teavm.jso.JSBody;

/**
 * Element class mixin that provides basic meta-programming for creating one
 * or more property accessors (getter/setter pair) that enqueue an async
 * (batched) `_propertiesChanged` callback.
 * <p>
 * For basic usage of this mixin:
 * <p>
 * -   Declare attributes to observe via the standard `static get
 * observedAttributes()`. Use `dash-case` attribute names to represent
 * `camelCase` property names.
 * -   Implement the `_propertiesChanged` callback on the class.
 * -   Call `MyClass.createPropertiesForAttributes()` **once** on the class to
 * generate property accessors for each observed attribute. This must be
 * called before the first instance is created, for example, by calling it
 * before calling `customElements.define`. It can also be called lazily from
 * the element's `constructor`, as long as it's guarded so that the call is
 * only made once, when the first instance is created.
 * -   Call `this._enableProperties()` in the element's `connectedCallback` to
 * enable the accessors.
 * <p>
 * Any `observedAttributes` will automatically be
 * deserialized via `attributeChangedCallback` and set to the associated
 * property using `dash-case`-to-`camelCase` convention.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "PropertyAccessors",
		module = "@polymer/polymer/lib/mixins/property-accessors.js"
)
public interface PropertyAccessors extends PropertiesChanged {
	/**
	 * Generates property accessors for all attributes in the standard
	 * static `observedAttributes` array.
	 * <p>
	 * Attribute names are mapped to property names using the `dash-case` to
	 * `camelCase` convention
	 */
	@JSBody(
			script = "PropertyAccessors.createPropertiesForAttributes()"
	)
	static void createPropertiesForAttributes() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}
}
