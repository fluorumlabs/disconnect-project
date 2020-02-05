package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import org.teavm.jso.JSProperty;

/**
 * The `<dom-if>` element will stamp a light-dom `<template>` child when
 * the `if` property becomes truthy, and the template can use Polymer
 * data-binding and declarative event features when used in the context of
 * a Polymer element's template.
 * <p>
 * When `if` becomes falsy, the stamped content is hidden but not
 * removed from dom. When `if` subsequently becomes truthy again, the content
 * is simply re-shown. This approach is used due to its favorable performance
 * characteristics: the expense of creating template content is paid only
 * once and lazily.
 * <p>
 * Set the `restamp` property to true to force the stamped content to be
 * created / destroyed when the `if` condition changes.
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "DomIf",
		module = "@polymer/polymer/lib/elements/dom-if.js"
)
public interface DomIfElement extends PolymerElement {
	/**
	 * A boolean indicating whether this template should stamp.
	 */
	@JSProperty
	boolean isIf();

	/**
	 * A boolean indicating whether this template should stamp.
	 */
	@JSProperty
	void setIf(boolean value);

	/**
	 * When true, elements will be removed from DOM and discarded when `if`
	 * becomes false and re-created and added back to the DOM when `if`
	 * becomes true.  By default, stamped elements will be hidden but left
	 * in the DOM when `if` becomes false, which is generally results
	 * in better performance.
	 */
	@JSProperty
	boolean isRestamp();

	/**
	 * When true, elements will be removed from DOM and discarded when `if`
	 * becomes false and re-created and added back to the DOM when `if`
	 * becomes true.  By default, stamped elements will be hidden but left
	 * in the DOM when `if` becomes false, which is generally results
	 * in better performance.
	 */
	@JSProperty
	void setRestamp(boolean restamp);

	/**
	 * Forces the element to render its content. Normally rendering is
	 * asynchronous to a provoking change. This is done for efficiency so
	 * that multiple changes trigger only a single render. The render method
	 * should be called if, for example, template rendering is required to
	 * validate application state.
	 */
	void render();
}
