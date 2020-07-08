package js.lang.external.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <code>vaadin-grid-templatizer</code> is a helper element for the <code>vaadin-grid</code> that is preparing and stamping instances of cells and columns templates
 */
@NpmPackage(name = "@vaadin/vaadin-grid", version = "^5.7.0-alpha4")
@Import(module = "@vaadin/vaadin-grid/src/vaadin-grid-templatizer.js")
public interface GridTemplatizerElement extends HTMLElement {

}
