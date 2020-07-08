package js.lang.external.vaadin.lumostyles;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 */
@NpmPackage(name = "@vaadin/vaadin-lumo-styles", version = "^1.6.0")
@Import(module = "@vaadin/vaadin-lumo-styles/version.js")
@Import(module = "@vaadin/vaadin-lumo-styles/all-imports.js")
public interface LumoStylesElement extends HTMLElement {
}
