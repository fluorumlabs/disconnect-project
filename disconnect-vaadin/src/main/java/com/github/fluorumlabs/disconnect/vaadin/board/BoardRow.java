package com.github.fluorumlabs.disconnect.vaadin.board;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.external.vaadin.board.BoardRowElement;

/**
 * <code>&lt;vaadin-board-row&gt;</code> is a Polymer element that together with <code>vaadin-board</code> element allows to create flexible responsive layouts and build nice looking dashboard.
 *
 * Each row can contain up to four elements (fewer if colspan is used) and is automatically responsive. The row changes between <code>large</code>, <code>medium</code> and <code>small</code> modes depending on the available width and the set breakpoints. In <code>large</code> mode, typically all content is shown side-by-side, in <code>medium</code> half of the content is side by side and in <code>small</code> mode, content is laid out vertically.
 *
 * The breakpoints can be set using custom CSS properties. By default the breakpoints are <code>small: &lt;600px</code>, <code>medium: &lt; 960px</code>, <code>large &gt;= 960px</code>.
 *
 * <pre><code class="language-html">&lt;vaadin-board&gt;
 *    &lt;vaadin-board-row&gt;
 *      &lt;div&gt;This could be chart 1&lt;/div&gt;
 *      &lt;div&gt;This could be chart 2&lt;/div&gt;
 *      &lt;div&gt;This could be chart 3&lt;/div&gt;
 *      &lt;div&gt;This could be chart 4&lt;/div&gt;
 *    &lt;/vaadin-board-row&gt;
 * &lt;/vaadin-board&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-board-width-small</code></td>
 *    <td>Determines the width where mode changes from <code>small</code> to <code>medium</code></td>
 *    <td><code>600px</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>--vaadin-board-width-medium</code></td>
 *    <td>Determines the width where mode changes from <code>medium</code> to <code>large</code></td>
 *    <td><code>960px</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ElementMixin, mixinBehaviors, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-board-row", external = true)
public class BoardRow extends HtmlComponent<BoardRowElement> {

    public BoardRow() {
    }

    public BoardRow(String textContent) {
        super(textContent);
    }

    public BoardRow(Component<?>... components) {
        super(components);
    }

    // !wca! redraw: (): void
    /**
     * Redraws the row, if necessary.
     *
     * In most cases, a board row will redraw itself if your reconfigure it. If you dynamically change CSS which affects the row, then you need to call this method.
     */
    public void redraw() {
        getElement().redraw();
    }

    // !wca! event iron-request-resize-notifications: ?
}
