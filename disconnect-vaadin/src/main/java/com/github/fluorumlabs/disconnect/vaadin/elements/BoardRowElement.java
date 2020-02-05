package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ElementMixin;
import js.web.dom.HTMLElement;

/**
 * `<vaadin-board-row>` is a Polymer element that together with `vaadin-board` element allows to create flexible
 * responsive layouts and build nice looking dashboard.
 * <p>
 * Each row can contain up to four elements (fewer if colspan is used) and is automatically responsive. The row
 * changes between `large`, `medium` and `small` modes depending on the available width and the set breakpoints. In
 * `large` mode, typically all content is shown side-by-side, in `medium` half of the content is side by side and in
 * `small` mode, content is laid out vertically.
 * <p>
 * The breakpoints can be set using custom CSS properties. By default the breakpoints are `small: <600px`, `medium: <
 * 960px`, `large >= 960px`.
 * <p>
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
 * <p>
 * ### Styling
 * <p>
 * The following custom properties are available for styling:
 * <p>
 * Custom property | Description | Default
 * ----------------|-------------|-------------
 * `--vaadin-board-width-small` | Determines the width where mode changes from `small` to `medium` | `600px`
 * `--vaadin-board-width-medium` | Determines the width where mode changes from `medium` to `large` | `960px`
 */
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "BoardRowElement",
		module = "@vaadin/vaadin-board/src/vaadin-board-row.js"
)
public interface BoardRowElement extends HTMLElement, ElementMixin {
	/**
	 * Redraws the row, if necessary.
	 * <p>
	 * In most cases, a board row will redraw itself if your reconfigure it. If you dynamically change CSS which
	 * affects the row, then you need to call this method.
	 */
	void redraw();
}
