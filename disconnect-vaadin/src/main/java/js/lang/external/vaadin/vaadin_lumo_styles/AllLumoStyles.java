package js.lang.external.vaadin.vaadin_lumo_styles;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * Created by Artem Godin on 6/29/2020.
 */
@NpmPackage(
        name = "@vaadin/vaadin-lumo-styles",
        version = "^1.6.0"
)
@Import(
        module = "@vaadin/vaadin-lumo-styles/all-imports.js"
)
public interface AllLumoStyles extends HTMLElement {
}