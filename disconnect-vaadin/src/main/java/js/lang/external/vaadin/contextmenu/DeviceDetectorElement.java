package js.lang.external.vaadin.contextmenu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * Element for internal use only.
 */
@NpmPackage(name = "@vaadin/vaadin-context-menu", version = "^4.5.0-alpha2")
@Import(module = "@vaadin/vaadin-context-menu/src/vaadin-device-detector.js")
public interface DeviceDetectorElement extends HTMLElement {

    // !wca! get phone: boolean

    // !wca! set phone: boolean

    // !wca! get touch: boolean

    // !wca! set touch: boolean

    // !wca! get wide: boolean

    // !wca! set wide: boolean
}
