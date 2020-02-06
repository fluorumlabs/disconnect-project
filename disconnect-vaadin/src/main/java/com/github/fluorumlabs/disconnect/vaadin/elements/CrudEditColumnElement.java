package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-crud-edit-column&gt;</code> is a helper element for the <code>&lt;vaadin-grid&gt;</code>
 * that provides a clickable and themable edit icon.
 * <p>
 * Typical usage is in a custom <code>&lt;vaadin-grid&gt;</code> inside a <code>&lt;vaadin-crud&gt;</code>.
 *
 * <h4>Example:</h4>
 * <pre><code class="language-html">&lt;vaadin-grid items=&quot;[[items]]&quot;&gt;
 *  &lt;vaadin-crud-edit-column&gt;&lt;/vaadin-crud-edit-column&gt;
 *
 *  &lt;vaadin-grid-column&gt;
 *    ...
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "CrudEditColumnElement",
		module = "@vaadin/vaadin-crud/vaadin-crud-edit-column.js"
)
public interface CrudEditColumnElement extends HTMLElement {
	String TAGNAME = "vaadin-crud-edit-column";
	/**
	 * The arial-label for the edit button
	 */
	@Nullable
	@JSProperty
	String getAriaLabel();

	/**
	 * The arial-label for the edit button
	 */
	@JSProperty
	void setAriaLabel(String ariaLabel);
}
