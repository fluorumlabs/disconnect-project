package com.github.fluorumlabs.disconnect.vaadin.elements.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.util.RegExp;
import js.web.dom.Element;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "IncludedMixin",
		module = "@vaadin/vaadin-crud/src/vaadin-crud-include-mixin.js"
)
public interface IncludedMixin extends Element {
	/**
	 * A list of item fields that should not be mapped to form fields.
	 * <p>
	 * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a>
	 * is defined, this property is ignored.
	 * <p>
	 * Default is to exclude any private property.
	 */
	@Nullable
	@JSProperty
	RegExp getExclude();

	/**
	 * A list of item fields that should not be mapped to form fields.
	 * <p>
	 * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a>
	 * is defined, this property is ignored.
	 * <p>
	 * Default is to exclude any private property.
	 */
	@JSProperty
	void setExclude(RegExp exclude);

	@JSProperty
	void setExclude(String exclude);

	/**
	 * A list of item properties that should be mapped to form fields.
	 * <p>
	 * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
	 */
	@JSProperty
	String[] getInclude();

	/**
	 * A list of item properties that should be mapped to form fields.
	 * <p>
	 * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
	 */
	@JSProperty
	void setInclude(String include);

	@JSProperty
	void setInclude(@JSByRef String... include);
}
