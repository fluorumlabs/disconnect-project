package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.elements.BoardElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;

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
@WebComponent
public class Board extends AbstractComponent<BoardElement>
		implements HasElementMixin<BoardElement, Board>, HasStyle<BoardElement, Board>, HasComponents<BoardElement, Board, HasElement<?>> {
	public Board() {
		super(BoardElement.TAGNAME());
	}

	/**
	 * Redraws the board and all rows inside it, if necessary.
	 * <p>
	 * In most cases, board will redraw itself if your reconfigure it. If you dynamically change CSS
	 * which affects this element, then you need to call this method.
	 */
	public void redraw() {
		getNode().redraw();
	}
}
