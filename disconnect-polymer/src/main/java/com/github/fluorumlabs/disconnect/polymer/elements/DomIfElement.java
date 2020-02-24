package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import org.teavm.jso.JSProperty;

/**
 * The <code>&lt;dom-if&gt;</code> element will stamp a light-dom <code>&lt;template&gt;</code> child when the
 * <code>if</code> property becomes truthy, and the template can use Polymer data-binding and declarative event features
 * when used in the context of a Polymer element's template.
 * <p>
 * When <code>if</code> becomes falsy, the stamped content is hidden but not removed from dom. When <code>if</code>
 * subsequently becomes truthy again, the content is simply re-shown. This approach is used due to its favorable
 * performance characteristics: the expense of creating template content is paid only once and lazily.
 * <p>
 * Set the <code>restamp</code> property to true to force the stamped content to be created / destroyed when the
 * <code>if</code> condition changes.
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
	 * Tagname string.
	 *
	 * @return the string
	 */
	static String TAGNAME() {
		return "dom-if";
	}

	/**
	 * A boolean indicating whether this template should stamp.
	 *
	 * @return the boolean
	 */
	@JSProperty
	boolean isIf();

	/**
	 * A boolean indicating whether this template should stamp.
	 *
	 * @param value the value
	 */
	@JSProperty
	void setIf(boolean value);

	/**
	 * When true, elements will be removed from DOM and discarded when <code>if</code> becomes false and re-created and
	 * added back to the DOM when <code>if</code> becomes true.  By default, stamped elements will be hidden but
	 * left in
	 * the DOM when <code>if</code> becomes false, which is generally results in better performance.
	 *
	 * @return the boolean
	 */
	@JSProperty
	boolean isRestamp();

	/**
	 * When true, elements will be removed from DOM and discarded when <code>if</code> becomes false and re-created and
	 * added back to the DOM when <code>if</code> becomes true.  By default, stamped elements will be hidden but
	 * left in
	 * the DOM when <code>if</code> becomes false, which is generally results in better performance.
	 *
	 * @param restamp the restamp
	 */
	@JSProperty
	void setRestamp(boolean restamp);

	/**
	 * Forces the element to render its content. Normally rendering is asynchronous to a provoking change. This is done
	 * for efficiency so that multiple changes trigger only a single render. The render method should be called if, for
	 * example, template rendering is required to validate application state.
	 */
	void render();
}
