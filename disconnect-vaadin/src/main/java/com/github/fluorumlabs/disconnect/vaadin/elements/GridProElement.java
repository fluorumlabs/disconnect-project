package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.InlineEditingMixin;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-grid-pro&gt;</code> is a high quality data grid / data table Web Component with extended
 * functionality.
 * It extends <code>&lt;vaadin-grid&gt;</code> and adds extra features on top of the basic ones.
 * <p>
 * See
 * <a href="https://github.com/vaadin/vaadin-grid/blob/master/src/vaadin-grid.html"><code>&lt;vaadin-grid&gt;</code> documentation</a>
 * for details.
 *
 * <pre><code>&lt;vaadin-grid-pro&gt;&lt;/vaadin-grid-pro&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(

		module = "@vaadin/vaadin-grid-pro/vaadin-grid-pro.js"
)
public interface GridProElement extends HTMLElement, InlineEditingMixin {
	static String TAGNAME() {
		return "vaadin-grid-pro";
	}
}
