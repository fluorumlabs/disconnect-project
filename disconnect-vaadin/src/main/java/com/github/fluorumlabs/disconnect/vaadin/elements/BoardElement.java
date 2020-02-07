package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-board&gt;</code> is a Polymer element to create flexible responsive layouts
 * and build nice looking dashboards.
 * <p>
 * A Vaadin Board is built using <code>&lt;vaadin-board-row&gt;</code> elements containing your child elements.
 * Each board row consists of four columns, and can contain up to four elements. Using column spans
 * you can tune the layout to your liking.
 *
 * <pre><code class="language-html">&lt;vaadin-board&gt;
 *   &lt;vaadin-board-row&gt;
 *     &lt;div&gt;This could be chart 1&lt;/div&gt;
 *     &lt;div&gt;This could be chart 2&lt;/div&gt;
 *     &lt;div&gt;This could be chart 3&lt;/div&gt;
 *     &lt;div&gt;This could be chart 4&lt;/div&gt;
 *   &lt;/vaadin-board-row&gt;
 * &lt;/vaadin-board&gt;
 * </code></pre>
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		module = "@vaadin/vaadin-board/theme/lumo/vaadin-board.js"
)
public interface BoardElement extends HTMLElement, ElementMixin {
	static String TAGNAME() {
		return "vaadin-board";
	}

	/**
	 * Redraws the board and all rows inside it, if necessary.
	 * <p>
	 * In most cases, board will redraw itself if your reconfigure it. If you dynamically change CSS
	 * which affects this element, then you need to call this method.
	 */
	void redraw();
}
