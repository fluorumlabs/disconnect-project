package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.BoardElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;

/**
 * `<vaadin-board>` is a Polymer element to create flexible responsive layouts
 * and build nice looking dashboards.
 * <p>
 * A Vaadin Board is built using `<vaadin-board-row>` elements containing your child elements.
 * Each board row consists of four columns, and can contain up to four elements. Using column spans
 * you can tune the layout to your liking.
 * <p>
 * ```html
 * <vaadin-board>
 * <vaadin-board-row>
 * <div>This could be chart 1</div>
 * <div>This could be chart 2</div>
 * <div>This could be chart 3</div>
 * <div>This could be chart 4</div>
 * </vaadin-board-row>
 * </vaadin-board>
 * ```
 */
public class VaadinBoard extends AbstractComponent<BoardElement>
		implements HasElementMixin<BoardElement, VaadinBoard>, HasComponents<BoardElement, VaadinBoard, Component<?>> {
	public VaadinBoard() {
		super("vaadin-board");
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
