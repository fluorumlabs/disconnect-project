package com.github.fluorumlabs.disconnect.vaadin.mixins;

import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.IncludedMixin;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import js.util.RegExp;

public interface HasIncludedMixin<E extends IncludedMixin, T extends HasElement<E>> extends HasElement<E> {
	/**
	 * A list of item fields that should not be mapped to form fields.
	 * <p>
	 * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a>
	 * is defined, this property is ignored.
	 * <p>
	 * Default is to exclude any private property.
	 */
	default RegExp exclude() {
		return getNode().getExclude();
	}

	/**
	 * A list of item fields that should not be mapped to form fields.
	 * <p>
	 * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a>
	 * is defined, this property is ignored.
	 * <p>
	 * Default is to exclude any private property.
	 */
	default T exclude(RegExp exclude) {
		getNode().setExclude(exclude);
		return (T) this;
	}

	default T exclude(String exclude) {
		getNode().setExclude(exclude);
		return (T) this;
	}

	/**
	 * A list of item properties that should be mapped to form fields.
	 * <p>
	 * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
	 */
	default String[] include() {
		return getNode().getInclude();
	}

	/**
	 * A list of item properties that should be mapped to form fields.
	 * <p>
	 * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
	 */
	default T include(String include) {
		getNode().setInclude(include);
		return (T) this;
	}

	default T include(String... include) {
		getNode().setInclude(include);
		return (T) this;
	}
}
