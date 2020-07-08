package js.lang.external.vaadin.board;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * <code>&lt;vaadin-board&gt;</code> is a Polymer element to create flexible responsive layouts and build nice looking dashboards.
 *
 * A Vaadin Board is built using <code>&lt;vaadin-board-row&gt;</code> elements containing your child elements. Each board row consists of four columns, and can contain up to four elements. Using column spans you can tune the layout to your liking.
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
 * <strong>Mixins:</strong> ElementMixin, mixinBehaviors, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-board", version = "^2.2.0-alpha1")
@Import(module = "@vaadin/vaadin-board/vaadin-board.js")
public interface BoardElement extends HTMLElement {

    // !wca! redraw: (): void
    /**
     * Redraws the board and all rows inside it, if necessary.
     *
     * In most cases, board will redraw itself if your reconfigure it. If you dynamically change CSS
     * which affects this element, then you need to call this method.
     */
    @JSMethod("redraw")
    void redraw();
}
