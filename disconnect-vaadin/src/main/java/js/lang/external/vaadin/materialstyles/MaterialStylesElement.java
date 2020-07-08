package js.lang.external.vaadin.materialstyles;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 */
@NpmPackage(name = "@vaadin/vaadin-material-styles", version = "^1.3.2")
@Import(module = "@vaadin/vaadin-material-styles/version.js")
@Import(module = "@vaadin/vaadin-material-styles/all-imports.js")
public interface MaterialStylesElement extends HTMLElement {
}
