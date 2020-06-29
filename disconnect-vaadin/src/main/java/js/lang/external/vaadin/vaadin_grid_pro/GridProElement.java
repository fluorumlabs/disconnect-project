package js.lang.external.vaadin.vaadin_grid_pro;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.vaadin.vaadin_grid.GridElement;

/**
 * <code>&lt;vaadin-grid-pro&gt;</code> is a high quality data grid / data table Web Component with extended functionality.
 * It extends <code>&lt;vaadin-grid&gt;</code> and adds extra features on top of the basic ones.
 *
 * See <a href="https://github.com/vaadin/vaadin-grid/blob/master/src/vaadin-grid.html"><code>&lt;vaadin-grid&gt;</code> documentation</a>
 * for details.
 *
 * <pre><code>&lt;vaadin-grid-pro&gt;&lt;/vaadin-grid-pro&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-grid-pro",
    version = "^2.2.0-alpha3"
)
@Import(
    symbols = {"GridProElement as GridProElement_GridProElement"},
    module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro.js"
)
@Import(
    module = "@vaadin/vaadin-grid-pro/src/vaadin-grid-pro.js"
)
public interface GridProElement extends GridElement, InlineEditingMixin {
}
